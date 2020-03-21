package typingsJapgolly.jupyterlabNotebook.mod

import typingsJapgolly.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "NotebookWidgetFactory")
@js.native
class NotebookWidgetFactory protected ()
  extends typingsJapgolly.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory {
  /**
    * Construct a new notebook widget factory.
    *
    * @param options - The options used to construct the factory.
    */
  def this(options: IOptions[typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel]) = this()
}

