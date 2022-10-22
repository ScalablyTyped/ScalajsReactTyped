package typingsJapgolly.openlayers.global.ol

import typingsJapgolly.openlayers.mod.Tile.State
import typingsJapgolly.openlayers.mod.TileCoord
import typingsJapgolly.openlayers.mod.TileLoadFunctionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.VectorTile")
@js.native
open class VectorTile protected ()
  extends typingsJapgolly.openlayers.mod.VectorTile {
  /**
    * @param tileCoord Tile coordinate.
    * @param state State.
    * @param src Data source url.
    * @param format Feature format.
    * @param tileLoadFunction Tile load function.
    */
  def this(
    tileCoord: TileCoord,
    state: State,
    src: String,
    format: typingsJapgolly.openlayers.mod.format.Feature,
    tileLoadFunction: TileLoadFunctionType
  ) = this()
}
