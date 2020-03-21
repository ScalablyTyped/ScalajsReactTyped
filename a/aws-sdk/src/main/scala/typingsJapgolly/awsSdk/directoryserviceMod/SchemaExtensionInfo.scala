package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExtensionInfo extends js.Object {
  /**
    * A description of the schema extension.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.Description] = js.native
  /**
    * The identifier of the directory to which the schema extension is applied.
    */
  var DirectoryId: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The date and time that the schema extension was completed.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The identifier of the schema extension.
    */
  var SchemaExtensionId: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.SchemaExtensionId] = js.native
  /**
    * The current status of the schema extension.
    */
  var SchemaExtensionStatus: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.SchemaExtensionStatus] = js.native
  /**
    * The reason for the SchemaExtensionStatus.
    */
  var SchemaExtensionStatusReason: js.UndefOr[typingsJapgolly.awsSdk.directoryserviceMod.SchemaExtensionStatusReason] = js.native
  /**
    * The date and time that the schema extension started being applied to the directory.
    */
  var StartDateTime: js.UndefOr[js.Date] = js.native
}

object SchemaExtensionInfo {
  @scala.inline
  def apply(
    Description: Description = null,
    DirectoryId: DirectoryId = null,
    EndDateTime: js.Date = null,
    SchemaExtensionId: SchemaExtensionId = null,
    SchemaExtensionStatus: SchemaExtensionStatus = null,
    SchemaExtensionStatusReason: SchemaExtensionStatusReason = null,
    StartDateTime: js.Date = null
  ): SchemaExtensionInfo = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime.asInstanceOf[js.Any])
    if (SchemaExtensionId != null) __obj.updateDynamic("SchemaExtensionId")(SchemaExtensionId.asInstanceOf[js.Any])
    if (SchemaExtensionStatus != null) __obj.updateDynamic("SchemaExtensionStatus")(SchemaExtensionStatus.asInstanceOf[js.Any])
    if (SchemaExtensionStatusReason != null) __obj.updateDynamic("SchemaExtensionStatusReason")(SchemaExtensionStatusReason.asInstanceOf[js.Any])
    if (StartDateTime != null) __obj.updateDynamic("StartDateTime")(StartDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExtensionInfo]
  }
}

