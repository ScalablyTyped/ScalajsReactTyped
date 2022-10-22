package typingsJapgolly.auth0Lock

import typingsJapgolly.auth0Lock.auth0LockStrings.`false`
import typingsJapgolly.auth0Lock.auth0LockStrings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.auth0Lock.Auth0LockAdditionalSelectSignUpField
  - typingsJapgolly.auth0Lock.Auth0LockAdditionalTextSignUpField
  - typingsJapgolly.auth0Lock.Auth0LockAdditionalCheckboxSignUpField
  - typingsJapgolly.auth0Lock.Auth0LockAdditionalHiddenSignUpField
*/
trait Auth0LockAdditionalSignUpField extends StObject
object Auth0LockAdditionalSignUpField {
  
  inline def Auth0LockAdditionalCheckboxSignUpField(name: String, placeholder: String, prefill: `true` | `false`): typingsJapgolly.auth0Lock.Auth0LockAdditionalCheckboxSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], prefill = prefill.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.auth0Lock.Auth0LockAdditionalCheckboxSignUpField]
  }
  
  inline def Auth0LockAdditionalHiddenSignUpField(name: String, value: String): typingsJapgolly.auth0Lock.Auth0LockAdditionalHiddenSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.auth0Lock.Auth0LockAdditionalHiddenSignUpField]
  }
  
  inline def Auth0LockAdditionalSelectSignUpField(name: String, placeholder: String): typingsJapgolly.auth0Lock.Auth0LockAdditionalSelectSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.auth0Lock.Auth0LockAdditionalSelectSignUpField]
  }
  
  inline def Auth0LockAdditionalTextSignUpField(name: String, placeholder: String): typingsJapgolly.auth0Lock.Auth0LockAdditionalTextSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.auth0Lock.Auth0LockAdditionalTextSignUpField]
  }
}
