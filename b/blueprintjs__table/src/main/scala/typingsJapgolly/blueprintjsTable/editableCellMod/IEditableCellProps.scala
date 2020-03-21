package typingsJapgolly.blueprintjsTable.editableCellMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.editableTextMod.IEditableTextProps
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.blueprintjsTable.cellMod.ICellProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditableCellProps extends ICellProps {
  /**
    * Props that should be passed to the EditableText when it is used to edit
    */
  var editableTextProps: js.UndefOr[IEditableTextProps] = js.undefined
  /**
    * Whether the given cell is the current active/focused cell.
    */
  var isFocused: js.UndefOr[Boolean] = js.undefined
  /**
    * A listener that is triggered if the user cancels the edit. This is
    * important to listen to if you are doing anything with `onChange` events,
    * since you'll likely want to revert whatever changes you made. The
    * callback will also receive the row index and column index if they were
    * originally provided via props.
    */
  var onCancel: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* rowIndex */ js.UndefOr[Double], 
      /* columnIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /**
    * A listener that is triggered as soon as the editable name is modified.
    * This can be due, for example, to keyboard input or the clipboard. The
    * callback will also receive the row index and column index if they were
    * originally provided via props.
    */
  var onChange: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* rowIndex */ js.UndefOr[Double], 
      /* columnIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /**
    * A listener that is triggered once the editing is confirmed. This is
    * usually due to the <code>return</code> (or <code>enter</code>) key press.
    * The callback will also receive the row index and column index if they
    * were originally provided via props.
    */
  var onConfirm: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* rowIndex */ js.UndefOr[Double], 
      /* columnIndex */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /**
    * The value displayed in the text box. Be sure to update this value when
    * rendering this component after a confirmed change.
    */
  var value: js.UndefOr[String] = js.undefined
}

object IEditableCellProps {
  @scala.inline
  def apply(
    cellRef: /* ref */ HTMLElement | Null => Callback = null,
    className: String = null,
    columnIndex: Int | Double = null,
    editableTextProps: IEditableTextProps = null,
    intent: Intent = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    onCancel: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Callback = null,
    onChange: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Callback = null,
    onConfirm: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Callback = null,
    onKeyDown: ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onKeyPress: ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    onKeyUp: ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    rowIndex: Int | Double = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    tooltip: String = null,
    truncated: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    wrapText: js.UndefOr[Boolean] = js.undefined
  ): IEditableCellProps = {
    val __obj = js.Dynamic.literal()
    if (cellRef != null) __obj.updateDynamic("cellRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLElement | scala.Null) => cellRef(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (editableTextProps != null) __obj.updateDynamic("editableTextProps")(editableTextProps.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* rowIndex */ js.UndefOr[scala.Double], t2: /* columnIndex */ js.UndefOr[scala.Double]) => onCancel(t0, t1, t2).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* rowIndex */ js.UndefOr[scala.Double], t2: /* columnIndex */ js.UndefOr[scala.Double]) => onChange(t0, t1, t2).runNow()))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* rowIndex */ js.UndefOr[scala.Double], t2: /* columnIndex */ js.UndefOr[scala.Double]) => onConfirm(t0, t1, t2).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onKeyPress(t0).runNow()))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onKeyUp(t0).runNow()))
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(truncated)) __obj.updateDynamic("truncated")(truncated.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapText)) __obj.updateDynamic("wrapText")(wrapText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditableCellProps]
  }
}

