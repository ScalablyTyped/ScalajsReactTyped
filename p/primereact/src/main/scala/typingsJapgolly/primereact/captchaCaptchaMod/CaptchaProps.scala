package typingsJapgolly.primereact.captchaCaptchaMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptchaProps extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var onExpire: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onResponse: js.UndefOr[js.Function1[/* response */ js.Any, Unit]] = js.undefined
  var siteKey: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object CaptchaProps {
  @scala.inline
  def apply(
    id: String = null,
    language: String = null,
    onExpire: js.UndefOr[Callback] = js.undefined,
    onResponse: /* response */ js.Any => Callback = null,
    siteKey: String = null,
    size: String = null,
    tabIndex: Int | Double = null,
    theme: String = null,
    `type`: String = null
  ): CaptchaProps = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    onExpire.foreach(p => __obj.updateDynamic("onExpire")(p.toJsFn))
    if (onResponse != null) __obj.updateDynamic("onResponse")(js.Any.fromFunction1((t0: /* response */ js.Any) => onResponse(t0).runNow()))
    if (siteKey != null) __obj.updateDynamic("siteKey")(siteKey.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptchaProps]
  }
}

