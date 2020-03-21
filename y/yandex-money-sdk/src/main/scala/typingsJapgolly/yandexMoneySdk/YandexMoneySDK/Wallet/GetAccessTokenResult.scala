package typingsJapgolly.yandexMoneySdk.YandexMoneySDK.Wallet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccessTokenResult extends js.Object {
  var access_token: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
}

object GetAccessTokenResult {
  @scala.inline
  def apply(access_token: String = null, error: String = null): GetAccessTokenResult = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessTokenResult]
  }
}

