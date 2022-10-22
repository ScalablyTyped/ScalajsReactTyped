package typingsJapgolly.bingmaps.global.Microsoft.Maps

import typingsJapgolly.bingmaps.Microsoft.Maps.Search.IGeocodeRequestOptions
import typingsJapgolly.bingmaps.Microsoft.Maps.Search.ReverseGeocodeRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides an easy method for geocoding address and searching for points of interest from JavaScript.
  * @requires The Microsoft.Maps.Search module.
  */
object Search {
  
  @JSGlobal("Microsoft.Maps.Search.MatchCode")
  @js.native
  object MatchCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.bingmaps.Microsoft.Maps.Search.MatchCode & Double] = js.native
    
    /* 2 */ val ambiguous: typingsJapgolly.bingmaps.Microsoft.Maps.Search.MatchCode.ambiguous & Double = js.native
    
    /* 1 */ val good: typingsJapgolly.bingmaps.Microsoft.Maps.Search.MatchCode.good & Double = js.native
    
    /* 4 */ val modified: typingsJapgolly.bingmaps.Microsoft.Maps.Search.MatchCode.modified & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.bingmaps.Microsoft.Maps.Search.MatchCode.none & Double = js.native
    
    /* 3 */ val upHierarchy: typingsJapgolly.bingmaps.Microsoft.Maps.Search.MatchCode.upHierarchy & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Search.MatchConfidence")
  @js.native
  object MatchConfidence extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.bingmaps.Microsoft.Maps.Search.MatchConfidence & Double] = js.native
    
    /* 0 */ val high: typingsJapgolly.bingmaps.Microsoft.Maps.Search.MatchConfidence.high & Double = js.native
    
    /* 2 */ val low: typingsJapgolly.bingmaps.Microsoft.Maps.Search.MatchConfidence.low & Double = js.native
    
    /* 1 */ val medium: typingsJapgolly.bingmaps.Microsoft.Maps.Search.MatchConfidence.medium & Double = js.native
    
    /* 3 */ val unknown: typingsJapgolly.bingmaps.Microsoft.Maps.Search.MatchConfidence.unknown & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.Search.SearchManager")
  @js.native
  open class SearchManager protected ()
    extends StObject
       with typingsJapgolly.bingmaps.Microsoft.Maps.Search.SearchManager {
    /**
      * @constructor
      * @requires The Microsoft.Maps.Search module.
      * @param map A Map object
      */
    def this(map: typingsJapgolly.bingmaps.Microsoft.Maps.Map) = this()
    
    /**
      * Matches the address or place query in the specified request 
      * options to a location and returns the results to the request 
      * options callback function.
      * @param request Options for sending geocode request
      */
    /* CompleteClass */
    override def geocode(request: IGeocodeRequestOptions): Unit = js.native
    
    /**
      * Matches the specified location to an address and returns the 
      * address results to the specified request options callback function.
      * @param request Options for sending reverse geocode request
      */
    /* CompleteClass */
    override def reverseGeocode(request: ReverseGeocodeRequestOptions): Unit = js.native
  }
}
