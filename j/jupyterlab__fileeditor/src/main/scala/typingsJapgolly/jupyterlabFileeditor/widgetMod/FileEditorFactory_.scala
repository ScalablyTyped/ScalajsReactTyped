package typingsJapgolly.jupyterlabFileeditor.widgetMod

import typingsJapgolly.jupyterlabDocregistry.mod.ABCWidgetFactory
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.ICodeModel
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsJapgolly.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsJapgolly.jupyterlabFileeditor.widgetMod.FileEditorFactory.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/fileeditor/lib/widget", "FileEditorFactory")
@js.native
class FileEditorFactory_ protected () extends ABCWidgetFactory[IDocumentWidget[FileEditor, IModel], ICodeModel] {
  /**
    * Construct a new editor widget factory.
    */
  def this(options: IOptions) = this()
  var _services: js.Any = js.native
}

