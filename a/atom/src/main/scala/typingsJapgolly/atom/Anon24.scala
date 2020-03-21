package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.inside
import typingsJapgolly.atom.atomStrings.never
import typingsJapgolly.atom.atomStrings.overlap
import typingsJapgolly.atom.atomStrings.surround
import typingsJapgolly.atom.atomStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon24 extends js.Object {
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
}

object Anon24 {
  @scala.inline
  def apply(invalidate: never | surround | overlap | inside | touch = null): Anon24 = {
    val __obj = js.Dynamic.literal()
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon24]
  }
}

