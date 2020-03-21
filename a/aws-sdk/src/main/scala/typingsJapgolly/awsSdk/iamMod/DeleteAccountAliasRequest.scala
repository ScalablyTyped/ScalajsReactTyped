package typingsJapgolly.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAccountAliasRequest extends js.Object {
  /**
    * The name of the account alias to delete. This parameter allows (through its regex pattern) a string of characters consisting of lowercase letters, digits, and dashes. You cannot start or finish with a dash, nor can you have two dashes in a row.
    */
  var AccountAlias: accountAliasType = js.native
}

object DeleteAccountAliasRequest {
  @scala.inline
  def apply(AccountAlias: accountAliasType): DeleteAccountAliasRequest = {
    val __obj = js.Dynamic.literal(AccountAlias = AccountAlias.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAccountAliasRequest]
  }
}

