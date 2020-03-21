package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiServerCodeEntry
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiServerCodeExecResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon26[T] extends js.Object {
  def failure(entry: KiiServerCodeEntry, argument: T, execResult: KiiServerCodeExecResult, anErrorString: String): js.Any
  def success(entry: KiiServerCodeEntry, argument: T, execResult: KiiServerCodeExecResult): js.Any
}

object Anon26 {
  @scala.inline
  def apply[T](
    failure: (KiiServerCodeEntry, T, KiiServerCodeExecResult, String) => CallbackTo[js.Any],
    success: (KiiServerCodeEntry, T, KiiServerCodeExecResult) => CallbackTo[js.Any]
  ): Anon26[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction4((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiServerCodeEntry, t1: T, t2: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiServerCodeExecResult, t3: java.lang.String) => failure(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction3((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiServerCodeEntry, t1: T, t2: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiServerCodeExecResult) => success(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Anon26[T]]
  }
}

