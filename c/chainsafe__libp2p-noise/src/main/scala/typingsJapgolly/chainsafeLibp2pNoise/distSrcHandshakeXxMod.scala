package typingsJapgolly.chainsafeLibp2pNoise

import typingsJapgolly.chainsafeLibp2pNoise.anon.Plaintext
import typingsJapgolly.chainsafeLibp2pNoise.distSrcCryptoMod.ICryptoInterface
import typingsJapgolly.chainsafeLibp2pNoise.distSrcHandshakeInterfaceMod.IHandshake
import typingsJapgolly.chainsafeLibp2pNoise.distSrcHandshakeMod.NoiseSession
import typingsJapgolly.chainsafeLibp2pNoise.distSrcHandshakesXxMod.XX
import typingsJapgolly.chainsafeLibp2pNoise.distSrcLibp2pMod.KeyPair
import typingsJapgolly.itPbStream.mod.ProtobufStream
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHandshakeXxMod {
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/handshake-xx", "XXHandshake")
  @js.native
  open class XXHandshake protected ()
    extends StObject
       with IHandshake {
    def this(
      isInitiator: Boolean,
      payload: js.typedarray.Uint8Array,
      prologue: js.typedarray.Uint8Array,
      crypto: ICryptoInterface,
      staticKeypair: KeyPair,
      connection: ProtobufStream
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: js.typedarray.Uint8Array,
      prologue: js.typedarray.Uint8Array,
      crypto: ICryptoInterface,
      staticKeypair: KeyPair,
      connection: ProtobufStream,
      remotePeer: PeerId
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: js.typedarray.Uint8Array,
      prologue: js.typedarray.Uint8Array,
      crypto: ICryptoInterface,
      staticKeypair: KeyPair,
      connection: ProtobufStream,
      remotePeer: Unit,
      handshake: XX
    ) = this()
    def this(
      isInitiator: Boolean,
      payload: js.typedarray.Uint8Array,
      prologue: js.typedarray.Uint8Array,
      crypto: ICryptoInterface,
      staticKeypair: KeyPair,
      connection: ProtobufStream,
      remotePeer: PeerId,
      handshake: XX
    ) = this()
    
    /* protected */ var connection: ProtobufStream = js.native
    
    /* CompleteClass */
    override def decrypt(ciphertext: js.typedarray.Uint8Array, session: NoiseSession): Plaintext = js.native
    
    /* CompleteClass */
    override def encrypt(plaintext: js.typedarray.Uint8Array, session: NoiseSession): js.typedarray.Uint8Array = js.native
    
    def exchange(): js.Promise[Unit] = js.native
    
    def finish(): js.Promise[Unit] = js.native
    
    /* private */ var getCS: Any = js.native
    
    def getRemoteStaticKey(): js.typedarray.Uint8Array = js.native
    
    var isInitiator: Boolean = js.native
    
    /* protected */ var payload: js.typedarray.Uint8Array = js.native
    
    /* private */ val prologue: Any = js.native
    
    def propose(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    var remoteEarlyData: js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    var remotePeer: PeerId = js.native
    
    /* CompleteClass */
    var session: NoiseSession = js.native
    
    /* protected */ def setRemoteEarlyData(): Unit = js.native
    /* protected */ def setRemoteEarlyData(data: js.typedarray.Uint8Array): Unit = js.native
    
    /* protected */ var staticKeypair: KeyPair = js.native
    
    /* protected */ var xx: XX = js.native
  }
}
