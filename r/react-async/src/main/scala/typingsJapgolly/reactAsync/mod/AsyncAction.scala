package typingsJapgolly.reactAsync.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactAsync.anon.Dictmeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactAsync.mod.Start
  - typingsJapgolly.reactAsync.mod.Cancel
  - typingsJapgolly.reactAsync.mod.Fulfill[T]
  - typingsJapgolly.reactAsync.mod.Reject
*/
trait AsyncAction[T] extends StObject
object AsyncAction {
  
  inline def Cancel(meta: Dictmeta): typingsJapgolly.reactAsync.mod.Cancel = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cancel")
    __obj.asInstanceOf[typingsJapgolly.reactAsync.mod.Cancel]
  }
  
  inline def Fulfill[T](meta: Dictmeta, payload: T): typingsJapgolly.reactAsync.mod.Fulfill[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fulfill")
    __obj.asInstanceOf[typingsJapgolly.reactAsync.mod.Fulfill[T]]
  }
  
  inline def Reject(meta: Dictmeta, payload: js.Error): typingsJapgolly.reactAsync.mod.Reject = {
    val __obj = js.Dynamic.literal(error = true, meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reject")
    __obj.asInstanceOf[typingsJapgolly.reactAsync.mod.Reject]
  }
  
  inline def Start(meta: Dictmeta, payload: CallbackTo[js.Promise[Unit]]): typingsJapgolly.reactAsync.mod.Start = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.toJsFn)
    __obj.updateDynamic("type")("start")
    __obj.asInstanceOf[typingsJapgolly.reactAsync.mod.Start]
  }
}
