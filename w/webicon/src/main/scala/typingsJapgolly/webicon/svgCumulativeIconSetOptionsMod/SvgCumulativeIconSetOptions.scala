package typingsJapgolly.webicon.svgCumulativeIconSetOptionsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webicon.iconSetOptionsMod.IconSetOptions
import typingsJapgolly.webicon.urlConfigMod.UrlConfig
import typingsJapgolly.webicon.webiconBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgCumulativeIconSetOptions extends IconSetOptions {
  @JSName("cumulative")
  var cumulative_SvgCumulativeIconSetOptions: `true`
  /**
    * The amount of miliseconds to wait before downloading the icons.
    */
  var waitDuration: js.UndefOr[Double] = js.undefined
}

object SvgCumulativeIconSetOptions {
  @scala.inline
  def apply(
    cumulative: `true`,
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => CallbackTo[String] = null,
    iconSize: Int | Double = null,
    size: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any = null,
    svgIconSize: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any = null,
    uri: /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any = null,
    url: UrlConfig[scala.Nothing] = null,
    viewBox: String = null,
    waitDuration: Int | Double = null
  ): SvgCumulativeIconSetOptions = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any])
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* params */ js.Array[java.lang.String]) => iconIdParser(t0, t1).runNow()))
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (svgIconSize != null) __obj.updateDynamic("svgIconSize")(svgIconSize.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (waitDuration != null) __obj.updateDynamic("waitDuration")(waitDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgCumulativeIconSetOptions]
  }
}

