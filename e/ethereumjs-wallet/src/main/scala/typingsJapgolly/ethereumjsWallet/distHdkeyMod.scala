package typingsJapgolly.ethereumjsWallet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHdkeyMod {
  
  @JSImport("ethereumjs-wallet/dist/hdkey", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with EthereumHDKey {
    def this(_hdkey: Any) = this()
    
    /* private */ /* CompleteClass */
    override val _hdkey: Any = js.native
    
    /**
      * Derive a node based on a child index
      */
    /* CompleteClass */
    override def deriveChild(index: Double): EthereumHDKey = js.native
    
    /**
      * Derives a node based on a path (e.g. m/44'/0'/0/1)
      */
    /* CompleteClass */
    override def derivePath(path: String): EthereumHDKey = js.native
    
    /**
      * Return a `Wallet` instance as seen above
      */
    /* CompleteClass */
    override def getWallet(): typingsJapgolly.ethereumjsWallet.mod.default = js.native
    
    /**
      * Returns a BIP32 extended private key (xprv)
      */
    /* CompleteClass */
    override def privateExtendedKey(): Buffer = js.native
    
    /**
      * Return a BIP32 extended public key (xpub)
      */
    /* CompleteClass */
    override def publicExtendedKey(): Buffer = js.native
  }
  /* static members */
  object default {
    
    @JSImport("ethereumjs-wallet/dist/hdkey", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an instance based on a BIP32 extended private or public key.
      */
    inline def fromExtendedKey(base58Key: String): EthereumHDKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(base58Key.asInstanceOf[js.Any]).asInstanceOf[EthereumHDKey]
    
    /**
      * Creates an instance based on a seed.
      *
      * For the seed we suggest to use [bip39](https://npmjs.org/package/bip39) to
      * create one from a BIP39 mnemonic.
      */
    inline def fromMasterSeed(seedBuffer: Buffer): EthereumHDKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMasterSeed")(seedBuffer.asInstanceOf[js.Any]).asInstanceOf[EthereumHDKey]
  }
  
  trait EthereumHDKey extends StObject {
    
    /* private */ val _hdkey: Any
    
    /**
      * Derive a node based on a child index
      */
    def deriveChild(index: Double): EthereumHDKey
    
    /**
      * Derives a node based on a path (e.g. m/44'/0'/0/1)
      */
    def derivePath(path: String): EthereumHDKey
    
    /**
      * Return a `Wallet` instance as seen above
      */
    def getWallet(): typingsJapgolly.ethereumjsWallet.mod.default
    
    /**
      * Returns a BIP32 extended private key (xprv)
      */
    def privateExtendedKey(): Buffer
    
    /**
      * Return a BIP32 extended public key (xpub)
      */
    def publicExtendedKey(): Buffer
  }
  object EthereumHDKey {
    
    inline def apply(
      _hdkey: Any,
      deriveChild: Double => EthereumHDKey,
      derivePath: String => EthereumHDKey,
      getWallet: CallbackTo[typingsJapgolly.ethereumjsWallet.mod.default],
      privateExtendedKey: CallbackTo[Buffer],
      publicExtendedKey: CallbackTo[Buffer]
    ): EthereumHDKey = {
      val __obj = js.Dynamic.literal(_hdkey = _hdkey.asInstanceOf[js.Any], deriveChild = js.Any.fromFunction1(deriveChild), derivePath = js.Any.fromFunction1(derivePath), getWallet = getWallet.toJsFn, privateExtendedKey = privateExtendedKey.toJsFn, publicExtendedKey = publicExtendedKey.toJsFn)
      __obj.asInstanceOf[EthereumHDKey]
    }
    
    extension [Self <: EthereumHDKey](x: Self) {
      
      inline def setDeriveChild(value: Double => EthereumHDKey): Self = StObject.set(x, "deriveChild", js.Any.fromFunction1(value))
      
      inline def setDerivePath(value: String => EthereumHDKey): Self = StObject.set(x, "derivePath", js.Any.fromFunction1(value))
      
      inline def setGetWallet(value: CallbackTo[typingsJapgolly.ethereumjsWallet.mod.default]): Self = StObject.set(x, "getWallet", value.toJsFn)
      
      inline def setPrivateExtendedKey(value: CallbackTo[Buffer]): Self = StObject.set(x, "privateExtendedKey", value.toJsFn)
      
      inline def setPublicExtendedKey(value: CallbackTo[Buffer]): Self = StObject.set(x, "publicExtendedKey", value.toJsFn)
      
      inline def set_hdkey(value: Any): Self = StObject.set(x, "_hdkey", value.asInstanceOf[js.Any])
    }
  }
}
