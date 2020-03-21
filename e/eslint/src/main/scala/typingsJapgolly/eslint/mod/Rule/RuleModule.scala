package typingsJapgolly.eslint.mod.Rule

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleModule extends js.Object {
  var meta: js.UndefOr[RuleMetaData] = js.undefined
  def create(context: RuleContext): RuleListener
}

object RuleModule {
  @scala.inline
  def apply(create: RuleContext => CallbackTo[RuleListener], meta: RuleMetaData = null): RuleModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.eslint.mod.Rule.RuleContext) => create(t0).runNow()))
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleModule]
  }
}

