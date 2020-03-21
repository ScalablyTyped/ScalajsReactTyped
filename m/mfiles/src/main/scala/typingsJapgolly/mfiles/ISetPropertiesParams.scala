package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFACLEnforcingMode
import typingsJapgolly.mfiles.MFiles.MFObjectOperationFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetPropertiesParams extends js.Object {
  var AccessControlListEnforcingMode: MFACLEnforcingMode
  var AccessControlListProvidedForEnforcing: IAccessControlList
  var AllowModifyingCheckedInObject: Boolean
  var FailIfNotLatestCheckedInVersion: Boolean
  var FullSet: Boolean
  var ObjVer: IObjVer
  var PropertyValuesToRemove: IIDs
  var PropertyValuesToSet: IPropertyValues
  def Clone(): ISetPropertiesParams
  def SetWithPermissions(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: Boolean,
    FailIfNotLatestCheckedInVersion: Boolean,
    PropertyValuesToSet: IPropertyValues,
    FullSet: Boolean,
    PropertyValuesToRemove: IIDs,
    ObjectOperationFlags: MFObjectOperationFlags,
    AccessControlListEnforcingMode: MFACLEnforcingMode,
    AccessControlListProvidedForEnforcing: IAccessControlList
  ): Unit
}

object ISetPropertiesParams {
  @scala.inline
  def apply(
    AccessControlListEnforcingMode: MFACLEnforcingMode,
    AccessControlListProvidedForEnforcing: IAccessControlList,
    AllowModifyingCheckedInObject: Boolean,
    Clone: CallbackTo[ISetPropertiesParams],
    FailIfNotLatestCheckedInVersion: Boolean,
    FullSet: Boolean,
    ObjVer: IObjVer,
    PropertyValuesToRemove: IIDs,
    PropertyValuesToSet: IPropertyValues,
    SetWithPermissions: (IObjVer, Boolean, Boolean, IPropertyValues, Boolean, IIDs, MFObjectOperationFlags, MFACLEnforcingMode, IAccessControlList) => Callback
  ): ISetPropertiesParams = {
    val __obj = js.Dynamic.literal(AccessControlListEnforcingMode = AccessControlListEnforcingMode.asInstanceOf[js.Any], AccessControlListProvidedForEnforcing = AccessControlListProvidedForEnforcing.asInstanceOf[js.Any], AllowModifyingCheckedInObject = AllowModifyingCheckedInObject.asInstanceOf[js.Any], FailIfNotLatestCheckedInVersion = FailIfNotLatestCheckedInVersion.asInstanceOf[js.Any], FullSet = FullSet.asInstanceOf[js.Any], ObjVer = ObjVer.asInstanceOf[js.Any], PropertyValuesToRemove = PropertyValuesToRemove.asInstanceOf[js.Any], PropertyValuesToSet = PropertyValuesToSet.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("SetWithPermissions")(js.Any.fromFunction9((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Boolean, t2: scala.Boolean, t3: typingsJapgolly.mfiles.IPropertyValues, t4: scala.Boolean, t5: typingsJapgolly.mfiles.IIDs, t6: typingsJapgolly.mfiles.MFiles.MFObjectOperationFlags, t7: typingsJapgolly.mfiles.MFiles.MFACLEnforcingMode, t8: typingsJapgolly.mfiles.IAccessControlList) => SetWithPermissions(t0, t1, t2, t3, t4, t5, t6, t7, t8).runNow()))
    __obj.asInstanceOf[ISetPropertiesParams]
  }
}

