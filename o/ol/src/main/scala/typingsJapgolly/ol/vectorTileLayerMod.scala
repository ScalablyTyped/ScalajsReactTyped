package typingsJapgolly.ol

import typingsJapgolly.ol.olFeatureMod.FeatureLike
import typingsJapgolly.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/VectorTileLayer", JSImport.Namespace)
@js.native
object vectorTileLayerMod extends js.Object {
  @js.native
  trait CanvasVectorTileLayerRenderer
    extends typingsJapgolly.ol.tileLayerMod.default {
    def prepareTile(
      tile: typingsJapgolly.ol.vectorRenderTileMod.default,
      pixelRatio: Double,
      projection: typingsJapgolly.ol.projectionMod.default,
      queue: Boolean
    ): Boolean = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: js.Array[typingsJapgolly.ol.styleStyleMod.default],
      executorGroup: typingsJapgolly.ol.builderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: typingsJapgolly.ol.styleStyleMod.default,
      executorGroup: typingsJapgolly.ol.builderGroupMod.default
    ): Boolean = js.native
    def renderQueuedTileImages_(hifi: Boolean, frameState: FrameState): Unit = js.native
  }
  
  @js.native
  class default protected () extends CanvasVectorTileLayerRenderer {
    def this(layer: typingsJapgolly.ol.vectorTileMod.default) = this()
  }
  
}

