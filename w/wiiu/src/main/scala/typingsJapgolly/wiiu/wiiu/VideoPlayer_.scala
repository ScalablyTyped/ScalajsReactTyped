package typingsJapgolly.wiiu.wiiu

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPlayer_ extends js.Object {
  var viewMode: Double
  def end(): Boolean
}

object VideoPlayer_ {
  @scala.inline
  def apply(end: CallbackTo[Boolean], viewMode: Double): VideoPlayer_ = {
    val __obj = js.Dynamic.literal(viewMode = viewMode.asInstanceOf[js.Any])
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.asInstanceOf[VideoPlayer_]
  }
}

