package typingsJapgolly.oracleOraclejet.ojmenuMod.ojMenu

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait OpenOptions extends js.Object {
  var display: js.UndefOr[String] = js.undefined
  var initialFocus: js.UndefOr[String] = js.undefined
  var launcher: js.UndefOr[String | Element] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
}

object OpenOptions {
  @scala.inline
  def apply(
    display: String = null,
    initialFocus: String = null,
    launcher: String | Element = null,
    position: Position = null
  ): OpenOptions = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (initialFocus != null) __obj.updateDynamic("initialFocus")(initialFocus.asInstanceOf[js.Any])
    if (launcher != null) __obj.updateDynamic("launcher")(launcher.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenOptions]
  }
}

