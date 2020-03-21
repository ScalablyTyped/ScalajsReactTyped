package typingsJapgolly.jupyterlabSettingeditor

import typingsJapgolly.jupyterlabApputils.mod.MainAreaWidget
import typingsJapgolly.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsJapgolly.jupyterlabSettingeditor.settingeditorMod.SettingEditor
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingeditor/lib/tokens", JSImport.Namespace)
@js.native
object tokensMod extends js.Object {
  val ISettingEditorTracker: Token[typingsJapgolly.jupyterlabSettingeditor.tokensMod.ISettingEditorTracker] = js.native
  type ISettingEditorTracker = IWidgetTracker[MainAreaWidget[SettingEditor]]
}

