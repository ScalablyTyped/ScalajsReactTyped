package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityManagerGetCredentialOptions extends Object {
  /**
    * Error object returned by the server from a previous attempt to fetch the given URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#getCredential)
    */
  var error: js.UndefOr[Error] = js.undefined
  /**
    * If set to *false*, the user will not be shown a dialog before the OAuth popup window is opened.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#getCredential)
    *
    * @default true
    */
  var oAuthPopupConfirmation: js.UndefOr[Boolean] = js.undefined
  /**
    * Token used for a previous unsuccessful attempt to fetch the given URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#getCredential)
    */
  var token: js.UndefOr[String] = js.undefined
}

object IdentityManagerGetCredentialOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    error: Error = null,
    oAuthPopupConfirmation: js.UndefOr[Boolean] = js.undefined,
    token: String = null
  ): IdentityManagerGetCredentialOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(oAuthPopupConfirmation)) __obj.updateDynamic("oAuthPopupConfirmation")(oAuthPopupConfirmation.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityManagerGetCredentialOptions]
  }
}

