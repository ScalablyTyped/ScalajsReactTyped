package typingsJapgolly.sjcl

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.sjcl.mod.BigNumber
import typingsJapgolly.sjcl.mod.BigNumberStatic
import typingsJapgolly.sjcl.mod.BitArrayStatic
import typingsJapgolly.sjcl.mod.BitArray_
import typingsJapgolly.sjcl.mod.SjclArrayBufferModes
import typingsJapgolly.sjcl.mod.SjclCipher
import typingsJapgolly.sjcl.mod.SjclCiphers
import typingsJapgolly.sjcl.mod.SjclCodecs
import typingsJapgolly.sjcl.mod.SjclConvenienceDecryptor
import typingsJapgolly.sjcl.mod.SjclConvenienceEncryptor
import typingsJapgolly.sjcl.mod.SjclEllipticCurveCryptography
import typingsJapgolly.sjcl.mod.SjclEllipticalCurve
import typingsJapgolly.sjcl.mod.SjclEllipticalPoint
import typingsJapgolly.sjcl.mod.SjclExceptions
import typingsJapgolly.sjcl.mod.SjclHMAC
import typingsJapgolly.sjcl.mod.SjclHash
import typingsJapgolly.sjcl.mod.SjclHashStatic
import typingsJapgolly.sjcl.mod.SjclHashes
import typingsJapgolly.sjcl.mod.SjclJson
import typingsJapgolly.sjcl.mod.SjclKeyExchange
import typingsJapgolly.sjcl.mod.SjclMisc
import typingsJapgolly.sjcl.mod.SjclModes
import typingsJapgolly.sjcl.mod.SjclPointJacobian
import typingsJapgolly.sjcl.mod.SjclRandom
import typingsJapgolly.sjcl.mod.SjclRandomStatic
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object sjcl {
    
    @JSGlobal("sjcl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("sjcl.SjclECCPublicKey")
    @js.native
    open class SjclECCPublicKey ()
      extends typingsJapgolly.sjcl.mod.SjclECCPublicKey
    
    @JSGlobal("sjcl.SjclECCSecretKey")
    @js.native
    open class SjclECCSecretKey ()
      extends typingsJapgolly.sjcl.mod.SjclECCSecretKey
    
    @JSGlobal("sjcl.SjclECDSAPublicKey")
    @js.native
    open class SjclECDSAPublicKey ()
      extends typingsJapgolly.sjcl.mod.SjclECDSAPublicKey
    
    @JSGlobal("sjcl.SjclECDSASecretKey")
    @js.native
    open class SjclECDSASecretKey ()
      extends typingsJapgolly.sjcl.mod.SjclECDSASecretKey
    
    @JSGlobal("sjcl.SjclElGamalPublicKey")
    @js.native
    open class SjclElGamalPublicKey ()
      extends typingsJapgolly.sjcl.mod.SjclElGamalPublicKey
    
    @JSGlobal("sjcl.SjclElGamalSecretKey")
    @js.native
    open class SjclElGamalSecretKey ()
      extends typingsJapgolly.sjcl.mod.SjclElGamalSecretKey
    
    @JSGlobal("sjcl.SjclPRFFamily")
    @js.native
    open class SjclPRFFamily ()
      extends typingsJapgolly.sjcl.mod.SjclPRFFamily
    
    @JSGlobal("sjcl.arrayBuffer")
    @js.native
    def arrayBuffer: SjclArrayBufferModes = js.native
    inline def arrayBuffer_=(x: SjclArrayBufferModes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayBuffer")(x.asInstanceOf[js.Any])
    
    @JSGlobal("sjcl.bitArray")
    @js.native
    def bitArray: BitArrayStatic = js.native
    inline def bitArray_=(x: BitArrayStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitArray")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("sjcl.bn")
    @js.native
    open class bn ()
      extends StObject
         with BigNumber {
      def this(n: String) = this()
      def this(n: Double) = this()
      def this(n: BigNumber) = this()
    }
    @JSGlobal("sjcl.bn")
    @js.native
    def bn: BigNumberStatic = js.native
    inline def bn_=(x: BigNumberStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bn")(x.asInstanceOf[js.Any])
    
    object cipher extends Shortcut {
      
      @JSGlobal("sjcl.cipher")
      @js.native
      val ^ : SjclCiphers = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.cipher.aes")
      @js.native
      open class aes protected ()
        extends StObject
           with SjclCipher {
        def this(key: js.Array[Double]) = this()
        
        /* CompleteClass */
        override def decrypt(data: js.Array[Double]): js.Array[Double] = js.native
        
        /* CompleteClass */
        override def encrypt(data: js.Array[Double]): js.Array[Double] = js.native
      }
      
      type _To = SjclCiphers
      
      /* This means you don't have to write `^`, but can instead just say `cipher.foo` */
      override def _to: SjclCiphers = ^
    }
    
    @JSGlobal("sjcl.codec")
    @js.native
    def codec: SjclCodecs = js.native
    inline def codec_=(x: SjclCodecs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codec")(x.asInstanceOf[js.Any])
    
    @JSGlobal("sjcl.decrypt")
    @js.native
    def decrypt: SjclConvenienceDecryptor = js.native
    inline def decrypt_=(x: SjclConvenienceDecryptor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decrypt")(x.asInstanceOf[js.Any])
    
    object ecc extends Shortcut {
      
      @JSGlobal("sjcl.ecc")
      @js.native
      val ^ : SjclEllipticCurveCryptography = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.ecc.curve")
      @js.native
      open class curve protected ()
        extends StObject
           with SjclEllipticalCurve {
        def this(Field: BigNumber, r: BigNumber, a: BigNumber, b: BigNumber, x: BigNumber, y: BigNumber) = this()
        
        /* CompleteClass */
        override def fromBits(bits: BitArray_): SjclEllipticalPoint = js.native
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.ecc.point")
      @js.native
      open class point protected ()
        extends StObject
           with SjclEllipticalPoint {
        def this(curve: SjclEllipticalCurve) = this()
        def this(curve: SjclEllipticalCurve, x: BigNumber) = this()
        def this(curve: SjclEllipticalCurve, x: Unit, y: BigNumber) = this()
        def this(curve: SjclEllipticalCurve, x: BigNumber, y: BigNumber) = this()
        
        /* CompleteClass */
        override def isValid(): Boolean = js.native
        
        /* CompleteClass */
        override def mult(k: BigNumber): SjclEllipticalPoint = js.native
        
        /* CompleteClass */
        override def mult2(k: BigNumber, k2: BigNumber, affine2: SjclEllipticalPoint): SjclEllipticalPoint = js.native
        
        /* CompleteClass */
        override def multiples(): js.Array[SjclEllipticalPoint] = js.native
        
        /* CompleteClass */
        override def negate(): SjclEllipticalPoint = js.native
        
        /* CompleteClass */
        override def toBits(): BitArray_ = js.native
        
        /* CompleteClass */
        override def toJac(): SjclPointJacobian = js.native
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.ecc.pointJac")
      @js.native
      open class pointJac protected ()
        extends StObject
           with SjclPointJacobian {
        def this(curve: SjclEllipticalCurve) = this()
        def this(curve: SjclEllipticalCurve, x: BigNumber) = this()
        def this(curve: SjclEllipticalCurve, x: Unit, y: BigNumber) = this()
        def this(curve: SjclEllipticalCurve, x: BigNumber, y: BigNumber) = this()
        def this(curve: SjclEllipticalCurve, x: Unit, y: Unit, z: BigNumber) = this()
        def this(curve: SjclEllipticalCurve, x: Unit, y: BigNumber, z: BigNumber) = this()
        def this(curve: SjclEllipticalCurve, x: BigNumber, y: Unit, z: BigNumber) = this()
        def this(curve: SjclEllipticalCurve, x: BigNumber, y: BigNumber, z: BigNumber) = this()
        
        /* CompleteClass */
        override def add(T: SjclEllipticalPoint): SjclPointJacobian = js.native
        
        /* CompleteClass */
        override def doubl(): SjclPointJacobian = js.native
        
        /* CompleteClass */
        override def isValid(): Boolean = js.native
        
        /* CompleteClass */
        override def mult(k: BigNumber, affine: SjclEllipticalPoint): SjclPointJacobian = js.native
        
        /* CompleteClass */
        override def mult2(k1: BigNumber, affine: SjclEllipticalPoint, k2: BigNumber, affine2: SjclEllipticalPoint): SjclPointJacobian = js.native
        
        /* CompleteClass */
        override def negate(): SjclPointJacobian = js.native
        
        /* CompleteClass */
        override def toAffine(): SjclEllipticalPoint = js.native
      }
      
      type _To = SjclEllipticCurveCryptography
      
      /* This means you don't have to write `^`, but can instead just say `ecc.foo` */
      override def _to: SjclEllipticCurveCryptography = ^
    }
    
    @JSGlobal("sjcl.encrypt")
    @js.native
    def encrypt: SjclConvenienceEncryptor = js.native
    inline def encrypt_=(x: SjclConvenienceEncryptor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(x.asInstanceOf[js.Any])
    
    object exception extends Shortcut {
      
      @JSGlobal("sjcl.exception")
      @js.native
      val ^ : SjclExceptions = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.exception.bug")
      @js.native
      open class bug protected ()
        extends StObject
           with Error {
        def this(message: String) = this()
        
        /* standard es5 */
        /* CompleteClass */
        var message: String = js.native
        
        /* standard es5 */
        /* CompleteClass */
        var name: String = js.native
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.exception.corrupt")
      @js.native
      open class corrupt protected ()
        extends StObject
           with Error {
        def this(message: String) = this()
        
        /* standard es5 */
        /* CompleteClass */
        var message: String = js.native
        
        /* standard es5 */
        /* CompleteClass */
        var name: String = js.native
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.exception.invalid")
      @js.native
      open class invalid protected ()
        extends StObject
           with Error {
        def this(message: String) = this()
        
        /* standard es5 */
        /* CompleteClass */
        var message: String = js.native
        
        /* standard es5 */
        /* CompleteClass */
        var name: String = js.native
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.exception.notReady")
      @js.native
      open class notReady protected ()
        extends StObject
           with Error {
        def this(message: String) = this()
        
        /* standard es5 */
        /* CompleteClass */
        var message: String = js.native
        
        /* standard es5 */
        /* CompleteClass */
        var name: String = js.native
      }
      
      type _To = SjclExceptions
      
      /* This means you don't have to write `^`, but can instead just say `exception.foo` */
      override def _to: SjclExceptions = ^
    }
    
    object hash extends Shortcut {
      
      @JSGlobal("sjcl.hash")
      @js.native
      val ^ : SjclHashes = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.hash.ripemd160")
      @js.native
      open class ripemd160 ()
        extends StObject
           with SjclHash {
        def this(hash: SjclHash) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.hash.sha1")
      @js.native
      open class sha1 ()
        extends StObject
           with SjclHash {
        def this(hash: SjclHash) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.hash.sha256")
      @js.native
      open class sha256 ()
        extends StObject
           with SjclHash {
        def this(hash: SjclHash) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.hash.sha512")
      @js.native
      open class sha512 ()
        extends StObject
           with SjclHash {
        def this(hash: SjclHash) = this()
      }
      
      type _To = SjclHashes
      
      /* This means you don't have to write `^`, but can instead just say `hash.foo` */
      override def _to: SjclHashes = ^
    }
    
    @JSGlobal("sjcl.json")
    @js.native
    def json: SjclJson = js.native
    inline def json_=(x: SjclJson): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])
    
    @JSGlobal("sjcl.keyexchange")
    @js.native
    def keyexchange: SjclKeyExchange = js.native
    inline def keyexchange_=(x: SjclKeyExchange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyexchange")(x.asInstanceOf[js.Any])
    
    object misc extends Shortcut {
      
      @JSGlobal("sjcl.misc")
      @js.native
      val ^ : SjclMisc = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sjcl.misc.hmac")
      @js.native
      open class hmac protected () extends SjclHMAC {
        def this(key: BitArray_) = this()
        def this(key: BitArray_, Hash: SjclHashStatic) = this()
      }
      
      type _To = SjclMisc
      
      /* This means you don't have to write `^`, but can instead just say `misc.foo` */
      override def _to: SjclMisc = ^
    }
    
    @JSGlobal("sjcl.mode")
    @js.native
    def mode: SjclModes = js.native
    inline def mode_=(x: SjclModes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("sjcl.prng")
    @js.native
    open class prng protected ()
      extends StObject
         with SjclRandom {
      def this(defaultParanoia: Double) = this()
    }
    @JSGlobal("sjcl.prng")
    @js.native
    def prng: SjclRandomStatic = js.native
    inline def prng_=(x: SjclRandomStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prng")(x.asInstanceOf[js.Any])
    
    @JSGlobal("sjcl.random")
    @js.native
    def random: SjclRandom = js.native
    inline def random_=(x: SjclRandom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("random")(x.asInstanceOf[js.Any])
  }
}
