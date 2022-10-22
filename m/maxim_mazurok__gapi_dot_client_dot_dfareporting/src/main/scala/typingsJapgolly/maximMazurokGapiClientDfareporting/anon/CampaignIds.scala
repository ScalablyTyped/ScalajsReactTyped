package typingsJapgolly.maximMazurokGapiClientDfareporting.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignIds extends StObject {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  
  /** Select only placements with these active statuses. */
  var activeStatus: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Select only placements that belong to these advertisers. */
  var advertiserIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  
  /** Select only placements that belong to these campaigns. */
  var campaignIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Select only placements that are associated with these compatibilities. DISPLAY and DISPLAY_INTERSTITIAL refer to rendering either on desktop or on mobile devices for regular or
    * interstitial ads respectively. APP and APP_INTERSTITIAL are for rendering in mobile apps. IN_STREAM_VIDEO refers to rendering in in-stream video ads developed with the VAST
    * standard.
    */
  var compatibilities: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Select only placements that are associated with these content categories. */
  var contentCategoryIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Select only placements that are associated with these directory sites. */
  var directorySiteIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  
  /** Select only placements that belong to these placement groups. */
  var groupIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Select only placements with these IDs. */
  var ids: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Select only placements or placement groups whose end date is on or before the specified maxEndDate. The date should be formatted as "yyyy-MM-dd". */
  var maxEndDate: js.UndefOr[String] = js.undefined
  
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /** Select only placements or placement groups whose start date is on or before the specified maxStartDate. The date should be formatted as "yyyy-MM-dd". */
  var maxStartDate: js.UndefOr[String] = js.undefined
  
  /** Select only placements or placement groups whose end date is on or after the specified minEndDate. The date should be formatted as "yyyy-MM-dd". */
  var minEndDate: js.UndefOr[String] = js.undefined
  
  /** Select only placements or placement groups whose start date is on or after the specified minStartDate. The date should be formatted as "yyyy-MM-dd". */
  var minStartDate: js.UndefOr[String] = js.undefined
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  
  /** Value of the nextPageToken from the previous result page. */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** Select only placements with this payment source. */
  var paymentSource: js.UndefOr[String] = js.undefined
  
  /** Select only placements that are associated with these placement strategies. */
  var placementStrategyIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  
  /** Select only placements with these pricing types. */
  var pricingTypes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** User profile ID associated with this request. */
  var profileId: String
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  
  /**
    * Allows searching for placements by name or ID. Wildcards (*) are allowed. For example, "placement*2015" will return placements with names like "placement June 2015", "placement
    * May 2015", or simply "placements 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of
    * "placement" will match placements with name "my placement", "placement 2015", or simply "placement" .
    */
  var searchString: js.UndefOr[String] = js.undefined
  
  /** Select only placements that are associated with these sites. */
  var siteIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Select only placements that are associated with these sizes. */
  var sizeIds: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Field by which to sort the list. */
  var sortField: js.UndefOr[String] = js.undefined
  
  /** Order of sorted results. */
  var sortOrder: js.UndefOr[String] = js.undefined
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}
object CampaignIds {
  
  inline def apply(profileId: String): CampaignIds = {
    val __obj = js.Dynamic.literal(profileId = profileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignIds]
  }
  
  extension [Self <: CampaignIds](x: Self) {
    
    inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
    
    inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setActiveStatus(value: String | js.Array[String]): Self = StObject.set(x, "activeStatus", value.asInstanceOf[js.Any])
    
    inline def setActiveStatusUndefined: Self = StObject.set(x, "activeStatus", js.undefined)
    
    inline def setActiveStatusVarargs(value: String*): Self = StObject.set(x, "activeStatus", js.Array(value*))
    
