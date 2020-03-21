package typingsJapgolly.auth0Lock

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.auth0Lock.auth0LockStrings.`false`
import typingsJapgolly.auth0Lock.auth0LockStrings.`true`
import typingsJapgolly.auth0Lock.auth0LockStrings.checkbox
import typingsJapgolly.auth0Lock.auth0LockStrings.select
import typingsJapgolly.auth0Lock.auth0LockStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.auth0Lock.Auth0LockAdditionalSelectSignUpField
  - typingsJapgolly.auth0Lock.Auth0LockAdditionalTextSignUpField
  - typingsJapgolly.auth0Lock.Auth0LockAdditionalCheckboxSignUpField
*/
trait Auth0LockAdditionalSignUpField extends js.Object

object Auth0LockAdditionalSignUpField {
  @scala.inline
  def Auth0LockAdditionalSelectSignUpField(
    name: String,
    placeholder: String,
    icon: String = null,
    options: js.Array[Auth0LockAdditionalSignUpFieldOption] | Auth0LockAdditionalSignUpFieldOptionsFunction = null,
    prefill: String | Auth0LockAdditionalSignUpFieldPrefillFunction = null,
    `type`: select = null,
    validator: /* input */ String => CallbackTo[AnonHint] = null
  ): Auth0LockAdditionalSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (prefill != null) __obj.updateDynamic("prefill")(prefill.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => validator(t0).runNow()))
    __obj.asInstanceOf[Auth0LockAdditionalSignUpField]
  }
  @scala.inline
  def Auth0LockAdditionalTextSignUpField(
    name: String,
    placeholder: String,
    icon: String = null,
    options: js.Array[Auth0LockAdditionalSignUpFieldOption] | Auth0LockAdditionalSignUpFieldOptionsFunction = null,
    prefill: String | Auth0LockAdditionalSignUpFieldPrefillFunction = null,
    `type`: text = null,
    validator: /* input */ String => CallbackTo[AnonHint] = null
  ): Auth0LockAdditionalSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (prefill != null) __obj.updateDynamic("prefill")(prefill.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => validator(t0).runNow()))
    __obj.asInstanceOf[Auth0LockAdditionalSignUpField]
  }
  @scala.inline
  def Auth0LockAdditionalCheckboxSignUpField(
    name: String,
    placeholder: String,
    prefill: `true` | `false`,
    icon: String = null,
    `type`: checkbox = null,
    validator: /* input */ String => CallbackTo[AnonHint] = null
  ): Auth0LockAdditionalSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], prefill = prefill.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => validator(t0).runNow()))
    __obj.asInstanceOf[Auth0LockAdditionalSignUpField]
  }
}

