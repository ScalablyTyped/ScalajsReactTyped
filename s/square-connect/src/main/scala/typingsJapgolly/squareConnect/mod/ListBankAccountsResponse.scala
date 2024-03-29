package typingsJapgolly.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListBankAccountsResponse")
@js.native
open class ListBankAccountsResponse () extends StObject {
  
  /**
    * List of BankAccounts associated with this account.
    */
  var bank_accounts: js.UndefOr[js.Array[BankAccount]] = js.native
  
  /**
    * When a response is truncated, it includes a cursor that you can  use in a subsequent request to fetch next set of bank accounts.
    * If empty, this is the final response.
    * For more information, see [Pagination](https://developer.squareup.com/docs/docs/working-with-apis/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
