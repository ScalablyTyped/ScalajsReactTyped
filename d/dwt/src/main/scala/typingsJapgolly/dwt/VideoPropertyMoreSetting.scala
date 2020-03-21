package typingsJapgolly.dwt

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPropertyMoreSetting extends js.Object {
  def GetDefaultValue(): Double
  def GetIfAuto(): Boolean
  def GetMaxValue(): Double
  def GetMinValue(): Double
  def GetSteppingDelta(): Double
}

object VideoPropertyMoreSetting {
  @scala.inline
  def apply(
    GetDefaultValue: CallbackTo[Double],
    GetIfAuto: CallbackTo[Boolean],
    GetMaxValue: CallbackTo[Double],
    GetMinValue: CallbackTo[Double],
    GetSteppingDelta: CallbackTo[Double]
  ): VideoPropertyMoreSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetDefaultValue")(GetDefaultValue.toJsFn)
    __obj.updateDynamic("GetIfAuto")(GetIfAuto.toJsFn)
    __obj.updateDynamic("GetMaxValue")(GetMaxValue.toJsFn)
    __obj.updateDynamic("GetMinValue")(GetMinValue.toJsFn)
    __obj.updateDynamic("GetSteppingDelta")(GetSteppingDelta.toJsFn)
    __obj.asInstanceOf[VideoPropertyMoreSetting]
  }
}

