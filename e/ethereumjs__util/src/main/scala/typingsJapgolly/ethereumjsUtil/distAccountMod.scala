package typingsJapgolly.ethereumjsUtil

import typingsJapgolly.ethereumjsUtil.distTypesMod.BigIntLike
import typingsJapgolly.ethereumjsUtil.distTypesMod.BufferLike
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAccountMod {
  
  @JSImport("@ethereumjs/util/dist/account", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethereumjs/util/dist/account", "Account")
  @js.native
  /**
    * This constructor assigns and validates the values.
    * Use the static factory methods to assist in creating an Account from varying data types.
    */
  open class Account () extends StObject {
    def this(nonce: js.BigInt) = this()
    def this(nonce: js.BigInt, balance: js.BigInt) = this()
    def this(nonce: Unit, balance: js.BigInt) = this()
    def this(nonce: js.BigInt, balance: js.BigInt, storageRoot: Buffer) = this()
    def this(nonce: js.BigInt, balance: Unit, storageRoot: Buffer) = this()
    def this(nonce: Unit, balance: js.BigInt, storageRoot: Buffer) = this()
    def this(nonce: Unit, balance: Unit, storageRoot: Buffer) = this()
    def this(nonce: js.BigInt, balance: js.BigInt, storageRoot: Unit, codeHash: Buffer) = this()
    def this(nonce: js.BigInt, balance: js.BigInt, storageRoot: Buffer, codeHash: Buffer) = this()
    def this(nonce: js.BigInt, balance: Unit, storageRoot: Unit, codeHash: Buffer) = this()
    def this(nonce: js.BigInt, balance: Unit, storageRoot: Buffer, codeHash: Buffer) = this()
    def this(nonce: Unit, balance: js.BigInt, storageRoot: Unit, codeHash: Buffer) = this()
    def this(nonce: Unit, balance: js.BigInt, storageRoot: Buffer, codeHash: Buffer) = this()
    def this(nonce: Unit, balance: Unit, storageRoot: Unit, codeHash: Buffer) = this()
    def this(nonce: Unit, balance: Unit, storageRoot: Buffer, codeHash: Buffer) = this()
    
    /* private */ var _validate: Any = js.native
    
    var balance: js.BigInt = js.native
    
    var codeHash: Buffer = js.native
    
    /**
      * Returns a `Boolean` determining if the account is a contract.
      */
    def isContract(): Boolean = js.native
    
    /**
      * Returns a `Boolean` determining if the account is empty complying to the definition of
      * account emptiness in [EIP-161](https://eips.ethereum.org/EIPS/eip-161):
      * "An account is considered empty when it has no code and zero nonce and zero balance."
      */
    def isEmpty(): Boolean = js.native
    
    var nonce: js.BigInt = js.native
    
    /**
      * Returns a Buffer Array of the raw Buffers for the account, in order.
      */
    def raw(): js.Array[Buffer] = js.native
    
    /**
      * Returns the RLP serialization of the account as a `Buffer`.
      */
    def serialize(): Buffer = js.native
    
    var storageRoot: Buffer = js.native
  }
  /* static members */
  object Account {
    
    @JSImport("@ethereumjs/util/dist/account", "Account")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromAccountData(accountData: AccountData): Account = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAccountData")(accountData.asInstanceOf[js.Any]).asInstanceOf[Account]
    
    inline def fromRlpSerializedAccount(serialized: Buffer): Account = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRlpSerializedAccount")(serialized.asInstanceOf[js.Any]).asInstanceOf[Account]
    
    inline def fromValuesArray(values: js.Array[Buffer]): Account = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any]).asInstanceOf[Account]
  }
  
  inline def convertSlimAccount(body: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("convertSlimAccount")(body.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def generateAddress(from: Buffer, nonce: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAddress")(from.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def generateAddress2(from: Buffer, salt: Buffer, initCode: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAddress2")(from.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], initCode.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def importPublic(publicKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("importPublic")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def isValidAddress(hexAddress: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidChecksumAddress(hexAddress: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidChecksumAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidChecksumAddress(hexAddress: String, eip1191ChainId: BigIntLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidChecksumAddress")(hexAddress.asInstanceOf[js.Any], eip1191ChainId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidPrivate(privateKey: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPrivate")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidPublic(publicKey: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPublic")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidPublic(publicKey: Buffer, sanitize: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPublic")(publicKey.asInstanceOf[js.Any], sanitize.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isZeroAddress(hexAddress: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isZeroAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def privateToAddress(privateKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("privateToAddress")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def privateToPublic(privateKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("privateToPublic")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def pubToAddress(pubKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("pubToAddress")(pubKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def pubToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pubToAddress")(pubKey.asInstanceOf[js.Any], sanitize.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def publicToAddress(pubKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("publicToAddress")(pubKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def publicToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicToAddress")(pubKey.asInstanceOf[js.Any], sanitize.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def toChecksumAddress(hexAddress: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toChecksumAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toChecksumAddress(hexAddress: String, eip1191ChainId: BigIntLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toChecksumAddress")(hexAddress.asInstanceOf[js.Any], eip1191ChainId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def zeroAddress(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroAddress")().asInstanceOf[String]
  
  trait AccountData extends StObject {
    
    var balance: js.UndefOr[BigIntLike] = js.undefined
    
    var codeHash: js.UndefOr[BufferLike] = js.undefined
    
    var nonce: js.UndefOr[BigIntLike] = js.undefined
    
    var storageRoot: js.UndefOr[BufferLike] = js.undefined
  }
  object AccountData {
    
    inline def apply(): AccountData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountData]
    }
    
    extension [Self <: AccountData](x: Self) {
      
      inline def setBalance(value: BigIntLike): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      inline def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
      
      inline def setCodeHash(value: BufferLike): Self = StObject.set(x, "codeHash", value.asInstanceOf[js.Any])
      
      inline def setCodeHashUndefined: Self = StObject.set(x, "codeHash", js.undefined)
      
      inline def setCodeHashVarargs(value: Double*): Self = StObject.set(x, "codeHash", js.Array(value*))
      
      inline def setNonce(value: BigIntLike): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setStorageRoot(value: BufferLike): Self = StObject.set(x, "storageRoot", value.asInstanceOf[js.Any])
      
      inline def setStorageRootUndefined: Self = StObject.set(x, "storageRoot", js.undefined)
      
      inline def setStorageRootVarargs(value: Double*): Self = StObject.set(x, "storageRoot", js.Array(value*))
    }
  }
}
