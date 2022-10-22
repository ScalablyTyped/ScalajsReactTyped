package typingsJapgolly.encodingJapanese

import typingsJapgolly.encodingJapanese.encodingJapaneseStrings.`html-entity-hex`
import typingsJapgolly.encodingJapanese.encodingJapaneseStrings.`html-entity`
import typingsJapgolly.encodingJapanese.encodingJapaneseStrings.array
import typingsJapgolly.encodingJapanese.encodingJapaneseStrings.arraybuffer
import typingsJapgolly.encodingJapanese.encodingJapaneseStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("encoding-japanese", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def base64Decode(data: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def base64Encode(data: IntArrayType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def codeToString(data: IntArrayType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("codeToString")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convert(data: String, options: ConvertArrayBufferOptions): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def convert(data: String, options: ConvertArrayOptions): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def convert(data: String, options: ConvertStringOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convert(data: String, options: ConvertUnknownOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convert(data: String, to: Encoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convert(data: String, to: Encoding, from: Encoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convert(data: IntArrayType, options: ConvertArrayBufferOptions): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def convert(data: IntArrayType, options: ConvertArrayOptions): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def convert(data: IntArrayType, options: ConvertStringOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convert(data: IntArrayType, options: ConvertUnknownOptions): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def convert(data: IntArrayType, to: Encoding): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def convert(data: IntArrayType, to: Encoding, from: Encoding): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(data.asInstanceOf[js.Any], to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def detect(data: String): EncodingDetection = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any]).asInstanceOf[EncodingDetection]
  inline def detect(data: String, encodings: js.Array[Encoding]): EncodingDetection = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any], encodings.asInstanceOf[js.Any])).asInstanceOf[EncodingDetection]
  inline def detect(data: String, encodings: Encoding): EncodingDetection = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any], encodings.asInstanceOf[js.Any])).asInstanceOf[EncodingDetection]
  inline def detect(data: IntArrayType): EncodingDetection = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any]).asInstanceOf[EncodingDetection]
  inline def detect(data: IntArrayType, encodings: js.Array[Encoding]): EncodingDetection = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any], encodings.asInstanceOf[js.Any])).asInstanceOf[EncodingDetection]
  inline def detect(data: IntArrayType, encodings: Encoding): EncodingDetection = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(data.asInstanceOf[js.Any], encodings.asInstanceOf[js.Any])).asInstanceOf[EncodingDetection]
  
  @JSImport("encoding-japanese", "orders")
  @js.native
  val orders: js.Array[String] = js.native
  
  inline def stringToCode(data: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToCode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toHankakuCase(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHankakuCase")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toHankakuCase(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toHankakuCase")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toHankakuSpace(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHankakuSpace")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toHankakuSpace(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toHankakuSpace")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toHankanaCase(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHankanaCase")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toHankanaCase(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toHankanaCase")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toHiraganaCase(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHiraganaCase")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toHiraganaCase(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toHiraganaCase")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toKatakanaCase(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toKatakanaCase")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toKatakanaCase(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toKatakanaCase")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toZenkakuCase(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toZenkakuCase")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toZenkakuCase(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toZenkakuCase")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toZenkakuSpace(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toZenkakuSpace")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toZenkakuSpace(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toZenkakuSpace")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def toZenkanaCase(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toZenkanaCase")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toZenkanaCase(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toZenkanaCase")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def urlDecode(data: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("urlDecode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def urlEncode(data: IntArrayType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlEncode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("encoding-japanese", "version")
  @js.native
  val version: String = js.native
  
  trait ConvertArrayBufferOptions
    extends StObject
       with ConvertOptions {
    
    var bom: js.UndefOr[Boolean | String] = js.undefined
    
    var fallback: js.UndefOr[`html-entity` | `html-entity-hex`] = js.undefined
    
    var from: js.UndefOr[Encoding] = js.undefined
    
    var to: Encoding
    
    var `type`: arraybuffer
  }
  object ConvertArrayBufferOptions {
    
    inline def apply(to: Encoding): ConvertArrayBufferOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("arraybuffer")
      __obj.asInstanceOf[ConvertArrayBufferOptions]
    }
    
    extension [Self <: ConvertArrayBufferOptions](x: Self) {
      
      inline def setBom(value: Boolean | String): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      inline def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      inline def setFallback(value: `html-entity` | `html-entity-hex`): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFrom(value: Encoding): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: Encoding): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(value: arraybuffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConvertArrayOptions
    extends StObject
       with ConvertOptions {
    
    var bom: js.UndefOr[Boolean | String] = js.undefined
    
    var fallback: js.UndefOr[`html-entity` | `html-entity-hex`] = js.undefined
    
    var from: js.UndefOr[Encoding] = js.undefined
    
    var to: Encoding
    
    var `type`: array
  }
  object ConvertArrayOptions {
    
    inline def apply(to: Encoding): ConvertArrayOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("array")
      __obj.asInstanceOf[ConvertArrayOptions]
    }
    
    extension [Self <: ConvertArrayOptions](x: Self) {
      
      inline def setBom(value: Boolean | String): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      inline def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      inline def setFallback(value: `html-entity` | `html-entity-hex`): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFrom(value: Encoding): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: Encoding): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.encodingJapanese.mod.ConvertStringOptions
    - typingsJapgolly.encodingJapanese.mod.ConvertArrayBufferOptions
    - typingsJapgolly.encodingJapanese.mod.ConvertArrayOptions
    - typingsJapgolly.encodingJapanese.mod.ConvertUnknownOptions
  */
  trait ConvertOptions extends StObject
  object ConvertOptions {
    
    inline def ConvertArrayBufferOptions(to: Encoding): typingsJapgolly.encodingJapanese.mod.ConvertArrayBufferOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("arraybuffer")
      __obj.asInstanceOf[typingsJapgolly.encodingJapanese.mod.ConvertArrayBufferOptions]
    }
    
    inline def ConvertArrayOptions(to: Encoding): typingsJapgolly.encodingJapanese.mod.ConvertArrayOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("array")
      __obj.asInstanceOf[typingsJapgolly.encodingJapanese.mod.ConvertArrayOptions]
    }
    
    inline def ConvertStringOptions(to: Encoding): typingsJapgolly.encodingJapanese.mod.ConvertStringOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[typingsJapgolly.encodingJapanese.mod.ConvertStringOptions]
    }
    
    inline def ConvertUnknownOptions(to: Encoding): typingsJapgolly.encodingJapanese.mod.ConvertUnknownOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.encodingJapanese.mod.ConvertUnknownOptions]
    }
  }
  
  trait ConvertStringOptions
    extends StObject
       with ConvertOptions {
    
    var bom: js.UndefOr[Boolean | String] = js.undefined
    
    var fallback: js.UndefOr[`html-entity` | `html-entity-hex`] = js.undefined
    
    var from: js.UndefOr[Encoding] = js.undefined
    
    var to: Encoding
    
    var `type`: string
  }
  object ConvertStringOptions {
    
    inline def apply(to: Encoding): ConvertStringOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[ConvertStringOptions]
    }
    
    extension [Self <: ConvertStringOptions](x: Self) {
      
      inline def setBom(value: Boolean | String): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      inline def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      inline def setFallback(value: `html-entity` | `html-entity-hex`): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFrom(value: Encoding): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: Encoding): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConvertUnknownOptions
    extends StObject
       with ConvertOptions {
    
    var bom: js.UndefOr[Boolean | String] = js.undefined
    
    var fallback: js.UndefOr[`html-entity` | `html-entity-hex`] = js.undefined
    
    var from: js.UndefOr[Encoding] = js.undefined
    
    var to: Encoding
  }
  object ConvertUnknownOptions {
    
    inline def apply(to: Encoding): ConvertUnknownOptions = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertUnknownOptions]
    }
    
    extension [Self <: ConvertUnknownOptions](x: Self) {
      
      inline def setBom(value: Boolean | String): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      inline def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
      
      inline def setFallback(value: `html-entity` | `html-entity-hex`): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFrom(value: Encoding): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: Encoding): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF32
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16BE
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16LE
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.BINARY
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.ASCII
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.JIS
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF8
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.EUCJP
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.SJIS
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UNICODE
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.AUTO
  */
  trait Encoding extends StObject
  object Encoding {
    
    inline def ASCII: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.ASCII = "ASCII".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.ASCII]
    
    inline def AUTO: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.AUTO = "AUTO".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.AUTO]
    
    inline def BINARY: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.BINARY = "BINARY".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.BINARY]
    
    inline def EUCJP: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.EUCJP = "EUCJP".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.EUCJP]
    
    inline def JIS: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.JIS = "JIS".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.JIS]
    
    inline def SJIS: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.SJIS = "SJIS".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.SJIS]
    
    inline def UNICODE: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UNICODE = "UNICODE".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UNICODE]
    
    inline def UTF16: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16 = "UTF16".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16]
    
    inline def UTF16BE: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16BE = "UTF16BE".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16BE]
    
    inline def UTF16LE: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16LE = "UTF16LE".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16LE]
    
    inline def UTF32: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF32 = "UTF32".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF32]
    
    inline def UTF8: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF8 = "UTF8".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF8]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.encodingJapanese.encodingJapaneseBooleans.`false`
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF32
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16BE
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16LE
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.BINARY
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.ASCII
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.JIS
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF8
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.EUCJP
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.SJIS
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UNICODE
    - typingsJapgolly.encodingJapanese.encodingJapaneseStrings.AUTO
  */
  trait EncodingDetection extends StObject
  object EncodingDetection {
    
    inline def ASCII: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.ASCII = "ASCII".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.ASCII]
    
    inline def AUTO: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.AUTO = "AUTO".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.AUTO]
    
    inline def BINARY: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.BINARY = "BINARY".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.BINARY]
    
    inline def EUCJP: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.EUCJP = "EUCJP".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.EUCJP]
    
    inline def JIS: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.JIS = "JIS".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.JIS]
    
    inline def SJIS: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.SJIS = "SJIS".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.SJIS]
    
    inline def UNICODE: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UNICODE = "UNICODE".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UNICODE]
    
    inline def UTF16: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16 = "UTF16".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16]
    
    inline def UTF16BE: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16BE = "UTF16BE".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16BE]
    
    inline def UTF16LE: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16LE = "UTF16LE".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF16LE]
    
    inline def UTF32: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF32 = "UTF32".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF32]
    
    inline def UTF8: typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF8 = "UTF8".asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseStrings.UTF8]
    
    inline def `false`: typingsJapgolly.encodingJapanese.encodingJapaneseBooleans.`false` = false.asInstanceOf[typingsJapgolly.encodingJapanese.encodingJapaneseBooleans.`false`]
  }
  
  type IntArrayType = js.Array[Double] | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array
}
