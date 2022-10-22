package typingsJapgolly.iltorb

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iltorb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compress(buffer: Buffer): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def compress(buffer: Buffer, callback: IltorbCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def compress(buffer: Buffer, options: BrotliEncodeParams): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def compress(buffer: Buffer, options: BrotliEncodeParams, callback: IltorbCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def compressStream(): Transform & BrotliFlushable = ^.asInstanceOf[js.Dynamic].applyDynamic("compressStream")().asInstanceOf[Transform & BrotliFlushable]
  inline def compressStream(options: BrotliEncodeParams): Transform & BrotliFlushable = ^.asInstanceOf[js.Dynamic].applyDynamic("compressStream")(options.asInstanceOf[js.Any]).asInstanceOf[Transform & BrotliFlushable]
  
  inline def compressSync(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def compressSync(buffer: Buffer, options: BrotliEncodeParams): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def decompress(buffer: Buffer): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def decompress(buffer: Buffer, callback: IltorbCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def decompressStream(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressStream")().asInstanceOf[Transform]
  
  inline def decompressSync(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.iltorb.iltorbInts.`0`
    - typingsJapgolly.iltorb.iltorbInts.`1`
    - typingsJapgolly.iltorb.iltorbInts.`2`
    - typingsJapgolly.iltorb.iltorbInts.`3`
    - typingsJapgolly.iltorb.iltorbInts.`4`
    - typingsJapgolly.iltorb.iltorbInts.`5`
    - typingsJapgolly.iltorb.iltorbInts.`6`
    - typingsJapgolly.iltorb.iltorbInts.`7`
    - typingsJapgolly.iltorb.iltorbInts.`8`
    - typingsJapgolly.iltorb.iltorbInts.`9`
    - typingsJapgolly.iltorb.iltorbInts.`10`
    - typingsJapgolly.iltorb.iltorbInts.`11`
  */
  trait BrotliCompressionQuality extends StObject
  object BrotliCompressionQuality {
    
    inline def `0`: typingsJapgolly.iltorb.iltorbInts.`0` = 0.asInstanceOf[typingsJapgolly.iltorb.iltorbInts.`0`]
    
    inline def `1`: typingsJapgolly.iltorb.iltorbInts.`1` = 1.asInstanceOf[typingsJapgolly.iltorb.iltorbInts.`1`]
    
    inline def `10`: typingsJapgolly.iltorb.iltorbInts.`10` = 10.asInstanceOf[typingsJapgolly.iltorb.iltorbInts.`10`]
    
    inline def `11`: typingsJapgolly.iltorb.iltorbInts.`11` = 11.asInstanceOf[typingsJapgolly.iltorb.iltorbInts.`11`]
    
    inline def `2`: typingsJapgolly.iltorb.iltorbInts.`2` = 2.asInstanceOf[typingsJapgolly.iltorb.iltorbInts.`2`]
    
    inline def `3`: typingsJapgolly.iltorb.iltorbInts.`3` = 3.asInstanceOf[typingsJapgolly.iltorb.iltorbInts.`3`]
    
    inline def `4`: typingsJapgolly.iltorb.iltorbInts.`4` = 4.asInstanceOf[typingsJapgolly.iltorb.iltorbInts.`4`]
    
    inline def `5`: typingsJapgolly.iltorb.iltorbInts.`5` = 5.asInstanceOf[typingsJapgolly.iltorb.iltorbInts.`5`]
    
    inline def `6`: typingsJapgolly.iltorb.iltorbInts.`6` = 6.asInstanceOf[typingsJapgolly.iltorb.iltorbInts.`6`]
    
    inline def `7`: typingsJapgolly.iltorb.iltorbInts.`7` = 7.asInstanceOf[typingsJapgolly.iltorb.iltorbInts.`7`]
    
    inline def `8`: typingsJapgolly.iltorb.iltorbInts.`8` = 8.asInstanceOf[typingsJapgolly.iltorb.iltorbInts.`8`]
    
    inline def `9`: typingsJapgolly.iltorb.iltorbInts.`9` = 9.asInstanceOf[typingsJapgolly.iltorb.iltorbInts.`9`]
  }
  
  trait BrotliEncodeParams extends StObject {
    
    var disable_literal_context_modeling: js.UndefOr[Boolean] = js.undefined
    
    var lgblock: js.UndefOr[Double] = js.undefined
    
    var lgwin: js.UndefOr[Double] = js.undefined
    
    /** @default 0 */
    var mode: js.UndefOr[BrotliMode] = js.undefined
    
    /** @default 11 */
    var quality: js.UndefOr[BrotliCompressionQuality] = js.undefined
    
    var size_hint: js.UndefOr[Double] = js.undefined
  }
  object BrotliEncodeParams {
    
    inline def apply(): BrotliEncodeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrotliEncodeParams]
    }
    
    extension [Self <: BrotliEncodeParams](x: Self) {
      
      inline def setDisable_literal_context_modeling(value: Boolean): Self = StObject.set(x, "disable_literal_context_modeling", value.asInstanceOf[js.Any])
      
      inline def setDisable_literal_context_modelingUndefined: Self = StObject.set(x, "disable_literal_context_modeling", js.undefined)
      
      inline def setLgblock(value: Double): Self = StObject.set(x, "lgblock", value.asInstanceOf[js.Any])
      
      inline def setLgblockUndefined: Self = StObject.set(x, "lgblock", js.undefined)
      
      inline def setLgwin(value: Double): Self = StObject.set(x, "lgwin", value.asInstanceOf[js.Any])
      
      inline def setLgwinUndefined: Self = StObject.set(x, "lgwin", js.undefined)
      
      inline def setMode(value: BrotliMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setQuality(value: BrotliCompressionQuality): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setSize_hint(value: Double): Self = StObject.set(x, "size_hint", value.asInstanceOf[js.Any])
      
      inline def setSize_hintUndefined: Self = StObject.set(x, "size_hint", js.undefined)
    }
  }
  
  trait BrotliFlushable extends StObject {
    
    def flush(): Unit
  }
  object BrotliFlushable {
    
    inline def apply(flush: Callback): BrotliFlushable = {
      val __obj = js.Dynamic.literal(flush = flush.toJsFn)
      __obj.asInstanceOf[BrotliFlushable]
    }
    
    extension [Self <: BrotliFlushable](x: Self) {
      
      inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.iltorb.iltorbInts.`0`
    - typingsJapgolly.iltorb.iltorbInts.`1`
    - typingsJapgolly.iltorb.iltorbInts.`2`
  */
  trait BrotliMode extends StObject
  object BrotliMode {
    
    inline def `0`: typingsJapgolly.iltorb.iltorbInts.`0` = 0.asInstanceOf[typingsJapgolly.iltorb.iltorbInts.`0`]
    
    inline def `1`: typingsJapgolly.iltorb.iltorbInts.`1` = 1.asInstanceOf[typingsJapgolly.iltorb.iltorbInts.`1`]
    
    inline def `2`: typingsJapgolly.iltorb.iltorbInts.`2` = 2.asInstanceOf[typingsJapgolly.iltorb.iltorbInts.`2`]
  }
  
  type IltorbCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* output */ Buffer, Unit]
}
