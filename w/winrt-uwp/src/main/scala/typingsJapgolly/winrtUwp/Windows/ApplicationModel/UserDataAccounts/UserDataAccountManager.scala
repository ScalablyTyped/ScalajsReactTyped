package typingsJapgolly.winrtUwp.Windows.ApplicationModel.UserDataAccounts

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides APIs to interact with the user’s data accounts including those implemented by the operating system. */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountManager")
@js.native
abstract class UserDataAccountManager () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountManager")
@js.native
object UserDataAccountManager extends js.Object {
  /**
    * Asynchronously returns the UserDataAccountStore from the system.
    * @param storeAccessType Specifies the access type, such as read-only for all accounts or read/write for the calling app's accounts.
    * @return Returns the UserDataAccountStore .
    */
  def requestStoreAsync(storeAccessType: UserDataAccountStoreAccessType): IPromiseWithIAsyncOperation[UserDataAccountStore] = js.native
  /**
    * This method shows the resolve message for an account error.
    * @param id The user data account ID.
    * @return An async action indicating success or failure.
    */
  def showAccountErrorResolverAsync(id: String): IPromiseWithIAsyncAction = js.native
  /**
    * This method shows the account settings.
    * @param id The user data account ID.
    * @return An async action indicating success or failure.
    */
  def showAccountSettingsAsync(id: String): IPromiseWithIAsyncAction = js.native
  /**
    * Shows the add account UI.
    * @param contentKinds The type of user data content.
    * @return Returns the newly added or already existing account.
    */
  def showAddAccountAsync(contentKinds: UserDataAccountContentKinds): IPromiseWithIAsyncOperation[String] = js.native
}

