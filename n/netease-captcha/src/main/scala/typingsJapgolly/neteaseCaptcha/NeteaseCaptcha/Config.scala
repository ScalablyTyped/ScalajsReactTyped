package typingsJapgolly.neteaseCaptcha.NeteaseCaptcha

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.neteaseCaptcha.neteaseCaptchaStrings.`zh-CN`
import typingsJapgolly.neteaseCaptcha.neteaseCaptchaStrings.embed
import typingsJapgolly.neteaseCaptcha.neteaseCaptchaStrings.en
import typingsJapgolly.neteaseCaptcha.neteaseCaptchaStrings.float
import typingsJapgolly.neteaseCaptcha.neteaseCaptchaStrings.http
import typingsJapgolly.neteaseCaptcha.neteaseCaptchaStrings.https
import typingsJapgolly.neteaseCaptcha.neteaseCaptchaStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * Verification code id
    */
  var captchaId: String
  /**
    * Selector string or HTMLElement to render widget into
    */
  var element: String | HTMLElement
  /**
    * Defaults to 'zh-CN'
    */
  var lang: js.UndefOr[`zh-CN` | en] = js.undefined
  /**
    * Defaults to 'float' on desktop, and 'popup' on mobile
    */
  var mode: js.UndefOr[float | embed | popup] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* instance */ Instance, Unit]] = js.undefined
  var onVerify: js.UndefOr[js.Function2[/* error */ js.Any, /* data */ Data, Unit]] = js.undefined
  /**
    * Defaults to page protocol
    */
  var protocol: js.UndefOr[http | https] = js.undefined
  /**
    * Defaults to 'auto'
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    captchaId: String,
    element: String | HTMLElement,
    lang: `zh-CN` | en = null,
    mode: float | embed | popup = null,
    onReady: /* instance */ Instance => Callback = null,
    onVerify: (/* error */ js.Any, /* data */ Data) => Callback = null,
    protocol: http | https = null,
    width: Double | String = null
  ): Config = {
    val __obj = js.Dynamic.literal(captchaId = captchaId.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1((t0: /* instance */ typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.Instance) => onReady(t0).runNow()))
    if (onVerify != null) __obj.updateDynamic("onVerify")(js.Any.fromFunction2((t0: /* error */ js.Any, t1: /* data */ typingsJapgolly.neteaseCaptcha.NeteaseCaptcha.Data) => onVerify(t0, t1).runNow()))
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

