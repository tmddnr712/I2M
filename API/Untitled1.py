#!/usr/bin/env python
# coding: utf-8

# In[ ]:


from flask import Flask
from flask import request

sample_api = Flask(__name__)

@sample_api.route("/gse/api/sample", methods=["GET"])
def hello_world():
    answer = "<html><body><h1>Hi</h1></body></html>"
    return answer

if __name__ == "__main__":
    sample_api.run()

