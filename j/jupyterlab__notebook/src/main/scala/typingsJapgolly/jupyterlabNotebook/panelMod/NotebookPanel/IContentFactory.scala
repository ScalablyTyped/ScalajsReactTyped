package typingsJapgolly.jupyterlabNotebook.panelMod.NotebookPanel

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.jupyterlabNotebook.widgetMod.Notebook
import typingsJapgolly.jupyterlabNotebook.widgetMod.Notebook.IOptions
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A content factory interface for NotebookPanel.
  */
trait IContentFactory
  extends typingsJapgolly.jupyterlabNotebook.widgetMod.StaticNotebook.IContentFactory {
  /**
    * Create a new content area for the panel.
    */
  def createNotebook(options: IOptions): Notebook
}

/**
  * The notebook renderer token.
  */
@JSImport("@jupyterlab/notebook/lib/panel", "NotebookPanel.IContentFactory")
@js.native
object IContentFactory extends TopLevel[Token[IContentFactory]]

