package typingsJapgolly.jupyterlabMarkdownviewer.widgetMod

import typingsJapgolly.jupyterlabDocregistry.mod.ABCWidgetFactory
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsJapgolly.jupyterlabMarkdownviewer.widgetMod.MarkdownViewerFactory.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/markdownviewer/lib/widget", "MarkdownViewerFactory")
@js.native
class MarkdownViewerFactory_ protected () extends ABCWidgetFactory[MarkdownDocument, IModel] {
  /**
    * Construct a new mimetype widget factory.
    */
  def this(options: IOptions) = this()
  var _fileType: js.Any = js.native
  var _rendermime: js.Any = js.native
}

