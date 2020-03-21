package typingsJapgolly.betterScroll.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfinityOption extends js.Object {
  def createTombstone(): Element
  def fetch(count: Double): Unit
  def render(item: js.Any, div: Element): Element
}

object InfinityOption {
  @scala.inline
  def apply(
    createTombstone: CallbackTo[Element],
    fetch: Double => Callback,
    render: (js.Any, Element) => CallbackTo[Element]
  ): InfinityOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createTombstone")(createTombstone.toJsFn)
    __obj.updateDynamic("fetch")(js.Any.fromFunction1((t0: scala.Double) => fetch(t0).runNow()))
    __obj.updateDynamic("render")(js.Any.fromFunction2((t0: js.Any, t1: org.scalajs.dom.raw.Element) => render(t0, t1).runNow()))
    __obj.asInstanceOf[InfinityOption]
  }
}

