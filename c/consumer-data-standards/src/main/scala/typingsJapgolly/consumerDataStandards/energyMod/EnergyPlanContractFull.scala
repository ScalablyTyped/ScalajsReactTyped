package typingsJapgolly.consumerDataStandards.energyMod

import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.BPAY
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.CREDIT_CARD
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DIRECT_DEBIT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.FLEXIBLE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.FLEXIBLE_CONT_LOAD
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.ONGOING
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.PAPER_BILL
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.QUOTA
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SINGLE_RATE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.SINGLE_RATE_CONT_LOAD
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.TIME_OF_USE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.TIME_OF_USE_CONT_LOAD
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.`1_YEAR`
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.`2_YEAR`
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.`3_YEAR`
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.`4_YEAR`
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.`5_YEAR`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyPlanContractFull
  extends StObject
     with EnergyPlanContract {
  
  /**
    * Description of the benefit period.  Should only be present if termType has the value ONGOING
    */
  var benefitPeriod: js.UndefOr[String] = js.undefined
  
  /**
    * An array of the available billing schedules for this contract. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var billFrequency: js.Array[String]
  
  /**
    * Number of days in the cooling off period for the contract.  Mandatory for plans with type of MARKET
    */
  var coolingOffDays: js.UndefOr[Double] = js.undefined
  
  /**
    * An array of the meter types that this contract is available for
    */
  var meterTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The term for the contract.  If absent assumes no specified term
    */
  var termType: js.UndefOr[`1_YEAR` | `2_YEAR` | `3_YEAR` | `4_YEAR` | `5_YEAR` | ONGOING | OTHER] = js.undefined
  
  /**
    * Free text description of the terms for the contract
    */
  var terms: js.UndefOr[String] = js.undefined
}
object EnergyPlanContractFull {
  
  inline def apply(
    billFrequency: js.Array[String],
    isFixed: Boolean,
    paymentOption: js.Array[PAPER_BILL | CREDIT_CARD | DIRECT_DEBIT | BPAY | OTHER],
    pricingModel: SINGLE_RATE | SINGLE_RATE_CONT_LOAD | TIME_OF_USE | TIME_OF_USE_CONT_LOAD | FLEXIBLE | FLEXIBLE_CONT_LOAD | QUOTA,
    tariffPeriod: js.Array[EnergyPlanTariffPeriod]
  ): EnergyPlanContractFull = {
    val __obj = js.Dynamic.literal(billFrequency = billFrequency.asInstanceOf[js.Any], isFixed = isFixed.asInstanceOf[js.Any], paymentOption = paymentOption.asInstanceOf[js.Any], pricingModel = pricingModel.asInstanceOf[js.Any], tariffPeriod = tariffPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyPlanContractFull]
  }
  
  extension [Self <: EnergyPlanContractFull](x: Self) {
    
    inline def setBenefitPeriod(value: String): Self = StObject.set(x, "benefitPeriod", value.asInstanceOf[js.Any])
    
    inline def setBenefitPeriodUndefined: Self = StObject.set(x, "benefitPeriod", js.undefined)
    
    inline def setBillFrequency(value: js.Array[String]): Self = StObject.set(x, "billFrequency", value.asInstanceOf[js.Any])
    
    inline def setBillFrequencyVarargs(value: String*): Self = StObject.set(x, "billFrequency", js.Array(value*))
    
    inline def setCoolingOffDays(value: Double): Self = StObject.set(x, "coolingOffDays", value.asInstanceOf[js.Any])
    
    inline def setCoolingOffDaysUndefined: Self = StObject.set(x, "coolingOffDays", js.undefined)
    
    inline def setMeterTypes(value: js.Array[String]): Self = StObject.set(x, "meterTypes", value.asInstanceOf[js.Any])
    
    inline def setMeterTypesUndefined: Self = StObject.set(x, "meterTypes", js.undefined)
    
    inline def setMeterTypesVarargs(value: String*): Self = StObject.set(x, "meterTypes", js.Array(value*))
    
    inline def setTermType(value: `1_YEAR` | `2_YEAR` | `3_YEAR` | `4_YEAR` | `5_YEAR` | ONGOING | OTHER): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
    
    inline def setTermTypeUndefined: Self = StObject.set(x, "termType", js.undefined)
    
    inline def setTerms(value: String): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
  }
}
