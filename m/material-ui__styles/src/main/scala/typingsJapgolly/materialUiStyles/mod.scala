package typingsJapgolly.materialUiStyles

import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.ElementType
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.jss.mod.GenerateId
import typingsJapgolly.jss.mod.JssOptions
import typingsJapgolly.materialUiStyles.createGenerateClassNameCreateGenerateClassNameMod.GenerateClassNameOptions
import typingsJapgolly.materialUiStyles.getThemePropsGetThemePropsMod.ThemeWithProps
import typingsJapgolly.materialUiStyles.getThemePropsGetThemePropsMod.ThemedProps
import typingsJapgolly.materialUiStyles.materialUiStylesStrings.withTheme
import typingsJapgolly.materialUiStyles.mergeClassesMergeClassesMod.Classes
import typingsJapgolly.materialUiStyles.mergeClassesMergeClassesMod.MergeClassesOption
import typingsJapgolly.materialUiStyles.serverStyleSheetsMod.default
import typingsJapgolly.materialUiStyles.styledStyledMod.ComponentCreator
import typingsJapgolly.materialUiStyles.stylesProviderStylesProviderMod.StylesOptions
import typingsJapgolly.materialUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import typingsJapgolly.materialUiStyles.themeProviderThemeProviderMod.ThemeProviderProps
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.PropsOfStyles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyleRules
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.Styles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.ThemeOfStyles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.WithStyles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typingsJapgolly.materialUiStyles.withThemeWithThemeMod.ThemedComponentProps
import typingsJapgolly.materialUiStyles.withThemeWithThemeMod.WithTheme
import typingsJapgolly.materialUiStyles.withThemeWithThemeMod.WithThemeCreatorOption
import typingsJapgolly.materialUiTypes.mod.ConsistentWith
import typingsJapgolly.materialUiTypes.mod.Omit
import typingsJapgolly.materialUiTypes.mod.PropInjector
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod._Global_.JSX.LibraryManagedAttributes
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ServerStyleSheets () extends default {
    def this(options: js.Object) = this()
  }
  
  @js.native
  class StylesProvider protected ()
    extends Component[StylesProviderProps, ComponentState, js.Any] {
    def this(props: StylesProviderProps) = this()
    def this(props: StylesProviderProps, context: js.Any) = this()
  }
  
  val StylesContext: Context[StylesOptions] = js.native
  def ThemeProvider[T](props: ThemeProviderProps[T]): Element = js.native
  def createGenerateClassName(): GenerateId = js.native
  def createGenerateClassName(options: GenerateClassNameOptions): GenerateId = js.native
  def createStyles[ClassKey /* <: String */, Props /* <: js.Object */](styles: StyleRules[Props, ClassKey]): StyleRules[Props, ClassKey] = js.native
  def getThemeProps[Theme /* <: ThemeWithProps[_] */, Props, Name /* <: String */](params: AnonName[Props, Name, Theme]): Props with (ThemedProps[Theme, Name]) = js.native
  def jssPreset(): JssOptions = js.native
  def makeStyles[Theme, ClassKey /* <: String */](style: Styles[Theme, js.Object, ClassKey]): js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]] = js.native
  @JSName("makeStyles")
  def makeStyles_ThemeProps_ObjectClassKey_String[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey]): js.Function1[/* props */ Props, ClassNameMap[ClassKey]] = js.native
  @JSName("makeStyles")
  def makeStyles_withTheme[Theme, ClassKey /* <: String */](style: Styles[Theme, js.Object, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]] = js.native
  @JSName("makeStyles")
  def makeStyles_withTheme_ThemeProps_ObjectClassKey_String[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): js.Function1[/* props */ Props, ClassNameMap[ClassKey]] = js.native
  def mergeClasses(): Classes = js.native
  def mergeClasses(options: MergeClassesOption): Classes = js.native
  def styled[Component /* <: ElementType */](Component: Component): ComponentCreator[Component] = js.native
  def useTheme[T](): T = js.native
  def withStyles[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] with PropsOfStyles[StylesType]
  ] = js.native
  def withStyles[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType, options: Options): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] with PropsOfStyles[StylesType]
  ] = js.native
  def withTheme[Theme](component: ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], ComponentState]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        ComponentClassP[(ConsistentWith[ComponentProps[_], WithTheme[Theme]]) with js.Object], 
        ComponentProps[
          ComponentClassP[(ConsistentWith[ComponentProps[_], WithTheme[Theme]]) with js.Object]
        ]
      ], 
      String
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  def withTheme[Theme](component: FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]], 
        ComponentProps[FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]]
      ], 
      String
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  def withThemeCreator[Theme](): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  def withThemeCreator[Theme](option: WithThemeCreatorOption[Theme]): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  @js.native
  object StylesProvider extends TopLevel[ComponentType[StylesProviderProps]]
  
}

