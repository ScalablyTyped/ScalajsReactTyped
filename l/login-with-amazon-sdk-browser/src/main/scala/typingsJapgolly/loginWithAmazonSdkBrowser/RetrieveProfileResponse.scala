package typingsJapgolly.loginWithAmazonSdkBrowser

import typingsJapgolly.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserBooleans.`false`
import typingsJapgolly.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.loginWithAmazonSdkBrowser.RetrieveProfileResponseError
  - typingsJapgolly.loginWithAmazonSdkBrowser.RetrieveProfileResponseSuccess
*/
trait RetrieveProfileResponse extends js.Object

object RetrieveProfileResponse {
  @scala.inline
  def RetrieveProfileResponseError(error: String, success: `false`): RetrieveProfileResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RetrieveProfileResponse]
  }
  @scala.inline
  def RetrieveProfileResponseSuccess(profile: UserProfile, success: `true`): RetrieveProfileResponse = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RetrieveProfileResponse]
  }
}

