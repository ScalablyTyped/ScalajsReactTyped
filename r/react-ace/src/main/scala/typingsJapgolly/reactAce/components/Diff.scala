package typingsJapgolly.reactAce.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactAce.diffMod.IDiffEditorProps
import typingsJapgolly.reactAce.diffMod.default
import typingsJapgolly.reactAce.typesMod.IEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Diff {
  def apply(
    className: String = null,
    cursorStart: Int | Double = null,
    editorProps: js.Object = null,
    enableBasicAutocompletion: Boolean | js.Array[String] = null,
    enableLiveAutocompletion: Boolean | js.Array[String] = null,
    focus: js.UndefOr[Boolean] = js.undefined,
    fontSize: Int | Double = null,
    height: String = null,
    highlightActiveLine: js.UndefOr[Boolean] = js.undefined,
    maxLines: Int | Double = null,
    minLines: Int | Double = null,
    mode: String = null,
    name: String = null,
    onChange: (/* value */ js.Array[String], /* event */ js.UndefOr[js.Any]) => Callback = null,
    onLoad: /* editor */ IEditorProps => Callback = null,
    onPaste: /* value */ String => Callback = null,
    onScroll: /* editor */ IEditorProps => Callback = null,
    orientation: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    scrollMargin: js.Array[Double] = null,
    setOptions: js.Object = null,
    showGutter: js.UndefOr[Boolean] = js.undefined,
    showPrintMargin: js.UndefOr[Boolean] = js.undefined,
    splits: Int | Double = null,
    style: js.Object = null,
    tabSize: Int | Double = null,
    theme: String = null,
    value: js.Array[String] = null,
    width: String = null,
    wrapEnabled: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IDiffEditorProps, default, Unit, IDiffEditorProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cursorStart != null) __obj.updateDynamic("cursorStart")(cursorStart.asInstanceOf[js.Any])
    if (editorProps != null) __obj.updateDynamic("editorProps")(editorProps.asInstanceOf[js.Any])
    if (enableBasicAutocompletion != null) __obj.updateDynamic("enableBasicAutocompletion")(enableBasicAutocompletion.asInstanceOf[js.Any])
    if (enableLiveAutocompletion != null) __obj.updateDynamic("enableLiveAutocompletion")(enableLiveAutocompletion.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightActiveLine)) __obj.updateDynamic("highlightActiveLine")(highlightActiveLine.asInstanceOf[js.Any])
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    if (minLines != null) __obj.updateDynamic("minLines")(minLines.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* value */ js.Array[java.lang.String], t1: /* event */ js.UndefOr[js.Any]) => onChange(t0, t1).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* editor */ typingsJapgolly.reactAce.typesMod.IEditorProps) => onLoad(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onPaste(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* editor */ typingsJapgolly.reactAce.typesMod.IEditorProps) => onScroll(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (scrollMargin != null) __obj.updateDynamic("scrollMargin")(scrollMargin.asInstanceOf[js.Any])
    if (setOptions != null) __obj.updateDynamic("setOptions")(setOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showGutter)) __obj.updateDynamic("showGutter")(showGutter.asInstanceOf[js.Any])
    if (!js.isUndefined(showPrintMargin)) __obj.updateDynamic("showPrintMargin")(showPrintMargin.asInstanceOf[js.Any])
    if (splits != null) __obj.updateDynamic("splits")(splits.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapEnabled)) __obj.updateDynamic("wrapEnabled")(wrapEnabled.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAce.diffMod.IDiffEditorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactAce.diffMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAce.diffMod.IDiffEditorProps])(children: _*)
  }
  @JSImport("react-ace/lib/diff", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

