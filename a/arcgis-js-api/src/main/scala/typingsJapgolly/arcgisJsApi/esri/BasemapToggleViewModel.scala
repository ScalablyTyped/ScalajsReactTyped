package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.disabled
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasemapToggleViewModel
  extends StObject
     with Accessor
     with Evented {
  
  /**
    * The map's [basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#activeBasemap)
    */
  val activeBasemap: Basemap = js.native
  
  /**
    * The next basemap for toggling.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#nextBasemap)
    */
  var nextBasemap: Basemap = js.native
  
  /**
    * The view model's state.
    *
    * @default disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#state)
    */
  val state: ready | disabled = js.native
  
  /**
    * Toggles to the [next basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#nextBasemap).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#toggle)
    */
  def toggle(): scala.Unit = js.native
  
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
}
