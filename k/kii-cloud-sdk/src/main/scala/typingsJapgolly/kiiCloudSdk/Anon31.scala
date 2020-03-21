package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiThing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon31 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(thing: KiiThing, group: KiiGroup): js.Any
}

object Anon31 {
  @scala.inline
  def apply(failure: js.Error => CallbackTo[js.Any], success: (KiiThing, KiiGroup) => CallbackTo[js.Any]): Anon31 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: js.Error) => failure(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiThing, t1: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup) => success(t0, t1).runNow()))
    __obj.asInstanceOf[Anon31]
  }
}

