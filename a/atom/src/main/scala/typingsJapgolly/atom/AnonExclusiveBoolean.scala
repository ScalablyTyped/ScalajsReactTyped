package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.inside
import typingsJapgolly.atom.atomStrings.never
import typingsJapgolly.atom.atomStrings.overlap
import typingsJapgolly.atom.atomStrings.surround
import typingsJapgolly.atom.atomStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExclusiveBoolean extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
}

object AnonExclusiveBoolean {
  @scala.inline
  def apply(
    exclusive: js.UndefOr[Boolean] = js.undefined,
    invalidate: never | surround | overlap | inside | touch = null
  ): AnonExclusiveBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExclusiveBoolean]
  }
}

