package typingsJapgolly.jqueryCycle2.JQueryCycle2

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transition extends js.Object {
  def before(opts: Options, curr: Element, next: Element, fwd: Boolean): Unit
}

object Transition {
  @scala.inline
  def apply(before: (Options, Element, Element, Boolean) => Callback): Transition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("before")(js.Any.fromFunction4((t0: typingsJapgolly.jqueryCycle2.JQueryCycle2.Options, t1: org.scalajs.dom.raw.Element, t2: org.scalajs.dom.raw.Element, t3: scala.Boolean) => before(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Transition]
  }
}

