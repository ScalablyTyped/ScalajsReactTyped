package typingsJapgolly.elementResizeDetector.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Erd extends js.Object {
  def listenTo(element: HTMLElement, callback: js.Function1[/* elem */ HTMLElement, Unit]): Unit
  def removeAllListeners(element: HTMLElement): Unit
  def removeListener(element: HTMLElement, callback: js.Function1[/* elem */ HTMLElement, Unit]): Unit
  def uninstall(element: HTMLElement): Unit
}

object Erd {
  @scala.inline
  def apply(
    listenTo: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Callback,
    removeAllListeners: HTMLElement => Callback,
    removeListener: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Callback,
    uninstall: HTMLElement => Callback
  ): Erd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("listenTo")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: js.Function1[/* elem */ org.scalajs.dom.raw.HTMLElement, scala.Unit]) => listenTo(t0, t1).runNow()))
    __obj.updateDynamic("removeAllListeners")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => removeAllListeners(t0).runNow()))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: js.Function1[/* elem */ org.scalajs.dom.raw.HTMLElement, scala.Unit]) => removeListener(t0, t1).runNow()))
    __obj.updateDynamic("uninstall")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => uninstall(t0).runNow()))
    __obj.asInstanceOf[Erd]
  }
}

