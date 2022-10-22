package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISimpleOrientationSensor extends StObject {
  
  def getCurrentOrientation(): SimpleOrientation
  
  var onorientationchanged: Any
}
object ISimpleOrientationSensor {
  
  inline def apply(getCurrentOrientation: CallbackTo[SimpleOrientation], onorientationchanged: Any): ISimpleOrientationSensor = {
    val __obj = js.Dynamic.literal(getCurrentOrientation = getCurrentOrientation.toJsFn, onorientationchanged = onorientationchanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimpleOrientationSensor]
  }
  
  extension [Self <: ISimpleOrientationSensor](x: Self) {
    
    inline def setGetCurrentOrientation(value: CallbackTo[SimpleOrientation]): Self = StObject.set(x, "getCurrentOrientation", value.toJsFn)
    
    inline def setOnorientationchanged(value: Any): Self = StObject.set(x, "onorientationchanged", value.asInstanceOf[js.Any])
  }
}
