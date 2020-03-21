package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiThing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon5 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(thing: KiiThing): js.Any
}

object Anon5 {
  @scala.inline
  def apply(failure: js.Error => CallbackTo[js.Any], success: KiiThing => CallbackTo[js.Any]): Anon5 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: js.Error) => failure(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiThing) => success(t0).runNow()))
    __obj.asInstanceOf[Anon5]
  }
}

