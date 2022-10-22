package typingsJapgolly.libp2pPeerIdFactory

import typingsJapgolly.protonsRuntime.distSrcCodecMod.Codec
import typingsJapgolly.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcProtoMod {
  
  trait PeerIdProto extends StObject {
    
    var id: js.typedarray.Uint8Array
    
    var privKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var pubKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object PeerIdProto {
    
    inline def apply(id: js.typedarray.Uint8Array): PeerIdProto = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerIdProto]
    }
    
    @JSImport("@libp2p/peer-id-factory/dist/src/proto", "PeerIdProto")
    @js.native
    val ^ : js.Any = js.native
    
    inline def codec(): Codec[PeerIdProto] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[PeerIdProto]]
    
    inline def decode(buf: js.typedarray.Uint8Array): PeerIdProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PeerIdProto]
    inline def decode(buf: Uint8ArrayList): PeerIdProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[PeerIdProto]
    
    inline def encode(obj: PeerIdProto): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    extension [Self <: PeerIdProto](x: Self) {
      
      inline def setId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPrivKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "privKey", value.asInstanceOf[js.Any])
      
      inline def setPrivKeyUndefined: Self = StObject.set(x, "privKey", js.undefined)
      
      inline def setPubKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "pubKey", value.asInstanceOf[js.Any])
      
      inline def setPubKeyUndefined: Self = StObject.set(x, "pubKey", js.undefined)
    }
  }
}
