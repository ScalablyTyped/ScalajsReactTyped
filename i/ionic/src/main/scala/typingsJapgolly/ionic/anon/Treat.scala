package typingsJapgolly.ionic.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Treat extends StObject {
  
  var message: String
  
  def treat(): js.Promise[Unit]
}
object Treat {
  
  inline def apply(message: String, treat: CallbackTo[js.Promise[Unit]]): Treat = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], treat = treat.toJsFn)
    __obj.asInstanceOf[Treat]
  }
  
  extension [Self <: Treat](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTreat(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "treat", value.toJsFn)
  }
}
