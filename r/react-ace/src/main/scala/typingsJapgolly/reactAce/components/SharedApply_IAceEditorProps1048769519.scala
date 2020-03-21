package typingsJapgolly.reactAce.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.brace.mod.Annotation
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactAce.aceEditorClassMod.AceEditorClass
import typingsJapgolly.reactAce.aceMod.IAceEditorProps
import typingsJapgolly.reactAce.typesMod.IAceOptions
import typingsJapgolly.reactAce.typesMod.ICommand
import typingsJapgolly.reactAce.typesMod.IEditorProps
import typingsJapgolly.reactAce.typesMod.IMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IAceEditorProps1048769519[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    annotations: js.Array[Annotation] = null,
    className: String = null,
    commands: js.Array[ICommand] = null,
    cursorStart: Int | Double = null,
    debounceChangePeriod: Int | Double = null,
    defaultValue: String = null,
    editorProps: IEditorProps = null,
    enableBasicAutocompletion: Boolean | js.Array[String] = null,
    enableLiveAutocompletion: Boolean | js.Array[String] = null,
    enableSnippets: js.UndefOr[Boolean] = js.undefined,
    focus: js.UndefOr[Boolean] = js.undefined,
    fontSize: Double | String = null,
    height: String = null,
    highlightActiveLine: js.UndefOr[Boolean] = js.undefined,
    keyboardHandler: String = null,
    markers: js.Array[IMarker] = null,
    maxLines: Int | Double = null,
    minLines: Int | Double = null,
    mode: String = null,
    name: String = null,
    navigateToFileEnd: js.UndefOr[Boolean] = js.undefined,
    onBeforeLoad: /* ace */ js.Any => Callback = null,
    onBlur: (/* event */ js.Any, /* editor */ js.UndefOr[AceEditorClass]) => Callback = null,
    onChange: (/* value */ String, /* event */ js.UndefOr[js.Any]) => Callback = null,
    onCopy: /* value */ String => Callback = null,
    onCursorChange: (/* value */ js.Any, /* event */ js.UndefOr[js.Any]) => Callback = null,
    onFocus: (/* event */ js.Any, /* editor */ js.UndefOr[AceEditorClass]) => Callback = null,
    onInput: /* event */ js.UndefOr[js.Any] => Callback = null,
    onLoad: /* editor */ IEditorProps => Callback = null,
    onPaste: /* value */ String => Callback = null,
    onScroll: /* editor */ IEditorProps => Callback = null,
    onSelection: (/* selectedText */ String, /* event */ js.UndefOr[js.Any]) => Callback = null,
    onSelectionChange: (/* value */ js.Any, /* event */ js.UndefOr[js.Any]) => Callback = null,
    onValidate: /* annotations */ js.Array[Annotation] => Callback = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    scrollMargin: js.Array[Double] = null,
    setOptions: IAceOptions = null,
    showGutter: js.UndefOr[Boolean] = js.undefined,
    showPrintMargin: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tabSize: Int | Double = null,
    theme: String = null,
    value: String = null,
    width: String = null,
    wrapEnabled: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IAceEditorProps, ComponentRef, Unit, IAceEditorProps] = {
    val __obj = js.Dynamic.literal()
  
      if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (cursorStart != null) __obj.updateDynamic("cursorStart")(cursorStart.asInstanceOf[js.Any])
    if (debounceChangePeriod != null) __obj.updateDynamic("debounceChangePeriod")(debounceChangePeriod.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (editorProps != null) __obj.updateDynamic("editorProps")(editorProps.asInstanceOf[js.Any])
    if (enableBasicAutocompletion != null) __obj.updateDynamic("enableBasicAutocompletion")(enableBasicAutocompletion.asInstanceOf[js.Any])
    if (enableLiveAutocompletion != null) __obj.updateDynamic("enableLiveAutocompletion")(enableLiveAutocompletion.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSnippets)) __obj.updateDynamic("enableSnippets")(enableSnippets.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightActiveLine)) __obj.updateDynamic("highlightActiveLine")(highlightActiveLine.asInstanceOf[js.Any])
    if (keyboardHandler != null) __obj.updateDynamic("keyboardHandler")(keyboardHandler.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    if (minLines != null) __obj.updateDynamic("minLines")(minLines.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(navigateToFileEnd)) __obj.updateDynamic("navigateToFileEnd")(navigateToFileEnd.asInstanceOf[js.Any])
    if (onBeforeLoad != null) __obj.updateDynamic("onBeforeLoad")(js.Any.fromFunction1((t0: /* ace */ js.Any) => onBeforeLoad(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ js.UndefOr[typingsJapgolly.reactAce.aceEditorClassMod.AceEditorClass]) => onBlur(t0, t1).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* event */ js.UndefOr[js.Any]) => onChange(t0, t1).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onCopy(t0).runNow()))
    if (onCursorChange != null) __obj.updateDynamic("onCursorChange")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* event */ js.UndefOr[js.Any]) => onCursorChange(t0, t1).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* editor */ js.UndefOr[typingsJapgolly.reactAce.aceEditorClassMod.AceEditorClass]) => onFocus(t0, t1).runNow()))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1((t0: /* event */ js.UndefOr[js.Any]) => onInput(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* editor */ typingsJapgolly.reactAce.typesMod.IEditorProps) => onLoad(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onPaste(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* editor */ typingsJapgolly.reactAce.typesMod.IEditorProps) => onScroll(t0).runNow()))
    if (onSelection != null) __obj.updateDynamic("onSelection")(js.Any.fromFunction2((t0: /* selectedText */ java.lang.String, t1: /* event */ js.UndefOr[js.Any]) => onSelection(t0, t1).runNow()))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* event */ js.UndefOr[js.Any]) => onSelectionChange(t0, t1).runNow()))
    if (onValidate != null) __obj.updateDynamic("onValidate")(js.Any.fromFunction1((t0: /* annotations */ js.Array[typingsJapgolly.brace.mod.Annotation]) => onValidate(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (scrollMargin != null) __obj.updateDynamic("scrollMargin")(scrollMargin.asInstanceOf[js.Any])
    if (setOptions != null) __obj.updateDynamic("setOptions")(setOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showGutter)) __obj.updateDynamic("showGutter")(showGutter.asInstanceOf[js.Any])
    if (!js.isUndefined(showPrintMargin)) __obj.updateDynamic("showPrintMargin")(showPrintMargin.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapEnabled)) __obj.updateDynamic("wrapEnabled")(wrapEnabled.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAce.aceMod.IAceEditorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAce.aceMod.IAceEditorProps])(children: _*)
  }
}

