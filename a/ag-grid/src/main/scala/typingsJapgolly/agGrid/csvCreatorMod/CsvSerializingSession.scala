package typingsJapgolly.agGrid.csvCreatorMod

import typingsJapgolly.agGrid.columnControllerMod.ColumnController
import typingsJapgolly.agGrid.exportParamsMod.ProcessCellForExportParams
import typingsJapgolly.agGrid.exportParamsMod.ProcessHeaderForExportParams
import typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typingsJapgolly.agGrid.gridSerializerMod.BaseGridSerializingSession
import typingsJapgolly.agGrid.valueServiceMod.ValueService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/csvCreator", "CsvSerializingSession")
@js.native
class CsvSerializingSession protected () extends BaseGridSerializingSession[String] {
  def this(
    columnController: ColumnController,
    valueService: ValueService,
    gridOptionsWrapper: GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String],
    suppressQuotes: Boolean,
    columnSeparator: String
  ) = this()
  var columnSeparator: js.Any = js.native
  var lineOpened: js.Any = js.native
  var result: js.Any = js.native
  var suppressQuotes: js.Any = js.native
  /* private */ def onNewBodyRowColumn(column: js.Any, index: js.Any): js.Any = js.native
  /* private */ def onNewBodyRowColumn(column: js.Any, index: js.Any, node: js.Any): js.Any = js.native
  /* private */ def onNewHeaderGroupingRowColumn(header: js.Any, index: js.Any, span: js.Any): js.Any = js.native
  /* private */ def onNewHeaderRowColumn(column: js.Any, index: js.Any): js.Any = js.native
  /* private */ def onNewHeaderRowColumn(column: js.Any, index: js.Any, node: js.Any): js.Any = js.native
  /* private */ def putInQuotes(value: js.Any, suppressQuotes: js.Any): js.Any = js.native
}

