package typingsJapgolly.amazonConnectStreams.connect

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessFailOptions extends js.Object {
  /*
    * A {SuccessFailCallback} to receive a notification of failure.
    */
  var failure: js.UndefOr[SuccessFailCallback] = js.undefined
  /*
    * A {SuccessFailCallback} to receive a notification of success.
    */
  var success: js.UndefOr[SuccessFailCallback] = js.undefined
}

object SuccessFailOptions {
  @scala.inline
  def apply(failure: js.UndefOr[Callback] = js.undefined, success: js.UndefOr[Callback] = js.undefined): SuccessFailOptions = {
    val __obj = js.Dynamic.literal()
    failure.foreach(p => __obj.updateDynamic("failure")(p.toJsFn))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[SuccessFailOptions]
  }
}

