package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.GeolocationPositioning
import typingsJapgolly.arcgisJsApi.esri.GeolocationPositioningConstructor
import typingsJapgolly.arcgisJsApi.esri.Graphic
import typingsJapgolly.arcgisJsApi.esri.MapView
import typingsJapgolly.arcgisJsApi.esri.SceneView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSupportGeolocationPositioningMod extends Shortcut {
  
  @JSImport("esri/widgets/support/GeolocationPositioning", JSImport.Namespace)
  @js.native
  val ^ : GeolocationPositioningConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/support/GeolocationPositioning", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with GeolocationPositioning {
    
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
      * The graphic used to show the user's location on the map.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#graphic)
      */
    /* CompleteClass */
    var graphic: Graphic = js.native
    
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
    var view: MapView | SceneView = js.native
  }
  
  type _To = GeolocationPositioningConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSupportGeolocationPositioningMod.foo` */
  override def _to: GeolocationPositioningConstructor = ^
}
