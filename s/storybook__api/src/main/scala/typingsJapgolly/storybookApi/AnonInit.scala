package typingsJapgolly.storybookApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.storybookApi.mod.API
import typingsJapgolly.storybookApi.shortcutsMod.SubAPI
import typingsJapgolly.storybookApi.shortcutsMod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInit extends js.Object {
  var api: SubAPI
  var state: SubState
  def init(hasApi: API): Unit
}

object AnonInit {
  @scala.inline
  def apply(api: SubAPI, init: API => Callback, state: SubState): AnonInit = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.storybookApi.mod.API) => init(t0).runNow()))
    __obj.asInstanceOf[AnonInit]
  }
}

