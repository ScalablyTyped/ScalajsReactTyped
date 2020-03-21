package typingsJapgolly.reactSelect.componentsMod

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactSelect.componentsInputMod.InputProps
import typingsJapgolly.reactSelect.componentsMultiValueMod.MultiValueProps
import typingsJapgolly.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typingsJapgolly.reactSelect.componentsSingleValueMod.SingleValueProps
import typingsJapgolly.reactSelect.containersMod.ContainerProps
import typingsJapgolly.reactSelect.containersMod.IndicatorContainerProps
import typingsJapgolly.reactSelect.containersMod.ValueContainerProps
import typingsJapgolly.reactSelect.controlMod.ControlProps
import typingsJapgolly.reactSelect.groupMod.GroupProps
import typingsJapgolly.reactSelect.indicatorsMod.LoadingIconProps
import typingsJapgolly.reactSelect.menuMod.MenuListComponentProps
import typingsJapgolly.reactSelect.menuMod.MenuPortalProps
import typingsJapgolly.reactSelect.menuMod.MenuProps
import typingsJapgolly.reactSelect.menuMod.NoticeProps
import typingsJapgolly.reactSelect.optionMod.OptionProps
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectComponents[OptionType /* <: OptionTypeBase */] extends js.Object {
  var ClearIndicator: IndicatorComponentType[OptionType] | Null
  var Control: ComponentType[ControlProps[OptionType]]
  var CrossIcon: ComponentType[_]
  var DownChevron: ComponentType[_]
  var DropdownIndicator: IndicatorComponentType[OptionType] | Null
  var Group: ComponentType[GroupProps[OptionType]]
  var GroupHeading: ComponentType[_]
  var IndicatorSeparator: IndicatorComponentType[OptionType] | Null
  var IndicatorsContainer: ComponentType[IndicatorContainerProps[OptionType]]
  var Input: ComponentType[InputProps]
  var LoadingIndicator: ComponentType[LoadingIconProps[OptionType]] | Null
  var LoadingMessage: ComponentType[NoticeProps[OptionType]]
  var Menu: ComponentType[MenuProps[OptionType]]
  var MenuList: ComponentType[MenuListComponentProps[OptionType]]
  var MenuPortal: ComponentType[MenuPortalProps[OptionType]]
  var MultiValue: ComponentType[MultiValueProps[OptionType]]
  var MultiValueContainer: ComponentType[_]
  var MultiValueLabel: ComponentType[_]
  var MultiValueRemove: ComponentType[_]
  var NoOptionsMessage: ComponentType[NoticeProps[OptionType]]
  var Option: ComponentType[OptionProps[OptionType]]
  var Placeholder: ComponentType[PlaceholderProps[OptionType]]
  var SelectContainer: ComponentType[ContainerProps[OptionType]]
  var SingleValue: ComponentType[SingleValueProps[OptionType]]
  var ValueContainer: ComponentType[ValueContainerProps[OptionType]]
}

object SelectComponents {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](
    Control: ComponentType[ControlProps[OptionType]],
    CrossIcon: ComponentType[_],
    DownChevron: ComponentType[_],
    Group: ComponentType[GroupProps[OptionType]],
    GroupHeading: ComponentType[_],
    IndicatorsContainer: ComponentType[IndicatorContainerProps[OptionType]],
    Input: ComponentType[InputProps],
    LoadingMessage: ComponentType[NoticeProps[OptionType]],
    Menu: ComponentType[MenuProps[OptionType]],
    MenuList: ComponentType[MenuListComponentProps[OptionType]],
    MenuPortal: ComponentType[MenuPortalProps[OptionType]],
    MultiValue: ComponentType[MultiValueProps[OptionType]],
    MultiValueContainer: ComponentType[_],
    MultiValueLabel: ComponentType[_],
    MultiValueRemove: ComponentType[_],
    NoOptionsMessage: ComponentType[NoticeProps[OptionType]],
    Option: ComponentType[OptionProps[OptionType]],
    Placeholder: ComponentType[PlaceholderProps[OptionType]],
    SelectContainer: ComponentType[ContainerProps[OptionType]],
    SingleValue: ComponentType[SingleValueProps[OptionType]],
    ValueContainer: ComponentType[ValueContainerProps[OptionType]],
    ClearIndicator: IndicatorComponentType[OptionType] = null,
    DropdownIndicator: IndicatorComponentType[OptionType] = null,
    IndicatorSeparator: IndicatorComponentType[OptionType] = null,
    LoadingIndicator: ComponentType[LoadingIconProps[OptionType]] = null
  ): SelectComponents[OptionType] = {
    val __obj = js.Dynamic.literal(Control = Control.asInstanceOf[js.Any], CrossIcon = CrossIcon.asInstanceOf[js.Any], DownChevron = DownChevron.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], GroupHeading = GroupHeading.asInstanceOf[js.Any], IndicatorsContainer = IndicatorsContainer.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], LoadingMessage = LoadingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuList = MenuList.asInstanceOf[js.Any], MenuPortal = MenuPortal.asInstanceOf[js.Any], MultiValue = MultiValue.asInstanceOf[js.Any], MultiValueContainer = MultiValueContainer.asInstanceOf[js.Any], MultiValueLabel = MultiValueLabel.asInstanceOf[js.Any], MultiValueRemove = MultiValueRemove.asInstanceOf[js.Any], NoOptionsMessage = NoOptionsMessage.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any], Placeholder = Placeholder.asInstanceOf[js.Any], SelectContainer = SelectContainer.asInstanceOf[js.Any], SingleValue = SingleValue.asInstanceOf[js.Any], ValueContainer = ValueContainer.asInstanceOf[js.Any])
    if (ClearIndicator != null) __obj.updateDynamic("ClearIndicator")(ClearIndicator.asInstanceOf[js.Any])
    if (DropdownIndicator != null) __obj.updateDynamic("DropdownIndicator")(DropdownIndicator.asInstanceOf[js.Any])
    if (IndicatorSeparator != null) __obj.updateDynamic("IndicatorSeparator")(IndicatorSeparator.asInstanceOf[js.Any])
    if (LoadingIndicator != null) __obj.updateDynamic("LoadingIndicator")(LoadingIndicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectComponents[OptionType]]
  }
}

