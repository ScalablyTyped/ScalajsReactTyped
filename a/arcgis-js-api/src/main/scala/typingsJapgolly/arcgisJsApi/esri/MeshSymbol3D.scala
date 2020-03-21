package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`mesh-3d`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshSymbol3D
  extends Symbol3D
     with typingsJapgolly.arcgisJsApi.esri.symbols.Symbol2D3D
     with Symbol2D3D
     with typingsJapgolly.arcgisJsApi.esri.symbols.Symbol3D
     with symbolsSymbol3D {
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html#type)
    */
  @JSName("type")
  val type_MeshSymbol3D: `mesh-3d` = js.native
}

@JSGlobal("__esri.MeshSymbol3D")
@js.native
object MeshSymbol3D extends TopLevel[MeshSymbol3DConstructor]

