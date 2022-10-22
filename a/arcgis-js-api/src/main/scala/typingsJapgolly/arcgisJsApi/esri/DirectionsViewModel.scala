package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.disabled
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsViewModel
  extends StObject
     with Accessor
     with GoTo {
  
  /**
    * An authorization string used to access a resource or service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#apiKey)
    */
  var apiKey: String = js.native
  
  /**
    * Centers the map at the specified maneuver or stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#centerAt)
    */
  def centerAt(stopOrManeuver: Graphic): scala.Unit = js.native
  
  /**
    * Clears any highlighted route segments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#clearHighlights)
    */
  def clearHighlights(): scala.Unit = js.native
  
  /**
    * Removes the route directions from the directions list, leaving the inputs untouched.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#clearResults)
    */
  def clearResults(): scala.Unit = js.native
  
  /**
    * Returns the cost attribute associated with the parsed name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#getCostAttribute)
    */
  def getCostAttribute(attributeName: String): Any = js.native
  
  /**
    * Computes a route and directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#getDirections)
    */
  def getDirections(): js.Promise[RouteLayerSolveResult] = js.native
  
  /**
    * Highlights the specified network feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#highlight)
    */
  def highlight(networkFeature: DirectionLine): js.Promise[Any] = js.native
  def highlight(networkFeature: DirectionPoint): js.Promise[Any] = js.native
  def highlight(networkFeature: PointBarrier): js.Promise[Any] = js.native
  def highlight(networkFeature: PolygonBarrier): js.Promise[Any] = js.native
  def highlight(networkFeature: PolylineBarrier): js.Promise[Any] = js.native
  def highlight(networkFeature: RouteInfo): js.Promise[Any] = js.native
  def highlight(networkFeature: Stop): js.Promise[Any] = js.native
  
  /**
    * Highlights the specified route segment on the map.
    *
    * @deprecated since version 4.24. Use [highlight](#highlight) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#highlightSegment)
    */
  def highlightSegment(maneuver: Graphic): scala.Unit = js.native
  
  /**
    * The network attribute name to be used as the impedance attribute in the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#impedanceAttribute)
    */
  val impedanceAttribute: DirectionsViewModelImpedanceAttribute = js.native
  
  /**
    * The most recent route result.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#lastRoute)
    */
  val lastRoute: DirectionsViewModelLastRoute = js.native
  
  /**
    * The [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html) associated with the DirectionsViewModel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#layer)
    */
  var layer: RouteLayer = js.native
  
  /**
    * This method should be called to load the view model's routing resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#load)
    */
  def load(): js.Promise[Any] = js.native
  
  /**
    * The maximum number of stops allowed for routing.
    *
    * @default 50
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#maxStops)
    */
  var maxStops: Double = js.native
  
  /**
    * Resets the state of the ViewModel, clearing all the input stops and results in the widget and in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#reset)
    */
  def reset(): scala.Unit = js.native
  
  /**
    * Route Parameters object used to call the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeParameters)
    */
  var routeParameters: RouteParameters = js.native
  
  /**
    * The URL of the REST endpoint of the Route service.
    *
    * @deprecated since version 4.24. Use {@link module:esri/layers/RouteLayer#url url} from [layer](#layer) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeServiceUrl)
    */
  var routeServiceUrl: String = js.native
  
  /**
    * Defines the symbol used to draw the route on the map.
    *
    * @deprecated since version 4.24. Use {@link module:esri/layers/support/RouteSymbols#directionLines directionLines} from [layer](#layer) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#routeSymbol)
    */
  var routeSymbol: SimpleLineSymbol = js.native
  
  /**
    * Saves the RouteLayer associated with the view model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#save)
    */
  def save(): js.Promise[PortalItem] = js.native
  
  /**
    * Saves the RouteLayer associated with the view model as a new portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#saveAs)
    */
  def saveAs(portalItem: js.Promise[PortalItem]): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: js.Promise[PortalItem], options: DirectionsViewModelSaveAsOptions): js.Promise[PortalItem] = js.native
  
  /**
    * The selected travel mode.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  var selectedTravelMode: TravelMode = js.native
  
  /**
    * The Service Description object returned by the Route REST Endpoint.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#serviceDescription)
    */
  val serviceDescription: DirectionsViewModelServiceDescription = js.native
  
  /**
    * The current state of the view model.
    *
    * @default disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#state)
    */
  val state: disabled | ready = js.native
  
  /**
    * The default stop symbols used to display locations between the origin and final destination.
    *
    * @deprecated since version 4.24. Use {@link module:esri/layers/support/RouteStopSymbols} from [layer](#layer) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var stopSymbols: DirectionsViewModelStopSymbols = js.native
  
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [Stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Stop.html)s that define the stop locations along the route.
    *
    * @deprecated since version 4.24. Use {@link module:esri/layers/RouteLayer#stops stops} from [layer](#layer) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stops)
    */
  var stops: Collection[Stop] = js.native
  
  /**
    * The name of the network attribute to use for the drive time when computing directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#timeAttribute)
    */
  val timeAttribute: DirectionsViewModelTimeAttribute = js.native
  
  /**
    * Array of objects containing properties specific to either an ArcGIS service or organization's travel modes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#travelModes)
    */
  val travelModes: js.Array[TravelMode] = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * Zoom so that the full route is displayed within the current map extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#zoomToRoute)
    */
  def zoomToRoute(): scala.Unit = js.native
}
