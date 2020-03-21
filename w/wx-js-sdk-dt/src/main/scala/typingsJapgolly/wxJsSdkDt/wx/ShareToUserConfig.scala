package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * “分享给朋友”及“分享到QQ”按钮的分享内容
  */
trait ShareToUserConfig extends WxBaseMenuRequestConfig {
  /**
    * 分享描述
    */
  var desc: js.UndefOr[String] = js.undefined
  /**
    * 分享图标
    */
  var imgUrl: js.UndefOr[String] = js.undefined
  /**
    * 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
    */
  var link: js.UndefOr[String] = js.undefined
  @JSName("success")
  var success_ShareToUserConfig: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 分享标题
    */
  var title: js.UndefOr[String] = js.undefined
}

object ShareToUserConfig {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Callback] = js.undefined,
    complete: /* res */ js.UndefOr[js.Any] => Callback = null,
    desc: String = null,
    fail: /* error */ js.UndefOr[js.Any] => Callback = null,
    imgUrl: String = null,
    link: String = null,
    success: js.UndefOr[Callback] = js.undefined,
    title: String = null,
    trigger: js.UndefOr[Callback] = js.undefined
  ): ShareToUserConfig = {
    val __obj = js.Dynamic.literal()
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => complete(t0).runNow()))
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => fail(t0).runNow()))
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    trigger.foreach(p => __obj.updateDynamic("trigger")(p.toJsFn))
    __obj.asInstanceOf[ShareToUserConfig]
  }
}

