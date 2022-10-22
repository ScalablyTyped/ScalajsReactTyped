package typingsJapgolly.winrt.Windows.Devices.Input

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseDeviceStatics extends StObject {
  
  def getForCurrentView(): MouseDevice
}
object IMouseDeviceStatics {
  
  inline def apply(getForCurrentView: CallbackTo[MouseDevice]): IMouseDeviceStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = getForCurrentView.toJsFn)
    __obj.asInstanceOf[IMouseDeviceStatics]
  }
  
  extension [Self <: IMouseDeviceStatics](x: Self) {
    
    inline def setGetForCurrentView(value: CallbackTo[MouseDevice]): Self = StObject.set(x, "getForCurrentView", value.toJsFn)
  }
}
