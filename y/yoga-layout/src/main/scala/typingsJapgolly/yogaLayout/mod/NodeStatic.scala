package typingsJapgolly.yogaLayout.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeStatic extends js.Object {
  def create(): YogaNode
  def createDefault(): YogaNode
  def createWithConfig(config: YogaConfig): YogaNode
  def destroy(node: YogaNode): js.Any
}

object NodeStatic {
  @scala.inline
  def apply(
    create: CallbackTo[YogaNode],
    createDefault: CallbackTo[YogaNode],
    createWithConfig: YogaConfig => CallbackTo[YogaNode],
    destroy: YogaNode => CallbackTo[js.Any]
  ): NodeStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("createDefault")(createDefault.toJsFn)
    __obj.updateDynamic("createWithConfig")(js.Any.fromFunction1((t0: typingsJapgolly.yogaLayout.mod.YogaConfig) => createWithConfig(t0).runNow()))
    __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: typingsJapgolly.yogaLayout.mod.YogaNode) => destroy(t0).runNow()))
    __obj.asInstanceOf[NodeStatic]
  }
}

