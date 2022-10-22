package typingsJapgolly.nodeForge.mod.pki

import typingsJapgolly.nodeForge.mod.Bytes
import typingsJapgolly.nodeForge.mod.jsbn.BigInteger
import typingsJapgolly.nodeForge.mod.md.MessageDigest
import typingsJapgolly.nodeForge.mod.pss.PSS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsa {
  
  @JSImport("node-forge", "pki.rsa")
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateKeyPair(): typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")().asInstanceOf[typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(bits: Double): typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(bits.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(bits: Double, e: Double): typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(bits.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(
    bits: Double,
    e: Double,
    callback: js.Function2[
      /* err */ js.Error, 
      /* keypair */ typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair, 
      Unit
    ]
  ): typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(bits.asInstanceOf[js.Any], e.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(
    bits: Double,
    e: Unit,
    callback: js.Function2[
      /* err */ js.Error, 
      /* keypair */ typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair, 
      Unit
    ]
  ): typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(bits.asInstanceOf[js.Any], e.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(bits: Unit, e: Double): typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(bits.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(
    bits: Unit,
    e: Double,
    callback: js.Function2[
      /* err */ js.Error, 
      /* keypair */ typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair, 
      Unit
    ]
  ): typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(bits.asInstanceOf[js.Any], e.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(
    bits: Unit,
    e: Unit,
    callback: js.Function2[
      /* err */ js.Error, 
      /* keypair */ typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair, 
      Unit
    ]
  ): typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(bits.asInstanceOf[js.Any], e.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(
    options: Unit,
    callback: js.Function2[
      /* err */ js.Error, 
      /* keypair */ typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair, 
      Unit
    ]
  ): typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(options: GenerateKeyPairOptions): typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair]
  inline def generateKeyPair(
    options: GenerateKeyPairOptions,
    callback: js.Function2[
      /* err */ js.Error, 
      /* keypair */ typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair, 
      Unit
    ]
  ): typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair]
  
  inline def setPublicKey(n: BigInteger, e: BigInteger): typingsJapgolly.nodeForge.mod.pki.rsa.PublicKey = (^.asInstanceOf[js.Dynamic].applyDynamic("setPublicKey")(n.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodeForge.mod.pki.rsa.PublicKey]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeForge.nodeForgeStrings.`RSAES-PKCS1-V1_5`
    - typingsJapgolly.nodeForge.nodeForgeStrings.`RSA-OAEP`
    - typingsJapgolly.nodeForge.nodeForgeStrings.RAW
    - typingsJapgolly.nodeForge.nodeForgeStrings.NONE
    - scala.Null
  */
  type EncryptionScheme = _EncryptionScheme | Null
  
  trait GenerateKeyPairOptions extends StObject {
    
    var algorithm: js.UndefOr[String] = js.undefined
    
    var bits: js.UndefOr[Double] = js.undefined
    
    var e: js.UndefOr[Double] = js.undefined
    
    var prng: js.UndefOr[Any] = js.undefined
    
    var workLoad: js.UndefOr[Double] = js.undefined
    
    var workerScript: js.UndefOr[String] = js.undefined
    
    var workers: js.UndefOr[Double] = js.undefined
  }
  object GenerateKeyPairOptions {
    
    inline def apply(): GenerateKeyPairOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateKeyPairOptions]
    }
    
    extension [Self <: GenerateKeyPairOptions](x: Self) {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setBits(value: Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
      
      inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setPrng(value: Any): Self = StObject.set(x, "prng", value.asInstanceOf[js.Any])
      
      inline def setPrngUndefined: Self = StObject.set(x, "prng", js.undefined)
      
      inline def setWorkLoad(value: Double): Self = StObject.set(x, "workLoad", value.asInstanceOf[js.Any])
      
      inline def setWorkLoadUndefined: Self = StObject.set(x, "workLoad", js.undefined)
      
      inline def setWorkerScript(value: String): Self = StObject.set(x, "workerScript", value.asInstanceOf[js.Any])
      
      inline def setWorkerScriptUndefined: Self = StObject.set(x, "workerScript", js.undefined)
      
      inline def setWorkers(value: Double): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
  
  trait KeyPair extends StObject {
    
    var privateKey: typingsJapgolly.nodeForge.mod.pki.rsa.PrivateKey
    
    var publicKey: typingsJapgolly.nodeForge.mod.pki.rsa.PublicKey
  }
  object KeyPair {
    
    inline def apply(
      privateKey: typingsJapgolly.nodeForge.mod.pki.rsa.PrivateKey,
      publicKey: typingsJapgolly.nodeForge.mod.pki.rsa.PublicKey
    ): typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair = {
      val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair]
    }
    
    extension [Self <: typingsJapgolly.nodeForge.mod.pki.rsa.KeyPair](x: Self) {
      
      inline def setPrivateKey(value: typingsJapgolly.nodeForge.mod.pki.rsa.PrivateKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: typingsJapgolly.nodeForge.mod.pki.rsa.PublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PrivateKey extends StObject {
    
    var d: BigInteger = js.native
    
    var dP: BigInteger = js.native
    
    var dQ: BigInteger = js.native
    
    def decrypt(data: Bytes): Bytes = js.native
    def decrypt(data: Bytes, scheme: Unit, schemeOptions: Any): Bytes = js.native
    def decrypt(data: Bytes, scheme: EncryptionScheme): Bytes = js.native
    def decrypt(data: Bytes, scheme: EncryptionScheme, schemeOptions: Any): Bytes = js.native
    
    var e: BigInteger = js.native
    
    var n: BigInteger = js.native
    
    var p: BigInteger = js.native
    
    var q: BigInteger = js.native
    
    var qInv: BigInteger = js.native
    
    def sign(md: Bytes): Bytes = js.native
    def sign(md: Bytes, scheme: SignatureScheme): Bytes = js.native
    def sign(md: MessageDigest): Bytes = js.native
    def sign(md: MessageDigest, scheme: SignatureScheme): Bytes = js.native
  }
  
  @js.native
  trait PublicKey extends StObject {
    
    var e: BigInteger = js.native
    
    def encrypt(data: Bytes): Bytes = js.native
    def encrypt(data: Bytes, scheme: Unit, schemeOptions: Any): Bytes = js.native
    def encrypt(data: Bytes, scheme: EncryptionScheme): Bytes = js.native
    def encrypt(data: Bytes, scheme: EncryptionScheme, schemeOptions: Any): Bytes = js.native
    
    var n: BigInteger = js.native
    
    def verify(digest: Bytes, signature: Bytes): Boolean = js.native
    def verify(digest: Bytes, signature: Bytes, scheme: SignatureScheme): Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeForge.nodeForgeStrings.`RSASSA-PKCS1-V1_5`
    - typingsJapgolly.nodeForge.mod.pss.PSS
    - typingsJapgolly.nodeForge.nodeForgeStrings.NONE
    - scala.Null
  */
  type SignatureScheme = _SignatureScheme | PSS | Null
  
  trait _EncryptionScheme extends StObject
  
  trait _SignatureScheme extends StObject
}
