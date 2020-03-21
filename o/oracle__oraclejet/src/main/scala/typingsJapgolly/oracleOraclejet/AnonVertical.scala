package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVertical extends js.Object {
  var horizontal: js.UndefOr[hidden | visible | auto] = js.undefined
  var vertical: js.UndefOr[hidden | visible | auto] = js.undefined
}

object AnonVertical {
  @scala.inline
  def apply(horizontal: hidden | visible | auto = null, vertical: hidden | visible | auto = null): AnonVertical = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVertical]
  }
}

