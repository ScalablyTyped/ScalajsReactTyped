package typingsJapgolly.graphite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphiteClient extends js.Object {
  def end(): Unit = js.native
  def write(metrics: js.Any): Unit = js.native
  def write(metrics: js.Any, callback: Callback): Unit = js.native
  def write(metrics: js.Any, timestamp: Double): Unit = js.native
  def write(metrics: js.Any, timestamp: Double, callback: Callback): Unit = js.native
  def writeTagged(metrics: js.Any, tags: js.Any): Unit = js.native
  def writeTagged(metrics: js.Any, tags: js.Any, callback: Callback): Unit = js.native
  def writeTagged(metrics: js.Any, tags: js.Any, timestamp: Double): Unit = js.native
  def writeTagged(metrics: js.Any, tags: js.Any, timestamp: Double, callback: Callback): Unit = js.native
}

