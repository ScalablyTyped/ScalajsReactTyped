package typingsJapgolly.reactNativeSensorManager.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensorManager extends StObject {
  
  def startAccelerometer(delay: Double): Unit
  
  def startGyroscope(delay: Double): Unit
  
  def startLightSensor(delay: Double): Unit
  
  def startMagnetometer(delay: Double): Unit
  
  def startMotionValue(delay: Double): Unit
  
  def startOrientation(delay: Double): Unit
  
  def startProximity(delay: Double): Unit
  
  def startStepCounter(delay: Double): Unit
  
  def startThermometer(delay: Double): Unit
  
  def stopAccelerometer(): Unit
  
  def stopGyroscope(): Unit
  
  def stopLightSensor(): Unit
  
  def stopMagnetometer(): Unit
  
  def stopMotionValue(): Unit
  
  def stopOrientation(): Unit
  
  def stopProximity(): Unit
  
  def stopStepCounter(): Unit
  
  def stopThermometer(): Unit
}
object SensorManager {
  
  inline def apply(
    startAccelerometer: Double => Callback,
    startGyroscope: Double => Callback,
    startLightSensor: Double => Callback,
    startMagnetometer: Double => Callback,
    startMotionValue: Double => Callback,
    startOrientation: Double => Callback,
    startProximity: Double => Callback,
    startStepCounter: Double => Callback,
    startThermometer: Double => Callback,
    stopAccelerometer: Callback,
    stopGyroscope: Callback,
    stopLightSensor: Callback,
    stopMagnetometer: Callback,
    stopMotionValue: Callback,
    stopOrientation: Callback,
    stopProximity: Callback,
    stopStepCounter: Callback,
    stopThermometer: Callback
  ): SensorManager = {
    val __obj = js.Dynamic.literal(startAccelerometer = js.Any.fromFunction1((t0: Double) => startAccelerometer(t0).runNow()), startGyroscope = js.Any.fromFunction1((t0: Double) => startGyroscope(t0).runNow()), startLightSensor = js.Any.fromFunction1((t0: Double) => startLightSensor(t0).runNow()), startMagnetometer = js.Any.fromFunction1((t0: Double) => startMagnetometer(t0).runNow()), startMotionValue = js.Any.fromFunction1((t0: Double) => startMotionValue(t0).runNow()), startOrientation = js.Any.fromFunction1((t0: Double) => startOrientation(t0).runNow()), startProximity = js.Any.fromFunction1((t0: Double) => startProximity(t0).runNow()), startStepCounter = js.Any.fromFunction1((t0: Double) => startStepCounter(t0).runNow()), startThermometer = js.Any.fromFunction1((t0: Double) => startThermometer(t0).runNow()), stopAccelerometer = stopAccelerometer.toJsFn, stopGyroscope = stopGyroscope.toJsFn, stopLightSensor = stopLightSensor.toJsFn, stopMagnetometer = stopMagnetometer.toJsFn, stopMotionValue = stopMotionValue.toJsFn, stopOrientation = stopOrientation.toJsFn, stopProximity = stopProximity.toJsFn, stopStepCounter = stopStepCounter.toJsFn, stopThermometer = stopThermometer.toJsFn)
    __obj.asInstanceOf[SensorManager]
  }
  
  extension [Self <: SensorManager](x: Self) {
    
    inline def setStartAccelerometer(value: Double => Callback): Self = StObject.set(x, "startAccelerometer", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStartGyroscope(value: Double => Callback): Self = StObject.set(x, "startGyroscope", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStartLightSensor(value: Double => Callback): Self = StObject.set(x, "startLightSensor", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStartMagnetometer(value: Double => Callback): Self = StObject.set(x, "startMagnetometer", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStartMotionValue(value: Double => Callback): Self = StObject.set(x, "startMotionValue", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStartOrientation(value: Double => Callback): Self = StObject.set(x, "startOrientation", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStartProximity(value: Double => Callback): Self = StObject.set(x, "startProximity", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStartStepCounter(value: Double => Callback): Self = StObject.set(x, "startStepCounter", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStartThermometer(value: Double => Callback): Self = StObject.set(x, "startThermometer", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStopAccelerometer(value: Callback): Self = StObject.set(x, "stopAccelerometer", value.toJsFn)
    
    inline def setStopGyroscope(value: Callback): Self = StObject.set(x, "stopGyroscope", value.toJsFn)
    
    inline def setStopLightSensor(value: Callback): Self = StObject.set(x, "stopLightSensor", value.toJsFn)
    
    inline def setStopMagnetometer(value: Callback): Self = StObject.set(x, "stopMagnetometer", value.toJsFn)
    
    inline def setStopMotionValue(value: Callback): Self = StObject.set(x, "stopMotionValue", value.toJsFn)
    
    inline def setStopOrientation(value: Callback): Self = StObject.set(x, "stopOrientation", value.toJsFn)
    
    inline def setStopProximity(value: Callback): Self = StObject.set(x, "stopProximity", value.toJsFn)
    
    inline def setStopStepCounter(value: Callback): Self = StObject.set(x, "stopStepCounter", value.toJsFn)
    
    inline def setStopThermometer(value: Callback): Self = StObject.set(x, "stopThermometer", value.toJsFn)
  }
}
