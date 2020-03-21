package typingsJapgolly.webicon.svgIconOptionsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webicon.sizeableOptionsMod.SizeableOptions
import typingsJapgolly.webicon.storeableMod.Storeable
import typingsJapgolly.webicon.urlConfigMod.UrlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.webicon.sizeableMod.Sizeable because Already inherited
- typingsJapgolly.webicon.iconMod.Icon because Already inherited
- typingsJapgolly.webicon.svgIconMod.SvgIcon because var conflicts: iconIdParser, iconSize. Inlined viewBox */ trait SvgIconOptions
  extends Storeable
     with SizeableOptions {
  /**
    * The default viewBox of the icon.
    */
  var viewBox: js.UndefOr[String] = js.undefined
}

object SvgIconOptions {
  @scala.inline
  def apply(
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => CallbackTo[String] = null,
    iconIdResolver: /* id */ String => CallbackTo[String] = null,
    iconSize: Int | Double = null,
    preloadable: js.UndefOr[Boolean] = js.undefined,
    size: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any = null,
    svgIconSize: /* import warning: importer.ImportType#apply Failed type conversion: this['iconSize'] */ js.Any = null,
    uri: /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any = null,
    url: UrlConfig[scala.Nothing] = null,
    viewBox: String = null
  ): SvgIconOptions = {
    val __obj = js.Dynamic.literal()
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* params */ js.Array[java.lang.String]) => iconIdParser(t0, t1).runNow()))
    if (iconIdResolver != null) __obj.updateDynamic("iconIdResolver")(js.Any.fromFunction1((t0: /* id */ java.lang.String) => iconIdResolver(t0).runNow()))
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (!js.isUndefined(preloadable)) __obj.updateDynamic("preloadable")(preloadable.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (svgIconSize != null) __obj.updateDynamic("svgIconSize")(svgIconSize.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgIconOptions]
  }
}

