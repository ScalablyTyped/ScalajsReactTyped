package typingsJapgolly.limeJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransportStateListener extends StObject {
  
  def onClose(): Unit
  
  def onError(error: String): Unit
  
  def onOpen(): Unit
}
object ITransportStateListener {
  
  inline def apply(onClose: Callback, onError: String => Callback, onOpen: Callback): ITransportStateListener = {
    val __obj = js.Dynamic.literal(onClose = onClose.toJsFn, onError = js.Any.fromFunction1((t0: String) => onError(t0).runNow()), onOpen = onOpen.toJsFn)
    __obj.asInstanceOf[ITransportStateListener]
  }
  
  extension [Self <: ITransportStateListener](x: Self) {
    
    inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
    
    inline def setOnError(value: String => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setOnOpen(value: Callback): Self = StObject.set(x, "onOpen", value.toJsFn)
  }
}
