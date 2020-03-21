package typingsJapgolly.walk.mod

import typingsJapgolly.walk.walkStrings.end
import typingsJapgolly.walk.walkStrings.names
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Walker extends js.Object {
  def on(event: WalkStatArrayEvent, cb: WalkStatArrayEventCallback): Unit = js.native
  def on(event: WalkStatEvent, cb: WalkStatEventCallback): Unit = js.native
  @JSName("on")
  def on_end(event: end, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_names(event: names, cb: WalkNamesEventCallback): Unit = js.native
  def pause(): Unit = js.native
  def resume(): Unit = js.native
}

