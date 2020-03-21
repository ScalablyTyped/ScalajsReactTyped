package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountProvider extends js.Object {
  /**
  		 * Called from the account management service when the user has cancelled an auto OAuth
  		 * authorization process. Implementations should use this to cancel any polling process
  		 * and call the end OAuth method.
  		 */
  def autoOAuthCancelled(): Thenable[Unit]
  /**
  		 * Clears sensitive information for an account. To be called when account is removed
  		 * @param accountKey - Key that uniquely identifies the account to clear
  		 */
  def clear(accountKey: AccountKey): Thenable[Unit]
  /**
  		 * Generates a security token for the provided account
  		 * @param account The account to generate a security token for
  		 * @param resource The resource to get the token for
  		 * @return Promise to return a security token object
  		 */
  def getSecurityToken(account: Account, resource: AzureResource): Thenable[js.Object]
  /**
  		 * Initializes the account provider with the accounts restored from the memento,
  		 * @param storedAccounts Accounts restored from the memento
  		 * @return Account objects after being rehydrated (if necessary)
  		 */
  def initialize(storedAccounts: js.Array[Account]): Thenable[js.Array[Account]]
  /**
  		 * Prompts the user to enter account information.
  		 * Returns an error if the user canceled the operation.
  		 */
  def prompt(): Thenable[Account | PromptFailedResult]
  /**
  		 * Refreshes a stale account.
  		 * Returns an error if the user canceled the operation.
  		 * Otherwise, returns a new updated account instance.
  		 * @param account - An account.
  		 */
  def refresh(account: Account): Thenable[Account | PromptFailedResult]
}

object AccountProvider {
  @scala.inline
  def apply(
    autoOAuthCancelled: CallbackTo[Thenable[Unit]],
    clear: AccountKey => CallbackTo[Thenable[Unit]],
    getSecurityToken: (Account, AzureResource) => CallbackTo[Thenable[js.Object]],
    initialize: js.Array[Account] => CallbackTo[Thenable[js.Array[Account]]],
    prompt: CallbackTo[Thenable[Account | PromptFailedResult]],
    refresh: Account => CallbackTo[Thenable[Account | PromptFailedResult]]
  ): AccountProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoOAuthCancelled")(autoOAuthCancelled.toJsFn)
    __obj.updateDynamic("clear")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.AccountKey) => clear(t0).runNow()))
    __obj.updateDynamic("getSecurityToken")(js.Any.fromFunction2((t0: typingsJapgolly.azdata.mod.Account, t1: typingsJapgolly.azdata.mod.AzureResource) => getSecurityToken(t0, t1).runNow()))
    __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.azdata.mod.Account]) => initialize(t0).runNow()))
    __obj.updateDynamic("prompt")(prompt.toJsFn)
    __obj.updateDynamic("refresh")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.Account) => refresh(t0).runNow()))
    __obj.asInstanceOf[AccountProvider]
  }
}

