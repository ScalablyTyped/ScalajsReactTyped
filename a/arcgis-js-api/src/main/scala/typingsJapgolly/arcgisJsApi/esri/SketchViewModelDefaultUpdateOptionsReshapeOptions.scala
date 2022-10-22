package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`move-xy`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.move
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.offset
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.split
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchViewModelDefaultUpdateOptionsReshapeOptions
  extends StObject
     with Object {
  
  /**
    * Sets the reshape operation on the edge.
    *
    * @default "split"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var edgeOperation: js.UndefOr[none_ | split | offset] = js.undefined
  
  /**
    * Sets the move constraints for the whole shape.
    *
    * @default "move"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var shapeOperation: js.UndefOr[none_ | move | `move-xy`] = js.undefined
  
  /**
    * Sets the move constraints for the vertex.
    *
    * @default "move"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var vertexOperation: js.UndefOr[move | `move-xy`] = js.undefined
}
object SketchViewModelDefaultUpdateOptionsReshapeOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SketchViewModelDefaultUpdateOptionsReshapeOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SketchViewModelDefaultUpdateOptionsReshapeOptions]
  }
  
  extension [Self <: SketchViewModelDefaultUpdateOptionsReshapeOptions](x: Self) {
    
    inline def setEdgeOperation(value: none_ | split | offset): Self = StObject.set(x, "edgeOperation", value.asInstanceOf[js.Any])
    
    inline def setEdgeOperationUndefined: Self = StObject.set(x, "edgeOperation", js.undefined)
    
    inline def setShapeOperation(value: none_ | move | `move-xy`): Self = StObject.set(x, "shapeOperation", value.asInstanceOf[js.Any])
    
    inline def setShapeOperationUndefined: Self = StObject.set(x, "shapeOperation", js.undefined)
    
    inline def setVertexOperation(value: move | `move-xy`): Self = StObject.set(x, "vertexOperation", value.asInstanceOf[js.Any])
    
    inline def setVertexOperationUndefined: Self = StObject.set(x, "vertexOperation", js.undefined)
  }
}
