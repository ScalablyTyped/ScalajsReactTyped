package typingsJapgolly.arcgisJsApi.anon

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.slice
import typingsJapgolly.arcgisJsApi.esri.SlicePlaneProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.SliceAnalysisProperties & {  type :'slice'} */
trait SliceAnalysisPropertiesty extends StObject {
  
  /**
    * The shape used to slice elements in a 3D scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SliceAnalysis.html#shape)
    */
  var shape: js.UndefOr[SlicePlaneProperties] = js.undefined
  
  var `type`: slice
}
object SliceAnalysisPropertiesty {
  
  inline def apply(): SliceAnalysisPropertiesty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("slice")
    __obj.asInstanceOf[SliceAnalysisPropertiesty]
  }
  
  extension [Self <: SliceAnalysisPropertiesty](x: Self) {
    
    inline def setShape(value: SlicePlaneProperties): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setType(value: slice): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
