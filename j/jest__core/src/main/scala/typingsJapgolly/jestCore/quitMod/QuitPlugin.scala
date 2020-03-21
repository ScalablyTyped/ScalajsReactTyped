package typingsJapgolly.jestCore.quitMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestCore.AnonKey
import typingsJapgolly.jestCore.jestCoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseWatchPlugin * / any */ trait QuitPlugin extends js.Object {
  var isInternal: `true`
  def getUsageInfo(): AnonKey
  def run(): js.Promise[Unit]
}

object QuitPlugin {
  @scala.inline
  def apply(getUsageInfo: CallbackTo[AnonKey], isInternal: `true`, run: CallbackTo[js.Promise[Unit]]): QuitPlugin = {
    val __obj = js.Dynamic.literal(isInternal = isInternal.asInstanceOf[js.Any])
    __obj.updateDynamic("getUsageInfo")(getUsageInfo.toJsFn)
    __obj.updateDynamic("run")(run.toJsFn)
    __obj.asInstanceOf[QuitPlugin]
  }
}

