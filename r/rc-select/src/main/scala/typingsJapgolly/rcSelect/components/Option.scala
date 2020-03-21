package typingsJapgolly.rcSelect.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcSelect.mod.RcSelect.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Option {
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[OptionProps, typingsJapgolly.rcSelect.mod.Option, Unit, OptionProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcSelect.mod.RcSelect.OptionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rcSelect.mod.Option](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcSelect.mod.RcSelect.OptionProps])(children: _*)
  }
  @JSImport("rc-select", "Option")
  @js.native
  object componentImport extends js.Object
  
}

