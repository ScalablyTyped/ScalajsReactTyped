package typingsJapgolly.ol

import typingsJapgolly.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/PolygonBuilder", JSImport.Namespace)
@js.native
object polygonBuilderMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsJapgolly.ol.builderMod.default {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  type CanvasPolygonBuilder = typingsJapgolly.ol.builderMod.default
}

