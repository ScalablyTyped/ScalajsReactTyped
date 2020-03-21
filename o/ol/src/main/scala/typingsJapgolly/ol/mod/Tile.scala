package typingsJapgolly.ol.mod

import typingsJapgolly.ol.olTileMod.Options
import typingsJapgolly.ol.olTileMod.default
import typingsJapgolly.ol.tileStateMod.TileState
import typingsJapgolly.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "Tile")
@js.native
abstract class Tile protected () extends default {
  def this(tileCoord: TileCoord, state: TileState) = this()
  def this(tileCoord: TileCoord, state: TileState, opt_options: Options) = this()
}

