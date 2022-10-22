package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HitTestResult
  extends StObject
     with Object {
  
  /**
    * An array of result objects returned from the [hitTest()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#HitTestResult)
    */
  var results: js.Array[ViewHit]
  
  /**
    * The screen coordinates (or native mouse event) of the click on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#HitTestResult)
    */
  var screenPoint: MapViewScreenPoint
}
object HitTestResult {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    results: js.Array[ViewHit],
    screenPoint: MapViewScreenPoint
  ): HitTestResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), results = results.asInstanceOf[js.Any], screenPoint = screenPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitTestResult]
  }
  
  extension [Self <: HitTestResult](x: Self) {
    
    inline def setResults(value: js.Array[ViewHit]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: ViewHit*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setScreenPoint(value: MapViewScreenPoint): Self = StObject.set(x, "screenPoint", value.asInstanceOf[js.Any])
  }
}
