package typingsJapgolly.webicon.svgCumulativeIconSetMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webicon.svgIconMod.SvgIcon
import typingsJapgolly.webicon.webiconBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgCumulativeIconSet extends SvgIcon {
  /**
    * A value indicating whether the icons are loaded separately.
    */
  var cumulative: `true`
  /**
    * The number of miliseconds to wait before downloading the icons.
    */
  var waitDuration: js.UndefOr[Double] = js.undefined
}

object SvgCumulativeIconSet {
  @scala.inline
  def apply(
    cumulative: `true`,
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => CallbackTo[String] = null,
    iconSize: Int | Double = null,
    viewBox: String = null,
    waitDuration: Int | Double = null
  ): SvgCumulativeIconSet = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any])
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* params */ js.Array[java.lang.String]) => iconIdParser(t0, t1).runNow()))
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (waitDuration != null) __obj.updateDynamic("waitDuration")(waitDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgCumulativeIconSet]
  }
}

