package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.CoordinateConversion
import typingsJapgolly.arcgisJsApi.esri.CoordinateConversionConstructor
import typingsJapgolly.arcgisJsApi.esri.CoordinateConversionProperties
import typingsJapgolly.arcgisJsApi.esri.GoToOverride
import typingsJapgolly.arcgisJsApi.esri.MapView
import typingsJapgolly.arcgisJsApi.esri.SceneView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsCoordinateConversionMod extends Shortcut {
  
  @JSImport("esri/widgets/CoordinateConversion", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CoordinateConversionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/CoordinateConversion", JSImport.Namespace)
  @js.native
  /**
    * The CoordinateConversion widget provides a way to display user cursor position either as map coordinates or as any of several popular coordinate notations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html)
    */
  open class Class ()
    extends StObject
       with CoordinateConversion {
    def this(properties: CoordinateConversionProperties) = this()
    
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
  
  type _To = js.Object & CoordinateConversionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsCoordinateConversionMod.foo` */
  override def _to: js.Object & CoordinateConversionConstructor = ^
}
