package typingsJapgolly.markdownlint

import typingsJapgolly.markdownlint.markdownlintStrings.atx
import typingsJapgolly.markdownlint.markdownlintStrings.atx_closed
import typingsJapgolly.markdownlint.markdownlintStrings.consistent
import typingsJapgolly.markdownlint.markdownlintStrings.setext
import typingsJapgolly.markdownlint.markdownlintStrings.setext_with_atx
import typingsJapgolly.markdownlint.markdownlintStrings.setext_with_atx_closed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyle extends js.Object {
  var style: js.UndefOr[
    consistent | atx | atx_closed | setext | setext_with_atx | setext_with_atx_closed
  ] = js.undefined
}

object AnonStyle {
  @scala.inline
  def apply(style: consistent | atx | atx_closed | setext | setext_with_atx | setext_with_atx_closed = null): AnonStyle = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyle]
  }
}

