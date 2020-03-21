package typingsJapgolly.gulpTypescript.projectMod

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompileStream
  extends ReadableStream
     with WritableStream {
  var dts: Readable = js.native
  @JSName("js")
  var js_ : Readable = js.native
}

