package typingsJapgolly.rcFieldForm

import typingsJapgolly.rcFieldForm.interfaceMod.FieldData
import typingsJapgolly.rcFieldForm.interfaceMod.NotifyInfo
import typingsJapgolly.rcFieldForm.rcFieldFormStrings.setField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends NotifyInfo {
  var data: FieldData
  var `type`: setField
}

object AnonData {
  @scala.inline
  def apply(data: FieldData, `type`: setField): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

