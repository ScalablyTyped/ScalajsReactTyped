package typingsJapgolly.graphqlApiKoa

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphqlApiKoa.mod.ExecuteOptions
import typingsJapgolly.koa.mod.ParameterizedContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOverride[StateT, CustomT] extends js.Object {
  var `override`: js.UndefOr[js.Function1[/* ctx */ ParameterizedContext[StateT, CustomT], ExecuteOptions]] = js.undefined
}

object AnonOverride {
  @scala.inline
  def apply[StateT, CustomT](`override`: /* ctx */ ParameterizedContext[StateT, CustomT] => CallbackTo[ExecuteOptions] = null): AnonOverride[StateT, CustomT] = {
    val __obj = js.Dynamic.literal()
    if (`override` != null) __obj.updateDynamic("override")(js.Any.fromFunction1((t0: /* ctx */ typingsJapgolly.koa.mod.ParameterizedContext[StateT, CustomT]) => `override`(t0).runNow()))
    __obj.asInstanceOf[AnonOverride[StateT, CustomT]]
  }
}

