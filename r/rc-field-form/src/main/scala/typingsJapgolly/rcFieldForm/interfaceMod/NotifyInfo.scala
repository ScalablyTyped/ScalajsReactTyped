package typingsJapgolly.rcFieldForm.interfaceMod

import typingsJapgolly.rcFieldForm.rcFieldFormStrings.dependenciesUpdate
import typingsJapgolly.rcFieldForm.rcFieldFormStrings.external
import typingsJapgolly.rcFieldForm.rcFieldFormStrings.internal
import typingsJapgolly.rcFieldForm.rcFieldFormStrings.reset
import typingsJapgolly.rcFieldForm.rcFieldFormStrings.setField
import typingsJapgolly.rcFieldForm.rcFieldFormStrings.validateFinish
import typingsJapgolly.rcFieldForm.rcFieldFormStrings.valueUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rcFieldForm.interfaceMod.ValueUpdateInfo
  - typingsJapgolly.rcFieldForm.AnonType
  - typingsJapgolly.rcFieldForm.AnonData
  - typingsJapgolly.rcFieldForm.AnonRelatedFields
*/
trait NotifyInfo extends js.Object

object NotifyInfo {
  @scala.inline
  def ValueUpdateInfo(source: internal | external, `type`: valueUpdate): NotifyInfo = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
  @scala.inline
  def AnonType(`type`: validateFinish | reset): NotifyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
  @scala.inline
  def AnonData(data: FieldData, `type`: setField): NotifyInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
  @scala.inline
  def AnonRelatedFields(relatedFields: js.Array[InternalNamePath], `type`: dependenciesUpdate): NotifyInfo = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyInfo]
  }
}

