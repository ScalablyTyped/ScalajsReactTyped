package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Product extends StObject {
  
  /** Additional URLs of images of the item. */
  var additionalImageLinks: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Additional cut of the item. Used together with size_type to represent combined size types for apparel items. */
  var additionalSizeType: js.UndefOr[String] = js.undefined
  
  /** Used to group items in an arbitrary way. Only for CPA%, discouraged otherwise. */
  var adsGrouping: js.UndefOr[String] = js.undefined
  
  /** Similar to ads_grouping, but only works on CPC. */
  var adsLabels: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Allows advertisers to override the item URL when the product is shown within the context of Product Ads. */
  var adsRedirect: js.UndefOr[String] = js.undefined
  
  /** Should be set to true if the item is targeted towards adults. */
  var adult: js.UndefOr[Boolean] = js.undefined
  
  /** Target age group of the item. */
  var ageGroup: js.UndefOr[String] = js.undefined
  
  /** Availability status of the item. */
  var availability: js.UndefOr[String] = js.undefined
  
  /** The day a pre-ordered product becomes available for delivery, in ISO 8601 format. */
  var availabilityDate: js.UndefOr[String] = js.undefined
  
  /** Brand of the item. */
  var brand: js.UndefOr[String] = js.undefined
  
  /** URL for the canonical version of your item's landing page. */
  var canonicalLink: js.UndefOr[String] = js.undefined
  
  /** Required. The item's channel (online or local). Acceptable values are: - "`local`" - "`online`" */
  var channel: js.UndefOr[String] = js.undefined
  
  /** Color of the item. */
  var color: js.UndefOr[String] = js.undefined
  
  /** Condition or state of the item. */
  var condition: js.UndefOr[String] = js.undefined
  
  /** Required. The two-letter ISO 639-1 language code for the item. */
  var contentLanguage: js.UndefOr[String] = js.undefined
  
  /** Cost of goods sold. Used for gross profit reporting. */
  var costOfGoodsSold: js.UndefOr[Price] = js.undefined
  
  /**
    * A list of custom (merchant-provided) attributes. It can also be used for submitting any attribute of the feed specification in its generic form (for example, `{ "name": "size type",
    * "value": "regular" }`). This is useful for submitting attributes not explicitly exposed by the API, such as additional attributes used for Buy on Google (formerly known as Shopping
    * Actions).
    */
  var customAttributes: js.UndefOr[js.Array[CustomAttribute]] = js.undefined
  
  /** Custom label 0 for custom grouping of items in a Shopping campaign. */
  var customLabel0: js.UndefOr[String] = js.undefined
  
  /** Custom label 1 for custom grouping of items in a Shopping campaign. */
  var customLabel1: js.UndefOr[String] = js.undefined
  
  /** Custom label 2 for custom grouping of items in a Shopping campaign. */
  var customLabel2: js.UndefOr[String] = js.undefined
  
  /** Custom label 3 for custom grouping of items in a Shopping campaign. */
  var customLabel3: js.UndefOr[String] = js.undefined
  
  /** Custom label 4 for custom grouping of items in a Shopping campaign. */
  var customLabel4: js.UndefOr[String] = js.undefined
  
  /** Description of the item. */
  var description: js.UndefOr[String] = js.undefined
  
  /** An identifier for an item for dynamic remarketing campaigns. */
  var displayAdsId: js.UndefOr[String] = js.undefined
  
  /** URL directly to your item's landing page for dynamic remarketing campaigns. */
  var displayAdsLink: js.UndefOr[String] = js.undefined
  
  /** Advertiser-specified recommendations. */
  var displayAdsSimilarIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Title of an item for dynamic remarketing campaigns. */
  var displayAdsTitle: js.UndefOr[String] = js.undefined
  
  /** Offer margin for dynamic remarketing campaigns. */
  var displayAdsValue: js.UndefOr[Double] = js.undefined
  
  /** The energy efficiency class as defined in EU directive 2010/30/EU. */
  var energyEfficiencyClass: js.UndefOr[String] = js.undefined
  
  /** The list of destinations to exclude for this target (corresponds to cleared check boxes in Merchant Center). */
  var excludedDestinations: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Date on which the item should expire, as specified upon insertion, in ISO 8601 format. The actual expiration date in Google Shopping is exposed in `productstatuses` as
    * `googleExpirationDate` and might be earlier if `expirationDate` is too far in the future.
    */
  var expirationDate: js.UndefOr[String] = js.undefined
  
  /** Required for multi-seller accounts. Use this attribute if you're a marketplace uploading products for various sellers to your multi-seller account. */
  var externalSellerId: js.UndefOr[String] = js.undefined
  
  /** Feed label for the item. Either `targetCountry` or `feedLabel` is required. */
  var feedLabel: js.UndefOr[String] = js.undefined
  
  /** Target gender of the item. */
  var gender: js.UndefOr[String] = js.undefined
  
  /**
    * Google's category of the item (see [Google product taxonomy](https://support.google.com/merchants/answer/1705911)). When querying products, this field will contain the user provided
    * value. There is currently no way to get back the auto assigned google product categories through the API.
    */
  var googleProductCategory: js.UndefOr[String] = js.undefined
  
  /** Global Trade Item Number (GTIN) of the item. */
  var gtin: js.UndefOr[String] = js.undefined
  
  /**
    * The REST ID of the product. Content API methods that operate on products take this as their `productId` parameter. The REST ID for a product is of the form channel:contentLanguage:
    * targetCountry: offerId.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * False when the item does not have unique product identifiers appropriate to its category, such as GTIN, MPN, and brand. Required according to the Unique Product Identifier Rules for
    * all target countries except for Canada.
    */
  var identifierExists: js.UndefOr[Boolean] = js.undefined
  
  /** URL of an image of the item. */
  var imageLink: js.UndefOr[String] = js.undefined
  
  /**
    * The list of destinations to include for this target (corresponds to checked check boxes in Merchant Center). Default destinations are always included unless provided in
    * `excludedDestinations`.
    */
  var includedDestinations: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Number and amount of installments to pay for an item. */
  var installment: js.UndefOr[Installment] = js.undefined
  
  /** Whether the item is a merchant-defined bundle. A bundle is a custom grouping of different products sold by a merchant for a single price. */
  var isBundle: js.UndefOr[Boolean] = js.undefined
  
  /** Shared identifier for all variants of the same product. */
  var itemGroupId: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#product`" */
  var kind: js.UndefOr[String] = js.undefined
  
  /** URL directly linking to your item's page on your website. */
  var link: js.UndefOr[String] = js.undefined
  
  /** URL template for merchant hosted local storefront. */
  var linkTemplate: js.UndefOr[String] = js.undefined
  
  /** Loyalty points that users receive after purchasing the item. Japan only. */
  var loyaltyPoints: js.UndefOr[LoyaltyPoints] = js.undefined
  
  /** The material of which the item is made. */
  var material: js.UndefOr[String] = js.undefined
  
  /** The energy efficiency class as defined in EU directive 2010/30/EU. */
  var maxEnergyEfficiencyClass: js.UndefOr[String] = js.undefined
  
  /** Maximal product handling time (in business days). */
  var maxHandlingTime: js.UndefOr[String] = js.undefined
  
  /** The energy efficiency class as defined in EU directive 2010/30/EU. */
  var minEnergyEfficiencyClass: js.UndefOr[String] = js.undefined
  
  /** Minimal product handling time (in business days). */
  var minHandlingTime: js.UndefOr[String] = js.undefined
  
  /** URL for the mobile-optimized version of your item's landing page. */
  var mobileLink: js.UndefOr[String] = js.undefined
  
  /** URL template for merchant hosted local storefront optimized for mobile devices. */
  var mobileLinkTemplate: js.UndefOr[String] = js.undefined
  
  /** Manufacturer Part Number (MPN) of the item. */
  var mpn: js.UndefOr[String] = js.undefined
  
  /** The number of identical products in a merchant-defined multipack. */
  var multipack: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A unique identifier for the item. Leading and trailing whitespaces are stripped and multiple whitespaces are replaced by a single whitespace upon submission. Only valid
    * unicode characters are accepted. See the products feed specification for details. *Note:* Content API methods that operate on products take the REST ID of the product, *not* this
    * identifier.
    */
  var offerId: js.UndefOr[String] = js.undefined
  
  /** The item's pattern (for example, polka dots). */
  var pattern: js.UndefOr[String] = js.undefined
  
  /** Publication of this item should be temporarily paused. Acceptable values are: - "`ads`" */
  var pause: js.UndefOr[String] = js.undefined
  
  /** The pick up option for the item. Acceptable values are: - "`buy`" - "`reserve`" - "`ship to store`" - "`not supported`" */
  var pickupMethod: js.UndefOr[String] = js.undefined
  
  /** Item store pickup timeline. Acceptable values are: - "`same day`" - "`next day`" - "`2-day`" - "`3-day`" - "`4-day`" - "`5-day`" - "`6-day`" - "`7-day`" - "`multi-week`" */
  var pickupSla: js.UndefOr[String] = js.undefined
  
  /** Price of the item. */
  var price: js.UndefOr[Price] = js.undefined
  
  /** Technical specification or additional product details. */
  var productDetails: js.UndefOr[js.Array[ProductProductDetail]] = js.undefined
  
  /** The height of the product in the units provided. The value must be between 0 (exclusive) and 3000 (inclusive). */
  var productHeight: js.UndefOr[ProductDimension] = js.undefined
  
  /** Bullet points describing the most relevant highlights of a product. */
  var productHighlights: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The length of the product in the units provided. The value must be between 0 (exclusive) and 3000 (inclusive). */
  var productLength: js.UndefOr[ProductDimension] = js.undefined
  
  /** Categories of the item (formatted as in products data specification). */
  var productTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The weight of the product in the units provided. The value must be between 0 (exclusive) and 2000 (inclusive). */
  var productWeight: js.UndefOr[ProductWeight] = js.undefined
  
  /** The width of the product in the units provided. The value must be between 0 (exclusive) and 3000 (inclusive). */
  var productWidth: js.UndefOr[ProductDimension] = js.undefined
  
  /** The unique ID of a promotion. */
  var promotionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Advertised sale price of the item. */
  var salePrice: js.UndefOr[Price] = js.undefined
  
  /** Date range during which the item is on sale (see products data specification ). */
  var salePriceEffectiveDate: js.UndefOr[String] = js.undefined
  
  /** The quantity of the product that is available for selling on Google. Supported only for online products. */
  var sellOnGoogleQuantity: js.UndefOr[String] = js.undefined
  
  /** Shipping rules. */
  var shipping: js.UndefOr[js.Array[ProductShipping]] = js.undefined
  
  /** Height of the item for shipping. */
  var shippingHeight: js.UndefOr[ProductShippingDimension] = js.undefined
  
  /** The shipping label of the product, used to group product in account-level shipping rules. */
  var shippingLabel: js.UndefOr[String] = js.undefined
  
  /** Length of the item for shipping. */
  var shippingLength: js.UndefOr[ProductShippingDimension] = js.undefined
  
  /** Weight of the item for shipping. */
  var shippingWeight: js.UndefOr[ProductShippingWeight] = js.undefined
  
  /** Width of the item for shipping. */
  var shippingWidth: js.UndefOr[ProductShippingDimension] = js.undefined
  
  /** List of country codes (ISO 3166-1 alpha-2) to exclude the offer from Shopping Ads destination. Countries from this list are removed from countries configured in MC feed settings. */
  var shoppingAdsExcludedCountries: js.UndefOr[js.Array[String]] = js.undefined
  
  /** System in which the size is specified. Recommended for apparel items. */
  var sizeSystem: js.UndefOr[String] = js.undefined
  
  /** The cut of the item. Recommended for apparel items. */
  var sizeType: js.UndefOr[String] = js.undefined
  
  /** Size of the item. Only one value is allowed. For variants with different sizes, insert a separate product for each size with the same `itemGroupId` value (see size definition). */
  var sizes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The source of the offer, that is, how the offer was created. Acceptable values are: - "`api`" - "`crawl`" - "`feed`" */
  var source: js.UndefOr[String] = js.undefined
  
  /** Number of periods (months or years) and amount of payment per period for an item with an associated subscription contract. */
  var subscriptionCost: js.UndefOr[ProductSubscriptionCost] = js.undefined
  
  /** Required. The CLDR territory code for the item. */
  var targetCountry: js.UndefOr[String] = js.undefined
  
  /** The tax category of the product, used to configure detailed tax nexus in account-level tax settings. */
  var taxCategory: js.UndefOr[String] = js.undefined
  
  /** Tax information. */
  var taxes: js.UndefOr[js.Array[ProductTax]] = js.undefined
  
  /** Title of the item. */
  var title: js.UndefOr[String] = js.undefined
  
  /** The transit time label of the product, used to group product in account-level transit time tables. */
  var transitTimeLabel: js.UndefOr[String] = js.undefined
  
  /** The preference of the denominator of the unit price. */
  var unitPricingBaseMeasure: js.UndefOr[ProductUnitPricingBaseMeasure] = js.undefined
  
  /** The measure and dimension of an item. */
  var unitPricingMeasure: js.UndefOr[ProductUnitPricingMeasure] = js.undefined
}
object Product {
  
