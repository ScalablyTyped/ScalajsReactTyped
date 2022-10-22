package typingsJapgolly.reactNativeReanimated.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedSensor[SensorValueType] extends StObject {
  
  var config: SensorConfig
  
  var isAvailable: Boolean
  
  var sensor: SensorValueType
  
  def unregister(): Unit
}
object AnimatedSensor {
  
  inline def apply[SensorValueType](config: SensorConfig, isAvailable: Boolean, sensor: SensorValueType, unregister: Callback): AnimatedSensor[SensorValueType] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], isAvailable = isAvailable.asInstanceOf[js.Any], sensor = sensor.asInstanceOf[js.Any], unregister = unregister.toJsFn)
    __obj.asInstanceOf[AnimatedSensor[SensorValueType]]
  }
  
  extension [Self <: AnimatedSensor[?], SensorValueType](x: Self & AnimatedSensor[SensorValueType]) {
    
    inline def setConfig(value: SensorConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
    
    inline def setSensor(value: SensorValueType): Self = StObject.set(x, "sensor", value.asInstanceOf[js.Any])
    
    inline def setUnregister(value: Callback): Self = StObject.set(x, "unregister", value.toJsFn)
  }
}
