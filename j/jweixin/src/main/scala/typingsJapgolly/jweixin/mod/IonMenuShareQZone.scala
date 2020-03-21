package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonMenuShareQZone extends BaseParams {
   // 分享标题
  var desc: String
   // 分享链接
  var imgUrl: String
   // 分享描述
  var link: String
  var title: String
  // 用户取消分享后执行的回调函数
  def cancel(): Unit
   // 分享图标
  // 用户确认分享后执行的回调函数
  @JSName("success")
  def success_MIonMenuShareQZone(): Unit
}

object IonMenuShareQZone {
  @scala.inline
  def apply(
    cancel: Callback,
    desc: String,
    imgUrl: String,
    link: String,
    success: Callback,
    title: String,
    complete: /* repeated */ js.Any => Callback = null,
    fail: /* repeated */ js.Any => Callback = null
  ): IonMenuShareQZone = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], imgUrl = imgUrl.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("success")(success.toJsFn)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[IonMenuShareQZone]
  }
}

