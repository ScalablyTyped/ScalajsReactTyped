package typingsJapgolly.yogaLayout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigStatic extends js.Object {
  def create(): YogaConfig
  def destroy(config: YogaConfig): js.Any
}

object ConfigStatic {
  @scala.inline
  def apply(create: CallbackTo[YogaConfig], destroy: YogaConfig => CallbackTo[js.Any]): ConfigStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: typingsJapgolly.yogaLayout.mod.YogaConfig) => destroy(t0).runNow()))
    __obj.asInstanceOf[ConfigStatic]
  }
}

