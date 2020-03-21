package typingsJapgolly.rcTable.bodyContextMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcTable.interfaceMod.ColumnType
import typingsJapgolly.rcTable.interfaceMod.ColumnsType
import typingsJapgolly.rcTable.interfaceMod.ExpandableType
import typingsJapgolly.rcTable.interfaceMod.ExpandedRowRender
import typingsJapgolly.rcTable.interfaceMod.RenderExpandIcon
import typingsJapgolly.rcTable.interfaceMod.RenderExpandIconProps
import typingsJapgolly.rcTable.interfaceMod.RowClassName
import typingsJapgolly.rcTable.interfaceMod.TableLayout
import typingsJapgolly.rcTable.interfaceMod.TriggerEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyContextProps[RecordType] extends js.Object {
  var columns: ColumnsType[RecordType]
  var componentWidth: Double
  var expandIcon: RenderExpandIcon[RecordType]
  var expandIconColumnIndex: Double
  var expandRowByClick: Boolean
  var expandableType: ExpandableType
  var expandedRowClassName: RowClassName[RecordType]
  var expandedRowRender: ExpandedRowRender[RecordType]
  var fixColumn: Boolean
  var fixHeader: Boolean
  var flattenColumns: js.Array[ColumnType[RecordType]]
  var indentSize: Double
  var onTriggerExpand: TriggerEventHandler[RecordType]
  var rowClassName: String | RowClassName[RecordType]
  var tableLayout: TableLayout
}

object BodyContextProps {
  @scala.inline
  def apply[RecordType](
    columns: ColumnsType[RecordType],
    componentWidth: Double,
    expandIcon: /* props */ RenderExpandIconProps[RecordType] => CallbackTo[Node],
    expandIconColumnIndex: Double,
    expandRowByClick: Boolean,
    expandableType: ExpandableType,
    expandedRowClassName: (RecordType, /* index */ Double, /* indent */ Double) => CallbackTo[String],
    expandedRowRender: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => CallbackTo[Node],
    fixColumn: Boolean,
    fixHeader: Boolean,
    flattenColumns: js.Array[ColumnType[RecordType]],
    indentSize: Double,
    onTriggerExpand: (RecordType, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback,
    rowClassName: String | RowClassName[RecordType],
    tableLayout: TableLayout
  ): BodyContextProps[RecordType] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], componentWidth = componentWidth.asInstanceOf[js.Any], expandIconColumnIndex = expandIconColumnIndex.asInstanceOf[js.Any], expandRowByClick = expandRowByClick.asInstanceOf[js.Any], expandableType = expandableType.asInstanceOf[js.Any], fixColumn = fixColumn.asInstanceOf[js.Any], fixHeader = fixHeader.asInstanceOf[js.Any], flattenColumns = flattenColumns.asInstanceOf[js.Any], indentSize = indentSize.asInstanceOf[js.Any], rowClassName = rowClassName.asInstanceOf[js.Any], tableLayout = tableLayout.asInstanceOf[js.Any])
    __obj.updateDynamic("expandIcon")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.rcTable.interfaceMod.RenderExpandIconProps[RecordType]) => expandIcon(t0).runNow()))
    __obj.updateDynamic("expandedRowClassName")(js.Any.fromFunction3((t0: RecordType, t1: /* index */ scala.Double, t2: /* indent */ scala.Double) => expandedRowClassName(t0, t1, t2).runNow()))
    __obj.updateDynamic("expandedRowRender")(js.Any.fromFunction4((t0: RecordType, t1: /* index */ scala.Double, t2: /* indent */ scala.Double, t3: /* expanded */ scala.Boolean) => expandedRowRender(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("onTriggerExpand")(js.Any.fromFunction2((t0: RecordType, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTriggerExpand(t0, t1).runNow()))
    __obj.asInstanceOf[BodyContextProps[RecordType]]
  }
}

