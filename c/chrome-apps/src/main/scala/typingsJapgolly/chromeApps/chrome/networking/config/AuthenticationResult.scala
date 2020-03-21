package typingsJapgolly.chromeApps.chrome.networking.config

import typingsJapgolly.chromeApps.chromeAppsStrings.failed_
import typingsJapgolly.chromeApps.chromeAppsStrings.rejected
import typingsJapgolly.chromeApps.chromeAppsStrings.succeeded
import typingsJapgolly.chromeApps.chromeAppsStrings.unhandled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument to finishAuthentication indicating the result of the captive portal authentication attempt.
  * **'unhandled':** - The extension does not handle this network or captive portal (e.g. server end-point not found or not compatible).
  * **'succeeded':** - The extension handled this network and authenticated successfully.
  * **'rejected':** - The extension handled this network, tried to authenticate, however was rejected by the server.
  * **'failed':** - The extension handled this network, tried to authenticate, however failed due to an unspecified error.
  */
@JSGlobal("chrome.networking.config.AuthenticationResult")
@js.native
object AuthenticationResult extends js.Object {
  var FAILED: failed_ = js.native
  var REJECTED: rejected = js.native
  var SUCCEEDED: succeeded = js.native
  var UNHANDLED: unhandled = js.native
}

