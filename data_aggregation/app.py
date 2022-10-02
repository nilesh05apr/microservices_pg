import pandas as pd
from flask import Flask, request, jsonify
import py_eureka_client.eureka_client as eureka_client 

rest_port = 8050

eureka_client.init(eureka_server="http://localhost:8761/eureka",app_name="data-aggregation-service",instance_port=rest_port)
app = Flask(__name__)


@app.route("/grades", methods=['POST'])
def grades():
    data = request.json
    df = pd.DataFrame(data, index=[0])
    response = jsonify(df.describe().to_json())
    return response

@app.route("/health")
def health():
    response = {
        "status":"ok",
        "status_code":200
    }
    return response


if __name__ == "__main__":
    app.run(host='0.0.0.0', port=rest_port)