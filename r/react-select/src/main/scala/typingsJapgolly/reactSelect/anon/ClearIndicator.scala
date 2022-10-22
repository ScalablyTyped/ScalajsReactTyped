package typingsJapgolly.reactSelect.anon

import typingsJapgolly.emotionReact.mod.jsx.JSX.Element
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsContainersMod.ContainerProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsContainersMod.IndicatorsContainerProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsContainersMod.ValueContainerProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsControlMod.ControlProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsGroupMod.GroupHeadingProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsGroupMod.GroupProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.ClearIndicatorProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.CrossIconProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.DownChevronProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.DropdownIndicatorProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsIndicatorsMod.IndicatorSeparatorProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsInputMod.InputProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsMenuMod.MenuListProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsMenuMod.MenuPortalProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsMenuMod.MenuProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsMultiValueMod.MultiValueGenericProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsMultiValueMod.MultiValueProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsOptionMod.OptionProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsPlaceholderMod.PlaceholderProps
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsSingleValueMod.SingleValueProps
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearIndicator extends StObject {
  
  def ClearIndicator[Option_1, IsMulti_1 /* <: Boolean */, Group_1 /* <: GroupBase[Option_1] */](props: ClearIndicatorProps[Option_1, IsMulti_1, Group_1]): Element
  
  /**
    * If `true`, close the select menu when the user scrolls the document/body.
    *
    * If a function, takes a standard javascript `ScrollEvent` you return a boolean:
    *
    * `true` => The menu closes
    *
    * `false` => The menu stays open
    *
    * This is useful when you have a scrollable modal and want to portal the menu out,
    * but want to avoid graphical issues.
    */
  def Control[Option_2, IsMulti_2 /* <: Boolean */, Group_2 /* <: GroupBase[Option_2] */](props: ControlProps[Option_2, IsMulti_2, Group_2]): Element
  
  def CrossIcon(props: CrossIconProps): Element
  
  def DownChevron(props: DownChevronProps): Element
  
  def DropdownIndicator[Option_3, IsMulti_3 /* <: Boolean */, Group_3 /* <: GroupBase[Option_3] */](props: DropdownIndicatorProps[Option_3, IsMulti_3, Group_3]): Element
  
  def Group[Option_4, IsMulti_4 /* <: Boolean */, Group_4 /* <: GroupBase[Option_4] */](props: GroupProps[Option_4, IsMulti_4, Group_4]): Element
  
  def GroupHeading[Option_5, IsMulti_5 /* <: Boolean */, Group_5 /* <: GroupBase[Option_5] */](props: GroupHeadingProps[Option_5, IsMulti_5, Group_5]): Element
  
  def IndicatorSeparator[Option_7, IsMulti_7 /* <: Boolean */, Group_7 /* <: GroupBase[Option_7] */](props: IndicatorSeparatorProps[Option_7, IsMulti_7, Group_7]): Element
  
  def IndicatorsContainer[Option_6, IsMulti_6 /* <: Boolean */, Group_6 /* <: GroupBase[Option_6] */](props: IndicatorsContainerProps[Option_6, IsMulti_6, Group_6]): Element
  
  def Input[Option_8, IsMulti_8 /* <: Boolean */, Group_8 /* <: GroupBase[Option_8] */](props: InputProps[Option_8, IsMulti_8, Group_8]): Element
  
  var LoadingIndicator: Call
  
  var LoadingMessage: DefaultProps
  
  def Menu[Option_10, IsMulti_10 /* <: Boolean */, Group_10 /* <: GroupBase[Option_10] */](props: MenuProps[Option_10, IsMulti_10, Group_10]): Element
  
  def MenuList[Option_11, IsMulti_11 /* <: Boolean */, Group_11 /* <: GroupBase[Option_11] */](props: MenuListProps[Option_11, IsMulti_11, Group_11]): Element
  
  def MenuPortal[Option_12, IsMulti_12 /* <: Boolean */, Group_12 /* <: GroupBase[Option_12] */](
    hasAppendToChildrenClassNameControlElementCxInnerPropsMenuPlacementMenuPositionGetStyles: MenuPortalProps[Option_12, IsMulti_12, Group_12]
  ): Element | Null
  
  def MultiValue[Option_15, IsMulti_15 /* <: Boolean */, Group_15 /* <: GroupBase[Option_15] */](props: MultiValueProps[Option_15, IsMulti_15, Group_15]): Element
  
  def MultiValueContainer[Option_16, IsMulti_16 /* <: Boolean */, Group_16 /* <: GroupBase[Option_16] */](hasChildrenInnerProps: MultiValueGenericProps[Option_16, IsMulti_16, Group_16]): Element
  
  def MultiValueLabel[Option_16, IsMulti_16 /* <: Boolean */, Group_16 /* <: GroupBase[Option_16] */](hasChildrenInnerProps: MultiValueGenericProps[Option_16, IsMulti_16, Group_16]): Element
  
  var MultiValueRemove: FnCall
  
  var NoOptionsMessage: CallDefaultProps
  
  def Option[Option_17, IsMulti_17 /* <: Boolean */, Group_17 /* <: GroupBase[Option_17] */](props: OptionProps[Option_17, IsMulti_17, Group_17]): Element
  
  def Placeholder[Option_18, IsMulti_18 /* <: Boolean */, Group_18 /* <: GroupBase[Option_18] */](props: PlaceholderProps[Option_18, IsMulti_18, Group_18]): Element
  
  def SelectContainer[Option_19, IsMulti_19 /* <: Boolean */, Group_19 /* <: GroupBase[Option_19] */](props: ContainerProps[Option_19, IsMulti_19, Group_19]): Element
  
  def SingleValue[Option_20, IsMulti_20 /* <: Boolean */, Group_20 /* <: GroupBase[Option_20] */](props: SingleValueProps[Option_20, IsMulti_20, Group_20]): Element
  
  def ValueContainer[Option_21, IsMulti_21 /* <: Boolean */, Group_21 /* <: GroupBase[Option_21] */](props: ValueContainerProps[Option_21, IsMulti_21, Group_21]): Element
}
object ClearIndicator {
  
