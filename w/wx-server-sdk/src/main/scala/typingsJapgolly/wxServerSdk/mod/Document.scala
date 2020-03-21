package typingsJapgolly.wxServerSdk.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wxServerSdk.AnonDataAny
import typingsJapgolly.wxServerSdk.AnonId
import typingsJapgolly.wxServerSdk.AnonStats
import typingsJapgolly.wxServerSdk.AnonStatsAnon1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  def get(): js.Promise[AnonDataAny]
  def remove(): js.Promise[AnonStatsAnon1]
  def set(options: CommonOption[_]): js.Promise[AnonId]
  def update(options: CommonOption[_]): js.Promise[AnonStats]
}

object Document {
  @scala.inline
  def apply(
    get: CallbackTo[js.Promise[AnonDataAny]],
    remove: CallbackTo[js.Promise[AnonStatsAnon1]],
    set: CommonOption[js.Any] => CallbackTo[js.Promise[AnonId]],
    update: CommonOption[js.Any] => CallbackTo[js.Promise[AnonStats]]
  ): Document = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: typingsJapgolly.wxServerSdk.mod.CommonOption[js.Any]) => set(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.wxServerSdk.mod.CommonOption[js.Any]) => update(t0).runNow()))
    __obj.asInstanceOf[Document]
  }
}

