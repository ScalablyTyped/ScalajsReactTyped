package typingsJapgolly.markdownlint

import typingsJapgolly.markdownlint.markdownlintStrings.one
import typingsJapgolly.markdownlint.markdownlintStrings.one_or_ordered
import typingsJapgolly.markdownlint.markdownlintStrings.ordered
import typingsJapgolly.markdownlint.markdownlintStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var style: js.UndefOr[one | ordered | one_or_ordered | zero] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply(style: one | ordered | one_or_ordered | zero = null): Anon1 = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

