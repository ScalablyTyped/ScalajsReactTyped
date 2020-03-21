package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CredentialPair extends js.Object {
  /**
    * Password.
    */
  var Password: typingsJapgolly.awsSdk.quicksightMod.Password = js.native
  /**
    * User name.
    */
  var Username: typingsJapgolly.awsSdk.quicksightMod.Username = js.native
}

object CredentialPair {
  @scala.inline
  def apply(Password: Password, Username: Username): CredentialPair = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CredentialPair]
  }
}

