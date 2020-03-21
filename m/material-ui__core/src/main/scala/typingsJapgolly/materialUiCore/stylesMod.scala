package typingsJapgolly.materialUiCore

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.materialUiCore.createGenerateClassNameMod.GenerateClassNameOptions
import typingsJapgolly.materialUiCore.createMuiThemeMod.Theme
import typingsJapgolly.materialUiCore.createMuiThemeMod.ThemeOptions
import typingsJapgolly.materialUiCore.mod.PropInjector
import typingsJapgolly.materialUiCore.muiThemeProviderMod.MuiThemeProviderProps
import typingsJapgolly.materialUiCore.withStylesMod.StyleRules
import typingsJapgolly.materialUiCore.withStylesMod.StyleRulesCallback
import typingsJapgolly.materialUiCore.withStylesMod.StyledComponentProps
import typingsJapgolly.materialUiCore.withStylesMod.WithStyles
import typingsJapgolly.materialUiCore.withStylesMod.WithStylesOptions
import typingsJapgolly.materialUiCore.withThemeMod.ThemedComponentProps
import typingsJapgolly.materialUiCore.withThemeMod.WithTheme
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.ComponentType
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
  @js.native
  object MuiThemeProvider extends TopLevel[ComponentType[MuiThemeProviderProps]]
  
}

