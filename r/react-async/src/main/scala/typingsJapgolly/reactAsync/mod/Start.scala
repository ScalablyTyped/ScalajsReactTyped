package typingsJapgolly.reactAsync.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactAsync.anon.Dictmeta
import typingsJapgolly.reactAsync.reactAsyncStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Start
  extends StObject
     with AbstractAction
     with AsyncAction[Any] {
  
  def payload(): js.Promise[Unit]
  
  @JSName("type")
  var type_Start: start
}
object Start {
  
  inline def apply(meta: Dictmeta, payload: CallbackTo[js.Promise[Unit]]): Start = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.toJsFn)
    __obj.updateDynamic("type")("start")
    __obj.asInstanceOf[Start]
  }
  
  extension [Self <: Start](x: Self) {
    
    inline def setPayload(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "payload", value.toJsFn)
    
    inline def setType(value: start): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
