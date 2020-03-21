package typingsJapgolly.tensorflowTfjsCore.environmentMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagRegistryEntry extends js.Object {
  var setHook: js.UndefOr[js.Function1[/* value */ FlagValue, Unit]] = js.undefined
  def evaluationFn(): FlagValue
}

object FlagRegistryEntry {
  @scala.inline
  def apply(evaluationFn: CallbackTo[FlagValue], setHook: /* value */ FlagValue => Callback = null): FlagRegistryEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("evaluationFn")(evaluationFn.toJsFn)
    if (setHook != null) __obj.updateDynamic("setHook")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.tensorflowTfjsCore.environmentMod.FlagValue) => setHook(t0).runNow()))
    __obj.asInstanceOf[FlagRegistryEntry]
  }
}