  inline def apply(
    ClearIndicator: ClearIndicatorProps[Any, Any, Any] => Element,
    Control: ControlProps[Any, Any, Any] => Element,
    CrossIcon: CrossIconProps => Element,
    DownChevron: DownChevronProps => Element,
    DropdownIndicator: DropdownIndicatorProps[Any, Any, Any] => Element,
    Group: GroupProps[Any, Any, Any] => Element,
    GroupHeading: GroupHeadingProps[Any, Any, Any] => Element,
    IndicatorSeparator: IndicatorSeparatorProps[Any, Any, Any] => Element,
    IndicatorsContainer: IndicatorsContainerProps[Any, Any, Any] => Element,
    Input: InputProps[Any, Any, Any] => Element,
    LoadingIndicator: Call,
    LoadingMessage: DefaultProps,
    Menu: MenuProps[Any, Any, Any] => Element,
    MenuList: MenuListProps[Any, Any, Any] => Element,
    MenuPortal: MenuPortalProps[Any, Any, Any] => Element | Null,
    MultiValue: MultiValueProps[Any, Any, Any] => Element,
    MultiValueContainer: MultiValueGenericProps[Any, Any, Any] => Element,
    MultiValueLabel: MultiValueGenericProps[Any, Any, Any] => Element,
    MultiValueRemove: FnCall,
    NoOptionsMessage: CallDefaultProps,
    Option: OptionProps[Any, Any, Any] => Element,
    Placeholder: PlaceholderProps[Any, Any, Any] => Element,
    SelectContainer: ContainerProps[Any, Any, Any] => Element,
    SingleValue: SingleValueProps[Any, Any, Any] => Element,
    ValueContainer: ValueContainerProps[Any, Any, Any] => Element
  ): ClearIndicator = {
    val __obj = js.Dynamic.literal(ClearIndicator = js.Any.fromFunction1(ClearIndicator), Control = js.Any.fromFunction1(Control), CrossIcon = js.Any.fromFunction1(CrossIcon), DownChevron = js.Any.fromFunction1(DownChevron), DropdownIndicator = js.Any.fromFunction1(DropdownIndicator), Group = js.Any.fromFunction1(Group), GroupHeading = js.Any.fromFunction1(GroupHeading), IndicatorSeparator = js.Any.fromFunction1(IndicatorSeparator), IndicatorsContainer = js.Any.fromFunction1(IndicatorsContainer), Input = js.Any.fromFunction1(Input), LoadingIndicator = LoadingIndicator.asInstanceOf[js.Any], LoadingMessage = LoadingMessage.asInstanceOf[js.Any], Menu = js.Any.fromFunction1(Menu), MenuList = js.Any.fromFunction1(MenuList), MenuPortal = js.Any.fromFunction1(MenuPortal), MultiValue = js.Any.fromFunction1(MultiValue), MultiValueContainer = js.Any.fromFunction1(MultiValueContainer), MultiValueLabel = js.Any.fromFunction1(MultiValueLabel), MultiValueRemove = MultiValueRemove.asInstanceOf[js.Any], NoOptionsMessage = NoOptionsMessage.asInstanceOf[js.Any], Option = js.Any.fromFunction1(Option), Placeholder = js.Any.fromFunction1(Placeholder), SelectContainer = js.Any.fromFunction1(SelectContainer), SingleValue = js.Any.fromFunction1(SingleValue), ValueContainer = js.Any.fromFunction1(ValueContainer))
    __obj.asInstanceOf[ClearIndicator]
  }
  
