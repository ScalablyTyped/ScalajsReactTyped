package typingsJapgolly.evernote

import typingsJapgolly.evernote.mod.Types.Timestamp
import typingsJapgolly.evernote.mod.Types.User
import typingsJapgolly.evernote.mod.UserStore.PublicUserInfo
import typingsJapgolly.evernote.mod.UserStore.UserUrls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthenticationToken extends js.Object {
  var authenticationToken: js.UndefOr[String] = js.undefined
  var currentTime: js.UndefOr[Timestamp] = js.undefined
  var expiration: js.UndefOr[Timestamp] = js.undefined
  var noteStoreUrl: js.UndefOr[String] = js.undefined
  var publicUserInfo: js.UndefOr[PublicUserInfo] = js.undefined
  var secondFactorDeliveryHint: js.UndefOr[String] = js.undefined
  var secondFactorRequired: js.UndefOr[Boolean] = js.undefined
  var urls: js.UndefOr[UserUrls] = js.undefined
  var user: js.UndefOr[User] = js.undefined
  var webApiUrlPrefix: js.UndefOr[String] = js.undefined
}

object AnonAuthenticationToken {
  @scala.inline
  def apply(
    authenticationToken: String = null,
    currentTime: Int | Double = null,
    expiration: Int | Double = null,
    noteStoreUrl: String = null,
    publicUserInfo: PublicUserInfo = null,
    secondFactorDeliveryHint: String = null,
    secondFactorRequired: js.UndefOr[Boolean] = js.undefined,
    urls: UserUrls = null,
    user: User = null,
    webApiUrlPrefix: String = null
  ): AnonAuthenticationToken = {
    val __obj = js.Dynamic.literal()
    if (authenticationToken != null) __obj.updateDynamic("authenticationToken")(authenticationToken.asInstanceOf[js.Any])
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (noteStoreUrl != null) __obj.updateDynamic("noteStoreUrl")(noteStoreUrl.asInstanceOf[js.Any])
    if (publicUserInfo != null) __obj.updateDynamic("publicUserInfo")(publicUserInfo.asInstanceOf[js.Any])
    if (secondFactorDeliveryHint != null) __obj.updateDynamic("secondFactorDeliveryHint")(secondFactorDeliveryHint.asInstanceOf[js.Any])
    if (!js.isUndefined(secondFactorRequired)) __obj.updateDynamic("secondFactorRequired")(secondFactorRequired.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (webApiUrlPrefix != null) __obj.updateDynamic("webApiUrlPrefix")(webApiUrlPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthenticationToken]
  }
}

