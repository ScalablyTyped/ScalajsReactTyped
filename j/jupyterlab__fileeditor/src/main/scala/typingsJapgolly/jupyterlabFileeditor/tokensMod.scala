package typingsJapgolly.jupyterlabFileeditor

import typingsJapgolly.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsJapgolly.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsJapgolly.jupyterlabFileeditor.widgetMod.FileEditor
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/fileeditor/lib/tokens", JSImport.Namespace)
@js.native
object tokensMod extends js.Object {
  val IEditorTracker: Token[typingsJapgolly.jupyterlabFileeditor.tokensMod.IEditorTracker] = js.native
  type IEditorTracker = IWidgetTracker[IDocumentWidget[FileEditor, IModel]]
}

