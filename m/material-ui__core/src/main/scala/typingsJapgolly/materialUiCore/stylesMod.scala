package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.jss.mod.GenerateId
import typingsJapgolly.jss.mod.JssOptions
import typingsJapgolly.materialUiCore.stylesColorManipulatorMod.ColorObject
import typingsJapgolly.materialUiCore.stylesCreateThemeMod.Theme
import typingsJapgolly.materialUiCore.stylesCreateThemeMod.ThemeOptions
import typingsJapgolly.materialUiCore.stylesResponsiveFontSizesMod.ResponsiveFontSizesOptions
import typingsJapgolly.materialUiCore.stylesStyledMod.ComponentCreator
import typingsJapgolly.materialUiCore.stylesTransitionsMod.Duration_
import typingsJapgolly.materialUiCore.stylesTransitionsMod.Easing_
import typingsJapgolly.materialUiCore.stylesTransitionsMod.Transitions
import typingsJapgolly.materialUiCore.stylesWithStylesMod.WithStyles
import typingsJapgolly.materialUiCore.stylesWithThemeMod.ThemedComponentProps
import typingsJapgolly.materialUiCore.stylesWithThemeMod.WithTheme
import typingsJapgolly.materialUiStyles.createGenerateClassNameCreateGenerateClassNameMod.GenerateClassNameOptions
import typingsJapgolly.materialUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import typingsJapgolly.materialUiStyles.themeProviderThemeProviderMod.ThemeProviderProps
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyleRules
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.Styles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typingsJapgolly.materialUiTypes.mod.Omit
import typingsJapgolly.materialUiTypes.mod.PropInjector
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("@material-ui/core/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // export type TransitionsOptions = DeepPartial<Transitions>;
  @JSImport("@material-ui/core/styles", JSImport.Default)
  @js.native
  val default: Transitions = js.native
  
  inline def MuiThemeProvider[T](props: ThemeProviderProps[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MuiThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@material-ui/core/styles", "ServerStyleSheets")
  @js.native
  open class ServerStyleSheets ()
    extends StObject
       with typingsJapgolly.materialUiStyles.serverStyleSheetsServerStyleSheetsMod.ServerStyleSheets {
    def this(options: js.Object) = this()
  }
  
  @JSImport("@material-ui/core/styles", "StylesProvider")
  @js.native
  val StylesProvider: ComponentType[StylesProviderProps] = js.native
  
  inline def ThemeProvider[T](props: ThemeProviderProps[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def alpha(color: String, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("alpha")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createGenerateClassName(): GenerateId = ^.asInstanceOf[js.Dynamic].applyDynamic("createGenerateClassName")().asInstanceOf[GenerateId]
  inline def createGenerateClassName(options: GenerateClassNameOptions): GenerateId = ^.asInstanceOf[js.Dynamic].applyDynamic("createGenerateClassName")(options.asInstanceOf[js.Any]).asInstanceOf[GenerateId]
  
  inline def createMuiTheme(options: Unit, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  inline def createMuiTheme(options: ThemeOptions, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  
  inline def createStyles[ClassKey /* <: String */, Props /* <: js.Object */](styles: StyleRules[Props, ClassKey]): StyleRules[Props, ClassKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[StyleRules[Props, ClassKey]]
  
  inline def createTheme(options: Unit, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  inline def createTheme(options: ThemeOptions, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  
  inline def darken(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("darken")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decomposeColor(color: String): ColorObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decomposeColor")(color.asInstanceOf[js.Any]).asInstanceOf[ColorObject]
  
  @JSImport("@material-ui/core/styles", "duration")
  @js.native
  val duration: Duration_ = js.native
  
  @JSImport("@material-ui/core/styles", "easing")
  @js.native
  val easing: Easing_ = js.native
  
  inline def emphasize(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emphasize")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def emphasize(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("emphasize")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def fade(color: String, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fade")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatMs(milliseconds: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMs")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getContrastRatio(foreground: String, background: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getLuminance(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLuminance")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hexToRgb(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hslToRgb(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def jssPreset(): JssOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("jssPreset")().asInstanceOf[JssOptions]
  
  inline def lighten(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def makeStyles[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey]): /* import warning: importer.ImportType#apply Failed type conversion: keyof Props extends never ? (props : any | undefined): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> : (props : Props): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: keyof Props extends never ? (props : any | undefined): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> : (props : Props): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> */ js.Any]
  
  inline def makeStyles_withTheme[Theme, Props /* <: js.Object */, ClassKey /* <: String */](
    styles: Styles[Theme, Props, ClassKey],
    options: Omit[
      WithStylesOptions[Theme], 
      typingsJapgolly.materialUiCore.materialUiCoreStrings.withTheme
    ]
  ): /* import warning: importer.ImportType#apply Failed type conversion: keyof Props extends never ? (props : any | undefined): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> : (props : Props): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: keyof Props extends never ? (props : any | undefined): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> : (props : Props): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> */ js.Any]
  
  inline def recomposeColor(color: ColorObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("recomposeColor")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def responsiveFontSizes(theme: Theme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("responsiveFontSizes")(theme.asInstanceOf[js.Any]).asInstanceOf[Theme]
  inline def responsiveFontSizes(theme: Theme, options: ResponsiveFontSizesOptions): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("responsiveFontSizes")(theme.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Theme]
  
  inline def rgbToHex(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbToHex")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def styled[Component /* <: ElementType */](Component: Component): ComponentCreator[Component] = ^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentCreator[Component]]
  
  inline def unstableCreateMuiStrictModeTheme(options: Unit, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createMuiStrictModeTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  inline def unstableCreateMuiStrictModeTheme(options: ThemeOptions, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createMuiStrictModeTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  
  inline def useTheme[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[T]
  
  inline def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[Theme] */, Props /* <: js.Object */](style: Styles[Theme, Props, ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey] & Props
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(style.asInstanceOf[js.Any]).asInstanceOf[PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey] & Props
  ]]
  inline def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[Theme] */, Props /* <: js.Object */](style: Styles[Theme, Props, ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey] & Props
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey] & Props
  ]]
  
  @JSImport("@material-ui/core/styles", "withTheme")
  @js.native
  val withTheme: PropInjector[WithTheme, ThemedComponentProps] = js.native
}
