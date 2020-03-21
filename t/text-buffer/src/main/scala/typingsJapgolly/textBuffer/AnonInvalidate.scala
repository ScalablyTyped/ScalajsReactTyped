package typingsJapgolly.textBuffer

import typingsJapgolly.textBuffer.textBufferStrings.inside
import typingsJapgolly.textBuffer.textBufferStrings.never
import typingsJapgolly.textBuffer.textBufferStrings.overlap
import typingsJapgolly.textBuffer.textBufferStrings.surround
import typingsJapgolly.textBuffer.textBufferStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvalidate extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
  var reversed: js.UndefOr[Boolean] = js.undefined
}

object AnonInvalidate {
  @scala.inline
  def apply(
    exclusive: js.UndefOr[Boolean] = js.undefined,
    invalidate: never | surround | overlap | inside | touch = null,
    reversed: js.UndefOr[Boolean] = js.undefined
  ): AnonInvalidate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInvalidate]
  }
}

