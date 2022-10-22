package typingsJapgolly.brotli

import typingsJapgolly.brotli.brotliInts.`0`
import typingsJapgolly.brotli.brotliInts.`10`
import typingsJapgolly.brotli.brotliInts.`11`
import typingsJapgolly.brotli.brotliInts.`1`
import typingsJapgolly.brotli.brotliInts.`2`
import typingsJapgolly.brotli.brotliInts.`3`
import typingsJapgolly.brotli.brotliInts.`4`
import typingsJapgolly.brotli.brotliInts.`5`
import typingsJapgolly.brotli.brotliInts.`6`
import typingsJapgolly.brotli.brotliInts.`7`
import typingsJapgolly.brotli.brotliInts.`8`
import typingsJapgolly.brotli.brotliInts.`9`
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compressMod {
  
  inline def apply(buffer: Buffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def apply(buffer: Buffer, options: CompressOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("brotli/compress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CompressOptions extends StObject {
    
    /**
      * The LZ77 window size, default is 22.
      */
    var lgwin: js.UndefOr[Double] = js.undefined
    
    /**
      * The Brotli compression mode. Possible modes are:
      * 0 - generic (default)
      * 1 - text (for UTF-8 format text input)
      * 2 - font (WOFF2)
      */
    var mode: js.UndefOr[`0` | `1` | `2`] = js.undefined
    
    /**
      * The Brotli quality level, possible levels are 0-11. The default level is 11.
      */
    var quality: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`] = js.undefined
  }
  object CompressOptions {
    
    inline def apply(): CompressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompressOptions]
    }
    
    extension [Self <: CompressOptions](x: Self) {
      
      inline def setLgwin(value: Double): Self = StObject.set(x, "lgwin", value.asInstanceOf[js.Any])
      
      inline def setLgwinUndefined: Self = StObject.set(x, "lgwin", js.undefined)
      
      inline def setMode(value: `0` | `1` | `2`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setQuality(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
}
