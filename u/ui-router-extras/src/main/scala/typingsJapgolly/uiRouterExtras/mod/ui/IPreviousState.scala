package typingsJapgolly.uiRouterExtras.mod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Previous state
  */
trait IPreviousState extends js.Object {
  var params: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IStateParamsService */ js.Any
  ] = js.undefined
  var state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ js.Any
}

object IPreviousState {
  @scala.inline
  def apply(
    state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ js.Any,
    params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IStateParamsService */ js.Any = null
  ): IPreviousState = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPreviousState]
  }
}

