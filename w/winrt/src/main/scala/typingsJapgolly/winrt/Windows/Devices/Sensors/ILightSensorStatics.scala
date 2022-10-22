package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILightSensorStatics extends StObject {
  
  def getDefault(): LightSensor
}
object ILightSensorStatics {
  
  inline def apply(getDefault: CallbackTo[LightSensor]): ILightSensorStatics = {
    val __obj = js.Dynamic.literal(getDefault = getDefault.toJsFn)
    __obj.asInstanceOf[ILightSensorStatics]
  }
  
  extension [Self <: ILightSensorStatics](x: Self) {
    
    inline def setGetDefault(value: CallbackTo[LightSensor]): Self = StObject.set(x, "getDefault", value.toJsFn)
  }
}
