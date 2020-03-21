package typingsJapgolly.jupyterlabImageviewer

import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ImageViewer protected ()
    extends typingsJapgolly.jupyterlabImageviewer.widgetMod.ImageViewer {
    /**
      * Construct a new image widget.
      */
    def this(context: Context) = this()
  }
  
  @js.native
  class ImageViewerFactory ()
    extends typingsJapgolly.jupyterlabImageviewer.widgetMod.ImageViewerFactory
  
  val IImageTracker: Token[typingsJapgolly.jupyterlabImageviewer.tokensMod.IImageTracker] = js.native
}

