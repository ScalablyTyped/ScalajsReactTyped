package typingsJapgolly.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EligibilityResponseInsuranceBenefitBalanceFinancial
  extends StObject
     with BackboneElement {
  
  var _allowedString: js.UndefOr[Element] = js.undefined
  
  /**
    * Benefits allowed.
    */
  var allowedMoney: js.UndefOr[Money] = js.undefined
  
  /**
    * Benefits allowed.
    */
  var allowedString: js.UndefOr[String] = js.undefined
  
  /**
    * Benefits allowed.
    */
  var allowedUnsignedInt: js.UndefOr[Double] = js.undefined
  
  /**
    * Deductable, visits, benefit amount.
    */
  var `type`: CodeableConcept
  
  /**
    * Benefits used.
    */
  var usedMoney: js.UndefOr[Money] = js.undefined
  
  /**
    * Benefits used.
    */
  var usedUnsignedInt: js.UndefOr[Double] = js.undefined
}
object EligibilityResponseInsuranceBenefitBalanceFinancial {
  
  inline def apply(`type`: CodeableConcept): EligibilityResponseInsuranceBenefitBalanceFinancial = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EligibilityResponseInsuranceBenefitBalanceFinancial]
  }
  
  extension [Self <: EligibilityResponseInsuranceBenefitBalanceFinancial](x: Self) {
    
    inline def setAllowedMoney(value: Money): Self = StObject.set(x, "allowedMoney", value.asInstanceOf[js.Any])
    
    inline def setAllowedMoneyUndefined: Self = StObject.set(x, "allowedMoney", js.undefined)
    
    inline def setAllowedString(value: String): Self = StObject.set(x, "allowedString", value.asInstanceOf[js.Any])
    
    inline def setAllowedStringUndefined: Self = StObject.set(x, "allowedString", js.undefined)
    
    inline def setAllowedUnsignedInt(value: Double): Self = StObject.set(x, "allowedUnsignedInt", value.asInstanceOf[js.Any])
    
    inline def setAllowedUnsignedIntUndefined: Self = StObject.set(x, "allowedUnsignedInt", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsedMoney(value: Money): Self = StObject.set(x, "usedMoney", value.asInstanceOf[js.Any])
    
    inline def setUsedMoneyUndefined: Self = StObject.set(x, "usedMoney", js.undefined)
    
    inline def setUsedUnsignedInt(value: Double): Self = StObject.set(x, "usedUnsignedInt", value.asInstanceOf[js.Any])
    
    inline def setUsedUnsignedIntUndefined: Self = StObject.set(x, "usedUnsignedInt", js.undefined)
    
    inline def set_allowedString(value: Element): Self = StObject.set(x, "_allowedString", value.asInstanceOf[js.Any])
    
    inline def set_allowedStringUndefined: Self = StObject.set(x, "_allowedString", js.undefined)
  }
}
