package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.devextremeStrings.alternate
import typingsJapgolly.devextreme.devextremeStrings.blend
import typingsJapgolly.devextreme.devextremeStrings.extrapolate
import typingsJapgolly.devextreme.devextremeStrings.gradientSet
import typingsJapgolly.devextreme.devextremeStrings.indicatingSet
import typingsJapgolly.devextreme.devextremeStrings.simpleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseColorSet extends js.Object {
  var baseColorSet: js.UndefOr[simpleSet | indicatingSet | gradientSet] = js.undefined
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
}

object AnonBaseColorSet {
  @scala.inline
  def apply(
    baseColorSet: simpleSet | indicatingSet | gradientSet = null,
    paletteExtensionMode: alternate | blend | extrapolate = null
  ): AnonBaseColorSet = {
    val __obj = js.Dynamic.literal()
    if (baseColorSet != null) __obj.updateDynamic("baseColorSet")(baseColorSet.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseColorSet]
  }
}

