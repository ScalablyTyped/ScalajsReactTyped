package typingsJapgolly.atMaterialDashUiCore

import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreMod.PropInjector
import typingsJapgolly.atMaterialDashUiCore.stylesCreateGenerateClassNameMod.GenerateClassNameOptions
import typingsJapgolly.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import typingsJapgolly.atMaterialDashUiCore.stylesCreateMuiThemeMod.ThemeOptions
import typingsJapgolly.atMaterialDashUiCore.stylesMuiThemeProviderMod.MuiThemeProviderProps
import typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod.StyleRules
import typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod.StyleRulesCallback
import typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod.StyledComponentProps
import typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod.WithStyles
import typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod.WithStylesOptions
import typingsJapgolly.atMaterialDashUiCore.stylesWithThemeMod.ThemedComponentProps
import typingsJapgolly.atMaterialDashUiCore.stylesWithThemeMod.WithTheme
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod.ComponentState
import typingsJapgolly.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/styles", JSImport.Namespace)
@js.native
object stylesMod extends js.Object {
  @js.native
  class MuiThemeProvider protected ()
    extends Component[MuiThemeProviderProps, ComponentState, js.Any] {
    def this(props: MuiThemeProviderProps) = this()
    def this(props: MuiThemeProviderProps, context: js.Any) = this()
  }
  
  val MuiThemeProvider: ComponentType[MuiThemeProviderProps] = js.native
  def createGenerateClassName(): js.Any = js.native
  def createGenerateClassName(options: GenerateClassNameOptions): js.Any = js.native
  def createMuiTheme(): Theme = js.native
  def createMuiTheme(options: ThemeOptions): Theme = js.native
  def createStyles[C /* <: String */](styles: StyleRules[C]): StyleRules[C] = js.native
  def jssPreset(): js.Any = js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRules[ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRulesCallback[ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRulesCallback[ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRules[ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  def withTheme(): PropInjector[WithTheme, ThemedComponentProps] = js.native
}

