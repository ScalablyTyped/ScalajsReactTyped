package typingsJapgolly.hexoUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  var omission: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
}

object AnonLength {
  @scala.inline
  def apply(length: Int | Double = null, omission: String = null, separator: String = null): AnonLength = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (omission != null) __obj.updateDynamic("omission")(omission.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLength]
  }
}

