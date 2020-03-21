package typingsJapgolly.resizeObserverPolyfill.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeObserver extends js.Object {
  def disconnect(): Unit
  def observe(target: Element): Unit
  def unobserve(target: Element): Unit
}

object ResizeObserver {
  @scala.inline
  def apply(disconnect: Callback, observe: Element => Callback, unobserve: Element => Callback): ResizeObserver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disconnect")(disconnect.toJsFn)
    __obj.updateDynamic("observe")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => observe(t0).runNow()))
    __obj.updateDynamic("unobserve")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => unobserve(t0).runNow()))
    __obj.asInstanceOf[ResizeObserver]
  }
}

