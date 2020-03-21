package typingsJapgolly.dwt

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraControlMoreSetting extends js.Object {
  def GetDefaultValue(): Double
  def GetIfAuto(): Boolean
  def GetMaxValue(): Double
  def GetMinValue(): Double
  def GetSteppingDelta(): Double
}

object CameraControlMoreSetting {
  @scala.inline
  def apply(
    GetDefaultValue: CallbackTo[Double],
    GetIfAuto: CallbackTo[Boolean],
    GetMaxValue: CallbackTo[Double],
    GetMinValue: CallbackTo[Double],
    GetSteppingDelta: CallbackTo[Double]
  ): CameraControlMoreSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetDefaultValue")(GetDefaultValue.toJsFn)
    __obj.updateDynamic("GetIfAuto")(GetIfAuto.toJsFn)
    __obj.updateDynamic("GetMaxValue")(GetMaxValue.toJsFn)
    __obj.updateDynamic("GetMinValue")(GetMinValue.toJsFn)
    __obj.updateDynamic("GetSteppingDelta")(GetSteppingDelta.toJsFn)
    __obj.asInstanceOf[CameraControlMoreSetting]
  }
}

