package typingsJapgolly.ganacheCore.mod.Ganache

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Web3Provider * / any */ trait Provider extends js.Object {
  def close(callback: js.Function): Unit
}

object Provider {
  @scala.inline
  def apply(close: js.Function => Callback): Provider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(js.Any.fromFunction1((t0: js.Function) => close(t0).runNow()))
    __obj.asInstanceOf[Provider]
  }
}

