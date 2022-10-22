package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Secretscanning extends StObject {
  
  /** @description Use the `status` property to enable or disable GitHub Advanced Security for this repository. For more information, see "[About GitHub Advanced Security](/github/getting-started-with-github/learning-about-github/about-github-advanced-security)." */
  var advanced_security: js.UndefOr[`77`] = js.undefined
  
  /** @description Use the `status` property to enable or disable secret scanning for this repository. For more information, see "[About secret scanning](/code-security/secret-security/about-secret-scanning)." */
  var secret_scanning: js.UndefOr[`77`] = js.undefined
  
  /** @description Use the `status` property to enable or disable secret scanning push protection for this repository. For more information, see "[Protecting pushes with secret scanning](/code-security/secret-scanning/protecting-pushes-with-secret-scanning)." */
  var secret_scanning_push_protection: js.UndefOr[`77`] = js.undefined
}
object Secretscanning {
  
  inline def apply(): Secretscanning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Secretscanning]
  }
  
  extension [Self <: Secretscanning](x: Self) {
    
    inline def setAdvanced_security(value: `77`): Self = StObject.set(x, "advanced_security", value.asInstanceOf[js.Any])
    
    inline def setAdvanced_securityUndefined: Self = StObject.set(x, "advanced_security", js.undefined)
    
    inline def setSecret_scanning(value: `77`): Self = StObject.set(x, "secret_scanning", value.asInstanceOf[js.Any])
    
    inline def setSecret_scanningUndefined: Self = StObject.set(x, "secret_scanning", js.undefined)
    
    inline def setSecret_scanning_push_protection(value: `77`): Self = StObject.set(x, "secret_scanning_push_protection", value.asInstanceOf[js.Any])
    
    inline def setSecret_scanning_push_protectionUndefined: Self = StObject.set(x, "secret_scanning_push_protection", js.undefined)
  }
}
