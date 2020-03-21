package typingsJapgolly.storybookApi

import typingsJapgolly.storybookApi.mod.API
import typingsJapgolly.storybookApi.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApi extends js.Object {
  var api: API
  var state: State
}

object AnonApi {
  @scala.inline
  def apply(api: API, state: State): AnonApi = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApi]
  }
}

