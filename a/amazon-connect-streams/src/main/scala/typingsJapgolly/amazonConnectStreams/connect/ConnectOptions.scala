package typingsJapgolly.amazonConnectStreams.connect

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends SuccessFailOptions {
  /*
    * A string containing a Connect Queue ARN.
    */
  var queueARN: js.UndefOr[String] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    failure: js.UndefOr[Callback] = js.undefined,
    queueARN: String = null,
    success: js.UndefOr[Callback] = js.undefined
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    failure.foreach(p => __obj.updateDynamic("failure")(p.toJsFn))
    if (queueARN != null) __obj.updateDynamic("queueARN")(queueARN.asInstanceOf[js.Any])
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[ConnectOptions]
  }
}

