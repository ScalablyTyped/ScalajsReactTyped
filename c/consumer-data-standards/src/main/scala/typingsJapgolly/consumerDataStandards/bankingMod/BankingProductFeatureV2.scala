package typingsJapgolly.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.ADDITIONAL_CARDS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.BALANCE_TRANSFERS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.BILL_PAYMENT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.BONUS_REWARDS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.CARD_ACCESS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.CASHBACK_OFFER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.COMPLEMENTARY_PRODUCT_DISCOUNTS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DIGITAL_BANKING
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DIGITAL_WALLET
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.DONATE_INTEREST
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.EXTRA_REPAYMENTS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.FRAUD_PROTECTION
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.FREE_TXNS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.FREE_TXNS_ALLOWANCE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.GUARANTOR
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.INSTALMENT_PLAN
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.INSURANCE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.INTEREST_FREE
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.INTEREST_FREE_TRANSFERS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.LOYALTY_PROGRAM
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.NOTIFICATIONS
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.NPP_ENABLED
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.NPP_PAYID
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.OFFSET
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.OVERDRAFT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.REDRAW
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.RELATIONSHIP_MANAGEMENT
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.UNLIMITED_TXNS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingProductFeatureV2
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Display text providing more information on the feature. Mandatory if the [feature type](#tocSproductfeaturetypedoc) is set to OTHER
    */
  var additionalInfo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to a web page with more information on this feature
    */
  var additionalInfoUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Generic field containing additional information relevant to the [featureType](#tocSproductfeaturetypedoc) specified. Whether mandatory or not is dependent on the value of the [featureType.](#tocSproductfeaturetypedoc)
    */
  var additionalValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of feature described
    */
  var featureType: ADDITIONAL_CARDS | BALANCE_TRANSFERS | BILL_PAYMENT | BONUS_REWARDS | CARD_ACCESS | CASHBACK_OFFER | COMPLEMENTARY_PRODUCT_DISCOUNTS | DIGITAL_BANKING | DIGITAL_WALLET | DONATE_INTEREST | EXTRA_REPAYMENTS | FRAUD_PROTECTION | FREE_TXNS | FREE_TXNS_ALLOWANCE | GUARANTOR | INSURANCE | INSTALMENT_PLAN | INTEREST_FREE | INTEREST_FREE_TRANSFERS | LOYALTY_PROGRAM | NOTIFICATIONS | NPP_ENABLED | NPP_PAYID | OFFSET | OTHER | OVERDRAFT | REDRAW | RELATIONSHIP_MANAGEMENT | UNLIMITED_TXNS
}
object BankingProductFeatureV2 {
  
  inline def apply(
    featureType: ADDITIONAL_CARDS | BALANCE_TRANSFERS | BILL_PAYMENT | BONUS_REWARDS | CARD_ACCESS | CASHBACK_OFFER | COMPLEMENTARY_PRODUCT_DISCOUNTS | DIGITAL_BANKING | DIGITAL_WALLET | DONATE_INTEREST | EXTRA_REPAYMENTS | FRAUD_PROTECTION | FREE_TXNS | FREE_TXNS_ALLOWANCE | GUARANTOR | INSURANCE | INSTALMENT_PLAN | INTEREST_FREE | INTEREST_FREE_TRANSFERS | LOYALTY_PROGRAM | NOTIFICATIONS | NPP_ENABLED | NPP_PAYID | OFFSET | OTHER | OVERDRAFT | REDRAW | RELATIONSHIP_MANAGEMENT | UNLIMITED_TXNS
  ): BankingProductFeatureV2 = {
    val __obj = js.Dynamic.literal(featureType = featureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingProductFeatureV2]
  }
  
  extension [Self <: BankingProductFeatureV2](x: Self) {
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoNull: Self = StObject.set(x, "additionalInfo", null)
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAdditionalInfoUri(value: String): Self = StObject.set(x, "additionalInfoUri", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUriNull: Self = StObject.set(x, "additionalInfoUri", null)
    
    inline def setAdditionalInfoUriUndefined: Self = StObject.set(x, "additionalInfoUri", js.undefined)
    
    inline def setAdditionalValue(value: String): Self = StObject.set(x, "additionalValue", value.asInstanceOf[js.Any])
    
    inline def setAdditionalValueNull: Self = StObject.set(x, "additionalValue", null)
    
    inline def setAdditionalValueUndefined: Self = StObject.set(x, "additionalValue", js.undefined)
    
    inline def setFeatureType(
      value: ADDITIONAL_CARDS | BALANCE_TRANSFERS | BILL_PAYMENT | BONUS_REWARDS | CARD_ACCESS | CASHBACK_OFFER | COMPLEMENTARY_PRODUCT_DISCOUNTS | DIGITAL_BANKING | DIGITAL_WALLET | DONATE_INTEREST | EXTRA_REPAYMENTS | FRAUD_PROTECTION | FREE_TXNS | FREE_TXNS_ALLOWANCE | GUARANTOR | INSURANCE | INSTALMENT_PLAN | INTEREST_FREE | INTEREST_FREE_TRANSFERS | LOYALTY_PROGRAM | NOTIFICATIONS | NPP_ENABLED | NPP_PAYID | OFFSET | OTHER | OVERDRAFT | REDRAW | RELATIONSHIP_MANAGEMENT | UNLIMITED_TXNS
    ): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
  }
}
