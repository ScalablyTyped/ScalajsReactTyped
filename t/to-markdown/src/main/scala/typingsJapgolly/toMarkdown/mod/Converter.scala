package typingsJapgolly.toMarkdown.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Converter extends js.Object {
  var filter: Filter
  def replacement(innerHTML: String, node: HTMLElement): String
}

object Converter {
  @scala.inline
  def apply(filter: Filter, replacement: (String, HTMLElement) => CallbackTo[String]): Converter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.updateDynamic("replacement")(js.Any.fromFunction2((t0: java.lang.String, t1: org.scalajs.dom.raw.HTMLElement) => replacement(t0, t1).runNow()))
    __obj.asInstanceOf[Converter]
  }
}

