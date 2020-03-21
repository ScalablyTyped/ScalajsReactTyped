package typingsJapgolly.selectorSet.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectorSetIndex extends js.Object {
  var name: String
  def element(el: Element): js.Array[String] | Unit
  def selector(selector: String): String | Unit
}

object ISelectorSetIndex {
  @scala.inline
  def apply(
    element: Element => CallbackTo[js.Array[String] | Unit],
    name: String,
    selector: String => CallbackTo[String | Unit]
  ): ISelectorSetIndex = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("element")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => element(t0).runNow()))
    __obj.updateDynamic("selector")(js.Any.fromFunction1((t0: java.lang.String) => selector(t0).runNow()))
    __obj.asInstanceOf[ISelectorSetIndex]
  }
}

