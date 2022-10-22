package typingsJapgolly.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.CONDITIONAL
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DIRECT_DEBIT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.GUARANTEED
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.GUARANTEED_DISCOUNT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.PAY_ON_TIME
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.fixedAmount
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.percentOfBill
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.percentOfUse
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.percentOverThreshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The type of the discount.  Mandatory if the discount type is CONDITIONAL
    */
  var category: js.UndefOr[PAY_ON_TIME | DIRECT_DEBIT | GUARANTEED_DISCOUNT | OTHER] = js.undefined
  
  /**
    * The description of the discount
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The display name of the discount
    */
  var displayName: String
  
  /**
    * Optional end date for the discount after which the discount is no longer available
    */
  var endDate: js.UndefOr[String] = js.undefined
  
  /**
    * Required if methodUType is fixedAmount
    */
  var fixedAmount: js.UndefOr[DictkAmount] = js.undefined
  
  /**
    * The method of calculation of the discount
    */
  var methodUType: percentOfBill | percentOfUse | fixedAmount | percentOverThreshold
  
  /**
    * Required if methodUType is percentOfBill
    */
  var percentOfBill: js.UndefOr[Rate] = js.undefined
  
  /**
    * Required if methodUType is percentOfUse
    */
  var percentOfUse: js.UndefOr[Rate] = js.undefined
  
  /**
    * Required if methodUType is percentOverThreshold
    */
  var percentOverThreshold: js.UndefOr[UsageAmount] = js.undefined
  
  /**
    * The type of the discount
    */
  var `type`: CONDITIONAL | GUARANTEED | OTHER
}
object Category {
  
  inline def apply(
    displayName: String,
    methodUType: percentOfBill | percentOfUse | fixedAmount | percentOverThreshold,
    `type`: CONDITIONAL | GUARANTEED | OTHER
  ): Category = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], methodUType = methodUType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  extension [Self <: Category](x: Self) {
    
    inline def setCategory(value: PAY_ON_TIME | DIRECT_DEBIT | GUARANTEED_DISCOUNT | OTHER): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setFixedAmount(value: DictkAmount): Self = StObject.set(x, "fixedAmount", value.asInstanceOf[js.Any])
    
    inline def setFixedAmountUndefined: Self = StObject.set(x, "fixedAmount", js.undefined)
    
    inline def setMethodUType(value: percentOfBill | percentOfUse | fixedAmount | percentOverThreshold): Self = StObject.set(x, "methodUType", value.asInstanceOf[js.Any])
    
    inline def setPercentOfBill(value: Rate): Self = StObject.set(x, "percentOfBill", value.asInstanceOf[js.Any])
    
    inline def setPercentOfBillUndefined: Self = StObject.set(x, "percentOfBill", js.undefined)
    
    inline def setPercentOfUse(value: Rate): Self = StObject.set(x, "percentOfUse", value.asInstanceOf[js.Any])
    
    inline def setPercentOfUseUndefined: Self = StObject.set(x, "percentOfUse", js.undefined)
    
    inline def setPercentOverThreshold(value: UsageAmount): Self = StObject.set(x, "percentOverThreshold", value.asInstanceOf[js.Any])
    
    inline def setPercentOverThresholdUndefined: Self = StObject.set(x, "percentOverThreshold", js.undefined)
    
    inline def setType(value: CONDITIONAL | GUARANTEED | OTHER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
