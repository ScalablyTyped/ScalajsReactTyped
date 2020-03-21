package typingsJapgolly.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSlotTypeVersionResponse extends js.Object {
  /**
    * Checksum of the $LATEST version of the slot type.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * The date that the slot type was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.native
  /**
    * A description of the slot type.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * A list of EnumerationValue objects that defines the values that the slot type can take.
    */
  var enumerationValues: js.UndefOr[EnumerationValues] = js.native
  /**
    * The date that the slot type was updated. When you create a resource, the creation date and last update date are the same.
    */
  var lastUpdatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The name of the slot type.
    */
  var name: js.UndefOr[SlotTypeName] = js.native
  /**
    * The built-in slot type used a the parent of the slot type.
    */
  var parentSlotTypeSignature: js.UndefOr[CustomOrBuiltinSlotTypeName] = js.native
  /**
    * Configuration information that extends the parent built-in slot type.
    */
  var slotTypeConfigurations: js.UndefOr[SlotTypeConfigurations] = js.native
  /**
    * The strategy that Amazon Lex uses to determine the value of the slot. For more information, see PutSlotType.
    */
  var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.native
  /**
    * The version assigned to the new slot type version. 
    */
  var version: js.UndefOr[Version] = js.native
}

object CreateSlotTypeVersionResponse {
  @scala.inline
  def apply(
    checksum: String = null,
    createdDate: js.Date = null,
    description: Description = null,
    enumerationValues: EnumerationValues = null,
    lastUpdatedDate: js.Date = null,
    name: SlotTypeName = null,
    parentSlotTypeSignature: CustomOrBuiltinSlotTypeName = null,
    slotTypeConfigurations: SlotTypeConfigurations = null,
    valueSelectionStrategy: SlotValueSelectionStrategy = null,
    version: Version = null
  ): CreateSlotTypeVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enumerationValues != null) __obj.updateDynamic("enumerationValues")(enumerationValues.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentSlotTypeSignature != null) __obj.updateDynamic("parentSlotTypeSignature")(parentSlotTypeSignature.asInstanceOf[js.Any])
    if (slotTypeConfigurations != null) __obj.updateDynamic("slotTypeConfigurations")(slotTypeConfigurations.asInstanceOf[js.Any])
    if (valueSelectionStrategy != null) __obj.updateDynamic("valueSelectionStrategy")(valueSelectionStrategy.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSlotTypeVersionResponse]
  }
}

