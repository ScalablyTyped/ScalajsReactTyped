package typingsJapgolly.cypress.Cypress

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session extends StObject {
  
  // Clear all saved sessions and re-run the current spec file.
  def clearAllSavedSessions(): js.Promise[Unit]
}
object Session {
  
  inline def apply(clearAllSavedSessions: CallbackTo[js.Promise[Unit]]): Session = {
    val __obj = js.Dynamic.literal(clearAllSavedSessions = clearAllSavedSessions.toJsFn)
    __obj.asInstanceOf[Session]
  }
  
  extension [Self <: Session](x: Self) {
    
    inline def setClearAllSavedSessions(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clearAllSavedSessions", value.toJsFn)
  }
}
