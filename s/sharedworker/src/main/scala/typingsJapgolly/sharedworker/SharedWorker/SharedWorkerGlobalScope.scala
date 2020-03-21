package typingsJapgolly.sharedworker.SharedWorker

import org.scalajs.dom.raw.MessageEvent
import typingsJapgolly.std.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorkerGlobalScope extends Worker {
  def onconnect(event: MessageEvent): Unit = js.native
}

