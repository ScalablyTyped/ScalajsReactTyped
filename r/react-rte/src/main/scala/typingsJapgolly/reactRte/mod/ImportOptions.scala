package typingsJapgolly.reactRte.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLBodyElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportOptions extends js.Object {
  var customBlockFn: js.UndefOr[CustomBlockFn] = js.undefined
  var customInlineFn: js.UndefOr[CustomInlineFn] = js.undefined
  var elementStyles: js.UndefOr[StringDictionary[String]] = js.undefined
  var parser: js.UndefOr[js.Function1[/* html */ String, HTMLBodyElement]] = js.undefined
}

object ImportOptions {
  @scala.inline
  def apply(
    customBlockFn: /* element */ Element => CallbackTo[js.UndefOr[Null | CustomBlockObject]] = null,
    customInlineFn: (/* element */ Element, /* inlineCreators */ InlineCreators) => CallbackTo[
      js.UndefOr[
        Null | Style | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ js.Any)
      ]
    ] = null,
    elementStyles: StringDictionary[String] = null,
    parser: /* html */ String => CallbackTo[HTMLBodyElement] = null
  ): ImportOptions = {
    val __obj = js.Dynamic.literal()
    if (customBlockFn != null) __obj.updateDynamic("customBlockFn")(js.Any.fromFunction1((t0: /* element */ org.scalajs.dom.raw.Element) => customBlockFn(t0).runNow()))
    if (customInlineFn != null) __obj.updateDynamic("customInlineFn")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element, t1: /* inlineCreators */ typingsJapgolly.reactRte.mod.InlineCreators) => customInlineFn(t0, t1).runNow()))
    if (elementStyles != null) __obj.updateDynamic("elementStyles")(elementStyles.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction1((t0: /* html */ java.lang.String) => parser(t0).runNow()))
    __obj.asInstanceOf[ImportOptions]
  }
}

