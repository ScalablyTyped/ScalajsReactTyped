package typingsJapgolly.amazonConnectStreams.connect

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendDigitOptions extends SuccessFailOptions {
  /*
    * A string containing digits to send.
    */
  var digits: String
}

object SendDigitOptions {
  @scala.inline
  def apply(
    digits: String,
    failure: js.UndefOr[Callback] = js.undefined,
    success: js.UndefOr[Callback] = js.undefined
  ): SendDigitOptions = {
    val __obj = js.Dynamic.literal(digits = digits.asInstanceOf[js.Any])
    failure.foreach(p => __obj.updateDynamic("failure")(p.toJsFn))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[SendDigitOptions]
  }
}

