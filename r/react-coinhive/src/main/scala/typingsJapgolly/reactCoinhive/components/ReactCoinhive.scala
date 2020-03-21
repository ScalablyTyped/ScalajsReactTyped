package typingsJapgolly.reactCoinhive.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCoinhive.mod.CoinHiveProps
import typingsJapgolly.reactCoinhive.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCoinhive {
  def apply(
    siteKey: String,
    autoThreads: js.UndefOr[Boolean] = js.undefined,
    onInit: /* callback */ js.Any => Callback = null,
    onStart: /* callback */ js.Any => Callback = null,
    onStop: /* callback */ js.Any => Callback = null,
    run: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    threads: Int | Double = null,
    throttle: Int | Double = null,
    userName: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CoinHiveProps, default, Unit, CoinHiveProps] = {
    val __obj = js.Dynamic.literal(siteKey = siteKey.asInstanceOf[js.Any])
  
      if (!js.isUndefined(autoThreads)) __obj.updateDynamic("autoThreads")(autoThreads.asInstanceOf[js.Any])
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction1((t0: /* callback */ js.Any) => onInit(t0).runNow()))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1((t0: /* callback */ js.Any) => onStart(t0).runNow()))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1((t0: /* callback */ js.Any) => onStop(t0).runNow()))
    if (!js.isUndefined(run)) __obj.updateDynamic("run")(run.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCoinhive.mod.CoinHiveProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactCoinhive.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCoinhive.mod.CoinHiveProps])(children: _*)
  }
  @JSImport("react-coinhive", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

