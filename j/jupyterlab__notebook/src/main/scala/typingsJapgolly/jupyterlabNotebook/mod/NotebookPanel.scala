package typingsJapgolly.jupyterlabNotebook.mod

import typingsJapgolly.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions
import typingsJapgolly.jupyterlabNotebook.modelMod.INotebookModel
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "NotebookPanel")
@js.native
class NotebookPanel protected ()
  extends typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel {
  /**
    * Construct a new notebook panel.
    */
  def this(options: IOptions[typingsJapgolly.jupyterlabNotebook.widgetMod.Notebook, INotebookModel]) = this()
}

@JSImport("@jupyterlab/notebook", "NotebookPanel")
@js.native
object NotebookPanel extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel.ContentFactory
  
  /**
    * The notebook renderer token.
    */
  val IContentFactory: Token[typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel.IContentFactory] = js.native
  /**
    * Default content factory for the notebook panel.
    */
  val defaultContentFactory: typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel.ContentFactory = js.native
}

