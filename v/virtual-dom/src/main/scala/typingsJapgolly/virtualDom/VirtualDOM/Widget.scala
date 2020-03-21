package typingsJapgolly.virtualDom.VirtualDOM

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Widget extends VTree {
  var `type`: String
  def destroy(node: Element): Unit
   // 'Widget'
  def init(): Element
  def update(previous: Widget, domNode: Element): Unit
}

object Widget {
  @scala.inline
  def apply(
    destroy: Element => Callback,
    init: CallbackTo[Element],
    `type`: String,
    update: (Widget, Element) => Callback
  ): Widget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => destroy(t0).runNow()))
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: typingsJapgolly.virtualDom.VirtualDOM.Widget, t1: org.scalajs.dom.raw.Element) => update(t0, t1).runNow()))
    __obj.asInstanceOf[Widget]
  }
}

