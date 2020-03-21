package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon16 extends js.Object {
  def failure(theSrcObject: KiiObject, theTgtObjectUri: String, anErrorString: String): js.Any
  def success(theSrcObject: KiiObject, theTgtObjectUri: String): js.Any
}

object Anon16 {
  @scala.inline
  def apply(
    failure: (KiiObject, String, String) => CallbackTo[js.Any],
    success: (KiiObject, String) => CallbackTo[js.Any]
  ): Anon16 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction3((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiObject, t1: java.lang.String, t2: java.lang.String) => failure(t0, t1, t2).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiObject, t1: java.lang.String) => success(t0, t1).runNow()))
    __obj.asInstanceOf[Anon16]
  }
}

