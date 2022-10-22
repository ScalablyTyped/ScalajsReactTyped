package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.esri.GoToOverride
import typingsJapgolly.arcgisJsApi.esri.UtilityNetworkTraceViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.UtilityNetworkTraceViewModel")
@js.native
/**
  * Provides the logic for the [UtilityNetworkTrace](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html) widget.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html)
  */
open class UtilityNetworkTraceViewModelCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.UtilityNetworkTraceViewModel {
  def this(properties: UtilityNetworkTraceViewModelProperties) = this()
  
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
}
