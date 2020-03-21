package typingsJapgolly.wiiu.wiiu

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageView_ extends js.Object {
  var viewMode: Double
  def end(): Boolean
  def getErrorCode(): Double
}

object ImageView_ {
  @scala.inline
  def apply(end: CallbackTo[Boolean], getErrorCode: CallbackTo[Double], viewMode: Double): ImageView_ = {
    val __obj = js.Dynamic.literal(viewMode = viewMode.asInstanceOf[js.Any])
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("getErrorCode")(getErrorCode.toJsFn)
    __obj.asInstanceOf[ImageView_]
  }
}

