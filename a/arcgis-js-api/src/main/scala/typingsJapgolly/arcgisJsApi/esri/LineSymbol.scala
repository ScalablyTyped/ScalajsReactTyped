package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`simple-line`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineSymbol extends Symbol {
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol.html#type)
    */
  @JSName("type")
  var type_LineSymbol: `simple-line` = js.native
  /**
    * The width of the symbol in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol.html#width)
    *
    * @default 0.75
    */
  var width: Double = js.native
}

@JSGlobal("__esri.LineSymbol")
@js.native
object LineSymbol extends TopLevel[LineSymbolConstructor]

