package typingsJapgolly.printf

import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("printf", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(format: String, args: js.Any*): String = js.native
  def apply(writeStream: WritableStream, format: String, args: js.Any*): Unit = js.native
}

