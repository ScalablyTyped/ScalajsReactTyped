package typingsJapgolly.nodeMailjet.mod.SMS

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceActionId extends StObject {
  
  def request(): js.Promise[ExportResponse]
}
object GetResourceActionId {
  
  inline def apply(request: CallbackTo[js.Promise[ExportResponse]]): GetResourceActionId = {
    val __obj = js.Dynamic.literal(request = request.toJsFn)
    __obj.asInstanceOf[GetResourceActionId]
  }
  
  extension [Self <: GetResourceActionId](x: Self) {
    
    inline def setRequest(value: CallbackTo[js.Promise[ExportResponse]]): Self = StObject.set(x, "request", value.toJsFn)
  }
}
