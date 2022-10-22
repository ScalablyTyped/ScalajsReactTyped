package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interaction request handler. */
trait XInteractionHandler
  extends StObject
     with XInterface {
  
  /** Handle an interaction request. */
  def handle(Request: XInteractionRequest): Unit
}
object XInteractionHandler {
  
  inline def apply(
    acquire: Callback,
    handle: XInteractionRequest => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XInteractionHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, handle = js.Any.fromFunction1((t0: XInteractionRequest) => handle(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInteractionHandler]
  }
  
  extension [Self <: XInteractionHandler](x: Self) {
    
    inline def setHandle(value: XInteractionRequest => Callback): Self = StObject.set(x, "handle", js.Any.fromFunction1((t0: XInteractionRequest) => value(t0).runNow()))
  }
}
