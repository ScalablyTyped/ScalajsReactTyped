package typingsJapgolly.chocolatechipjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallbackName extends js.Object {
  /**
    * The optional name for the callback when the server response will execute.
    * The default value is "callback".
    * However some sites may use a different name for their JSONP function.
    * Consult the documentation on the site to ascertain the correct value for this callback.
    */
  var callbackName: js.UndefOr[String] = js.undefined
  /**
    * This value determines whether the callbacks and script associate with JSONP persist or are purged after the request returns. By default this is set to true, meaning that they will be purged.
    */
  var clear: js.UndefOr[Boolean] = js.undefined
  /**
    * A number representing milliseconds to express when to refect a JSONP request.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object AnonCallbackName {
  @scala.inline
  def apply(
    callbackName: String = null,
    clear: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): AnonCallbackName = {
    val __obj = js.Dynamic.literal()
    if (callbackName != null) __obj.updateDynamic("callbackName")(callbackName.asInstanceOf[js.Any])
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallbackName]
  }
}

