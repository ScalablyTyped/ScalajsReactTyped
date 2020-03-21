package typingsJapgolly.elementResizeDetector.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdHandlerProps extends js.Object {
  def get(element: HTMLElement, readonly: Boolean): String
  def set(element: HTMLElement): String
}

object IdHandlerProps {
  @scala.inline
  def apply(get: (HTMLElement, Boolean) => CallbackTo[String], set: HTMLElement => CallbackTo[String]): IdHandlerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: scala.Boolean) => get(t0, t1).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => set(t0).runNow()))
    __obj.asInstanceOf[IdHandlerProps]
  }
}

