package typingsJapgolly.webicon.cssIconSetOptionsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webicon.cssClassConfigMod.CssClassConfig
import typingsJapgolly.webicon.iconMod.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssIconSetOptions extends Icon {
  /**
    * An alias of the `className`-property.
    */
  var `class`: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
  ] = js.undefined
  /**
    * Either a text-pattern or a callback which provides a css-classname.
    *
    * The symbols `?` and `%` in the text-pattern are replaced by the icon-id.
    */
  var className: js.UndefOr[CssClassConfig] = js.undefined
  /**
    * An alias of the `className`-property.
    */
  var cssClass: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any
  ] = js.undefined
}

object CssIconSetOptions {
  @scala.inline
  def apply(
    `class`: /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any = null,
    className: CssClassConfig = null,
    cssClass: /* import warning: importer.ImportType#apply Failed type conversion: this['className'] */ js.Any = null,
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => CallbackTo[String] = null
  ): CssIconSetOptions = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* params */ js.Array[java.lang.String]) => iconIdParser(t0, t1).runNow()))
    __obj.asInstanceOf[CssIconSetOptions]
  }
}

