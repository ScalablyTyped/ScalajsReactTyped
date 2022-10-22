package typingsJapgolly.ipfsBitswap

import typingsJapgolly.ipfsBitswap.anon.Cancel
import typingsJapgolly.ipfsBitswap.anon.Priority
import typingsJapgolly.ipfsBitswap.distSrcMessageMod.BitswapMessage
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWantManagerMsgQueueMod {
  
  @JSImport("ipfs-bitswap/dist/src/want-manager/msg-queue", "MsgQueue")
  @js.native
  open class MsgQueue protected () extends StObject {
    /**
      * @param {PeerId} selfPeerId
      * @param {PeerId} otherPeerId
      * @param {Network} network
      */
    def this(selfPeerId: PeerId, otherPeerId: PeerId, network: Network) = this()
    
    /**
      * @private
      * @type {{cid:CID, priority:number, cancel?:boolean}[]}
      */
    /* private */ var _entries: Any = js.native
    
    /** @private */
    /* private */ var _log: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _sendEntries: Any = js.native
    
    /**
      * @param {{cid:CID, priority:number}[]} entries
      */
    def addEntries(entries: js.Array[Priority]): Unit = js.native
    
    /**
      * @param {Message} msg
      */
    def addMessage(msg: BitswapMessage): Unit = js.native
    
    var network: typingsJapgolly.ipfsBitswap.distSrcNetworkMod.Network = js.native
    
    var peerId: typingsJapgolly.libp2pInterfacePeerId.mod.PeerId = js.native
    
    var refcnt: Double = js.native
    
    /**
      * @param {Message} msg
      */
    def send(msg: BitswapMessage): js.Promise[Unit] = js.native
    
    def sendEntries(): Unit = js.native
    @JSName("sendEntries")
    var sendEntries_Original: js.Function0[Unit] & Cancel = js.native
  }
  
  type CID = typingsJapgolly.multiformats.mod.CID[Any, Double, Double, Version]
  
  type Network = typingsJapgolly.ipfsBitswap.distSrcNetworkMod.Network
  
  type PeerId = typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
}
