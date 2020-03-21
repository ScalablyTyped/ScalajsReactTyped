package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon35 extends js.Object {
  def failure(theUser: KiiUser, anErrorString: String): js.Any
  def success(theDeletedUser: KiiUser): js.Any
}

object Anon35 {
  @scala.inline
  def apply(failure: (KiiUser, String) => CallbackTo[js.Any], success: KiiUser => CallbackTo[js.Any]): Anon35 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser, t1: java.lang.String) => failure(t0, t1).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser) => success(t0).runNow()))
    __obj.asInstanceOf[Anon35]
  }
}

