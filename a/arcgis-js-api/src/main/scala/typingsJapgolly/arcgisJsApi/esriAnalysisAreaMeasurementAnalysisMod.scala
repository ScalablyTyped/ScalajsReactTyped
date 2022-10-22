package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.AreaMeasurementAnalysis
import typingsJapgolly.arcgisJsApi.esri.AreaMeasurementAnalysisConstructor
import typingsJapgolly.arcgisJsApi.esri.AreaMeasurementAnalysisProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriAnalysisAreaMeasurementAnalysisMod extends Shortcut {
  
  @JSImport("esri/analysis/AreaMeasurementAnalysis", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AreaMeasurementAnalysisConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/analysis/AreaMeasurementAnalysis", JSImport.Namespace)
  @js.native
  /**
    * AreaMeasurementAnalysis computes the area of a polygonal region and displays the measurement in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-AreaMeasurementAnalysis.html)
    */
  open class Class ()
    extends StObject
       with AreaMeasurementAnalysis {
    def this(properties: AreaMeasurementAnalysisProperties) = this()
  }
  
  type _To = js.Object & AreaMeasurementAnalysisConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriAnalysisAreaMeasurementAnalysisMod.foo` */
  override def _to: js.Object & AreaMeasurementAnalysisConstructor = ^
}
