package typingsJapgolly.sharedworker.SharedWorker

import org.scalajs.dom.raw.ErrorEvent
import typingsJapgolly.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractWorker extends EventTarget {
  def onerror(ev: ErrorEvent): js.Any = js.native
}

