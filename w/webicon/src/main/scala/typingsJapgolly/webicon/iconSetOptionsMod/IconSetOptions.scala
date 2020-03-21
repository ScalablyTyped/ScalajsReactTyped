package typingsJapgolly.webicon.iconSetOptionsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webicon.svgIconMod.SvgIcon
import typingsJapgolly.webicon.urlConfigMod.UrlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.webicon.iconMod.Icon because Already inherited
- typingsJapgolly.webicon.sizeableMod.Sizeable because Already inherited
- typingsJapgolly.webicon.downloadableMod.Downloadable because var conflicts: iconIdParser. Inlined url, uri
- typingsJapgolly.webicon.sizeableOptionsMod.SizeableOptions because var conflicts: iconSize. Inlined size, svgIconSize */ trait IconSetOptions extends SvgIcon {
  /**
    * A value indicating whether the icons are loaded separately.
    */
  var cumulative: js.UndefOr[Boolean] = js.undefined
  /**
    * An alias of the `iconSize`-property.
    */
  var size: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
  ] = js.undefined
  /**
    * An alias of the `iconSize`-property.
    */
  var svgIconSize: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any
  ] = js.undefined
  /**
    * An alias of the `url`-property.
    */
  var uri: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any
  ] = js.undefined
  /**
    * The url to load the source from.
    */
  var url: js.UndefOr[UrlConfig[scala.Nothing]] = js.undefined
}

object IconSetOptions {
  @scala.inline
  def apply(
    cumulative: js.UndefOr[Boolean] = js.undefined,
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => CallbackTo[String] = null,
    iconSize: Int | Double = null,
    size: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any = null,
    svgIconSize: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any = null,
    uri: /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any = null,
    url: UrlConfig[scala.Nothing] = null,
    viewBox: String = null
  ): IconSetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cumulative)) __obj.updateDynamic("cumulative")(cumulative.asInstanceOf[js.Any])
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* params */ js.Array[java.lang.String]) => iconIdParser(t0, t1).runNow()))
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (svgIconSize != null) __obj.updateDynamic("svgIconSize")(svgIconSize.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSetOptions]
  }
}

