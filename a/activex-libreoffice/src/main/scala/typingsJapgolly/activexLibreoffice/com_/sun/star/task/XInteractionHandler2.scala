package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interaction request handler.
  *
  * This interface extends the interface {@link XInteractionHandler} the way that a caller can determine whether an interaction request was actually
  * handled by the interaction handler.
  * @since OOo 3.2
  */
trait XInteractionHandler2
  extends StObject
     with XInteractionHandler {
  
  /**
    * Handle an interaction request.
    * @param Request the inteaction request to handle.
    * @returns `TRUE` , if the handler handled the request, `FALSE` otherwise.
    */
  def handleInteractionRequest(Request: XInteractionRequest): Boolean
}
object XInteractionHandler2 {
  
  inline def apply(
    acquire: Callback,
    handle: XInteractionRequest => Callback,
    handleInteractionRequest: XInteractionRequest => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XInteractionHandler2 = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, handle = js.Any.fromFunction1((t0: XInteractionRequest) => handle(t0).runNow()), handleInteractionRequest = js.Any.fromFunction1(handleInteractionRequest), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInteractionHandler2]
  }
  
  extension [Self <: XInteractionHandler2](x: Self) {
    
    inline def setHandleInteractionRequest(value: XInteractionRequest => Boolean): Self = StObject.set(x, "handleInteractionRequest", js.Any.fromFunction1(value))
  }
}
