package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.aliAppStrings.ADDRESSBOOK
import typingsJapgolly.aliApp.aliAppStrings.BACKGROUNDER
import typingsJapgolly.aliApp.aliAppStrings.CAMERA
import typingsJapgolly.aliApp.aliAppStrings.LBS
import typingsJapgolly.aliApp.aliAppStrings.LBSSERVICE
import typingsJapgolly.aliApp.aliAppStrings.MICROPHONE
import typingsJapgolly.aliApp.aliAppStrings.NOTIFICATION
import typingsJapgolly.aliApp.aliAppStrings.PHOTO
import typingsJapgolly.aliApp.aliAppStrings.SELFSTARTING
import typingsJapgolly.aliApp.aliAppStrings.SHORTCUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 权限引导 https://docs.alipay.com/mini/api/show-auth-guide
trait showAuthGuideOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 引导的权限标识，用于标识该权限类型(如 LBS)
  		 * 支持的 authType 如下：
  		 *
  		 * 权限名称	权限码	支持平台
  		 * 后台保活权限	BACKGROUNDER	Android
  		 * 桌面快捷权限	SHORTCUT	Android
  		 * 麦克风权限	MICROPHONE	iOS
  		 * 通讯录权限	ADDRESSBOOK	iOS
  		 * 相机权限	CAMERA	iOS
  		 * 照片权限	PHOTO	iOS
  		 * push通知栏权限	NOTIFICATION	iOS
  		 * 自启动权限	SELFSTARTING	Android
  		 * lbs总开关	LBSSERVICE	iOS
  		 * lbs开关(app)	LBS	iOS
  		 */
  var authType: BACKGROUNDER | SHORTCUT | MICROPHONE | ADDRESSBOOK | CAMERA | PHOTO | NOTIFICATION | SELFSTARTING | LBSSERVICE | LBS
}

object showAuthGuideOptions {
  @scala.inline
  def apply(
    authType: BACKGROUNDER | SHORTCUT | MICROPHONE | ADDRESSBOOK | CAMERA | PHOTO | NOTIFICATION | SELFSTARTING | LBSSERVICE | LBS,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): showAuthGuideOptions = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[showAuthGuideOptions]
  }
}

