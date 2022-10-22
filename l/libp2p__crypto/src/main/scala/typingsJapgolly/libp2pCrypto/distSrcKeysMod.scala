package typingsJapgolly.libp2pCrypto

import typingsJapgolly.libp2pCrypto.anon.Bytes
import typingsJapgolly.libp2pCrypto.anon.K1
import typingsJapgolly.libp2pCrypto.anon.TypeofEd25519
import typingsJapgolly.libp2pCrypto.anon.TypeofRSA
import typingsJapgolly.libp2pCrypto.anon.TypeofSecp256k1
import typingsJapgolly.libp2pCrypto.distSrcKeysInterfaceMod.ECDHKey
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.Blowfish
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.SHA1
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.SHA256
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.SHA512
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.`AES-128`
import typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.`AES-256`
import typingsJapgolly.libp2pInterfaceKeys.mod.PrivateKey
import typingsJapgolly.libp2pInterfaceKeys.mod.PublicKey
import typingsJapgolly.protonsRuntime.distSrcCodecMod.Codec
import typingsJapgolly.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeysMod {
  
  @JSImport("@libp2p/crypto/dist/src/keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateEphemeralKeyPair(curve: String): js.Promise[ECDHKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateEphemeralKeyPair")(curve.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ECDHKey]]
  
  inline def generateKeyPair(`type`: KeyTypes): js.Promise[PrivateKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PrivateKey]]
  inline def generateKeyPair(`type`: KeyTypes, bits: Double): js.Promise[PrivateKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PrivateKey]]
  
  inline def generateKeyPairFromSeed(`type`: KeyTypes, seed: js.typedarray.Uint8Array): js.Promise[PrivateKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairFromSeed")(`type`.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PrivateKey]]
  inline def generateKeyPairFromSeed(`type`: KeyTypes, seed: js.typedarray.Uint8Array, bits: Double): js.Promise[PrivateKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairFromSeed")(`type`.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PrivateKey]]
  
  inline def importKey(encryptedKey: String, password: String): js.Promise[PrivateKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("importKey")(encryptedKey.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PrivateKey]]
  
  inline def keyStretcher(
    cipherType: `AES-128` | `AES-256` | Blowfish,
    hash: SHA1 | SHA256 | SHA512,
    secret: js.typedarray.Uint8Array
  ): js.Promise[K1] = (^.asInstanceOf[js.Dynamic].applyDynamic("keyStretcher")(cipherType.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], secret.asInstanceOf[js.Any])).asInstanceOf[js.Promise[K1]]
  
  object keysPBM {
    
    @JSImport("@libp2p/crypto/dist/src/keys", "keysPBM.KeyType")
    @js.native
    object KeyType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.KeyType & String] = js.native
      
      /* "Ed25519" */ val Ed25519: typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.KeyType.Ed25519 & String = js.native
      
      /* "RSA" */ val RSA: typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.KeyType.RSA & String = js.native
      
      /* "Secp256k1" */ val Secp256k1: typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.KeyType.Secp256k1 & String = js.native
      
      def codec(): Codec[typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.KeyType] = js.native
    }
    
    object PrivateKey {
      
      @JSImport("@libp2p/crypto/dist/src/keys", "keysPBM.PrivateKey")
      @js.native
      val ^ : js.Any = js.native
      
      inline def codec(): Codec[typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.PrivateKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.PrivateKey]]
      
      inline def decode(buf: js.typedarray.Uint8Array): typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.PrivateKey]
      inline def decode(buf: Uint8ArrayList): typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.PrivateKey]
      
      inline def encode(obj: typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.PrivateKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    }
    
    object PublicKey {
      
      @JSImport("@libp2p/crypto/dist/src/keys", "keysPBM.PublicKey")
      @js.native
      val ^ : js.Any = js.native
      
      inline def codec(): Codec[typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.PublicKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("codec")().asInstanceOf[Codec[typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.PublicKey]]
      
      inline def decode(buf: js.typedarray.Uint8Array): typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.PublicKey]
      inline def decode(buf: Uint8ArrayList): typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buf.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.PublicKey]
      
      inline def encode(obj: typingsJapgolly.libp2pCrypto.distSrcKeysKeysMod.PublicKey): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    }
  }
  
  inline def marshalPrivateKey(key: Bytes): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("marshalPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def marshalPrivateKey(key: Bytes, `type`: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("marshalPrivateKey")(key.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def marshalPublicKey(key: Bytes): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("marshalPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def marshalPublicKey(key: Bytes, `type`: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("marshalPublicKey")(key.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  object supportedKeys {
    
    @JSImport("@libp2p/crypto/dist/src/keys", "supportedKeys")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@libp2p/crypto/dist/src/keys", "supportedKeys.ed25519")
    @js.native
    def ed25519: TypeofEd25519 = js.native
    inline def ed25519_=(x: TypeofEd25519): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ed25519")(x.asInstanceOf[js.Any])
    
    @JSImport("@libp2p/crypto/dist/src/keys", "supportedKeys.rsa")
    @js.native
    def rsa: TypeofRSA = js.native
    inline def rsa_=(x: TypeofRSA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsa")(x.asInstanceOf[js.Any])
    
    @JSImport("@libp2p/crypto/dist/src/keys", "supportedKeys.secp256k1")
    @js.native
    def secp256k1: TypeofSecp256k1 = js.native
    inline def secp256k1_=(x: TypeofSecp256k1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secp256k1")(x.asInstanceOf[js.Any])
  }
  
  inline def unmarshalPrivateKey(buf: js.typedarray.Uint8Array): js.Promise[PrivateKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshalPrivateKey")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PrivateKey]]
  
  inline def unmarshalPublicKey(buf: js.typedarray.Uint8Array): PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshalPublicKey")(buf.asInstanceOf[js.Any]).asInstanceOf[PublicKey]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.RSA
    - typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.Ed25519
    - typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.secp256k1
  */
  trait KeyTypes extends StObject
  object KeyTypes {
    
    inline def Ed25519: typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.Ed25519 = "Ed25519".asInstanceOf[typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.Ed25519]
    
    inline def RSA: typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.RSA = "RSA".asInstanceOf[typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.RSA]
    
    inline def secp256k1: typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.secp256k1 = "secp256k1".asInstanceOf[typingsJapgolly.libp2pCrypto.libp2pCryptoStrings.secp256k1]
  }
}
