package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interaction continuation specifying authentication success.
  * @since LibreOffice 4.4
  */
trait XInteractionAuthFallback
  extends StObject
     with XInteractionContinuation {
  
  def setCode(code: String): Unit
}
object XInteractionAuthFallback {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    select: Callback,
    setCode: String => Callback
  ): XInteractionAuthFallback = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, select = select.toJsFn, setCode = js.Any.fromFunction1((t0: String) => setCode(t0).runNow()))
    __obj.asInstanceOf[XInteractionAuthFallback]
  }
  
  extension [Self <: XInteractionAuthFallback](x: Self) {
    
    inline def setSetCode(value: String => Callback): Self = StObject.set(x, "setCode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
