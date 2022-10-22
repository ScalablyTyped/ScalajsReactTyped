package typingsJapgolly.wechatMiniprogram.DB

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealtimeListener extends StObject {
  
  // "And Now His Watch Is Ended"
  def close(): js.Promise[Unit]
}
object RealtimeListener {
  
  inline def apply(close: CallbackTo[js.Promise[Unit]]): RealtimeListener = {
    val __obj = js.Dynamic.literal(close = close.toJsFn)
    __obj.asInstanceOf[RealtimeListener]
  }
  
  extension [Self <: RealtimeListener](x: Self) {
    
    inline def setClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "close", value.toJsFn)
  }
}
