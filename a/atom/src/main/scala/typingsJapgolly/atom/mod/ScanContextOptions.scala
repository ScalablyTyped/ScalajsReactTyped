package typingsJapgolly.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanContextOptions extends js.Object {
  /** The number of lines before the matched line to include in the results object. */
  var leadingContextLineCount: js.UndefOr[Double] = js.undefined
  /** The number of lines after the matched line to include in the results object. */
  var trailingContextLineCount: js.UndefOr[Double] = js.undefined
}

object ScanContextOptions {
  @scala.inline
  def apply(leadingContextLineCount: Int | Double = null, trailingContextLineCount: Int | Double = null): ScanContextOptions = {
    val __obj = js.Dynamic.literal()
    if (leadingContextLineCount != null) __obj.updateDynamic("leadingContextLineCount")(leadingContextLineCount.asInstanceOf[js.Any])
    if (trailingContextLineCount != null) __obj.updateDynamic("trailingContextLineCount")(trailingContextLineCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanContextOptions]
  }
}

