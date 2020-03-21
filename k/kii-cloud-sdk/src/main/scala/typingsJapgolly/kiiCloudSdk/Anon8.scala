package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiBucket
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon8[T] extends js.Object {
  def failure(bucket: KiiBucket, anErrorString: String): js.Any
  def success(queryPerformed: KiiQuery, resultSet: js.Array[T], nextQuery: KiiQuery): js.Any
}

object Anon8 {
  @scala.inline
  def apply[T](
    failure: (KiiBucket, String) => CallbackTo[js.Any],
    success: (KiiQuery, js.Array[T], KiiQuery) => CallbackTo[js.Any]
  ): Anon8[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiBucket, t1: java.lang.String) => failure(t0, t1).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction3((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiQuery, t1: js.Array[T], t2: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiQuery) => success(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Anon8[T]]
  }
}

