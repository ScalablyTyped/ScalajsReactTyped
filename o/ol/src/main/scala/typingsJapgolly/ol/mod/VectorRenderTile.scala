package typingsJapgolly.ol.mod

import typingsJapgolly.ol.tileStateMod.TileState
import typingsJapgolly.ol.tilecoordMod.TileCoord
import typingsJapgolly.ol.vectorRenderTileMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol", "VectorRenderTile")
@js.native
class VectorRenderTile protected () extends default {
  def this(
    tileCoord: TileCoord,
    state: TileState,
    urlTileCoord: TileCoord,
    sourceTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
    getSourceTiles: js.Function1[
        /* p0 */ typingsJapgolly.ol.vectorRenderTileMod.VectorRenderTile, 
        js.Array[typingsJapgolly.ol.olVectorTileMod.default]
      ],
    removeSourceTiles: js.Function1[/* p0 */ typingsJapgolly.ol.vectorRenderTileMod.VectorRenderTile, Unit]
  ) = this()
}

