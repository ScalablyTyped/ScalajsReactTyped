package typingsJapgolly.lozad.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.std.IntersectionObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer extends js.Object {
  var observer: IntersectionObserver
  def observe(): Unit
  def triggerLoad(element: Element): Unit
}

object Observer {
  @scala.inline
  def apply(observe: Callback, observer: IntersectionObserver, triggerLoad: Element => Callback): Observer = {
    val __obj = js.Dynamic.literal(observer = observer.asInstanceOf[js.Any])
    __obj.updateDynamic("observe")(observe.toJsFn)
    __obj.updateDynamic("triggerLoad")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => triggerLoad(t0).runNow()))
    __obj.asInstanceOf[Observer]
  }
}

