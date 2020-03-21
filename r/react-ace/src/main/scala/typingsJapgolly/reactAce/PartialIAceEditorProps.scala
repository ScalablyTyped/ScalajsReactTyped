package typingsJapgolly.reactAce

import japgolly.scalajs.react.Callback
import typingsJapgolly.brace.mod.Annotation
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactAce.aceEditorClassMod.AceEditorClass
import typingsJapgolly.reactAce.typesMod.IAceOptions
import typingsJapgolly.reactAce.typesMod.ICommand
import typingsJapgolly.reactAce.typesMod.IEditorProps
import typingsJapgolly.reactAce.typesMod.IMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-ace.react-ace/lib/ace.IAceEditorProps> */
trait PartialIAceEditorProps extends js.Object {
  var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var commands: js.UndefOr[js.Array[ICommand]] = js.undefined
  var cursorStart: js.UndefOr[Double] = js.undefined
  var debounceChangePeriod: js.UndefOr[Double] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var editorProps: js.UndefOr[IEditorProps] = js.undefined
  var enableBasicAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var enableLiveAutocompletion: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var enableSnippets: js.UndefOr[Boolean] = js.undefined
  var focus: js.UndefOr[Boolean] = js.undefined
  var fontSize: js.UndefOr[Double | String] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var highlightActiveLine: js.UndefOr[Boolean] = js.undefined
  var keyboardHandler: js.UndefOr[String] = js.undefined
  var markers: js.UndefOr[js.Array[IMarker]] = js.undefined
  var maxLines: js.UndefOr[Double] = js.undefined
  var minLines: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var navigateToFileEnd: js.UndefOr[Boolean] = js.undefined
  var onBeforeLoad: js.UndefOr[js.Function1[/* ace */ js.Any, Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function2[/* event */ js.Any, /* editor */ js.UndefOr[AceEditorClass], Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* value */ String, /* event */ js.UndefOr[js.Any], Unit]] = js.undefined
  var onCopy: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onCursorChange: js.UndefOr[js.Function2[/* value */ js.Any, /* event */ js.UndefOr[js.Any], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function2[/* event */ js.Any, /* editor */ js.UndefOr[AceEditorClass], Unit]] = js.undefined
  var onInput: js.UndefOr[js.Function1[/* event */ js.UndefOr[js.Any], Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]] = js.undefined
  var onPaste: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onScroll: js.UndefOr[js.Function1[/* editor */ IEditorProps, Unit]] = js.undefined
  var onSelection: js.UndefOr[js.Function2[/* selectedText */ String, /* event */ js.UndefOr[js.Any], Unit]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function2[/* value */ js.Any, /* event */ js.UndefOr[js.Any], Unit]] = js.undefined
  var onValidate: js.UndefOr[js.Function1[/* annotations */ js.Array[Annotation], Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var scrollMargin: js.UndefOr[js.Array[Double]] = js.undefined
  var setOptions: js.UndefOr[IAceOptions] = js.undefined
  var showGutter: js.UndefOr[Boolean] = js.undefined
  var showPrintMargin: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabSize: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
  var wrapEnabled: js.UndefOr[Boolean] = js.undefined
}

object PartialIAceEditorProps {
  @scala.inline
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
    wrapEnabled: js.UndefOr[Boolean] = js.undefined
  ): PartialIAceEditorProps = {
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
    __obj.asInstanceOf[PartialIAceEditorProps]
  }
}

