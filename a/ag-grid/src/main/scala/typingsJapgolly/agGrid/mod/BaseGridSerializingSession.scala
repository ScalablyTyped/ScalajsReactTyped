package typingsJapgolly.agGrid.mod

import typingsJapgolly.agGrid.exportParamsMod.ProcessCellForExportParams
import typingsJapgolly.agGrid.exportParamsMod.ProcessHeaderForExportParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "BaseGridSerializingSession")
@js.native
abstract class BaseGridSerializingSession[T] protected ()
  extends typingsJapgolly.agGrid.gridSerializerMod.BaseGridSerializingSession[T] {
  def this(
    columnController: typingsJapgolly.agGrid.columnControllerMod.ColumnController,
    valueService: typingsJapgolly.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
  ) = this()
  def this(
    columnController: typingsJapgolly.agGrid.columnControllerMod.ColumnController,
    valueService: typingsJapgolly.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String]
  ) = this()
  def this(
    columnController: typingsJapgolly.agGrid.columnControllerMod.ColumnController,
    valueService: typingsJapgolly.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String]
  ) = this()
  def this(
    columnController: typingsJapgolly.agGrid.columnControllerMod.ColumnController,
    valueService: typingsJapgolly.agGrid.valueServiceMod.ValueService,
    gridOptionsWrapper: typingsJapgolly.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
    processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String],
    cellAndHeaderEscaper: js.Function1[/* rawValue */ String, String]
  ) = this()
}

