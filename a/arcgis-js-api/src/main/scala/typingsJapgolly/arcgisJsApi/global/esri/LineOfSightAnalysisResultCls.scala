package typingsJapgolly.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.LineOfSightAnalysisResult")
@js.native
/**
  * Contains the result for a line of sight analysis from a [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html)
  */
open class LineOfSightAnalysisResultCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.LineOfSightAnalysisResult {
  def this(properties: Any) = this()
  
  /**
    * The first [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) intersected by the line of sight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#intersectedGraphic)
    */
  /* CompleteClass */
  override val intersectedGraphic: typingsJapgolly.arcgisJsApi.esri.Graphic = js.native
  
  /**
    * A [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing the location where the line of sight first intersects the ground or 3D objects in the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#intersectedLocation)
    */
  /* CompleteClass */
  override val intersectedLocation: typingsJapgolly.arcgisJsApi.esri.Point = js.native
  
  /**
    * Represents a target in a [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html) which is used to calculate the visibility from the [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html#observer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#target)
    */
  /* CompleteClass */
  var target: typingsJapgolly.arcgisJsApi.esri.LineOfSightAnalysisTarget = js.native
  
  /**
    * Whether the target is visible from the observer or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#visible)
    */
  /* CompleteClass */
  override val visible: Boolean = js.native
}
