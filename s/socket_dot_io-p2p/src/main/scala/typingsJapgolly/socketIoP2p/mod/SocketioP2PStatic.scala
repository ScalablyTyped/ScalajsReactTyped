package typingsJapgolly.socketIoP2p.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates the P2P object
  * @param socket Socket.io socket
  * @param opts Object of viable options
  * @param cb Optional callback
  */
trait SocketioP2PStatic extends js.Object {
  var decoder: js.Any
  var defaultOps: DefaultOps
  var numConnectedClients: Double
  var opts: P2POptions
  var peerOpts: PeerOpts
  var socket: js.Any
  var usePeerConnection: Boolean
  var useSockets: Boolean
  def binarySlice(arr: js.Array[_], interval: Double, cb: js.Function0[Unit]): Unit
  def cb(): Unit
  def disconnect(): Unit
  def emit(eventName: js.Any, data: js.Any): Unit
  def on(event: String, callback: js.Function1[/* data */ js.Any, Unit]): Unit
  def setupPeerEvents(peer: js.Any): Unit
  /**
    * Upgrade the connection to p2p
    */
  def upgrade(): Unit
}

object SocketioP2PStatic {
  @scala.inline
  def apply(
    binarySlice: (js.Array[js.Any], Double, js.Function0[Unit]) => Callback,
    cb: Callback,
    decoder: js.Any,
    defaultOps: DefaultOps,
    disconnect: Callback,
    emit: (js.Any, js.Any) => Callback,
    numConnectedClients: Double,
    on: (String, js.Function1[/* data */ js.Any, Unit]) => Callback,
    opts: P2POptions,
    peerOpts: PeerOpts,
    setupPeerEvents: js.Any => Callback,
    socket: js.Any,
    upgrade: Callback,
    usePeerConnection: Boolean,
    useSockets: Boolean
  ): SocketioP2PStatic = {
    val __obj = js.Dynamic.literal(decoder = decoder.asInstanceOf[js.Any], defaultOps = defaultOps.asInstanceOf[js.Any], numConnectedClients = numConnectedClients.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], peerOpts = peerOpts.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], usePeerConnection = usePeerConnection.asInstanceOf[js.Any], useSockets = useSockets.asInstanceOf[js.Any])
    __obj.updateDynamic("binarySlice")(js.Any.fromFunction3((t0: js.Array[js.Any], t1: scala.Double, t2: js.Function0[scala.Unit]) => binarySlice(t0, t1, t2).runNow()))
    __obj.updateDynamic("cb")(cb.toJsFn)
    __obj.updateDynamic("disconnect")(disconnect.toJsFn)
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => emit(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* data */ js.Any, scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("setupPeerEvents")(js.Any.fromFunction1((t0: js.Any) => setupPeerEvents(t0).runNow()))
    __obj.updateDynamic("upgrade")(upgrade.toJsFn)
    __obj.asInstanceOf[SocketioP2PStatic]
  }
}

