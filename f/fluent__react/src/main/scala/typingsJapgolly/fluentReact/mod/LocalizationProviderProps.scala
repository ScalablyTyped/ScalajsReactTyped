package typingsJapgolly.fluentReact.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import typingsJapgolly.fluentBundle.mod.FluentBundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizationProviderProps extends js.Object {
  var bundles: js.Iterable[FluentBundle]
  var parseMarkup: js.UndefOr[MarkupParser] = js.undefined
}

object LocalizationProviderProps {
  @scala.inline
  def apply(
    bundles: js.Iterable[FluentBundle],
    parseMarkup: /* str */ String => CallbackTo[js.Array[Node]] = null
  ): LocalizationProviderProps = {
    val __obj = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any])
    if (parseMarkup != null) __obj.updateDynamic("parseMarkup")(js.Any.fromFunction1((t0: /* str */ java.lang.String) => parseMarkup(t0).runNow()))
    __obj.asInstanceOf[LocalizationProviderProps]
  }
}

