package typingsJapgolly.loadGoogleMapsApi

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsJapgolly.googlemaps.google.maps.BicyclingLayer
import typingsJapgolly.googlemaps.google.maps.Circle
import typingsJapgolly.googlemaps.google.maps.Data
import typingsJapgolly.googlemaps.google.maps.DirectionsRenderer
import typingsJapgolly.googlemaps.google.maps.DirectionsService
import typingsJapgolly.googlemaps.google.maps.DistanceMatrixService
import typingsJapgolly.googlemaps.google.maps.ElevationService
import typingsJapgolly.googlemaps.google.maps.FusionTablesLayer
import typingsJapgolly.googlemaps.google.maps.FusionTablesLayerOptions
import typingsJapgolly.googlemaps.google.maps.Geocoder
import typingsJapgolly.googlemaps.google.maps.GroundOverlay
import typingsJapgolly.googlemaps.google.maps.ImageMapType
import typingsJapgolly.googlemaps.google.maps.ImageMapTypeOptions
import typingsJapgolly.googlemaps.google.maps.InfoWindow
import typingsJapgolly.googlemaps.google.maps.KmlLayer
import typingsJapgolly.googlemaps.google.maps.LatLng
import typingsJapgolly.googlemaps.google.maps.LatLngBounds
import typingsJapgolly.googlemaps.google.maps.MVCArray
import typingsJapgolly.googlemaps.google.maps.MVCObject
import typingsJapgolly.googlemaps.google.maps.Map
import typingsJapgolly.googlemaps.google.maps.MapCanvasProjection
import typingsJapgolly.googlemaps.google.maps.MapTypeRegistry
import typingsJapgolly.googlemaps.google.maps.MapTypeStyle
import typingsJapgolly.googlemaps.google.maps.MaxZoomService
import typingsJapgolly.googlemaps.google.maps.Point
import typingsJapgolly.googlemaps.google.maps.Polygon
import typingsJapgolly.googlemaps.google.maps.Polyline
import typingsJapgolly.googlemaps.google.maps.Rectangle
import typingsJapgolly.googlemaps.google.maps.SaveWidget
import typingsJapgolly.googlemaps.google.maps.Size
import typingsJapgolly.googlemaps.google.maps.StreetViewCoverageLayer
import typingsJapgolly.googlemaps.google.maps.StreetViewPanorama
import typingsJapgolly.googlemaps.google.maps.StreetViewService
import typingsJapgolly.googlemaps.google.maps.StyledMapType
import typingsJapgolly.googlemaps.google.maps.TrafficLayer
import typingsJapgolly.googlemaps.google.maps.TransitLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmaps extends js.Object {
  /***** Layers *****/
  var BicyclingLayer: Instantiable0[typingsJapgolly.googlemaps.google.maps.BicyclingLayer]
  /** A circle on the Earth's surface; also known as a "spherical cap". */
  var Circle: Instantiable0[typingsJapgolly.googlemaps.google.maps.Circle]
  /***** Data *****/
  var Data: Instantiable0[typingsJapgolly.googlemaps.google.maps.Data] with TypeofData
  var DirectionsRenderer: Instantiable0[typingsJapgolly.googlemaps.google.maps.DirectionsRenderer]
  var DirectionsService: Instantiable0[typingsJapgolly.googlemaps.google.maps.DirectionsService]
  var DistanceMatrixService: Instantiable0[typingsJapgolly.googlemaps.google.maps.DistanceMatrixService]
  var ElevationService: Instantiable0[typingsJapgolly.googlemaps.google.maps.ElevationService]
  var FusionTablesLayer: Instantiable1[
    /* options */ FusionTablesLayerOptions, 
    typingsJapgolly.googlemaps.google.maps.FusionTablesLayer
  ]
  /***** Services *****/
  var Geocoder: Instantiable0[typingsJapgolly.googlemaps.google.maps.Geocoder]
  var GroundOverlay: Instantiable2[
    /* url */ String, 
    /* bounds */ LatLngBounds, 
    typingsJapgolly.googlemaps.google.maps.GroundOverlay
  ]
  var ImageMapType: Instantiable1[
    /* opts */ ImageMapTypeOptions, 
    typingsJapgolly.googlemaps.google.maps.ImageMapType
  ]
  /**
    * An overlay that looks like a bubble and is often connected to a marker.
    * This class extends MVCObject.
    */
  var InfoWindow: Instantiable0[typingsJapgolly.googlemaps.google.maps.InfoWindow]
  var KmlLayer: Instantiable0[typingsJapgolly.googlemaps.google.maps.KmlLayer]
  /* **** Base **** */
  /**
    * A LatLng is a point in geographical coordinates: latitude and longitude.
    *
    * * Latitude ranges between -90 and 90 degrees, inclusive. Values above or
    *   below this range will be clamped to the range [-90, 90]. This means
    *   that if the value specified is less than -90, it will be set to -90.
    *   And if the value is greater than 90, it will be set to 90.
    * * Longitude ranges between -180 and 180 degrees, inclusive. Values above
    *   or below this range will be wrapped so that they fall within the
    *   range. For example, a value of -190 will be converted to 170. A value
    *   of 190 will be converted to -170. This reflects the fact that
    *   longitudes wrap around the globe.
    *
    * Although the default map projection associates longitude with the
    * x-coordinate of the map, and latitude with the y-coordinate, the
    * latitude coordinate is always written first, followed by the longitude.
    * Notice that you cannot modify the coordinates of a LatLng. If you want
    * to compute another point, you have to create a new one.
    */
  var LatLng: Instantiable2[/* lat */ Double, /* lng */ Double, typingsJapgolly.googlemaps.google.maps.LatLng]
  /**
    * A LatLngBounds instance represents a rectangle in geographical coordinates,
    * including one that crosses the 180 degrees longitudinal meridian.
    */
  var LatLngBounds: Instantiable0[typingsJapgolly.googlemaps.google.maps.LatLngBounds]
  /** This class extends MVCObject. */
  var MVCArray: Instantiable0[typingsJapgolly.googlemaps.google.maps.MVCArray[js.Object]]
  /***** MVC *****/
  /** Base class implementing KVO. */
  var MVCObject: Instantiable0[typingsJapgolly.googlemaps.google.maps.MVCObject]
  /** @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#Map Maps JavaScript API} */
  var Map: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam E */ /* mapDiv */ js.Any, 
    typingsJapgolly.googlemaps.google.maps.Map[Element]
  ]
  var MapCanvasProjection: Instantiable0[typingsJapgolly.googlemaps.google.maps.MapCanvasProjection]
  var MapTypeRegistry: Instantiable0[typingsJapgolly.googlemaps.google.maps.MapTypeRegistry]
  /**
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Marker Maps JavaScript API}
    */
  var Marker: TypeofMarker
  var MaxZoomService: Instantiable0[typingsJapgolly.googlemaps.google.maps.MaxZoomService]
  var OverlayView: TypeofOverlayView
  var Point: Instantiable2[/* x */ Double, /* y */ Double, typingsJapgolly.googlemaps.google.maps.Point]
  var Polygon: Instantiable0[typingsJapgolly.googlemaps.google.maps.Polygon]
  var Polyline: Instantiable0[typingsJapgolly.googlemaps.google.maps.Polyline]
  var Rectangle: Instantiable0[typingsJapgolly.googlemaps.google.maps.Rectangle]
  var SaveWidget: Instantiable1[/* container */ Node, typingsJapgolly.googlemaps.google.maps.SaveWidget]
  var Size: Instantiable2[/* width */ Double, /* height */ Double, typingsJapgolly.googlemaps.google.maps.Size]
  var StreetViewCoverageLayer: Instantiable0[typingsJapgolly.googlemaps.google.maps.StreetViewCoverageLayer]
  /***** Street View *****/
  var StreetViewPanorama: Instantiable1[/* container */ Element, typingsJapgolly.googlemaps.google.maps.StreetViewPanorama]
  var StreetViewService: Instantiable0[typingsJapgolly.googlemaps.google.maps.StreetViewService]
  var StyledMapType: Instantiable1[
    /* styles */ js.Array[MapTypeStyle], 
    typingsJapgolly.googlemaps.google.maps.StyledMapType
  ]
  var TrafficLayer: Instantiable0[typingsJapgolly.googlemaps.google.maps.TrafficLayer]
  var TransitLayer: Instantiable0[typingsJapgolly.googlemaps.google.maps.TransitLayer]
  /***** AdSense Library *****/
  val adsense: Typeofadsense
  /***** Drawing Library *****/
  val drawing: Typeofdrawing
  val event: Typeofevent
  /***** Geometry Library *****/
  val geometry: Typeofgeometry
  /***** Places Library *****/
  val places: Typeofplaces
  /**
    * Version of the Google Maps JavaScript API that the browser has loaded.
    * Like '3.38.11'.
    * @see {@link https://developers.google.com/maps/documentation/javascript/versions#version-checks Maps JavaScript API}
    */
  val version: String
  /***** Visualization Library *****/
  val visualization: Typeofvisualization
}

