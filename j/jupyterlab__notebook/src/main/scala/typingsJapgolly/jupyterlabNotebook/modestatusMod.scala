package typingsJapgolly.jupyterlabNotebook

import typingsJapgolly.jupyterlabApputils.vdomMod.VDomModel
import typingsJapgolly.jupyterlabApputils.vdomMod.VDomRenderer
import typingsJapgolly.jupyterlabNotebook.mod.Notebook
import typingsJapgolly.jupyterlabNotebook.modestatusMod.CommandEditStatus.Model
import typingsJapgolly.jupyterlabNotebook.widgetMod.NotebookMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/modestatus", JSImport.Namespace)
@js.native
object modestatusMod extends js.Object {
  @js.native
  /**
    * Construct a new CommandEdit status item.
    */
  class CommandEditStatus () extends VDomRenderer[Model]
  
  @js.native
  object CommandEditStatus extends js.Object {
    /**
      * A VDomModle for the CommandEdit renderer.
      */
    @js.native
    class Model () extends VDomModel {
      var _notebook: js.Any = js.native
      var _notebookMode: js.Any = js.native
      /**
        * On a change to the notebook, update the mode.
        */
      var _onChanged: js.Any = js.native
      /**
        * Trigger a state change for the renderer.
        */
      var _triggerChange: js.Any = js.native
      /**
        * Set the current notebook for the model.
        */
      var notebook: Notebook | Null = js.native
      /**
        * The current mode of the current notebook.
        */
      val notebookMode: NotebookMode = js.native
    }
    
  }
  
}

