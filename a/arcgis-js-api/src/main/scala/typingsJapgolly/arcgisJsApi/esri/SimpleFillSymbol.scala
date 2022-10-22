package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`backward-diagonal`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`diagonal-cross`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`forward-diagonal`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`simple-fill`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.cross
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.horizontal
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.solid
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleFillSymbol
  extends StObject
     with FillSymbol
     with typingsJapgolly.arcgisJsApi.esri.symbols.FillSymbol
     with typingsJapgolly.arcgisJsApi.esri.symbols.Symbol2D
     with Symbol2D
     with symbolsFillSymbol {
  
  /**
    * The fill style.
    *
    * @default solid
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#style)
    */
  var style: `backward-diagonal` | cross | `diagonal-cross` | `forward-diagonal` | horizontal | none_ | solid | vertical = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#type)
    */
  @JSName("type")
  val type_SimpleFillSymbol: `simple-fill` = js.native
}
