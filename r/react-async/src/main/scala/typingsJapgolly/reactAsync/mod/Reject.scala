package typingsJapgolly.reactAsync.mod

import typingsJapgolly.reactAsync.anon.Dictmeta
import typingsJapgolly.reactAsync.reactAsyncBooleans.`true`
import typingsJapgolly.reactAsync.reactAsyncStrings.reject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reject
  extends StObject
     with AbstractAction
     with AsyncAction[Any] {
  
  var error: `true`
  
  var payload: js.Error
  
  @JSName("type")
  var type_Reject: reject
}
object Reject {
  
  inline def apply(meta: Dictmeta, payload: js.Error): Reject = {
    val __obj = js.Dynamic.literal(error = true, meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reject")
    __obj.asInstanceOf[Reject]
  }
  
  extension [Self <: Reject](x: Self) {
    
    inline def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: js.Error): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: reject): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
