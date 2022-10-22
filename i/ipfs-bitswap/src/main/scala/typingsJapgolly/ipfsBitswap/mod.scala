package typingsJapgolly.ipfsBitswap

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.ipfsBitswap.anon.HashLoader
import typingsJapgolly.ipfsBitswap.anon.TypeofBitswapMessage
import typingsJapgolly.libp2p.mod.Libp2p
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-bitswap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBitswap(libp2p: Libp2p, blockstore: Blockstore): IPFSBitswap = (^.asInstanceOf[js.Dynamic].applyDynamic("createBitswap")(libp2p.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any])).asInstanceOf[IPFSBitswap]
  inline def createBitswap(libp2p: Libp2p, blockstore: Blockstore, options: HashLoader): IPFSBitswap = (^.asInstanceOf[js.Dynamic].applyDynamic("createBitswap")(libp2p.asInstanceOf[js.Any], blockstore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPFSBitswap]
  
  trait BitswapMessage extends StObject {
    
    var BitswapMessage: (Instantiable1[/* full */ Boolean, typingsJapgolly.ipfsBitswap.distSrcMessageMod.BitswapMessage]) & TypeofBitswapMessage
  }
  object BitswapMessage {
    
    inline def apply(
      BitswapMessage: (Instantiable1[/* full */ Boolean, typingsJapgolly.ipfsBitswap.distSrcMessageMod.BitswapMessage]) & TypeofBitswapMessage
    ): BitswapMessage = {
      val __obj = js.Dynamic.literal(BitswapMessage = BitswapMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitswapMessage]
    }
    
    extension [Self <: BitswapMessage](x: Self) {
      
      inline def setBitswapMessage(
        value: (Instantiable1[/* full */ Boolean, typingsJapgolly.ipfsBitswap.distSrcMessageMod.BitswapMessage]) & TypeofBitswapMessage
      ): Self = StObject.set(x, "BitswapMessage", value.asInstanceOf[js.Any])
    }
  }
  
  type Blockstore = typingsJapgolly.interfaceBlockstore.mod.Blockstore
  
  type IPFSBitswap = typingsJapgolly.ipfsBitswap.distSrcTypesMod.IPFSBitswap
  
  type MultihashHasherLoader = typingsJapgolly.ipfsBitswap.distSrcTypesMod.MultihashHasherLoader
  
  type Options = typingsJapgolly.interfaceBlockstore.mod.Options
  
  type Pair = typingsJapgolly.interfaceBlockstore.mod.Pair
  
  type PeerId = typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
}
