package typingsJapgolly.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.BUSINESS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.EMPLOYMENT_STATUS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.INTRODUCTORY
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.MAX_AGE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.MIN_AGE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.MIN_INCOME
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.MIN_TURNOVER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.NATURAL_PERSON
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.PENSION_RECIPIENT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.RESIDENCY_STATUS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.STAFF
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.STUDENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingProductDiscountEligibility
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Display text providing more information on this eligibility constraint. Whether mandatory or not is dependent on the value of [discountEligibilityType](#tocSproductdiscounteligibilitydoc)
    */
  var additionalInfo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to a web page with more information on this eligibility constraint
    */
  var additionalInfoUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Generic field containing additional information relevant to the [discountEligibilityType](#tocSproductdiscounteligibilitydoc) specified. Whether mandatory or not is dependent on the value of [discountEligibilityType](#tocSproductdiscounteligibilitydoc)
    */
  var additionalValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the specific eligibility constraint for a discount
    */
  var discountEligibilityType: BUSINESS | EMPLOYMENT_STATUS | INTRODUCTORY | MAX_AGE | MIN_AGE | MIN_INCOME | MIN_TURNOVER | NATURAL_PERSON | OTHER | PENSION_RECIPIENT | RESIDENCY_STATUS | STAFF | STUDENT
}
object BankingProductDiscountEligibility {
  
  inline def apply(
    discountEligibilityType: BUSINESS | EMPLOYMENT_STATUS | INTRODUCTORY | MAX_AGE | MIN_AGE | MIN_INCOME | MIN_TURNOVER | NATURAL_PERSON | OTHER | PENSION_RECIPIENT | RESIDENCY_STATUS | STAFF | STUDENT
  ): BankingProductDiscountEligibility = {
    val __obj = js.Dynamic.literal(discountEligibilityType = discountEligibilityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingProductDiscountEligibility]
  }
  
  extension [Self <: BankingProductDiscountEligibility](x: Self) {
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoNull: Self = StObject.set(x, "additionalInfo", null)
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAdditionalInfoUri(value: String): Self = StObject.set(x, "additionalInfoUri", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUriNull: Self = StObject.set(x, "additionalInfoUri", null)
    
    inline def setAdditionalInfoUriUndefined: Self = StObject.set(x, "additionalInfoUri", js.undefined)
    
    inline def setAdditionalValue(value: String): Self = StObject.set(x, "additionalValue", value.asInstanceOf[js.Any])
    
    inline def setAdditionalValueNull: Self = StObject.set(x, "additionalValue", null)
    
    inline def setAdditionalValueUndefined: Self = StObject.set(x, "additionalValue", js.undefined)
    
    inline def setDiscountEligibilityType(
      value: BUSINESS | EMPLOYMENT_STATUS | INTRODUCTORY | MAX_AGE | MIN_AGE | MIN_INCOME | MIN_TURNOVER | NATURAL_PERSON | OTHER | PENSION_RECIPIENT | RESIDENCY_STATUS | STAFF | STUDENT
    ): Self = StObject.set(x, "discountEligibilityType", value.asInstanceOf[js.Any])
  }
}
