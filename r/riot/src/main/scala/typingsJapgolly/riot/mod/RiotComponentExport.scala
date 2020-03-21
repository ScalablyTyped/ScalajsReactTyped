package typingsJapgolly.riot.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RiotComponentExport[Props, State]
  extends /* key */ StringDictionary[js.Any] {
  // optional alias to map the children component names
  var components: js.UndefOr[StringDictionary[RiotComponentShell[Props, State]]] = js.undefined
  // lifecycle methods
  var onBeforeMount: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.undefined
  var onBeforeUnmount: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.undefined
  var onBeforeUpdate: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.undefined
  var onMounted: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.undefined
  var onUnmounted: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.undefined
  var onUpdated: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.undefined
  // state handling methods
  var shouldUpdate: js.UndefOr[js.Function2[/* newProps */ Props, /* currentProps */ Props, Boolean]] = js.undefined
  // optional on the component object
  var state: js.UndefOr[State] = js.undefined
}

object RiotComponentExport {
  @scala.inline
  def apply[Props, State](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    components: StringDictionary[RiotComponentShell[Props, State]] = null,
    onBeforeMount: (/* currentProps */ Props, /* currentState */ State) => Callback = null,
    onBeforeUnmount: (/* currentProps */ Props, /* currentState */ State) => Callback = null,
    onBeforeUpdate: (/* currentProps */ Props, /* currentState */ State) => Callback = null,
    onMounted: (/* currentProps */ Props, /* currentState */ State) => Callback = null,
    onUnmounted: (/* currentProps */ Props, /* currentState */ State) => Callback = null,
    onUpdated: (/* currentProps */ Props, /* currentState */ State) => Callback = null,
    shouldUpdate: (/* newProps */ Props, /* currentProps */ Props) => CallbackTo[Boolean] = null,
    state: State = null
  ): RiotComponentExport[Props, State] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (onBeforeMount != null) __obj.updateDynamic("onBeforeMount")(js.Any.fromFunction2((t0: /* currentProps */ Props, t1: /* currentState */ State) => onBeforeMount(t0, t1).runNow()))
    if (onBeforeUnmount != null) __obj.updateDynamic("onBeforeUnmount")(js.Any.fromFunction2((t0: /* currentProps */ Props, t1: /* currentState */ State) => onBeforeUnmount(t0, t1).runNow()))
    if (onBeforeUpdate != null) __obj.updateDynamic("onBeforeUpdate")(js.Any.fromFunction2((t0: /* currentProps */ Props, t1: /* currentState */ State) => onBeforeUpdate(t0, t1).runNow()))
    if (onMounted != null) __obj.updateDynamic("onMounted")(js.Any.fromFunction2((t0: /* currentProps */ Props, t1: /* currentState */ State) => onMounted(t0, t1).runNow()))
    if (onUnmounted != null) __obj.updateDynamic("onUnmounted")(js.Any.fromFunction2((t0: /* currentProps */ Props, t1: /* currentState */ State) => onUnmounted(t0, t1).runNow()))
    if (onUpdated != null) __obj.updateDynamic("onUpdated")(js.Any.fromFunction2((t0: /* currentProps */ Props, t1: /* currentState */ State) => onUpdated(t0, t1).runNow()))
    if (shouldUpdate != null) __obj.updateDynamic("shouldUpdate")(js.Any.fromFunction2((t0: /* newProps */ Props, t1: /* currentProps */ Props) => shouldUpdate(t0, t1).runNow()))
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiotComponentExport[Props, State]]
  }
}

