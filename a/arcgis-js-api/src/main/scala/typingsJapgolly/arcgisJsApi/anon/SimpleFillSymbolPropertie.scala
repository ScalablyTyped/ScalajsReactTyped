package typingsJapgolly.arcgisJsApi.anon

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`backward-diagonal`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`diagonal-cross`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`forward-diagonal`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`picture-fill`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`simple-fill`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.cross
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.horizontal
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.solid
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.vertical
import typingsJapgolly.arcgisJsApi.esri.Color_
import typingsJapgolly.arcgisJsApi.esri.SimpleLineSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.SimpleFillSymbolProperties & {  type :'simple-fill'} */
trait SimpleFillSymbolPropertie extends StObject {
  
  /**
    * The color of the symbol.
    *
    * @default black
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * The outline of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html#outline)
    */
  var outline: js.UndefOr[SimpleLineSymbolProperties] = js.undefined
  
  /**
    * The fill style.
    *
    * @default solid
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#style)
    */
  var style: js.UndefOr[
    `backward-diagonal` | cross | `diagonal-cross` | `forward-diagonal` | horizontal | none_ | solid | vertical
  ] = js.undefined
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html#type)
    */
  var `type`: (js.UndefOr[`simple-fill` | `picture-fill`]) & `simple-fill`
}
object SimpleFillSymbolPropertie {
  
  inline def apply(`type`: (js.UndefOr[`simple-fill` | `picture-fill`]) & `simple-fill`): SimpleFillSymbolPropertie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleFillSymbolPropertie]
  }
  
  extension [Self <: SimpleFillSymbolPropertie](x: Self) {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setOutline(value: SimpleLineSymbolProperties): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setStyle(
      value: `backward-diagonal` | cross | `diagonal-cross` | `forward-diagonal` | horizontal | none_ | solid | vertical
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: (js.UndefOr[`simple-fill` | `picture-fill`]) & `simple-fill`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
