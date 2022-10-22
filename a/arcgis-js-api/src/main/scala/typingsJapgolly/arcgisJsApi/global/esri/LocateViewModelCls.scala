package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.GoToOverride
import typingsJapgolly.arcgisJsApi.esri.LocateViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.LocateViewModel")
@js.native
/**
  * Provides the logic for the [Locate](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html) widget, which animates the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) to the user's current location.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html)
  */
open class LocateViewModelCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.LocateViewModel {
  def this(properties: LocateViewModelProperties) = this()
  
  /**
    * The HTML5 Geolocation Position options for locating.
    *
    * @default { maximumAge: 0, timeout: 15000, enableHighAccuracy: true }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#geolocationOptions)
    */
  /* CompleteClass */
  var geolocationOptions: Any = js.native
  
  /**
    * Indicates whether to navigate the view to the position and scale of the geolocated result.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#goToLocationEnabled)
    */
  /* CompleteClass */
  var goToLocationEnabled: Boolean = js.native
  
  /**
    * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
    */
  /* CompleteClass */
  override def goToOverride(view: typingsJapgolly.arcgisJsApi.esri.MapView, goToParameters: Any): Unit = js.native
  /* CompleteClass */
  override def goToOverride(view: typingsJapgolly.arcgisJsApi.esri.SceneView, goToParameters: Any): Unit = js.native
  /**
    * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
    */
  /* CompleteClass */
  @JSName("goToOverride")
  var goToOverride_Original: GoToOverride = js.native
  
  /**
    * The graphic used to show the user's location on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#graphic)
    */
  /* CompleteClass */
  var graphic: typingsJapgolly.arcgisJsApi.esri.Graphic = js.native
  
  /**
    * The scale to set on the view when navigating to the position of the geolocated result.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#scale)
    */
  /* CompleteClass */
  var scale: Double = js.native
  
  /**
    * The view associated with the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#view)
    */
  /* CompleteClass */
  var view: typingsJapgolly.arcgisJsApi.esri.MapView | typingsJapgolly.arcgisJsApi.esri.SceneView = js.native
}
