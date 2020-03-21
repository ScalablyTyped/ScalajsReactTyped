package typingsJapgolly.thenEos

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("then-eos", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(stream: Stream): js.Promise[Unit] = js.native
  type Stream = ReadableStream | WritableStream
}

