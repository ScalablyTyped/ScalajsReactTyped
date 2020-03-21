package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`label-3d`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`line-3d`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`mesh-3d`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`picture-fill`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`picture-marker`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`point-3d`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`polygon-3d`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`shield-label-symbol`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`simple-fill`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`simple-line`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`simple-marker`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`web-style`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.cim
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Symbol
  extends Accessor
     with JSONSupport {
  /**
    * The color of the symbol. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#color)
    *
    * @default black
    */
  var color: Color_ = js.native
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#type)
    */
  val `type`: `simple-marker` | `picture-marker` | `simple-line` | `simple-fill` | `picture-fill` | text | `shield-label-symbol` | `point-3d` | `line-3d` | `polygon-3d` | `web-style` | `mesh-3d` | `label-3d` | cim = js.native
}

@JSGlobal("__esri.Symbol")
@js.native
object Symbol extends SymbolConstructor

