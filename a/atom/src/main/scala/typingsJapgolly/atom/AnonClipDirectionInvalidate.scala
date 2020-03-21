package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.backward
import typingsJapgolly.atom.atomStrings.closest
import typingsJapgolly.atom.atomStrings.forward
import typingsJapgolly.atom.atomStrings.inside
import typingsJapgolly.atom.atomStrings.never
import typingsJapgolly.atom.atomStrings.overlap
import typingsJapgolly.atom.atomStrings.surround
import typingsJapgolly.atom.atomStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClipDirectionInvalidate extends js.Object {
  var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
}

object AnonClipDirectionInvalidate {
  @scala.inline
  def apply(
    clipDirection: backward | forward | closest = null,
    invalidate: never | surround | overlap | inside | touch = null
  ): AnonClipDirectionInvalidate = {
    val __obj = js.Dynamic.literal()
    if (clipDirection != null) __obj.updateDynamic("clipDirection")(clipDirection.asInstanceOf[js.Any])
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClipDirectionInvalidate]
  }
}

