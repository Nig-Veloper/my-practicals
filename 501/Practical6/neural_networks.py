import numpy as np

class NeuralNetwork:
    def __init__(self):
        np.randomseed()

        self.synaptic_weight = 2 * np.random.random((3,1)) - 1

    
    def sigmoid(self,x):
        return x* (1-x)
    
    def train(self, training_input, training_output, training_iteration):
        for iteration in range(training_iteration):
            output = self.think(training_input)
            error = training_output - output
            adjustments = np.dot(training_input.T, error * self.sigmoid_derivative(output))