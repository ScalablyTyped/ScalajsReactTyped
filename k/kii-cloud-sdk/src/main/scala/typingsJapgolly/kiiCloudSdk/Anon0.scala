package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiACL
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiACLEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  def failure(theACL: KiiACL, anErrorString: String): js.Any
  def success(theACL: KiiACL, theEntries: js.Array[KiiACLEntry]): js.Any
}

object Anon0 {
  @scala.inline
  def apply(
    failure: (KiiACL, String) => CallbackTo[js.Any],
    success: (KiiACL, js.Array[KiiACLEntry]) => CallbackTo[js.Any]
  ): Anon0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiACL, t1: java.lang.String) => failure(t0, t1).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiACL, t1: js.Array[typingsJapgolly.kiiCloudSdk.KiiCloud.KiiACLEntry]) => success(t0, t1).runNow()))
    __obj.asInstanceOf[Anon0]
  }
}

