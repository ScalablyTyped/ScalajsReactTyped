package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTag extends StObject {
  
  /** Account ID of this event tag. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** Advertiser ID of this event tag. This field or the campaignId field is required on insertion. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** Campaign ID of this event tag. This field or the advertiserId field is required on insertion. */
  var campaignId: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of the campaign. This is a read-only, auto-generated field. */
  var campaignIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** Whether this event tag should be automatically enabled for all of the advertiser's campaigns and ads. */
  var enabledByDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to remove this event tag from ads that are trafficked through Display & Video 360 to Ad Exchange. This may be useful if the event tag uses a pixel that is unapproved for Ad
    * Exchange bids on one or more networks, such as the Google Display Network.
    */
  var excludeFromAdxRequests: js.UndefOr[Boolean] = js.undefined
  
  /** ID of this event tag. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#eventTag". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Name of this event tag. This is a required field and must be less than 256 characters long. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Site filter type for this event tag. If no type is specified then the event tag will be applied to all sites. */
  var siteFilterType: js.UndefOr[String] = js.undefined
  
  /** Filter list of site IDs associated with this event tag. The siteFilterType determines whether this is a allowlist or blocklist filter. */
  var siteIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether this tag is SSL-compliant or not. This is a read-only field. */
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  
  /** Status of this event tag. Must be ENABLED for this event tag to fire. This is a required field. */
  var status: js.UndefOr[String] = js.undefined
  
  /** Subaccount ID of this event tag. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Event tag type. Can be used to specify whether to use a third-party pixel, a third-party JavaScript URL, or a third-party click-through URL for either impression or click tracking.
    * This is a required field.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Payload URL for this event tag. The URL on a click-through event tag should have a landing page URL appended to the end of it. This field is required on insertion. */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Number of times the landing page URL should be URL-escaped before being appended to the click-through event tag URL. Only applies to click-through event tags as specified by the
    * event tag type.
    */
  var urlEscapeLevels: js.UndefOr[Double] = js.undefined
}
object EventTag {
  
  inline def apply(): EventTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTag]
  }
  
  extension [Self <: EventTag](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValueUndefined: Self = StObject.set(x, "advertiserIdDimensionValue", js.undefined)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "campaignIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdDimensionValueUndefined: Self = StObject.set(x, "campaignIdDimensionValue", js.undefined)
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setEnabledByDefault(value: Boolean): Self = StObject.set(x, "enabledByDefault", value.asInstanceOf[js.Any])
    
    inline def setEnabledByDefaultUndefined: Self = StObject.set(x, "enabledByDefault", js.undefined)
    
    inline def setExcludeFromAdxRequests(value: Boolean): Self = StObject.set(x, "excludeFromAdxRequests", value.asInstanceOf[js.Any])
    
    inline def setExcludeFromAdxRequestsUndefined: Self = StObject.set(x, "excludeFromAdxRequests", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSiteFilterType(value: String): Self = StObject.set(x, "siteFilterType", value.asInstanceOf[js.Any])
    
    inline def setSiteFilterTypeUndefined: Self = StObject.set(x, "siteFilterType", js.undefined)
    
    inline def setSiteIds(value: js.Array[String]): Self = StObject.set(x, "siteIds", value.asInstanceOf[js.Any])
    
    inline def setSiteIdsUndefined: Self = StObject.set(x, "siteIds", js.undefined)
    
    inline def setSiteIdsVarargs(value: String*): Self = StObject.set(x, "siteIds", js.Array(value*))
    
    inline def setSslCompliant(value: Boolean): Self = StObject.set(x, "sslCompliant", value.asInstanceOf[js.Any])
    
    inline def setSslCompliantUndefined: Self = StObject.set(x, "sslCompliant", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlEscapeLevels(value: Double): Self = StObject.set(x, "urlEscapeLevels", value.asInstanceOf[js.Any])
    
    inline def setUrlEscapeLevelsUndefined: Self = StObject.set(x, "urlEscapeLevels", js.undefined)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
