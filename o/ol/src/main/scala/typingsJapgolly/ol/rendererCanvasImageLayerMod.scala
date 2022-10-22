package typingsJapgolly.ol

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererCanvasImageLayerMod {
  
  @JSImport("ol/renderer/canvas/ImageLayer", JSImport.Default)
  @js.native
  open class default protected () extends CanvasImageLayerRenderer {
    def this(imageLayer: typingsJapgolly.ol.layerImageMod.default) = this()
  }
  
  @js.native
  trait CanvasImageLayerRenderer
    extends typingsJapgolly.ol.rendererCanvasLayerMod.default[
          typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
        ] {
    
    def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    
    /* protected */ var image_ : typingsJapgolly.ol.imageBaseMod.default = js.native
  }
}
