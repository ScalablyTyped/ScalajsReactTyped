package typingsJapgolly.jupyterlabCsvviewer.widgetMod

import typingsJapgolly.jupyterlabDocregistry.mod.ABCWidgetFactory
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsJapgolly.jupyterlabDocregistry.registryMod.IDocumentWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer/lib/widget", "TSVViewerFactory")
@js.native
class TSVViewerFactory () extends ABCWidgetFactory[IDocumentWidget[CSVViewer, IModel], IModel]

