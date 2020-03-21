package typingsJapgolly.jodata.jo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderBySettings extends ISettings {
  var DefaultOrder: String
  var DefaultProperty: String
  var Order: String
  var Property: String
}

object OrderBySettings {
  @scala.inline
  def apply(
    DefaultOrder: String,
    DefaultProperty: String,
    Order: String,
    Property: String,
    isSet: CallbackTo[Boolean],
    reset: Callback
  ): OrderBySettings = {
    val __obj = js.Dynamic.literal(DefaultOrder = DefaultOrder.asInstanceOf[js.Any], DefaultProperty = DefaultProperty.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any])
    __obj.updateDynamic("isSet")(isSet.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[OrderBySettings]
  }
}