object Typeofmaps {
  @scala.inline
  def apply(
    BicyclingLayer: Instantiable0[BicyclingLayer],
    Circle: Instantiable0[Circle],
    Data: Instantiable0[Data] with TypeofData,
    DirectionsRenderer: Instantiable0[DirectionsRenderer],
    DirectionsService: Instantiable0[DirectionsService],
    DistanceMatrixService: Instantiable0[DistanceMatrixService],
    ElevationService: Instantiable0[ElevationService],
    FusionTablesLayer: Instantiable1[/* options */ FusionTablesLayerOptions, FusionTablesLayer],
    Geocoder: Instantiable0[Geocoder],
    GroundOverlay: Instantiable2[/* url */ String, /* bounds */ LatLngBounds, GroundOverlay],
    ImageMapType: Instantiable1[/* opts */ ImageMapTypeOptions, ImageMapType],
    InfoWindow: Instantiable0[InfoWindow],
    KmlLayer: Instantiable0[KmlLayer],
    LatLng: Instantiable2[/* lat */ Double, /* lng */ Double, LatLng],
    LatLngBounds: Instantiable0[LatLngBounds],
    MVCArray: Instantiable0[MVCArray[js.Object]],
    MVCObject: Instantiable0[MVCObject],
    Map: Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam E */ /* mapDiv */ js.Any, 
      Map[Element]
    ],
    MapCanvasProjection: Instantiable0[MapCanvasProjection],
    MapTypeRegistry: Instantiable0[MapTypeRegistry],
    Marker: TypeofMarker,
    MaxZoomService: Instantiable0[MaxZoomService],
    OverlayView: TypeofOverlayView,
    Point: Instantiable2[/* x */ Double, /* y */ Double, Point],
    Polygon: Instantiable0[Polygon],
    Polyline: Instantiable0[Polyline],
    Rectangle: Instantiable0[Rectangle],
    SaveWidget: Instantiable1[/* container */ Node, SaveWidget],
    Size: Instantiable2[/* width */ Double, /* height */ Double, Size],
    StreetViewCoverageLayer: Instantiable0[StreetViewCoverageLayer],
    StreetViewPanorama: Instantiable1[/* container */ Element, StreetViewPanorama],
    StreetViewService: Instantiable0[StreetViewService],
    StyledMapType: Instantiable1[/* styles */ js.Array[MapTypeStyle], StyledMapType],
    TrafficLayer: Instantiable0[TrafficLayer],
    TransitLayer: Instantiable0[TransitLayer],
    adsense: Typeofadsense,
    drawing: Typeofdrawing,
    event: Typeofevent,
    geometry: Typeofgeometry,
    places: Typeofplaces,
    version: String,
    visualization: Typeofvisualization
  ): Typeofmaps = {
    val __obj = js.Dynamic.literal(BicyclingLayer = BicyclingLayer.asInstanceOf[js.Any], Circle = Circle.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], DirectionsRenderer = DirectionsRenderer.asInstanceOf[js.Any], DirectionsService = DirectionsService.asInstanceOf[js.Any], DistanceMatrixService = DistanceMatrixService.asInstanceOf[js.Any], ElevationService = ElevationService.asInstanceOf[js.Any], FusionTablesLayer = FusionTablesLayer.asInstanceOf[js.Any], Geocoder = Geocoder.asInstanceOf[js.Any], GroundOverlay = GroundOverlay.asInstanceOf[js.Any], ImageMapType = ImageMapType.asInstanceOf[js.Any], InfoWindow = InfoWindow.asInstanceOf[js.Any], KmlLayer = KmlLayer.asInstanceOf[js.Any], LatLng = LatLng.asInstanceOf[js.Any], LatLngBounds = LatLngBounds.asInstanceOf[js.Any], MVCArray = MVCArray.asInstanceOf[js.Any], MVCObject = MVCObject.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], MapCanvasProjection = MapCanvasProjection.asInstanceOf[js.Any], MapTypeRegistry = MapTypeRegistry.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxZoomService = MaxZoomService.asInstanceOf[js.Any], OverlayView = OverlayView.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any], Polyline = Polyline.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any], SaveWidget = SaveWidget.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StreetViewCoverageLayer = StreetViewCoverageLayer.asInstanceOf[js.Any], StreetViewPanorama = StreetViewPanorama.asInstanceOf[js.Any], StreetViewService = StreetViewService.asInstanceOf[js.Any], StyledMapType = StyledMapType.asInstanceOf[js.Any], TrafficLayer = TrafficLayer.asInstanceOf[js.Any], TransitLayer = TransitLayer.asInstanceOf[js.Any], adsense = adsense.asInstanceOf[js.Any], drawing = drawing.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofmaps]
  }
}

