package typingsJapgolly.storybookApi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookApi.mod.API
import typingsJapgolly.storybookApi.versionsMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApiInit extends js.Object {
  var api: SubAPI
  var state: AnonDismissedVersionNotification
  def init(hasApi: API): js.Promise[Unit]
}

object AnonApiInit {
  @scala.inline
  def apply(api: SubAPI, init: API => CallbackTo[js.Promise[Unit]], state: AnonDismissedVersionNotification): AnonApiInit = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.storybookApi.mod.API) => init(t0).runNow()))
    __obj.asInstanceOf[AnonApiInit]
  }
}

