package typingsJapgolly.nkeysJs

import typingsJapgolly.nkeysJs.libNkeysMod.KeyPair
import typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode
import typingsJapgolly.nkeysJs.libNkeysMod.Prefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModMod {
  
  @JSImport("nkeys.js/lib/mod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nkeys.js/lib/mod", "NKeysError")
  @js.native
  open class NKeysError protected ()
    extends typingsJapgolly.nkeysJs.libNkeysMod.NKeysError {
    /**
      * @param {NKeysErrorCode} code
      * @param {Error} [chainedError]
      * @constructor
      *
      * @api private
      */
    def this(code: NKeysErrorCode) = this()
    def this(code: NKeysErrorCode, chainedError: js.Error) = this()
  }
  
  @JSImport("nkeys.js/lib/mod", "NKeysErrorCode")
  @js.native
  object NKeysErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode & String] = js.native
    
    /* "nkeys: api error" */ val ApiError: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.ApiError & String = js.native
    
    /* "nkeys: cannot sign, no private key available" */ val CannotSign: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.CannotSign & String = js.native
    
    /* "nkeys: pair is cleared" */ val ClearedPair: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.ClearedPair & String = js.native
    
    /* "nkeys: invalid checksum" */ val InvalidChecksum: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.InvalidChecksum & String = js.native
    
    /* "nkeys: invalid encoded key" */ val InvalidEncoding: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.InvalidEncoding & String = js.native
    
    /* "nkeys: invalid key" */ val InvalidKey: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.InvalidKey & String = js.native
    
    /* "nkeys: invalid prefix byte" */ val InvalidPrefixByte: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.InvalidPrefixByte & String = js.native
    
    /* "nkeys: invalid public key" */ val InvalidPublicKey: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.InvalidPublicKey & String = js.native
    
    /* "nkeys: invalid seed" */ val InvalidSeed: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.InvalidSeed & String = js.native
    
    /* "nkeys: invalid seed length" */ val InvalidSeedLen: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.InvalidSeedLen & String = js.native
    
    /* "nkeys: signature verification failed" */ val InvalidSignature: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.InvalidSignature & String = js.native
    
    /* "nkeys: no seed or private key available" */ val PublicKeyOnly: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.PublicKeyOnly & String = js.native
    
    /* "nkeys: serialization error" */ val SerializationError: typingsJapgolly.nkeysJs.libNkeysMod.NKeysErrorCode.SerializationError & String = js.native
  }
  
  @JSImport("nkeys.js/lib/mod", "Prefix")
  @js.native
  object Prefix extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.nkeysJs.libNkeysMod.Prefix & Double] = js.native
    
    /* 0 */ val Account: typingsJapgolly.nkeysJs.libNkeysMod.Prefix.Account & Double = js.native
    
    /* 16 */ val Cluster: typingsJapgolly.nkeysJs.libNkeysMod.Prefix.Cluster & Double = js.native
    
    /* 112 */ val Operator: typingsJapgolly.nkeysJs.libNkeysMod.Prefix.Operator & Double = js.native
    
    /* 120 */ val Private: typingsJapgolly.nkeysJs.libNkeysMod.Prefix.Private & Double = js.native
    
    /* 144 */ val Seed: typingsJapgolly.nkeysJs.libNkeysMod.Prefix.Seed & Double = js.native
    
    /* 104 */ val Server: typingsJapgolly.nkeysJs.libNkeysMod.Prefix.Server & Double = js.native
    
    /* 160 */ val User: typingsJapgolly.nkeysJs.libNkeysMod.Prefix.User & Double = js.native
  }
  
  inline def createAccount(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")().asInstanceOf[KeyPair]
  
  inline def createOperator(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createOperator")().asInstanceOf[KeyPair]
  
  inline def createPair(prefix: Prefix): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createPair")(prefix.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  inline def createUser(): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("createUser")().asInstanceOf[KeyPair]
  
  inline def decode(b64str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(b64str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encode(bytes: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fromPublic(src: String): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPublic")(src.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
  
  inline def fromSeed(src: js.typedarray.Uint8Array): KeyPair = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeed")(src.asInstanceOf[js.Any]).asInstanceOf[KeyPair]
}
