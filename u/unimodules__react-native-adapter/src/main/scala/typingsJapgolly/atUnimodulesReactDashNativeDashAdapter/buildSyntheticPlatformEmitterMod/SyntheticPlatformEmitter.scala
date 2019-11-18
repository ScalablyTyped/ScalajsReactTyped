package typingsJapgolly.atUnimodulesReactDashNativeDashAdapter.buildSyntheticPlatformEmitterMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntheticPlatformEmitter extends js.Object {
  var _emitter: js.Any
  def emit(eventName: String, props: js.Any): Unit
}

object SyntheticPlatformEmitter {
  @scala.inline
  def apply(_emitter: js.Any, emit: (String, js.Any) => Callback): SyntheticPlatformEmitter = {
    val __obj = js.Dynamic.literal(_emitter = _emitter.asInstanceOf[js.Any])
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => emit(t0, t1).runNow()))
    __obj.asInstanceOf[SyntheticPlatformEmitter]
  }
}

