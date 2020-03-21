package typingsJapgolly.jupyterlabCsvviewer.widgetMod

import typingsJapgolly.jupyterlabCsvviewer.widgetMod.CSVDocumentWidget.IOptions
import typingsJapgolly.jupyterlabDocregistry.mod.DocumentWidget
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer/lib/widget", "CSVDocumentWidget")
@js.native
class CSVDocumentWidget_ protected () extends DocumentWidget[CSVViewer, IModel] {
  def this(options: IOptions) = this()
}

