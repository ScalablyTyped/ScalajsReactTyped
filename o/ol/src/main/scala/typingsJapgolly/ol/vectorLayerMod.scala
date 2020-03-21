package typingsJapgolly.ol

import typingsJapgolly.ol.projMod.TransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/VectorLayer", JSImport.Namespace)
@js.native
object vectorLayerMod extends js.Object {
  @js.native
  trait CanvasVectorLayerRenderer
    extends typingsJapgolly.ol.canvasLayerMod.default[
          typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
        ] {
    def renderFeature(
      feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default],
      squaredTolerance: Double,
      styles: js.Array[typingsJapgolly.ol.styleStyleMod.default],
      builderGroup: typingsJapgolly.ol.builderGroupMod.default,
      opt_transform: TransformFunction
    ): Boolean = js.native
    def renderFeature(
      feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default],
      squaredTolerance: Double,
      styles: typingsJapgolly.ol.styleStyleMod.default,
      builderGroup: typingsJapgolly.ol.builderGroupMod.default,
      opt_transform: TransformFunction
    ): Boolean = js.native
  }
  
  @js.native
  class default protected () extends CanvasVectorLayerRenderer {
    def this(vectorLayer: typingsJapgolly.ol.vectorMod.default) = this()
  }
  
}

