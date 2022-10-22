package typingsJapgolly.reactSelect

import typingsJapgolly.emotionReact.mod.jsx.JSX.Element
import typingsJapgolly.reactSelect.anon.CallProps
import typingsJapgolly.reactSelect.anon.Container
import typingsJapgolly.reactSelect.anon.DefaultProps
import typingsJapgolly.reactSelect.anon.DefaultPropsChildren
import typingsJapgolly.reactSelect.anon.FnCall
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
import typingsJapgolly.reactSelect.distDeclarationsSrcFiltersMod.Config
import typingsJapgolly.reactSelect.distDeclarationsSrcFiltersMod.FilterOptionOption
import typingsJapgolly.reactSelect.distDeclarationsSrcNonceProviderMod.NonceProviderProps
import typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.PublicBaseSelectProps
import typingsJapgolly.reactSelect.distDeclarationsSrcStateManagerMod.StateManagedSelect
import typingsJapgolly.reactSelect.distDeclarationsSrcStylesMod.StylesConfig
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.Theme
import typingsJapgolly.reactSelect.distDeclarationsSrcUseStateManagerMod.StateManagedPropKeys
import typingsJapgolly.reactSelect.distDeclarationsSrcUseStateManagerMod.StateManagerProps
import typingsJapgolly.reactSelect.reactSelectStrings.defaultInputValue
import typingsJapgolly.reactSelect.reactSelectStrings.defaultMenuIsOpen
import typingsJapgolly.reactSelect.reactSelectStrings.defaultValue
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-select", JSImport.Default)
  @js.native
  val default: StateManagedSelect = js.native
  
  @JSImport("react-select", "NonceProvider")
  @js.native
  open class NonceProvider protected ()
    extends typingsJapgolly.reactSelect.distDeclarationsSrcMod.NonceProvider {
    def this(props: NonceProviderProps) = this()
  }
  
  object components {
    
    @JSImport("react-select", "components")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ClearIndicator[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](props: ClearIndicatorProps[Option, IsMulti, Group]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearIndicator")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Control[Option_1, IsMulti_1 /* <: Boolean */, Group_1 /* <: GroupBase[Option_1] */](props: ControlProps[Option_1, IsMulti_1, Group_1]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Control")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def CrossIcon(props: CrossIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CrossIcon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def DownChevron(props: DownChevronProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DownChevron")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def DropdownIndicator[Option_2, IsMulti_2 /* <: Boolean */, Group_2 /* <: GroupBase[Option_2] */](props: DropdownIndicatorProps[Option_2, IsMulti_2, Group_2]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DropdownIndicator")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Group[Option_3, IsMulti_3 /* <: Boolean */, Group_3 /* <: GroupBase[Option_3] */](props: GroupProps[Option_3, IsMulti_3, Group_3]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Group")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def GroupHeading[Option_4, IsMulti_4 /* <: Boolean */, Group_4 /* <: GroupBase[Option_4] */](props: GroupHeadingProps[Option_4, IsMulti_4, Group_4]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("GroupHeading")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def IndicatorSeparator[Option_6, IsMulti_6 /* <: Boolean */, Group_6 /* <: GroupBase[Option_6] */](props: IndicatorSeparatorProps[Option_6, IsMulti_6, Group_6]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IndicatorSeparator")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def IndicatorsContainer[Option_5, IsMulti_5 /* <: Boolean */, Group_5 /* <: GroupBase[Option_5] */](props: IndicatorsContainerProps[Option_5, IsMulti_5, Group_5]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IndicatorsContainer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Input[Option_7, IsMulti_7 /* <: Boolean */, Group_7 /* <: GroupBase[Option_7] */](props: InputProps[Option_7, IsMulti_7, Group_7]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Input")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-select", "components.LoadingIndicator")
    @js.native
    def LoadingIndicator: CallProps = js.native
    inline def LoadingIndicator_=(x: CallProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoadingIndicator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.LoadingMessage")
    @js.native
    def LoadingMessage: DefaultPropsChildren = js.native
    inline def LoadingMessage_=(x: DefaultPropsChildren): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoadingMessage")(x.asInstanceOf[js.Any])
    
    inline def Menu[Option_9, IsMulti_9 /* <: Boolean */, Group_9 /* <: GroupBase[Option_9] */](props: MenuProps[Option_9, IsMulti_9, Group_9]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Menu")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def MenuList[Option_10, IsMulti_10 /* <: Boolean */, Group_10 /* <: GroupBase[Option_10] */](props: MenuListProps[Option_10, IsMulti_10, Group_10]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuList")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def MenuPortal[Option_11, IsMulti_11 /* <: Boolean */, Group_11 /* <: GroupBase[Option_11] */](
      hasAppendToChildrenClassNameControlElementCxInnerPropsMenuPlacementMenuPositionGetStyles: MenuPortalProps[Option_11, IsMulti_11, Group_11]
    ): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuPortal")(hasAppendToChildrenClassNameControlElementCxInnerPropsMenuPlacementMenuPositionGetStyles.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    inline def MultiValue[Option_14, IsMulti_14 /* <: Boolean */, Group_14 /* <: GroupBase[Option_14] */](props: MultiValueProps[Option_14, IsMulti_14, Group_14]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MultiValue")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def MultiValueContainer[Option_15, IsMulti_15 /* <: Boolean */, Group_15 /* <: GroupBase[Option_15] */](hasChildrenInnerProps: MultiValueGenericProps[Option_15, IsMulti_15, Group_15]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MultiValueContainer")(hasChildrenInnerProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def MultiValueLabel[Option_15, IsMulti_15 /* <: Boolean */, Group_15 /* <: GroupBase[Option_15] */](hasChildrenInnerProps: MultiValueGenericProps[Option_15, IsMulti_15, Group_15]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MultiValueLabel")(hasChildrenInnerProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-select", "components.MultiValueRemove")
    @js.native
    def MultiValueRemove: FnCall = js.native
    inline def MultiValueRemove_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiValueRemove")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.NoOptionsMessage")
    @js.native
    def NoOptionsMessage: DefaultProps = js.native
    inline def NoOptionsMessage_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoOptionsMessage")(x.asInstanceOf[js.Any])
    
    inline def Option[Option_16, IsMulti_16 /* <: Boolean */, Group_16 /* <: GroupBase[Option_16] */](props: OptionProps[Option_16, IsMulti_16, Group_16]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Option")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def Placeholder[Option_17, IsMulti_17 /* <: Boolean */, Group_17 /* <: GroupBase[Option_17] */](props: PlaceholderProps[Option_17, IsMulti_17, Group_17]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Placeholder")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def SelectContainer[Option_18, IsMulti_18 /* <: Boolean */, Group_18 /* <: GroupBase[Option_18] */](props: ContainerProps[Option_18, IsMulti_18, Group_18]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectContainer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def SingleValue[Option_19, IsMulti_19 /* <: Boolean */, Group_19 /* <: GroupBase[Option_19] */](props: SingleValueProps[Option_19, IsMulti_19, Group_19]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SingleValue")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def ValueContainer[Option_20, IsMulti_20 /* <: Boolean */, Group_20 /* <: GroupBase[Option_20] */](props: ValueContainerProps[Option_20, IsMulti_20, Group_20]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ValueContainer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
  
  inline def createFilter[Option](): js.Function2[/* option */ FilterOptionOption[Option], /* rawInput */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")().asInstanceOf[js.Function2[/* option */ FilterOptionOption[Option], /* rawInput */ String, Boolean]]
  inline def createFilter[Option](config: Config[Option]): js.Function2[/* option */ FilterOptionOption[Option], /* rawInput */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* option */ FilterOptionOption[Option], /* rawInput */ String, Boolean]]
  
  @JSImport("react-select", "defaultTheme")
  @js.native
  val defaultTheme: Theme = js.native
  
  inline def mergeStyles[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](source: StylesConfig[Option, IsMulti, Group]): Container[Option, IsMulti, Group] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyles")(source.asInstanceOf[js.Any]).asInstanceOf[Container[Option, IsMulti, Group]]
  inline def mergeStyles[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](source: StylesConfig[Option, IsMulti, Group], target: StylesConfig[Option, IsMulti, Group]): Container[Option, IsMulti, Group] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeStyles")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Container[Option, IsMulti, Group]]
  
  inline def useStateManager[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */, AdditionalProps](
    hasDefaultInputValueDefaultMenuIsOpenDefaultValuePropsInputValuePropsMenuIsOpenPropsOnChangePropsOnInputChangePropsOnMenuClosePropsOnMenuOpenPropsValueRestSelectProps: (StateManagerProps[Option, IsMulti, Group]) & AdditionalProps
  ): (PublicBaseSelectProps[Option, IsMulti, Group]) & (Omit[
    AdditionalProps, 
    defaultInputValue | defaultMenuIsOpen | defaultValue | StateManagedPropKeys
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("useStateManager")(hasDefaultInputValueDefaultMenuIsOpenDefaultValuePropsInputValuePropsMenuIsOpenPropsOnChangePropsOnInputChangePropsOnMenuClosePropsOnMenuOpenPropsValueRestSelectProps.asInstanceOf[js.Any]).asInstanceOf[(PublicBaseSelectProps[Option, IsMulti, Group]) & (Omit[
    AdditionalProps, 
    defaultInputValue | defaultMenuIsOpen | defaultValue | StateManagedPropKeys
  ])]
}
