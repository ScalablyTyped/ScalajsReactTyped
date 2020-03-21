package typingsJapgolly.bitcoinjsLib

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.bip32.bip32Mod.BIP32Interface
import typingsJapgolly.bitcoinjsLib.addressMod.Base58CheckResult
import typingsJapgolly.bitcoinjsLib.addressMod.Bech32Result
import typingsJapgolly.bitcoinjsLib.bitcoinjsLibNumbers._4294967295
import typingsJapgolly.bitcoinjsLib.bitcoinjsLibNumbers.`0`
import typingsJapgolly.bitcoinjsLib.bitcoinjsLibNumbers.`128`
import typingsJapgolly.bitcoinjsLib.bitcoinjsLibNumbers.`1`
import typingsJapgolly.bitcoinjsLib.bitcoinjsLibNumbers.`2`
import typingsJapgolly.bitcoinjsLib.bitcoinjsLibNumbers.`3`
import typingsJapgolly.bitcoinjsLib.ecpairMod.ECPairOptions
import typingsJapgolly.bitcoinjsLib.networksMod.Network
import typingsJapgolly.bitcoinjsLib.paymentsMod.Payment
import typingsJapgolly.bitcoinjsLib.paymentsMod.PaymentOpts
import typingsJapgolly.bitcoinjsLib.paymentsMod.Stack
import typingsJapgolly.bitcoinjsLib.psbtMod.PsbtOptsOptional
import typingsJapgolly.bitcoinjsLib.scriptSignatureMod.ScriptSignature
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Block ()
    extends typingsJapgolly.bitcoinjsLib.blockMod.Block
  
  @js.native
  class Psbt ()
    extends typingsJapgolly.bitcoinjsLib.psbtMod.Psbt {
    def this(opts: PsbtOptsOptional) = this()
    def this(opts: PsbtOptsOptional, data: typingsJapgolly.bip174.mod.Psbt) = this()
  }
  
  @js.native
  class Transaction ()
    extends typingsJapgolly.bitcoinjsLib.transactionMod.Transaction
  
  @js.native
  class TransactionBuilder ()
    extends typingsJapgolly.bitcoinjsLib.transactionBuilderMod.TransactionBuilder {
    def this(network: Network) = this()
    def this(network: Network, maximumFeeRate: Double) = this()
  }
  
  /* static members */
  @js.native
  object Block extends js.Object {
    def calculateMerkleRoot(transactions: js.Array[typingsJapgolly.bitcoinjsLib.transactionMod.Transaction]): Buffer = js.native
    def calculateMerkleRoot(
      transactions: js.Array[typingsJapgolly.bitcoinjsLib.transactionMod.Transaction],
      forWitness: Boolean
    ): Buffer = js.native
    def calculateTarget(bits: Double): Buffer = js.native
    def fromBuffer(buffer: Buffer): typingsJapgolly.bitcoinjsLib.blockMod.Block = js.native
    def fromHex(hex: String): typingsJapgolly.bitcoinjsLib.blockMod.Block = js.native
  }
  
  @js.native
  object ECPair extends js.Object {
    def fromPrivateKey(buffer: Buffer): typingsJapgolly.bitcoinjsLib.ecpairMod.ECPair = js.native
    def fromPrivateKey(buffer: Buffer, options: ECPairOptions): typingsJapgolly.bitcoinjsLib.ecpairMod.ECPair = js.native
    def fromPublicKey(buffer: Buffer): typingsJapgolly.bitcoinjsLib.ecpairMod.ECPair = js.native
    def fromPublicKey(buffer: Buffer, options: ECPairOptions): typingsJapgolly.bitcoinjsLib.ecpairMod.ECPair = js.native
    def fromWIF(wifString: String): typingsJapgolly.bitcoinjsLib.ecpairMod.ECPair = js.native
    def fromWIF(wifString: String, network: js.Array[Network]): typingsJapgolly.bitcoinjsLib.ecpairMod.ECPair = js.native
    def fromWIF(wifString: String, network: Network): typingsJapgolly.bitcoinjsLib.ecpairMod.ECPair = js.native
    def makeRandom(): typingsJapgolly.bitcoinjsLib.ecpairMod.ECPair = js.native
    def makeRandom(options: ECPairOptions): typingsJapgolly.bitcoinjsLib.ecpairMod.ECPair = js.native
  }
  
  /* static members */
  @js.native
  object Psbt extends js.Object {
    def fromBase64(data: String): typingsJapgolly.bitcoinjsLib.psbtMod.Psbt = js.native
    def fromBase64(data: String, opts: PsbtOptsOptional): typingsJapgolly.bitcoinjsLib.psbtMod.Psbt = js.native
    def fromBuffer(buffer: Buffer): typingsJapgolly.bitcoinjsLib.psbtMod.Psbt = js.native
    def fromBuffer(buffer: Buffer, opts: PsbtOptsOptional): typingsJapgolly.bitcoinjsLib.psbtMod.Psbt = js.native
    def fromHex(data: String): typingsJapgolly.bitcoinjsLib.psbtMod.Psbt = js.native
    def fromHex(data: String, opts: PsbtOptsOptional): typingsJapgolly.bitcoinjsLib.psbtMod.Psbt = js.native
  }
  
  /* static members */
  @js.native
  object Transaction extends js.Object {
    val ADVANCED_TRANSACTION_FLAG: `1` = js.native
    val ADVANCED_TRANSACTION_MARKER: `0` = js.native
    val DEFAULT_SEQUENCE: _4294967295 = js.native
    val SIGHASH_ALL: `1` = js.native
    val SIGHASH_ANYONECANPAY: `128` = js.native
    val SIGHASH_NONE: `2` = js.native
    val SIGHASH_SINGLE: `3` = js.native
    def fromBuffer(buffer: Buffer): typingsJapgolly.bitcoinjsLib.transactionMod.Transaction = js.native
    def fromBuffer(buffer: Buffer, _NO_STRICT: Boolean): typingsJapgolly.bitcoinjsLib.transactionMod.Transaction = js.native
    def fromHex(hex: String): typingsJapgolly.bitcoinjsLib.transactionMod.Transaction = js.native
    def isCoinbaseHash(buffer: Buffer): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object TransactionBuilder extends js.Object {
    def fromTransaction(transaction: typingsJapgolly.bitcoinjsLib.transactionMod.Transaction): typingsJapgolly.bitcoinjsLib.transactionBuilderMod.TransactionBuilder = js.native
    def fromTransaction(transaction: typingsJapgolly.bitcoinjsLib.transactionMod.Transaction, network: Network): typingsJapgolly.bitcoinjsLib.transactionBuilderMod.TransactionBuilder = js.native
  }
  
  @js.native
  object address extends js.Object {
    def fromBase58Check(address: String): Base58CheckResult = js.native
    def fromBech32(address: String): Bech32Result = js.native
    def fromOutputScript(output: Buffer): String = js.native
    def fromOutputScript(output: Buffer, network: Network): String = js.native
    def toBase58Check(hash: Buffer, version: Double): String = js.native
    def toBech32(data: Buffer, version: Double, prefix: String): String = js.native
    def toOutputScript(address: String): Buffer = js.native
    def toOutputScript(address: String, network: Network): Buffer = js.native
  }
  
  @js.native
  object bip32 extends js.Object {
    def fromBase58(inString: String): BIP32Interface = js.native
    def fromBase58(inString: String, network: typingsJapgolly.bip32.bip32Mod.Network): BIP32Interface = js.native
    def fromPrivateKey(privateKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
    def fromPrivateKey(privateKey: Buffer, chainCode: Buffer, network: typingsJapgolly.bip32.bip32Mod.Network): BIP32Interface = js.native
    def fromPublicKey(publicKey: Buffer, chainCode: Buffer): BIP32Interface = js.native
    def fromPublicKey(publicKey: Buffer, chainCode: Buffer, network: typingsJapgolly.bip32.bip32Mod.Network): BIP32Interface = js.native
    def fromSeed(seed: Buffer): BIP32Interface = js.native
    def fromSeed(seed: Buffer, network: typingsJapgolly.bip32.bip32Mod.Network): BIP32Interface = js.native
  }
  
  @js.native
  object crypto extends js.Object {
    def hash160(buffer: Buffer): Buffer = js.native
    def hash256(buffer: Buffer): Buffer = js.native
    def ripemd160(buffer: Buffer): Buffer = js.native
    def sha1(buffer: Buffer): Buffer = js.native
    def sha256(buffer: Buffer): Buffer = js.native
  }
  
  @js.native
  object networks extends js.Object {
    val bitcoin: Network = js.native
    val regtest: Network = js.native
    val testnet: Network = js.native
  }
  
  @js.native
  object opcodes extends /* index */ StringDictionary[Double]
  
  @js.native
  object payments extends js.Object {
    def embed(a: Payment): Payment = js.native
    def embed(a: Payment, opts: PaymentOpts): Payment = js.native
    def p2ms(a: Payment): Payment = js.native
    def p2ms(a: Payment, opts: PaymentOpts): Payment = js.native
    def p2pk(a: Payment): Payment = js.native
    def p2pk(a: Payment, opts: PaymentOpts): Payment = js.native
    def p2pkh(a: Payment): Payment = js.native
    def p2pkh(a: Payment, opts: PaymentOpts): Payment = js.native
    def p2sh(a: Payment): Payment = js.native
    def p2sh(a: Payment, opts: PaymentOpts): Payment = js.native
    def p2wpkh(a: Payment): Payment = js.native
    def p2wpkh(a: Payment, opts: PaymentOpts): Payment = js.native
    def p2wsh(a: Payment): Payment = js.native
    def p2wsh(a: Payment, opts: PaymentOpts): Payment = js.native
  }
  
  @js.native
  object script extends js.Object {
    def compile(chunks: Stack): Buffer = js.native
    def compile(chunks: Buffer): Buffer = js.native
    def decompile(buffer: js.Array[Double | Buffer]): (js.Array[Double | Buffer]) | Null = js.native
    def decompile(buffer: Buffer): (js.Array[Double | Buffer]) | Null = js.native
    def fromASM(asm: String): Buffer = js.native
    def isCanonicalPubKey(buffer: Buffer): Boolean = js.native
    def isCanonicalScriptSignature(buffer: Buffer): Boolean = js.native
    def isDefinedHashType(hashType: Double): Boolean = js.native
    def isPushOnly(value: Stack): Boolean = js.native
    def toASM(chunks: js.Array[Double | Buffer]): String = js.native
    def toASM(chunks: Buffer): String = js.native
    def toStack(chunks: js.Array[Double | Buffer]): js.Array[Buffer] = js.native
    def toStack(chunks: Buffer): js.Array[Buffer] = js.native
    @js.native
    object OPS extends /* index */ StringDictionary[Double]
    
    @js.native
    object number extends js.Object {
      def decode(buffer: Buffer): Double = js.native
      def decode(buffer: Buffer, maxLength: Double): Double = js.native
      def decode(buffer: Buffer, maxLength: Double, minimal: Boolean): Double = js.native
      def encode(_number: Double): Buffer = js.native
    }
    
    @js.native
    object signature extends js.Object {
      def decode(buffer: Buffer): ScriptSignature = js.native
      def encode(signature: Buffer, hashType: Double): Buffer = js.native
    }
    
  }
  
}

