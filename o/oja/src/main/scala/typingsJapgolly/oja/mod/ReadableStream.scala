package typingsJapgolly.oja.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oja", "ReadableStream")
@js.native
class ReadableStream protected () extends Readable {
  def this(topic: String, emitter: EventEmitter) = this()
}

