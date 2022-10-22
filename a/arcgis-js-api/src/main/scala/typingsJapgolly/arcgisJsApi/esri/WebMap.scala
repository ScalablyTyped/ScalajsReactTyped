package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`not-loaded`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.failed
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.loading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebMap
  extends StObject
     with Map
     with corePromise
     with _ProfileVariableInstanceType {
  
  /**
    * The applicationProperties contains the viewing properties of the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#applicationProperties)
    */
  var applicationProperties: ApplicationProperties = js.native
  
  /**
    * The name of the application that authored the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#authoringApp)
    */
  var authoringApp: String = js.native
  
  /**
    * The version of the application that authored the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#authoringAppVersion)
    */
  var authoringAppVersion: String = js.native
  
  /**
    * An array of saved geographic extents that allow end users to quickly navigate to a particular area of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#bookmarks)
    */
  var bookmarks: Collection[Bookmark] = js.native
  
  /**
    * When a web map is configured as floor-aware, it has a floorInfo property defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#floorInfo)
    */
  var floorInfo: MapFloorInfo = js.native
  
  /**
    * Information relating to a list of Geotriggers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#geotriggersInfo)
    */
  var geotriggersInfo: GeotriggersInfo = js.native
  
  /**
    * The initial view of the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#initialViewProperties)
    */
  var initialViewProperties: InitialViewProperties = js.native
  
  /**
    * Triggers the loading of the WebMap instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#load)
    */
  def load(): js.Promise[Any] = js.native
  
  /**
    * Loads all the externally loadable resources associated with the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#loadAll)
    */
  def loadAll(): js.Promise[WebMap] = js.native
  
  /**
    * The Error object returned if an error occurred while loading.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#loadError)
    */
  val loadError: Error = js.native
  
  /**
    * Represents the status of a [load](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#load) operation.
    *
    * @default not-loaded
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#loadStatus)
    */
  val loadStatus: `not-loaded` | loading | failed | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.loaded = js.native
  
  /**
    * Indicates whether the instance has loaded.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#loaded)
    */
  val loaded: Boolean = js.native
  
  /**
    * The portal item from which the WebMap is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#portalItem)
    */
  var portalItem: PortalItem = js.native
  
  /**
    * Provides multiple slides.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#presentation)
    */
  var presentation: Any = js.native
  
  /**
    * Saves the webmap to its associated portal item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#save)
    */
  def save(): js.Promise[PortalItem] = js.native
  def save(options: WebMapSaveOptions): js.Promise[PortalItem] = js.native
  
  /**
    * Saves the webmap to a new [portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#saveAs)
    */
  def saveAs(portalItem: PortalItem): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: PortalItemProperties): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: PortalItemProperties, options: WebMapSaveAsOptions): js.Promise[PortalItem] = js.native
  def saveAs(portalItem: PortalItem, options: WebMapSaveAsOptions): js.Promise[PortalItem] = js.native
  
  /**
    * The version of the source document from which the WebMap was read.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#sourceVersion)
    */
  val sourceVersion: WebMapSourceVersion = js.native
  
  /**
    * The URL to the thumbnail used for the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#thumbnailUrl)
    */
  var thumbnailUrl: String = js.native
  
  /**
    * Update properties of the WebMap related to the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  def updateFrom(view: MapView): js.Promise[Any] = js.native
  def updateFrom(view: MapView, options: WebMapUpdateFromOptions): js.Promise[Any] = js.native
  
  /**
    * The utilityNetworks object contains a collection of [UtilityNetworks](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html) saved on the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#utilityNetworks)
    */
  var utilityNetworks: Collection[UtilityNetwork] = js.native
  
  /**
    * The widgets object contains widgets that are exposed to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#widgets)
    */
  var widgets: Widgets = js.native
}
