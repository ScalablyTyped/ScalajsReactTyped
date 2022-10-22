package typingsJapgolly.ol

import typingsJapgolly.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasImageBuilderMod {
  
  @JSImport("ol/render/canvas/ImageBuilder", JSImport.Default)
  @js.native
  open class default protected () extends CanvasImageBuilder {
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  @js.native
  trait CanvasImageBuilder
    extends typingsJapgolly.ol.renderCanvasBuilderMod.default {
    
    def setImageStyle(imageStyle: typingsJapgolly.ol.styleImageMod.default, opt_sharedData: Any): Unit = js.native
  }
}
