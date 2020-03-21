package typingsJapgolly.amqpRpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amqp-rpc", "amqpRPC")
@js.native
class amqpRPC () extends js.Object {
  def this(opt: Options) = this()
  def call[T](cmd: String, params: T): String = js.native
  def call[T](cmd: String, params: T, cb: Callback): String = js.native
  def call[T](cmd: String, params: T, cb: Callback, context: js.Any): String = js.native
  def call[T](cmd: String, params: T, cb: Callback, context: js.Any, options: CallOptions): String = js.native
  def callBroadcast[T](cmd: String, params: T): Unit = js.native
  def callBroadcast[T](cmd: String, params: T, options: BroadcastOptions): Unit = js.native
  def disconnect(): Unit = js.native
  def generateQueueName(`type`: String): String = js.native
  def off(cmd: String): Boolean = js.native
  def offBroadcast(cmd: String): Boolean = js.native
  def on[T](
    cmd: String,
    cb: js.Function3[
      /* param */ js.UndefOr[T], 
      /* cb */ js.UndefOr[Callback], 
      /* info */ js.UndefOr[CommandInfo], 
      Unit
    ]
  ): Boolean = js.native
  def on[T](
    cmd: String,
    cb: js.Function3[
      /* param */ js.UndefOr[T], 
      /* cb */ js.UndefOr[Callback], 
      /* info */ js.UndefOr[CommandInfo], 
      Unit
    ],
    context: js.Any
  ): Boolean = js.native
  def on[T](
    cmd: String,
    cb: js.Function3[
      /* param */ js.UndefOr[T], 
      /* cb */ js.UndefOr[Callback], 
      /* info */ js.UndefOr[CommandInfo], 
      Unit
    ],
    context: js.Any,
    options: HandlerOptions
  ): Boolean = js.native
  def onBroadcast[T](cmd: String): Boolean = js.native
  def onBroadcast[T](
    cmd: String,
    cb: js.Function2[/* params */ js.UndefOr[T], /* cb */ js.UndefOr[CallbackWithError], Unit]
  ): Boolean = js.native
  def onBroadcast[T](
    cmd: String,
    cb: js.Function2[/* params */ js.UndefOr[T], /* cb */ js.UndefOr[CallbackWithError], Unit],
    context: js.Any
  ): Boolean = js.native
  def onBroadcast[T](
    cmd: String,
    cb: js.Function2[/* params */ js.UndefOr[T], /* cb */ js.UndefOr[CallbackWithError], Unit],
    context: js.Any,
    options: js.Any
  ): Boolean = js.native
}

