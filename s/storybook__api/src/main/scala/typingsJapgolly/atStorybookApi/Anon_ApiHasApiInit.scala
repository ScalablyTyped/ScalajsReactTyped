package typingsJapgolly.atStorybookApi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atStorybookApi.atStorybookApiMod.API
import typingsJapgolly.atStorybookApi.distModulesVersionsMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiHasApiInit extends js.Object {
  var api: SubAPI
  var state: Anon_DismissedVersionNotification
  def init(hasApi: API): js.Promise[Unit]
}

object Anon_ApiHasApiInit {
  @scala.inline
  def apply(api: SubAPI, init: API => CallbackTo[js.Promise[Unit]], state: Anon_DismissedVersionNotification): Anon_ApiHasApiInit = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookApi.atStorybookApiMod.API) => init(t0).runNow()))
    __obj.asInstanceOf[Anon_ApiHasApiInit]
  }
}

