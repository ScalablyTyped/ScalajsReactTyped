package typingsJapgolly.jestCore.testNamePatternMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestCore.AnonKey
import typingsJapgolly.jestCore.jestCoreBooleans.`true`
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseWatchPlugin * / any */ trait TestNamePatternPlugin extends js.Object {
  var _prompt: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Prompt */ js.Any
  var isInternal: `true`
  def getUsageInfo(): AnonKey
  def onKey(key: String): Unit
  def run(
    globalConfig: GlobalConfig,
    updateConfigAndRun: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any
  ): js.Promise[Unit]
}

object TestNamePatternPlugin {
  @scala.inline
  def apply(
    _prompt: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Prompt */ js.Any,
    getUsageInfo: CallbackTo[AnonKey],
    isInternal: `true`,
    onKey: String => Callback,
    run: (GlobalConfig, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any) => CallbackTo[js.Promise[Unit]]
  ): TestNamePatternPlugin = {
    val __obj = js.Dynamic.literal(_prompt = _prompt.asInstanceOf[js.Any], isInternal = isInternal.asInstanceOf[js.Any])
    __obj.updateDynamic("getUsageInfo")(getUsageInfo.toJsFn)
    __obj.updateDynamic("onKey")(js.Any.fromFunction1((t0: java.lang.String) => onKey(t0).runNow()))
    __obj.updateDynamic("run")(js.Any.fromFunction2((t0: typingsJapgolly.jestTypes.configMod.GlobalConfig, t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpdateConfigCallback */ js.Any) => run(t0, t1).runNow()))
    __obj.asInstanceOf[TestNamePatternPlugin]
  }
}

