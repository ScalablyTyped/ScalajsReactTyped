package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WFSLayerElevationInfoFeatureExpressionInfo
  extends StObject
     with Object {
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Feature Z Profile](https://developers.arcgis.com/javascript/latest/arcade/#z-values).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html#elevationInfo)
    */
  var expression: js.UndefOr[String] = js.undefined
}
object WFSLayerElevationInfoFeatureExpressionInfo {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WFSLayerElevationInfoFeatureExpressionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[WFSLayerElevationInfoFeatureExpressionInfo]
  }
  
  extension [Self <: WFSLayerElevationInfoFeatureExpressionInfo](x: Self) {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
  }
}
