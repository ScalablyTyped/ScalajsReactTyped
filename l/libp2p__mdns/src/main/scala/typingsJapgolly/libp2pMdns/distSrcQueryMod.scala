package typingsJapgolly.libp2pMdns

import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.libp2pInterfacePeerInfo.mod.PeerInfo
import typingsJapgolly.multicastDns.mod.MulticastDNS
import typingsJapgolly.multicastDns.mod.QueryPacket
import typingsJapgolly.multicastDns.mod.ResponsePacket
import typingsJapgolly.multiformatsMultiaddr.mod.Multiaddr_
import typingsJapgolly.node.timersMod.global.NodeJS.Timer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueryMod {
  
  @JSImport("@libp2p/mdns/dist/src/query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gotQuery(
    qry: QueryPacket,
    mdns: MulticastDNS,
    peerId: PeerId,
    multiaddrs: js.Array[Multiaddr_],
    serviceTag: String,
    broadcast: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gotQuery")(qry.asInstanceOf[js.Any], mdns.asInstanceOf[js.Any], peerId.asInstanceOf[js.Any], multiaddrs.asInstanceOf[js.Any], serviceTag.asInstanceOf[js.Any], broadcast.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def gotResponse(rsp: ResponsePacket, localPeerId: PeerId, serviceTag: String): js.UndefOr[PeerInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("gotResponse")(rsp.asInstanceOf[js.Any], localPeerId.asInstanceOf[js.Any], serviceTag.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[PeerInfo]]
  
  inline def queryLAN(mdns: MulticastDNS, serviceTag: String, interval: Double): Timer = (^.asInstanceOf[js.Dynamic].applyDynamic("queryLAN")(mdns.asInstanceOf[js.Any], serviceTag.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Timer]
}
