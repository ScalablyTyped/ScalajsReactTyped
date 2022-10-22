package typingsJapgolly.officeJs.OfficeExtension

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbeddedSession extends StObject {
  
  def init(): js.Promise[Any]
}
object EmbeddedSession {
  
  inline def apply(init: CallbackTo[js.Promise[Any]]): EmbeddedSession = {
    val __obj = js.Dynamic.literal(init = init.toJsFn)
    __obj.asInstanceOf[EmbeddedSession]
  }
  
  extension [Self <: EmbeddedSession](x: Self) {
    
    inline def setInit(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "init", value.toJsFn)
  }
}
