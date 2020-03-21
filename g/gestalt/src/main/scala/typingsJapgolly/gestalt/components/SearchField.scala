package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.Anon0
import typingsJapgolly.gestalt.AnonSyntheticEvent
import typingsJapgolly.gestalt.mod.SearchFieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchField {
  def apply(
    accessibilityLabel: String,
    id: String,
    onChange: AnonSyntheticEvent => Callback,
    onBlur: /* args */ Anon0 => Callback = null,
    onFocus: /* args */ AnonSyntheticEvent => Callback = null,
    placeholder: String = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SearchFieldProps, typingsJapgolly.gestalt.mod.SearchField, Unit, SearchFieldProps] = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.gestalt.AnonSyntheticEvent) => onChange(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.Anon0) => onBlur(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonSyntheticEvent) => onFocus(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.SearchFieldProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.SearchField](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.SearchFieldProps])(children: _*)
  }
  @JSImport("gestalt", "SearchField")
  @js.native
  object componentImport extends js.Object
  
}

