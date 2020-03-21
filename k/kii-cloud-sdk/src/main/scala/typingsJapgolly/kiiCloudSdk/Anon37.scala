package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon37 extends js.Object {
  def failure(theUser: KiiUser, anErrorString: String): js.Any
  def success(theUser: KiiUser, groupList: js.Array[KiiGroup]): js.Any
}

object Anon37 {
  @scala.inline
  def apply(
    failure: (KiiUser, String) => CallbackTo[js.Any],
    success: (KiiUser, js.Array[KiiGroup]) => CallbackTo[js.Any]
  ): Anon37 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser, t1: java.lang.String) => failure(t0, t1).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser, t1: js.Array[typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup]) => success(t0, t1).runNow()))
    __obj.asInstanceOf[Anon37]
  }
}

