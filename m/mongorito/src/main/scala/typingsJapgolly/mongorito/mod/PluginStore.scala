package typingsJapgolly.mongorito.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginStore extends js.Object {
  var model: js.UndefOr[Model] = js.undefined
  var modelClass: ModelClass
  def dispatch(arg: js.Any): js.Any
  def getState(): State
}

object PluginStore {
  @scala.inline
  def apply(
    dispatch: js.Any => CallbackTo[js.Any],
    getState: CallbackTo[State],
    modelClass: ModelClass,
    model: Model = null
  ): PluginStore = {
    val __obj = js.Dynamic.literal(modelClass = modelClass.asInstanceOf[js.Any])
    __obj.updateDynamic("dispatch")(js.Any.fromFunction1((t0: js.Any) => dispatch(t0).runNow()))
    __obj.updateDynamic("getState")(getState.toJsFn)
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginStore]
  }
}

