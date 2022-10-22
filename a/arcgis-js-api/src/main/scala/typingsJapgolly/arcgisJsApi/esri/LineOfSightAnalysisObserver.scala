package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineOfSightAnalysisObserver
  extends StObject
     with Accessor {
  
  /**
    * Specifies how the observer is placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysisObserver.html#elevationInfo)
    */
  var elevationInfo: LineOfSightAnalysisObserverElevationInfo = js.native
  
  /**
    * Specifies a feature which shall be excluded from intersection testing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysisObserver.html#feature)
    */
  var feature: Graphic = js.native
  
  /**
    * A [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing the position of the observer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-LineOfSightAnalysisObserver.html#position)
    */
  var position: Point = js.native
}
