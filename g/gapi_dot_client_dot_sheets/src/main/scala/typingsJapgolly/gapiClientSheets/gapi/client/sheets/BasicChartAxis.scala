package typingsJapgolly.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicChartAxis extends js.Object {
  /**
    * The format of the title.
    * Only valid if the axis is not associated with the domain.
    */
  var format: js.UndefOr[TextFormat] = js.undefined
  /** The position of this axis. */
  var position: js.UndefOr[String] = js.undefined
  /**
    * The title of this axis. If set, this overrides any title inferred
    * from headers of the data.
    */
  var title: js.UndefOr[String] = js.undefined
  /** The axis title text position. */
  var titleTextPosition: js.UndefOr[TextPosition] = js.undefined
  /** The view window options for this axis. */
  var viewWindowOptions: js.UndefOr[ChartAxisViewWindowOptions] = js.undefined
}

object BasicChartAxis {
  @scala.inline
  def apply(
    format: TextFormat = null,
    position: String = null,
    title: String = null,
    titleTextPosition: TextPosition = null,
    viewWindowOptions: ChartAxisViewWindowOptions = null
  ): BasicChartAxis = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTextPosition != null) __obj.updateDynamic("titleTextPosition")(titleTextPosition.asInstanceOf[js.Any])
    if (viewWindowOptions != null) __obj.updateDynamic("viewWindowOptions")(viewWindowOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicChartAxis]
  }
}

