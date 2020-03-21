package typingsJapgolly.semanticUiReact.tableTableMod

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.tableBodyMod.TableBodyProps
import typingsJapgolly.semanticUiReact.tableCellMod.TableCellProps
import typingsJapgolly.semanticUiReact.tableFooterMod.TableFooterProps
import typingsJapgolly.semanticUiReact.tableHeaderCellMod.TableHeaderCellProps
import typingsJapgolly.semanticUiReact.tableHeaderMod.TableHeaderProps
import typingsJapgolly.semanticUiReact.tableRowMod.TableRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableComponent extends FunctionComponent[TableProps] {
  var Body: StatelessComponent[TableBodyProps] = js.native
  var Cell: StatelessComponent[TableCellProps] = js.native
  var Footer: StatelessComponent[TableFooterProps] = js.native
  var Header: StatelessComponent[TableHeaderProps] = js.native
  var HeaderCell: StatelessComponent[TableHeaderCellProps] = js.native
  var Row: StatelessComponent[TableRowProps] = js.native
}

