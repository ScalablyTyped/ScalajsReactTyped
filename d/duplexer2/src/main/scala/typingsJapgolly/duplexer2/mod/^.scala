package typingsJapgolly.duplexer2.mod

import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("duplexer2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: Duplexer2Options, writable: WritableStream, readable: ReadableStream): ReadWriteStream = js.native
  def apply(writable: WritableStream, readable: ReadableStream): ReadWriteStream = js.native
}

