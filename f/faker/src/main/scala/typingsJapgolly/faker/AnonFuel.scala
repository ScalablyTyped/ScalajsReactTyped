package typingsJapgolly.faker

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFuel extends js.Object {
  def color(): String
  def fuel(): String
  def manufacturer(): String
  def model(): String
  def `type`(): String
  def vehicle(): String
  def vin(): String
}

object AnonFuel {
  @scala.inline
  def apply(
    color: CallbackTo[String],
    fuel: CallbackTo[String],
    manufacturer: CallbackTo[String],
    model: CallbackTo[String],
    `type`: CallbackTo[String],
    vehicle: CallbackTo[String],
    vin: CallbackTo[String]
  ): AnonFuel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color.toJsFn)
    __obj.updateDynamic("fuel")(fuel.toJsFn)
    __obj.updateDynamic("manufacturer")(manufacturer.toJsFn)
    __obj.updateDynamic("model")(model.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.updateDynamic("vehicle")(vehicle.toJsFn)
    __obj.updateDynamic("vin")(vin.toJsFn)
    __obj.asInstanceOf[AnonFuel]
  }
}

