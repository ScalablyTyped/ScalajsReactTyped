package typingsJapgolly.easyXapiSupertest.streamMod

import typingsJapgolly.easyXapiSupertest.NodeJS.ReadableStream
import typingsJapgolly.easyXapiSupertest.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Readable")
@js.native
class Readable ()
  extends EventEmitter
     with ReadableStream {
  def this(opts: ReadableOptions) = this()
  def _read(size: Double): Unit = js.native
  def push(chunk: js.Any): Boolean = js.native
  def push(chunk: js.Any, encoding: String): Boolean = js.native
}

