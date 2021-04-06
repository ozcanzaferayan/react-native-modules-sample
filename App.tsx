import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View, Button, NativeModules, Platform, TouchableOpacity } from 'react-native';

export default function App() {
  const handleOpenNativeScreen = () => {
    const os = Platform.OS;
    const message = `Hello from ${os}`;
    NativeModules.MyCustomModule.openNativeScreen(message);
  }

  return (
    <View style={styles.container}>
      <TouchableOpacity onPress={handleOpenNativeScreen} style={styles.button}>
        <Text style={styles.buttonText}>Open native screen</Text>
        </TouchableOpacity>
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  button:{
    borderRadius: 5,
    backgroundColor: 'dodgerblue',
    paddingVertical: 8,
    paddingHorizontal: 12
  }, 
  buttonText :{
    color:'white',
    fontSize: 16
  }
});
