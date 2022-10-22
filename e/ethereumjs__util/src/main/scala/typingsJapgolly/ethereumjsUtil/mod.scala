package typingsJapgolly.ethereumjsUtil

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ethereumjsUtil.distAccountMod.AccountData
import typingsJapgolly.ethereumjsUtil.distBytesMod.ToBufferInputTypes
import typingsJapgolly.ethereumjsUtil.distSignatureMod.ECDSASignature
import typingsJapgolly.ethereumjsUtil.distTypesMod.BigIntLike
import typingsJapgolly.ethereumjsUtil.distTypesMod.NestedBufferArray
import typingsJapgolly.ethereumjsUtil.distTypesMod.NestedUint8Array
import typingsJapgolly.ethereumjsUtil.distTypesMod.TypeOutput
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethereumjs/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethereumjs/util", "Account")
  @js.native
  /**
    * This constructor assigns and validates the values.
    * Use the static factory methods to assist in creating an Account from varying data types.
    */
  open class Account ()
    extends typingsJapgolly.ethereumjsUtil.distAccountMod.Account {
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
  }
  /* static members */
  object Account {
    
    @JSImport("@ethereumjs/util", "Account")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromAccountData(accountData: AccountData): typingsJapgolly.ethereumjsUtil.distAccountMod.Account = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAccountData")(accountData.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethereumjsUtil.distAccountMod.Account]
    
    inline def fromRlpSerializedAccount(serialized: Buffer): typingsJapgolly.ethereumjsUtil.distAccountMod.Account = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRlpSerializedAccount")(serialized.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethereumjsUtil.distAccountMod.Account]
    
    inline def fromValuesArray(values: js.Array[Buffer]): typingsJapgolly.ethereumjsUtil.distAccountMod.Account = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValuesArray")(values.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethereumjsUtil.distAccountMod.Account]
  }
  
  @JSImport("@ethereumjs/util", "Address")
  @js.native
  open class Address protected ()
    extends typingsJapgolly.ethereumjsUtil.distAddressMod.Address {
    def this(buf: Buffer) = this()
  }
  /* static members */
  object Address {
    
    @JSImport("@ethereumjs/util", "Address")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an address for a given private key.
      * @param privateKey A private key must be 256 bits wide
      */
    inline def fromPrivateKey(privateKey: Buffer): typingsJapgolly.ethereumjsUtil.distAddressMod.Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivateKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethereumjsUtil.distAddressMod.Address]
    
    /**
      * Returns an address for a given public key.
      * @param pubKey The two points of an uncompressed key
      */
    inline def fromPublicKey(pubKey: Buffer): typingsJapgolly.ethereumjsUtil.distAddressMod.Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKey")(pubKey.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethereumjsUtil.distAddressMod.Address]
    
    /**
      * Returns an Address object from a hex-encoded string.
      * @param str - Hex-encoded address
      */
    inline def fromString(str: String): typingsJapgolly.ethereumjsUtil.distAddressMod.Address = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ethereumjsUtil.distAddressMod.Address]
    
    /**
      * Generates an address for a newly created contract.
      * @param from The address which is creating this new address
      * @param nonce The nonce of the from account
      */
    inline def generate(from: typingsJapgolly.ethereumjsUtil.distAddressMod.Address, nonce: js.BigInt): typingsJapgolly.ethereumjsUtil.distAddressMod.Address = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(from.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethereumjsUtil.distAddressMod.Address]
    
    /**
      * Generates an address for a contract created using CREATE2.
      * @param from The address which is creating this new address
      * @param salt A salt
      * @param initCode The init code of the contract being created
      */
    inline def generate2(from: typingsJapgolly.ethereumjsUtil.distAddressMod.Address, salt: Buffer, initCode: Buffer): typingsJapgolly.ethereumjsUtil.distAddressMod.Address = (^.asInstanceOf[js.Dynamic].applyDynamic("generate2")(from.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], initCode.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ethereumjsUtil.distAddressMod.Address]
    
    /**
      * Returns the zero address.
      */
    inline def zero(): typingsJapgolly.ethereumjsUtil.distAddressMod.Address = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[typingsJapgolly.ethereumjsUtil.distAddressMod.Address]
  }
  
  @JSImport("@ethereumjs/util", "KECCAK256_NULL")
  @js.native
  val KECCAK256_NULL: typingsJapgolly.buffer.mod.Buffer = js.native
  
  @JSImport("@ethereumjs/util", "KECCAK256_NULL_S")
  @js.native
  val KECCAK256_NULL_S: /* "c5d2460186f7233c927e7db2dcc703c0e500b653ca82273b7bfad8045d85a470" */ String = js.native
  
  @JSImport("@ethereumjs/util", "KECCAK256_RLP")
  @js.native
  val KECCAK256_RLP: typingsJapgolly.buffer.mod.Buffer = js.native
  
  @JSImport("@ethereumjs/util", "KECCAK256_RLP_ARRAY")
  @js.native
  val KECCAK256_RLP_ARRAY: typingsJapgolly.buffer.mod.Buffer = js.native
  
  @JSImport("@ethereumjs/util", "KECCAK256_RLP_ARRAY_S")
  @js.native
  val KECCAK256_RLP_ARRAY_S: /* "1dcc4de8dec75d7aab85b567b6ccd41ad312451b948a7413f0a142fd40d49347" */ String = js.native
  
  @JSImport("@ethereumjs/util", "KECCAK256_RLP_S")
  @js.native
  val KECCAK256_RLP_S: /* "56e81f171bcc55a6ff8345e692c0f86e5b48e01b996cadc001622fb5e363b421" */ String = js.native
  
  @JSImport("@ethereumjs/util", "MAX_INTEGER")
  @js.native
  val MAX_INTEGER: js.BigInt = js.native
  
  @JSImport("@ethereumjs/util", "MAX_INTEGER_BIGINT")
  @js.native
  val MAX_INTEGER_BIGINT: js.BigInt = js.native
  
  @JSImport("@ethereumjs/util", "MAX_UINT64")
  @js.native
  val MAX_UINT64: js.BigInt = js.native
  
  @JSImport("@ethereumjs/util", "RLP_EMPTY_STRING")
  @js.native
  val RLP_EMPTY_STRING: typingsJapgolly.buffer.mod.Buffer = js.native
  
  @JSImport("@ethereumjs/util", "SECP256K1_ORDER")
  @js.native
  val SECP256K1_ORDER: js.BigInt = js.native
  
  @JSImport("@ethereumjs/util", "SECP256K1_ORDER_DIV_2")
  @js.native
  val SECP256K1_ORDER_DIV_2: js.BigInt = js.native
  
  @JSImport("@ethereumjs/util", "TWO_POW256")
  @js.native
  val TWO_POW256: js.BigInt = js.native
  
  @JSImport("@ethereumjs/util", "TypeOutput")
  @js.native
  object TypeOutput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.ethereumjsUtil.distTypesMod.TypeOutput & Double] = js.native
    
    /* 1 */ val BigInt: typingsJapgolly.ethereumjsUtil.distTypesMod.TypeOutput.BigInt & Double = js.native
    
    /* 2 */ val Buffer: typingsJapgolly.ethereumjsUtil.distTypesMod.TypeOutput.Buffer & Double = js.native
    
    /* 0 */ val Number: typingsJapgolly.ethereumjsUtil.distTypesMod.TypeOutput.Number & Double = js.native
    
    /* 3 */ val PrefixedHexString: typingsJapgolly.ethereumjsUtil.distTypesMod.TypeOutput.PrefixedHexString & Double = js.native
  }
  
  inline def addHexPrefix(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addHexPrefix")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def arrToBufArr(arr: js.typedarray.Uint8Array): Buffer | NestedBufferArray = ^.asInstanceOf[js.Dynamic].applyDynamic("arrToBufArr")(arr.asInstanceOf[js.Any]).asInstanceOf[Buffer | NestedBufferArray]
  inline def arrToBufArr(arr: NestedUint8Array): Buffer | NestedBufferArray = ^.asInstanceOf[js.Dynamic].applyDynamic("arrToBufArr")(arr.asInstanceOf[js.Any]).asInstanceOf[Buffer | NestedBufferArray]
  
  inline def arrToBufArr_Buffer(arr: js.typedarray.Uint8Array): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("arrToBufArr")(arr.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def arrToBufArr_NestedBufferArray(arr: NestedUint8Array): NestedBufferArray = ^.asInstanceOf[js.Dynamic].applyDynamic("arrToBufArr")(arr.asInstanceOf[js.Any]).asInstanceOf[NestedBufferArray]
  
  inline def arrayContainsArray(superset: js.Array[Any], subset: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayContainsArray")(superset.asInstanceOf[js.Any], subset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def arrayContainsArray(superset: js.Array[Any], subset: js.Array[Any], some: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayContainsArray")(superset.asInstanceOf[js.Any], subset.asInstanceOf[js.Any], some.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def baToJSON(ba: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("baToJSON")(ba.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def bigIntToBuffer(num: js.BigInt): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bigIntToBuffer")(num.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def bigIntToHex(num: js.BigInt): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bigIntToHex")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bigIntToUnpaddedBuffer(value: js.BigInt): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bigIntToUnpaddedBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def bufArrToArr(arr: NestedBufferArray): js.typedarray.Uint8Array | NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufArrToArr")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | NestedUint8Array]
  inline def bufArrToArr(arr: Buffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufArrToArr")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def bufArrToArr_NestedUint8Array(arr: NestedBufferArray): NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufArrToArr")(arr.asInstanceOf[js.Any]).asInstanceOf[NestedUint8Array]
  
  inline def bufArrToArr_Union(arr: Buffer): js.typedarray.Uint8Array | NestedUint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bufArrToArr")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | NestedUint8Array]
  
  inline def bufferToBigInt(buf: Buffer): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToBigInt")(buf.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def bufferToHex(buf: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHex")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bufferToInt(buf: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToInt")(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def convertSlimAccount(body: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("convertSlimAccount")(body.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def ecrecover(msgHash: Buffer, v: js.BigInt, r: Buffer, s: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ecrecover")(msgHash.asInstanceOf[js.Any], v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def ecrecover(msgHash: Buffer, v: js.BigInt, r: Buffer, s: Buffer, chainId: js.BigInt): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ecrecover")(msgHash.asInstanceOf[js.Any], v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def ecsign(msgHash: Buffer, privateKey: Buffer): ECDSASignature = (^.asInstanceOf[js.Dynamic].applyDynamic("ecsign")(msgHash.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[ECDSASignature]
  inline def ecsign(msgHash: Buffer, privateKey: Buffer, chainId: js.BigInt): ECDSASignature = (^.asInstanceOf[js.Dynamic].applyDynamic("ecsign")(msgHash.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[ECDSASignature]
  
  inline def fromAscii(stringValue: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAscii")(stringValue.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fromRpcSig(sig: String): ECDSASignature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRpcSig")(sig.asInstanceOf[js.Any]).asInstanceOf[ECDSASignature]
  
  inline def fromSigned(num: Buffer): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSigned")(num.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def fromUtf8(stringValue: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUtf8")(stringValue.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateAddress(from: Buffer, nonce: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAddress")(from.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def generateAddress2(from: Buffer, salt: Buffer, initCode: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAddress2")(from.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], initCode.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def getBinarySize(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBinarySize")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getKeys(params: js.Array[Record[String, String]], key: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeys")(params.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getKeys(params: js.Array[Record[String, String]], key: String, allowEmpty: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeys")(params.asInstanceOf[js.Any], key.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def hashPersonalMessage(message: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hashPersonalMessage")(message.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def importPublic(publicKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("importPublic")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def intToBuffer(i: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("intToBuffer")(i.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def intToHex(i: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("intToHex")(i.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isHexPrefixed(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexPrefixed")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHexString(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isHexString(value: String, length: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidAddress(hexAddress: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidChecksumAddress(hexAddress: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidChecksumAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidChecksumAddress(hexAddress: String, eip1191ChainId: BigIntLike): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidChecksumAddress")(hexAddress.asInstanceOf[js.Any], eip1191ChainId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidPrivate(privateKey: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPrivate")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidPublic(publicKey: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPublic")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isValidPublic(publicKey: Buffer, sanitize: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidPublic")(publicKey.asInstanceOf[js.Any], sanitize.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidSignature(v: js.BigInt, r: Buffer, s: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidSignature")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidSignature(v: js.BigInt, r: Buffer, s: Buffer, homesteadOrLater: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidSignature")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], homesteadOrLater.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidSignature(v: js.BigInt, r: Buffer, s: Buffer, homesteadOrLater: Boolean, chainId: js.BigInt): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidSignature")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], homesteadOrLater.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidSignature(v: js.BigInt, r: Buffer, s: Buffer, homesteadOrLater: Unit, chainId: js.BigInt): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidSignature")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], homesteadOrLater.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isZeroAddress(hexAddress: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isZeroAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def padToEven(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("padToEven")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def privateToAddress(privateKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("privateToAddress")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def privateToPublic(privateKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("privateToPublic")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def pubToAddress(pubKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("pubToAddress")(pubKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def pubToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pubToAddress")(pubKey.asInstanceOf[js.Any], sanitize.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def publicToAddress(pubKey: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("publicToAddress")(pubKey.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def publicToAddress(pubKey: Buffer, sanitize: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicToAddress")(pubKey.asInstanceOf[js.Any], sanitize.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def setLengthLeft(msg: Buffer, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("setLengthLeft")(msg.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def setLengthRight(msg: Buffer, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("setLengthRight")(msg.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def short(buffer: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("short")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def short(buffer: String, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("short")(buffer.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def short(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("short")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def short(buffer: Buffer, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("short")(buffer.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stripHexPrefix(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripHexPrefix")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toAscii(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAscii")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toBuffer(v: ToBufferInputTypes): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(v.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def toChecksumAddress(hexAddress: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toChecksumAddress")(hexAddress.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toChecksumAddress(hexAddress: String, eip1191ChainId: BigIntLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toChecksumAddress")(hexAddress.asInstanceOf[js.Any], eip1191ChainId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toCompactSig(v: js.BigInt, r: Buffer, s: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toCompactSig")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toCompactSig(v: js.BigInt, r: Buffer, s: Buffer, chainId: js.BigInt): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toCompactSig")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toRpcSig(v: js.BigInt, r: Buffer, s: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toRpcSig")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toRpcSig(v: js.BigInt, r: Buffer, s: Buffer, chainId: js.BigInt): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toRpcSig")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toType[T /* <: TypeOutput */](input: Null, outputType: T): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("toType")(input.asInstanceOf[js.Any], outputType.asInstanceOf[js.Any])).asInstanceOf[Null]
  inline def toType[T /* <: TypeOutput */](input: Unit, outputType: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toType")(input.asInstanceOf[js.Any], outputType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toType[T /* <: TypeOutput */](input: ToBufferInputTypes, outputType: T): /* import warning: importer.ImportType#apply Failed type conversion: @ethereumjs/util.@ethereumjs/util/dist/types.TypeOutputReturnType[T] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toType")(input.asInstanceOf[js.Any], outputType.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @ethereumjs/util.@ethereumjs/util/dist/types.TypeOutputReturnType[T] */ js.Any]
  
  inline def toUnsigned(num: js.BigInt): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnsigned")(num.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def toUtf8(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unpadArray(a: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadArray")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def unpadBuffer(a: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadBuffer")(a.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def unpadHexString(a: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unpadHexString")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validateNoLeadingZeroes(values: StringDictionary[js.UndefOr[Buffer]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNoLeadingZeroes")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def zeroAddress(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroAddress")().asInstanceOf[String]
  
  inline def zeros(bytes: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(bytes.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
