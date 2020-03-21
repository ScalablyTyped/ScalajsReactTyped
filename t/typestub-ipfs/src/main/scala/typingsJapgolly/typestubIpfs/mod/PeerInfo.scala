package typingsJapgolly.typestubIpfs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerInfo extends js.Object {
  var id: PeerId
  var multiaddr: Multiaddr
  var multiaddrs: js.Array[Multiaddr]
  def distinctMultiaddr(): js.Array[Multiaddr]
}

object PeerInfo {
  @scala.inline
  def apply(
    distinctMultiaddr: CallbackTo[js.Array[Multiaddr]],
    id: PeerId,
    multiaddr: Multiaddr,
    multiaddrs: js.Array[Multiaddr]
  ): PeerInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], multiaddr = multiaddr.asInstanceOf[js.Any], multiaddrs = multiaddrs.asInstanceOf[js.Any])
    __obj.updateDynamic("distinctMultiaddr")(distinctMultiaddr.toJsFn)
    __obj.asInstanceOf[PeerInfo]
  }
}

