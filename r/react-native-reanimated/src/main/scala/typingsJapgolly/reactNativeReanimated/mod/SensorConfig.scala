package typingsJapgolly.reactNativeReanimated.mod

import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensorConfig extends StObject {
  
  var interval: Double | auto
}
object SensorConfig {
  
  inline def apply(interval: Double | auto): SensorConfig = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorConfig]
  }
  
  extension [Self <: SensorConfig](x: Self) {
    
    inline def setInterval(value: Double | auto): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
  }
}
