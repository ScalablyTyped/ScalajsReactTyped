package typingsJapgolly.reactBootstrapTable

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactBootstrapTable.mod.EditableAttrs
import typingsJapgolly.reactBootstrapTable.mod.InsertModalColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetElement extends js.Object {
  def getElement(
    column: InsertModalColumnDescription[_],
    attr: EditableAttrs,
    editorClass: String,
    ignoreEditable: Boolean,
    defaultValue: js.Any
  ): Element | Boolean
}

object AnonGetElement {
  @scala.inline
  def apply(
    getElement: (InsertModalColumnDescription[js.Any], EditableAttrs, String, Boolean, js.Any) => CallbackTo[Element | Boolean]
  ): AnonGetElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getElement")(js.Any.fromFunction5((t0: typingsJapgolly.reactBootstrapTable.mod.InsertModalColumnDescription[js.Any], t1: typingsJapgolly.reactBootstrapTable.mod.EditableAttrs, t2: java.lang.String, t3: scala.Boolean, t4: js.Any) => getElement(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[AnonGetElement]
  }
}

