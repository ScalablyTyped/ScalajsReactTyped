package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFAttachVaultOptionsFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachVaultOptions extends js.Object {
  var DisableEventHandlers: Boolean
  var DisableExportImportJobs: Boolean
  var DisableExportedDataSets: Boolean
  var DisableExternalObjectTypes: Boolean
  var DisableExternalSources: Boolean
  var DisableExternalUserGroups: Boolean
  var Flags: MFAttachVaultOptionsFlag
  var UpdateAttachmentGUID: Boolean
  def Clone(): IAttachVaultOptions
  def DisableAll(): Unit
}

object IAttachVaultOptions {
  @scala.inline
  def apply(
    Clone: CallbackTo[IAttachVaultOptions],
    DisableAll: Callback,
    DisableEventHandlers: Boolean,
    DisableExportImportJobs: Boolean,
    DisableExportedDataSets: Boolean,
    DisableExternalObjectTypes: Boolean,
    DisableExternalSources: Boolean,
    DisableExternalUserGroups: Boolean,
    Flags: MFAttachVaultOptionsFlag,
    UpdateAttachmentGUID: Boolean
  ): IAttachVaultOptions = {
    val __obj = js.Dynamic.literal(DisableEventHandlers = DisableEventHandlers.asInstanceOf[js.Any], DisableExportImportJobs = DisableExportImportJobs.asInstanceOf[js.Any], DisableExportedDataSets = DisableExportedDataSets.asInstanceOf[js.Any], DisableExternalObjectTypes = DisableExternalObjectTypes.asInstanceOf[js.Any], DisableExternalSources = DisableExternalSources.asInstanceOf[js.Any], DisableExternalUserGroups = DisableExternalUserGroups.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], UpdateAttachmentGUID = UpdateAttachmentGUID.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("DisableAll")(DisableAll.toJsFn)
    __obj.asInstanceOf[IAttachVaultOptions]
  }
}

