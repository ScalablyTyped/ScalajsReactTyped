package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOrientationSensorStatics extends StObject {
  
  def getDefault(): OrientationSensor
}
object IOrientationSensorStatics {
  
  inline def apply(getDefault: CallbackTo[OrientationSensor]): IOrientationSensorStatics = {
    val __obj = js.Dynamic.literal(getDefault = getDefault.toJsFn)
    __obj.asInstanceOf[IOrientationSensorStatics]
  }
  
  extension [Self <: IOrientationSensorStatics](x: Self) {
    
    inline def setGetDefault(value: CallbackTo[OrientationSensor]): Self = StObject.set(x, "getDefault", value.toJsFn)
  }
}
