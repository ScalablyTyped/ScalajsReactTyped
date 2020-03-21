package typingsJapgolly.ol.zoomifyMod

import typingsJapgolly.ol.olTileMod.LoadFunction
import typingsJapgolly.ol.tileStateMod.TileState
import typingsJapgolly.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/Zoomify", "CustomTile")
@js.native
class CustomTile protected ()
  extends typingsJapgolly.ol.imageTileMod.default {
  def this(
    tilePixelRatio: Double,
    tileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    crossOrigin: String,
    tileLoadFunction: LoadFunction
  ) = this()
  def this(
    tilePixelRatio: Double,
    tileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    crossOrigin: String,
    tileLoadFunction: LoadFunction,
    opt_options: typingsJapgolly.ol.olTileMod.Options
  ) = this()
}

