package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFNamedACLType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultNamedACLOperations extends StObject {
  
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
  
  inline def apply(
    AddNamedACLAdmin: INamedACLAdmin => INamedACLAdmin,
    GetMatchingNamedACLForAccessControlList: (IAccessControlList, Boolean, Boolean, Boolean) => INamedACL,
    GetMatchingNamedACLForAccessControlListComponent: (IAccessControlListComponent, Boolean, Boolean) => INamedACL,
    GetNamedACL: Double => INamedACL,
    GetNamedACLAdmin: Double => INamedACLAdmin,
    GetNamedACLIDByAlias: String => Double,
    GetNamedACLIDByGUID: String => Double,
    GetNamedACLWithRefresh: (Double, Boolean) => INamedACL,
    GetNamedACLs: CallbackTo[INamedACLs],
    GetNamedACLsByTypeAdmin: MFNamedACLType => INamedACLsAdmin,
    GetNamedACLsWithRefresh: Boolean => INamedACLs,
    IsNamedACLUsedInAutomaticPermissionsAdmin: Double => Boolean,
    RemoveNamedACLWithPropagationAdmin: (Double, Boolean) => Callback,
    UpdateNamedACLAdmin: INamedACLAdmin => Callback,
    UpdateNamedACLWithPropagationAdmin: (INamedACLAdmin, Boolean, Boolean) => Callback
  ): IVaultNamedACLOperations = {
    val __obj = js.Dynamic.literal(AddNamedACLAdmin = js.Any.fromFunction1(AddNamedACLAdmin), GetMatchingNamedACLForAccessControlList = js.Any.fromFunction4(GetMatchingNamedACLForAccessControlList), GetMatchingNamedACLForAccessControlListComponent = js.Any.fromFunction3(GetMatchingNamedACLForAccessControlListComponent), GetNamedACL = js.Any.fromFunction1(GetNamedACL), GetNamedACLAdmin = js.Any.fromFunction1(GetNamedACLAdmin), GetNamedACLIDByAlias = js.Any.fromFunction1(GetNamedACLIDByAlias), GetNamedACLIDByGUID = js.Any.fromFunction1(GetNamedACLIDByGUID), GetNamedACLWithRefresh = js.Any.fromFunction2(GetNamedACLWithRefresh), GetNamedACLs = GetNamedACLs.toJsFn, GetNamedACLsByTypeAdmin = js.Any.fromFunction1(GetNamedACLsByTypeAdmin), GetNamedACLsWithRefresh = js.Any.fromFunction1(GetNamedACLsWithRefresh), IsNamedACLUsedInAutomaticPermissionsAdmin = js.Any.fromFunction1(IsNamedACLUsedInAutomaticPermissionsAdmin), RemoveNamedACLWithPropagationAdmin = js.Any.fromFunction2((t0: Double, t1: Boolean) => (RemoveNamedACLWithPropagationAdmin(t0, t1)).runNow()), UpdateNamedACLAdmin = js.Any.fromFunction1((t0: INamedACLAdmin) => UpdateNamedACLAdmin(t0).runNow()), UpdateNamedACLWithPropagationAdmin = js.Any.fromFunction3((t0: INamedACLAdmin, t1: Boolean, t2: Boolean) => (UpdateNamedACLWithPropagationAdmin(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[IVaultNamedACLOperations]
  }
  
  extension [Self <: IVaultNamedACLOperations](x: Self) {
    
    inline def setAddNamedACLAdmin(value: INamedACLAdmin => INamedACLAdmin): Self = StObject.set(x, "AddNamedACLAdmin", js.Any.fromFunction1(value))
    
    inline def setGetMatchingNamedACLForAccessControlList(value: (IAccessControlList, Boolean, Boolean, Boolean) => INamedACL): Self = StObject.set(x, "GetMatchingNamedACLForAccessControlList", js.Any.fromFunction4(value))
    
    inline def setGetMatchingNamedACLForAccessControlListComponent(value: (IAccessControlListComponent, Boolean, Boolean) => INamedACL): Self = StObject.set(x, "GetMatchingNamedACLForAccessControlListComponent", js.Any.fromFunction3(value))
    
    inline def setGetNamedACL(value: Double => INamedACL): Self = StObject.set(x, "GetNamedACL", js.Any.fromFunction1(value))
    
    inline def setGetNamedACLAdmin(value: Double => INamedACLAdmin): Self = StObject.set(x, "GetNamedACLAdmin", js.Any.fromFunction1(value))
    
    inline def setGetNamedACLIDByAlias(value: String => Double): Self = StObject.set(x, "GetNamedACLIDByAlias", js.Any.fromFunction1(value))
    
    inline def setGetNamedACLIDByGUID(value: String => Double): Self = StObject.set(x, "GetNamedACLIDByGUID", js.Any.fromFunction1(value))
    
    inline def setGetNamedACLWithRefresh(value: (Double, Boolean) => INamedACL): Self = StObject.set(x, "GetNamedACLWithRefresh", js.Any.fromFunction2(value))
    
    inline def setGetNamedACLs(value: CallbackTo[INamedACLs]): Self = StObject.set(x, "GetNamedACLs", value.toJsFn)
    
    inline def setGetNamedACLsByTypeAdmin(value: MFNamedACLType => INamedACLsAdmin): Self = StObject.set(x, "GetNamedACLsByTypeAdmin", js.Any.fromFunction1(value))
    
    inline def setGetNamedACLsWithRefresh(value: Boolean => INamedACLs): Self = StObject.set(x, "GetNamedACLsWithRefresh", js.Any.fromFunction1(value))
    
    inline def setIsNamedACLUsedInAutomaticPermissionsAdmin(value: Double => Boolean): Self = StObject.set(x, "IsNamedACLUsedInAutomaticPermissionsAdmin", js.Any.fromFunction1(value))
    
    inline def setRemoveNamedACLWithPropagationAdmin(value: (Double, Boolean) => Callback): Self = StObject.set(x, "RemoveNamedACLWithPropagationAdmin", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setUpdateNamedACLAdmin(value: INamedACLAdmin => Callback): Self = StObject.set(x, "UpdateNamedACLAdmin", js.Any.fromFunction1((t0: INamedACLAdmin) => value(t0).runNow()))
    
    inline def setUpdateNamedACLWithPropagationAdmin(value: (INamedACLAdmin, Boolean, Boolean) => Callback): Self = StObject.set(x, "UpdateNamedACLWithPropagationAdmin", js.Any.fromFunction3((t0: INamedACLAdmin, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
  }
}
