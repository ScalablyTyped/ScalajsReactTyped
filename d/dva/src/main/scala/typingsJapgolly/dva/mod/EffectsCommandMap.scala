package typingsJapgolly.dva.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.redux.mod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectsCommandMap
  extends /* key */ StringDictionary[js.Any] {
  var call: js.Function
  var cancel: js.Function
  var select: js.Function
  var take: js.Function
  def put[A /* <: AnyAction */](action: A): js.Any
}

object EffectsCommandMap {
  @scala.inline
  def apply(
    call: js.Function,
    cancel: js.Function,
    put: js.Any => CallbackTo[js.Any],
    select: js.Function,
    take: js.Function,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): EffectsCommandMap = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], take = take.asInstanceOf[js.Any])
    __obj.updateDynamic("put")(js.Any.fromFunction1((t0: js.Any) => put(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[EffectsCommandMap]
  }
}

