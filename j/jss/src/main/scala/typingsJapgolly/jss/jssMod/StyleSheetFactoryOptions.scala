package typingsJapgolly.jss.jssMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheetFactoryOptions extends js.Object {
  var classNamePrefix: js.UndefOr[String] = js.undefined
  var element: js.UndefOr[HTMLStyleElement] = js.undefined
  var generateId: js.UndefOr[GenerateId] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var link: js.UndefOr[Boolean] = js.undefined
  var media: js.UndefOr[String] = js.undefined
  var meta: js.UndefOr[String] = js.undefined
}

object StyleSheetFactoryOptions {
  @scala.inline
  def apply(
    classNamePrefix: String = null,
    element: HTMLStyleElement = null,
    generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => CallbackTo[String] = null,
    index: Int | Double = null,
    link: js.UndefOr[Boolean] = js.undefined,
    media: String = null,
    meta: String = null
  ): StyleSheetFactoryOptions = {
    val __obj = js.Dynamic.literal()
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (generateId != null) __obj.updateDynamic("generateId")(js.Any.fromFunction2((t0: /* rule */ typingsJapgolly.jss.jssMod.Rule, t1: /* sheet */ js.UndefOr[typingsJapgolly.jss.jssMod.StyleSheet[java.lang.String]]) => generateId(t0, t1).runNow()))
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheetFactoryOptions]
  }
}

