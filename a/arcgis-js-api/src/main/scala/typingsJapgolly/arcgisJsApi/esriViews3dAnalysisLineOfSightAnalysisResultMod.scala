package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Graphic
import typingsJapgolly.arcgisJsApi.esri.LineOfSightAnalysisResult
import typingsJapgolly.arcgisJsApi.esri.LineOfSightAnalysisResultConstructor
import typingsJapgolly.arcgisJsApi.esri.LineOfSightAnalysisTarget
import typingsJapgolly.arcgisJsApi.esri.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dAnalysisLineOfSightAnalysisResultMod extends Shortcut {
  
  @JSImport("esri/views/3d/analysis/LineOfSightAnalysisResult", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LineOfSightAnalysisResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/3d/analysis/LineOfSightAnalysisResult", JSImport.Namespace)
  @js.native
  /**
    * Contains the result for a line of sight analysis from a [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html)
    */
  open class Class ()
    extends StObject
       with LineOfSightAnalysisResult {
    def this(properties: Any) = this()
    
    /**
      * The first [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) intersected by the line of sight.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#intersectedGraphic)
      */
    /* CompleteClass */
    override val intersectedGraphic: Graphic = js.native
    
    /**
      * A [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing the location where the line of sight first intersects the ground or 3D objects in the scene.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#intersectedLocation)
      */
    /* CompleteClass */
    override val intersectedLocation: Point = js.native
    
    /**
      * Represents a target in a [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html) which is used to calculate the visibility from the [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html#observer).
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#target)
      */
    /* CompleteClass */
    var target: LineOfSightAnalysisTarget = js.native
    
    /**
      * Whether the target is visible from the observer or not.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-analysis-LineOfSightAnalysisResult.html#visible)
      */
    /* CompleteClass */
    override val visible: Boolean = js.native
  }
  
  type _To = js.Object & LineOfSightAnalysisResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViews3dAnalysisLineOfSightAnalysisResultMod.foo` */
  override def _to: js.Object & LineOfSightAnalysisResultConstructor = ^
}
