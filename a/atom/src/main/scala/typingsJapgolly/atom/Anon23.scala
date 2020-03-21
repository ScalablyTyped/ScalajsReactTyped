package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.backward
import typingsJapgolly.atom.atomStrings.closest
import typingsJapgolly.atom.atomStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon23 extends js.Object {
  var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
}

object Anon23 {
  @scala.inline
  def apply(clipDirection: backward | forward | closest = null): Anon23 = {
    val __obj = js.Dynamic.literal()
    if (clipDirection != null) __obj.updateDynamic("clipDirection")(clipDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon23]
  }
}

