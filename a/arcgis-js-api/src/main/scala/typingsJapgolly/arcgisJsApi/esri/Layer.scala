package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.IHandle
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`base-dynamic`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`base-elevation`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`base-tile`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`bing-maps`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`building-scene`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`geo-rss`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`georeferenced-image`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`imagery-tile`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`integrated-mesh`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`layerview-create-error`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`layerview-create`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`layerview-destroy`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`line-of-sight`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`map-image`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`map-notes`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`ogc-feature`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`open-street-map`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`point-cloud`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`subtype-group`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`vector-tile`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`web-tile`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.csv
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.elevation
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.feature
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geojson
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.graphics
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.group
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hide
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.imagery
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.kml
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.media
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.scene
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.show
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.stream
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tile
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.unknown
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.unsupported
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.voxel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.wcs
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.wfs
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.wms
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.wmts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer
  extends StObject
     with Accessor
     with Loadable
     with Evented
     with IntersectItem
     with _HitTestItem {
  
  /**
    * Called by the views, such as [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), when the layer is added to the [Map.layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) collection and a layer view must be created for it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#createLayerView)
    */
  def createLayerView(view: Any): js.Promise[LayerView] = js.native
  def createLayerView(view: Any, options: LayerCreateLayerViewOptions): js.Promise[LayerView] = js.native
  
  /**
    * Fetches custom attribution data for the layer when it becomes available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fetchAttributionData)
    */
  def fetchAttributionData(): js.Promise[Any] = js.native
  
  /**
    * The full extent of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fullExtent)
    */
  var fullExtent: Extent = js.native
  
  /**
    * The unique ID assigned to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#id)
    */
  var id: String = js.native
  
  /**
    * Indicates how the layer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
    *
    * @default show
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#listMode)
    */
  var listMode: show | hide | `hide-children` = js.native
  
  /**
    * Indicates whether the layer's resources have loaded.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#loaded)
    */
  val loaded: Boolean = js.native
  
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: LayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: LayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: LayerLayerviewDestroyEventHandler): IHandle = js.native
  
  /**
    * The opacity of the layer.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#opacity)
    */
  var opacity: Double = js.native
  
  /**
    * The title of the layer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#title)
    */
  var title: String = js.native
  
  /**
    * The layer type provides a convenient way to check the type of the layer without the need to import specific layer modules.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#type)
    */
  val `type`: `base-dynamic` | `base-elevation` | `base-tile` | `bing-maps` | `building-scene` | csv | elevation | feature | geojson | `geo-rss` | graphics | group | imagery | `imagery-tile` | `integrated-mesh` | kml | `line-of-sight` | `map-image` | `map-notes` | media | `ogc-feature` | `open-street-map` | `point-cloud` | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.route | scene | `georeferenced-image` | stream | tile | unknown | unsupported | `vector-tile` | wcs | `web-tile` | wfs | wms | wmts | voxel | `subtype-group` = js.native
  
  /**
    * Indicates if the layer is visible in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#visible)
    */
  var visible: Boolean = js.native
}
