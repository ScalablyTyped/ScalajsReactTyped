package typingsJapgolly.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HyperlinkSettings extends js.Object {
  /** Allows you to enable/disable the hyperlink for the column header.
    * @Default {false}
    */
  var enableColumnHeaderHyperlink: js.UndefOr[Boolean] = js.undefined
  /** Allows you to enable/disable the hyperlink for the row header.
    * @Default {false}
    */
  var enableRowHeaderHyperlink: js.UndefOr[Boolean] = js.undefined
  /** Allows you to enable/disable the hyperlink for summary cells.
    * @Default {false}
    */
  var enableSummaryCellHyperlink: js.UndefOr[Boolean] = js.undefined
  /** Allows you to enable/disable the hyperlink for value cells.
    * @Default {false}
    */
  var enableValueCellHyperlink: js.UndefOr[Boolean] = js.undefined
}

object HyperlinkSettings {
  @scala.inline
  def apply(
    enableColumnHeaderHyperlink: js.UndefOr[Boolean] = js.undefined,
    enableRowHeaderHyperlink: js.UndefOr[Boolean] = js.undefined,
    enableSummaryCellHyperlink: js.UndefOr[Boolean] = js.undefined,
    enableValueCellHyperlink: js.UndefOr[Boolean] = js.undefined
  ): HyperlinkSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableColumnHeaderHyperlink)) __obj.updateDynamic("enableColumnHeaderHyperlink")(enableColumnHeaderHyperlink.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRowHeaderHyperlink)) __obj.updateDynamic("enableRowHeaderHyperlink")(enableRowHeaderHyperlink.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSummaryCellHyperlink)) __obj.updateDynamic("enableSummaryCellHyperlink")(enableSummaryCellHyperlink.asInstanceOf[js.Any])
    if (!js.isUndefined(enableValueCellHyperlink)) __obj.updateDynamic("enableValueCellHyperlink")(enableValueCellHyperlink.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperlinkSettings]
  }
}

