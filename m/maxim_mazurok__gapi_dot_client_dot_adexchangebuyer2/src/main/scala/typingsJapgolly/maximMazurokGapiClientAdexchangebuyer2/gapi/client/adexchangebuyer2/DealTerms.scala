package typingsJapgolly.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DealTerms extends StObject {
  
  /** Visibility of the URL in bid requests. (default: BRANDED) */
  var brandingType: js.UndefOr[String] = js.undefined
  
  /** Publisher provided description for the terms. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Non-binding estimate of the estimated gross spend for this deal. Can be set by buyer or seller. */
  var estimatedGrossSpend: js.UndefOr[Price] = js.undefined
  
  /** Non-binding estimate of the impressions served per day. Can be set by buyer or seller. */
  var estimatedImpressionsPerDay: js.UndefOr[String] = js.undefined
  
  /** The terms for guaranteed fixed price deals. */
  var guaranteedFixedPriceTerms: js.UndefOr[GuaranteedFixedPriceTerms] = js.undefined
  
  /** The terms for non-guaranteed auction deals. */
  var nonGuaranteedAuctionTerms: js.UndefOr[NonGuaranteedAuctionTerms] = js.undefined
  
  /** The terms for non-guaranteed fixed price deals. */
  var nonGuaranteedFixedPriceTerms: js.UndefOr[NonGuaranteedFixedPriceTerms] = js.undefined
  
  /**
    * The time zone name. For deals with Cost Per Day billing, defines the time zone used to mark the boundaries of a day. It should be an IANA TZ name, such as "America/Los_Angeles". For
    * more information, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones.
    */
  var sellerTimeZone: js.UndefOr[String] = js.undefined
}
object DealTerms {
  
  inline def apply(): DealTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTerms]
  }
  
  extension [Self <: DealTerms](x: Self) {
    
    inline def setBrandingType(value: String): Self = StObject.set(x, "brandingType", value.asInstanceOf[js.Any])
    
    inline def setBrandingTypeUndefined: Self = StObject.set(x, "brandingType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEstimatedGrossSpend(value: Price): Self = StObject.set(x, "estimatedGrossSpend", value.asInstanceOf[js.Any])
    
    inline def setEstimatedGrossSpendUndefined: Self = StObject.set(x, "estimatedGrossSpend", js.undefined)
    
    inline def setEstimatedImpressionsPerDay(value: String): Self = StObject.set(x, "estimatedImpressionsPerDay", value.asInstanceOf[js.Any])
    
    inline def setEstimatedImpressionsPerDayUndefined: Self = StObject.set(x, "estimatedImpressionsPerDay", js.undefined)
    
    inline def setGuaranteedFixedPriceTerms(value: GuaranteedFixedPriceTerms): Self = StObject.set(x, "guaranteedFixedPriceTerms", value.asInstanceOf[js.Any])
    
    inline def setGuaranteedFixedPriceTermsUndefined: Self = StObject.set(x, "guaranteedFixedPriceTerms", js.undefined)
    
    inline def setNonGuaranteedAuctionTerms(value: NonGuaranteedAuctionTerms): Self = StObject.set(x, "nonGuaranteedAuctionTerms", value.asInstanceOf[js.Any])
    
    inline def setNonGuaranteedAuctionTermsUndefined: Self = StObject.set(x, "nonGuaranteedAuctionTerms", js.undefined)
    
    inline def setNonGuaranteedFixedPriceTerms(value: NonGuaranteedFixedPriceTerms): Self = StObject.set(x, "nonGuaranteedFixedPriceTerms", value.asInstanceOf[js.Any])
    
    inline def setNonGuaranteedFixedPriceTermsUndefined: Self = StObject.set(x, "nonGuaranteedFixedPriceTerms", js.undefined)
    
    inline def setSellerTimeZone(value: String): Self = StObject.set(x, "sellerTimeZone", value.asInstanceOf[js.Any])
    
    inline def setSellerTimeZoneUndefined: Self = StObject.set(x, "sellerTimeZone", js.undefined)
  }
}
