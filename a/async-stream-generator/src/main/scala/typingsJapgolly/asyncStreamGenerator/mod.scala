package typingsJapgolly.asyncStreamGenerator

import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-stream-generator", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(generator: AsyncIterableIterator[_]): Readable = js.native
}

