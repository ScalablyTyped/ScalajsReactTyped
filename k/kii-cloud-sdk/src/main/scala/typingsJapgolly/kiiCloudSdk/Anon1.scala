package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  def failure(theACL: KiiACL, anErrorString: String): js.Any
  def success(theSavedACL: KiiACL): js.Any
}

object Anon1 {
  @scala.inline
  def apply(failure: (KiiACL, String) => CallbackTo[js.Any], success: KiiACL => CallbackTo[js.Any]): Anon1 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiACL, t1: java.lang.String) => failure(t0, t1).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiACL) => success(t0).runNow()))
    __obj.asInstanceOf[Anon1]
  }
}

