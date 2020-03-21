package typingsJapgolly.reactRte.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.draftJs.mod.ContentBlock
import typingsJapgolly.reactRte.mod.CustomControl
import typingsJapgolly.reactRte.mod.EditorValue
import typingsJapgolly.reactRte.mod.Props
import typingsJapgolly.reactRte.mod.ToolbarConfig
import typingsJapgolly.reactRte.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactRte {
  def apply(
    value: EditorValue,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    blockStyleFn: /* block */ ContentBlock => CallbackTo[js.UndefOr[String]] = null,
    className: String = null,
    customControls: js.Array[CustomControl] = null,
    customStyleMap: StringDictionary[StringDictionary[js.Any]] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editorClassName: String = null,
    editorStyle: js.Object = null,
    handleReturn: /* event */ js.Object => CallbackTo[Boolean] = null,
    keyBindingFn: /* event */ js.Object => CallbackTo[js.UndefOr[String]] = null,
    onChange: /* value */ EditorValue => CallbackTo[js.Any] = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rootStyle: js.Object = null,
    toolbarClassName: String = null,
    toolbarConfig: ToolbarConfig = null,
    toolbarStyle: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (blockStyleFn != null) __obj.updateDynamic("blockStyleFn")(js.Any.fromFunction1((t0: /* block */ typingsJapgolly.draftJs.mod.ContentBlock) => blockStyleFn(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customControls != null) __obj.updateDynamic("customControls")(customControls.asInstanceOf[js.Any])
    if (customStyleMap != null) __obj.updateDynamic("customStyleMap")(customStyleMap.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (editorClassName != null) __obj.updateDynamic("editorClassName")(editorClassName.asInstanceOf[js.Any])
    if (editorStyle != null) __obj.updateDynamic("editorStyle")(editorStyle.asInstanceOf[js.Any])
    if (handleReturn != null) __obj.updateDynamic("handleReturn")(js.Any.fromFunction1((t0: /* event */ js.Object) => handleReturn(t0).runNow()))
    if (keyBindingFn != null) __obj.updateDynamic("keyBindingFn")(js.Any.fromFunction1((t0: /* event */ js.Object) => keyBindingFn(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.reactRte.mod.EditorValue) => onChange(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (rootStyle != null) __obj.updateDynamic("rootStyle")(rootStyle.asInstanceOf[js.Any])
    if (toolbarClassName != null) __obj.updateDynamic("toolbarClassName")(toolbarClassName.asInstanceOf[js.Any])
    if (toolbarConfig != null) __obj.updateDynamic("toolbarConfig")(toolbarConfig.asInstanceOf[js.Any])
    if (toolbarStyle != null) __obj.updateDynamic("toolbarStyle")(toolbarStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRte.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactRte.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRte.mod.Props])(children: _*)
  }
  @JSImport("react-rte", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

