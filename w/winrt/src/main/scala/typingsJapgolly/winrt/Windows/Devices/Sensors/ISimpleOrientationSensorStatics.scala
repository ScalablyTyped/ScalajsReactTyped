package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISimpleOrientationSensorStatics extends StObject {
  
  def getDefault(): SimpleOrientationSensor
}
object ISimpleOrientationSensorStatics {
  
  inline def apply(getDefault: CallbackTo[SimpleOrientationSensor]): ISimpleOrientationSensorStatics = {
    val __obj = js.Dynamic.literal(getDefault = getDefault.toJsFn)
    __obj.asInstanceOf[ISimpleOrientationSensorStatics]
  }
  
  extension [Self <: ISimpleOrientationSensorStatics](x: Self) {
    
    inline def setGetDefault(value: CallbackTo[SimpleOrientationSensor]): Self = StObject.set(x, "getDefault", value.toJsFn)
  }
}
