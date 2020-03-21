package typingsJapgolly.materialUiStyles

import typingsJapgolly.materialUiStyles.materialUiStylesStrings.withTheme
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.Styles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typingsJapgolly.materialUiTypes.mod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/makeStyles/makeStyles", JSImport.Namespace)
@js.native
object makeStylesMakeStylesMod extends js.Object {
  def default[Theme, ClassKey /* <: String */](style: Styles[Theme, js.Object, ClassKey]): js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]] = js.native
  @JSName("default")
  def default_ThemeProps_ObjectClassKey_String[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey]): js.Function1[/* props */ Props, ClassNameMap[ClassKey]] = js.native
  @JSName("default")
  def default_withTheme[Theme, ClassKey /* <: String */](style: Styles[Theme, js.Object, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]] = js.native
  @JSName("default")
  def default_withTheme_ThemeProps_ObjectClassKey_String[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): js.Function1[/* props */ Props, ClassNameMap[ClassKey]] = js.native
}

