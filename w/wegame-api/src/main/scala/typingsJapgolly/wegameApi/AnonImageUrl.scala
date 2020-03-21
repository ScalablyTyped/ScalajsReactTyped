package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.wegameApiStrings.add
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImageUrl extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrCode, Unit]] = js.undefined
  /**
    * 分享图片地址，详见 wx.shareMessageToFriend 同名参数（需要配置模板规则）
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * 分享图片 ID，详见 wx.shareMessageToFriend 同名参数（需要配置模板规则）
    */
  var imageUrlId: js.UndefOr[String] = js.undefined
  /**
    * 需要修改的数据的 key，目前可以为 '1' - '50'
    */
  var key: String
  /**
    * 需要修改的数值，目前只能为 1
    */
  var opNum: Double
  /**
    * 修改类型
    */
  var operation: add
  /**
    * 是否静默修改（不弹框），静默修改需要用户通过快捷分享消息卡片进入才有效，代表分享反馈操作，无需填写 toUser，直接修改分享者与被分享者交互数据
    * 默认值false
    */
  var quiet: js.UndefOr[Boolean] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 分享标题，如果设置了这个值，则在交互成功后自动询问用户是否分享给好友（需要配置模板规则）
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * 目标好友的 openId
    */
  var toUser: js.UndefOr[String] = js.undefined
}

object AnonImageUrl {
  @scala.inline
  def apply(
    key: String,
    opNum: Double,
    operation: add,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: /* res */ AnonErrCode => Callback = null,
    imageUrl: String = null,
    imageUrlId: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    success: js.UndefOr[Callback] = js.undefined,
    title: String = null,
    toUser: String = null
  ): AnonImageUrl = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], opNum = opNum.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonErrCode) => fail(t0).runNow()))
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (imageUrlId != null) __obj.updateDynamic("imageUrlId")(imageUrlId.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (toUser != null) __obj.updateDynamic("toUser")(toUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImageUrl]
  }
}

