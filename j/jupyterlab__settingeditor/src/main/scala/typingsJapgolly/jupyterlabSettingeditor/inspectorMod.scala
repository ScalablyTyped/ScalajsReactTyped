package typingsJapgolly.jupyterlabSettingeditor

import typingsJapgolly.jupyterlabInspector.mod.InspectorPanel
import typingsJapgolly.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typingsJapgolly.jupyterlabSettingeditor.raweditorMod.RawEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor/lib/inspector", JSImport.Namespace)
@js.native
object inspectorMod extends js.Object {
  def createInspector(editor: RawEditor): InspectorPanel = js.native
  def createInspector(editor: RawEditor, rendermime: IRenderMimeRegistry): InspectorPanel = js.native
}

