package typingsJapgolly.reactDataGrid.AdazzleReactDataGrid

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorBaseProps extends js.Object {
  var column: ExcelColumn
  var height: Double
  var rowData: js.Any
  var rowMetaData: js.Any
  var value: js.Any
  def onBlur(): Unit
  def onCommit(): Unit
  def onCommitCancel(): Unit
}

object EditorBaseProps {
  @scala.inline
  def apply(
    column: ExcelColumn,
    height: Double,
    onBlur: Callback,
    onCommit: Callback,
    onCommitCancel: Callback,
    rowData: js.Any,
    rowMetaData: js.Any,
    value: js.Any
  ): EditorBaseProps = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowMetaData = rowMetaData.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(onBlur.toJsFn)
    __obj.updateDynamic("onCommit")(onCommit.toJsFn)
    __obj.updateDynamic("onCommitCancel")(onCommitCancel.toJsFn)
    __obj.asInstanceOf[EditorBaseProps]
  }
}

