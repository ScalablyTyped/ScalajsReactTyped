package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICallControlStatics extends StObject {
  
  def fromId(deviceInterfaceId: String): CallControl
  
  def getDefault(): CallControl
}
object ICallControlStatics {
  
  inline def apply(fromId: String => CallControl, getDefault: CallbackTo[CallControl]): ICallControlStatics = {
    val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDefault = getDefault.toJsFn)
    __obj.asInstanceOf[ICallControlStatics]
  }
  
  extension [Self <: ICallControlStatics](x: Self) {
    
    inline def setFromId(value: String => CallControl): Self = StObject.set(x, "fromId", js.Any.fromFunction1(value))
    
    inline def setGetDefault(value: CallbackTo[CallControl]): Self = StObject.set(x, "getDefault", value.toJsFn)
  }
}
