package typingsJapgolly.ol

import typingsJapgolly.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/ImageBuilder", JSImport.Namespace)
@js.native
object imageBuilderMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsJapgolly.ol.builderMod.default {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  type CanvasImageBuilder = typingsJapgolly.ol.builderMod.default
}

