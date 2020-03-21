package typingsJapgolly.ol

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.olMod.Transform
import typingsJapgolly.ol.projMod.TransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/Immediate", JSImport.Namespace)
@js.native
object immediateMod extends js.Object {
  @js.native
  trait CanvasImmediateRenderer
    extends typingsJapgolly.ol.vectorContextMod.default {
    def setTransform(transform: Transform): Unit = js.native
  }
  
  @js.native
  class default protected () extends CanvasImmediateRenderer {
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double
    ) = this()
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double,
      opt_squaredTolerance: Double
    ) = this()
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double,
      opt_squaredTolerance: Double,
      opt_userTransform: TransformFunction
    ) = this()
  }
  
}

