package typingsJapgolly.webicon.svgIconSetMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webicon.svgIconMod.SvgIcon
import typingsJapgolly.webicon.webiconBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgIconSet extends SvgIcon {
  /**
    * A value indicating whether the icons are loaded separately.
    */
  var cumulative: js.UndefOr[`false`] = js.undefined
}

object SvgIconSet {
  @scala.inline
  def apply(
    cumulative: `false` = null,
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => CallbackTo[String] = null,
    iconSize: Int | Double = null,
    viewBox: String = null
  ): SvgIconSet = {
    val __obj = js.Dynamic.literal()
    if (cumulative != null) __obj.updateDynamic("cumulative")(cumulative.asInstanceOf[js.Any])
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* params */ js.Array[java.lang.String]) => iconIdParser(t0, t1).runNow()))
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgIconSet]
  }
}

