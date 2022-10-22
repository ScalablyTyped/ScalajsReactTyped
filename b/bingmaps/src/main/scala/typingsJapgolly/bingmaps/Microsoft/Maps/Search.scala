package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides an easy method for geocoding address and searching for points of interest from JavaScript.
  * @requires The Microsoft.Maps.Search module.
  */
object Search {
  
  @js.native
  sealed trait MatchCode extends StObject
  @JSGlobal("Microsoft.Maps.Search.MatchCode")
  @js.native
  object MatchCode extends StObject {
    
    /** The match was ambiguous. Multiple results were returned. */
    @js.native
    sealed trait ambiguous
      extends StObject
         with MatchCode
    
    /** The match was good. */
    @js.native
    sealed trait good
      extends StObject
         with MatchCode
    
    /** The match was found, but possibly using a modified query. */
    @js.native
    sealed trait modified
      extends StObject
         with MatchCode
    
    /** No match was found. */
    @js.native
    sealed trait none
      extends StObject
         with MatchCode
    
    /** The match was found by a broader search. */
    @js.native
    sealed trait upHierarchy
      extends StObject
         with MatchCode
  }
  
  @js.native
  sealed trait MatchConfidence extends StObject
  @JSGlobal("Microsoft.Maps.Search.MatchConfidence")
  @js.native
  object MatchConfidence extends StObject {
    
    /** The confidence of the match is high. */
    @js.native
    sealed trait high
      extends StObject
         with MatchConfidence
    
    /** The confidence of the match is low. */
    @js.native
    sealed trait low
      extends StObject
         with MatchConfidence
    
    /** The confidence of the match is medium. */
    @js.native
    sealed trait medium
      extends StObject
         with MatchConfidence
    
    /** The confidence of the match is unknown. */
    @js.native
    sealed trait unknown
      extends StObject
         with MatchConfidence
  }
  
  trait IGeocodeLocation extends StObject {
    
    /** The latitude of the location. */
    var latitude: Double
    
    /** The longitude of the location. */
    var longitude: Double
    
    /** The name of this geocode location match. */
    var name: String
    
    /** 
    		 * The precision of this geocode location match. 
    		 * Possible Values: Interpolated, InterpolatedOffset, Rooftop, Parcel
    		 */
    var precision: String
  }
  object IGeocodeLocation {
    
