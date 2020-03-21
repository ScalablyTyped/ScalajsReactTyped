package typingsJapgolly.jupyterlabApplication

import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typingsJapgolly.jupyterlabApputils.mod.WidgetTracker
import typingsJapgolly.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsJapgolly.jupyterlabDocregistry.mod.MimeDocument
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtension
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtensionModule
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/mimerenderers", JSImport.Namespace)
@js.native
object mimerenderersMod extends js.Object {
  val IMimeDocumentTracker: Token[typingsJapgolly.jupyterlabApplication.mimerenderersMod.IMimeDocumentTracker] = js.native
  def createRendermimePlugin(tracker: WidgetTracker[MimeDocument], item: IExtension): JupyterFrontEndPlugin[Unit] = js.native
  def createRendermimePlugins(extensions: js.Array[IExtensionModule]): js.Array[
    JupyterFrontEndPlugin[
      Unit | typingsJapgolly.jupyterlabApplication.mimerenderersMod.IMimeDocumentTracker
    ]
  ] = js.native
  type IMimeDocumentTracker = IWidgetTracker[MimeDocument]
}

