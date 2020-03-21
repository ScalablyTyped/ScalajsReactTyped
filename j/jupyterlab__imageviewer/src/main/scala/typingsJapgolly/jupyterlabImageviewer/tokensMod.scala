package typingsJapgolly.jupyterlabImageviewer

import typingsJapgolly.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsJapgolly.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsJapgolly.jupyterlabImageviewer.widgetMod.ImageViewer
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/imageviewer/lib/tokens", JSImport.Namespace)
@js.native
object tokensMod extends js.Object {
  val IImageTracker: Token[typingsJapgolly.jupyterlabImageviewer.tokensMod.IImageTracker] = js.native
  type IImageTracker = IWidgetTracker[IDocumentWidget[ImageViewer, IModel]]
}

