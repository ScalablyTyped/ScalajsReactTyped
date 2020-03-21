package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * “分享到朋友圈”及“分享到QQ空间”按钮的分享内容
  */
trait ShareToTimelineConfig extends WxBaseMenuRequestConfig {
  /**
    * 分享图标
    */
  var imgUrl: js.UndefOr[String] = js.undefined
  /**
    * 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
    */
  var link: js.UndefOr[String] = js.undefined
  @JSName("success")
  var success_ShareToTimelineConfig: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 分享标题
    */
  var title: js.UndefOr[String] = js.undefined
}

object ShareToTimelineConfig {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Callback] = js.undefined,
    complete: /* res */ js.UndefOr[js.Any] => Callback = null,
    fail: /* error */ js.UndefOr[js.Any] => Callback = null,
    imgUrl: String = null,
    link: String = null,
    success: js.UndefOr[Callback] = js.undefined,
    title: String = null,
    trigger: js.UndefOr[Callback] = js.undefined
  ): ShareToTimelineConfig = {
    val __obj = js.Dynamic.literal()
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => fail(t0).runNow()))
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    trigger.foreach(p => __obj.updateDynamic("trigger")(p.toJsFn))
    __obj.asInstanceOf[ShareToTimelineConfig]
  }
}

