package typingsJapgolly.jupyterlabCsvviewer

import typingsJapgolly.jupyterlabCsvviewer.parseMod.IParser.IResults
import typingsJapgolly.jupyterlabCsvviewer.toolbarMod.CSVToolbar.IOptions
import typingsJapgolly.phosphorDatagrid.mod.DataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CSVDelimiter protected ()
    extends typingsJapgolly.jupyterlabCsvviewer.toolbarMod.CSVDelimiter {
    /**
      * Construct a new csv table widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class CSVDocumentWidget protected ()
    extends typingsJapgolly.jupyterlabCsvviewer.widgetMod.CSVDocumentWidget {
    def this(options: typingsJapgolly.jupyterlabCsvviewer.widgetMod.CSVDocumentWidget.IOptions) = this()
  }
  
  @js.native
  class CSVViewer protected ()
    extends typingsJapgolly.jupyterlabCsvviewer.widgetMod.CSVViewer {
    /**
      * Construct a new CSV viewer.
      */
    def this(options: typingsJapgolly.jupyterlabCsvviewer.widgetMod.CSVViewer.IOptions) = this()
  }
  
  @js.native
  class CSVViewerFactory ()
    extends typingsJapgolly.jupyterlabCsvviewer.widgetMod.CSVViewerFactory
  
  @js.native
  class DSVModel protected ()
    extends typingsJapgolly.jupyterlabCsvviewer.modelMod.DSVModel {
    /**
      * Create a data model with static CSV data.
      *
      * @param options - The options for initializing the data model.
      */
    def this(options: typingsJapgolly.jupyterlabCsvviewer.modelMod.DSVModel.IOptions) = this()
  }
  
  @js.native
  class GridSearchService protected ()
    extends typingsJapgolly.jupyterlabCsvviewer.widgetMod.GridSearchService {
    def this(grid: DataGrid) = this()
  }
  
  @js.native
  class TSVViewerFactory ()
    extends typingsJapgolly.jupyterlabCsvviewer.widgetMod.TSVViewerFactory
  
  @js.native
  class TextRenderConfig ()
    extends typingsJapgolly.jupyterlabCsvviewer.widgetMod.TextRenderConfig
  
  def parseDSV(options: typingsJapgolly.jupyterlabCsvviewer.parseMod.IParser.IOptions): IResults = js.native
  def parseDSVNoQuotes(options: typingsJapgolly.jupyterlabCsvviewer.parseMod.IParser.IOptions): IResults = js.native
}

