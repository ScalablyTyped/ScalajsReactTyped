package typingsJapgolly.ol.olTileMod

import typingsJapgolly.ol.tileStateMod.TileState
import typingsJapgolly.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Tile", JSImport.Default)
@js.native
abstract class default protected () extends Tile {
  def this(tileCoord: TileCoord, state: TileState) = this()
  def this(tileCoord: TileCoord, state: TileState, opt_options: Options) = this()
}

