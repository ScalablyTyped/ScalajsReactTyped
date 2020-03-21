package typingsJapgolly.uirouterCore.transitionInterfaceMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionHookOptions extends js.Object {
  var bind: js.UndefOr[js.Any] = js.undefined
  var current: js.UndefOr[js.Function0[Transition]] = js.undefined
  var hookType: js.UndefOr[String] = js.undefined
  var stateHook: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[js.Any] = js.undefined
  var traceData: js.UndefOr[js.Any] = js.undefined
  var transition: js.UndefOr[Transition] = js.undefined
}

object TransitionHookOptions {
  @scala.inline
  def apply(
    bind: js.Any = null,
    current: js.UndefOr[CallbackTo[Transition]] = js.undefined,
    hookType: String = null,
    stateHook: js.UndefOr[Boolean] = js.undefined,
    target: js.Any = null,
    traceData: js.Any = null,
    transition: Transition = null
  ): TransitionHookOptions = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    current.foreach(p => __obj.updateDynamic("current")(p.toJsFn))
    if (hookType != null) __obj.updateDynamic("hookType")(hookType.asInstanceOf[js.Any])
    if (!js.isUndefined(stateHook)) __obj.updateDynamic("stateHook")(stateHook.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (traceData != null) __obj.updateDynamic("traceData")(traceData.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionHookOptions]
  }
}

