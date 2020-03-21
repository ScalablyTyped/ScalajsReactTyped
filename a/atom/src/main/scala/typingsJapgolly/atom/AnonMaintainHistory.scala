package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.inside
import typingsJapgolly.atom.atomStrings.never
import typingsJapgolly.atom.atomStrings.overlap
import typingsJapgolly.atom.atomStrings.surround
import typingsJapgolly.atom.atomStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaintainHistory extends js.Object {
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
  var maintainHistory: js.UndefOr[Boolean] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object AnonMaintainHistory {
  @scala.inline
  def apply(
    invalidate: never | surround | overlap | inside | touch = null,
    maintainHistory: js.UndefOr[Boolean] = js.undefined,
    reversed: js.UndefOr[Boolean] = js.undefined
  ): AnonMaintainHistory = {
    val __obj = js.Dynamic.literal()
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    if (!js.isUndefined(maintainHistory)) __obj.updateDynamic("maintainHistory")(maintainHistory.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaintainHistory]
  }
}

