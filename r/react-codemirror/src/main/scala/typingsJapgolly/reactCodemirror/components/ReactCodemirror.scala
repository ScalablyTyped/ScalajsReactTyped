package typingsJapgolly.reactCodemirror.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.codemirror.mod.Editor
import typingsJapgolly.codemirror.mod.EditorChange
import typingsJapgolly.codemirror.mod.EditorConfiguration
import typingsJapgolly.codemirror.mod.ScrollInfo
import typingsJapgolly.reactCodemirror.ReactCodeMirror.ReactCodeMirrorProps
import typingsJapgolly.reactCodemirror.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCodemirror {
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoSave: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    codeMirrorInstance: (/* host */ js.Any, /* options */ js.UndefOr[EditorConfiguration]) => CallbackTo[Editor] = null,
    defaultValue: String = null,
    name: String = null,
    onChange: (/* newValue */ String, /* change */ EditorChange) => CallbackTo[js.Any] = null,
    onCursorActivity: /* codemirror */ Editor => CallbackTo[js.Any] = null,
    onFocusChange: /* focused */ Boolean => CallbackTo[js.Any] = null,
    onScroll: /* scrollInfo */ ScrollInfo => CallbackTo[js.Any] = null,
    options: EditorConfiguration = null,
    path: String = null,
    preserveScrollPosition: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactCodeMirrorProps, ^, Unit, ReactCodeMirrorProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSave)) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (codeMirrorInstance != null) __obj.updateDynamic("codeMirrorInstance")(js.Any.fromFunction2((t0: /* host */ js.Any, t1: /* options */ js.UndefOr[typingsJapgolly.codemirror.mod.EditorConfiguration]) => codeMirrorInstance(t0, t1).runNow()))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* newValue */ java.lang.String, t1: /* change */ typingsJapgolly.codemirror.mod.EditorChange) => onChange(t0, t1).runNow()))
    if (onCursorActivity != null) __obj.updateDynamic("onCursorActivity")(js.Any.fromFunction1((t0: /* codemirror */ typingsJapgolly.codemirror.mod.Editor) => onCursorActivity(t0).runNow()))
    if (onFocusChange != null) __obj.updateDynamic("onFocusChange")(js.Any.fromFunction1((t0: /* focused */ scala.Boolean) => onFocusChange(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* scrollInfo */ typingsJapgolly.codemirror.mod.ScrollInfo) => onScroll(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveScrollPosition)) __obj.updateDynamic("preserveScrollPosition")(preserveScrollPosition.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCodemirror.ReactCodeMirror.ReactCodeMirrorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactCodemirror.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCodemirror.ReactCodeMirror.ReactCodeMirrorProps])(children: _*)
  }
  @JSImport("react-codemirror", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

