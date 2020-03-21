package typingsJapgolly.webicon.svgIconMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webicon.iconMod.Icon
import typingsJapgolly.webicon.sizeableMod.Sizeable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgIcon
  extends Icon
     with Sizeable {
  /**
    * The default viewBox of the icon.
    */
  var viewBox: js.UndefOr[String] = js.undefined
}

object SvgIcon {
  @scala.inline
  def apply(
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => CallbackTo[String] = null,
    iconSize: Int | Double = null,
    viewBox: String = null
  ): SvgIcon = {
    val __obj = js.Dynamic.literal()
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* params */ js.Array[java.lang.String]) => iconIdParser(t0, t1).runNow()))
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgIcon]
  }
}

