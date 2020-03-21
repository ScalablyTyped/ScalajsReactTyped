package typingsJapgolly.materialUiStyles

import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.PropsOfStyles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.Styles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.ThemeOfStyles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.WithStyles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typingsJapgolly.materialUiTypes.mod.PropInjector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/withStyles", JSImport.Namespace)
@js.native
object withStylesMod extends js.Object {
  def default[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] with PropsOfStyles[StylesType]
  ] = js.native
  def default[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType, options: Options): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] with PropsOfStyles[StylesType]
  ] = js.native
}

