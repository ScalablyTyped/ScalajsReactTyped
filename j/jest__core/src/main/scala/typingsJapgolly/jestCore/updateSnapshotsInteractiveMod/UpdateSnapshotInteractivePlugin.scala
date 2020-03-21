package typingsJapgolly.jestCore.updateSnapshotsInteractiveMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestCore.AnonKey
import typingsJapgolly.jestCore.jestCoreBooleans.`true`
import typingsJapgolly.jestTestResult.typesMod.AggregatedResult
import typingsJapgolly.jestTestResult.typesMod.AssertionLocation
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseWatchPlugin * / any */ trait UpdateSnapshotInteractivePlugin extends js.Object {
  var _failedSnapshotTestAssertions: js.Any
  var _snapshotInteractiveMode: js.Any
  var isInternal: `true`
  @JSName("apply")
  def apply(
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any
  ): Unit
  def getFailedSnapshotTestAssertions(testResults: AggregatedResult): js.Array[AssertionLocation]
  def getUsageInfo(): AnonKey | Null
  def onKey(key: String): Unit
  def run(_globalConfig: GlobalConfig, updateConfigAndRun: js.Function): js.Promise[Unit]
}

object UpdateSnapshotInteractivePlugin {
  @scala.inline
  def apply(
    _failedSnapshotTestAssertions: js.Any,
    _snapshotInteractiveMode: js.Any,
    apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any => Callback,
    getFailedSnapshotTestAssertions: AggregatedResult => CallbackTo[js.Array[AssertionLocation]],
    getUsageInfo: CallbackTo[AnonKey | Null],
    isInternal: `true`,
    onKey: String => Callback,
    run: (GlobalConfig, js.Function) => CallbackTo[js.Promise[Unit]]
  ): UpdateSnapshotInteractivePlugin = {
    val __obj = js.Dynamic.literal(_failedSnapshotTestAssertions = _failedSnapshotTestAssertions.asInstanceOf[js.Any], _snapshotInteractiveMode = _snapshotInteractiveMode.asInstanceOf[js.Any], isInternal = isInternal.asInstanceOf[js.Any])
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any) => apply(t0).runNow()))
    __obj.updateDynamic("getFailedSnapshotTestAssertions")(js.Any.fromFunction1((t0: typingsJapgolly.jestTestResult.typesMod.AggregatedResult) => getFailedSnapshotTestAssertions(t0).runNow()))
    __obj.updateDynamic("getUsageInfo")(getUsageInfo.toJsFn)
    __obj.updateDynamic("onKey")(js.Any.fromFunction1((t0: java.lang.String) => onKey(t0).runNow()))
    __obj.updateDynamic("run")(js.Any.fromFunction2((t0: typingsJapgolly.jestTypes.configMod.GlobalConfig, t1: js.Function) => run(t0, t1).runNow()))
    __obj.asInstanceOf[UpdateSnapshotInteractivePlugin]
  }
}

