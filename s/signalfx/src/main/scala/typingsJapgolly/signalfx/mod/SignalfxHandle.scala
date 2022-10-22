package typingsJapgolly.signalfx.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalfxHandle extends StObject {
  
  def close(): Boolean
  
  def get_known_tsids(): js.Array[String]
  
  def get_metadata(): js.UndefOr[js.Object]
  
  def stream(callback: StreamCallback): Boolean
}
object SignalfxHandle {
  
  inline def apply(
    close: CallbackTo[Boolean],
    get_known_tsids: CallbackTo[js.Array[String]],
    get_metadata: CallbackTo[js.UndefOr[js.Object]],
    stream: StreamCallback => Boolean
  ): SignalfxHandle = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, get_known_tsids = get_known_tsids.toJsFn, get_metadata = get_metadata.toJsFn, stream = js.Any.fromFunction1(stream))
    __obj.asInstanceOf[SignalfxHandle]
  }
  
  extension [Self <: SignalfxHandle](x: Self) {
    
    inline def setClose(value: CallbackTo[Boolean]): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setGet_known_tsids(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "get_known_tsids", value.toJsFn)
    
    inline def setGet_metadata(value: CallbackTo[js.UndefOr[js.Object]]): Self = StObject.set(x, "get_metadata", value.toJsFn)
    
    inline def setStream(value: StreamCallback => Boolean): Self = StObject.set(x, "stream", js.Any.fromFunction1(value))
  }
}
