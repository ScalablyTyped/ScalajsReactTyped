package typingsJapgolly.ol

import typingsJapgolly.ol.featureMod.FeatureLike
import typingsJapgolly.ol.pluggableMapMod.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererCanvasVectorTileLayerMod {
  
  @JSImport("ol/renderer/canvas/VectorTileLayer", JSImport.Default)
  @js.native
  open class default protected () extends CanvasVectorTileLayerRenderer {
    def this(layer: typingsJapgolly.ol.layerVectorTileMod.default) = this()
  }
  
  @js.native
  trait CanvasVectorTileLayerRenderer
    extends typingsJapgolly.ol.rendererCanvasTileLayerMod.default {
    
    def isDrawableTile(tile: typingsJapgolly.ol.vectorRenderTileMod.default): Boolean = js.native
    
    def prepareTile(
      tile: typingsJapgolly.ol.vectorRenderTileMod.default,
      pixelRatio: Double,
      projection: typingsJapgolly.ol.projProjectionMod.default,
      queue: Boolean
    ): js.UndefOr[Boolean] = js.native
    
    /**
      * Render declutter items for this layer
      */
    def renderDeclutter(frameState: FrameState): Unit = js.native
    
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: js.Array[typingsJapgolly.ol.styleStyleMod.default],
      builderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: js.Array[typingsJapgolly.ol.styleStyleMod.default],
      builderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default,
      opt_declutterBuilderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: typingsJapgolly.ol.styleStyleMod.default,
      builderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: typingsJapgolly.ol.styleStyleMod.default,
      builderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default,
      opt_declutterBuilderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    
    def renderQueuedTileImages_(hifi: Boolean, frameState: FrameState): Unit = js.native
  }
}