  inline def apply(): Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Product]
  }
  
  extension [Self <: Product](x: Self) {
    
    inline def setAdditionalImageLinks(value: js.Array[String]): Self = StObject.set(x, "additionalImageLinks", value.asInstanceOf[js.Any])
    
    inline def setAdditionalImageLinksUndefined: Self = StObject.set(x, "additionalImageLinks", js.undefined)
    
    inline def setAdditionalImageLinksVarargs(value: String*): Self = StObject.set(x, "additionalImageLinks", js.Array(value*))
    
    inline def setAdditionalSizeType(value: String): Self = StObject.set(x, "additionalSizeType", value.asInstanceOf[js.Any])
    
    inline def setAdditionalSizeTypeUndefined: Self = StObject.set(x, "additionalSizeType", js.undefined)
    
    inline def setAdsGrouping(value: String): Self = StObject.set(x, "adsGrouping", value.asInstanceOf[js.Any])
    
    inline def setAdsGroupingUndefined: Self = StObject.set(x, "adsGrouping", js.undefined)
    
    inline def setAdsLabels(value: js.Array[String]): Self = StObject.set(x, "adsLabels", value.asInstanceOf[js.Any])
    
    inline def setAdsLabelsUndefined: Self = StObject.set(x, "adsLabels", js.undefined)
    
    inline def setAdsLabelsVarargs(value: String*): Self = StObject.set(x, "adsLabels", js.Array(value*))
    
    inline def setAdsRedirect(value: String): Self = StObject.set(x, "adsRedirect", value.asInstanceOf[js.Any])
    
    inline def setAdsRedirectUndefined: Self = StObject.set(x, "adsRedirect", js.undefined)
    
    inline def setAdult(value: Boolean): Self = StObject.set(x, "adult", value.asInstanceOf[js.Any])
    
    inline def setAdultUndefined: Self = StObject.set(x, "adult", js.undefined)
    
    inline def setAgeGroup(value: String): Self = StObject.set(x, "ageGroup", value.asInstanceOf[js.Any])
    
    inline def setAgeGroupUndefined: Self = StObject.set(x, "ageGroup", js.undefined)
    
    inline def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityDate(value: String): Self = StObject.set(x, "availabilityDate", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityDateUndefined: Self = StObject.set(x, "availabilityDate", js.undefined)
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setCanonicalLink(value: String): Self = StObject.set(x, "canonicalLink", value.asInstanceOf[js.Any])
    
    inline def setCanonicalLinkUndefined: Self = StObject.set(x, "canonicalLink", js.undefined)
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    inline def setCostOfGoodsSold(value: Price): Self = StObject.set(x, "costOfGoodsSold", value.asInstanceOf[js.Any])
    
    inline def setCostOfGoodsSoldUndefined: Self = StObject.set(x, "costOfGoodsSold", js.undefined)
    
    inline def setCustomAttributes(value: js.Array[CustomAttribute]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    inline def setCustomAttributesVarargs(value: CustomAttribute*): Self = StObject.set(x, "customAttributes", js.Array(value*))
    
    inline def setCustomLabel0(value: String): Self = StObject.set(x, "customLabel0", value.asInstanceOf[js.Any])
    
    inline def setCustomLabel0Undefined: Self = StObject.set(x, "customLabel0", js.undefined)
    
    inline def setCustomLabel1(value: String): Self = StObject.set(x, "customLabel1", value.asInstanceOf[js.Any])
    
    inline def setCustomLabel1Undefined: Self = StObject.set(x, "customLabel1", js.undefined)
    
    inline def setCustomLabel2(value: String): Self = StObject.set(x, "customLabel2", value.asInstanceOf[js.Any])
    
    inline def setCustomLabel2Undefined: Self = StObject.set(x, "customLabel2", js.undefined)
    
    inline def setCustomLabel3(value: String): Self = StObject.set(x, "customLabel3", value.asInstanceOf[js.Any])
    
    inline def setCustomLabel3Undefined: Self = StObject.set(x, "customLabel3", js.undefined)
    
    inline def setCustomLabel4(value: String): Self = StObject.set(x, "customLabel4", value.asInstanceOf[js.Any])
    
    inline def setCustomLabel4Undefined: Self = StObject.set(x, "customLabel4", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayAdsId(value: String): Self = StObject.set(x, "displayAdsId", value.asInstanceOf[js.Any])
    
    inline def setDisplayAdsIdUndefined: Self = StObject.set(x, "displayAdsId", js.undefined)
    
    inline def setDisplayAdsLink(value: String): Self = StObject.set(x, "displayAdsLink", value.asInstanceOf[js.Any])
    
    inline def setDisplayAdsLinkUndefined: Self = StObject.set(x, "displayAdsLink", js.undefined)
    
    inline def setDisplayAdsSimilarIds(value: js.Array[String]): Self = StObject.set(x, "displayAdsSimilarIds", value.asInstanceOf[js.Any])
    
    inline def setDisplayAdsSimilarIdsUndefined: Self = StObject.set(x, "displayAdsSimilarIds", js.undefined)
    
    inline def setDisplayAdsSimilarIdsVarargs(value: String*): Self = StObject.set(x, "displayAdsSimilarIds", js.Array(value*))
    
    inline def setDisplayAdsTitle(value: String): Self = StObject.set(x, "displayAdsTitle", value.asInstanceOf[js.Any])
    
    inline def setDisplayAdsTitleUndefined: Self = StObject.set(x, "displayAdsTitle", js.undefined)
    
    inline def setDisplayAdsValue(value: Double): Self = StObject.set(x, "displayAdsValue", value.asInstanceOf[js.Any])
    
    inline def setDisplayAdsValueUndefined: Self = StObject.set(x, "displayAdsValue", js.undefined)
    
    inline def setEnergyEfficiencyClass(value: String): Self = StObject.set(x, "energyEfficiencyClass", value.asInstanceOf[js.Any])
    
    inline def setEnergyEfficiencyClassUndefined: Self = StObject.set(x, "energyEfficiencyClass", js.undefined)
    
    inline def setExcludedDestinations(value: js.Array[String]): Self = StObject.set(x, "excludedDestinations", value.asInstanceOf[js.Any])
    
    inline def setExcludedDestinationsUndefined: Self = StObject.set(x, "excludedDestinations", js.undefined)
    
    inline def setExcludedDestinationsVarargs(value: String*): Self = StObject.set(x, "excludedDestinations", js.Array(value*))
    
    inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setExternalSellerId(value: String): Self = StObject.set(x, "externalSellerId", value.asInstanceOf[js.Any])
    
    inline def setExternalSellerIdUndefined: Self = StObject.set(x, "externalSellerId", js.undefined)
    
    inline def setFeedLabel(value: String): Self = StObject.set(x, "feedLabel", value.asInstanceOf[js.Any])
    
    inline def setFeedLabelUndefined: Self = StObject.set(x, "feedLabel", js.undefined)
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setGoogleProductCategory(value: String): Self = StObject.set(x, "googleProductCategory", value.asInstanceOf[js.Any])
    
    inline def setGoogleProductCategoryUndefined: Self = StObject.set(x, "googleProductCategory", js.undefined)
    
    inline def setGtin(value: String): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    inline def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdentifierExists(value: Boolean): Self = StObject.set(x, "identifierExists", value.asInstanceOf[js.Any])
    
    inline def setIdentifierExistsUndefined: Self = StObject.set(x, "identifierExists", js.undefined)
    
    inline def setImageLink(value: String): Self = StObject.set(x, "imageLink", value.asInstanceOf[js.Any])
    
    inline def setImageLinkUndefined: Self = StObject.set(x, "imageLink", js.undefined)
    
    inline def setIncludedDestinations(value: js.Array[String]): Self = StObject.set(x, "includedDestinations", value.asInstanceOf[js.Any])
    
    inline def setIncludedDestinationsUndefined: Self = StObject.set(x, "includedDestinations", js.undefined)
    
    inline def setIncludedDestinationsVarargs(value: String*): Self = StObject.set(x, "includedDestinations", js.Array(value*))
    
    inline def setInstallment(value: Installment): Self = StObject.set(x, "installment", value.asInstanceOf[js.Any])
    
    inline def setInstallmentUndefined: Self = StObject.set(x, "installment", js.undefined)
    
    inline def setIsBundle(value: Boolean): Self = StObject.set(x, "isBundle", value.asInstanceOf[js.Any])
    
    inline def setIsBundleUndefined: Self = StObject.set(x, "isBundle", js.undefined)
    
    inline def setItemGroupId(value: String): Self = StObject.set(x, "itemGroupId", value.asInstanceOf[js.Any])
    
    inline def setItemGroupIdUndefined: Self = StObject.set(x, "itemGroupId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkTemplate(value: String): Self = StObject.set(x, "linkTemplate", value.asInstanceOf[js.Any])
    
    inline def setLinkTemplateUndefined: Self = StObject.set(x, "linkTemplate", js.undefined)
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLoyaltyPoints(value: LoyaltyPoints): Self = StObject.set(x, "loyaltyPoints", value.asInstanceOf[js.Any])
    
    inline def setLoyaltyPointsUndefined: Self = StObject.set(x, "loyaltyPoints", js.undefined)
    
    inline def setMaterial(value: String): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setMaxEnergyEfficiencyClass(value: String): Self = StObject.set(x, "maxEnergyEfficiencyClass", value.asInstanceOf[js.Any])
    
    inline def setMaxEnergyEfficiencyClassUndefined: Self = StObject.set(x, "maxEnergyEfficiencyClass", js.undefined)
    
    inline def setMaxHandlingTime(value: String): Self = StObject.set(x, "maxHandlingTime", value.asInstanceOf[js.Any])
    
    inline def setMaxHandlingTimeUndefined: Self = StObject.set(x, "maxHandlingTime", js.undefined)
    
    inline def setMinEnergyEfficiencyClass(value: String): Self = StObject.set(x, "minEnergyEfficiencyClass", value.asInstanceOf[js.Any])
    
    inline def setMinEnergyEfficiencyClassUndefined: Self = StObject.set(x, "minEnergyEfficiencyClass", js.undefined)
    
    inline def setMinHandlingTime(value: String): Self = StObject.set(x, "minHandlingTime", value.asInstanceOf[js.Any])
    
    inline def setMinHandlingTimeUndefined: Self = StObject.set(x, "minHandlingTime", js.undefined)
    
    inline def setMobileLink(value: String): Self = StObject.set(x, "mobileLink", value.asInstanceOf[js.Any])
    
    inline def setMobileLinkTemplate(value: String): Self = StObject.set(x, "mobileLinkTemplate", value.asInstanceOf[js.Any])
    
    inline def setMobileLinkTemplateUndefined: Self = StObject.set(x, "mobileLinkTemplate", js.undefined)
    
    inline def setMobileLinkUndefined: Self = StObject.set(x, "mobileLink", js.undefined)
    
    inline def setMpn(value: String): Self = StObject.set(x, "mpn", value.asInstanceOf[js.Any])
    
    inline def setMpnUndefined: Self = StObject.set(x, "mpn", js.undefined)
    
    inline def setMultipack(value: String): Self = StObject.set(x, "multipack", value.asInstanceOf[js.Any])
    
    inline def setMultipackUndefined: Self = StObject.set(x, "multipack", js.undefined)
    
    inline def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    inline def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPause(value: String): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setPickupMethod(value: String): Self = StObject.set(x, "pickupMethod", value.asInstanceOf[js.Any])
    
    inline def setPickupMethodUndefined: Self = StObject.set(x, "pickupMethod", js.undefined)
    
    inline def setPickupSla(value: String): Self = StObject.set(x, "pickupSla", value.asInstanceOf[js.Any])
    
    inline def setPickupSlaUndefined: Self = StObject.set(x, "pickupSla", js.undefined)
    
    inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setProductDetails(value: js.Array[ProductProductDetail]): Self = StObject.set(x, "productDetails", value.asInstanceOf[js.Any])
    
    inline def setProductDetailsUndefined: Self = StObject.set(x, "productDetails", js.undefined)
    
    inline def setProductDetailsVarargs(value: ProductProductDetail*): Self = StObject.set(x, "productDetails", js.Array(value*))
    
    inline def setProductHeight(value: ProductDimension): Self = StObject.set(x, "productHeight", value.asInstanceOf[js.Any])
    
    inline def setProductHeightUndefined: Self = StObject.set(x, "productHeight", js.undefined)
    
    inline def setProductHighlights(value: js.Array[String]): Self = StObject.set(x, "productHighlights", value.asInstanceOf[js.Any])
    
    inline def setProductHighlightsUndefined: Self = StObject.set(x, "productHighlights", js.undefined)
    
    inline def setProductHighlightsVarargs(value: String*): Self = StObject.set(x, "productHighlights", js.Array(value*))
    
    inline def setProductLength(value: ProductDimension): Self = StObject.set(x, "productLength", value.asInstanceOf[js.Any])
    
    inline def setProductLengthUndefined: Self = StObject.set(x, "productLength", js.undefined)
    
    inline def setProductTypes(value: js.Array[String]): Self = StObject.set(x, "productTypes", value.asInstanceOf[js.Any])
    
    inline def setProductTypesUndefined: Self = StObject.set(x, "productTypes", js.undefined)
    
    inline def setProductTypesVarargs(value: String*): Self = StObject.set(x, "productTypes", js.Array(value*))
    
    inline def setProductWeight(value: ProductWeight): Self = StObject.set(x, "productWeight", value.asInstanceOf[js.Any])
    
    inline def setProductWeightUndefined: Self = StObject.set(x, "productWeight", js.undefined)
    
    inline def setProductWidth(value: ProductDimension): Self = StObject.set(x, "productWidth", value.asInstanceOf[js.Any])
    
    inline def setProductWidthUndefined: Self = StObject.set(x, "productWidth", js.undefined)
    
    inline def setPromotionIds(value: js.Array[String]): Self = StObject.set(x, "promotionIds", value.asInstanceOf[js.Any])
    
    inline def setPromotionIdsUndefined: Self = StObject.set(x, "promotionIds", js.undefined)
    
    inline def setPromotionIdsVarargs(value: String*): Self = StObject.set(x, "promotionIds", js.Array(value*))
    
    inline def setSalePrice(value: Price): Self = StObject.set(x, "salePrice", value.asInstanceOf[js.Any])
    
    inline def setSalePriceEffectiveDate(value: String): Self = StObject.set(x, "salePriceEffectiveDate", value.asInstanceOf[js.Any])
    
    inline def setSalePriceEffectiveDateUndefined: Self = StObject.set(x, "salePriceEffectiveDate", js.undefined)
    
    inline def setSalePriceUndefined: Self = StObject.set(x, "salePrice", js.undefined)
    
    inline def setSellOnGoogleQuantity(value: String): Self = StObject.set(x, "sellOnGoogleQuantity", value.asInstanceOf[js.Any])
    
    inline def setSellOnGoogleQuantityUndefined: Self = StObject.set(x, "sellOnGoogleQuantity", js.undefined)
    
    inline def setShipping(value: js.Array[ProductShipping]): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingHeight(value: ProductShippingDimension): Self = StObject.set(x, "shippingHeight", value.asInstanceOf[js.Any])
    
    inline def setShippingHeightUndefined: Self = StObject.set(x, "shippingHeight", js.undefined)
    
    inline def setShippingLabel(value: String): Self = StObject.set(x, "shippingLabel", value.asInstanceOf[js.Any])
    
    inline def setShippingLabelUndefined: Self = StObject.set(x, "shippingLabel", js.undefined)
    
    inline def setShippingLength(value: ProductShippingDimension): Self = StObject.set(x, "shippingLength", value.asInstanceOf[js.Any])
    
    inline def setShippingLengthUndefined: Self = StObject.set(x, "shippingLength", js.undefined)
    
    inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    inline def setShippingVarargs(value: ProductShipping*): Self = StObject.set(x, "shipping", js.Array(value*))
    
    inline def setShippingWeight(value: ProductShippingWeight): Self = StObject.set(x, "shippingWeight", value.asInstanceOf[js.Any])
    
    inline def setShippingWeightUndefined: Self = StObject.set(x, "shippingWeight", js.undefined)
    
    inline def setShippingWidth(value: ProductShippingDimension): Self = StObject.set(x, "shippingWidth", value.asInstanceOf[js.Any])
    
    inline def setShippingWidthUndefined: Self = StObject.set(x, "shippingWidth", js.undefined)
    
    inline def setShoppingAdsExcludedCountries(value: js.Array[String]): Self = StObject.set(x, "shoppingAdsExcludedCountries", value.asInstanceOf[js.Any])
    
    inline def setShoppingAdsExcludedCountriesUndefined: Self = StObject.set(x, "shoppingAdsExcludedCountries", js.undefined)
    
    inline def setShoppingAdsExcludedCountriesVarargs(value: String*): Self = StObject.set(x, "shoppingAdsExcludedCountries", js.Array(value*))
    
    inline def setSizeSystem(value: String): Self = StObject.set(x, "sizeSystem", value.asInstanceOf[js.Any])
    
    inline def setSizeSystemUndefined: Self = StObject.set(x, "sizeSystem", js.undefined)
    
    inline def setSizeType(value: String): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    inline def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    inline def setSizes(value: js.Array[String]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSizesVarargs(value: String*): Self = StObject.set(x, "sizes", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSubscriptionCost(value: ProductSubscriptionCost): Self = StObject.set(x, "subscriptionCost", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionCostUndefined: Self = StObject.set(x, "subscriptionCost", js.undefined)
    
    inline def setTargetCountry(value: String): Self = StObject.set(x, "targetCountry", value.asInstanceOf[js.Any])
    
    inline def setTargetCountryUndefined: Self = StObject.set(x, "targetCountry", js.undefined)
    
    inline def setTaxCategory(value: String): Self = StObject.set(x, "taxCategory", value.asInstanceOf[js.Any])
    
    inline def setTaxCategoryUndefined: Self = StObject.set(x, "taxCategory", js.undefined)
    
    inline def setTaxes(value: js.Array[ProductTax]): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
    
    inline def setTaxesUndefined: Self = StObject.set(x, "taxes", js.undefined)
    
    inline def setTaxesVarargs(value: ProductTax*): Self = StObject.set(x, "taxes", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTransitTimeLabel(value: String): Self = StObject.set(x, "transitTimeLabel", value.asInstanceOf[js.Any])
    
    inline def setTransitTimeLabelUndefined: Self = StObject.set(x, "transitTimeLabel", js.undefined)
    
    inline def setUnitPricingBaseMeasure(value: ProductUnitPricingBaseMeasure): Self = StObject.set(x, "unitPricingBaseMeasure", value.asInstanceOf[js.Any])
    
    inline def setUnitPricingBaseMeasureUndefined: Self = StObject.set(x, "unitPricingBaseMeasure", js.undefined)
    
    inline def setUnitPricingMeasure(value: ProductUnitPricingMeasure): Self = StObject.set(x, "unitPricingMeasure", value.asInstanceOf[js.Any])
    
    inline def setUnitPricingMeasureUndefined: Self = StObject.set(x, "unitPricingMeasure", js.undefined)
  }
}
