package typingsJapgolly.materialUi.MaterialUI.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawTheme extends js.Object {
  var fontFamily: js.UndefOr[String] = js.undefined
  var palette: js.UndefOr[ThemePalette] = js.undefined
  var spacing: js.UndefOr[Spacing] = js.undefined
}

object RawTheme {
  @scala.inline
  def apply(fontFamily: String = null, palette: ThemePalette = null, spacing: Spacing = null): RawTheme = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawTheme]
  }
}

