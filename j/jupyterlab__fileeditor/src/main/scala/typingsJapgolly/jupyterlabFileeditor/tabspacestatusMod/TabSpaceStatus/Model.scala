package typingsJapgolly.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus

import typingsJapgolly.jupyterlabApputils.vdomMod.VDomModel
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A VDomModel for the TabSpace status item.
  */
@JSImport("@jupyterlab/fileeditor/lib/tabspacestatus", "TabSpaceStatus.Model")
@js.native
class Model () extends VDomModel {
  var _config: js.Any = js.native
  var _triggerChange: js.Any = js.native
  /**
    * The editor config from the settings system.
    */
  var config: IConfig | Null = js.native
}

