package typingsJapgolly.jestCore.updateSnapshotsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestCore.AnonKey
import typingsJapgolly.jestCore.jestCoreBooleans.`true`
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseWatchPlugin * / any */ trait UpdateSnapshotsPlugin extends js.Object {
  var _hasSnapshotFailure: js.Any
  var isInternal: `true`
  @JSName("apply")
  def apply(
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any
  ): Unit
  def getUsageInfo(): AnonKey | Null
  def run(
    _globalConfig: GlobalConfig,
    updateConfigAndRun: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any
  ): js.Promise[Boolean]
}

object UpdateSnapshotsPlugin {
  @scala.inline
  def apply(
    _hasSnapshotFailure: js.Any,
    apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any => Callback,
    getUsageInfo: CallbackTo[AnonKey | Null],
    isInternal: `true`,
    run: (GlobalConfig, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any) => CallbackTo[js.Promise[Boolean]]
  ): UpdateSnapshotsPlugin = {
    val __obj = js.Dynamic.literal(_hasSnapshotFailure = _hasSnapshotFailure.asInstanceOf[js.Any], isInternal = isInternal.asInstanceOf[js.Any])
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHookSubscriber */ js.Any) => apply(t0).runNow()))
    __obj.updateDynamic("getUsageInfo")(getUsageInfo.toJsFn)
    __obj.updateDynamic("run")(js.Any.fromFunction2((t0: typingsJapgolly.jestTypes.configMod.GlobalConfig, t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any) => run(t0, t1).runNow()))
    __obj.asInstanceOf[UpdateSnapshotsPlugin]
  }
}

