package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 消息分享对象
  * @deprecated
  */
trait SharedAppMessage extends ShareTimelineConfig {
  /**
    * 如果 type 是 music 或 video，则要提供数据链接，默认为空
    */
  var dataUrl: js.UndefOr[String] = js.undefined
  /**
    * 分享描述
    */
  var desc: String
  /**
    * 分享类型, music、video 或 link，不填默认为 link
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SharedAppMessage {
  @scala.inline
  def apply(
    desc: String,
    link: String,
    title: String,
    cancel: js.UndefOr[Callback] = js.undefined,
    complete: /* res */ js.UndefOr[js.Any] => Callback = null,
    dataUrl: String = null,
    fail: /* error */ js.UndefOr[js.Any] => Callback = null,
    imgUrl: String = null,
    success: /* res */ js.UndefOr[js.Any] => Callback = null,
    trigger: js.UndefOr[Callback] = js.undefined,
    `type`: String = null
  ): SharedAppMessage = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => complete(t0).runNow()))
    if (dataUrl != null) __obj.updateDynamic("dataUrl")(dataUrl.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => fail(t0).runNow()))
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => success(t0).runNow()))
    trigger.foreach(p => __obj.updateDynamic("trigger")(p.toJsFn))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedAppMessage]
  }
}

