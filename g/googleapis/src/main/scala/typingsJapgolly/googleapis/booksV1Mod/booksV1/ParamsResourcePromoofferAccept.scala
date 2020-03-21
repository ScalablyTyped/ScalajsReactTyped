package typingsJapgolly.googleapis.booksV1Mod.booksV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePromoofferAccept extends StandardParameters {
  /**
    * device android_id
    */
  var androidId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * device device
    */
  var device: js.UndefOr[String] = js.native
  /**
    * device manufacturer
    */
  var manufacturer: js.UndefOr[String] = js.native
  /**
    * device model
    */
  var model: js.UndefOr[String] = js.native
  /**
    *
    */
  var offerId: js.UndefOr[String] = js.native
  /**
    * device product
    */
  var product: js.UndefOr[String] = js.native
  /**
    * device serial
    */
  var serial: js.UndefOr[String] = js.native
  /**
    * Volume id to exercise the offer
    */
  var volumeId: js.UndefOr[String] = js.native
}

object ParamsResourcePromoofferAccept {
  @scala.inline
  def apply(
    alt: String = null,
    androidId: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    device: String = null,
    fields: String = null,
    key: String = null,
    manufacturer: String = null,
    model: String = null,
    oauth_token: String = null,
    offerId: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    product: String = null,
    quotaUser: String = null,
    serial: String = null,
    userIp: String = null,
    volumeId: String = null
  ): ParamsResourcePromoofferAccept = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (androidId != null) __obj.updateDynamic("androidId")(androidId.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (offerId != null) __obj.updateDynamic("offerId")(offerId.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (serial != null) __obj.updateDynamic("serial")(serial.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourcePromoofferAccept]
  }
}

