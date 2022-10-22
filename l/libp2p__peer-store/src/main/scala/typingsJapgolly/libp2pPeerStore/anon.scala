package typingsJapgolly.libp2pPeerStore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.libp2pInterfacePeerStore.mod.Address
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: String
    
    var value: Double
  }
  object Name {
    
    inline def apply(name: String, value: Double): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@libp2p/interface-peer-store.@libp2p/interface-peer-store.Peer> */
  trait PartialPeer extends StObject {
    
    var addresses: js.UndefOr[js.Array[Address]] = js.undefined
    
    var id: js.UndefOr[PeerId] = js.undefined
    
    var metadata: js.UndefOr[Map[String, js.typedarray.Uint8Array]] = js.undefined
    
    var peerRecordEnvelope: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var protocols: js.UndefOr[js.Array[String]] = js.undefined
    
    var pubKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object PartialPeer {
    
    inline def apply(): PartialPeer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPeer]
    }
    
    extension [Self <: PartialPeer](x: Self) {
      
      inline def setAddresses(value: js.Array[Address]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
      
      inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setId(value: PeerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMetadata(value: Map[String, js.typedarray.Uint8Array]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setPeerRecordEnvelope(value: js.typedarray.Uint8Array): Self = StObject.set(x, "peerRecordEnvelope", value.asInstanceOf[js.Any])
      
      inline def setPeerRecordEnvelopeUndefined: Self = StObject.set(x, "peerRecordEnvelope", js.undefined)
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setPubKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "pubKey", value.asInstanceOf[js.Any])
      
      inline def setPubKeyUndefined: Self = StObject.set(x, "pubKey", js.undefined)
    }
  }
  
  trait ReadLock extends StObject {
    
    def readLock(): js.Promise[js.Function0[Unit]]
    
    def writeLock(): js.Promise[js.Function0[Unit]]
  }
  object ReadLock {
    
    inline def apply(
      readLock: CallbackTo[js.Promise[js.Function0[Unit]]],
      writeLock: CallbackTo[js.Promise[js.Function0[Unit]]]
    ): ReadLock = {
      val __obj = js.Dynamic.literal(readLock = readLock.toJsFn, writeLock = writeLock.toJsFn)
      __obj.asInstanceOf[ReadLock]
    }
    
    extension [Self <: ReadLock](x: Self) {
      
      inline def setReadLock(value: CallbackTo[js.Promise[js.Function0[Unit]]]): Self = StObject.set(x, "readLock", value.toJsFn)
      
      inline def setWriteLock(value: CallbackTo[js.Promise[js.Function0[Unit]]]): Self = StObject.set(x, "writeLock", value.toJsFn)
    }
  }
}
