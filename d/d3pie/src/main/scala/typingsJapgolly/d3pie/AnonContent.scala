package typingsJapgolly.d3pie

import typingsJapgolly.d3pie.d3pieStrings.`label-asc`
import typingsJapgolly.d3pie.d3pieStrings.`label-desc`
import typingsJapgolly.d3pie.d3pieStrings.`value-asc`
import typingsJapgolly.d3pie.d3pieStrings.`value-desc`
import typingsJapgolly.d3pie.d3pieStrings.none
import typingsJapgolly.d3pie.d3pieStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: js.Array[AnonLabel]
  var smallSegmentGrouping: js.UndefOr[AnonColor] = js.undefined
  var sortOrder: js.UndefOr[none | random | `value-asc` | `value-desc` | `label-asc` | `label-desc`] = js.undefined
}

object AnonContent {
  @scala.inline
  def apply(
    content: js.Array[AnonLabel],
    smallSegmentGrouping: AnonColor = null,
    sortOrder: none | random | `value-asc` | `value-desc` | `label-asc` | `label-desc` = null
  ): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (smallSegmentGrouping != null) __obj.updateDynamic("smallSegmentGrouping")(smallSegmentGrouping.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

