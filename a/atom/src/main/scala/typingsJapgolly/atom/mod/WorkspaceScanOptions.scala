package typingsJapgolly.atom.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceScanOptions extends js.Object {
  /** The number of lines before the matched line to include in the results object. */
  var leadingContextLineCount: js.UndefOr[Double] = js.undefined
  /** A function to be periodically called with the number of paths searched. */
  var onPathsSearched: js.UndefOr[js.Function1[/* pathsSearched */ Double, Unit]] = js.undefined
  /** An array of glob patterns to search within. */
  var paths: js.UndefOr[js.Array[String]] = js.undefined
  /** The number of lines after the matched line to include in the results object. */
  var trailingContextLineCount: js.UndefOr[Double] = js.undefined
}

object WorkspaceScanOptions {
  @scala.inline
  def apply(
    leadingContextLineCount: Int | Double = null,
    onPathsSearched: /* pathsSearched */ Double => Callback = null,
    paths: js.Array[String] = null,
    trailingContextLineCount: Int | Double = null
  ): WorkspaceScanOptions = {
    val __obj = js.Dynamic.literal()
    if (leadingContextLineCount != null) __obj.updateDynamic("leadingContextLineCount")(leadingContextLineCount.asInstanceOf[js.Any])
    if (onPathsSearched != null) __obj.updateDynamic("onPathsSearched")(js.Any.fromFunction1((t0: /* pathsSearched */ scala.Double) => onPathsSearched(t0).runNow()))
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (trailingContextLineCount != null) __obj.updateDynamic("trailingContextLineCount")(trailingContextLineCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceScanOptions]
  }
}

