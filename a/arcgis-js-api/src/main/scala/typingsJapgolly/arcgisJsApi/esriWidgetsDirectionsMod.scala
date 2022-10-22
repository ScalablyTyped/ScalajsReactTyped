package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Directions
import typingsJapgolly.arcgisJsApi.esri.DirectionsConstructor
import typingsJapgolly.arcgisJsApi.esri.DirectionsProperties
import typingsJapgolly.arcgisJsApi.esri.GoToOverride
import typingsJapgolly.arcgisJsApi.esri.MapView
import typingsJapgolly.arcgisJsApi.esri.SceneView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsDirectionsMod extends Shortcut {
  
  @JSImport("esri/widgets/Directions", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DirectionsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Directions", JSImport.Namespace)
  @js.native
  /**
    * The Directions widget provides a way to calculate directions, between two or more input locations with a [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html), using ArcGIS Online and custom Network Analysis Route services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html)
    */
  open class Class ()
    extends StObject
       with Directions {
    def this(properties: DirectionsProperties) = this()
    
    /**
      * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
      */
    /* CompleteClass */
    override def goToOverride(view: MapView, goToParameters: Any): Unit = js.native
    /* CompleteClass */
    override def goToOverride(view: SceneView, goToParameters: Any): Unit = js.native
    /**
      * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
      */
    /* CompleteClass */
    @JSName("goToOverride")
    var goToOverride_Original: GoToOverride = js.native
  }
  
  type _To = js.Object & DirectionsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsDirectionsMod.foo` */
  override def _to: js.Object & DirectionsConstructor = ^
}
