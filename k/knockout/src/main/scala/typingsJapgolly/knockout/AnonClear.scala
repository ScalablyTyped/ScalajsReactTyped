package typingsJapgolly.knockout

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClear extends js.Object {
  def clear(node: Node): Boolean
  def get(node: Node, key: String): js.Any
  def getAll(node: Node, createIfNotFound: Boolean): js.Any
  def set(node: Node, key: String, value: js.Any): Unit
}

object AnonClear {
  @scala.inline
  def apply(
    clear: Node => CallbackTo[Boolean],
    get: (Node, String) => CallbackTo[js.Any],
    getAll: (Node, Boolean) => CallbackTo[js.Any],
    set: (Node, String, js.Any) => Callback
  ): AnonClear = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Node) => clear(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Node, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("getAll")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Node, t1: scala.Boolean) => getAll(t0, t1).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.Node, t1: java.lang.String, t2: js.Any) => set(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonClear]
  }
}

