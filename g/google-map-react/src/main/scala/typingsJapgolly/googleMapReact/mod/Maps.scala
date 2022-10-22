package typingsJapgolly.googleMapReact.mod

import typingsJapgolly.googleMapReact.anon.ANDROID
import typingsJapgolly.googleMapReact.anon.APPROXIMATE
import typingsJapgolly.googleMapReact.anon.BACKWARDCLOSEDARROW
import typingsJapgolly.googleMapReact.anon.BEST
import typingsJapgolly.googleMapReact.anon.BESTGUESS
import typingsJapgolly.googleMapReact.anon.BICYCLING
import typingsJapgolly.googleMapReact.anon.BOTTOM
import typingsJapgolly.googleMapReact.anon.BOUNCE
import typingsJapgolly.googleMapReact.anon.BUS
import typingsJapgolly.googleMapReact.anon.CENTER_
import typingsJapgolly.googleMapReact.anon.DEFAULT
import typingsJapgolly.googleMapReact.anon.DEFAULTNumber
import typingsJapgolly.googleMapReact.anon.DOCUMENTNOTFOUND
import typingsJapgolly.googleMapReact.anon.ERROR
import typingsJapgolly.googleMapReact.anon.ERROROK
import typingsJapgolly.googleMapReact.anon.FEWERTRANSFERS
import typingsJapgolly.googleMapReact.anon.HYBRID
import typingsJapgolly.googleMapReact.anon.IMPERIAL
import typingsJapgolly.googleMapReact.anon.INVALIDREQUEST
import typingsJapgolly.googleMapReact.anon.LARGE
import typingsJapgolly.googleMapReact.anon.MAXDIMENSIONSEXCEEDED
import typingsJapgolly.googleMapReact.anon.NOTFOUND
import typingsJapgolly.googleMapReact.anon.OK
import typingsJapgolly.googleMapReact.anon.OUTDOOR
import typingsJapgolly.googleMapReact.anon.RASTER
import typingsJapgolly.googleMapReact.anon.UNKNOWNERROR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maps extends StObject {
  
  var Animation: BOUNCE
  
  var ControlPosition: BOTTOM
  
  var DirectionsStatus: INVALIDREQUEST
  
  /** @deprecated - Use `TravelMode` instead */
  var DirectionsTravelMode: BICYCLING
  
  /** @deprecated - Use `UnitSystem` instead */
  var DirectionsUnitSystem: IMPERIAL
  
  var DistanceMatrixElementStatus: NOTFOUND
  
  var DistanceMatrixStatus: MAXDIMENSIONSEXCEEDED
  
  var ElevationStatus: OK
  
  var GeocoderLocationType: APPROXIMATE
  
  var GeocoderStatus: ERROR
  
  var KmlLayerStatus: DOCUMENTNOTFOUND
  
  var MapTypeControlStyle: DEFAULT
  
  var MapTypeId: HYBRID
  
  var MaxZoomStatus: ERROROK
  
  var NavigationControlStyle: ANDROID
  
  var RenderingType: RASTER
  
  var ScaleControlStyle: DEFAULTNumber
  
  var StreetViewPreference: BEST
  
  var StreetViewSource: OUTDOOR
  
  var StreetViewStatus: UNKNOWNERROR
  
  var StrokePosition: CENTER_
  
  var SymbolPath: BACKWARDCLOSEDARROW
  
  var TrafficModel: BESTGUESS
  
  var TransitMode: BUS
  
  var TransitRoutePreference: FEWERTRANSFERS
  
  var TravelMode: BICYCLING
  
  var UnitSystem: IMPERIAL
  
  /**
    * @deprecated - The Zoom control is available in only one style, and
    * `google.maps.ZoomControlStyle` is therefore no longer available.
    */
  var ZoomControlStyle: LARGE
}
object Maps {
  
