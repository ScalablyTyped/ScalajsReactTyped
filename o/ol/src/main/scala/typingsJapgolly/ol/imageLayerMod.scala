package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/ImageLayer", JSImport.Namespace)
@js.native
object imageLayerMod extends js.Object {
  @js.native
  trait CanvasImageLayerRenderer
    extends typingsJapgolly.ol.canvasLayerMod.default[
          typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
        ] {
    var image_ : typingsJapgolly.ol.imageBaseMod.default = js.native
  }
  
  @js.native
  class default protected () extends CanvasImageLayerRenderer {
    def this(imageLayer: typingsJapgolly.ol.imageMod.default) = this()
  }
  
}

