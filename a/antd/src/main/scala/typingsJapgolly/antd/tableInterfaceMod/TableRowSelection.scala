package typingsJapgolly.antd.tableInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antd.PartialCheckboxProps
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowSelection[T] extends js.Object {
  var columnTitle: js.UndefOr[String | Node] = js.undefined
  var columnWidth: js.UndefOr[String | Double] = js.undefined
  var fixed: js.UndefOr[Boolean] = js.undefined
  var getCheckboxProps: js.UndefOr[js.Function1[/* record */ T, PartialCheckboxProps]] = js.undefined
  var hideDefaultSelections: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* selectedRowKeys */ js.Array[Key], /* selectedRows */ js.Array[T], Unit]
  ] = js.undefined
  var onSelect: js.UndefOr[SelectionSelectFn[T]] = js.undefined
  /** @deprecated This function is meaningless and should use `onChange` instead */
  var onSelectAll: js.UndefOr[
    js.Function3[
      /* selected */ Boolean, 
      /* selectedRows */ js.Array[T], 
      /* changeRows */ js.Array[T], 
      Unit
    ]
  ] = js.undefined
  /** @deprecated This function is meaningless and should use `onChange` instead */
  var onSelectInvert: js.UndefOr[js.Function1[/* selectedRowKeys */ js.Array[Key], Unit]] = js.undefined
  var onSelectMultiple: js.UndefOr[
    js.Function3[
      /* selected */ Boolean, 
      /* selectedRows */ js.Array[T], 
      /* changeRows */ js.Array[T], 
      Unit
    ]
  ] = js.undefined
  var selectedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
  var selections: js.UndefOr[js.Array[SelectionItem] | Boolean] = js.undefined
  var `type`: js.UndefOr[RowSelectionType] = js.undefined
}

object TableRowSelection {
  @scala.inline
  def apply[T](
    columnTitle: String | Node = null,
    columnWidth: String | Double = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    getCheckboxProps: /* record */ T => CallbackTo[PartialCheckboxProps] = null,
    hideDefaultSelections: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* selectedRowKeys */ js.Array[Key], /* selectedRows */ js.Array[T]) => Callback = null,
    onSelect: (T, /* selected */ Boolean, /* selectedRows */ js.Array[js.Object], /* nativeEvent */ Event_) => Callback = null,
    onSelectAll: (/* selected */ Boolean, /* selectedRows */ js.Array[T], /* changeRows */ js.Array[T]) => Callback = null,
    onSelectInvert: /* selectedRowKeys */ js.Array[Key] => Callback = null,
    onSelectMultiple: (/* selected */ Boolean, /* selectedRows */ js.Array[T], /* changeRows */ js.Array[T]) => Callback = null,
    selectedRowKeys: js.Array[Key] = null,
    selections: js.Array[SelectionItem] | Boolean = null,
    `type`: RowSelectionType = null
  ): TableRowSelection[T] = {
    val __obj = js.Dynamic.literal()
    if (columnTitle != null) __obj.updateDynamic("columnTitle")(columnTitle.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (getCheckboxProps != null) __obj.updateDynamic("getCheckboxProps")(js.Any.fromFunction1((t0: /* record */ T) => getCheckboxProps(t0).runNow()))
    if (!js.isUndefined(hideDefaultSelections)) __obj.updateDynamic("hideDefaultSelections")(hideDefaultSelections.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* selectedRowKeys */ js.Array[typingsJapgolly.antd.tableInterfaceMod.Key], t1: /* selectedRows */ js.Array[T]) => onChange(t0, t1).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction4((t0: T, t1: /* selected */ scala.Boolean, t2: /* selectedRows */ js.Array[js.Object], t3: /* nativeEvent */ typingsJapgolly.std.Event_) => onSelect(t0, t1, t2, t3).runNow()))
    if (onSelectAll != null) __obj.updateDynamic("onSelectAll")(js.Any.fromFunction3((t0: /* selected */ scala.Boolean, t1: /* selectedRows */ js.Array[T], t2: /* changeRows */ js.Array[T]) => onSelectAll(t0, t1, t2).runNow()))
    if (onSelectInvert != null) __obj.updateDynamic("onSelectInvert")(js.Any.fromFunction1((t0: /* selectedRowKeys */ js.Array[typingsJapgolly.antd.tableInterfaceMod.Key]) => onSelectInvert(t0).runNow()))
    if (onSelectMultiple != null) __obj.updateDynamic("onSelectMultiple")(js.Any.fromFunction3((t0: /* selected */ scala.Boolean, t1: /* selectedRows */ js.Array[T], t2: /* changeRows */ js.Array[T]) => onSelectMultiple(t0, t1, t2).runNow()))
    if (selectedRowKeys != null) __obj.updateDynamic("selectedRowKeys")(selectedRowKeys.asInstanceOf[js.Any])
    if (selections != null) __obj.updateDynamic("selections")(selections.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowSelection[T]]
  }
}

