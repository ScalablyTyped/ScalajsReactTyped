package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiAppAdminContext
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon4 extends js.Object {
  def failure(adminContext: KiiAppAdminContext, anErrorString: String): js.Any
  def success(adminContext: KiiAppAdminContext, theMatchedUser: KiiUser): js.Any
}

object Anon4 {
  @scala.inline
  def apply(
    failure: (KiiAppAdminContext, String) => CallbackTo[js.Any],
    success: (KiiAppAdminContext, KiiUser) => CallbackTo[js.Any]
  ): Anon4 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiAppAdminContext, t1: java.lang.String) => failure(t0, t1).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiAppAdminContext, t1: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser) => success(t0, t1).runNow()))
    __obj.asInstanceOf[Anon4]
  }
}

