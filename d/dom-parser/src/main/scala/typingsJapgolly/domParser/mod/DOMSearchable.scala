package typingsJapgolly.domParser.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMSearchable extends js.Object {
  def getElementById(id: String): Node | Null
  def getElementsByClassName(className: String): js.Array[Node] | Null
  def getElementsByName(name: String): js.Array[Node] | Null
  def getElementsByTagName(tagName: String): js.Array[Node] | Null
}

object DOMSearchable {
  @scala.inline
  def apply(
    getElementById: String => CallbackTo[Node | Null],
    getElementsByClassName: String => CallbackTo[js.Array[Node] | Null],
    getElementsByName: String => CallbackTo[js.Array[Node] | Null],
    getElementsByTagName: String => CallbackTo[js.Array[Node] | Null]
  ): DOMSearchable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getElementById")(js.Any.fromFunction1((t0: java.lang.String) => getElementById(t0).runNow()))
    __obj.updateDynamic("getElementsByClassName")(js.Any.fromFunction1((t0: java.lang.String) => getElementsByClassName(t0).runNow()))
    __obj.updateDynamic("getElementsByName")(js.Any.fromFunction1((t0: java.lang.String) => getElementsByName(t0).runNow()))
    __obj.updateDynamic("getElementsByTagName")(js.Any.fromFunction1((t0: java.lang.String) => getElementsByTagName(t0).runNow()))
    __obj.asInstanceOf[DOMSearchable]
  }
}

