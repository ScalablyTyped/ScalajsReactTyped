package typingsJapgolly.auth0Lock

import japgolly.scalajs.react.Callback
import typingsJapgolly.auth0Lock.anon.Hint
import typingsJapgolly.auth0Lock.auth0LockStrings.root
import typingsJapgolly.auth0Lock.auth0LockStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0LockAdditionalTextSignUpField
  extends StObject
     with Auth0LockAdditionalSignUpField {
  
  var icon: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var options: js.UndefOr[
    js.Array[Auth0LockAdditionalSignUpFieldOption] | Auth0LockAdditionalSignUpFieldOptionsFunction
  ] = js.undefined
  
  var placeholder: String
  
  var prefill: js.UndefOr[String | Auth0LockAdditionalSignUpFieldPrefillFunction] = js.undefined
  
  var storage: js.UndefOr[root] = js.undefined
  
  var `type`: js.UndefOr[text] = js.undefined
  
  var validator: js.UndefOr[js.Function1[/* input */ String, Hint]] = js.undefined
}
object Auth0LockAdditionalTextSignUpField {
  
  inline def apply(name: String, placeholder: String): Auth0LockAdditionalTextSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockAdditionalTextSignUpField]
  }
  
  extension [Self <: Auth0LockAdditionalTextSignUpField](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(
      value: js.Array[Auth0LockAdditionalSignUpFieldOption] | Auth0LockAdditionalSignUpFieldOptionsFunction
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsFunction1(value: /* callback */ Auth0LockAdditionalSignUpFieldOptionsCallback => Callback): Self = StObject.set(x, "options", js.Any.fromFunction1((t0: /* callback */ Auth0LockAdditionalSignUpFieldOptionsCallback) => value(t0).runNow()))
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Auth0LockAdditionalSignUpFieldOption*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPrefill(value: String | Auth0LockAdditionalSignUpFieldPrefillFunction): Self = StObject.set(x, "prefill", value.asInstanceOf[js.Any])
    
    inline def setPrefillFunction1(value: /* callback */ Auth0LockAdditionalSignUpFieldPrefillCallback => Callback): Self = StObject.set(x, "prefill", js.Any.fromFunction1((t0: /* callback */ Auth0LockAdditionalSignUpFieldPrefillCallback) => value(t0).runNow()))
    
    inline def setPrefillUndefined: Self = StObject.set(x, "prefill", js.undefined)
    
    inline def setStorage(value: root): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidator(value: /* input */ String => Hint): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
