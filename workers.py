from pandas import read_json as rj
from datetime import datetime
from elasticsearch import Elasticsearch
es = Elasticsearch()

nome_arquivo = "dataset.json"
dataset = rj(nome_arquivo)


cont = 0
for i in dataset["data"]:
	service = i["service"]
	cont += 1
	res = es.index(index="buzzimonitor", doc_type=service, id=cont, body=i)


