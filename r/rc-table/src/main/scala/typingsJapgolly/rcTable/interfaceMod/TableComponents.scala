package typingsJapgolly.rcTable.interfaceMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcTable.AnonCell
import typingsJapgolly.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableComponents[RecordType] extends js.Object {
  var body: js.UndefOr[CustomizeScrollBody[RecordType] | AnonCell] = js.undefined
  var header: js.UndefOr[AnonCell] = js.undefined
  var table: js.UndefOr[CustomizeComponent[HTMLAttributes[HTMLElement]]] = js.undefined
}

object TableComponents {
  @scala.inline
  def apply[RecordType](
    body: CustomizeScrollBody[RecordType] | AnonCell = null,
    header: AnonCell = null,
    table: CustomizeComponent[HTMLAttributes[HTMLElement]] = null
  ): TableComponents[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableComponents[RecordType]]
  }
}

