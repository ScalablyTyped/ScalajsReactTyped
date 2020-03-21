package typingsJapgolly.node.dgramMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.dnsMod.LookupOneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  /**
    * @default false
    */
  var ipv6Only: js.UndefOr[Boolean] = js.undefined
  var lookup: js.UndefOr[
    js.Function3[
      /* hostname */ String, 
      /* options */ LookupOneOptions, 
      /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit], 
      Unit
    ]
  ] = js.undefined
  var recvBufferSize: js.UndefOr[Double] = js.undefined
  var reuseAddr: js.UndefOr[Boolean] = js.undefined
  var sendBufferSize: js.UndefOr[Double] = js.undefined
  var `type`: SocketType
}

object SocketOptions {
  @scala.inline
  def apply(
    `type`: SocketType,
    ipv6Only: js.UndefOr[Boolean] = js.undefined,
    lookup: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Callback = null,
    recvBufferSize: Int | Double = null,
    reuseAddr: js.UndefOr[Boolean] = js.undefined,
    sendBufferSize: Int | Double = null
  ): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(ipv6Only)) __obj.updateDynamic("ipv6Only")(ipv6Only.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(js.Any.fromFunction3((t0: /* hostname */ java.lang.String, t1: /* options */ typingsJapgolly.node.dnsMod.LookupOneOptions, t2: /* callback */ js.Function3[
  /* err */ typingsJapgolly.node.NodeJS.ErrnoException | scala.Null, 
  /* address */ java.lang.String, 
  /* family */ scala.Double, 
  scala.Unit]) => lookup(t0, t1, t2).runNow()))
    if (recvBufferSize != null) __obj.updateDynamic("recvBufferSize")(recvBufferSize.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseAddr)) __obj.updateDynamic("reuseAddr")(reuseAddr.asInstanceOf[js.Any])
    if (sendBufferSize != null) __obj.updateDynamic("sendBufferSize")(sendBufferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketOptions]
  }
}

