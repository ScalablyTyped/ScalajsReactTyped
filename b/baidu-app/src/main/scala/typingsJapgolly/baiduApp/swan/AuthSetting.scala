package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthSetting extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  @JSName("scope.address")
  var scopeDotaddress: String
  @JSName("scope.invoiceTitle")
  var scopeDotinvoiceTitle: String
  @JSName("scope.record")
  var scopeDotrecord: String
  @JSName("scope.userInfo")
  var scopeDotuserInfo: String
  @JSName("scope.userLocation")
  var scopeDotuserLocation: String
  @JSName("scope.werun")
  var scopeDotwerun: String
  @JSName("scope.writePhotosAlbum")
  var scopeDotwritePhotosAlbum: String
  var success: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, Unit]] = js.undefined
}

object AuthSetting {
  @scala.inline
  def apply(
    scopeDotaddress: String,
    scopeDotinvoiceTitle: String,
    scopeDotrecord: String,
    scopeDotuserInfo: String,
    scopeDotuserLocation: String,
    scopeDotwerun: String,
    scopeDotwritePhotosAlbum: String,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* res */ ErrMsgResponse => Callback = null
  ): AuthSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope.address")(scopeDotaddress.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoiceTitle")(scopeDotinvoiceTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.record")(scopeDotrecord.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userInfo")(scopeDotuserInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userLocation")(scopeDotuserLocation.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.werun")(scopeDotwerun.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.writePhotosAlbum")(scopeDotwritePhotosAlbum.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.swan.ErrMsgResponse) => success(t0).runNow()))
    __obj.asInstanceOf[AuthSetting]
  }
}

