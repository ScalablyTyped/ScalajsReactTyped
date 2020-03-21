package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon14 extends js.Object {
  def failure(theGroup: KiiGroup, anErrorString: String): js.Any
  def success(theGroup: KiiGroup, theOwner: KiiUser): js.Any
}

object Anon14 {
  @scala.inline
  def apply(
    failure: (KiiGroup, String) => CallbackTo[js.Any],
    success: (KiiGroup, KiiUser) => CallbackTo[js.Any]
  ): Anon14 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup, t1: java.lang.String) => failure(t0, t1).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup, t1: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser) => success(t0, t1).runNow()))
    __obj.asInstanceOf[Anon14]
  }
}

