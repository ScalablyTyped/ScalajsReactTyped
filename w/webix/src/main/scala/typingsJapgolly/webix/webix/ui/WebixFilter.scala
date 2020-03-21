package typingsJapgolly.webix.webix.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebixFilter extends js.Object {
  def getValue(node: HTMLElement): js.Any
  def refresh(master: baseview, node: HTMLElement, value: js.Any): Unit
  def render(master: baseview, config: StringDictionary[js.Any]): String
  def setValue(node: HTMLElement, value: js.Any): js.Any
}

object WebixFilter {
  @scala.inline
  def apply(
    getValue: HTMLElement => CallbackTo[js.Any],
    refresh: (baseview, HTMLElement, js.Any) => Callback,
    render: (baseview, StringDictionary[js.Any]) => CallbackTo[String],
    setValue: (HTMLElement, js.Any) => CallbackTo[js.Any]
  ): WebixFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => getValue(t0).runNow()))
    __obj.updateDynamic("refresh")(js.Any.fromFunction3((t0: typingsJapgolly.webix.webix.ui.baseview, t1: org.scalajs.dom.raw.HTMLElement, t2: js.Any) => refresh(t0, t1, t2).runNow()))
    __obj.updateDynamic("render")(js.Any.fromFunction2((t0: typingsJapgolly.webix.webix.ui.baseview, t1: org.scalablytyped.runtime.StringDictionary[js.Any]) => render(t0, t1).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: js.Any) => setValue(t0, t1).runNow()))
    __obj.asInstanceOf[WebixFilter]
  }
}

