package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.auto
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.manual
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewConstraintsClipDistanceProperties
  extends StObject
     with Object {
  
  /**
    * The far clip distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var far: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the mode of the constraint which is either `auto` or `manual`.
    *
    * @default auto
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var mode: js.UndefOr[auto | manual] = js.undefined
  
  /**
    * The near clip distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var near: js.UndefOr[Double] = js.undefined
}
object SceneViewConstraintsClipDistanceProperties {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewConstraintsClipDistanceProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewConstraintsClipDistanceProperties]
  }
  
  extension [Self <: SceneViewConstraintsClipDistanceProperties](x: Self) {
    
    inline def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
    
    inline def setFarUndefined: Self = StObject.set(x, "far", js.undefined)
    
    inline def setMode(value: auto | manual): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
    
    inline def setNearUndefined: Self = StObject.set(x, "near", js.undefined)
  }
}
