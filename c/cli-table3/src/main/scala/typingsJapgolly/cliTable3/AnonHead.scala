package typingsJapgolly.cliTable3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHead extends js.Object {
  var border: js.UndefOr[js.Array[String]] = js.undefined
  var head: js.UndefOr[js.Array[String]] = js.undefined
  var `padding-left`: js.UndefOr[Double] = js.undefined
  var `padding-right`: js.UndefOr[Double] = js.undefined
}

object AnonHead {
  @scala.inline
  def apply(
    border: js.Array[String] = null,
    head: js.Array[String] = null,
    `padding-left`: Int | Double = null,
    `padding-right`: Int | Double = null
  ): AnonHead = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (`padding-left` != null) __obj.updateDynamic("padding-left")(`padding-left`.asInstanceOf[js.Any])
    if (`padding-right` != null) __obj.updateDynamic("padding-right")(`padding-right`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHead]
  }
}

