package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonItem
import typingsJapgolly.baseui.AnonOptionState
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.search
import typingsJapgolly.baseui.baseuiStrings.select
import typingsJapgolly.baseui.selectMod.DropdownOverrides
import typingsJapgolly.baseui.selectMod.DropdownProps
import typingsJapgolly.baseui.selectMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectDropdown {
  def apply(
    error: js.UndefOr[Boolean] = js.undefined,
    getOptionLabel: /* args */ AnonOptionState => CallbackTo[Node] = null,
    innerRef: Ref = null,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    labelKey: String = null,
    maxDropdownHeight: String = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    noResultsMsg: VdomNode = null,
    onItemSelect: /* args */ AnonItem => CallbackTo[js.Any] = null,
    options: Value = null,
    overrides: DropdownOverrides = null,
    required: js.UndefOr[Boolean] = js.undefined,
    searchable: js.UndefOr[Boolean] = js.undefined,
    size: default_ | compact | large_ = null,
    `type`: select | search = null,
    value: Value = null,
    valueKey: String = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DropdownProps, typingsJapgolly.baseui.selectMod.SelectDropdown, Unit, DropdownProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (getOptionLabel != null) __obj.updateDynamic("getOptionLabel")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonOptionState) => getOptionLabel(t0).runNow()))
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    if (noResultsMsg != null) __obj.updateDynamic("noResultsMsg")(noResultsMsg.rawNode.asInstanceOf[js.Any])
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonItem) => onItemSelect(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.selectMod.DropdownProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.selectMod.SelectDropdown](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.selectMod.DropdownProps])(children: _*)
  }
  @JSImport("baseui/select", "SelectDropdown")
  @js.native
  object componentImport extends js.Object
  
}

