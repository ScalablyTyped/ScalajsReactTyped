package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.click
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.freehand
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hybrid
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchCreateCreateOptions
  extends StObject
     with Object {
  
  /**
    * The default z-value of the newly created geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create)
    */
  var defaultZ: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls whether the created geometry has z-values or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create)
    */
  var hasZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how the graphic can be created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create)
    */
  var mode: js.UndefOr[hybrid | freehand | click] = js.undefined
}
object SketchCreateCreateOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SketchCreateCreateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SketchCreateCreateOptions]
  }
  
  extension [Self <: SketchCreateCreateOptions](x: Self) {
    
    inline def setDefaultZ(value: Double): Self = StObject.set(x, "defaultZ", value.asInstanceOf[js.Any])
    
    inline def setDefaultZUndefined: Self = StObject.set(x, "defaultZ", js.undefined)
    
    inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    
    inline def setMode(value: hybrid | freehand | click): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
