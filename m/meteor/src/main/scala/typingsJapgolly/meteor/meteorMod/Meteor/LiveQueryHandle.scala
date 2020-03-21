package typingsJapgolly.meteor.meteorMod.Meteor

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveQueryHandle extends js.Object {
  def stop(): Unit
}

object LiveQueryHandle {
  @scala.inline
  def apply(stop: Callback): LiveQueryHandle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[LiveQueryHandle]
  }
}

