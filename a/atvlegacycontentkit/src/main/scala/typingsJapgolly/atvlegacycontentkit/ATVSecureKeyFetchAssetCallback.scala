package typingsJapgolly.atvlegacycontentkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The callback for the fetch assets request.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVSecureKeyFetchAssetCallback extends StObject {
  
  /**
    * The asset was was not able to be retrieved, so return an error.
    * @param error The error message to print to the log.
    */
  def failure(error: String): Unit
  
  /**
    * The asset ID was successfully extracted, so return it.
    * @param assetID The asset ID.
    * @param needsBase64Decoded If the asset ID needs to be Base64 decoded before it can be used, then this must be true.
    */
  def success(assetID: String, needsBase64Decoded: Boolean): Unit
}
object ATVSecureKeyFetchAssetCallback {
  
  inline def apply(failure: String => Callback, success: (String, Boolean) => Callback): ATVSecureKeyFetchAssetCallback = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1((t0: String) => failure(t0).runNow()), success = js.Any.fromFunction2((t0: String, t1: Boolean) => (success(t0, t1)).runNow()))
    __obj.asInstanceOf[ATVSecureKeyFetchAssetCallback]
  }
  
  extension [Self <: ATVSecureKeyFetchAssetCallback](x: Self) {
    
    inline def setFailure(value: String => Callback): Self = StObject.set(x, "failure", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSuccess(value: (String, Boolean) => Callback): Self = StObject.set(x, "success", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
