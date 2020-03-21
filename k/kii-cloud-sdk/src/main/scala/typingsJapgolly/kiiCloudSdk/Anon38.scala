package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon38 extends js.Object {
  def failure(anErrorString: String): js.Any
  def success(theMatchedUser: KiiUser): js.Any
}

object Anon38 {
  @scala.inline
  def apply(failure: String => CallbackTo[js.Any], success: KiiUser => CallbackTo[js.Any]): Anon38 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: java.lang.String) => failure(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser) => success(t0).runNow()))
    __obj.asInstanceOf[Anon38]
  }
}

