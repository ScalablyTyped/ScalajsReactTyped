package typingsJapgolly.atvlegacycontentkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The callback used when the app has finished a login request.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVAuthenticationCallback extends StObject {
  
  /**
    * If the login request failed, return an error.
    * @param error The error that is displayed to the user.
    */
  def failure(error: String): Unit
  
  /**
    * The authentication was successful.
    */
  def success(): Unit
}
object ATVAuthenticationCallback {
  
  inline def apply(failure: String => Callback, success: Callback): ATVAuthenticationCallback = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1((t0: String) => failure(t0).runNow()), success = success.toJsFn)
    __obj.asInstanceOf[ATVAuthenticationCallback]
  }
  
  extension [Self <: ATVAuthenticationCallback](x: Self) {
    
    inline def setFailure(value: String => Callback): Self = StObject.set(x, "failure", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSuccess(value: Callback): Self = StObject.set(x, "success", value.toJsFn)
  }
}
