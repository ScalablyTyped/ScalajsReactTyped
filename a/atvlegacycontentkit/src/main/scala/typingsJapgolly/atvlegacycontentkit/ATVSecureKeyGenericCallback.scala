package typingsJapgolly.atvlegacycontentkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The callback for the get keys and certificate requests.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVSecureKeyGenericCallback extends StObject {
  
  /**
    * The item was was not able to be retrieved, so return an error.
    * @param error The error message to print to the log.
    */
  def failure(error: String): Unit
  
  /**
    * The asset ID was successfully retrieved, so return it.
    * @param assetID The certificate or the key, in Base64 format.
    */
  def success(dataBase64: String): Unit
}
object ATVSecureKeyGenericCallback {
  
  inline def apply(failure: String => Callback, success: String => Callback): ATVSecureKeyGenericCallback = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1((t0: String) => failure(t0).runNow()), success = js.Any.fromFunction1((t0: String) => success(t0).runNow()))
    __obj.asInstanceOf[ATVSecureKeyGenericCallback]
  }
  
  extension [Self <: ATVSecureKeyGenericCallback](x: Self) {
    
    inline def setFailure(value: String => Callback): Self = StObject.set(x, "failure", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSuccess(value: String => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
