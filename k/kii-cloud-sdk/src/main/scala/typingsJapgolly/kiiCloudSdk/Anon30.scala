package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiThing
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon30 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(thing: KiiThing, group: KiiUser): js.Any
}

object Anon30 {
  @scala.inline
  def apply(failure: js.Error => CallbackTo[js.Any], success: (KiiThing, KiiUser) => CallbackTo[js.Any]): Anon30 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: js.Error) => failure(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiThing, t1: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser) => success(t0, t1).runNow()))
    __obj.asInstanceOf[Anon30]
  }
}

