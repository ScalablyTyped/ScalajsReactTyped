package typingsJapgolly.reactJss.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLStyleElement
import typingsJapgolly.jss.mod.Jss
import typingsJapgolly.jss.mod.Rule
import typingsJapgolly.jss.mod.StyleSheet
import typingsJapgolly.theming.mod.Theming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStylesOptions extends BaseOptions {
  var injectTheme: js.UndefOr[Boolean] = js.undefined
  var jss: js.UndefOr[Jss] = js.undefined
}

object WithStylesOptions {
  @scala.inline
  def apply(
    classNamePrefix: String = null,
    element: HTMLStyleElement = null,
    generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => CallbackTo[String] = null,
    index: Int | Double = null,
    injectTheme: js.UndefOr[Boolean] = js.undefined,
    jss: Jss = null,
    link: js.UndefOr[Boolean] = js.undefined,
    media: String = null,
    meta: String = null,
    theming: Theming[js.Object] = null
  ): WithStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (generateId != null) __obj.updateDynamic("generateId")(js.Any.fromFunction2((t0: /* rule */ typingsJapgolly.jss.mod.Rule, t1: /* sheet */ js.UndefOr[typingsJapgolly.jss.mod.StyleSheet[java.lang.String]]) => generateId(t0, t1).runNow()))
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(injectTheme)) __obj.updateDynamic("injectTheme")(injectTheme.asInstanceOf[js.Any])
    if (jss != null) __obj.updateDynamic("jss")(jss.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (theming != null) __obj.updateDynamic("theming")(theming.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStylesOptions]
  }
}

