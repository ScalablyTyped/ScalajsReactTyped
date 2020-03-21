package typingsJapgolly.easyXapiSupertest.streamMod

import typingsJapgolly.easyXapiSupertest.NodeJS.WritableStream
import typingsJapgolly.easyXapiSupertest.eventsMod.EventEmitter
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream", "Writable")
@js.native
class Writable ()
  extends EventEmitter
     with WritableStream {
  def this(opts: WritableOptions) = this()
  def _write(data: String, encoding: String, callback: js.Function): Unit = js.native
  def _write(data: Buffer, encoding: String, callback: js.Function): Unit = js.native
}

