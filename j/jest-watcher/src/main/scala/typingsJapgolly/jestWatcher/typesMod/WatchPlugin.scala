package typingsJapgolly.jestWatcher.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchPlugin extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[js.Function1[/* hooks */ JestHookSubscriber, Unit]] = js.undefined
  var getUsageInfo: js.UndefOr[js.Function1[/* globalConfig */ GlobalConfig, UsageData | Null]] = js.undefined
  var isInternal: js.UndefOr[Boolean] = js.undefined
  var onKey: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var run: js.UndefOr[
    js.Function2[
      /* globalConfig */ GlobalConfig, 
      /* updateConfigAndRun */ UpdateConfigCallback, 
      js.Promise[Unit | Boolean]
    ]
  ] = js.undefined
}

object WatchPlugin {
  @scala.inline
  def apply(
    apply: /* hooks */ JestHookSubscriber => Callback = null,
    getUsageInfo: /* globalConfig */ GlobalConfig => CallbackTo[UsageData | Null] = null,
    isInternal: js.UndefOr[Boolean] = js.undefined,
    onKey: /* value */ String => Callback = null,
    run: (/* globalConfig */ GlobalConfig, /* updateConfigAndRun */ UpdateConfigCallback) => CallbackTo[js.Promise[Unit | Boolean]] = null
  ): WatchPlugin = {
    val __obj = js.Dynamic.literal()
    if (apply != null) __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: /* hooks */ typingsJapgolly.jestWatcher.typesMod.JestHookSubscriber) => apply(t0).runNow()))
    if (getUsageInfo != null) __obj.updateDynamic("getUsageInfo")(js.Any.fromFunction1((t0: /* globalConfig */ typingsJapgolly.jestTypes.configMod.GlobalConfig) => getUsageInfo(t0).runNow()))
    if (!js.isUndefined(isInternal)) __obj.updateDynamic("isInternal")(isInternal.asInstanceOf[js.Any])
    if (onKey != null) __obj.updateDynamic("onKey")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onKey(t0).runNow()))
    if (run != null) __obj.updateDynamic("run")(js.Any.fromFunction2((t0: /* globalConfig */ typingsJapgolly.jestTypes.configMod.GlobalConfig, t1: /* updateConfigAndRun */ typingsJapgolly.jestWatcher.typesMod.UpdateConfigCallback) => run(t0, t1).runNow()))
    __obj.asInstanceOf[WatchPlugin]
  }
}

