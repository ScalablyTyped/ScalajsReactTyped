package typingsJapgolly.bitcoinjsLib

import typingsJapgolly.bitcoinjsLib.srcAddressMod.Base58CheckResult
import typingsJapgolly.bitcoinjsLib.srcAddressMod.Bech32Result
import typingsJapgolly.bitcoinjsLib.srcCryptoMod.TaggedHashPrefix
import typingsJapgolly.bitcoinjsLib.srcNetworksMod.Network
import typingsJapgolly.bitcoinjsLib.srcPaymentsMod.Payment
import typingsJapgolly.bitcoinjsLib.srcPaymentsMod.PaymentOpts
import typingsJapgolly.bitcoinjsLib.srcPaymentsMod.Stack
import typingsJapgolly.bitcoinjsLib.srcPsbtMod.PsbtOptsOptional
import typingsJapgolly.bitcoinjsLib.srcScriptSignatureMod.ScriptSignature
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bitcoinjs-lib", "Block")
  @js.native
  open class Block ()
    extends typingsJapgolly.bitcoinjsLib.srcBlockMod.Block
  /* static members */
  object Block {
    
    @JSImport("bitcoinjs-lib", "Block")
    @js.native
    val ^ : js.Any = js.native
    
    inline def calculateMerkleRoot(transactions: js.Array[typingsJapgolly.bitcoinjsLib.srcTransactionMod.Transaction]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateMerkleRoot")(transactions.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def calculateMerkleRoot(
      transactions: js.Array[typingsJapgolly.bitcoinjsLib.srcTransactionMod.Transaction],
      forWitness: Boolean
    ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateMerkleRoot")(transactions.asInstanceOf[js.Any], forWitness.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def calculateTarget(bits: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateTarget")(bits.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def fromBuffer(buffer: Buffer): typingsJapgolly.bitcoinjsLib.srcBlockMod.Block = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitcoinjsLib.srcBlockMod.Block]
    
    inline def fromHex(hex: String): typingsJapgolly.bitcoinjsLib.srcBlockMod.Block = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitcoinjsLib.srcBlockMod.Block]
  }
  
  @JSImport("bitcoinjs-lib", "Psbt")
  @js.native
  open class Psbt ()
    extends typingsJapgolly.bitcoinjsLib.srcPsbtMod.Psbt {
    def this(opts: PsbtOptsOptional) = this()
    def this(opts: Unit, data: typingsJapgolly.bip174.mod.Psbt) = this()
    def this(opts: PsbtOptsOptional, data: typingsJapgolly.bip174.mod.Psbt) = this()
  }
  /* static members */
  object Psbt {
    
    @JSImport("bitcoinjs-lib", "Psbt")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBase64(data: String): typingsJapgolly.bitcoinjsLib.srcPsbtMod.Psbt = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitcoinjsLib.srcPsbtMod.Psbt]
    inline def fromBase64(data: String, opts: PsbtOptsOptional): typingsJapgolly.bitcoinjsLib.srcPsbtMod.Psbt = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bitcoinjsLib.srcPsbtMod.Psbt]
    
    inline def fromBuffer(buffer: Buffer): typingsJapgolly.bitcoinjsLib.srcPsbtMod.Psbt = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitcoinjsLib.srcPsbtMod.Psbt]
    inline def fromBuffer(buffer: Buffer, opts: PsbtOptsOptional): typingsJapgolly.bitcoinjsLib.srcPsbtMod.Psbt = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bitcoinjsLib.srcPsbtMod.Psbt]
    
    inline def fromHex(data: String): typingsJapgolly.bitcoinjsLib.srcPsbtMod.Psbt = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitcoinjsLib.srcPsbtMod.Psbt]
    inline def fromHex(data: String, opts: PsbtOptsOptional): typingsJapgolly.bitcoinjsLib.srcPsbtMod.Psbt = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bitcoinjsLib.srcPsbtMod.Psbt]
  }
  
  @JSImport("bitcoinjs-lib", "Transaction")
  @js.native
  open class Transaction ()
    extends typingsJapgolly.bitcoinjsLib.srcTransactionMod.Transaction
  /* static members */
  object Transaction {
    
    @JSImport("bitcoinjs-lib", "Transaction")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.ADVANCED_TRANSACTION_FLAG")
    @js.native
    val ADVANCED_TRANSACTION_FLAG: /* 1 */ Double = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.ADVANCED_TRANSACTION_MARKER")
    @js.native
    val ADVANCED_TRANSACTION_MARKER: /* 0 */ Double = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.DEFAULT_SEQUENCE")
    @js.native
    val DEFAULT_SEQUENCE: /* 4294967295.0 */ Double = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.SIGHASH_ALL")
    @js.native
    val SIGHASH_ALL: /* 1 */ Double = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.SIGHASH_ANYONECANPAY")
    @js.native
    val SIGHASH_ANYONECANPAY: /* 128 */ Double = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.SIGHASH_DEFAULT")
    @js.native
    val SIGHASH_DEFAULT: /* 0 */ Double = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.SIGHASH_INPUT_MASK")
    @js.native
    val SIGHASH_INPUT_MASK: /* 128 */ Double = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.SIGHASH_NONE")
    @js.native
    val SIGHASH_NONE: /* 2 */ Double = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.SIGHASH_OUTPUT_MASK")
    @js.native
    val SIGHASH_OUTPUT_MASK: /* 3 */ Double = js.native
    
    @JSImport("bitcoinjs-lib", "Transaction.SIGHASH_SINGLE")
    @js.native
    val SIGHASH_SINGLE: /* 3 */ Double = js.native
    
    inline def fromBuffer(buffer: Buffer): typingsJapgolly.bitcoinjsLib.srcTransactionMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitcoinjsLib.srcTransactionMod.Transaction]
    inline def fromBuffer(buffer: Buffer, _NO_STRICT: Boolean): typingsJapgolly.bitcoinjsLib.srcTransactionMod.Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], _NO_STRICT.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bitcoinjsLib.srcTransactionMod.Transaction]
    
    inline def fromHex(hex: String): typingsJapgolly.bitcoinjsLib.srcTransactionMod.Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitcoinjsLib.srcTransactionMod.Transaction]
    
    inline def isCoinbaseHash(buffer: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCoinbaseHash")(buffer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object address {
    
    @JSImport("bitcoinjs-lib", "address")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBase58Check(address: String): Base58CheckResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase58Check")(address.asInstanceOf[js.Any]).asInstanceOf[Base58CheckResult]
    
    inline def fromBech32(address: String): Bech32Result = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBech32")(address.asInstanceOf[js.Any]).asInstanceOf[Bech32Result]
    
    inline def fromOutputScript(output: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOutputScript")(output.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fromOutputScript(output: Buffer, network: Network): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromOutputScript")(output.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toBase58Check(hash: Buffer, version: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBase58Check")(hash.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toBech32(data: Buffer, version: Double, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBech32")(data.asInstanceOf[js.Any], version.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toOutputScript(address: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toOutputScript")(address.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def toOutputScript(address: String, network: Network): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("toOutputScript")(address.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  }
  
  object crypto {
    
    @JSImport("bitcoinjs-lib", "crypto")
    @js.native
    val ^ : js.Any = js.native
    
    inline def hash160(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hash160")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def hash256(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hash256")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def ripemd160(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def sha1(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def sha256(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def taggedHash(prefix: TaggedHashPrefix, data: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("taggedHash")(prefix.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  }
  
  object networks {
    
    @JSImport("bitcoinjs-lib", "networks.bitcoin")
    @js.native
    val bitcoin: Network = js.native
    
    @JSImport("bitcoinjs-lib", "networks.regtest")
    @js.native
    val regtest: Network = js.native
    
    @JSImport("bitcoinjs-lib", "networks.testnet")
    @js.native
    val testnet: Network = js.native
  }
  
  object payments {
    
    @JSImport("bitcoinjs-lib", "payments")
    @js.native
    val ^ : js.Any = js.native
    
    inline def embed(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("embed")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
    inline def embed(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("embed")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
    
    inline def p2ms(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2ms")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
    inline def p2ms(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2ms")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
    
    inline def p2pk(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2pk")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
    inline def p2pk(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2pk")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
    
    inline def p2pkh(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2pkh")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
    inline def p2pkh(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2pkh")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
    
    inline def p2sh(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2sh")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
    inline def p2sh(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2sh")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
    
    inline def p2wpkh(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2wpkh")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
    inline def p2wpkh(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2wpkh")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
    
    inline def p2wsh(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2wsh")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
    inline def p2wsh(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2wsh")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
  }
  
  object script {
    
    @JSImport("bitcoinjs-lib", "script")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compile(chunks: Stack): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(chunks.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def compile(chunks: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(chunks.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def decompile(buffer: js.Array[Double | Buffer]): (js.Array[Double | Buffer]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("decompile")(buffer.asInstanceOf[js.Any]).asInstanceOf[(js.Array[Double | Buffer]) | Null]
    inline def decompile(buffer: Buffer): (js.Array[Double | Buffer]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("decompile")(buffer.asInstanceOf[js.Any]).asInstanceOf[(js.Array[Double | Buffer]) | Null]
    
    inline def fromASM(asm: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromASM")(asm.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def isCanonicalPubKey(buffer: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCanonicalPubKey")(buffer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isCanonicalScriptSignature(buffer: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCanonicalScriptSignature")(buffer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isDefinedHashType(hashType: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefinedHashType")(hashType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isPushOnly(value: Stack): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPushOnly")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    object number {
      
      @JSImport("bitcoinjs-lib", "script.number")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decode(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
      inline def decode(buffer: Buffer, maxLength: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def decode(buffer: Buffer, maxLength: Double, minimal: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], minimal.asInstanceOf[js.Any])).asInstanceOf[Double]
      inline def decode(buffer: Buffer, maxLength: Unit, minimal: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], minimal.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def encode(_number: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(_number.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    }
    
    object signature {
      
      @JSImport("bitcoinjs-lib", "script.signature")
      @js.native
      val ^ : js.Any = js.native
      
      inline def decode(buffer: Buffer): ScriptSignature = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[ScriptSignature]
      
      inline def encode(signature: Buffer, hashType: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(signature.asInstanceOf[js.Any], hashType.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    }
    
    inline def toASM(chunks: js.Array[Double | Buffer]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toASM")(chunks.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toASM(chunks: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toASM")(chunks.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toStack(chunks: js.Array[Double | Buffer]): js.Array[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("toStack")(chunks.asInstanceOf[js.Any]).asInstanceOf[js.Array[Buffer]]
    inline def toStack(chunks: Buffer): js.Array[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("toStack")(chunks.asInstanceOf[js.Any]).asInstanceOf[js.Array[Buffer]]
  }
}
