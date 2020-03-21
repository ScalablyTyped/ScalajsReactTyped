package typingsJapgolly.heremaps.H.ui.DistanceMeasurement

import japgolly.scalajs.react.Callback
import typingsJapgolly.heremaps.H.map.Icon
import typingsJapgolly.heremaps.H.map.SpatialStyle
import typingsJapgolly.heremaps.H.ui.LayoutAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.RIGHT_BOTTOM
  * @property startIcon {H.map.Icon=} - the icon to use for the first measurement point
  * @property stopoverIcon {H.map.Icon=} - the icon to use for the intermediate measurement points
  * @property endIcon {H.map.Icon=} - the icon to use for the last measurement point
  * @property splitIcon {H.map.Icon=} - the icon to use for indicating position under pointer over the line where new point will be created once user clicks
  * @property lineStyle {(H.map.SpatialStyle | H.map.SpatialStyle.Options)} - the style to use for connecting lines of the measurement points
  * @property distanceFormatter {function(number)=} - Optional function used for formatting a distance. By default distance measurement tool will do the formatting according to the
  * specified measurement unit (see H.ui.UI.Options#unitSystem)
  */
trait Options extends js.Object {
  var alignment: js.UndefOr[LayoutAlignment] = js.undefined
  var distanceFormatter: js.UndefOr[js.Function1[/* n */ Double, Unit]] = js.undefined
  var endIcon: js.UndefOr[Icon] = js.undefined
  var lineStyle: SpatialStyle | typingsJapgolly.heremaps.H.map.SpatialStyle.Options
  var splitIcon: js.UndefOr[Icon] = js.undefined
  var startIcon: js.UndefOr[Icon] = js.undefined
  var stopoverIcon: js.UndefOr[Icon] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    lineStyle: SpatialStyle | typingsJapgolly.heremaps.H.map.SpatialStyle.Options,
    alignment: LayoutAlignment = null,
    distanceFormatter: /* n */ Double => Callback = null,
    endIcon: Icon = null,
    splitIcon: Icon = null,
    startIcon: Icon = null,
    stopoverIcon: Icon = null
  ): Options = {
    val __obj = js.Dynamic.literal(lineStyle = lineStyle.asInstanceOf[js.Any])
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (distanceFormatter != null) __obj.updateDynamic("distanceFormatter")(js.Any.fromFunction1((t0: /* n */ scala.Double) => distanceFormatter(t0).runNow()))
    if (endIcon != null) __obj.updateDynamic("endIcon")(endIcon.asInstanceOf[js.Any])
    if (splitIcon != null) __obj.updateDynamic("splitIcon")(splitIcon.asInstanceOf[js.Any])
    if (startIcon != null) __obj.updateDynamic("startIcon")(startIcon.asInstanceOf[js.Any])
    if (stopoverIcon != null) __obj.updateDynamic("stopoverIcon")(stopoverIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

