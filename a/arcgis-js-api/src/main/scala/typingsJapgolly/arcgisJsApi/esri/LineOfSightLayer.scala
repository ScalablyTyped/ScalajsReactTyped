package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`line-of-sight`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineOfSightLayer
  extends StObject
     with Layer {
  
  /**
    * The [LineOfSightAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysis.html) associated with the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-LineOfSightLayer.html#analysis)
    */
  var analysis: LineOfSightAnalysis = js.native
  
  /**
    * Observer location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-LineOfSightLayer.html#observer)
    */
  var observer: LineOfSightAnalysisObserver = js.native
  
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-LineOfSightLayer.html#spatialReference)
    */
  val spatialReference: SpatialReference = js.native
  
  /**
    * Target locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-LineOfSightLayer.html#targets)
    */
  var targets: Collection[LineOfSightAnalysisTarget] = js.native
  
  @JSName("type")
  val type_LineOfSightLayer: `line-of-sight` = js.native
}
