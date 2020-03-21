package typingsJapgolly.reactLazylog.scrollFollowMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactLazylog.AnonClientHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollFollowRenderProps extends js.Object {
  var follow: Boolean
  def onScroll(args: AnonClientHeight): Unit
  def startFollowing(): Unit
  def stopFollowing(): Unit
}

object ScrollFollowRenderProps {
  @scala.inline
  def apply(
    follow: Boolean,
    onScroll: AnonClientHeight => Callback,
    startFollowing: Callback,
    stopFollowing: Callback
  ): ScrollFollowRenderProps = {
    val __obj = js.Dynamic.literal(follow = follow.asInstanceOf[js.Any])
    __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: typingsJapgolly.reactLazylog.AnonClientHeight) => onScroll(t0).runNow()))
    __obj.updateDynamic("startFollowing")(startFollowing.toJsFn)
    __obj.updateDynamic("stopFollowing")(stopFollowing.toJsFn)
    __obj.asInstanceOf[ScrollFollowRenderProps]
  }
}

