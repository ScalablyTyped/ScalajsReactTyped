package typingsJapgolly.auth0Lock

import typingsJapgolly.auth0Lock.anon.Hint
import typingsJapgolly.auth0Lock.auth0LockStrings.`false`
import typingsJapgolly.auth0Lock.auth0LockStrings.`true`
import typingsJapgolly.auth0Lock.auth0LockStrings.checkbox
import typingsJapgolly.auth0Lock.auth0LockStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0LockAdditionalCheckboxSignUpField
  extends StObject
     with Auth0LockAdditionalSignUpField {
  
  var icon: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var placeholder: String
  
  var prefill: `true` | `false`
  
  var storage: js.UndefOr[root] = js.undefined
  
  var `type`: js.UndefOr[checkbox] = js.undefined
  
  var validator: js.UndefOr[js.Function1[/* input */ String, Hint]] = js.undefined
}
object Auth0LockAdditionalCheckboxSignUpField {
  
  inline def apply(name: String, placeholder: String, prefill: `true` | `false`): Auth0LockAdditionalCheckboxSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], prefill = prefill.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockAdditionalCheckboxSignUpField]
  }
  
  extension [Self <: Auth0LockAdditionalCheckboxSignUpField](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPrefill(value: `true` | `false`): Self = StObject.set(x, "prefill", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: root): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    inline def setType(value: checkbox): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidator(value: /* input */ String => Hint): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
