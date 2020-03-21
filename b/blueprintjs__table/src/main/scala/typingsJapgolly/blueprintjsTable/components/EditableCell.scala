package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.editableTextMod.IEditableTextProps
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.blueprintjsTable.editableCellMod.IEditableCellProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object EditableCell {
  def apply(
    cellRef: /* ref */ HTMLElement | Null => Callback = null,
    className: String = null,
    columnIndex: Int | Double = null,
    editableTextProps: IEditableTextProps = null,
    intent: Intent = null,
    interactive: js.UndefOr[Boolean] = js.undefined,
    isFocused: js.UndefOr[Boolean] = js.undefined,
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
    wrapText: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IEditableCellProps, 
    typingsJapgolly.blueprintjsTable.mod.EditableCell, 
    Unit, 
    IEditableCellProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (cellRef != null) __obj.updateDynamic("cellRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLElement | scala.Null) => cellRef(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (editableTextProps != null) __obj.updateDynamic("editableTextProps")(editableTextProps.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.editableCellMod.IEditableCellProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.mod.EditableCell](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.editableCellMod.IEditableCellProps])(children: _*)
  }
  @JSImport("@blueprintjs/table", "EditableCell")
  @js.native
  object componentImport extends js.Object
  
}

