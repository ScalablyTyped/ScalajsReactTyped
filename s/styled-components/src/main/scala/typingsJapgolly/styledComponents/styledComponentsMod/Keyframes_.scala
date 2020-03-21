package typingsJapgolly.styledComponents.styledComponentsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyframes_ extends _InterpolationValue {
  def getName(): String
}

object Keyframes_ {
  @scala.inline
  def apply(getName: CallbackTo[String]): Keyframes_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.asInstanceOf[Keyframes_]
  }
}

