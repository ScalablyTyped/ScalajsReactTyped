package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPositionStyle extends js.Object {
  var position: js.UndefOr[center | start | auto] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonPositionStyle {
  @scala.inline
  def apply(position: center | start | auto = null, style: js.Object = null, text: String = null): AnonPositionStyle = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPositionStyle]
  }
}

