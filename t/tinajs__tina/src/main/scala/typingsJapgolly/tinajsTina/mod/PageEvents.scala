package typingsJapgolly.tinajsTina.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageEvents extends js.Object {
  def onPageScroll(event: Page): Unit
  def onPullDownRefresh(event: Page): Unit
  def onReachBottom(event: Page): Unit
  def onShareAppMessage(event: Page): Unit
}

object PageEvents {
  @scala.inline
  def apply(
    onPageScroll: Page => Callback,
    onPullDownRefresh: Page => Callback,
    onReachBottom: Page => Callback,
    onShareAppMessage: Page => Callback
  ): PageEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onPageScroll")(js.Any.fromFunction1((t0: typingsJapgolly.tinajsTina.mod.Page) => onPageScroll(t0).runNow()))
    __obj.updateDynamic("onPullDownRefresh")(js.Any.fromFunction1((t0: typingsJapgolly.tinajsTina.mod.Page) => onPullDownRefresh(t0).runNow()))
    __obj.updateDynamic("onReachBottom")(js.Any.fromFunction1((t0: typingsJapgolly.tinajsTina.mod.Page) => onReachBottom(t0).runNow()))
    __obj.updateDynamic("onShareAppMessage")(js.Any.fromFunction1((t0: typingsJapgolly.tinajsTina.mod.Page) => onShareAppMessage(t0).runNow()))
    __obj.asInstanceOf[PageEvents]
  }
}

