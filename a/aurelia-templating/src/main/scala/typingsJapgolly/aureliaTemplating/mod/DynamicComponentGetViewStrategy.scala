package typingsJapgolly.aureliaTemplating.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicComponentGetViewStrategy extends js.Object {
  /**
    * Implement this hook if you want to provide custom view strategy when this component is used with the compose element or the router.
    */
  def getViewStrategy(): String | ViewStrategy_
}

object DynamicComponentGetViewStrategy {
  @scala.inline
  def apply(getViewStrategy: CallbackTo[String | ViewStrategy_]): DynamicComponentGetViewStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getViewStrategy")(getViewStrategy.toJsFn)
    __obj.asInstanceOf[DynamicComponentGetViewStrategy]
  }
}

