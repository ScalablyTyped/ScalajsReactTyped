package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGcmInstallationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon19 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(response: KiiGcmInstallationResponse): js.Any
}

object Anon19 {
  @scala.inline
  def apply(failure: js.Error => CallbackTo[js.Any], success: KiiGcmInstallationResponse => CallbackTo[js.Any]): Anon19 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: js.Error) => failure(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGcmInstallationResponse) => success(t0).runNow()))
    __obj.asInstanceOf[Anon19]
  }
}

