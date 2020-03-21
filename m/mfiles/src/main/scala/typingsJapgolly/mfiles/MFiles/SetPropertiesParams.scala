package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IAccessControlList
import typingsJapgolly.mfiles.IIDs
import typingsJapgolly.mfiles.IObjVer
import typingsJapgolly.mfiles.IPropertyValues
import typingsJapgolly.mfiles.ISetPropertiesParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SetPropertiesParams")
@js.native
class SetPropertiesParams () extends ISetPropertiesParams {
  /* CompleteClass */
  override var AccessControlListEnforcingMode: MFACLEnforcingMode = js.native
  /* CompleteClass */
  override var AccessControlListProvidedForEnforcing: IAccessControlList = js.native
  /* CompleteClass */
  override var AllowModifyingCheckedInObject: Boolean = js.native
  /* CompleteClass */
  override var FailIfNotLatestCheckedInVersion: Boolean = js.native
  /* CompleteClass */
  override var FullSet: Boolean = js.native
  /* CompleteClass */
  override var ObjVer: IObjVer = js.native
  /* CompleteClass */
  override var PropertyValuesToRemove: IIDs = js.native
  /* CompleteClass */
  override var PropertyValuesToSet: IPropertyValues = js.native
  /* CompleteClass */
  override def Clone(): ISetPropertiesParams = js.native
  /* CompleteClass */
  override def SetWithPermissions(
    ObjVer: IObjVer,
    AllowModifyingCheckedInObject: Boolean,
    FailIfNotLatestCheckedInVersion: Boolean,
    PropertyValuesToSet: IPropertyValues,
    FullSet: Boolean,
    PropertyValuesToRemove: IIDs,
    ObjectOperationFlags: MFObjectOperationFlags,
    AccessControlListEnforcingMode: MFACLEnforcingMode,
    AccessControlListProvidedForEnforcing: IAccessControlList
  ): Unit = js.native
}

@JSGlobal("MFiles.SetPropertiesParams")
@js.native
object SetPropertiesParams extends Instantiable0[ISetPropertiesParams]

