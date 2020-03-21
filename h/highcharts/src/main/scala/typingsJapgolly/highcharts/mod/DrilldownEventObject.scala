package typingsJapgolly.highcharts.mod

import typingsJapgolly.highcharts.highchartsStrings.drilldown
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrilldownEventObject extends js.Object {
  /**
    * If a category label was clicked, which index.
    */
  var category: js.UndefOr[Double] = js.undefined
  /**
    * The original browser event (usually click) that triggered the drilldown.
    */
  var originalEvent: js.UndefOr[Event_] = js.undefined
  /**
    * The originating point.
    */
  var point: Point
  /**
    * If a category label was clicked, this array holds all points corresponing
    * to the category. Otherwise it is set to false.
    */
  var points: js.UndefOr[Boolean | js.Array[Point]] = js.undefined
  /**
    * Prevents the default behaviour of the event.
    */
  var preventDefault: js.Function
  /**
    * Options for the new series. If the event is utilized for async drilldown,
    * the seriesOptions are not added, but rather loaded async.
    */
  var seriesOptions: js.UndefOr[SeriesOptionsType] = js.undefined
  /**
    * The event target.
    */
  var target: Chart_
  /**
    * The event type.
    */
  var `type`: drilldown
}

object DrilldownEventObject {
  @scala.inline
  def apply(
    point: Point,
    preventDefault: js.Function,
    target: Chart_,
    `type`: drilldown,
    category: Int | Double = null,
    originalEvent: Event_ = null,
    points: Boolean | js.Array[Point] = null,
    seriesOptions: SeriesOptionsType = null
  ): DrilldownEventObject = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (seriesOptions != null) __obj.updateDynamic("seriesOptions")(seriesOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrilldownEventObject]
  }
}

