package typingsJapgolly.tress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TressJob extends js.Object {
  @JSName("callback")
  var callback_Original: TressJobCallback = js.native
  var data: TressJobData = js.native
  def callback(args: js.Any*): Unit = js.native
}