  inline def apply(
    Animation: BOUNCE,
    ControlPosition: BOTTOM,
    DirectionsStatus: INVALIDREQUEST,
    DirectionsTravelMode: BICYCLING,
    DirectionsUnitSystem: IMPERIAL,
    DistanceMatrixElementStatus: NOTFOUND,
    DistanceMatrixStatus: MAXDIMENSIONSEXCEEDED,
    ElevationStatus: OK,
    GeocoderLocationType: APPROXIMATE,
    GeocoderStatus: ERROR,
    KmlLayerStatus: DOCUMENTNOTFOUND,
    MapTypeControlStyle: DEFAULT,
    MapTypeId: HYBRID,
    MaxZoomStatus: ERROROK,
    NavigationControlStyle: ANDROID,
    RenderingType: RASTER,
    ScaleControlStyle: DEFAULTNumber,
    StreetViewPreference: BEST,
    StreetViewSource: OUTDOOR,
    StreetViewStatus: UNKNOWNERROR,
    StrokePosition: CENTER_,
    SymbolPath: BACKWARDCLOSEDARROW,
    TrafficModel: BESTGUESS,
    TransitMode: BUS,
    TransitRoutePreference: FEWERTRANSFERS,
    TravelMode: BICYCLING,
    UnitSystem: IMPERIAL,
    ZoomControlStyle: LARGE
  ): Maps = {
    val __obj = js.Dynamic.literal(Animation = Animation.asInstanceOf[js.Any], ControlPosition = ControlPosition.asInstanceOf[js.Any], DirectionsStatus = DirectionsStatus.asInstanceOf[js.Any], DirectionsTravelMode = DirectionsTravelMode.asInstanceOf[js.Any], DirectionsUnitSystem = DirectionsUnitSystem.asInstanceOf[js.Any], DistanceMatrixElementStatus = DistanceMatrixElementStatus.asInstanceOf[js.Any], DistanceMatrixStatus = DistanceMatrixStatus.asInstanceOf[js.Any], ElevationStatus = ElevationStatus.asInstanceOf[js.Any], GeocoderLocationType = GeocoderLocationType.asInstanceOf[js.Any], GeocoderStatus = GeocoderStatus.asInstanceOf[js.Any], KmlLayerStatus = KmlLayerStatus.asInstanceOf[js.Any], MapTypeControlStyle = MapTypeControlStyle.asInstanceOf[js.Any], MapTypeId = MapTypeId.asInstanceOf[js.Any], MaxZoomStatus = MaxZoomStatus.asInstanceOf[js.Any], NavigationControlStyle = NavigationControlStyle.asInstanceOf[js.Any], RenderingType = RenderingType.asInstanceOf[js.Any], ScaleControlStyle = ScaleControlStyle.asInstanceOf[js.Any], StreetViewPreference = StreetViewPreference.asInstanceOf[js.Any], StreetViewSource = StreetViewSource.asInstanceOf[js.Any], StreetViewStatus = StreetViewStatus.asInstanceOf[js.Any], StrokePosition = StrokePosition.asInstanceOf[js.Any], SymbolPath = SymbolPath.asInstanceOf[js.Any], TrafficModel = TrafficModel.asInstanceOf[js.Any], TransitMode = TransitMode.asInstanceOf[js.Any], TransitRoutePreference = TransitRoutePreference.asInstanceOf[js.Any], TravelMode = TravelMode.asInstanceOf[js.Any], UnitSystem = UnitSystem.asInstanceOf[js.Any], ZoomControlStyle = ZoomControlStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maps]
  }
  
  extension [Self <: Maps](x: Self) {
    
    inline def setAnimation(value: BOUNCE): Self = StObject.set(x, "Animation", value.asInstanceOf[js.Any])
    
    inline def setControlPosition(value: BOTTOM): Self = StObject.set(x, "ControlPosition", value.asInstanceOf[js.Any])
    
    inline def setDirectionsStatus(value: INVALIDREQUEST): Self = StObject.set(x, "DirectionsStatus", value.asInstanceOf[js.Any])
    
