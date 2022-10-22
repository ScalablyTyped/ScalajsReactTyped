package typingsJapgolly.nodeForge.mod.pki

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.nodeForge.anon.PrivateKeyBinaryBuffer
import typingsJapgolly.nodeForge.anon.PrivateKeyBytes
import typingsJapgolly.nodeForge.anon.Seed
import typingsJapgolly.nodeForge.mod.asn1.Asn1
import typingsJapgolly.nodeForge.mod.util.ByteBuffer
import typingsJapgolly.nodeForge.nodeForgeStrings.binary
import typingsJapgolly.nodeForge.nodeForgeStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ed25519 {
  
  @JSImport("node-forge", "pki.ed25519")
  @js.native
  val ^ : js.Any = js.native
  
  object constants {
    
    @JSImport("node-forge", "pki.ed25519.constants.HASH_BYTE_LENGTH")
    @js.native
    val HASH_BYTE_LENGTH: /* 64 */ Double = js.native
    
    @JSImport("node-forge", "pki.ed25519.constants.PRIVATE_KEY_BYTE_LENGTH")
    @js.native
    val PRIVATE_KEY_BYTE_LENGTH: /* 64 */ Double = js.native
    
    @JSImport("node-forge", "pki.ed25519.constants.PUBLIC_KEY_BYTE_LENGTH")
    @js.native
    val PUBLIC_KEY_BYTE_LENGTH: /* 32 */ Double = js.native
    
    @JSImport("node-forge", "pki.ed25519.constants.SEED_BYTE_LENGTH")
    @js.native
    val SEED_BYTE_LENGTH: /* 32 */ Double = js.native
    
    @JSImport("node-forge", "pki.ed25519.constants.SIGN_BYTE_LENGTH")
    @js.native
    val SIGN_BYTE_LENGTH: /* 64 */ Double = js.native
  }
  
  // generateKeyPair does not currently accept `util.ByteBuffer` as the seed.
  inline def generateKeyPair(): typingsJapgolly.nodeForge.anon.PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")().asInstanceOf[typingsJapgolly.nodeForge.anon.PrivateKey]
  inline def generateKeyPair(options: Seed): typingsJapgolly.nodeForge.anon.PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodeForge.anon.PrivateKey]
  
  inline def privateKeyFromAsn1(obj: Asn1): PrivateKeyBytes = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyFromAsn1")(obj.asInstanceOf[js.Any]).asInstanceOf[PrivateKeyBytes]
  
  inline def publicKeyFromAsn1(obj: Asn1): NativeBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyFromAsn1")(obj.asInstanceOf[js.Any]).asInstanceOf[NativeBuffer]
  
  inline def publicKeyFromPrivateKey(options: PrivateKeyBinaryBuffer): NativeBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyFromPrivateKey")(options.asInstanceOf[js.Any]).asInstanceOf[NativeBuffer]
  
  inline def sign(options: ToNativeBufferParameters & PrivateKeyBinaryBuffer): NativeBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any]).asInstanceOf[NativeBuffer]
  
  inline def verify(options: ToNativeBufferParameters & typingsJapgolly.nodeForge.anon.PublicKey): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  // `string`s will be converted by toNativeBuffer with `encoding: 'binary'`
  type BinaryBuffer = NativeBuffer | ByteBuffer | String
  
  type Key = NativeBuffer
  
  type NativeBuffer = Buffer | js.typedarray.Uint8Array
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeForge.anon.Message
    - typingsJapgolly.nodeForge.anon.Encoding
  */
  trait ToNativeBufferParameters extends StObject
  object ToNativeBufferParameters {
    
    inline def Encoding(encoding: binary | utf8, message: String): typingsJapgolly.nodeForge.anon.Encoding = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nodeForge.anon.Encoding]
    }
    
    inline def Message(message: NativeBuffer | ByteBuffer): typingsJapgolly.nodeForge.anon.Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nodeForge.anon.Message]
    }
  }
}
