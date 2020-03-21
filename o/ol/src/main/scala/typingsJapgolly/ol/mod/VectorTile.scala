package typingsJapgolly.ol.mod

import typingsJapgolly.ol.olTileMod.LoadFunction
import typingsJapgolly.ol.olTileMod.Options
import typingsJapgolly.ol.olVectorTileMod.default
import typingsJapgolly.ol.tileStateMod.TileState
import typingsJapgolly.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "VectorTile")
@js.native
class VectorTile protected () extends default {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    format: typingsJapgolly.ol.featureMod.default,
    tileLoadFunction: LoadFunction
  ) = this()
  def this(
    tileCoord: TileCoord,
    state: TileState,
    src: String,
    format: typingsJapgolly.ol.featureMod.default,
    tileLoadFunction: LoadFunction,
    opt_options: Options
  ) = this()
}

