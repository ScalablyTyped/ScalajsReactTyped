package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`picture-fill`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`simple-fill`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillSymbol extends Symbol {
  /**
    * The outline of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html#outline)
    */
  var outline: SimpleLineSymbol = js.native
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html#type)
    */
  @JSName("type")
  var type_FillSymbol: `simple-fill` | `picture-fill` = js.native
}

@JSGlobal("__esri.FillSymbol")
@js.native
object FillSymbol extends TopLevel[FillSymbolConstructor]

