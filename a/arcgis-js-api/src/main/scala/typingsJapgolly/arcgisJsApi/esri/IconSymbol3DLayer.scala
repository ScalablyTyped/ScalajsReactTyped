package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.bottom_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.center_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.icon
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.left_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.relative_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.right_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.top_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconSymbol3DLayer
  extends StObject
     with Symbol3DLayer
     with typingsJapgolly.arcgisJsApi.esri.symbols.Symbol3DLayer
     with symbolsSymbol3DLayer {
  
  /**
    * The positioning of the icon relative to the geometry.
    *
    * @default center
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor)
    */
  var anchor: center_ | left_ | right_ | top_ | bottom_ | `top-left` | `top-right` | `bottom-left` | `bottom-right` | relative_ = js.native
  
  /**
    * Defines the [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor) relative to the center of the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchorPosition)
    */
  var anchorPosition: IconSymbol3DLayerAnchorPosition = js.native
  
  /**
    * The material used to shade the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#material)
    */
  var material: IconSymbol3DLayerMaterial = js.native
  
  /**
    * The outline of the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#outline)
    */
  var outline: IconSymbol3DLayerOutline = js.native
  
  /**
    * The shape (`primitive`) or image URL (`href`) used to visualize the features.
    *
    * @default { primitive: "circle" }
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#resource)
    */
  var resource: IconSymbol3DLayerResource = js.native
  
  /**
    * The size of the icon in points.
    *
    * @default 12
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#size)
    */
  var size: Double = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#type)
    */
  @JSName("type")
  val type_IconSymbol3DLayer: icon = js.native
}
