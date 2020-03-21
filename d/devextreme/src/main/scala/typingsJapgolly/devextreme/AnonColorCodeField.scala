package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.devextremeStrings.Bright
import typingsJapgolly.devextreme.devextremeStrings.Carmine
import typingsJapgolly.devextreme.devextremeStrings.Default
import typingsJapgolly.devextreme.devextremeStrings.Material
import typingsJapgolly.devextreme.devextremeStrings.Ocean
import typingsJapgolly.devextreme.devextremeStrings.Office
import typingsJapgolly.devextreme.devextremeStrings.Pastel
import typingsJapgolly.devextreme.devextremeStrings.Soft
import typingsJapgolly.devextreme.devextremeStrings.Vintage
import typingsJapgolly.devextreme.devextremeStrings.Violet
import typingsJapgolly.devextreme.devextremeStrings.`Dark Moon`
import typingsJapgolly.devextreme.devextremeStrings.`Dark Violet`
import typingsJapgolly.devextreme.devextremeStrings.`Green Mist`
import typingsJapgolly.devextreme.devextremeStrings.`Harmony Light`
import typingsJapgolly.devextreme.devextremeStrings.`Soft Blue`
import typingsJapgolly.devextreme.devextremeStrings.`Soft Pastel`
import typingsJapgolly.devextreme.devextremeStrings.alternate
import typingsJapgolly.devextreme.devextremeStrings.blend
import typingsJapgolly.devextreme.devextremeStrings.discrete
import typingsJapgolly.devextreme.devextremeStrings.extrapolate
import typingsJapgolly.devextreme.devextremeStrings.gradient
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.devextremeStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorCodeField extends js.Object {
  var colorCodeField: js.UndefOr[String] = js.undefined
  var colorizeGroups: js.UndefOr[Boolean] = js.undefined
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.undefined
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
  var range: js.UndefOr[js.Array[Double]] = js.undefined
  var `type`: js.UndefOr[discrete | gradient | none | range] = js.undefined
}

object AnonColorCodeField {
  @scala.inline
  def apply(
    colorCodeField: String = null,
    colorizeGroups: js.UndefOr[Boolean] = js.undefined,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    range: js.Array[Double] = null,
    `type`: discrete | gradient | none | range = null
  ): AnonColorCodeField = {
    val __obj = js.Dynamic.literal()
    if (colorCodeField != null) __obj.updateDynamic("colorCodeField")(colorCodeField.asInstanceOf[js.Any])
    if (!js.isUndefined(colorizeGroups)) __obj.updateDynamic("colorizeGroups")(colorizeGroups.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorCodeField]
  }
}

