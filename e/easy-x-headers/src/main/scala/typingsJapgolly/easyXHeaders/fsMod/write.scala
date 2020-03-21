package typingsJapgolly.easyXHeaders.fsMod

import typingsJapgolly.easyXHeaders.NodeJS.ErrnoException
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "write")
@js.native
object write extends js.Object {
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Unit = js.native
  def apply(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = js.native
}

