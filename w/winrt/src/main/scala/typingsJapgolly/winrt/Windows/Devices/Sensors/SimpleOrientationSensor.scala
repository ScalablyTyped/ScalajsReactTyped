package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleOrientationSensor
  extends StObject
     with ISimpleOrientationSensor
object SimpleOrientationSensor {
  
  inline def apply(getCurrentOrientation: CallbackTo[SimpleOrientation], onorientationchanged: Any): SimpleOrientationSensor = {
    val __obj = js.Dynamic.literal(getCurrentOrientation = getCurrentOrientation.toJsFn, onorientationchanged = onorientationchanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleOrientationSensor]
  }
}
