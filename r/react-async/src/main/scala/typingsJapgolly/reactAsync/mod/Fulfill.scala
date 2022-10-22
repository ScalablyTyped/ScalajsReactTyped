package typingsJapgolly.reactAsync.mod

import typingsJapgolly.reactAsync.anon.Dictmeta
import typingsJapgolly.reactAsync.reactAsyncStrings.fulfill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fulfill[T]
  extends StObject
     with AbstractAction
     with AsyncAction[T] {
  
  var payload: T
  
  @JSName("type")
  var type_Fulfill: fulfill
}
object Fulfill {
  
  inline def apply[T](meta: Dictmeta, payload: T): Fulfill[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fulfill")
    __obj.asInstanceOf[Fulfill[T]]
  }
  
  extension [Self <: Fulfill[?], T](x: Self & Fulfill[T]) {
    
    inline def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: fulfill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
