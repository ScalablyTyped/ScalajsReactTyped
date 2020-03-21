package typingsJapgolly.d3Selection.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Local_[T] extends js.Object {
  /**
    * Retrieves a local variable stored on the node (or one of its parents).
    *
    * @param node A node element.
    */
  def get(node: Element): js.UndefOr[T]
  /**
    * Deletes the value associated with the given node. Values stored on ancestors are not affected, meaning that child nodes will still see inherited values.
    *
    * This function returns true if there was a value stored directly on the node, and false otherwise.
    *
    * @param node A node element.
    */
  def remove(node: Element): Boolean
  /**
    * Store a value for this local variable. Calling `.get()` on children of this node will also retrieve the variable's value.
    *
    * @param node A node element.
    * @param value Value to store locally
    */
  def set(node: Element, value: T): Element
}

object Local_ {
  @scala.inline
  def apply[T](
    get: Element => CallbackTo[js.UndefOr[T]],
    remove: Element => CallbackTo[Boolean],
    set: (Element, T) => CallbackTo[Element]
  ): Local_[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => get(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => remove(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: T) => set(t0, t1).runNow()))
    __obj.asInstanceOf[Local_[T]]
  }
}

