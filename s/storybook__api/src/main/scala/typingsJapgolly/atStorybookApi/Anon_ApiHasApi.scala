package typingsJapgolly.atStorybookApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.atStorybookApi.atStorybookApiMod.API
import typingsJapgolly.atStorybookApi.distModulesShortcutsMod.SubAPI
import typingsJapgolly.atStorybookApi.distModulesShortcutsMod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiHasApi extends js.Object {
  var api: SubAPI
  var state: SubState
  def init(hasApi: API): Unit
}

object Anon_ApiHasApi {
  @scala.inline
  def apply(api: SubAPI, init: API => Callback, state: SubState): Anon_ApiHasApi = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookApi.atStorybookApiMod.API) => init(t0).runNow()))
    __obj.asInstanceOf[Anon_ApiHasApi]
  }
}

