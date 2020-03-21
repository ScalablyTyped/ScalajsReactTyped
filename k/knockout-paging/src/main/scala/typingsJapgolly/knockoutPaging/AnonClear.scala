package typingsJapgolly.knockoutPaging

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClear extends js.Object {
  def clear(node: Element): Boolean
  def get(node: Element, key: String): js.Any
  def getAll(node: Element, createIfNotFound: Boolean): js.Any
  def set(node: Element, key: String, value: js.Any): Unit
}

object AnonClear {
  @scala.inline
  def apply(
    clear: Element => CallbackTo[Boolean],
    get: (Element, String) => CallbackTo[js.Any],
    getAll: (Element, Boolean) => CallbackTo[js.Any],
    set: (Element, String, js.Any) => Callback
  ): AnonClear = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => clear(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: java.lang.String) => get(t0, t1).runNow()))
    __obj.updateDynamic("getAll")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: scala.Boolean) => getAll(t0, t1).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.Element, t1: java.lang.String, t2: js.Any) => set(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonClear]
  }
}

