package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.hyperformulaStrings.expired
import typingsJapgolly.hyperformula.hyperformulaStrings.invalid
import typingsJapgolly.hyperformula.hyperformulaStrings.missing
import typingsJapgolly.hyperformula.hyperformulaStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsHelpersLicenseKeyValidatorMod {
  
  @JSImport("hyperformula/typings/helpers/licenseKeyValidator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkLicenseKeyValidity(licenseKey: String): LicenseKeyValidityState = ^.asInstanceOf[js.Dynamic].applyDynamic("checkLicenseKeyValidity")(licenseKey.asInstanceOf[js.Any]).asInstanceOf[LicenseKeyValidityState]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hyperformula.hyperformulaStrings.valid
    - typingsJapgolly.hyperformula.hyperformulaStrings.invalid
    - typingsJapgolly.hyperformula.hyperformulaStrings.expired
    - typingsJapgolly.hyperformula.hyperformulaStrings.missing
  */
  trait LicenseKeyValidityState extends StObject
  object LicenseKeyValidityState {
    
    inline def EXPIRED: expired = "expired".asInstanceOf[expired]
    
    inline def INVALID: invalid = "invalid".asInstanceOf[invalid]
    
    inline def MISSING: missing = "missing".asInstanceOf[missing]
    
    inline def VALID: valid = "valid".asInstanceOf[valid]
  }
}
