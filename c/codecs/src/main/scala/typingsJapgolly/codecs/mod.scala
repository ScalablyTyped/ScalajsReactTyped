package typingsJapgolly.codecs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.codecs.codecsStrings.`ucs-2`
import typingsJapgolly.codecs.codecsStrings.`utf-8`
import typingsJapgolly.codecs.codecsStrings.`utf16-le`
import typingsJapgolly.codecs.codecsStrings.ascii
import typingsJapgolly.codecs.codecsStrings.base64
import typingsJapgolly.codecs.codecsStrings.binary
import typingsJapgolly.codecs.codecsStrings.hex
import typingsJapgolly.codecs.codecsStrings.json
import typingsJapgolly.codecs.codecsStrings.ndjson
import typingsJapgolly.codecs.codecsStrings.ucs2
import typingsJapgolly.codecs.codecsStrings.utf16le
import typingsJapgolly.codecs.codecsStrings.utf8
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("codecs", JSImport.Namespace)
  @js.native
  val ^ : Codecs = js.native
  
  type AsciiCodec = NamedCodec[ascii, String, String]
  
  type Base64Codec = NamedCodec[base64, String, String]
  
  trait BaseCodec[InType, OutType] extends StObject {
    
    def decode(input: js.typedarray.Uint8Array): OutType
    
    def encode(input: InType): Buffer
  }
  object BaseCodec {
    
    inline def apply[InType, OutType](decode: js.typedarray.Uint8Array => OutType, encode: InType => Buffer): BaseCodec[InType, OutType] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[BaseCodec[InType, OutType]]
    }
    
    extension [Self <: BaseCodec[?, ?], InType, OutType](x: Self & (BaseCodec[InType, OutType])) {
      
      inline def setDecode(value: js.typedarray.Uint8Array => OutType): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: InType => Buffer): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  type BinaryCodec = NamedCodec[binary, String | js.typedarray.Uint8Array, Buffer]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TInput extends codecs.codecs.BaseCodec<any, any> ? TInput : TInput extends null | undefined ? TFallback : TInput extends keyof TCodecs ? TCodecs[TInput] extends codecs.codecs.BaseCodec<any, any> ? TCodecs[TInput] : TFallback : TFallback
    }}}
    */
  @js.native
  trait Codec[TInput, TFallback, TCodecs] extends StObject
  
  type CodecInput = (BaseCodec[Any, Any]) | CodecNames
  
  trait CodecLookup extends StObject {
    
    var ascii: AsciiCodec
    
    var base64: Base64Codec
    
    var binary: BinaryCodec
    
    var hex: HexCodec
    
    var json: JsonCodec
    
    var ndjson: NDJsonCodec
    
    var `ucs-2`: Ucs2Codec
    
    var ucs2: Ucs2Codec
    
    var `utf-8`: Utf8Codec
    
    var `utf16-le`: Utf16leCodec
    
    var utf16le: Utf16leCodec
    
    var utf8: Utf8Codec
  }
  object CodecLookup {
    
    inline def apply(
      ascii: AsciiCodec,
      base64: Base64Codec,
      binary: BinaryCodec,
      hex: HexCodec,
      json: JsonCodec,
      ndjson: NDJsonCodec,
      `ucs-2`: Ucs2Codec,
      ucs2: Ucs2Codec,
      `utf-8`: Utf8Codec,
      `utf16-le`: Utf16leCodec,
      utf16le: Utf16leCodec,
      utf8: Utf8Codec
    ): CodecLookup = {
      val __obj = js.Dynamic.literal(ascii = ascii.asInstanceOf[js.Any], base64 = base64.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], ndjson = ndjson.asInstanceOf[js.Any], ucs2 = ucs2.asInstanceOf[js.Any], utf16le = utf16le.asInstanceOf[js.Any], utf8 = utf8.asInstanceOf[js.Any])
      __obj.updateDynamic("ucs-2")(`ucs-2`.asInstanceOf[js.Any])
      __obj.updateDynamic("utf-8")(`utf-8`.asInstanceOf[js.Any])
      __obj.updateDynamic("utf16-le")(`utf16-le`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodecLookup]
    }
    
    extension [Self <: CodecLookup](x: Self) {
      
      inline def setAscii(value: AsciiCodec): Self = StObject.set(x, "ascii", value.asInstanceOf[js.Any])
      
      inline def setBase64(value: Base64Codec): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBinary(value: BinaryCodec): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setHex(value: HexCodec): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setJson(value: JsonCodec): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setNdjson(value: NDJsonCodec): Self = StObject.set(x, "ndjson", value.asInstanceOf[js.Any])
      
      inline def `setUcs-2`(value: Ucs2Codec): Self = StObject.set(x, "ucs-2", value.asInstanceOf[js.Any])
      
      inline def setUcs2(value: Ucs2Codec): Self = StObject.set(x, "ucs2", value.asInstanceOf[js.Any])
      
      inline def `setUtf-8`(value: Utf8Codec): Self = StObject.set(x, "utf-8", value.asInstanceOf[js.Any])
      
      inline def `setUtf16-le`(value: Utf16leCodec): Self = StObject.set(x, "utf16-le", value.asInstanceOf[js.Any])
      
      inline def setUtf16le(value: Utf16leCodec): Self = StObject.set(x, "utf16le", value.asInstanceOf[js.Any])
      
      inline def setUtf8(value: Utf8Codec): Self = StObject.set(x, "utf8", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TInput extends null | undefined ? TFallback['name'] : TInput extends codecs.codecs.NamedCodec<string, any, any> ? TInput['name'] : TInput extends codecs.codecs.BaseCodec<any, any> ? undefined : TInput extends keyof TCodecs ? TCodecs[TInput] extends codecs.codecs.NamedCodec<infer Name, any, any> ? Name : undefined : TFallback['name']
    }}}
    */
  @js.native
  trait CodecName[TInput /* <: MaybeCodecInput */, TFallback /* <: NamedCodec[String, Any, Any] */, TCodecs] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.codecs.codecsStrings.ascii
    - typingsJapgolly.codecs.codecsStrings.base64
    - typingsJapgolly.codecs.codecsStrings.binary
    - typingsJapgolly.codecs.codecsStrings.hex
    - typingsJapgolly.codecs.codecsStrings.json
    - typingsJapgolly.codecs.codecsStrings.ndjson
    - typingsJapgolly.codecs.codecsStrings.ucs2
    - typingsJapgolly.codecs.codecsStrings.`ucs-2`
    - typingsJapgolly.codecs.codecsStrings.utf8
    - typingsJapgolly.codecs.codecsStrings.`utf-8`
    - typingsJapgolly.codecs.codecsStrings.utf16le
    - typingsJapgolly.codecs.codecsStrings.`utf16-le`
  */
  trait CodecNames extends StObject
  
  @js.native
  trait Codecs extends StObject {
    
    def apply(): BinaryCodec = js.native
    def apply(codec: `ucs-2`): Codec[`ucs-2`, BinaryCodec, CodecLookup] = js.native
    def apply(codec: `utf-8`): Codec[`utf-8`, BinaryCodec, CodecLookup] = js.native
    def apply(codec: `utf16-le`): Codec[`utf16-le`, BinaryCodec, CodecLookup] = js.native
    def apply(codec: ascii): Codec[ascii, BinaryCodec, CodecLookup] = js.native
    def apply(codec: base64): Codec[base64, BinaryCodec, CodecLookup] = js.native
    def apply(codec: binary): Codec[binary, BinaryCodec, CodecLookup] = js.native
    def apply(codec: hex): Codec[hex, BinaryCodec, CodecLookup] = js.native
    def apply(codec: json): Codec[json, BinaryCodec, CodecLookup] = js.native
    def apply(codec: ndjson): Codec[ndjson, BinaryCodec, CodecLookup] = js.native
    def apply(codec: ucs2): Codec[ucs2, BinaryCodec, CodecLookup] = js.native
    def apply(codec: utf16le): Codec[utf16le, BinaryCodec, CodecLookup] = js.native
    def apply(codec: utf8): Codec[utf8, BinaryCodec, CodecLookup] = js.native
    def apply[TCodec /* <: BaseCodec[Any, Any] */](codec: TCodec): Codec[TCodec, BinaryCodec, CodecLookup] = js.native
    def apply[TCodec /* <: js.UndefOr[String | Null] */, TFallback](codec: TCodec, fallback: TFallback): Codec[TCodec, TFallback, CodecLookup] = js.native
    
    var ascii: AsciiCodec = js.native
    
    var base64: Base64Codec = js.native
    
    var binary: BinaryCodec = js.native
    
    var hex: HexCodec = js.native
    
    var json: JsonCodec = js.native
    
    var ndjson: NDJsonCodec = js.native
    
    var ucs2: Ucs2Codec = js.native
    
    var utf16le: Utf16leCodec = js.native
    
    var utf8: Utf8Codec = js.native
  }
  
  type HexCodec = NamedCodec[hex, String, String]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    codecs.codecs.Codec<TCodec, TFallback, TCodecs> extends codecs.codecs.BaseCodec<infer T, any> ? T : unknown
    }}}
    */
  @js.native
  trait InType[TCodec /* <: MaybeCodecInput */, TFallback /* <: NamedCodec[String, Any, Any] */, TCodecs] extends StObject
  
  type JsonArray = js.Array[JsonValue]
  
  type JsonCodec = NamedCodec[json, Any, JsonValue]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Key in string ]:? codecs.codecs.JsonValue}
    }}}
    */
  @js.native
  trait JsonObject extends StObject
  
  type JsonValue = String | Double | Boolean | Null | JsonObject | Any
  
  type MaybeCodecInput = js.UndefOr[CodecInput | String | Null]
  
  trait NDJsonCodec
    extends StObject
       with NamedCodec[ndjson, Any, JsonValue]
  object NDJsonCodec {
    
    inline def apply(decode: js.typedarray.Uint8Array => JsonValue, encode: Any => Buffer): NDJsonCodec = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), name = "ndjson")
      __obj.asInstanceOf[NDJsonCodec]
    }
  }
  
  trait NamedCodec[TName /* <: String */, InType, OutType]
    extends StObject
       with BaseCodec[InType, OutType] {
    
    var name: TName
  }
  object NamedCodec {
    
    inline def apply[TName /* <: String */, InType, OutType](decode: js.typedarray.Uint8Array => OutType, encode: InType => Buffer, name: TName): NamedCodec[TName, InType, OutType] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedCodec[TName, InType, OutType]]
    }
    
    extension [Self <: NamedCodec[?, ?, ?], TName /* <: String */, InType, OutType](x: Self & (NamedCodec[TName, InType, OutType])) {
      
      inline def setName(value: TName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    codecs.codecs.Codec<TCodec, TFallback, TCodecs> extends codecs.codecs.BaseCodec<any, infer T> ? T : unknown
    }}}
    */
  @js.native
  trait OutType[TCodec /* <: MaybeCodecInput */, TFallback /* <: NamedCodec[String, Any, Any] */, TCodecs] extends StObject
  
  type Ucs2Codec = NamedCodec[ucs2, String, String]
  
  type Utf16leCodec = NamedCodec[utf16le, String, String]
  
  type Utf8Codec = NamedCodec[`utf-8`, String, String]
  
  type _To = Codecs
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Codecs = ^
}
