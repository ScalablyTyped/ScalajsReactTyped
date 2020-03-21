package typingsJapgolly.each

import typingsJapgolly.each.eachStrings.both
import typingsJapgolly.each.eachStrings.end
import typingsJapgolly.each.eachStrings.error
import typingsJapgolly.each.eachStrings.item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Each_ extends js.Object {
  var done: Double = js.native
  var paused: Boolean = js.native
  var readable: Boolean = js.native
  var started: Double = js.native
  var total: Double = js.native
  def end(): Each_ = js.native
  def files(base: js.Any, glob: js.Any): Unit = js.native
  def files(glob: js.Any): Unit = js.native
  def on(eventName: String, onCallback: js.Function): Each_ = js.native
  @JSName("on")
  def on_both(eventName: both, onBoth: js.Function1[/* error */ js.UndefOr[js.Array[js.Error]], Unit]): Each_ = js.native
  @JSName("on")
  def on_end(eventName: end, onEnd: js.Function0[Unit]): Each_ = js.native
  @JSName("on")
  def on_error(
    eventName: error,
    onError: js.Function1[(/* error */ js.Array[js.Error]) | (/* error */ js.Error), Unit]
  ): Each_ = js.native
  @JSName("on")
  def on_item(
    eventName: item,
    onItem: js.Function2[
      /* item */ js.Any, 
      /* next */ js.Function1[/* error */ js.UndefOr[js.Error], Unit], 
      Unit
    ]
  ): Each_ = js.native
  def parallel(mode: Boolean): Each_ = js.native
  def parallel(mode: Double): Each_ = js.native
  def repeat(): Each_ = js.native
  def shift(items: js.Array[_]): Unit = js.native
  def sync(): Each_ = js.native
  def times(): Each_ = js.native
  def unshift(items: js.Array[_]): Unit = js.native
  def write(items: js.Array[_]): Unit = js.native
}

