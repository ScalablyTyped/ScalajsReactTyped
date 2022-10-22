package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAdvancedVideoCaptureDeviceController extends StObject {
  
  def getDeviceProperty(propertyId: String): Any
  
  def setDeviceProperty(propertyId: String, propertyValue: Any): Unit
}
object IAdvancedVideoCaptureDeviceController {
  
  inline def apply(getDeviceProperty: String => Any, setDeviceProperty: (String, Any) => Callback): IAdvancedVideoCaptureDeviceController = {
    val __obj = js.Dynamic.literal(getDeviceProperty = js.Any.fromFunction1(getDeviceProperty), setDeviceProperty = js.Any.fromFunction2((t0: String, t1: Any) => (setDeviceProperty(t0, t1)).runNow()))
    __obj.asInstanceOf[IAdvancedVideoCaptureDeviceController]
  }
  
  extension [Self <: IAdvancedVideoCaptureDeviceController](x: Self) {
    
    inline def setGetDeviceProperty(value: String => Any): Self = StObject.set(x, "getDeviceProperty", js.Any.fromFunction1(value))
    
    inline def setSetDeviceProperty(value: (String, Any) => Callback): Self = StObject.set(x, "setDeviceProperty", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
