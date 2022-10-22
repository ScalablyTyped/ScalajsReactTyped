package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.ILoginAccount
import typingsJapgolly.mfiles.ILoginAccountPersonalInformation
import typingsJapgolly.mfiles.ILoginAccounts
import typingsJapgolly.mfiles.IServerLoginAccountOperations
import typingsJapgolly.mfiles.IStrings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ServerLoginAccountOperations")
@js.native
open class ServerLoginAccountOperations ()
  extends StObject
     with IServerLoginAccountOperations {
  
  /* CompleteClass */
  override def AddLoginAccount(LoginAccount: ILoginAccount, Password: String): Unit = js.native
  
  /* CompleteClass */
  override def ForceLogout(AccountNames: IStrings): Unit = js.native
  
  /* CompleteClass */
  override def GetLoginAccount(AccountName: String): ILoginAccount = js.native
  
  /* CompleteClass */
  override def GetLoginAccounts(): ILoginAccounts = js.native
  
  /* CompleteClass */
  override def GetLoginAccountsWithSessions(): ILoginAccounts = js.native
  
  /* CompleteClass */
  override def GetPersonalInformationFromDomain(AccountName: String): ILoginAccountPersonalInformation = js.native
  
  /* CompleteClass */
  override def ModifyLoginAccount(LoginAccount: ILoginAccount): Unit = js.native
  
  /* CompleteClass */
  override def RemoveLoginAccount(AccountName: String): Unit = js.native
  
  /* CompleteClass */
  override def UpdateLoginPassword(AccountName: String, NewPassword: String): Unit = js.native
}
