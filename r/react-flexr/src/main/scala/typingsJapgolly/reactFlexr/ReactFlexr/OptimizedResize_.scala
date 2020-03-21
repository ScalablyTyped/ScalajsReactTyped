package typingsJapgolly.reactFlexr.ReactFlexr

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple resize event throttler. Usefull for force updating when the
  * app have been resized. For best performance, use it in your main
  * app component in the componentDidMount life cycle.
  */
trait OptimizedResize_ extends js.Object {
  def init(callback: js.Function0[Unit]): Unit
}

object OptimizedResize_ {
  @scala.inline
  def apply(init: js.Function0[Unit] => Callback): OptimizedResize_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => init(t0).runNow()))
    __obj.asInstanceOf[OptimizedResize_]
  }
}

