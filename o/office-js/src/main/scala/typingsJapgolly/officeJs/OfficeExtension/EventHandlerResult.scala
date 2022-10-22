package typingsJapgolly.officeJs.OfficeExtension

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventHandlerResult[T] extends StObject {
  
  /** The request context associated with the object */
  var context: ClientRequestContext
  
  def remove(): Unit
}
object EventHandlerResult {
  
  inline def apply[T](context: ClientRequestContext, remove: Callback): EventHandlerResult[T] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], remove = remove.toJsFn)
    __obj.asInstanceOf[EventHandlerResult[T]]
  }
  
  extension [Self <: EventHandlerResult[?], T](x: Self & EventHandlerResult[T]) {
    
    inline def setContext(value: ClientRequestContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
