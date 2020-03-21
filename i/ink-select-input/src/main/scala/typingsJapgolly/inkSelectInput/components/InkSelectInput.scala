package typingsJapgolly.inkSelectInput.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Component
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.inkSelectInput.mod.ItemOfSelectInput
import typingsJapgolly.inkSelectInput.mod.SelectInputProps
import typingsJapgolly.inkSelectInput.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InkSelectInput {
  def apply(
    focus: js.UndefOr[Boolean] = js.undefined,
    indicatorComponent: Component[js.Object, js.Object] = null,
    initialIndex: Int | Double = null,
    itemComponent: Component[js.Object, js.Object] = null,
    items: js.Array[ItemOfSelectInput] = null,
    limit: Int | Double = null,
    onSelect: ItemOfSelectInput => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SelectInputProps[ItemOfSelectInput], 
    default, 
    Unit, 
    SelectInputProps[ItemOfSelectInput]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (indicatorComponent != null) __obj.updateDynamic("indicatorComponent")(indicatorComponent.asInstanceOf[js.Any])
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (itemComponent != null) __obj.updateDynamic("itemComponent")(itemComponent.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: typingsJapgolly.inkSelectInput.mod.ItemOfSelectInput) => onSelect(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.inkSelectInput.mod.SelectInputProps[typingsJapgolly.inkSelectInput.mod.ItemOfSelectInput], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.inkSelectInput.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.inkSelectInput.mod.SelectInputProps[typingsJapgolly.inkSelectInput.mod.ItemOfSelectInput]])(children: _*)
  }
  @JSImport("ink-select-input", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

