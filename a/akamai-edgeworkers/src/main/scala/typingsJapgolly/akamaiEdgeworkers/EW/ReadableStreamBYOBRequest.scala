package typingsJapgolly.akamaiEdgeworkers.EW

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamBYOBRequest extends StObject {
  
  def respond(bytesWritten: Double): Unit
  
  def respondWithNewView(view: js.typedarray.ArrayBufferView): Unit
  
  val view: js.typedarray.ArrayBufferView
}
object ReadableStreamBYOBRequest {
  
  inline def apply(
    respond: Double => Callback,
    respondWithNewView: js.typedarray.ArrayBufferView => Callback,
    view: js.typedarray.ArrayBufferView
  ): ReadableStreamBYOBRequest = {
    val __obj = js.Dynamic.literal(respond = js.Any.fromFunction1((t0: Double) => respond(t0).runNow()), respondWithNewView = js.Any.fromFunction1((t0: js.typedarray.ArrayBufferView) => respondWithNewView(t0).runNow()), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamBYOBRequest]
  }
  
  extension [Self <: ReadableStreamBYOBRequest](x: Self) {
    
    inline def setRespond(value: Double => Callback): Self = StObject.set(x, "respond", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRespondWithNewView(value: js.typedarray.ArrayBufferView => Callback): Self = StObject.set(x, "respondWithNewView", js.Any.fromFunction1((t0: js.typedarray.ArrayBufferView) => value(t0).runNow()))
    
    inline def setView(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
