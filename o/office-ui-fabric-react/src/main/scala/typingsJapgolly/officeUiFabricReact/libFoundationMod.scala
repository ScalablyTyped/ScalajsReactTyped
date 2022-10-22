package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.Attributes
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Required
import typingsJapgolly.std.ReturnType
import typingsJapgolly.uifabricFoundation.libHooksControlledMod.IControlledStateOptions
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IComponentOptions
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IFactoryOptions
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IViewComponent
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlot
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotDefinition
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotFactory
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlots
import typingsJapgolly.uifabricFoundation.libIslotsMod.ISlottableProps
import typingsJapgolly.uifabricFoundation.libIslotsMod.ValidProps
import typingsJapgolly.uifabricFoundation.libIslotsMod.ValidShorthand
import typingsJapgolly.uifabricFoundation.libThemeProviderMod.IThemeProviderProps
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricMergeStyles.libIstylesetMod.IStyleSet
import typingsJapgolly.uifabricUtilities.libStyledMod.ICustomizableProps
import typingsJapgolly.uifabricUtilities.libStyledMod.IPropsWithStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFoundationMod {
  
  @JSImport("office-ui-fabric-react/lib/Foundation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/Foundation", "ThemeProvider")
  @js.native
  val ThemeProvider: FunctionComponent[IThemeProviderProps] = js.native
  
  inline def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](view: IViewComponent[TViewProps]): FunctionComponent[TComponentProps] & TStatics = ^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(view.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[TComponentProps] & TStatics]
  inline def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](
    view: IViewComponent[TViewProps],
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]
  ): FunctionComponent[TComponentProps] & TStatics = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(view.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps] & TStatics]
  
  inline def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps]): ISlotFactory[TProps, TShorthandProp] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(DefaultComponent.asInstanceOf[js.Any]).asInstanceOf[ISlotFactory[TProps, TShorthandProp]]
  inline def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps], options: IFactoryOptions[TProps]): ISlotFactory[TProps, TShorthandProp] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(DefaultComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ISlotFactory[TProps, TShorthandProp]]
  
  inline def getControlledDerivedProps[TProps, TProp /* <: /* keyof TProps */ String */](
    props: TProps,
    propName: TProp,
    derivedValue: /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getControlledDerivedProps")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], derivedValue.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any]
  
  inline def getSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](userProps: TComponentProps, slots: ISlotDefinition[Required[TComponentSlots]]): ISlots[Required[TComponentSlots]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlots")(userProps.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[ISlots[Required[TComponentSlots]]]
  
  inline def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClassP[TComponentProps & js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClassP[TComponentProps & js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClassP[TComponentProps & js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: Unit,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClassP[TComponentProps & js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClassP[TComponentProps & js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClassP[TComponentProps & js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: Unit,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClassP[TComponentProps & js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClassP[TComponentProps & js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: Unit,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: Unit,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  inline def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  
  inline def legacyStyled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClassP[TComponentProps & js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def legacyStyled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClassP[TComponentProps & js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def legacyStyled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClassP[TComponentProps & js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: Unit,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def legacyStyled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClassP[TComponentProps & js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def legacyStyled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClassP[TComponentProps & js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def legacyStyled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClassP[TComponentProps & js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: Unit,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def legacyStyled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClassP[TComponentProps & js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def legacyStyled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClassP[TComponentProps & js.Object],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def legacyStyled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def legacyStyled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def legacyStyled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: Unit,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def legacyStyled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def legacyStyled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def legacyStyled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: Unit,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def legacyStyled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  inline def legacyStyled_TComponentPropsTStylePropsTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  
  inline def useControlledState[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](props: TProps, propName: TProp): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControlledState")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ]]
  inline def useControlledState[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](props: TProps, propName: TProp, options: IControlledStateOptions[TProps, TProp, TDefaultProp]): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControlledState")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ]]
  
  inline def withSlots[P](`type`: String, props: Attributes & P, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: String, props: Null, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: String, props: Unit, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: FunctionComponent[P], props: Attributes & P, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: FunctionComponent[P], props: Null, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: FunctionComponent[P], props: Unit, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: ISlot[P], props: Attributes & P, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: ISlot[P], props: Null, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
  inline def withSlots[P](`type`: ISlot[P], props: Unit, children: Node*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReturnType[FunctionComponent[P]]]
}
