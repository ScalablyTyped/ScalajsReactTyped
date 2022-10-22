package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`dash-dot`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`long-dash-dot-dot`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`long-dash-dot`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`long-dash`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`short-dash-dot-dot`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`short-dash-dot`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`short-dash`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`short-dot`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.bevel_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.butt_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.dash
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.dot
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.miter_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.round_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.solid
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.square_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleLineSymbol
  extends StObject
     with LineSymbol
     with typingsJapgolly.arcgisJsApi.esri.symbols.Symbol2D
     with Symbol2D {
  
  /**
    * Specifies the cap style.
    *
    * @default round
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#cap)
    */
  var cap: butt_ | round_ | square_ = js.native
  
  /**
    * Specifies the join style.
    *
    * @default round
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#join)
    */
  var join: miter_ | round_ | bevel_ = js.native
  
  /**
    * Specifies the color, style, and placement of a symbol marker on the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#marker)
    */
  var marker: LineSymbolMarker = js.native
  
  /**
    * Maximum allowed ratio of the width of a miter join to the line width.
    *
    * @default 2
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#miterLimit)
    */
  var miterLimit: Double = js.native
  
  /**
    * Specifies the line style.
    *
    * @default solid
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#style)
    */
  var style: dash | `dash-dot` | dot | `long-dash` | `long-dash-dot` | `long-dash-dot-dot` | none_ | `short-dash` | `short-dash-dot` | `short-dash-dot-dot` | `short-dot` | solid = js.native
}
