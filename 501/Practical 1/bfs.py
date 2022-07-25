# from queue import Queue
import queue as Q
from dict_cities import dict_gn


start = "Arad"
goal = "Bucharest"

result = ""

def BFS(city, cityq,visitedq):
    global result 
    if city == start:
        result = result + " " + city
    for eachcity in dict_gn[city].keys():
        if eachcity == goal:
            result = result + " " + eachcity
            return
        if eachcity not in cityq.queue and eachcity not in visitedq.queue:
            cityq.put(eachcity)
            result = result + " " + eachcity
    visitedq.put(city)
    BFS(cityq.get(),cityq,visitedq)


def main():
    cityq = Q.Queue()
    vistedq = Q.Queue()
    BFS(start,cityq,vistedq)
    print("BFS Traversal from ",start,"to",goal,"is:")
    print(result)

main()