package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IKeyNamePairs
import typingsJapgolly.mfiles.ILoginAccount
import typingsJapgolly.mfiles.ILoginAccounts
import typingsJapgolly.mfiles.IUserAccount
import typingsJapgolly.mfiles.IUserAccounts
import typingsJapgolly.mfiles.IVaultUserOperations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultUserOperations")
@js.native
open class VaultUserOperations ()
  extends StObject
     with IVaultUserOperations {
  
  /* CompleteClass */
  override def AddOrUndeleteUserAccount(User: IUserAccount): IUserAccount = js.native
  
  /* CompleteClass */
  override def AddUserAccount(User: IUserAccount): IUserAccount = js.native
  
  /* CompleteClass */
  override def GetLoginAccountOfUser(UserID: Double): ILoginAccount = js.native
  
  /* CompleteClass */
  override def GetLoginAccounts(): ILoginAccounts = js.native
  
  /* CompleteClass */
  override def GetUserAccount(UserID: Double): IUserAccount = js.native
  
  /* CompleteClass */
  override def GetUserAccounts(): IUserAccounts = js.native
  
  /* CompleteClass */
  override def GetUserIDByGUID(UserGUID: String): Double = js.native
  
  /* CompleteClass */
  override def GetUserList(): IKeyNamePairs = js.native
  
  /* CompleteClass */
  override def ModifyUserAccount(User: IUserAccount): Unit = js.native
  
  /* CompleteClass */
  override def RemoveUserAccount(UserID: Double): Unit = js.native
}
