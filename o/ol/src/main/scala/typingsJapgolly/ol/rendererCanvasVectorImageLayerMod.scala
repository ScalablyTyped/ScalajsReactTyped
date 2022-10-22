package typingsJapgolly.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererCanvasVectorImageLayerMod {
  
  @JSImport("ol/renderer/canvas/VectorImageLayer", JSImport.Default)
  @js.native
  open class default protected () extends CanvasVectorImageLayerRenderer {
    def this(layer: typingsJapgolly.ol.layerVectorImageMod.default) = this()
  }
  
  @js.native
  trait CanvasVectorImageLayerRenderer
    extends typingsJapgolly.ol.rendererCanvasImageLayerMod.default {
    
    def postRender(): Unit = js.native
    
    def preRender(): Unit = js.native
    
    def renderDeclutter(): Unit = js.native
  }
}
