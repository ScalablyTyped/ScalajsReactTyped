package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameOnChange
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Range {
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    modifier: String = null,
    onChange: /* e */ Event_ => Callback = null,
    style: CSSProperties = null,
    value: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HTMLAttributesidclassNameOnChange, 
    typingsJapgolly.reactOnsenui.mod.Range, 
    Unit, 
    HTMLAttributesidclassNameOnChange
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onChange(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameOnChange, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOnsenui.mod.Range](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameOnChange])(children: _*)
  }
  @JSImport("react-onsenui", "Range")
  @js.native
  object componentImport extends js.Object
  
}

