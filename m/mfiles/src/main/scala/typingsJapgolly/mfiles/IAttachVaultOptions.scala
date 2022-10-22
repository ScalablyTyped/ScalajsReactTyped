package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFAttachVaultOptionsFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAttachVaultOptions extends StObject {
  
  def Clone(): IAttachVaultOptions
  
  def DisableAll(): Unit
  
  var DisableEventHandlers: Boolean
  
  var DisableExportImportJobs: Boolean
  
  var DisableExportedDataSets: Boolean
  
  var DisableExternalObjectTypes: Boolean
  
  var DisableExternalSources: Boolean
  
  var DisableExternalUserGroups: Boolean
  
  var Flags: MFAttachVaultOptionsFlag
  
  var UpdateAttachmentGUID: Boolean
}
object IAttachVaultOptions {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, DisableAll = DisableAll.toJsFn, DisableEventHandlers = DisableEventHandlers.asInstanceOf[js.Any], DisableExportImportJobs = DisableExportImportJobs.asInstanceOf[js.Any], DisableExportedDataSets = DisableExportedDataSets.asInstanceOf[js.Any], DisableExternalObjectTypes = DisableExternalObjectTypes.asInstanceOf[js.Any], DisableExternalSources = DisableExternalSources.asInstanceOf[js.Any], DisableExternalUserGroups = DisableExternalUserGroups.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], UpdateAttachmentGUID = UpdateAttachmentGUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttachVaultOptions]
  }
  
  extension [Self <: IAttachVaultOptions](x: Self) {
    
    inline def setClone(value: CallbackTo[IAttachVaultOptions]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setDisableAll(value: Callback): Self = StObject.set(x, "DisableAll", value.toJsFn)
    
    inline def setDisableEventHandlers(value: Boolean): Self = StObject.set(x, "DisableEventHandlers", value.asInstanceOf[js.Any])
    
    inline def setDisableExportImportJobs(value: Boolean): Self = StObject.set(x, "DisableExportImportJobs", value.asInstanceOf[js.Any])
    
    inline def setDisableExportedDataSets(value: Boolean): Self = StObject.set(x, "DisableExportedDataSets", value.asInstanceOf[js.Any])
    
    inline def setDisableExternalObjectTypes(value: Boolean): Self = StObject.set(x, "DisableExternalObjectTypes", value.asInstanceOf[js.Any])
    
    inline def setDisableExternalSources(value: Boolean): Self = StObject.set(x, "DisableExternalSources", value.asInstanceOf[js.Any])
    
    inline def setDisableExternalUserGroups(value: Boolean): Self = StObject.set(x, "DisableExternalUserGroups", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: MFAttachVaultOptionsFlag): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    inline def setUpdateAttachmentGUID(value: Boolean): Self = StObject.set(x, "UpdateAttachmentGUID", value.asInstanceOf[js.Any])
  }
}
