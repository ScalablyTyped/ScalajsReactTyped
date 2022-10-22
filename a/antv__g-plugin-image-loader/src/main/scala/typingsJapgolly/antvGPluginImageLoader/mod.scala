package typingsJapgolly.antvGPluginImageLoader

import typingsJapgolly.antvGLite.distTypesMod.CanvasConfig
import typingsJapgolly.antvGLite.mod.AbstractRendererPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/g-plugin-image-loader", "ImagePool")
  @js.native
  open class ImagePool protected ()
    extends typingsJapgolly.antvGPluginImageLoader.distImagePoolMod.ImagePool {
    def this(canvasConfig: CanvasConfig) = this()
  }
  
  @JSImport("@antv/g-plugin-image-loader", "Plugin")
  @js.native
  open class Plugin () extends AbstractRendererPlugin
}
