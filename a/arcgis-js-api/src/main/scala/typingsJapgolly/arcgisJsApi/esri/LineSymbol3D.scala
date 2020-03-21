package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`line-3d`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineSymbol3D
  extends Symbol3D
     with typingsJapgolly.arcgisJsApi.esri.symbols.Symbol2D3D
     with Symbol2D3D
     with typingsJapgolly.arcgisJsApi.esri.symbols.Symbol3D
     with symbolsSymbol3D {
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html#type)
    */
  @JSName("type")
  val type_LineSymbol3D: `line-3d` = js.native
}

@JSGlobal("__esri.LineSymbol3D")
@js.native
object LineSymbol3D extends TopLevel[LineSymbol3DConstructor]

