package typingsJapgolly.reactFloater

import typingsJapgolly.reactFloater.mod.Placement
import typingsJapgolly.reactFloater.reactFloaterStrings.center
import typingsJapgolly.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffset extends js.Object {
  var offset: js.UndefOr[Double] = js.undefined
  var placement: js.UndefOr[Omit[Placement, center]] = js.undefined
  var position: js.UndefOr[Boolean] = js.undefined
}

object AnonOffset {
  @scala.inline
  def apply(
    offset: Int | Double = null,
    placement: Omit[Placement, center] = null,
    position: js.UndefOr[Boolean] = js.undefined
  ): AnonOffset = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffset]
  }
}

