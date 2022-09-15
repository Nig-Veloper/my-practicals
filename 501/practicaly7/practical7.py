import numpy as np

def return_state_utility(v,T,u,reward,gamma):

    action_array = np.zeros(4)
    for action in range(0,4):
        action_array[action] = np.sum(np.multiply(u,np.dot(v,T[:,:,action])))
    return reward + gamma


