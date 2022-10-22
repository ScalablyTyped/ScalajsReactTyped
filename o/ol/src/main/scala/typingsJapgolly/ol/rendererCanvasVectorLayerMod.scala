package typingsJapgolly.ol

import typingsJapgolly.ol.pluggableMapMod.FrameState
import typingsJapgolly.ol.projMod.TransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererCanvasVectorLayerMod {
  
  @JSImport("ol/renderer/canvas/VectorLayer", JSImport.Default)
  @js.native
  open class default protected () extends CanvasVectorLayerRenderer {
    def this(vectorLayer: typingsJapgolly.ol.layerVectorMod.default) = this()
  }
  
  @js.native
  trait CanvasVectorLayerRenderer
    extends typingsJapgolly.ol.rendererCanvasLayerMod.default[
          typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
        ] {
    
    /**
      * Render declutter items for this layer
      */
    def renderDeclutter(frameState: FrameState): Unit = js.native
    
    def renderFeature(
      feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default],
      squaredTolerance: Double,
      styles: js.Array[typingsJapgolly.ol.styleStyleMod.default],
      builderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default],
      squaredTolerance: Double,
      styles: js.Array[typingsJapgolly.ol.styleStyleMod.default],
      builderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default,
      opt_transform: Unit,
      opt_declutterBuilderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default],
      squaredTolerance: Double,
      styles: js.Array[typingsJapgolly.ol.styleStyleMod.default],
      builderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default,
      opt_transform: TransformFunction
    ): Boolean = js.native
    def renderFeature(
      feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default],
      squaredTolerance: Double,
      styles: js.Array[typingsJapgolly.ol.styleStyleMod.default],
      builderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default,
      opt_transform: TransformFunction,
      opt_declutterBuilderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default],
      squaredTolerance: Double,
      styles: typingsJapgolly.ol.styleStyleMod.default,
      builderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default],
      squaredTolerance: Double,
      styles: typingsJapgolly.ol.styleStyleMod.default,
      builderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default,
      opt_transform: Unit,
      opt_declutterBuilderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default],
      squaredTolerance: Double,
      styles: typingsJapgolly.ol.styleStyleMod.default,
      builderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default,
      opt_transform: TransformFunction
    ): Boolean = js.native
    def renderFeature(
      feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default],
      squaredTolerance: Double,
      styles: typingsJapgolly.ol.styleStyleMod.default,
      builderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default,
      opt_transform: TransformFunction,
      opt_declutterBuilderGroup: typingsJapgolly.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    
    def renderWorlds(executorGroup: typingsJapgolly.ol.renderCanvasExecutorGroupMod.default, frameState: FrameState): Unit = js.native
    def renderWorlds(
      executorGroup: typingsJapgolly.ol.renderCanvasExecutorGroupMod.default,
      frameState: FrameState,
      opt_declutterTree: typingsJapgolly.rbush.mod.default[Any]
    ): Unit = js.native
  }
}
