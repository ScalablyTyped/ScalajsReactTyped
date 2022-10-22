package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The description of an interaction request. */
trait XInteractionRequest
  extends StObject
     with XInterface {
  
  /** Get the set of com::sun::star::task::XInteractionContinuations the client supports for this request. */
  val Continuations: SafeArray[XInteractionContinuation]
  
  /**
    * Get information about the request itself.
    * @returns an {@link com.sun.star.uno.Exception} , wrapped as an `any` .
    */
  val Request: Any
  
  /** Get the set of com::sun::star::task::XInteractionContinuations the client supports for this request. */
  def getContinuations(): SafeArray[XInteractionContinuation]
  
  /**
    * Get information about the request itself.
    * @returns an {@link com.sun.star.uno.Exception} , wrapped as an `any` .
    */
  def getRequest(): Any
}
object XInteractionRequest {
  
  inline def apply(
    Continuations: SafeArray[XInteractionContinuation],
    Request: Any,
    acquire: Callback,
    getContinuations: CallbackTo[SafeArray[XInteractionContinuation]],
    getRequest: CallbackTo[Any],
    queryInterface: `type` => Any,
    release: Callback
  ): XInteractionRequest = {
    val __obj = js.Dynamic.literal(Continuations = Continuations.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any], acquire = acquire.toJsFn, getContinuations = getContinuations.toJsFn, getRequest = getRequest.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInteractionRequest]
  }
  
  extension [Self <: XInteractionRequest](x: Self) {
    
    inline def setContinuations(value: SafeArray[XInteractionContinuation]): Self = StObject.set(x, "Continuations", value.asInstanceOf[js.Any])
    
    inline def setGetContinuations(value: CallbackTo[SafeArray[XInteractionContinuation]]): Self = StObject.set(x, "getContinuations", value.toJsFn)
    
    inline def setGetRequest(value: CallbackTo[Any]): Self = StObject.set(x, "getRequest", value.toJsFn)
    
    inline def setRequest(value: Any): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
  }
}
