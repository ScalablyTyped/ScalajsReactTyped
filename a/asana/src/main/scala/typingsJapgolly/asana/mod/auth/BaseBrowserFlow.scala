package typingsJapgolly.asana.mod.auth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseBrowserFlow
  extends StObject
     with Flow {
  
  /**
    * @return {String} The URL to redirect to that will receive the
    * @return
    */
  def asanaBaseUrl(): String
  
  /**
    * @return {Promise<Object>} Credentials returned from Oauth.
    * @param state
    */
  def finishAuthorization(state: String): Unit
  
  /**
    * @returns {String} Generate a new unique state parameter for a request.
    * @return
    */
  def getStateParam(): String
  
  /**
    * @return {String} The URL to redirect to that will receive the
    * @return
    */
  def receiverUrl(): String
  
  /**
    * @param {String} authUrl The URL the user should be navigated to in order
    *     to authorize the app.
    * @param {String} state   The unique state generated for this auth request.
    * @return {Promise} Resolved when authorization has successfully started,
    *     i.e. the user has been navigated to a page requesting authorization.
    * @param authUrl
    * @param state
    * @return
    */
  def startAuthorization(authUrl: String, state: String): Any
}
object BaseBrowserFlow {
  
  @JSImport("asana", "auth.BaseBrowserFlow")
  @js.native
  val ^ : BaseBrowserFlowStatic = js.native
  
  extension [Self <: BaseBrowserFlow](x: Self) {
    
    inline def setAsanaBaseUrl(value: CallbackTo[String]): Self = StObject.set(x, "asanaBaseUrl", value.toJsFn)
    
    inline def setFinishAuthorization(value: String => Callback): Self = StObject.set(x, "finishAuthorization", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGetStateParam(value: CallbackTo[String]): Self = StObject.set(x, "getStateParam", value.toJsFn)
    
    inline def setReceiverUrl(value: CallbackTo[String]): Self = StObject.set(x, "receiverUrl", value.toJsFn)
    
    inline def setStartAuthorization(value: (String, String) => Any): Self = StObject.set(x, "startAuthorization", js.Any.fromFunction2(value))
  }
}
