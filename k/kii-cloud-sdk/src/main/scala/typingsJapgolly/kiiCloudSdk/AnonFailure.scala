package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiAppAdminContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailure extends js.Object {
  def failure(error: String, statusCode: Double): js.Any
  def success(adminContext: KiiAppAdminContext): js.Any
}

object AnonFailure {
  @scala.inline
  def apply(failure: (String, Double) => CallbackTo[js.Any], success: KiiAppAdminContext => CallbackTo[js.Any]): AnonFailure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => failure(t0, t1).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiAppAdminContext) => success(t0).runNow()))
    __obj.asInstanceOf[AnonFailure]
  }
}

