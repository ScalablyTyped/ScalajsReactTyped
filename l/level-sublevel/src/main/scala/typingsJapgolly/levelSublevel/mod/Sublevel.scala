package typingsJapgolly.levelSublevel.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify levelup.LevelUpBase<Batch> * / any */ trait Sublevel extends js.Object {
  def pre(hook: Hook): js.Function
  def sublevel(key: String): Sublevel
}

object Sublevel {
  @scala.inline
  def apply(pre: Hook => CallbackTo[js.Function], sublevel: String => CallbackTo[Sublevel]): Sublevel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pre")(js.Any.fromFunction1((t0: typingsJapgolly.levelSublevel.mod.Hook) => pre(t0).runNow()))
    __obj.updateDynamic("sublevel")(js.Any.fromFunction1((t0: java.lang.String) => sublevel(t0).runNow()))
    __obj.asInstanceOf[Sublevel]
  }
}

