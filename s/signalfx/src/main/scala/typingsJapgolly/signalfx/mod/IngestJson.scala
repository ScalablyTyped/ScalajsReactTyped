package typingsJapgolly.signalfx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("signalfx", "IngestJson")
@js.native
class IngestJson protected () extends js.Object {
  def this(token: String) = this()
  def this(token: String, options: IngestOptions) = this()
  def send(report: SignalReport): Unit = js.native
}

