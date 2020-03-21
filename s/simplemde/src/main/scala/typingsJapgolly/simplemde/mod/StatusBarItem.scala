package typingsJapgolly.simplemde.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBarItem extends js.Object {
  var className: String
  def defaultValue(element: HTMLElement): Unit
  def onUpdate(element: HTMLElement): Unit
}

object StatusBarItem {
  @scala.inline
  def apply(className: String, defaultValue: HTMLElement => Callback, onUpdate: HTMLElement => Callback): StatusBarItem = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.updateDynamic("defaultValue")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => defaultValue(t0).runNow()))
    __obj.updateDynamic("onUpdate")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => onUpdate(t0).runNow()))
    __obj.asInstanceOf[StatusBarItem]
  }
}