    inline def setAdvertiserIds(value: String | js.Array[String]): Self = StObject.set(x, "advertiserIds", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdsUndefined: Self = StObject.set(x, "advertiserIds", js.undefined)
    
    inline def setAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "advertiserIds", js.Array(value*))
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCampaignIds(value: String | js.Array[String]): Self = StObject.set(x, "campaignIds", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdsUndefined: Self = StObject.set(x, "campaignIds", js.undefined)
    
    inline def setCampaignIdsVarargs(value: String*): Self = StObject.set(x, "campaignIds", js.Array(value*))
    
    inline def setCompatibilities(value: String | js.Array[String]): Self = StObject.set(x, "compatibilities", value.asInstanceOf[js.Any])
    
    inline def setCompatibilitiesUndefined: Self = StObject.set(x, "compatibilities", js.undefined)
    
    inline def setCompatibilitiesVarargs(value: String*): Self = StObject.set(x, "compatibilities", js.Array(value*))
    
    inline def setContentCategoryIds(value: String | js.Array[String]): Self = StObject.set(x, "contentCategoryIds", value.asInstanceOf[js.Any])
    
    inline def setContentCategoryIdsUndefined: Self = StObject.set(x, "contentCategoryIds", js.undefined)
    
    inline def setContentCategoryIdsVarargs(value: String*): Self = StObject.set(x, "contentCategoryIds", js.Array(value*))
    
    inline def setDirectorySiteIds(value: String | js.Array[String]): Self = StObject.set(x, "directorySiteIds", value.asInstanceOf[js.Any])
    
    inline def setDirectorySiteIdsUndefined: Self = StObject.set(x, "directorySiteIds", js.undefined)
    
    inline def setDirectorySiteIdsVarargs(value: String*): Self = StObject.set(x, "directorySiteIds", js.Array(value*))
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setGroupIds(value: String | js.Array[String]): Self = StObject.set(x, "groupIds", value.asInstanceOf[js.Any])
    
    inline def setGroupIdsUndefined: Self = StObject.set(x, "groupIds", js.undefined)
    
    inline def setGroupIdsVarargs(value: String*): Self = StObject.set(x, "groupIds", js.Array(value*))
    
    inline def setIds(value: String | js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMaxEndDate(value: String): Self = StObject.set(x, "maxEndDate", value.asInstanceOf[js.Any])
    
    inline def setMaxEndDateUndefined: Self = StObject.set(x, "maxEndDate", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMaxStartDate(value: String): Self = StObject.set(x, "maxStartDate", value.asInstanceOf[js.Any])
    
    inline def setMaxStartDateUndefined: Self = StObject.set(x, "maxStartDate", js.undefined)
    
    inline def setMinEndDate(value: String): Self = StObject.set(x, "minEndDate", value.asInstanceOf[js.Any])
    
    inline def setMinEndDateUndefined: Self = StObject.set(x, "minEndDate", js.undefined)
    
    inline def setMinStartDate(value: String): Self = StObject.set(x, "minStartDate", value.asInstanceOf[js.Any])
    
    inline def setMinStartDateUndefined: Self = StObject.set(x, "minStartDate", js.undefined)
    
    inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPaymentSource(value: String): Self = StObject.set(x, "paymentSource", value.asInstanceOf[js.Any])
    
    inline def setPaymentSourceUndefined: Self = StObject.set(x, "paymentSource", js.undefined)
    
    inline def setPlacementStrategyIds(value: String | js.Array[String]): Self = StObject.set(x, "placementStrategyIds", value.asInstanceOf[js.Any])
    
    inline def setPlacementStrategyIdsUndefined: Self = StObject.set(x, "placementStrategyIds", js.undefined)
    
    inline def setPlacementStrategyIdsVarargs(value: String*): Self = StObject.set(x, "placementStrategyIds", js.Array(value*))
    
    inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    inline def setPricingTypes(value: String | js.Array[String]): Self = StObject.set(x, "pricingTypes", value.asInstanceOf[js.Any])
    
    inline def setPricingTypesUndefined: Self = StObject.set(x, "pricingTypes", js.undefined)
    
    inline def setPricingTypesVarargs(value: String*): Self = StObject.set(x, "pricingTypes", js.Array(value*))
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    inline def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
    
    inline def setSearchStringUndefined: Self = StObject.set(x, "searchString", js.undefined)
    
    inline def setSiteIds(value: String | js.Array[String]): Self = StObject.set(x, "siteIds", value.asInstanceOf[js.Any])
    
    inline def setSiteIdsUndefined: Self = StObject.set(x, "siteIds", js.undefined)
    
    inline def setSiteIdsVarargs(value: String*): Self = StObject.set(x, "siteIds", js.Array(value*))
    
    inline def setSizeIds(value: String | js.Array[String]): Self = StObject.set(x, "sizeIds", value.asInstanceOf[js.Any])
    
    inline def setSizeIdsUndefined: Self = StObject.set(x, "sizeIds", js.undefined)
    
    inline def setSizeIdsVarargs(value: String*): Self = StObject.set(x, "sizeIds", js.Array(value*))
    
    inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
    
    inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
    
    inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
    
    inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
  }
}
