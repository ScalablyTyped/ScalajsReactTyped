package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Optional
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Obtains human readable strings from an {@link XInteractionRequest} . */
trait XInteractionRequestStringResolver
  extends StObject
     with XInterface {
  
  /**
    * Obtains a string containing a human readable message from an informational interaction request.
    *
    * An informational interaction request contains not more than one interaction continuation (user has no choice; request is just informational). The
    * supplies continuation must either be a {@link XInteractionAbort} or {@link XInteractionApprove}
    * @param Request the interaction request for that the message shall be obtained.
    * @returns the message string or an empty com::sun::star::beans::Optional.
    */
  def getStringFromInformationalRequest(Request: XInteractionRequest): Optional[String]
}
object XInteractionRequestStringResolver {
  
  inline def apply(
    acquire: Callback,
    getStringFromInformationalRequest: XInteractionRequest => Optional[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XInteractionRequestStringResolver = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getStringFromInformationalRequest = js.Any.fromFunction1(getStringFromInformationalRequest), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInteractionRequestStringResolver]
  }
  
  extension [Self <: XInteractionRequestStringResolver](x: Self) {
    
    inline def setGetStringFromInformationalRequest(value: XInteractionRequest => Optional[String]): Self = StObject.set(x, "getStringFromInformationalRequest", js.Any.fromFunction1(value))
  }
}
