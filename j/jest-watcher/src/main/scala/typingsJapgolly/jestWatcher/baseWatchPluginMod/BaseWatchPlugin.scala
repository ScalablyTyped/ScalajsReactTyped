package typingsJapgolly.jestWatcher.baseWatchPluginMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import typingsJapgolly.jestWatcher.typesMod.JestHookSubscriber
import typingsJapgolly.jestWatcher.typesMod.UpdateConfigCallback
import typingsJapgolly.jestWatcher.typesMod.UsageData
import typingsJapgolly.jestWatcher.typesMod.WatchPlugin
import typingsJapgolly.node.processMod._Global_.NodeJS.ReadStream
import typingsJapgolly.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseWatchPlugin extends WatchPlugin {
  var _stdin: ReadStream
  var _stdout: WriteStream
  @JSName("apply")
  def apply_MBaseWatchPlugin(_hooks: JestHookSubscriber): Unit
  @JSName("getUsageInfo")
  def getUsageInfo_MBaseWatchPlugin(_globalConfig: GlobalConfig): UsageData | Null
  @JSName("onKey")
  def onKey_MBaseWatchPlugin(_key: String): Unit
  @JSName("run")
  def run_MBaseWatchPlugin(_globalConfig: GlobalConfig, _updateConfigAndRun: UpdateConfigCallback): js.Promise[Unit | Boolean]
}

object BaseWatchPlugin {
  @scala.inline
  def apply(
    _stdin: ReadStream,
    _stdout: WriteStream,
    apply: JestHookSubscriber => Callback,
    getUsageInfo: GlobalConfig => CallbackTo[UsageData | Null],
    onKey: String => Callback,
    run: (GlobalConfig, UpdateConfigCallback) => CallbackTo[js.Promise[Unit | Boolean]],
    isInternal: js.UndefOr[Boolean] = js.undefined
  ): BaseWatchPlugin = {
    val __obj = js.Dynamic.literal(_stdin = _stdin.asInstanceOf[js.Any], _stdout = _stdout.asInstanceOf[js.Any])
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: typingsJapgolly.jestWatcher.typesMod.JestHookSubscriber) => apply(t0).runNow()))
    __obj.updateDynamic("getUsageInfo")(js.Any.fromFunction1((t0: typingsJapgolly.jestTypes.configMod.GlobalConfig) => getUsageInfo(t0).runNow()))
    __obj.updateDynamic("onKey")(js.Any.fromFunction1((t0: java.lang.String) => onKey(t0).runNow()))
    __obj.updateDynamic("run")(js.Any.fromFunction2((t0: typingsJapgolly.jestTypes.configMod.GlobalConfig, t1: typingsJapgolly.jestWatcher.typesMod.UpdateConfigCallback) => run(t0, t1).runNow()))
    if (!js.isUndefined(isInternal)) __obj.updateDynamic("isInternal")(isInternal.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseWatchPlugin]
  }
}

