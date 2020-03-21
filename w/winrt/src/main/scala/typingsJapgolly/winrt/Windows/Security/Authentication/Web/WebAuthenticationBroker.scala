package typingsJapgolly.winrt.Windows.Security.Authentication.Web

import typingsJapgolly.winrt.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker")
@js.native
class WebAuthenticationBroker () extends js.Object

/* static members */
@JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker")
@js.native
object WebAuthenticationBroker extends js.Object {
  def authenticateAndContinue(requestUri: Uri): Unit = js.native
  def authenticateAndContinue(requestUri: Uri, callbackUri: Uri): Unit = js.native
  def authenticateAndContinue(requestUri: Uri, callbackUri: Uri, continuationData: ValueSet, options: WebAuthenticationOptions): Unit = js.native
  def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri): IAsyncOperation[WebAuthenticationResult] = js.native
  def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri, callbackUri: Uri): IAsyncOperation[WebAuthenticationResult] = js.native
  def getCurrentApplicationCallbackUri(): Uri = js.native
}

