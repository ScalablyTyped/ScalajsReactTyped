package typingsJapgolly.fluentReact.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var l10n: ReactLocalization
  var parseMarkup: MarkupParser
}

object Context {
  @scala.inline
  def apply(l10n: ReactLocalization, parseMarkup: /* str */ String => CallbackTo[js.Array[Node]]): Context = {
    val __obj = js.Dynamic.literal(l10n = l10n.asInstanceOf[js.Any])
    __obj.updateDynamic("parseMarkup")(js.Any.fromFunction1((t0: /* str */ java.lang.String) => parseMarkup(t0).runNow()))
    __obj.asInstanceOf[Context]
  }
}

