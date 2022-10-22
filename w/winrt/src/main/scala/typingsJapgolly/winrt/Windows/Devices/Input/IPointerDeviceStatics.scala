package typingsJapgolly.winrt.Windows.Devices.Input

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPointerDeviceStatics extends StObject {
  
  def getPointerDevice(pointerId: Double): PointerDevice
  
  def getPointerDevices(): IVectorView[PointerDevice]
}
object IPointerDeviceStatics {
  
  inline def apply(
    getPointerDevice: Double => PointerDevice,
    getPointerDevices: CallbackTo[IVectorView[PointerDevice]]
  ): IPointerDeviceStatics = {
    val __obj = js.Dynamic.literal(getPointerDevice = js.Any.fromFunction1(getPointerDevice), getPointerDevices = getPointerDevices.toJsFn)
    __obj.asInstanceOf[IPointerDeviceStatics]
  }
  
  extension [Self <: IPointerDeviceStatics](x: Self) {
    
    inline def setGetPointerDevice(value: Double => PointerDevice): Self = StObject.set(x, "getPointerDevice", js.Any.fromFunction1(value))
    
    inline def setGetPointerDevices(value: CallbackTo[IVectorView[PointerDevice]]): Self = StObject.set(x, "getPointerDevices", value.toJsFn)
  }
}
