package typingsJapgolly.pako

import typingsJapgolly.pako.anon.InflateFunctionOptionstos
import typingsJapgolly.pako.mod.Data
import typingsJapgolly.pako.mod.DeflateFunctionOptions
import typingsJapgolly.pako.mod.DeflateOptions
import typingsJapgolly.pako.mod.InflateFunctionOptions
import typingsJapgolly.pako.mod.InflateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object pako {
    
    @JSGlobal("pako")
    @js.native
    val ^ : js.Any = js.native
    
    // https://github.com/nodeca/pako/blob/893381abcafa10fa2081ce60dae7d4d8e873a658/lib/deflate.js
    @JSGlobal("pako.Deflate")
    @js.native
    open class Deflate_ ()
      extends typingsJapgolly.pako.mod.Deflate_ {
      def this(options: DeflateOptions) = this()
    }
    
    // https://github.com/nodeca/pako/blob/893381abcafa10fa2081ce60dae7d4d8e873a658/lib/inflate.js
    @JSGlobal("pako.Inflate")
    @js.native
    open class Inflate_ ()
      extends typingsJapgolly.pako.mod.Inflate_ {
      def this(options: InflateOptions) = this()
    }
    
    @JSGlobal("pako.constants")
    @js.native
    object constants extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.pako.mod.constants & Double] = js.native
      
      /* 5 */ val Z_BLOCK: typingsJapgolly.pako.mod.constants.Z_BLOCK & Double = js.native
      
      /* -5 */ val Z_BUF_ERROR: typingsJapgolly.pako.mod.constants.Z_BUF_ERROR & Double = js.native
      
      /* -3 */ val Z_DATA_ERROR: typingsJapgolly.pako.mod.constants.Z_DATA_ERROR & Double = js.native
      
      /* 0 */ val Z_DEFAULT_STRATEGY: typingsJapgolly.pako.mod.constants.Z_DEFAULT_STRATEGY & Double = js.native
      
      /* -1 */ val Z_ERRNO: typingsJapgolly.pako.mod.constants.Z_ERRNO & Double = js.native
      
      /* 1 */ val Z_FILTERED: typingsJapgolly.pako.mod.constants.Z_FILTERED & Double = js.native
      
      /* 4 */ val Z_FINISH: typingsJapgolly.pako.mod.constants.Z_FINISH & Double = js.native
      
      /* 4 */ val Z_FIXED: typingsJapgolly.pako.mod.constants.Z_FIXED & Double = js.native
      
      /* 3 */ val Z_FULL_FLUSH: typingsJapgolly.pako.mod.constants.Z_FULL_FLUSH & Double = js.native
      
      /* 2 */ val Z_HUFFMAN_ONLY: typingsJapgolly.pako.mod.constants.Z_HUFFMAN_ONLY & Double = js.native
      
      /* 2 */ val Z_NEED_DICT: typingsJapgolly.pako.mod.constants.Z_NEED_DICT & Double = js.native
      
      /* 0 */ val Z_NO_FLUSH: typingsJapgolly.pako.mod.constants.Z_NO_FLUSH & Double = js.native
      
      /* 0 */ val Z_OK: typingsJapgolly.pako.mod.constants.Z_OK & Double = js.native
      
      /* 1 */ val Z_PARTIAL_FLUSH: typingsJapgolly.pako.mod.constants.Z_PARTIAL_FLUSH & Double = js.native
      
      /* 3 */ val Z_RLE: typingsJapgolly.pako.mod.constants.Z_RLE & Double = js.native
      
      /* 1 */ val Z_STREAM_END: typingsJapgolly.pako.mod.constants.Z_STREAM_END & Double = js.native
      
      /* -2 */ val Z_STREAM_ERROR: typingsJapgolly.pako.mod.constants.Z_STREAM_ERROR & Double = js.native
      
      /* 2 */ val Z_SYNC_FLUSH: typingsJapgolly.pako.mod.constants.Z_SYNC_FLUSH & Double = js.native
      
      /* 6 */ val Z_TREES: typingsJapgolly.pako.mod.constants.Z_TREES & Double = js.native
    }
    
    inline def deflate(data: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def deflate(data: String, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    /**
      * Compress data with deflate algorithm and options.
      */
    inline def deflate(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def deflate(data: Data, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def deflateRaw(data: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def deflateRaw(data: String, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    /**
      * The same as deflate, but creates raw data, without wrapper (header and adler32 crc).
      */
    inline def deflateRaw(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def deflateRaw(data: Data, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def gzip(data: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def gzip(data: String, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    /**
      * The same as deflate, but create gzip wrapper instead of deflate one.
      */
    inline def gzip(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def gzip(data: Data, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def inflate(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    /**
      * Decompress data with inflate/ungzip and options. Autodetect format via wrapper header
      * by default. That's why we don't provide separate ungzip method.
      */
    inline def inflate(data: Data, options: InflateFunctionOptionstos): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def inflate(data: Data, options: InflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def inflateRaw(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    /**
      * The same as inflate, but creates raw data, without wrapper (header and adler32 crc).
      */
    inline def inflateRaw(data: Data, options: InflateFunctionOptionstos): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def inflateRaw(data: Data, options: InflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def ungzip(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    /**
      * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
      */
    inline def ungzip(data: Data, options: InflateFunctionOptionstos): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def ungzip(data: Data, options: InflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  }
}
