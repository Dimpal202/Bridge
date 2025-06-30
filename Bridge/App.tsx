import React, { useEffect } from 'react';
import { View, Text } from 'react-native';
import { NativeModules } from 'react-native';

const { SquareRoot } = NativeModules;

const App = () => {
  useEffect(() => {
    // Call calculateSquareRoot when the component mounts
    calculateSquareRoot(25);
  }, []);

  const calculateSquareRoot = async (number) => {
    try {
      const result = await SquareRoot.calculate(number);
      console.log('Square root:', result);
    } catch (error) {
      console.error('Error calculating square root:', error);
    }
  };

  return (
    <View>
      <Text>Calculating Square Root...</Text>
    </View>
  );
};

export default App;