package typingsJapgolly.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryRow extends js.Object {
  /** Specifies the summary columns in the summary rows.
    */
  var summaryColumns: js.UndefOr[js.Array[SummaryRowsSummaryColumn]] = js.undefined
  /** Specifies the title for summary row collection in TreeGrid
    */
  var title: js.UndefOr[String] = js.undefined
}

object SummaryRow {
  @scala.inline
  def apply(summaryColumns: js.Array[SummaryRowsSummaryColumn] = null, title: String = null): SummaryRow = {
    val __obj = js.Dynamic.literal()
    if (summaryColumns != null) __obj.updateDynamic("summaryColumns")(summaryColumns.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryRow]
  }
}

