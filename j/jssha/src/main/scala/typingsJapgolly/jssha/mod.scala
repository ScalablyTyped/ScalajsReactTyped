package typingsJapgolly.jssha

import typingsJapgolly.jssha.anon.B64Pad
import typingsJapgolly.jssha.anon.OutputLen
import typingsJapgolly.jssha.anon.OutputUpper
import typingsJapgolly.jssha.anon.ShakeLen
import typingsJapgolly.jssha.anon.`1`
import typingsJapgolly.jssha.anon.`2`
import typingsJapgolly.jssha.jsshaStrings.ARRAYBUFFER
import typingsJapgolly.jssha.jsshaStrings.B64
import typingsJapgolly.jssha.jsshaStrings.BYTES
import typingsJapgolly.jssha.jsshaStrings.CSHAKE128
import typingsJapgolly.jssha.jsshaStrings.CSHAKE256
import typingsJapgolly.jssha.jsshaStrings.HEX
import typingsJapgolly.jssha.jsshaStrings.KMAC128
import typingsJapgolly.jssha.jsshaStrings.KMAC256
import typingsJapgolly.jssha.jsshaStrings.SHAKE128
import typingsJapgolly.jssha.jsshaStrings.SHAKE256
import typingsJapgolly.jssha.jsshaStrings.TEXT
import typingsJapgolly.jssha.jsshaStrings.UINT8ARRAY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jssha", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with jsSHA {
    def this(variant: CSHAKE128 | CSHAKE256 | SHAKE128 | SHAKE256, inputFormat: TEXT) = this()
    def this(variant: CSHAKE128 | CSHAKE256 | SHAKE128 | SHAKE256, inputFormat: FormatNoTextType) = this()
    /**
      * @param variant The desired SHA variant (SHA-1, SHA-224, SHA-256, SHA-384, SHA-512, SHA3-224, SHA3-256, SHA3-256,
      *   SHA3-384, SHA3-512, SHAKE128, SHAKE256, CSHAKE128, CSHAKE256, KMAC128, or KMAC256) as a string.
      * @param inputFormat The input format to be used in future `update` calls (TEXT, HEX, B64, BYTES, ARRAYBUFFER,
      *   or UINT8ARRAY) as a string.
      * @param options Options in the form of { encoding?: "UTF8" | "UTF16BE" | "UTF16LE"; numRounds?: number }.
      *   `encoding` is for only TEXT input (defaults to UTF8) and `numRounds` defaults to 1.
      *   `numRounds` is not valid for any of the MAC or CSHAKE variants.
      *   * If the variant supports HMAC, `options` may have an additional `hmacKey` key which must be in the form of
      *     {value: <INPUT>, format: <FORMAT>, encoding?: "UTF8" | "UTF16BE" | "UTF16LE"} where <FORMAT> takes the same
      *     values as `inputFormat` and <INPUT> can be a `string | ArrayBuffer | Uint8Array` depending on <FORMAT>.
      *     Supplying this key switches to HMAC calculation and replaces the now deprecated call to `setHMACKey`.
      *   * If the variant is CSHAKE128 or CSHAKE256, `options` may have two additional keys, `customization` and `funcName`,
      *     which are the NIST customization and function-name strings.  Both must be in the same form as `hmacKey`.
      *   * If the variant is KMAC128 or KMAC256, `options` can include the `customization` key from CSHAKE variants and
      *     *must* have a `kmacKey` key that takes the same form as the `customization` key.
      */
    def this(variant: FixedLengthVariantType, inputFormat: TEXT) = this()
    def this(variant: FixedLengthVariantType, inputFormat: FormatNoTextType) = this()
    def this(variant: CSHAKE128 | CSHAKE256, inputFormat: TEXT, options: CSHAKEOptionsEncodingType) = this()
    def this(variant: KMAC128 | KMAC256, inputFormat: TEXT, options: KMACOptionsEncodingType) = this()
    def this(variant: SHAKE128 | SHAKE256, inputFormat: TEXT, options: SHAKEOptionsEncodingType) = this()
    def this(
      variant: CSHAKE128 | CSHAKE256,
      inputFormat: FormatNoTextType,
      options: CSHAKEOptionsNoEncodingType
    ) = this()
    def this(variant: KMAC128 | KMAC256, inputFormat: FormatNoTextType, options: KMACOptionsNoEncodingType) = this()
    def this(variant: SHAKE128 | SHAKE256, inputFormat: FormatNoTextType, options: SHAKEOptionsNoEncodingType) = this()
    def this(variant: FixedLengthVariantType, inputFormat: TEXT, options: FixedLengthOptionsEncodingType) = this()
    def this(
      variant: FixedLengthVariantType,
      inputFormat: FormatNoTextType,
      options: FixedLengthOptionsNoEncodingType
    ) = this()
  }
  
  trait CSHAKEOptionsEncodingType
    extends StObject
       with CSHAKEOptionsNoEncodingType {
    
    var encoding: js.UndefOr[EncodingType] = js.undefined
  }
  object CSHAKEOptionsEncodingType {
    
    inline def apply(): CSHAKEOptionsEncodingType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSHAKEOptionsEncodingType]
    }
    
    extension [Self <: CSHAKEOptionsEncodingType](x: Self) {
      
      inline def setEncoding(value: EncodingType): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  trait CSHAKEOptionsNoEncodingType extends StObject {
    
    var customization: js.UndefOr[GenericInputType] = js.undefined
    
    var funcName: js.UndefOr[GenericInputType] = js.undefined
  }
  object CSHAKEOptionsNoEncodingType {
    
    inline def apply(): CSHAKEOptionsNoEncodingType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSHAKEOptionsNoEncodingType]
    }
    
    extension [Self <: CSHAKEOptionsNoEncodingType](x: Self) {
      
      inline def setCustomization(value: GenericInputType): Self = StObject.set(x, "customization", value.asInstanceOf[js.Any])
      
      inline def setCustomizationUndefined: Self = StObject.set(x, "customization", js.undefined)
      
      inline def setFuncName(value: GenericInputType): Self = StObject.set(x, "funcName", value.asInstanceOf[js.Any])
      
      inline def setFuncNameUndefined: Self = StObject.set(x, "funcName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jssha.jsshaStrings.UTF8
    - typingsJapgolly.jssha.jsshaStrings.UTF16BE
    - typingsJapgolly.jssha.jsshaStrings.UTF16LE
  */
  trait EncodingType extends StObject
  object EncodingType {
    
    inline def UTF16BE: typingsJapgolly.jssha.jsshaStrings.UTF16BE = "UTF16BE".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.UTF16BE]
    
    inline def UTF16LE: typingsJapgolly.jssha.jsshaStrings.UTF16LE = "UTF16LE".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.UTF16LE]
    
    inline def UTF8: typingsJapgolly.jssha.jsshaStrings.UTF8 = "UTF8".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.UTF8]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jssha.anon.Encoding
    - typingsJapgolly.jssha.anon.NumRounds
  */
  trait FixedLengthOptionsEncodingType extends StObject
  object FixedLengthOptionsEncodingType {
    
    inline def Encoding(): typingsJapgolly.jssha.anon.Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.jssha.anon.Encoding]
    }
    
    inline def NumRounds(): typingsJapgolly.jssha.anon.NumRounds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.jssha.anon.NumRounds]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jssha.anon.HmacKey
    - typingsJapgolly.jssha.anon.`0`
  */
  trait FixedLengthOptionsNoEncodingType extends StObject
  object FixedLengthOptionsNoEncodingType {
    
    inline def `0`(): typingsJapgolly.jssha.anon.`0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.jssha.anon.`0`]
    }
    
    inline def HmacKey(): typingsJapgolly.jssha.anon.HmacKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.jssha.anon.HmacKey]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jssha.jsshaStrings.`SHA-1`
    - typingsJapgolly.jssha.jsshaStrings.`SHA-224`
    - typingsJapgolly.jssha.jsshaStrings.`SHA-256`
    - typingsJapgolly.jssha.jsshaStrings.`SHA-384`
    - typingsJapgolly.jssha.jsshaStrings.`SHA-512`
    - typingsJapgolly.jssha.jsshaStrings.`SHA3-224`
    - typingsJapgolly.jssha.jsshaStrings.`SHA3-256`
    - typingsJapgolly.jssha.jsshaStrings.`SHA3-384`
    - typingsJapgolly.jssha.jsshaStrings.`SHA3-512`
  */
  trait FixedLengthVariantType extends StObject
  object FixedLengthVariantType {
    
    inline def `SHA-1`: typingsJapgolly.jssha.jsshaStrings.`SHA-1` = "SHA-1".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.`SHA-1`]
    
    inline def `SHA-224`: typingsJapgolly.jssha.jsshaStrings.`SHA-224` = "SHA-224".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.`SHA-224`]
    
    inline def `SHA-256`: typingsJapgolly.jssha.jsshaStrings.`SHA-256` = "SHA-256".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.`SHA-256`]
    
    inline def `SHA-384`: typingsJapgolly.jssha.jsshaStrings.`SHA-384` = "SHA-384".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.`SHA-384`]
    
    inline def `SHA-512`: typingsJapgolly.jssha.jsshaStrings.`SHA-512` = "SHA-512".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.`SHA-512`]
    
    inline def `SHA3-224`: typingsJapgolly.jssha.jsshaStrings.`SHA3-224` = "SHA3-224".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.`SHA3-224`]
    
    inline def `SHA3-256`: typingsJapgolly.jssha.jsshaStrings.`SHA3-256` = "SHA3-256".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.`SHA3-256`]
    
    inline def `SHA3-384`: typingsJapgolly.jssha.jsshaStrings.`SHA3-384` = "SHA3-384".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.`SHA3-384`]
    
    inline def `SHA3-512`: typingsJapgolly.jssha.jsshaStrings.`SHA3-512` = "SHA3-512".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.`SHA3-512`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jssha.jsshaStrings.HEX
    - typingsJapgolly.jssha.jsshaStrings.B64
    - typingsJapgolly.jssha.jsshaStrings.BYTES
    - typingsJapgolly.jssha.jsshaStrings.ARRAYBUFFER
    - typingsJapgolly.jssha.jsshaStrings.UINT8ARRAY
  */
  trait FormatNoTextType extends StObject
  object FormatNoTextType {
    
    inline def ARRAYBUFFER: typingsJapgolly.jssha.jsshaStrings.ARRAYBUFFER = "ARRAYBUFFER".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.ARRAYBUFFER]
    
    inline def B64: typingsJapgolly.jssha.jsshaStrings.B64 = "B64".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.B64]
    
    inline def BYTES: typingsJapgolly.jssha.jsshaStrings.BYTES = "BYTES".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.BYTES]
    
    inline def HEX: typingsJapgolly.jssha.jsshaStrings.HEX = "HEX".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.HEX]
    
    inline def UINT8ARRAY: typingsJapgolly.jssha.jsshaStrings.UINT8ARRAY = "UINT8ARRAY".asInstanceOf[typingsJapgolly.jssha.jsshaStrings.UINT8ARRAY]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jssha.anon.Format
    - typingsJapgolly.jssha.anon.Value
    - typingsJapgolly.jssha.anon.FormatValue
    - typingsJapgolly.jssha.anon.ValueUint8Array
  */
  trait GenericInputType extends StObject
  object GenericInputType {
    
    inline def Format(value: String): typingsJapgolly.jssha.anon.Format = {
      val __obj = js.Dynamic.literal(format = "TEXT", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.jssha.anon.Format]
    }
    
    inline def FormatValue(value: js.typedarray.ArrayBuffer): typingsJapgolly.jssha.anon.FormatValue = {
      val __obj = js.Dynamic.literal(format = "ARRAYBUFFER", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.jssha.anon.FormatValue]
    }
    
    inline def Value(format: B64 | HEX | BYTES, value: String): typingsJapgolly.jssha.anon.Value = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.jssha.anon.Value]
    }
    
    inline def ValueUint8Array(value: js.typedarray.Uint8Array): typingsJapgolly.jssha.anon.ValueUint8Array = {
      val __obj = js.Dynamic.literal(format = "UINT8ARRAY", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.jssha.anon.ValueUint8Array]
    }
  }
  
  trait KMACOptionsEncodingType
    extends StObject
       with KMACOptionsNoEncodingType {
    
    var encoding: js.UndefOr[EncodingType] = js.undefined
  }
  object KMACOptionsEncodingType {
    
    inline def apply(kmacKey: GenericInputType): KMACOptionsEncodingType = {
      val __obj = js.Dynamic.literal(kmacKey = kmacKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KMACOptionsEncodingType]
    }
    
    extension [Self <: KMACOptionsEncodingType](x: Self) {
      
      inline def setEncoding(value: EncodingType): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  trait KMACOptionsNoEncodingType extends StObject {
    
    var customization: js.UndefOr[GenericInputType] = js.undefined
    
    var kmacKey: GenericInputType
  }
  object KMACOptionsNoEncodingType {
    
    inline def apply(kmacKey: GenericInputType): KMACOptionsNoEncodingType = {
      val __obj = js.Dynamic.literal(kmacKey = kmacKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KMACOptionsNoEncodingType]
    }
    
    extension [Self <: KMACOptionsNoEncodingType](x: Self) {
      
      inline def setCustomization(value: GenericInputType): Self = StObject.set(x, "customization", value.asInstanceOf[js.Any])
      
      inline def setCustomizationUndefined: Self = StObject.set(x, "customization", js.undefined)
      
      inline def setKmacKey(value: GenericInputType): Self = StObject.set(x, "kmacKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait SHAKEOptionsEncodingType
    extends StObject
       with SHAKEOptionsNoEncodingType {
    
    var encoding: js.UndefOr[EncodingType] = js.undefined
  }
  object SHAKEOptionsEncodingType {
    
    inline def apply(): SHAKEOptionsEncodingType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SHAKEOptionsEncodingType]
    }
    
    extension [Self <: SHAKEOptionsEncodingType](x: Self) {
      
      inline def setEncoding(value: EncodingType): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  trait SHAKEOptionsNoEncodingType extends StObject {
    
    var numRounds: js.UndefOr[Double] = js.undefined
  }
  object SHAKEOptionsNoEncodingType {
    
    inline def apply(): SHAKEOptionsNoEncodingType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SHAKEOptionsNoEncodingType]
    }
    
    extension [Self <: SHAKEOptionsNoEncodingType](x: Self) {
      
      inline def setNumRounds(value: Double): Self = StObject.set(x, "numRounds", value.asInstanceOf[js.Any])
      
      inline def setNumRoundsUndefined: Self = StObject.set(x, "numRounds", js.undefined)
    }
  }
  
  @js.native
  trait jsSHA extends StObject {
    
    @JSName("getHMAC")
    def getHMAC_ARRAYBUFFER(format: ARRAYBUFFER): js.typedarray.ArrayBuffer = js.native
    @JSName("getHMAC")
    def getHMAC_B64(format: B64): String = js.native
    @JSName("getHMAC")
    def getHMAC_B64(format: B64, options: `2`): String = js.native
    @JSName("getHMAC")
    def getHMAC_BYTES(format: BYTES): String = js.native
    /**
      * Returns the the HMAC in the specified format using the key given by a previous `setHMACKey` call. Now deprecated
      * in favor of just calling `getHash`.
      *
      * @param format The desired output formatting (B64, HEX, BYTES, ARRAYBUFFER, or UINT8ARRAY) as a string.
      * @param options Options in the form of { outputUpper?: boolean; b64Pad?: string }. `outputUpper` is only for HEX
      *   output (defaults to false) and `b64pad` is only for B64 output (defaults to "=").
      * @returns The HMAC in the format specified.
      */
    @JSName("getHMAC")
    def getHMAC_HEX(format: HEX): String = js.native
    @JSName("getHMAC")
    def getHMAC_HEX(format: HEX, options: OutputUpper): String = js.native
    @JSName("getHMAC")
    def getHMAC_UINT8ARRAY(format: UINT8ARRAY): js.typedarray.Uint8Array = js.native
    
    @JSName("getHash")
    def getHash_ARRAYBUFFER(format: ARRAYBUFFER): js.typedarray.ArrayBuffer = js.native
    @JSName("getHash")
    def getHash_ARRAYBUFFER(format: ARRAYBUFFER, options: ShakeLen): js.typedarray.ArrayBuffer = js.native
    @JSName("getHash")
    def getHash_B64(format: B64): String = js.native
    @JSName("getHash")
    def getHash_B64(format: B64, options: B64Pad): String = js.native
    @JSName("getHash")
    def getHash_BYTES(format: BYTES): String = js.native
    @JSName("getHash")
    def getHash_BYTES(format: BYTES, options: ShakeLen): String = js.native
    /**
      * Returns the desired SHA or MAC (if a HMAC/KMAC key was specified) hash of the input fed in via `update` calls.
      *
      * @param format The desired output formatting (B64, HEX, BYTES, ARRAYBUFFER, or UINT8ARRAY) as a string.
      * @param options Options in the form of { outputUpper?: boolean; b64Pad?: string; outputLen?: number;  }.
      *   `outputLen` is required for variable length output variants (this option was previously called `shakeLen` which
      *    is now deprecated).
      *   `outputUpper` is only for HEX output (defaults to false) and b64pad is only for B64 output (defaults to "=").
      * @returns The hash in the format specified.
      */
    @JSName("getHash")
    def getHash_HEX(format: HEX): String = js.native
    @JSName("getHash")
    def getHash_HEX(format: HEX, options: OutputLen): String = js.native
    @JSName("getHash")
    def getHash_UINT8ARRAY(format: UINT8ARRAY): js.typedarray.Uint8Array = js.native
    @JSName("getHash")
    def getHash_UINT8ARRAY(format: UINT8ARRAY, options: ShakeLen): js.typedarray.Uint8Array = js.native
    
    def setHMACKey(key: String, inputFormat: B64 | HEX | BYTES): Unit = js.native
    @JSName("setHMACKey")
    def setHMACKey_ARRAYBUFFER(key: js.typedarray.ArrayBuffer, inputFormat: ARRAYBUFFER): Unit = js.native
    /**
      * Sets the HMAC key for an eventual `getHMAC` call.  Must be called immediately after jsSHA object instantiation.
      * Now deprecated in favor of setting the `hmacKey` at object instantiation.
      *
      * @param key The key used to calculate the HMAC
      * @param inputFormat The format of key (HEX, TEXT, B64, BYTES, ARRAYBUFFER, or UINT8ARRAY) as a string.
      * @param options Options in the form of { encoding?: "UTF8" | "UTF16BE" | "UTF16LE }.  `encoding` is only for TEXT
      *   and defaults to UTF8.
      */
    @JSName("setHMACKey")
    def setHMACKey_TEXT(key: String, inputFormat: TEXT): Unit = js.native
    @JSName("setHMACKey")
    def setHMACKey_TEXT(key: String, inputFormat: TEXT, options: `1`): Unit = js.native
    @JSName("setHMACKey")
    def setHMACKey_UINT8ARRAY(key: js.typedarray.Uint8Array, inputFormat: UINT8ARRAY): Unit = js.native
    
    /* private */ val shaObj: Any = js.native
    
    /**
      * Takes `input` and hashes as many blocks as possible. Stores the rest for either a future `update` or `getHash` call.
      *
      * @param input The input to be hashed.
      * @returns A reference to the object.
      */
    def update(input: String): this.type = js.native
    def update(input: js.typedarray.ArrayBuffer): this.type = js.native
    def update(input: js.typedarray.Uint8Array): this.type = js.native
  }
}
