package typingsJapgolly.winrtUwp.Windows.Security.Authentication.Web.Provider

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a request token operation. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderRequestTokenOperation")
@js.native
abstract class WebAccountProviderRequestTokenOperation () extends js.Object {
  /** Gets or sets the cache expiration time. */
  var cacheExpirationTime: js.Date = js.native
  /** Gets the kind of web account provider operation. */
  var kind: WebAccountProviderOperationKind = js.native
  /** Gets the web provider token request. */
  var providerRequest: WebProviderTokenRequest = js.native
  /** Gets the web provider token responses. */
  var providerResponses: IVector[WebProviderTokenResponse] = js.native
  /** Informs the activating app that the operation completed successfully. */
  def reportCompleted(): Unit = js.native
  /**
    * Informs the activating app that the operation encountered an error.
    * @param value The type of error encountered.
    */
  def reportError(value: WebProviderError): Unit = js.native
  /** Informs the activating app that the user cancelled the operation. */
  def reportUserCanceled(): Unit = js.native
}

