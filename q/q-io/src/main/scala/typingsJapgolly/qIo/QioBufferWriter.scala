package typingsJapgolly.qIo

import typingsJapgolly.node.Buffer
import typingsJapgolly.qIo.Qio.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QioBufferWriter extends js.Object {
  var Writer: typingsJapgolly.qIo.Qio.Writer = js.native
  def apply(writer: Buffer): Writer = js.native
}

