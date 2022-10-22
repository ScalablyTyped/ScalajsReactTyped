package typingsJapgolly.ipfsHttpClient.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.ipfsHttpClient.distSrcPubsubSubscribeMod.ErrorHandlerFn
import typingsJapgolly.ipfsHttpClient.distSrcPubsubSubscribeMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnError extends StObject {
  
  var onError: js.UndefOr[ErrorHandlerFn] = js.undefined
}
object OnError {
  
  inline def apply(): OnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnError]
  }
  
  extension [Self <: OnError](x: Self) {
    
    inline def setOnError(value: (/* err */ js.Error, /* fatal */ Boolean, /* msg */ js.UndefOr[Message]) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction3((t0: /* err */ js.Error, t1: /* fatal */ Boolean, t2: /* msg */ js.UndefOr[Message]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
  }
}
