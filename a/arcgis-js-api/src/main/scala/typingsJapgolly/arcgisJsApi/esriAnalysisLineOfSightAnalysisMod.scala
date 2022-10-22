package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.LineOfSightAnalysis
import typingsJapgolly.arcgisJsApi.esri.LineOfSightAnalysisConstructor
import typingsJapgolly.arcgisJsApi.esri.LineOfSightAnalysisProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriAnalysisLineOfSightAnalysisMod extends Shortcut {
  
  @JSImport("esri/analysis/LineOfSightAnalysis", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LineOfSightAnalysisConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/analysis/LineOfSightAnalysis", JSImport.Namespace)
  @js.native
  /**
    * LineOfSightAnalysis computes the line of sight from a single observer position towards a set of targets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html)
    */
  open class Class ()
    extends StObject
       with LineOfSightAnalysis {
    def this(properties: LineOfSightAnalysisProperties) = this()
  }
  
  type _To = js.Object & LineOfSightAnalysisConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriAnalysisLineOfSightAnalysisMod.foo` */
  override def _to: js.Object & LineOfSightAnalysisConstructor = ^
}
