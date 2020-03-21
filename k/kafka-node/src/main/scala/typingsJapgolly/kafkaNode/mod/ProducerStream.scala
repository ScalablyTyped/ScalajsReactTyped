package typingsJapgolly.kafkaNode.mod

import typingsJapgolly.kafkaNode.kafkaNodeStrings.buffer
import typingsJapgolly.kafkaNode.kafkaNodeStrings.utf8
import typingsJapgolly.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "ProducerStream")
@js.native
class ProducerStream () extends Writable {
  def this(options: ProducerStreamOptions) = this()
  @JSName("_write")
  def _write_buffer(
    message: ProduceRequest,
    encoding: buffer,
    cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]
  ): Unit = js.native
  @JSName("_write")
  def _write_utf8(
    message: ProduceRequest,
    encoding: utf8,
    cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]
  ): Unit = js.native
  @JSName("_writev")
  def _writev_MProducerStream(chunks: js.Array[Chunk], cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
  def close(): Unit = js.native
  def close(cb: js.Function0[_]): Unit = js.native
  def sendPayload(payloads: js.Array[ProduceRequest], cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
}

