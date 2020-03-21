package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Blob
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon17 extends js.Object {
  def failure(obj: KiiObject, anErrorString: String): js.Any
  def success(obj: KiiObject, bodyBlob: Blob): js.Any
}

object Anon17 {
  @scala.inline
  def apply(
    failure: (KiiObject, String) => CallbackTo[js.Any],
    success: (KiiObject, Blob) => CallbackTo[js.Any]
  ): Anon17 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiObject, t1: java.lang.String) => failure(t0, t1).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiObject, t1: org.scalajs.dom.raw.Blob) => success(t0, t1).runNow()))
    __obj.asInstanceOf[Anon17]
  }
}