    inline def apply(latitude: Double, longitude: Double, name: String, precision: String): IGeocodeLocation = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGeocodeLocation]
    }
    
    extension [Self <: IGeocodeLocation](x: Self) {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGeocodeRequestOptions extends StObject {
    
    /** 
      * A location rectangle that defines the boundaries of the area in which to search for 
      * location results. The default is the bounds of the map view associated with this 
      * instance of the SearchManager, which is usually the current map view.
      */
    var bounds: js.UndefOr[LocationRect] = js.undefined
    
    /**
      * The name of the function to call when a successful result is returned from the 
      * geocode request. The callback function must accept two parameters: result, which is 
      * a GeocodeResult type, and a userData object.
      */
    def callback(geocodeResult: IGeocodeResult, userData: Any): Unit
    
    /** The maximum number of results to return. Required. The maximum number than can be returned is 20. */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * The name of the function to call when the request is returned with an error. The 
      * error callback function must accept an IGeocodeRequestOptions object.
      */
    var errorCallback: js.UndefOr[js.Function1[/* geocodeRequestOptions */ this.type, Unit]] = js.undefined
    
    /** Specifies to include the two-letter ISO country code. */
    var includeCountryIso2: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies to include the neighborhood in the response when it is available. */
    var includeNeighborhood: js.UndefOr[Boolean] = js.undefined
    
    /** A number indicating how long to wait, in seconds, for the geocode request to return. The default value is 5 seconds. */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /** An object containing any data that needs to be passed to the callback when the request is completed. */
    var userData: js.UndefOr[Any] = js.undefined
    
    /** A string containing the address or place to be matched to a location on the map.  */
    var where: String
  }
  object IGeocodeRequestOptions {
    
    inline def apply(callback: (IGeocodeResult, Any) => Callback, where: String): IGeocodeRequestOptions = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2((t0: IGeocodeResult, t1: Any) => (callback(t0, t1)).runNow()), where = where.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGeocodeRequestOptions]
    }
    
    extension [Self <: IGeocodeRequestOptions](x: Self) {
      
      inline def setBounds(value: LocationRect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setCallback(value: (IGeocodeResult, Any) => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: IGeocodeResult, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setErrorCallback(value: IGeocodeRequestOptions => Callback): Self = StObject.set(x, "errorCallback", js.Any.fromFunction1((t0: IGeocodeRequestOptions) => value(t0).runNow()))
      
      inline def setErrorCallbackUndefined: Self = StObject.set(x, "errorCallback", js.undefined)
      
      inline def setIncludeCountryIso2(value: Boolean): Self = StObject.set(x, "includeCountryIso2", value.asInstanceOf[js.Any])
      
      inline def setIncludeCountryIso2Undefined: Self = StObject.set(x, "includeCountryIso2", js.undefined)
      
      inline def setIncludeNeighborhood(value: Boolean): Self = StObject.set(x, "includeNeighborhood", value.asInstanceOf[js.Any])
      
      inline def setIncludeNeighborhoodUndefined: Self = StObject.set(x, "includeNeighborhood", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUserData(value: Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
      
      inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGeocodeResult extends StObject {
    
    /** An array of geocode results. */
    var results: js.Array[IPlaceResult]
  }
  object IGeocodeResult {
    
    inline def apply(results: js.Array[IPlaceResult]): IGeocodeResult = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGeocodeResult]
    }
    
    extension [Self <: IGeocodeResult](x: Self) {
      
      inline def setResults(value: js.Array[IPlaceResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: IPlaceResult*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  trait IPlaceResult extends StObject {
    
    /** The geocoded address of the place result. */
    var address: IAddress
    
    /** The location rectangle that defines the boundaries of the best map view of the place result. */
    var bestView: LocationRect
    
    /** The classification of the geographic entity returned, such as PopulatedPlace. */
    var entityType: String
    
    /** The geocoded location of the best result. */
    var location: Location
    
    /** The geocoded locations. */
    var locations: js.Array[IGeocodeLocation]
    
    /** The match code of the best result. */
    var matchCode: String | MatchCode
    
    /** The match confidence of the best result. */
    var matchConfidence: String | MatchConfidence
    
    /** The name of the place result, if one exists. */
    var name: String
  }
  object IPlaceResult {
    
    inline def apply(
      address: IAddress,
      bestView: LocationRect,
      entityType: String,
      location: Location,
      locations: js.Array[IGeocodeLocation],
      matchCode: String | MatchCode,
      matchConfidence: String | MatchConfidence,
      name: String
    ): IPlaceResult = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], bestView = bestView.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], matchCode = matchCode.asInstanceOf[js.Any], matchConfidence = matchConfidence.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlaceResult]
    }
    
    extension [Self <: IPlaceResult](x: Self) {
      
      inline def setAddress(value: IAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setBestView(value: LocationRect): Self = StObject.set(x, "bestView", value.asInstanceOf[js.Any])
      
      inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocations(value: js.Array[IGeocodeLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsVarargs(value: IGeocodeLocation*): Self = StObject.set(x, "locations", js.Array(value*))
      
      inline def setMatchCode(value: String | MatchCode): Self = StObject.set(x, "matchCode", value.asInstanceOf[js.Any])
      
      inline def setMatchConfidence(value: String | MatchConfidence): Self = StObject.set(x, "matchConfidence", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReverseGeocodeRequestOptions extends StObject {
    
    /**
      * A reference to a function to call when a successful result is returned from the geocode request. The callback function
      * will receive a PlaceResult object as an argument.
      */
    def callback(placeResult: IPlaceResult, userData: Any): Unit
    
    /**
      * A reference to a function to call when the request is returned with an error. The error callback function will receive
      * an object containing the geocode request options used in the request.
      */
    var errorCallback: js.UndefOr[js.Function1[/* reverseGeocodeRequestOptions */ this.type, Unit]] = js.undefined
    
    /** Specifies to include the two-letter ISO country code. Default: false */
    var includeCountryIso2: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  An array of entity types selected from the following options.
      * • Address
      * • Neighborhood
      * • PopulatedPlace
      * • Postcode1
      * • AdminDivision1
      * • AdminDivision2
      * • CountryRegion
      * These entity types are ordered from the most specific entity to the least specific entity. When entities of more than one entity type are found, only the most specific
      * entity is returned. For example, if you specify Address and AdminDistrict1 as entity types and entities were found for both types, only the Address entity information is
      * returned in the response. One exception to this rule is when both PopulatedPlace and Neighborhood entity types are specified and information is found for both. In this case,
      * the information for both entity types is returned. Also, more than one Neighborhood may be returned because the area covered by two different neighborhoods can overlap.
      */
    var includeEntityTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Specifies to include the neighborhood in the response when it is available. Note: This feature isn’t
      * available in all locations.
      */
    var includeNeighborhood: js.UndefOr[Boolean] = js.undefined
    
    /** The location to use to match to geographic entities and addresses. */
    var location: Location
    
    /** A number indicating how long to wait, in seconds, for the reverse geocode request to  return. The default value is 5 seconds. */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /** An object containing any data that needs to be passed to the callback when the request is completed. */
    var userData: js.UndefOr[Any] = js.undefined
  }
  object ReverseGeocodeRequestOptions {
    
    inline def apply(callback: (IPlaceResult, Any) => Callback, location: Location): ReverseGeocodeRequestOptions = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2((t0: IPlaceResult, t1: Any) => (callback(t0, t1)).runNow()), location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReverseGeocodeRequestOptions]
    }
    
    extension [Self <: ReverseGeocodeRequestOptions](x: Self) {
      
      inline def setCallback(value: (IPlaceResult, Any) => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: IPlaceResult, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setErrorCallback(value: ReverseGeocodeRequestOptions => Callback): Self = StObject.set(x, "errorCallback", js.Any.fromFunction1((t0: ReverseGeocodeRequestOptions) => value(t0).runNow()))
      
      inline def setErrorCallbackUndefined: Self = StObject.set(x, "errorCallback", js.undefined)
      
      inline def setIncludeCountryIso2(value: Boolean): Self = StObject.set(x, "includeCountryIso2", value.asInstanceOf[js.Any])
      
      inline def setIncludeCountryIso2Undefined: Self = StObject.set(x, "includeCountryIso2", js.undefined)
      
      inline def setIncludeEntityTypes(value: js.Array[String]): Self = StObject.set(x, "includeEntityTypes", value.asInstanceOf[js.Any])
      
      inline def setIncludeEntityTypesUndefined: Self = StObject.set(x, "includeEntityTypes", js.undefined)
      
      inline def setIncludeEntityTypesVarargs(value: String*): Self = StObject.set(x, "includeEntityTypes", js.Array(value*))
      
      inline def setIncludeNeighborhood(value: Boolean): Self = StObject.set(x, "includeNeighborhood", value.asInstanceOf[js.Any])
      
      inline def setIncludeNeighborhoodUndefined: Self = StObject.set(x, "includeNeighborhood", js.undefined)
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUserData(value: Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
    }
  }
  
  trait SearchManager extends StObject {
    
    /**
      * Matches the address or place query in the specified request 
      * options to a location and returns the results to the request 
      * options callback function.
      * @param request Options for sending geocode request
      */
    def geocode(request: IGeocodeRequestOptions): Unit
    
    /**
      * Matches the specified location to an address and returns the 
      * address results to the specified request options callback function.
      * @param request Options for sending reverse geocode request
      */
    def reverseGeocode(request: ReverseGeocodeRequestOptions): Unit
  }
  object SearchManager {
    
    inline def apply(
      geocode: IGeocodeRequestOptions => Callback,
      reverseGeocode: ReverseGeocodeRequestOptions => Callback
    ): SearchManager = {
      val __obj = js.Dynamic.literal(geocode = js.Any.fromFunction1((t0: IGeocodeRequestOptions) => geocode(t0).runNow()), reverseGeocode = js.Any.fromFunction1((t0: ReverseGeocodeRequestOptions) => reverseGeocode(t0).runNow()))
      __obj.asInstanceOf[SearchManager]
    }
    
    extension [Self <: SearchManager](x: Self) {
      
      inline def setGeocode(value: IGeocodeRequestOptions => Callback): Self = StObject.set(x, "geocode", js.Any.fromFunction1((t0: IGeocodeRequestOptions) => value(t0).runNow()))
      
      inline def setReverseGeocode(value: ReverseGeocodeRequestOptions => Callback): Self = StObject.set(x, "reverseGeocode", js.Any.fromFunction1((t0: ReverseGeocodeRequestOptions) => value(t0).runNow()))
    }
  }
}
