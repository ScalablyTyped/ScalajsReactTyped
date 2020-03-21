package typingsJapgolly.ol

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsJapgolly.ol.olFeatureMod.FeatureLike
import typingsJapgolly.ol.renderMod.OrderFunction
import typingsJapgolly.ol.tileStateMod.TileState
import typingsJapgolly.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/VectorRenderTile", JSImport.Namespace)
@js.native
object vectorRenderTileMod extends js.Object {
  @js.native
  trait ReplayState extends js.Object {
    var dirty: Boolean = js.native
    @JSName("renderedRenderOrder")
    var renderedRenderOrder_Original: OrderFunction = js.native
    var renderedResolution: Double = js.native
    var renderedRevision: Double = js.native
    var renderedTileResolution: Double = js.native
    var renderedTileRevision: Double = js.native
    var renderedTileZ: Double = js.native
    var renderedZ: Double = js.native
    def renderedRenderOrder(p0: FeatureLike, p1: FeatureLike): Double = js.native
  }
  
  @js.native
  trait VectorRenderTile
    extends typingsJapgolly.ol.olTileMod.default {
    def getContext(layer: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]): CanvasRenderingContext2D = js.native
    def getImage(layer: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]): HTMLCanvasElement = js.native
    def getReplayState(layer: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]): ReplayState = js.native
    def hasContext(layer: typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]): Boolean = js.native
  }
  
  @js.native
  class default protected () extends VectorRenderTile {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      urlTileCoord: TileCoord,
      sourceTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default,
      getSourceTiles: js.Function1[/* p0 */ VectorRenderTile, js.Array[typingsJapgolly.ol.olVectorTileMod.default]],
      removeSourceTiles: js.Function1[/* p0 */ VectorRenderTile, Unit]
    ) = this()
  }
  
}

