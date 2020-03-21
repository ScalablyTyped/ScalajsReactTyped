package typingsJapgolly.aframe.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Behavior extends js.Object {
  def tick(): Unit
}

object Behavior {
  @scala.inline
  def apply(tick: Callback): Behavior = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tick")(tick.toJsFn)
    __obj.asInstanceOf[Behavior]
  }
}

