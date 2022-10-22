package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.IHandle
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`going-home`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.disabled
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.go
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HomeViewModel
  extends StObject
     with Accessor
     with Evented
     with GoTo {
  
  /**
    * This function provides the ability to interrupt and cancel the process of navigating the view back to the view's initial extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#cancelGo)
    */
  def cancelGo(): scala.Unit = js.native
  
  /**
    * Animates the view to the initial [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) of the view or the value of [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#viewpoint).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#go)
    */
  def go(): scala.Unit = js.native
  
  @JSName("on")
  def on_go(name: go, eventHandler: HomeViewModelGoEventHandler): IHandle = js.native
  
  /**
    * The current state of the widget.
    *
    * @default disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#state)
    */
  val state: disabled | ready | `going-home` = js.native
  
  /**
    * The view associated with the widget instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * The [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html), or point of view, to zoom to when going home.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#viewpoint)
    */
  var viewpoint: Viewpoint = js.native
}
