package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFPermission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessControlEntryData extends StObject {
  
  var AttachObjectsPermission: MFPermission
  
  var ChangePermissionsPermission: MFPermission
  
  def Clone(): IAccessControlEntryData
  
  var DeletePermission: MFPermission
  
  var EditPermission: MFPermission
  
  var ReadPermission: MFPermission
  
  def SetAllPermissions(Permission: MFPermission): Unit
}
object IAccessControlEntryData {
  
  inline def apply(
    AttachObjectsPermission: MFPermission,
    ChangePermissionsPermission: MFPermission,
    Clone: CallbackTo[IAccessControlEntryData],
    DeletePermission: MFPermission,
    EditPermission: MFPermission,
    ReadPermission: MFPermission,
    SetAllPermissions: MFPermission => Callback
  ): IAccessControlEntryData = {
    val __obj = js.Dynamic.literal(AttachObjectsPermission = AttachObjectsPermission.asInstanceOf[js.Any], ChangePermissionsPermission = ChangePermissionsPermission.asInstanceOf[js.Any], Clone = Clone.toJsFn, DeletePermission = DeletePermission.asInstanceOf[js.Any], EditPermission = EditPermission.asInstanceOf[js.Any], ReadPermission = ReadPermission.asInstanceOf[js.Any], SetAllPermissions = js.Any.fromFunction1((t0: MFPermission) => SetAllPermissions(t0).runNow()))
    __obj.asInstanceOf[IAccessControlEntryData]
  }
  
  extension [Self <: IAccessControlEntryData](x: Self) {
    
    inline def setAttachObjectsPermission(value: MFPermission): Self = StObject.set(x, "AttachObjectsPermission", value.asInstanceOf[js.Any])
    
    inline def setChangePermissionsPermission(value: MFPermission): Self = StObject.set(x, "ChangePermissionsPermission", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[IAccessControlEntryData]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setDeletePermission(value: MFPermission): Self = StObject.set(x, "DeletePermission", value.asInstanceOf[js.Any])
    
    inline def setEditPermission(value: MFPermission): Self = StObject.set(x, "EditPermission", value.asInstanceOf[js.Any])
    
    inline def setReadPermission(value: MFPermission): Self = StObject.set(x, "ReadPermission", value.asInstanceOf[js.Any])
    
    inline def setSetAllPermissions(value: MFPermission => Callback): Self = StObject.set(x, "SetAllPermissions", js.Any.fromFunction1((t0: MFPermission) => value(t0).runNow()))
  }
}
