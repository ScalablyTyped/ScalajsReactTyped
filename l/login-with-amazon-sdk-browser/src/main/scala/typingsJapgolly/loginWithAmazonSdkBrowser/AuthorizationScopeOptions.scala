package typingsJapgolly.loginWithAmazonSdkBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Accepted values for `scope` member of `authorize` options.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.profile
  - typingsJapgolly.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.profileColonuser_id
  - typingsJapgolly.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.postal_code
*/
trait AuthorizationScopeOptions extends js.Object

object AuthorizationScopeOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def postal_code: typingsJapgolly.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.postal_code = this.cast("postal_code")
  @scala.inline
  def profile: typingsJapgolly.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.profile = this.cast("profile")
  @scala.inline
  def profileColonuser_id: typingsJapgolly.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserStrings.profileColonuser_id = this.cast("profile:user_id")
}