    inline def setDirectionsTravelMode(value: BICYCLING): Self = StObject.set(x, "DirectionsTravelMode", value.asInstanceOf[js.Any])
    
    inline def setDirectionsUnitSystem(value: IMPERIAL): Self = StObject.set(x, "DirectionsUnitSystem", value.asInstanceOf[js.Any])
    
    inline def setDistanceMatrixElementStatus(value: NOTFOUND): Self = StObject.set(x, "DistanceMatrixElementStatus", value.asInstanceOf[js.Any])
    
    inline def setDistanceMatrixStatus(value: MAXDIMENSIONSEXCEEDED): Self = StObject.set(x, "DistanceMatrixStatus", value.asInstanceOf[js.Any])
    
    inline def setElevationStatus(value: OK): Self = StObject.set(x, "ElevationStatus", value.asInstanceOf[js.Any])
    
    inline def setGeocoderLocationType(value: APPROXIMATE): Self = StObject.set(x, "GeocoderLocationType", value.asInstanceOf[js.Any])
    
    inline def setGeocoderStatus(value: ERROR): Self = StObject.set(x, "GeocoderStatus", value.asInstanceOf[js.Any])
    
    inline def setKmlLayerStatus(value: DOCUMENTNOTFOUND): Self = StObject.set(x, "KmlLayerStatus", value.asInstanceOf[js.Any])
    
    inline def setMapTypeControlStyle(value: DEFAULT): Self = StObject.set(x, "MapTypeControlStyle", value.asInstanceOf[js.Any])
    
    inline def setMapTypeId(value: HYBRID): Self = StObject.set(x, "MapTypeId", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomStatus(value: ERROROK): Self = StObject.set(x, "MaxZoomStatus", value.asInstanceOf[js.Any])
    
    inline def setNavigationControlStyle(value: ANDROID): Self = StObject.set(x, "NavigationControlStyle", value.asInstanceOf[js.Any])
    
    inline def setRenderingType(value: RASTER): Self = StObject.set(x, "RenderingType", value.asInstanceOf[js.Any])
    
    inline def setScaleControlStyle(value: DEFAULTNumber): Self = StObject.set(x, "ScaleControlStyle", value.asInstanceOf[js.Any])
    
    inline def setStreetViewPreference(value: BEST): Self = StObject.set(x, "StreetViewPreference", value.asInstanceOf[js.Any])
    
    inline def setStreetViewSource(value: OUTDOOR): Self = StObject.set(x, "StreetViewSource", value.asInstanceOf[js.Any])
    
    inline def setStreetViewStatus(value: UNKNOWNERROR): Self = StObject.set(x, "StreetViewStatus", value.asInstanceOf[js.Any])
    
    inline def setStrokePosition(value: CENTER_): Self = StObject.set(x, "StrokePosition", value.asInstanceOf[js.Any])
    
    inline def setSymbolPath(value: BACKWARDCLOSEDARROW): Self = StObject.set(x, "SymbolPath", value.asInstanceOf[js.Any])
    
    inline def setTrafficModel(value: BESTGUESS): Self = StObject.set(x, "TrafficModel", value.asInstanceOf[js.Any])
    
    inline def setTransitMode(value: BUS): Self = StObject.set(x, "TransitMode", value.asInstanceOf[js.Any])
    
    inline def setTransitRoutePreference(value: FEWERTRANSFERS): Self = StObject.set(x, "TransitRoutePreference", value.asInstanceOf[js.Any])
    
    inline def setTravelMode(value: BICYCLING): Self = StObject.set(x, "TravelMode", value.asInstanceOf[js.Any])
    
    inline def setUnitSystem(value: IMPERIAL): Self = StObject.set(x, "UnitSystem", value.asInstanceOf[js.Any])
    
    inline def setZoomControlStyle(value: LARGE): Self = StObject.set(x, "ZoomControlStyle", value.asInstanceOf[js.Any])
  }
}
