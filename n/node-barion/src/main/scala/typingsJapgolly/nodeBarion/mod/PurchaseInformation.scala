package typingsJapgolly.nodeBarion.mod

import typingsJapgolly.nodeBarion.nodeBarionStrings.AccountFunding
import typingsJapgolly.nodeBarion.nodeBarionStrings.CheckAcceptance
import typingsJapgolly.nodeBarion.nodeBarionStrings.DigitalGoods
import typingsJapgolly.nodeBarion.nodeBarionStrings.ElectronicDelivery
import typingsJapgolly.nodeBarion.nodeBarionStrings.FirstTimeOrdered
import typingsJapgolly.nodeBarion.nodeBarionStrings.FutureAvailability
import typingsJapgolly.nodeBarion.nodeBarionStrings.GoodsAndServicePurchase
import typingsJapgolly.nodeBarion.nodeBarionStrings.MerchandiseAvailable
import typingsJapgolly.nodeBarion.nodeBarionStrings.Other
import typingsJapgolly.nodeBarion.nodeBarionStrings.OvernightShipping
import typingsJapgolly.nodeBarion.nodeBarionStrings.PrePaidVacationAndLoan
import typingsJapgolly.nodeBarion.nodeBarionStrings.QuasiCashTransaction
import typingsJapgolly.nodeBarion.nodeBarionStrings.Reordered
import typingsJapgolly.nodeBarion.nodeBarionStrings.SameDayShipping
import typingsJapgolly.nodeBarion.nodeBarionStrings.ShipToAnotherVerifiedAddress
import typingsJapgolly.nodeBarion.nodeBarionStrings.ShipToCardholdersBillingAddress
import typingsJapgolly.nodeBarion.nodeBarionStrings.ShipToDifferentAddress
import typingsJapgolly.nodeBarion.nodeBarionStrings.ShipToStore
import typingsJapgolly.nodeBarion.nodeBarionStrings.TravelAndEventTickets
import typingsJapgolly.nodeBarion.nodeBarionStrings.TwoDayOrMoreShipping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseInformation extends StObject {
  
  var AvailabilityIndicator: js.UndefOr[MerchandiseAvailable | FutureAvailability] = js.undefined
  
  var DeliveryEmailAddress: js.UndefOr[String] = js.undefined
  
  var DeliveryTimeframe: js.UndefOr[ElectronicDelivery | SameDayShipping | OvernightShipping | TwoDayOrMoreShipping] = js.undefined
  
  var GiftCardPurchase: js.UndefOr[typingsJapgolly.nodeBarion.mod.GiftCardPurchase] = js.undefined
  
  var PreOrderDate: js.UndefOr[js.Date] = js.undefined
  
  var PurchaseDate: js.UndefOr[js.Date] = js.undefined
  
  var PurchaseType: js.UndefOr[
    GoodsAndServicePurchase | CheckAcceptance | AccountFunding | QuasiCashTransaction | PrePaidVacationAndLoan
  ] = js.undefined
  
  var ReOrderIndicator: js.UndefOr[FirstTimeOrdered | Reordered] = js.undefined
  
  var RecurringExpiry: js.UndefOr[js.Date] = js.undefined
  
  var RecurringFrequency: js.UndefOr[Double] = js.undefined
  
  var ShippingAddressIndicator: js.UndefOr[
    ShipToCardholdersBillingAddress | ShipToAnotherVerifiedAddress | ShipToDifferentAddress | ShipToStore | DigitalGoods | TravelAndEventTickets | Other
  ] = js.undefined
}
object PurchaseInformation {
  
  inline def apply(): PurchaseInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseInformation]
  }
  
  extension [Self <: PurchaseInformation](x: Self) {
    
    inline def setAvailabilityIndicator(value: MerchandiseAvailable | FutureAvailability): Self = StObject.set(x, "AvailabilityIndicator", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityIndicatorUndefined: Self = StObject.set(x, "AvailabilityIndicator", js.undefined)
    
    inline def setDeliveryEmailAddress(value: String): Self = StObject.set(x, "DeliveryEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setDeliveryEmailAddressUndefined: Self = StObject.set(x, "DeliveryEmailAddress", js.undefined)
    
    inline def setDeliveryTimeframe(value: ElectronicDelivery | SameDayShipping | OvernightShipping | TwoDayOrMoreShipping): Self = StObject.set(x, "DeliveryTimeframe", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTimeframeUndefined: Self = StObject.set(x, "DeliveryTimeframe", js.undefined)
    
    inline def setGiftCardPurchase(value: GiftCardPurchase): Self = StObject.set(x, "GiftCardPurchase", value.asInstanceOf[js.Any])
    
    inline def setGiftCardPurchaseUndefined: Self = StObject.set(x, "GiftCardPurchase", js.undefined)
    
    inline def setPreOrderDate(value: js.Date): Self = StObject.set(x, "PreOrderDate", value.asInstanceOf[js.Any])
    
    inline def setPreOrderDateUndefined: Self = StObject.set(x, "PreOrderDate", js.undefined)
    
    inline def setPurchaseDate(value: js.Date): Self = StObject.set(x, "PurchaseDate", value.asInstanceOf[js.Any])
    
    inline def setPurchaseDateUndefined: Self = StObject.set(x, "PurchaseDate", js.undefined)
    
    inline def setPurchaseType(
      value: GoodsAndServicePurchase | CheckAcceptance | AccountFunding | QuasiCashTransaction | PrePaidVacationAndLoan
    ): Self = StObject.set(x, "PurchaseType", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTypeUndefined: Self = StObject.set(x, "PurchaseType", js.undefined)
    
    inline def setReOrderIndicator(value: FirstTimeOrdered | Reordered): Self = StObject.set(x, "ReOrderIndicator", value.asInstanceOf[js.Any])
    
    inline def setReOrderIndicatorUndefined: Self = StObject.set(x, "ReOrderIndicator", js.undefined)
    
    inline def setRecurringExpiry(value: js.Date): Self = StObject.set(x, "RecurringExpiry", value.asInstanceOf[js.Any])
    
    inline def setRecurringExpiryUndefined: Self = StObject.set(x, "RecurringExpiry", js.undefined)
    
    inline def setRecurringFrequency(value: Double): Self = StObject.set(x, "RecurringFrequency", value.asInstanceOf[js.Any])
    
    inline def setRecurringFrequencyUndefined: Self = StObject.set(x, "RecurringFrequency", js.undefined)
    
    inline def setShippingAddressIndicator(
      value: ShipToCardholdersBillingAddress | ShipToAnotherVerifiedAddress | ShipToDifferentAddress | ShipToStore | DigitalGoods | TravelAndEventTickets | Other
    ): Self = StObject.set(x, "ShippingAddressIndicator", value.asInstanceOf[js.Any])
    
    inline def setShippingAddressIndicatorUndefined: Self = StObject.set(x, "ShippingAddressIndicator", js.undefined)
  }
}
