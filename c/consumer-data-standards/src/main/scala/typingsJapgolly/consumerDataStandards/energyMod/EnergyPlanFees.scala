package typingsJapgolly.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.ANNUAL
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.BIANNUAL
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.CC_PROCESSING
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.CHEQUE_DISHONOUR
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.CONNECTION
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.CONTRIBUTION
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DAILY
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DD_DISHONOUR
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DISCONNECTION
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DISCONNECT_MOVE_OUT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DISCONNECT_NON_PAY
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.ESTABLISHMENT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.EXIT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.FIXED
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.LATE_PAYMENT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.MEMBERSHIP
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.MONTHLY
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.PAPER_BILL
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.PAYMENT_PROCESSING
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.PERCENT_OF_BILL
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.RECONNECTION
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.VARIABLE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.WEEKLY
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.`1_YEAR`
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.`2_YEAR`
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.`3_YEAR`
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.`4_YEAR`
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.`5_YEAR`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyPlanFees
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The fee amount. Required if term is not PERCENT_OF_BILL
    */
  var amount: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the fee
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The fee rate. Required if term is PERCENT_OF_BILL
    */
  var rate: js.UndefOr[String] = js.undefined
  
  /**
    * The term of the fee
    */
  var term: FIXED | `1_YEAR` | `2_YEAR` | `3_YEAR` | `4_YEAR` | `5_YEAR` | PERCENT_OF_BILL | ANNUAL | DAILY | WEEKLY | MONTHLY | BIANNUAL | VARIABLE
  
  /**
    * The type of the fee
    */
  var `type`: EXIT | ESTABLISHMENT | LATE_PAYMENT | DISCONNECTION | DISCONNECT_MOVE_OUT | DISCONNECT_NON_PAY | RECONNECTION | CONNECTION | PAYMENT_PROCESSING | CC_PROCESSING | CHEQUE_DISHONOUR | DD_DISHONOUR | MEMBERSHIP | CONTRIBUTION | PAPER_BILL | OTHER
}
object EnergyPlanFees {
  
  inline def apply(
    term: FIXED | `1_YEAR` | `2_YEAR` | `3_YEAR` | `4_YEAR` | `5_YEAR` | PERCENT_OF_BILL | ANNUAL | DAILY | WEEKLY | MONTHLY | BIANNUAL | VARIABLE,
    `type`: EXIT | ESTABLISHMENT | LATE_PAYMENT | DISCONNECTION | DISCONNECT_MOVE_OUT | DISCONNECT_NON_PAY | RECONNECTION | CONNECTION | PAYMENT_PROCESSING | CC_PROCESSING | CHEQUE_DISHONOUR | DD_DISHONOUR | MEMBERSHIP | CONTRIBUTION | PAPER_BILL | OTHER
  ): EnergyPlanFees = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyPlanFees]
  }
  
  extension [Self <: EnergyPlanFees](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setTerm(
      value: FIXED | `1_YEAR` | `2_YEAR` | `3_YEAR` | `4_YEAR` | `5_YEAR` | PERCENT_OF_BILL | ANNUAL | DAILY | WEEKLY | MONTHLY | BIANNUAL | VARIABLE
    ): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: EXIT | ESTABLISHMENT | LATE_PAYMENT | DISCONNECTION | DISCONNECT_MOVE_OUT | DISCONNECT_NON_PAY | RECONNECTION | CONNECTION | PAYMENT_PROCESSING | CC_PROCESSING | CHEQUE_DISHONOUR | DD_DISHONOUR | MEMBERSHIP | CONTRIBUTION | PAPER_BILL | OTHER
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