  extension [Self <: ClearIndicator](x: Self) {
    
    inline def setClearIndicator(value: ClearIndicatorProps[Any, Any, Any] => Element): Self = StObject.set(x, "ClearIndicator", js.Any.fromFunction1(value))
    
    inline def setControl(value: ControlProps[Any, Any, Any] => Element): Self = StObject.set(x, "Control", js.Any.fromFunction1(value))
    
    inline def setCrossIcon(value: CrossIconProps => Element): Self = StObject.set(x, "CrossIcon", js.Any.fromFunction1(value))
    
    inline def setDownChevron(value: DownChevronProps => Element): Self = StObject.set(x, "DownChevron", js.Any.fromFunction1(value))
    
    inline def setDropdownIndicator(value: DropdownIndicatorProps[Any, Any, Any] => Element): Self = StObject.set(x, "DropdownIndicator", js.Any.fromFunction1(value))
    
    inline def setGroup(value: GroupProps[Any, Any, Any] => Element): Self = StObject.set(x, "Group", js.Any.fromFunction1(value))
    
    inline def setGroupHeading(value: GroupHeadingProps[Any, Any, Any] => Element): Self = StObject.set(x, "GroupHeading", js.Any.fromFunction1(value))
    
    inline def setIndicatorSeparator(value: IndicatorSeparatorProps[Any, Any, Any] => Element): Self = StObject.set(x, "IndicatorSeparator", js.Any.fromFunction1(value))
    
    inline def setIndicatorsContainer(value: IndicatorsContainerProps[Any, Any, Any] => Element): Self = StObject.set(x, "IndicatorsContainer", js.Any.fromFunction1(value))
    
    inline def setInput(value: InputProps[Any, Any, Any] => Element): Self = StObject.set(x, "Input", js.Any.fromFunction1(value))
    
    inline def setLoadingIndicator(value: Call): Self = StObject.set(x, "LoadingIndicator", value.asInstanceOf[js.Any])
    
    inline def setLoadingMessage(value: DefaultProps): Self = StObject.set(x, "LoadingMessage", value.asInstanceOf[js.Any])
    
    inline def setMenu(value: MenuProps[Any, Any, Any] => Element): Self = StObject.set(x, "Menu", js.Any.fromFunction1(value))
    
    inline def setMenuList(value: MenuListProps[Any, Any, Any] => Element): Self = StObject.set(x, "MenuList", js.Any.fromFunction1(value))
    
    inline def setMenuPortal(value: MenuPortalProps[Any, Any, Any] => Element | Null): Self = StObject.set(x, "MenuPortal", js.Any.fromFunction1(value))
    
    inline def setMultiValue(value: MultiValueProps[Any, Any, Any] => Element): Self = StObject.set(x, "MultiValue", js.Any.fromFunction1(value))
    
    inline def setMultiValueContainer(value: MultiValueGenericProps[Any, Any, Any] => Element): Self = StObject.set(x, "MultiValueContainer", js.Any.fromFunction1(value))
    
    inline def setMultiValueLabel(value: MultiValueGenericProps[Any, Any, Any] => Element): Self = StObject.set(x, "MultiValueLabel", js.Any.fromFunction1(value))
    
    inline def setMultiValueRemove(value: FnCall): Self = StObject.set(x, "MultiValueRemove", value.asInstanceOf[js.Any])
    
    inline def setNoOptionsMessage(value: CallDefaultProps): Self = StObject.set(x, "NoOptionsMessage", value.asInstanceOf[js.Any])
    
    inline def setOption(value: OptionProps[Any, Any, Any] => Element): Self = StObject.set(x, "Option", js.Any.fromFunction1(value))
    
    inline def setPlaceholder(value: PlaceholderProps[Any, Any, Any] => Element): Self = StObject.set(x, "Placeholder", js.Any.fromFunction1(value))
    
    inline def setSelectContainer(value: ContainerProps[Any, Any, Any] => Element): Self = StObject.set(x, "SelectContainer", js.Any.fromFunction1(value))
    
    inline def setSingleValue(value: SingleValueProps[Any, Any, Any] => Element): Self = StObject.set(x, "SingleValue", js.Any.fromFunction1(value))
    
    inline def setValueContainer(value: ValueContainerProps[Any, Any, Any] => Element): Self = StObject.set(x, "ValueContainer", js.Any.fromFunction1(value))
  }
}
