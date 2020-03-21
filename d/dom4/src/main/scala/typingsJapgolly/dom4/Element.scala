package typingsJapgolly.dom4

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLCollection
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends ParentNode {
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  def closest(selectors: String): Element | Null
  /**
    * Returns true if matching selectors against element’s root yields element, and false otherwise.
    */
  def matches(selectors: String): Boolean
}

object Element {
  @scala.inline
  def apply(
    append: /* repeated */ Node | String => Callback,
    children: HTMLCollection,
    closest: String => CallbackTo[Element | Null],
    matches: String => CallbackTo[Boolean],
    prepend: /* repeated */ Node | String => Callback
  ): Element = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("append")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => append(t0).runNow()))
    __obj.updateDynamic("closest")(js.Any.fromFunction1((t0: java.lang.String) => closest(t0).runNow()))
    __obj.updateDynamic("matches")(js.Any.fromFunction1((t0: java.lang.String) => matches(t0).runNow()))
    __obj.updateDynamic("prepend")(js.Any.fromFunction1((t0: /* repeated */ org.scalajs.dom.raw.Node | java.lang.String) => prepend(t0).runNow()))
    __obj.asInstanceOf[Element]
  }
}

