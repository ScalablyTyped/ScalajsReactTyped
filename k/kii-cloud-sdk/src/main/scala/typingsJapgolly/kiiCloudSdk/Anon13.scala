package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon13 extends js.Object {
  def failure(theGroup: KiiGroup, anErrorString: String): js.Any
  def success(theDeletedGroup: KiiGroup): js.Any
}

object Anon13 {
  @scala.inline
  def apply(failure: (KiiGroup, String) => CallbackTo[js.Any], success: KiiGroup => CallbackTo[js.Any]): Anon13 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup, t1: java.lang.String) => failure(t0, t1).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup) => success(t0).runNow()))
    __obj.asInstanceOf[Anon13]
  }
}

