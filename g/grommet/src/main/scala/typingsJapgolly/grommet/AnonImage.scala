package typingsJapgolly.grommet

import typingsJapgolly.grommet.grommetStrings.`no-repeat`
import typingsJapgolly.grommet.grommetStrings.contain
import typingsJapgolly.grommet.grommetStrings.cover
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.repeat
import typingsJapgolly.grommet.grommetStrings.strong
import typingsJapgolly.grommet.grommetStrings.weak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImage extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var dark: js.UndefOr[Boolean | String] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var light: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[weak | medium | strong | Double | Boolean] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var repeat: js.UndefOr[`no-repeat` | typingsJapgolly.grommet.grommetStrings.repeat | String] = js.undefined
  var size: js.UndefOr[cover | contain | String] = js.undefined
}

object AnonImage {
  @scala.inline
  def apply(
    color: String = null,
    dark: Boolean | String = null,
    image: String = null,
    light: String = null,
    opacity: weak | medium | strong | Double | Boolean = null,
    position: String = null,
    repeat: `no-repeat` | repeat | String = null,
    size: cover | contain | String = null
  ): AnonImage = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImage]
  }
}

