package typingsJapgolly.jupyterlabCsvviewer.widgetMod

import typingsJapgolly.jupyterlabDocregistry.mod.ABCWidgetFactory
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsJapgolly.jupyterlabDocregistry.registryMod.IDocumentWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer/lib/widget", "CSVViewerFactory")
@js.native
class CSVViewerFactory () extends ABCWidgetFactory[IDocumentWidget[CSVViewer, IModel], IModel]

