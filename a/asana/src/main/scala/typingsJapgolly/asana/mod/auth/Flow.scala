package typingsJapgolly.asana.mod.auth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flow extends StObject {
  
  /**
    * @returns {String} The URL used to authorize the user for the app.
    * @return
    */
  def authorizeUrl(): String
  
  /**
    * Run the appropriate parts of the Oauth flow, attempting to establish user
    * authorization.
    * @returns {Promise<Object>} A promise that resolves to the Oauth credentials.
    */
  def run(): Unit
}
object Flow {
  
  inline def apply(authorizeUrl: CallbackTo[String], run: Callback): Flow = {
    val __obj = js.Dynamic.literal(authorizeUrl = authorizeUrl.toJsFn, run = run.toJsFn)
    __obj.asInstanceOf[Flow]
  }
  
  extension [Self <: Flow](x: Self) {
    
    inline def setAuthorizeUrl(value: CallbackTo[String]): Self = StObject.set(x, "authorizeUrl", value.toJsFn)
    
    inline def setRun(value: Callback): Self = StObject.set(x, "run", value.toJsFn)
  }
}
