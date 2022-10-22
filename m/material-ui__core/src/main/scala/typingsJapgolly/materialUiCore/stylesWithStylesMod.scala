package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.anon.Classes
import typingsJapgolly.materialUiCore.stylesCreateThemeMod.Theme
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.Styles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typingsJapgolly.materialUiTypes.mod.PropInjector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesWithStylesMod {
  
  @JSImport("@material-ui/core/styles/withStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ClassKey /* <: String */, Options /* <: WithStylesOptions[Theme] */, Props /* <: js.Object */](style: Styles[Theme, Props, ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey] & Props
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any]).asInstanceOf[PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey] & Props
  ]]
  inline def default[ClassKey /* <: String */, Options /* <: WithStylesOptions[Theme] */, Props /* <: js.Object */](style: Styles[Theme, Props, ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey] & Props
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey] & Props
  ]]
  
  type StyleRules[ClassKey /* <: String */, Props /* <: js.Object */] = typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyleRules[Props, ClassKey]
  
  type WithStyles[StylesOrClassKey /* <: String | (Styles[Any, Any, Any]) */, IncludeTheme /* <: js.UndefOr[Boolean] */] = (/* import warning: importer.ImportType#apply Failed type conversion: IncludeTheme extends true ? {  theme :@material-ui/core.@material-ui/core/styles/createTheme.Theme} : {} */ js.Any) & Classes[StylesOrClassKey]
}
