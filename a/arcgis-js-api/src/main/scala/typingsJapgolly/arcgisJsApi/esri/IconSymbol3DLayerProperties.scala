package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.bottom_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.center_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.left_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.relative_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.right_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.top_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconSymbol3DLayerProperties
  extends StObject
     with Symbol3DLayerProperties {
  
  /**
    * The positioning of the icon relative to the geometry.
    *
    * @default center
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor)
    */
  var anchor: js.UndefOr[
    center_ | left_ | right_ | top_ | bottom_ | `top-left` | `top-right` | `bottom-left` | `bottom-right` | relative_
  ] = js.undefined
  
  /**
    * Defines the [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor) relative to the center of the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchorPosition)
    */
  var anchorPosition: js.UndefOr[IconSymbol3DLayerAnchorPosition] = js.undefined
  
  /**
    * The material used to shade the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[IconSymbol3DLayerMaterialProperties] = js.undefined
  
  /**
    * The outline of the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#outline)
    */
  var outline: js.UndefOr[IconSymbol3DLayerOutlineProperties] = js.undefined
  
  /**
    * The shape (`primitive`) or image URL (`href`) used to visualize the features.
    *
    * @default { primitive: "circle" }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#resource)
    */
  var resource: js.UndefOr[IconSymbol3DLayerResource] = js.undefined
  
  /**
    * The size of the icon in points.
    *
    * @default 12
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#size)
    */
  var size: js.UndefOr[Double | String] = js.undefined
}
object IconSymbol3DLayerProperties {
  
  inline def apply(): IconSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSymbol3DLayerProperties]
  }
  
  extension [Self <: IconSymbol3DLayerProperties](x: Self) {
    
    inline def setAnchor(
      value: center_ | left_ | right_ | top_ | bottom_ | `top-left` | `top-right` | `bottom-left` | `bottom-right` | relative_
    ): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorPosition(value: IconSymbol3DLayerAnchorPosition): Self = StObject.set(x, "anchorPosition", value.asInstanceOf[js.Any])
    
    inline def setAnchorPositionUndefined: Self = StObject.set(x, "anchorPosition", js.undefined)
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setMaterial(value: IconSymbol3DLayerMaterialProperties): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setOutline(value: IconSymbol3DLayerOutlineProperties): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setResource(value: IconSymbol3DLayerResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
