package typingsJapgolly.uifabricFoundation

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.Attributes
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.ReactNode
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Required
import typingsJapgolly.std.ReturnType
import typingsJapgolly.uifabricFoundation.controlledMod.IControlledStateOptions
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
import typingsJapgolly.uifabricFoundation.themeProviderMod.IThemeProviderProps
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricMergeStyles.istylesetMod.IStyleSet
import typingsJapgolly.uifabricUtilities.styledMod.ICustomizableProps
import typingsJapgolly.uifabricUtilities.styledMod.IPropsWithStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val ThemeProvider: FunctionComponent[IThemeProviderProps] = js.native
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](view: IViewComponent[TViewProps]): FunctionComponent[TComponentProps] with TStatics = js.native
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](
    view: IViewComponent[TViewProps],
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]
  ): FunctionComponent[TComponentProps] with TStatics = js.native
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps], options: IFactoryOptions[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def getControlledDerivedProps[TProps, TProp /* <: String */](
    props: TProps,
    propName: TProp,
    derivedValue: /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any = js.native
  def getSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](userProps: TComponentProps, slots: ISlotDefinition[Required[TComponentSlots]]): ISlots[Required[TComponentSlots]] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = js.native
  def useControlledState[TProps, TProp /* <: String */, TDefaultProp /* <: String */](props: TProps, propName: TProp): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = js.native
  def useControlledState[TProps, TProp /* <: String */, TDefaultProp /* <: String */](props: TProps, propName: TProp, options: IControlledStateOptions[TProps, TProp, TDefaultProp]): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = js.native
  def withSlots[P](`type`: String): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: String, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: String, props: Attributes with P, children: Node*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P]): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], props: Attributes with P, children: Node*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P]): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P], children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P], props: Attributes with P, children: Node*): ReturnType[FunctionComponent[P]] = js.native
}

