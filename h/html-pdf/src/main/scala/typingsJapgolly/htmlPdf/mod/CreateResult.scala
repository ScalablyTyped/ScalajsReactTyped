package typingsJapgolly.htmlPdf.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.fsMod.ReadStream
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResult extends js.Object {
  def toBuffer(callback: js.Function2[/* err */ js.Error, /* buffer */ Buffer, Unit]): Unit = js.native
  def toFile(): Unit = js.native
  def toFile(callback: js.Function2[/* err */ Error, /* res */ FileInfo, Unit]): Unit = js.native
  def toFile(filename: String): Unit = js.native
  def toFile(filename: String, callback: js.Function2[/* err */ js.Error, /* res */ FileInfo, Unit]): Unit = js.native
  def toStream(callback: js.Function2[/* err */ js.Error, /* stream */ ReadStream, Unit]): Unit = js.native
}

