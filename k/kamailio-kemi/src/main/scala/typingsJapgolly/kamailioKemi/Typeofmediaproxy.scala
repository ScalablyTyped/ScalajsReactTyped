package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmediaproxy extends js.Object {
  def end_media_session(): Double
  def engage_media_proxy(): Double
  def use_media_proxy(): Double
}

object Typeofmediaproxy {
  @scala.inline
  def apply(
    end_media_session: CallbackTo[Double],
    engage_media_proxy: CallbackTo[Double],
    use_media_proxy: CallbackTo[Double]
  ): Typeofmediaproxy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end_media_session")(end_media_session.toJsFn)
    __obj.updateDynamic("engage_media_proxy")(engage_media_proxy.toJsFn)
    __obj.updateDynamic("use_media_proxy")(use_media_proxy.toJsFn)
    __obj.asInstanceOf[Typeofmediaproxy]
  }
}

