package typingsJapgolly.dwt

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPropertySetting extends js.Object {
  def GetIfAuto(): Boolean
  def GetValue(): Double
}

object VideoPropertySetting {
  @scala.inline
  def apply(GetIfAuto: CallbackTo[Boolean], GetValue: CallbackTo[Double]): VideoPropertySetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetIfAuto")(GetIfAuto.toJsFn)
    __obj.updateDynamic("GetValue")(GetValue.toJsFn)
    __obj.asInstanceOf[VideoPropertySetting]
  }
}

