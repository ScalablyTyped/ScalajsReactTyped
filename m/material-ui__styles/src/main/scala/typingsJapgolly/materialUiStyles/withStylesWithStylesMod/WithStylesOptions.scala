package typingsJapgolly.materialUiStyles.withStylesWithStylesMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLStyleElement
import typingsJapgolly.jss.mod.Rule
import typingsJapgolly.jss.mod.StyleSheet
import typingsJapgolly.jss.mod.StyleSheetFactoryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStylesOptions[Theme] extends StyleSheetFactoryOptions {
  var defaultTheme: js.UndefOr[Theme] = js.undefined
  var flip: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var withTheme: js.UndefOr[Boolean] = js.undefined
}

object WithStylesOptions {
  @scala.inline
  def apply[Theme](
    classNamePrefix: String = null,
    defaultTheme: Theme = null,
    element: HTMLStyleElement = null,
    flip: js.UndefOr[Boolean] = js.undefined,
    generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => CallbackTo[String] = null,
    index: Int | Double = null,
    link: js.UndefOr[Boolean] = js.undefined,
    media: String = null,
    meta: String = null,
    name: String = null,
    withTheme: js.UndefOr[Boolean] = js.undefined
  ): WithStylesOptions[Theme] = {
    val __obj = js.Dynamic.literal()
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix.asInstanceOf[js.Any])
    if (defaultTheme != null) __obj.updateDynamic("defaultTheme")(defaultTheme.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (generateId != null) __obj.updateDynamic("generateId")(js.Any.fromFunction2((t0: /* rule */ typingsJapgolly.jss.mod.Rule, t1: /* sheet */ js.UndefOr[typingsJapgolly.jss.mod.StyleSheet[java.lang.String]]) => generateId(t0, t1).runNow()))
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(withTheme)) __obj.updateDynamic("withTheme")(withTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStylesOptions[Theme]]
  }
}

