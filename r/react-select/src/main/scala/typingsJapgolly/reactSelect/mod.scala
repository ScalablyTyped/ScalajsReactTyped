package typingsJapgolly.reactSelect

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactSelect.componentsInputMod.InputProps
import typingsJapgolly.reactSelect.componentsMod.IndicatorComponentType
import typingsJapgolly.reactSelect.componentsMultiValueMod.MultiValueProps
import typingsJapgolly.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typingsJapgolly.reactSelect.componentsSingleValueMod.SingleValueProps
import typingsJapgolly.reactSelect.containersMod.ContainerProps
import typingsJapgolly.reactSelect.containersMod.IndicatorContainerProps
import typingsJapgolly.reactSelect.containersMod.ValueContainerProps
import typingsJapgolly.reactSelect.controlMod.ControlProps
import typingsJapgolly.reactSelect.filtersMod.Config
import typingsJapgolly.reactSelect.filtersMod.Option
import typingsJapgolly.reactSelect.groupMod.GroupProps
import typingsJapgolly.reactSelect.indicatorsMod.LoadingIconProps
import typingsJapgolly.reactSelect.menuMod.MenuListComponentProps
import typingsJapgolly.reactSelect.menuMod.MenuPortalProps
import typingsJapgolly.reactSelect.menuMod.MenuProps
import typingsJapgolly.reactSelect.menuMod.NoticeProps
import typingsJapgolly.reactSelect.nonceProviderMod.NonceProviderProps
import typingsJapgolly.reactSelect.optionMod.OptionProps
import typingsJapgolly.reactSelect.stateManagerMod.DefaultProps
import typingsJapgolly.reactSelect.stateManagerMod.StateManager
import typingsJapgolly.reactSelect.stylesMod.StylesConfig
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import typingsJapgolly.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class NonceProvider ()
    extends Component[NonceProviderProps, js.Object, js.Any]
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */, T /* <: typingsJapgolly.reactSelect.selectMod.default[OptionType] */] () extends StateManager[OptionType, T]
  
  def createFilter(): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = js.native
  def createFilter(config: Config): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = js.native
  def mergeStyles(source: StylesConfig, target: StylesConfig): StylesConfig = js.native
  @js.native
  object components extends js.Object {
    var ClearIndicator: NonNullable[IndicatorComponentType[_] | Null] = js.native
    var Control: NonNullable[ComponentType[ControlProps[_]]] = js.native
    var CrossIcon: NonNullable[ComponentType[_]] = js.native
    var DownChevron: NonNullable[ComponentType[_]] = js.native
    var DropdownIndicator: NonNullable[IndicatorComponentType[_] | Null] = js.native
    var Group: NonNullable[ComponentType[GroupProps[_]]] = js.native
    var GroupHeading: NonNullable[ComponentType[_]] = js.native
    var IndicatorSeparator: NonNullable[IndicatorComponentType[_] | Null] = js.native
    var IndicatorsContainer: NonNullable[ComponentType[IndicatorContainerProps[_]]] = js.native
    var Input: NonNullable[ComponentType[InputProps]] = js.native
    var LoadingIndicator: NonNullable[ComponentType[LoadingIconProps[_]] | Null] = js.native
    var LoadingMessage: NonNullable[ComponentType[NoticeProps[_]]] = js.native
    var Menu: NonNullable[ComponentType[MenuProps[_]]] = js.native
    var MenuList: NonNullable[ComponentType[MenuListComponentProps[_]]] = js.native
    var MenuPortal: NonNullable[ComponentType[MenuPortalProps[_]]] = js.native
    var MultiValue: NonNullable[ComponentType[MultiValueProps[_]]] = js.native
    var MultiValueContainer: NonNullable[ComponentType[_]] = js.native
    var MultiValueLabel: NonNullable[ComponentType[_]] = js.native
    var MultiValueRemove: NonNullable[ComponentType[_]] = js.native
    var NoOptionsMessage: NonNullable[ComponentType[NoticeProps[_]]] = js.native
    var Option: NonNullable[ComponentType[OptionProps[_]]] = js.native
    var Placeholder: NonNullable[ComponentType[PlaceholderProps[_]]] = js.native
    var SelectContainer: NonNullable[ComponentType[ContainerProps[_]]] = js.native
    var SingleValue: NonNullable[ComponentType[SingleValueProps[_]]] = js.native
    var ValueContainer: NonNullable[ComponentType[ValueContainerProps[_]]] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: DefaultProps[_] = js.native
  }
  
}

