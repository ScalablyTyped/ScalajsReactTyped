package typingsJapgolly.googleMaps.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestHandle[T] extends StObject {
  
  /**
    * Cancels the request.
    * The ResponseCallback will not be invoked, and promises will not be settled.
    * Use the RequestHandle#finally handler will still be called.
    */
  def cancel(): Unit
  
  /**
    * Registers a callback that will be called when the response is finished, either successfully, or with an error,
    * or having been cancelled. Use this to clean up resources.
    * Returns this handle, for chaining.
    */
  def `finally`(callback: js.Function0[Unit]): RequestHandle[T]
}
object RequestHandle {
  
  inline def apply[T](cancel: Callback, `finally`: js.Function0[Unit] => RequestHandle[T]): RequestHandle[T] = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn)
    __obj.updateDynamic("finally")(js.Any.fromFunction1(`finally`))
    __obj.asInstanceOf[RequestHandle[T]]
  }
  
  extension [Self <: RequestHandle[?], T](x: Self & RequestHandle[T]) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setFinally(value: js.Function0[Unit] => RequestHandle[T]): Self = StObject.set(x, "finally", js.Any.fromFunction1(value))
  }
}
