package typingsJapgolly.nkeysJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNkeysMod {
  
  @JSImport("nkeys.js/lib/nkeys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nkeys.js/lib/nkeys", "NKeysError")
  @js.native
  open class NKeysError protected ()
    extends StObject
       with Error {
    /**
      * @param {NKeysErrorCode} code
      * @param {Error} [chainedError]
      * @constructor
      *
      * @api private
      */
    def this(code: NKeysErrorCode) = this()
    def this(code: NKeysErrorCode, chainedError: js.Error) = this()
    
    var chainedError: js.UndefOr[js.Error] = js.native
    
    var code: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  sealed trait NKeysErrorCode extends StObject
  @JSImport("nkeys.js/lib/nkeys", "NKeysErrorCode")
  @js.native
  object NKeysErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NKeysErrorCode & String] = js.native
    
    @js.native
    sealed trait ApiError
      extends StObject
         with NKeysErrorCode
    /* "nkeys: api error" */ val ApiError: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.ApiError & String = js.native
    
    @js.native
    sealed trait CannotSign
      extends StObject
         with NKeysErrorCode
    /* "nkeys: cannot sign, no private key available" */ val CannotSign: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.CannotSign & String = js.native
    
    @js.native
    sealed trait ClearedPair
      extends StObject
         with NKeysErrorCode
    /* "nkeys: pair is cleared" */ val ClearedPair: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.ClearedPair & String = js.native
    
    @js.native
    sealed trait InvalidChecksum
      extends StObject
         with NKeysErrorCode
    /* "nkeys: invalid checksum" */ val InvalidChecksum: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.InvalidChecksum & String = js.native
    
    @js.native
    sealed trait InvalidEncoding
      extends StObject
         with NKeysErrorCode
    /* "nkeys: invalid encoded key" */ val InvalidEncoding: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.InvalidEncoding & String = js.native
    
    @js.native
    sealed trait InvalidKey
      extends StObject
         with NKeysErrorCode
    /* "nkeys: invalid key" */ val InvalidKey: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.InvalidKey & String = js.native
    
    @js.native
    sealed trait InvalidPrefixByte
      extends StObject
         with NKeysErrorCode
    /* "nkeys: invalid prefix byte" */ val InvalidPrefixByte: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.InvalidPrefixByte & String = js.native
    
    @js.native
    sealed trait InvalidPublicKey
      extends StObject
         with NKeysErrorCode
    /* "nkeys: invalid public key" */ val InvalidPublicKey: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.InvalidPublicKey & String = js.native
    
    @js.native
    sealed trait InvalidSeed
      extends StObject
         with NKeysErrorCode
    /* "nkeys: invalid seed" */ val InvalidSeed: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.InvalidSeed & String = js.native
    
    @js.native
    sealed trait InvalidSeedLen
      extends StObject
         with NKeysErrorCode
    /* "nkeys: invalid seed length" */ val InvalidSeedLen: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.InvalidSeedLen & String = js.native
    
    @js.native
    sealed trait InvalidSignature
      extends StObject
         with NKeysErrorCode
    /* "nkeys: signature verification failed" */ val InvalidSignature: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.InvalidSignature & String = js.native
    
    @js.native
    sealed trait PublicKeyOnly
      extends StObject
         with NKeysErrorCode
    /* "nkeys: no seed or private key available" */ val PublicKeyOnly: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.PublicKeyOnly & String = js.native
    
    @js.native
    sealed trait SerializationError
      extends StObject
         with NKeysErrorCode
    /* "nkeys: serialization error" */ val SerializationError: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.SerializationError & String = js.native
  }
  
  @js.native
  sealed trait Prefix extends StObject
  @JSImport("nkeys.js/lib/nkeys", "Prefix")
  @js.native
  object Prefix extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Prefix & Double] = js.native
    
    @js.native
    sealed trait Account
      extends StObject
         with Prefix
    /* 0 */ val Account: typingsJapgolly.nkeysJs.libNkeysMod.Prefix.Account & Double = js.native
    
    @js.native
    sealed trait Cluster
      extends StObject
         with Prefix
    /* 16 */ val Cluster: typingsJapgolly.nkeysJs.libNkeysMod.Prefix.Cluster & Double = js.native
    
    @js.native
    sealed trait Operator
      extends StObject
         with Prefix
    /* 112 */ val Operator: typingsJapgolly.nkeysJs.libNkeysMod.Prefix.Operator & Double = js.native
    
    @js.native
    sealed trait Private
      extends StObject
         with Prefix
    /* 120 */ val Private: typingsJapgolly.nkeysJs.libNkeysMod.Prefix.Private & Double = js.native
    
    @js.native
    sealed trait Seed
      extends StObject
         with Prefix
    /* 144 */ val Seed: typingsJapgolly.nkeysJs.libNkeysMod.Prefix.Seed & Double = js.native
    
    @js.native
    sealed trait Server
      extends StObject
         with Prefix
    /* 104 */ val Server: typingsJapgolly.nkeysJs.libNkeysMod.Prefix.Server & Double = js.native
    
    @js.native
    sealed trait User
      extends StObject
         with Prefix
    /* 160 */ val User: typingsJapgolly.nkeysJs.libNkeysMod.Prefix.User & Double = js.native
  }
  
  @JSImport("nkeys.js/lib/nkeys", "Prefixes")
  @js.native
  open class Prefixes () extends StObject
  /* static members */
  object Prefixes {
    
    @JSImport("nkeys.js/lib/nkeys", "Prefixes")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isValidPrefix(prefix: Prefix): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPrefix")(prefix.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isValidPublicPrefix(prefix: Prefix): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPublicPrefix")(prefix.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def parsePrefix(v: Double): Prefix = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePrefix")(v.asInstanceOf[js.Any]).asInstanceOf[Prefix]
    
    inline def startsWithValidPrefix(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("startsWithValidPrefix")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def createAccount(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")().asInstanceOf[KeyPair]
  
  inline def createCluster(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createCluster")().asInstanceOf[KeyPair]
  
  inline def createOperator(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createOperator")().asInstanceOf[KeyPair]
  
  inline def createPair(prefix: Prefix): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createPair")(prefix.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  inline def createServer(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[KeyPair]
  
  inline def createUser(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createUser")().asInstanceOf[KeyPair]
  
  inline def fromPublic(src: String): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPublic")(src.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  inline def fromSeed(src: js.typedarray.Uint8Array): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(src.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  trait KeyPair extends StObject {
    
    /**
      * Clears the secret stored in the keypair. After clearing
      * a keypair cannot be used or recovered.
      */
    def clear(): Unit
    
    /**
      * Returns the private key associated with the KeyPair
      * @returns Uint8Array
      * @throws NKeysError
      */
    def getPrivateKey(): js.typedarray.Uint8Array
    
    /**
      * Returns the public key associated with the KeyPair
      * @returns {string}
      * @throws NKeysError
      */
    def getPublicKey(): String
    
    /**
      * Returns the PrivateKey's seed.
      * @returns Uint8Array
      * @throws NKeysError
      */
    def getSeed(): js.typedarray.Uint8Array
    
    /**
      * Returns the digital signature of signing the input with the
      * the KeyPair's private key.
      * @param {Uint8Array} input
      * @returns Uint8Array
      * @throws NKeysError
      */
    def sign(input: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    
    /**
      * Returns true if the signature can be verified with the KeyPair
      * @param {Uint8Array} input
      * @param {Uint8Array} sig
      * @returns {boolean}
      * @throws NKeysError
      */
    def verify(input: js.typedarray.Uint8Array, sig: js.typedarray.Uint8Array): Boolean
  }
  object KeyPair {
    
    inline def apply(
      clear: Callback,
      getPrivateKey: CallbackTo[js.typedarray.Uint8Array],
      getPublicKey: CallbackTo[String],
      getSeed: CallbackTo[js.typedarray.Uint8Array],
      sign: js.typedarray.Uint8Array => js.typedarray.Uint8Array,
      verify: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => Boolean
    ): KeyPair = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, getPrivateKey = getPrivateKey.toJsFn, getPublicKey = getPublicKey.toJsFn, getSeed = getSeed.toJsFn, sign = js.Any.fromFunction1(sign), verify = js.Any.fromFunction2(verify))
      __obj.asInstanceOf[KeyPair]
    }
    
    extension [Self <: KeyPair](x: Self) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setGetPrivateKey(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "getPrivateKey", value.toJsFn)
      
      inline def setGetPublicKey(value: CallbackTo[String]): Self = StObject.set(x, "getPublicKey", value.toJsFn)
      
      inline def setGetSeed(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "getSeed", value.toJsFn)
      
      inline def setSign(value: js.typedarray.Uint8Array => js.typedarray.Uint8Array): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
      
      inline def setVerify(value: (js.typedarray.Uint8Array, js.typedarray.Uint8Array) => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction2(value))
    }
  }
}
