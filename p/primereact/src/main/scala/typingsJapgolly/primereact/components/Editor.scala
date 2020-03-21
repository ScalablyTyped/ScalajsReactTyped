package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonHtmlValue
import typingsJapgolly.primereact.AnonOldRange
import typingsJapgolly.primereact.editorMod.EditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Editor {
  def apply(
    className: String = null,
    formats: js.Array[_] = null,
    headerTemplate: VdomElement = null,
    id: String = null,
    modules: js.Any = null,
    onSelectionChange: /* e */ AnonOldRange => Callback = null,
    onTextChange: /* e */ AnonHtmlValue => Callback = null,
    placeholder: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    theme: String = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[EditorProps, typingsJapgolly.primereact.primereactEditorMod.Editor, Unit, EditorProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.rawElement.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonOldRange) => onSelectionChange(t0).runNow()))
    if (onTextChange != null) __obj.updateDynamic("onTextChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonHtmlValue) => onTextChange(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.editorMod.EditorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactEditorMod.Editor](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.editorMod.EditorProps])(children: _*)
  }
  @JSImport("primereact/editor", "Editor")
  @js.native
  object componentImport extends js.Object
  
}

