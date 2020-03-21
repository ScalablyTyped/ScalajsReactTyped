package typingsJapgolly.ol.mod

import typingsJapgolly.ol.imageTileMod.default
import typingsJapgolly.ol.olTileMod.LoadFunction
import typingsJapgolly.ol.olTileMod.Options
import typingsJapgolly.ol.tileStateMod.TileState
import typingsJapgolly.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "ImageTile")
@js.native
class ImageTile protected () extends default {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    crossOrigin: String,
    tileLoadFunction: LoadFunction
  ) = this()
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    crossOrigin: String,
    tileLoadFunction: LoadFunction,
    opt_options: Options
  ) = this()
}

