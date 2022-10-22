package typingsJapgolly.firebase.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete extends StObject {
  
  def delete(): js.Promise[Unit]
}
object Delete {
  
  inline def apply(delete: CallbackTo[js.Promise[Unit]]): Delete = {
    val __obj = js.Dynamic.literal(delete = delete.toJsFn)
    __obj.asInstanceOf[Delete]
  }
  
  extension [Self <: Delete](x: Self) {
    
    inline def setDelete(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "delete", value.toJsFn)
  }
}
