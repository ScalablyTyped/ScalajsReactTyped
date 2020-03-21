package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiBucket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon10 extends js.Object {
  def failure(bucketToDelete: KiiBucket, anErrorString: String): js.Any
  def success(deletedBucket: KiiBucket): js.Any
}

object Anon10 {
  @scala.inline
  def apply(failure: (KiiBucket, String) => CallbackTo[js.Any], success: KiiBucket => CallbackTo[js.Any]): Anon10 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiBucket, t1: java.lang.String) => failure(t0, t1).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiBucket) => success(t0).runNow()))
    __obj.asInstanceOf[Anon10]
  }
}

