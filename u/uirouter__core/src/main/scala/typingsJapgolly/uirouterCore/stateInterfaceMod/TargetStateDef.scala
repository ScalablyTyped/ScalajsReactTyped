package typingsJapgolly.uirouterCore.stateInterfaceMod

import typingsJapgolly.uirouterCore.paramsInterfaceMod.RawParams
import typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetStateDef extends js.Object {
  var options: js.UndefOr[TransitionOptions] = js.undefined
  var params: js.UndefOr[RawParams] = js.undefined
  var state: StateOrName
}

object TargetStateDef {
  @scala.inline
  def apply(state: StateOrName, options: TransitionOptions = null, params: RawParams = null): TargetStateDef = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetStateDef]
  }
}

