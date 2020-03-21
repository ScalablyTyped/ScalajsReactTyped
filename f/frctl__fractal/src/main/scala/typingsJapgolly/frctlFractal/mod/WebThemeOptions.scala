package typingsJapgolly.frctlFractal.mod

import typingsJapgolly.frctlFractal.AnonMount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebThemeOptions extends js.Object {
  var favicon: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var nav: js.UndefOr[js.Array[String]] = js.undefined
  var panels: js.UndefOr[js.Array[String]] = js.undefined
  var rtl: Boolean
  var scripts: js.UndefOr[js.Array[String]] = js.undefined
  var skin: js.UndefOr[String] = js.undefined
  var static: js.UndefOr[AnonMount] = js.undefined
  @JSName("static.mount")
  var staticDotmount: String
  var styles: js.UndefOr[js.Array[String]] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object WebThemeOptions {
  @scala.inline
  def apply(
    rtl: Boolean,
    staticDotmount: String,
    favicon: String = null,
    format: String = null,
    lang: String = null,
    nav: js.Array[String] = null,
    panels: js.Array[String] = null,
    scripts: js.Array[String] = null,
    skin: String = null,
    static: AnonMount = null,
    styles: js.Array[String] = null,
    version: String = null
  ): WebThemeOptions = {
    val __obj = js.Dynamic.literal(rtl = rtl.asInstanceOf[js.Any])
    __obj.updateDynamic("static.mount")(staticDotmount.asInstanceOf[js.Any])
    if (favicon != null) __obj.updateDynamic("favicon")(favicon.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (nav != null) __obj.updateDynamic("nav")(nav.asInstanceOf[js.Any])
    if (panels != null) __obj.updateDynamic("panels")(panels.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebThemeOptions]
  }
}

