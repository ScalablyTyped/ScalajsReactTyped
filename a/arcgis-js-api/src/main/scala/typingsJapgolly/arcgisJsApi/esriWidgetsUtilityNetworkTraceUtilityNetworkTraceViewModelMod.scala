package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.GoToOverride
import typingsJapgolly.arcgisJsApi.esri.MapView
import typingsJapgolly.arcgisJsApi.esri.SceneView
import typingsJapgolly.arcgisJsApi.esri.UtilityNetworkTraceViewModel
import typingsJapgolly.arcgisJsApi.esri.UtilityNetworkTraceViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.UtilityNetworkTraceViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsUtilityNetworkTraceUtilityNetworkTraceViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/UtilityNetworkTrace/UtilityNetworkTraceViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & UtilityNetworkTraceViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/UtilityNetworkTrace/UtilityNetworkTraceViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [UtilityNetworkTrace](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html)
    */
  open class Class ()
    extends StObject
       with UtilityNetworkTraceViewModel {
    def this(properties: UtilityNetworkTraceViewModelProperties) = this()
    
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
  
  type _To = js.Object & UtilityNetworkTraceViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsUtilityNetworkTraceUtilityNetworkTraceViewModelMod.foo` */
  override def _to: js.Object & UtilityNetworkTraceViewModelConstructor = ^
}
