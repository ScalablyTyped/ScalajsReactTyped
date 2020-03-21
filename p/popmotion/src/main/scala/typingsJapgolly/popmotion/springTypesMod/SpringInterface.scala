package typingsJapgolly.popmotion.springTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpringInterface extends js.Object {
  def stop(): Unit
}

object SpringInterface {
  @scala.inline
  def apply(stop: Callback): SpringInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[SpringInterface]
  }
}

