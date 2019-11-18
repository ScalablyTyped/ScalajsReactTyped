package typingsJapgolly.node.netMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnReadOpts extends js.Object {
  var buffer: scala.scalajs.js.typedarray.Uint8Array | js.Function0[scala.scalajs.js.typedarray.Uint8Array]
  /**
    * This function is called for every chunk of incoming data.
    * Two arguments are passed to it: the number of bytes written to buffer and a reference to buffer.
    * Return false from this function to implicitly pause() the socket.
    */
  def callback(bytesWritten: Double, buf: scala.scalajs.js.typedarray.Uint8Array): Boolean
}

object OnReadOpts {
  @scala.inline
  def apply(
    buffer: scala.scalajs.js.typedarray.Uint8Array | js.Function0[scala.scalajs.js.typedarray.Uint8Array],
    callback: (Double, scala.scalajs.js.typedarray.Uint8Array) => CallbackTo[Boolean]
  ): OnReadOpts = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: scala.Double, t1: scala.scalajs.js.typedarray.Uint8Array) => callback(t0, t1).runNow()))
    __obj.asInstanceOf[OnReadOpts]
  }
}

