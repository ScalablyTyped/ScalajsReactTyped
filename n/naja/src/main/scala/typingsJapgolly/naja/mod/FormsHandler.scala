package typingsJapgolly.naja.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormsHandler extends js.Object {
  var netteForms: js.Object
  def initForms(element: Element): Unit
  def processForm(event: Event_): Unit
}

object FormsHandler {
  @scala.inline
  def apply(initForms: Element => Callback, netteForms: js.Object, processForm: Event_ => Callback): FormsHandler = {
    val __obj = js.Dynamic.literal(netteForms = netteForms.asInstanceOf[js.Any])
    __obj.updateDynamic("initForms")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => initForms(t0).runNow()))
    __obj.updateDynamic("processForm")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => processForm(t0).runNow()))
    __obj.asInstanceOf[FormsHandler]
  }
}

