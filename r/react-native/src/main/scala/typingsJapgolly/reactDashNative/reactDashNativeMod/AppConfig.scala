package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppConfig extends js.Object {
  var appKey: String
  var component: js.UndefOr[ComponentProvider] = js.undefined
  var run: js.UndefOr[Runnable] = js.undefined
}

object AppConfig {
  @scala.inline
  def apply(
    appKey: String,
    component: js.UndefOr[CallbackTo[ComponentType[js.Any]]] = js.undefined,
    run: /* appParameters */ js.Any => Callback = null
  ): AppConfig = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
    component.foreach(p => __obj.updateDynamic("component")(p.toJsFn))
    if (run != null) __obj.updateDynamic("run")(js.Any.fromFunction1((t0: /* appParameters */ js.Any) => run(t0).runNow()))
    __obj.asInstanceOf[AppConfig]
  }
}

