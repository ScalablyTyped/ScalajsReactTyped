package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiBucket
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon9 extends js.Object {
  def failure(bucket: KiiBucket, errorString: String): js.Any
  def success(bucket: KiiBucket, query: KiiQuery, count: Double): js.Any
}

object Anon9 {
  @scala.inline
  def apply(
    failure: (KiiBucket, String) => CallbackTo[js.Any],
    success: (KiiBucket, KiiQuery, Double) => CallbackTo[js.Any]
  ): Anon9 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiBucket, t1: java.lang.String) => failure(t0, t1).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction3((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiBucket, t1: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiQuery, t2: scala.Double) => success(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Anon9]
  }
}

