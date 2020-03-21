package typingsJapgolly.reactDataGrid.AdazzleReactDataGridPlugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ExcelColumn
import typingsJapgolly.reactDataGrid.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteEditorProps extends js.Object {
  var column: js.UndefOr[ExcelColumn] = js.undefined
  var editorDisplayValue: js.UndefOr[js.Function2[/* column */ ExcelColumn, /* value */ js.Any, String]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[js.Any] = js.undefined
  var onCommit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  var options: js.UndefOr[js.Array[AnonId]] = js.undefined
  var resultIdentifier: js.UndefOr[String] = js.undefined
  var search: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var valueParams: js.UndefOr[js.Array[String]] = js.undefined
}

object AutoCompleteEditorProps {
  @scala.inline
  def apply(
    column: ExcelColumn = null,
    editorDisplayValue: (/* column */ ExcelColumn, /* value */ js.Any) => CallbackTo[String] = null,
    height: Int | Double = null,
    label: js.Any = null,
    onCommit: js.UndefOr[Callback] = js.undefined,
    onFocus: js.UndefOr[Callback] = js.undefined,
    onKeyDown: js.UndefOr[Callback] = js.undefined,
    options: js.Array[AnonId] = null,
    resultIdentifier: String = null,
    search: String = null,
    value: js.Any = null,
    valueParams: js.Array[String] = null
  ): AutoCompleteEditorProps = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (editorDisplayValue != null) __obj.updateDynamic("editorDisplayValue")(js.Any.fromFunction2((t0: /* column */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ExcelColumn, t1: /* value */ js.Any) => editorDisplayValue(t0, t1).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    onCommit.foreach(p => __obj.updateDynamic("onCommit")(p.toJsFn))
    onFocus.foreach(p => __obj.updateDynamic("onFocus")(p.toJsFn))
    onKeyDown.foreach(p => __obj.updateDynamic("onKeyDown")(p.toJsFn))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (resultIdentifier != null) __obj.updateDynamic("resultIdentifier")(resultIdentifier.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueParams != null) __obj.updateDynamic("valueParams")(valueParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteEditorProps]
  }
}

