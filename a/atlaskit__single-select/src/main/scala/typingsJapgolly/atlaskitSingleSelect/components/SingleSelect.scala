package typingsJapgolly.atlaskitSingleSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atlaskitSingleSelect.AnonEvent
import typingsJapgolly.atlaskitSingleSelect.atlaskitSingleSelectStrings.default
import typingsJapgolly.atlaskitSingleSelect.atlaskitSingleSelectStrings.subtle
import typingsJapgolly.atlaskitSingleSelect.mod.GroupType
import typingsJapgolly.atlaskitSingleSelect.mod.ItemType
import typingsJapgolly.atlaskitSingleSelect.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SingleSelect {
  def apply(
    appearance: default | subtle = null,
    defaultSelected: ItemType = null,
    droplistShouldFitContainer: js.UndefOr[Boolean] = js.undefined,
    hasAutocomplete: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    invalidMessage: VdomNode = null,
    isDefaultOpen: js.UndefOr[Boolean] = js.undefined,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isFirstChild: js.UndefOr[Boolean] = js.undefined,
    isInvalid: js.UndefOr[Boolean] = js.undefined,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[GroupType] = null,
    label: String = null,
    maxHeight: Int | Double = null,
    name: String = null,
    noMatchesFound: String = null,
    onFilterChange: /* filter */ String => Callback = null,
    onOpenChange: /* change */ AnonEvent => Callback = null,
    onSelected: /* item */ ItemType => Callback = null,
    placeholder: String = null,
    position: String = null,
    shouldFitContainer: js.UndefOr[Boolean] = js.undefined,
    shouldFlip: js.UndefOr[Boolean] = js.undefined,
    shouldFocus: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, typingsJapgolly.atlaskitSingleSelect.mod.default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (defaultSelected != null) __obj.updateDynamic("defaultSelected")(defaultSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(droplistShouldFitContainer)) __obj.updateDynamic("droplistShouldFitContainer")(droplistShouldFitContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAutocomplete)) __obj.updateDynamic("hasAutocomplete")(hasAutocomplete.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (invalidMessage != null) __obj.updateDynamic("invalidMessage")(invalidMessage.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultOpen)) __obj.updateDynamic("isDefaultOpen")(isDefaultOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isFirstChild)) __obj.updateDynamic("isFirstChild")(isFirstChild.asInstanceOf[js.Any])
    if (!js.isUndefined(isInvalid)) __obj.updateDynamic("isInvalid")(isInvalid.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (noMatchesFound != null) __obj.updateDynamic("noMatchesFound")(noMatchesFound.asInstanceOf[js.Any])
    if (onFilterChange != null) __obj.updateDynamic("onFilterChange")(js.Any.fromFunction1((t0: /* filter */ java.lang.String) => onFilterChange(t0).runNow()))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1((t0: /* change */ typingsJapgolly.atlaskitSingleSelect.AnonEvent) => onOpenChange(t0).runNow()))
    if (onSelected != null) __obj.updateDynamic("onSelected")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.atlaskitSingleSelect.mod.ItemType) => onSelected(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFitContainer)) __obj.updateDynamic("shouldFitContainer")(shouldFitContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFlip)) __obj.updateDynamic("shouldFlip")(shouldFlip.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocus)) __obj.updateDynamic("shouldFocus")(shouldFocus.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atlaskitSingleSelect.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atlaskitSingleSelect.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atlaskitSingleSelect.mod.Props])(children: _*)
  }
  @JSImport("@atlaskit/single-select", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

