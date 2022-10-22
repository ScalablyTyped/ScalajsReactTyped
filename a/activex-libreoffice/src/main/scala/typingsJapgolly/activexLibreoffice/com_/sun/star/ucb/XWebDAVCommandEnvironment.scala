package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.StringPair
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A command environment that can be used to deal with WebDAV/HTTP specific commands. */
trait XWebDAVCommandEnvironment
  extends StObject
     with XCommandEnvironment {
  
  /**
    * This method gets called while assembling an WebDAV/HTTP request. The returned headername-headervalue pairs will be appended to the list of request
    * headers before the request is dispatched.
    * @param aURI The request URI.
    * @param eMethod The WebDAV/HTTP method ("GET","PUT","MKCOL",...) as defined in WebDAVHTTPMethod.
    * @returns A sequence of header name, header value pairs. The header names must be the plain names and contain no trailing ":".
    */
  def getUserRequestHeaders(aURI: String, eMethod: WebDAVHTTPMethod): SafeArray[StringPair]
}
object XWebDAVCommandEnvironment {
  
  inline def apply(
    InteractionHandler: XInteractionHandler,
    ProgressHandler: XProgressHandler,
    acquire: Callback,
    getInteractionHandler: CallbackTo[XInteractionHandler],
    getProgressHandler: CallbackTo[XProgressHandler],
    getUserRequestHeaders: (String, WebDAVHTTPMethod) => SafeArray[StringPair],
    queryInterface: `type` => Any,
    release: Callback
  ): XWebDAVCommandEnvironment = {
    val __obj = js.Dynamic.literal(InteractionHandler = InteractionHandler.asInstanceOf[js.Any], ProgressHandler = ProgressHandler.asInstanceOf[js.Any], acquire = acquire.toJsFn, getInteractionHandler = getInteractionHandler.toJsFn, getProgressHandler = getProgressHandler.toJsFn, getUserRequestHeaders = js.Any.fromFunction2(getUserRequestHeaders), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XWebDAVCommandEnvironment]
  }
  
  extension [Self <: XWebDAVCommandEnvironment](x: Self) {
    
    inline def setGetUserRequestHeaders(value: (String, WebDAVHTTPMethod) => SafeArray[StringPair]): Self = StObject.set(x, "getUserRequestHeaders", js.Any.fromFunction2(value))
  }
}
