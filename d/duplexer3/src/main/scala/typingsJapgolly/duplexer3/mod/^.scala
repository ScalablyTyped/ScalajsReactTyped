package typingsJapgolly.duplexer3.mod

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("duplexer3", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: Options, writableStream: WritableStream, readableStream: ReadableStream): Duplex = js.native
  def apply(writableStream: WritableStream, readableStream: ReadableStream): Duplex = js.native
}

