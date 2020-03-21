package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgChartSpec extends js.Object {
  var labels: js.UndefOr[ChartData] = js.undefined
  var nodeColor: js.UndefOr[Color] = js.undefined
  var nodeSize: js.UndefOr[String] = js.undefined
  var parentLabels: js.UndefOr[ChartData] = js.undefined
  var selectedNodeColor: js.UndefOr[Color] = js.undefined
  var tooltips: js.UndefOr[ChartData] = js.undefined
}

object OrgChartSpec {
  @scala.inline
  def apply(
    labels: ChartData = null,
    nodeColor: Color = null,
    nodeSize: String = null,
    parentLabels: ChartData = null,
    selectedNodeColor: Color = null,
    tooltips: ChartData = null
  ): OrgChartSpec = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (nodeColor != null) __obj.updateDynamic("nodeColor")(nodeColor.asInstanceOf[js.Any])
    if (nodeSize != null) __obj.updateDynamic("nodeSize")(nodeSize.asInstanceOf[js.Any])
    if (parentLabels != null) __obj.updateDynamic("parentLabels")(parentLabels.asInstanceOf[js.Any])
    if (selectedNodeColor != null) __obj.updateDynamic("selectedNodeColor")(selectedNodeColor.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgChartSpec]
  }
}

