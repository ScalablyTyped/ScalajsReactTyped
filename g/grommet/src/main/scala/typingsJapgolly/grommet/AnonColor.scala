package typingsJapgolly.grommet

import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.strong
import typingsJapgolly.grommet.grommetStrings.weak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[weak | medium | strong | Boolean] = js.undefined
}

object AnonColor {
  @scala.inline
  def apply(color: String = null, opacity: weak | medium | strong | Boolean = null): AnonColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}

