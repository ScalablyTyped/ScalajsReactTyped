package typingsJapgolly.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterSet extends StObject {
  
  /** An absolute date range, defined by a start date and an end date. Interpreted relative to Pacific time zone. */
  var absoluteDateRange: js.UndefOr[AbsoluteDateRange] = js.undefined
  
  /**
    * The set of dimensions along which to break down the response; may be empty. If multiple dimensions are requested, the breakdown is along the Cartesian product of the requested
    * dimensions.
    */
  var breakdownDimensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The ID of the creative on which to filter; optional. This field may be set only for a filter set that accesses account-level troubleshooting data, i.e., one whose name matches the
    * `bidders/ *‍/accounts/ *‍/filterSets/ *` pattern.
    */
  var creativeId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the deal on which to filter; optional. This field may be set only for a filter set that accesses account-level troubleshooting data, i.e., one whose name matches the
    * `bidders/ *‍/accounts/ *‍/filterSets/ *` pattern.
    */
  var dealId: js.UndefOr[String] = js.undefined
  
  /** The environment on which to filter; optional. */
  var environment: js.UndefOr[String] = js.undefined
  
  /** Creative format bidded on or allowed to bid on, can be empty. */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * Creative formats bidded on or allowed to bid on, can be empty. Although this field is a list, it can only be populated with a single item. A HTTP 400 bad request error will be
    * returned in the response if you specify multiple items.
    */
  var formats: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A user-defined name of the filter set. Filter set names must be unique globally and match one of the patterns: - `bidders/ *‍/filterSets/ *` (for accessing bidder-level
    * troubleshooting data) - `bidders/ *‍/accounts/ *‍/filterSets/ *` (for accessing account-level troubleshooting data) This field is required in create operations.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The list of platforms on which to filter; may be empty. The filters represented by multiple platforms are ORed together (i.e., if non-empty, results must match any one of the
    * platforms).
    */
  var platforms: js.UndefOr[js.Array[String]] = js.undefined
  
  /** For Open Bidding partners only. The list of publisher identifiers on which to filter; may be empty. The filters represented by multiple publisher identifiers are ORed together. */
  var publisherIdentifiers: js.UndefOr[js.Array[String]] = js.undefined
  
  /** An open-ended realtime time range, defined by the aggregation start timestamp. */
  var realtimeTimeRange: js.UndefOr[RealtimeTimeRange] = js.undefined
  
  /** A relative date range, defined by an offset from today and a duration. Interpreted relative to Pacific time zone. */
  var relativeDateRange: js.UndefOr[RelativeDateRange] = js.undefined
  
  /**
    * For Authorized Buyers only. The list of IDs of the seller (publisher) networks on which to filter; may be empty. The filters represented by multiple seller network IDs are ORed
    * together (i.e., if non-empty, results must match any one of the publisher networks). See
    * [seller-network-ids](https://developers.google.com/authorized-buyers/rtb/downloads/seller-network-ids) file for the set of existing seller network IDs.
    */
  var sellerNetworkIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** The granularity of time intervals if a time series breakdown is desired; optional. */
  var timeSeriesGranularity: js.UndefOr[String] = js.undefined
}
object FilterSet {
  
  inline def apply(): FilterSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterSet]
  }
  
  extension [Self <: FilterSet](x: Self) {
    
    inline def setAbsoluteDateRange(value: AbsoluteDateRange): Self = StObject.set(x, "absoluteDateRange", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteDateRangeUndefined: Self = StObject.set(x, "absoluteDateRange", js.undefined)
    
    inline def setBreakdownDimensions(value: js.Array[String]): Self = StObject.set(x, "breakdownDimensions", value.asInstanceOf[js.Any])
    
    inline def setBreakdownDimensionsUndefined: Self = StObject.set(x, "breakdownDimensions", js.undefined)
    
    inline def setBreakdownDimensionsVarargs(value: String*): Self = StObject.set(x, "breakdownDimensions", js.Array(value*))
    
    inline def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    inline def setDealId(value: String): Self = StObject.set(x, "dealId", value.asInstanceOf[js.Any])
    
    inline def setDealIdUndefined: Self = StObject.set(x, "dealId", js.undefined)
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormats(value: js.Array[String]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setFormatsVarargs(value: String*): Self = StObject.set(x, "formats", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
    
    inline def setPublisherIdentifiers(value: js.Array[String]): Self = StObject.set(x, "publisherIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdentifiersUndefined: Self = StObject.set(x, "publisherIdentifiers", js.undefined)
    
    inline def setPublisherIdentifiersVarargs(value: String*): Self = StObject.set(x, "publisherIdentifiers", js.Array(value*))
    
    inline def setRealtimeTimeRange(value: RealtimeTimeRange): Self = StObject.set(x, "realtimeTimeRange", value.asInstanceOf[js.Any])
    
    inline def setRealtimeTimeRangeUndefined: Self = StObject.set(x, "realtimeTimeRange", js.undefined)
    
    inline def setRelativeDateRange(value: RelativeDateRange): Self = StObject.set(x, "relativeDateRange", value.asInstanceOf[js.Any])
    
    inline def setRelativeDateRangeUndefined: Self = StObject.set(x, "relativeDateRange", js.undefined)
    
    inline def setSellerNetworkIds(value: js.Array[Double]): Self = StObject.set(x, "sellerNetworkIds", value.asInstanceOf[js.Any])
    
    inline def setSellerNetworkIdsUndefined: Self = StObject.set(x, "sellerNetworkIds", js.undefined)
    
    inline def setSellerNetworkIdsVarargs(value: Double*): Self = StObject.set(x, "sellerNetworkIds", js.Array(value*))
    
    inline def setTimeSeriesGranularity(value: String): Self = StObject.set(x, "timeSeriesGranularity", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesGranularityUndefined: Self = StObject.set(x, "timeSeriesGranularity", js.undefined)
  }
}
