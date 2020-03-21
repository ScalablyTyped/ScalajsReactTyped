package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFACLEnforcingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultExternalObjectOperations extends js.Object {
  def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList
  ): IObjectVersionAndProperties
}

object IVaultExternalObjectOperations {
  @scala.inline
  def apply(
    PromoteObject: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => CallbackTo[IObjectVersionAndProperties]
  ): IVaultExternalObjectOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PromoteObject")(js.Any.fromFunction4((t0: typingsJapgolly.mfiles.IObjVer, t1: typingsJapgolly.mfiles.IPropertyValues, t2: typingsJapgolly.mfiles.MFiles.MFACLEnforcingMode, t3: typingsJapgolly.mfiles.IAccessControlList) => PromoteObject(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[IVaultExternalObjectOperations]
  }
}

