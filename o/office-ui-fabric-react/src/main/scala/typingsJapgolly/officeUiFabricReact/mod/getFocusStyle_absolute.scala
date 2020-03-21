package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.absolute
import typingsJapgolly.uifabricMergeStyles.istyleMod.IRawStyle
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "getFocusStyle")
@js.native
object getFocusStyle_absolute extends js.Object {
  def apply(
    theme: ITheme,
    inset: js.UndefOr[Double],
    position: js.UndefOr[absolute],
    highContrastStyle: js.UndefOr[IRawStyle],
    borderColor: js.UndefOr[String],
    outlineColor: js.UndefOr[String],
    isFocusedOnly: js.UndefOr[Boolean]
  ): IRawStyle = js.native
}

