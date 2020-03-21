package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFNamedACLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultNamedACLOperations extends js.Object {
  def AddNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): INamedACLAdmin
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: Boolean,
    ActiveAccessControlComponentsOnly: Boolean,
    RefreshFromServer: Boolean
  ): INamedACL
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: Boolean,
    RefreshFromServer: Boolean
  ): INamedACL
  def GetNamedACL(NamedACLID: Double): INamedACL
  def GetNamedACLAdmin(NamedACLID: Double): INamedACLAdmin
  def GetNamedACLIDByAlias(Alias: String): Double
  def GetNamedACLIDByGUID(NamedACLGUID: String): Double
  def GetNamedACLWithRefresh(NamedACLID: Double, RefreshFromServer: Boolean): INamedACL
  def GetNamedACLs(): INamedACLs
  def GetNamedACLsByTypeAdmin(Type: MFNamedACLType): INamedACLsAdmin
  def GetNamedACLsWithRefresh(RefreshFromServer: Boolean): INamedACLs
  def IsNamedACLUsedInAutomaticPermissionsAdmin(NamedACLID: Double): Boolean
  def RemoveNamedACLWithPropagationAdmin(NamedACLID: Double, AllowPropagation: Boolean): Unit
  def UpdateNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): Unit
  def UpdateNamedACLWithPropagationAdmin(NamedACLAdmin: INamedACLAdmin, MaintainLinks: Boolean, AllowPropagation: Boolean): Unit
}

object IVaultNamedACLOperations {
  @scala.inline
  def apply(
    AddNamedACLAdmin: INamedACLAdmin => CallbackTo[INamedACLAdmin],
    GetMatchingNamedACLForAccessControlList: (IAccessControlList, Boolean, Boolean, Boolean) => CallbackTo[INamedACL],
    GetMatchingNamedACLForAccessControlListComponent: (IAccessControlListComponent, Boolean, Boolean) => CallbackTo[INamedACL],
    GetNamedACL: Double => CallbackTo[INamedACL],
    GetNamedACLAdmin: Double => CallbackTo[INamedACLAdmin],
    GetNamedACLIDByAlias: String => CallbackTo[Double],
    GetNamedACLIDByGUID: String => CallbackTo[Double],
    GetNamedACLWithRefresh: (Double, Boolean) => CallbackTo[INamedACL],
    GetNamedACLs: CallbackTo[INamedACLs],
    GetNamedACLsByTypeAdmin: MFNamedACLType => CallbackTo[INamedACLsAdmin],
    GetNamedACLsWithRefresh: Boolean => CallbackTo[INamedACLs],
    IsNamedACLUsedInAutomaticPermissionsAdmin: Double => CallbackTo[Boolean],
    RemoveNamedACLWithPropagationAdmin: (Double, Boolean) => Callback,
    UpdateNamedACLAdmin: INamedACLAdmin => Callback,
    UpdateNamedACLWithPropagationAdmin: (INamedACLAdmin, Boolean, Boolean) => Callback
  ): IVaultNamedACLOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AddNamedACLAdmin")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.INamedACLAdmin) => AddNamedACLAdmin(t0).runNow()))
    __obj.updateDynamic("GetMatchingNamedACLForAccessControlList")(js.Any.fromFunction4((t0: typingsJapgolly.mfiles.IAccessControlList, t1: scala.Boolean, t2: scala.Boolean, t3: scala.Boolean) => GetMatchingNamedACLForAccessControlList(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("GetMatchingNamedACLForAccessControlListComponent")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.IAccessControlListComponent, t1: scala.Boolean, t2: scala.Boolean) => GetMatchingNamedACLForAccessControlListComponent(t0, t1, t2).runNow()))
    __obj.updateDynamic("GetNamedACL")(js.Any.fromFunction1((t0: scala.Double) => GetNamedACL(t0).runNow()))
    __obj.updateDynamic("GetNamedACLAdmin")(js.Any.fromFunction1((t0: scala.Double) => GetNamedACLAdmin(t0).runNow()))
    __obj.updateDynamic("GetNamedACLIDByAlias")(js.Any.fromFunction1((t0: java.lang.String) => GetNamedACLIDByAlias(t0).runNow()))
    __obj.updateDynamic("GetNamedACLIDByGUID")(js.Any.fromFunction1((t0: java.lang.String) => GetNamedACLIDByGUID(t0).runNow()))
    __obj.updateDynamic("GetNamedACLWithRefresh")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => GetNamedACLWithRefresh(t0, t1).runNow()))
    __obj.updateDynamic("GetNamedACLs")(GetNamedACLs.toJsFn)
    __obj.updateDynamic("GetNamedACLsByTypeAdmin")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.MFiles.MFNamedACLType) => GetNamedACLsByTypeAdmin(t0).runNow()))
    __obj.updateDynamic("GetNamedACLsWithRefresh")(js.Any.fromFunction1((t0: scala.Boolean) => GetNamedACLsWithRefresh(t0).runNow()))
    __obj.updateDynamic("IsNamedACLUsedInAutomaticPermissionsAdmin")(js.Any.fromFunction1((t0: scala.Double) => IsNamedACLUsedInAutomaticPermissionsAdmin(t0).runNow()))
    __obj.updateDynamic("RemoveNamedACLWithPropagationAdmin")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => RemoveNamedACLWithPropagationAdmin(t0, t1).runNow()))
    __obj.updateDynamic("UpdateNamedACLAdmin")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.INamedACLAdmin) => UpdateNamedACLAdmin(t0).runNow()))
    __obj.updateDynamic("UpdateNamedACLWithPropagationAdmin")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.INamedACLAdmin, t1: scala.Boolean, t2: scala.Boolean) => UpdateNamedACLWithPropagationAdmin(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IVaultNamedACLOperations]
  }
}

