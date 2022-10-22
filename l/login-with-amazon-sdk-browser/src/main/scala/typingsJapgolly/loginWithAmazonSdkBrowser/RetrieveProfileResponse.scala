package typingsJapgolly.loginWithAmazonSdkBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.loginWithAmazonSdkBrowser.RetrieveProfileResponseError
  - typingsJapgolly.loginWithAmazonSdkBrowser.RetrieveProfileResponseSuccess
*/
trait RetrieveProfileResponse extends StObject
object RetrieveProfileResponse {
  
  inline def RetrieveProfileResponseError(error: String): typingsJapgolly.loginWithAmazonSdkBrowser.RetrieveProfileResponseError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = false)
    __obj.asInstanceOf[typingsJapgolly.loginWithAmazonSdkBrowser.RetrieveProfileResponseError]
  }
  
  inline def RetrieveProfileResponseSuccess(profile: UserProfile): typingsJapgolly.loginWithAmazonSdkBrowser.RetrieveProfileResponseSuccess = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], success = true)
    __obj.asInstanceOf[typingsJapgolly.loginWithAmazonSdkBrowser.RetrieveProfileResponseSuccess]
  }
}
