package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAccessControlList
import typingsJapgolly.mfiles.IAccessControlListComponent
import typingsJapgolly.mfiles.INamedACL
import typingsJapgolly.mfiles.INamedACLAdmin
import typingsJapgolly.mfiles.INamedACLs
import typingsJapgolly.mfiles.INamedACLsAdmin
import typingsJapgolly.mfiles.IVaultNamedACLOperations
import typingsJapgolly.mfiles.MFiles.MFNamedACLType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultNamedACLOperations")
@js.native
open class VaultNamedACLOperations ()
  extends StObject
     with IVaultNamedACLOperations {
  
  /* CompleteClass */
  override def AddNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): INamedACLAdmin = js.native
  
  /* CompleteClass */
  override def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: Boolean,
    ActiveAccessControlComponentsOnly: Boolean,
    RefreshFromServer: Boolean
  ): INamedACL = js.native
  
  /* CompleteClass */
  override def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: Boolean,
    RefreshFromServer: Boolean
  ): INamedACL = js.native
  
  /* CompleteClass */
  override def GetNamedACL(NamedACLID: Double): INamedACL = js.native
  
  /* CompleteClass */
  override def GetNamedACLAdmin(NamedACLID: Double): INamedACLAdmin = js.native
  
  /* CompleteClass */
  override def GetNamedACLIDByAlias(Alias: String): Double = js.native
  
  /* CompleteClass */
  override def GetNamedACLIDByGUID(NamedACLGUID: String): Double = js.native
  
  /* CompleteClass */
  override def GetNamedACLWithRefresh(NamedACLID: Double, RefreshFromServer: Boolean): INamedACL = js.native
  
  /* CompleteClass */
  override def GetNamedACLs(): INamedACLs = js.native
  
  /* CompleteClass */
  override def GetNamedACLsByTypeAdmin(Type: MFNamedACLType): INamedACLsAdmin = js.native
  
  /* CompleteClass */
  override def GetNamedACLsWithRefresh(RefreshFromServer: Boolean): INamedACLs = js.native
  
  /* CompleteClass */
  override def IsNamedACLUsedInAutomaticPermissionsAdmin(NamedACLID: Double): Boolean = js.native
  
  /* CompleteClass */
  override def RemoveNamedACLWithPropagationAdmin(NamedACLID: Double, AllowPropagation: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def UpdateNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): Unit = js.native
  
  /* CompleteClass */
  override def UpdateNamedACLWithPropagationAdmin(NamedACLAdmin: INamedACLAdmin, MaintainLinks: Boolean, AllowPropagation: Boolean): Unit = js.native
}
