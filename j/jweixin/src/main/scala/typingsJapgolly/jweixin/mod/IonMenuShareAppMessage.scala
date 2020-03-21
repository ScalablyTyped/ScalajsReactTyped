package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jweixin.jweixinStrings.link
import typingsJapgolly.jweixin.jweixinStrings.music
import typingsJapgolly.jweixin.jweixinStrings.video或link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonMenuShareAppMessage extends BaseParams {
  		// 分享类型,music、video或link，不填默认为link
  var dataUrl: js.UndefOr[String] = js.undefined
  	// 分享标题
  var desc: String
  	// 分享链接
  var imgUrl: String
  	// 分享描述
  var link: String
  var title: String
  	// 分享图标
  var `type`: js.UndefOr[music | video或link | link] = js.undefined
  // 用户取消分享后执行的回调函数
  def cancel(): Unit
   // 如果type是music或video，则要提供数据链接，默认为空
  // 用户确认分享后执行的回调函数
  @JSName("success")
  def success_MIonMenuShareAppMessage(): Unit
}

object IonMenuShareAppMessage {
  @scala.inline
  def apply(
    cancel: Callback,
    desc: String,
    imgUrl: String,
    link: String,
    success: Callback,
    title: String,
    complete: /* repeated */ js.Any => Callback = null,
    dataUrl: String = null,
    fail: /* repeated */ js.Any => Callback = null,
    `type`: music | video或link | link = null
  ): IonMenuShareAppMessage = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], imgUrl = imgUrl.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("success")(success.toJsFn)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (dataUrl != null) __obj.updateDynamic("dataUrl")(dataUrl.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonMenuShareAppMessage]
  }
}

