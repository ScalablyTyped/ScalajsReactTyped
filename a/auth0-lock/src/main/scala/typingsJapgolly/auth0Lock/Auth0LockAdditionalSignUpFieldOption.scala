package typingsJapgolly.auth0Lock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockAdditionalSignUpFieldOption extends js.Object {
  var label: String
  var value: String
}

object Auth0LockAdditionalSignUpFieldOption {
  @scala.inline
  def apply(label: String, value: String): Auth0LockAdditionalSignUpFieldOption = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Auth0LockAdditionalSignUpFieldOption]
  }
}

