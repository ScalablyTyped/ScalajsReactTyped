package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiThing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon29 extends js.Object {
  def failure(error: js.Error): js.Any
  def success(thing: KiiThing, user: KiiGroup, isOwner: Boolean): js.Any
}

object Anon29 {
  @scala.inline
  def apply(
    failure: js.Error => CallbackTo[js.Any],
    success: (KiiThing, KiiGroup, Boolean) => CallbackTo[js.Any]
  ): Anon29 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction1((t0: js.Error) => failure(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction3((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiThing, t1: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup, t2: scala.Boolean) => success(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Anon29]
  }
}

