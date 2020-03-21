package typingsJapgolly.easyXapiSupertest.streamMod

import typingsJapgolly.easyXapiSupertest.NodeJS.ReadableStream
import typingsJapgolly.easyXapiSupertest.NodeJS.WritableStream
import typingsJapgolly.easyXapiSupertest.eventsMod.EventEmitter
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Transform")
@js.native
class Transform ()
  extends EventEmitter
     with ReadableStream
     with WritableStream {
  def this(opts: TransformOptions) = this()
  def _flush(callback: js.Function): Unit = js.native
  def _transform(chunk: String, encoding: String, callback: js.Function): Unit = js.native
  def _transform(chunk: Buffer, encoding: String, callback: js.Function): Unit = js.native
  def push(chunk: js.Any): Boolean = js.native
  def push(chunk: js.Any, encoding: String): Boolean = js.native
}

