package typingsJapgolly.arcgisJsApi.anon

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`object`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.bottom_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.center_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.origin
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.relative_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.top_
import typingsJapgolly.arcgisJsApi.esri.ObjectSymbol3DLayerAnchorPosition
import typingsJapgolly.arcgisJsApi.esri.ObjectSymbol3DLayerMaterialProperties
import typingsJapgolly.arcgisJsApi.esri.ObjectSymbol3DLayerResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.ObjectSymbol3DLayerProperties & {  type :'object'} */
trait ObjectSymbol3DLayerProper extends StObject {
  
  /**
    * The positioning of the symbol relative to the geometry.
    *
    * @default origin
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor)
    */
  var anchor: js.UndefOr[center_ | top_ | bottom_ | origin | relative_] = js.undefined
  
  /**
    * Defines the [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor) relative to the center of the [symbol layer resource](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchorPosition)
    */
  var anchorPosition: js.UndefOr[ObjectSymbol3DLayerAnchorPosition] = js.undefined
  
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#castShadows)
    */
  var castShadows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The depth, or diameter from north to south, of the object in meters.
    *
    * @default 10
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#depth)
    */
  var depth: js.UndefOr[Double] = js.undefined
  
  /**
    * The clockwise rotation of the symbol in the horizontal plane (i.e., around the z axis).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#heading)
    */
  var heading: js.UndefOr[Double] = js.undefined
  
  /**
    * The height of the object in meters.
    *
    * @default 10
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#height)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The material used to shade the object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[ObjectSymbol3DLayerMaterialProperties] = js.undefined
  
  /**
    * The primitive shape (`primitive`) or external 3D model (`href`) used to visualize the points.
    *
    * @default { primitive: "sphere" }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource)
    */
  var resource: js.UndefOr[ObjectSymbol3DLayerResource] = js.undefined
  
  /**
    * The rotation of the symbol in the lateral vertical plane (i.e., around the y axis).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#roll)
    */
  var roll: js.UndefOr[Double] = js.undefined
  
  /**
    * The rotation of the symbol in the longitudinal vertical plane (i.e., around the x axis).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#tilt)
    */
  var tilt: js.UndefOr[Double] = js.undefined
  
  var `type`: `object`
  
  /**
    * The width, or diameter from east to west, of the object in meters.
    *
    * @default 10
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#width)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ObjectSymbol3DLayerProper {
  
  inline def apply(): ObjectSymbol3DLayerProper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("object")
    __obj.asInstanceOf[ObjectSymbol3DLayerProper]
  }
  
  extension [Self <: ObjectSymbol3DLayerProper](x: Self) {
    
    inline def setAnchor(value: center_ | top_ | bottom_ | origin | relative_): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorPosition(value: ObjectSymbol3DLayerAnchorPosition): Self = StObject.set(x, "anchorPosition", value.asInstanceOf[js.Any])
    
    inline def setAnchorPositionUndefined: Self = StObject.set(x, "anchorPosition", js.undefined)
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setCastShadows(value: Boolean): Self = StObject.set(x, "castShadows", value.asInstanceOf[js.Any])
    
    inline def setCastShadowsUndefined: Self = StObject.set(x, "castShadows", js.undefined)
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMaterial(value: ObjectSymbol3DLayerMaterialProperties): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setResource(value: ObjectSymbol3DLayerResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
    
    inline def setRollUndefined: Self = StObject.set(x, "roll", js.undefined)
    
    inline def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    inline def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
    
    inline def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
