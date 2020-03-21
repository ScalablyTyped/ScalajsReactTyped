package typingsJapgolly.wordpressDom.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.ParentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tabbable extends Focusable {
  /**
    * Returns `true` if the specified element is tabbable, or `false` otherwise.
    *
    * @param element - Element to test.
    */
  def isTabbableIndex(element: Element): Boolean
}

object Tabbable {
  @scala.inline
  def apply(find: ParentNode => CallbackTo[js.Array[Element]], isTabbableIndex: Element => CallbackTo[Boolean]): Tabbable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("find")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.ParentNode) => find(t0).runNow()))
    __obj.updateDynamic("isTabbableIndex")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => isTabbableIndex(t0).runNow()))
    __obj.asInstanceOf[Tabbable]
  }
}

