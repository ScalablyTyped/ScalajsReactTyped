package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesDefaultsStack extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
}

object ChartSeriesDefaultsStack {
  @scala.inline
  def apply(`type`: String = null): ChartSeriesDefaultsStack = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesDefaultsStack]
  }
}

