package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon34[T] extends js.Object {
  def failure(error: js.Error): js.Any
  def success(topic: KiiTopic, message: T): js.Any
}

object Anon34 {
  @scala.inline
  def apply[T](failure: js.Error => CallbackTo[js.Any], success: (KiiTopic, T) => CallbackTo[js.Any]): Anon34[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: js.Error) => failure(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiTopic, t1: T) => success(t0, t1).runNow()))
    __obj.asInstanceOf[Anon34[T]]
  }
}

