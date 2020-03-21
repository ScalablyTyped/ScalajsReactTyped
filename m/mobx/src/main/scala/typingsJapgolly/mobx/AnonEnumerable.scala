package typingsJapgolly.mobx

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mobx.coreActionMod.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnumerable extends js.Object {
  var configurable: Boolean
  var enumerable: Boolean
  var value: js.UndefOr[scala.Nothing] = js.undefined
  var writable: Boolean
  def initializer(): js.Function with IAction
}

object AnonEnumerable {
  @scala.inline
  def apply(
    configurable: Boolean,
    enumerable: Boolean,
    initializer: CallbackTo[js.Function with IAction],
    writable: Boolean,
    value: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonEnumerable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.updateDynamic("initializer")(initializer.toJsFn)
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnumerable]
  }
}

