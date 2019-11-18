package typingsJapgolly.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconSequence extends js.Object {
  var fixedRotation: js.UndefOr[Boolean] = js.undefined
  // tslint:disable-next-line:no-unnecessary-qualifier
  var icon: js.UndefOr[Symbol] = js.undefined
  var offset: js.UndefOr[String] = js.undefined
  var repeat: js.UndefOr[String] = js.undefined
}

object IconSequence {
  @scala.inline
  def apply(
    fixedRotation: js.UndefOr[Boolean] = js.undefined,
    icon: Symbol = null,
    offset: String = null,
    repeat: String = null
  ): IconSequence = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fixedRotation)) __obj.updateDynamic("fixedRotation")(fixedRotation.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSequence]
  }
}

