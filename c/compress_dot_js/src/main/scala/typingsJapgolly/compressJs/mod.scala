package typingsJapgolly.compressJs

import org.scalajs.dom.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("compress.js", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Compress {
    
    /* CompleteClass */
    override def attach(el: String, options: CompressOptions): js.Promise[js.Array[CompressResult]] = js.native
    
    /* CompleteClass */
    override def compress(files: js.Array[File], options: CompressOptions): js.Promise[js.Array[CompressResult]] = js.native
  }
  @JSImport("compress.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def convertBase64ToFile(base64: String): File = ^.asInstanceOf[js.Dynamic].applyDynamic("convertBase64ToFile")(base64.asInstanceOf[js.Any]).asInstanceOf[File]
  inline def convertBase64ToFile(base64: String, mime: String): File = (^.asInstanceOf[js.Dynamic].applyDynamic("convertBase64ToFile")(base64.asInstanceOf[js.Any], mime.asInstanceOf[js.Any])).asInstanceOf[File]
  
  trait Compress extends StObject {
    
    def attach(el: String, options: CompressOptions): js.Promise[js.Array[CompressResult]]
    
    def compress(files: js.Array[File], options: CompressOptions): js.Promise[js.Array[CompressResult]]
  }
  object Compress {
    
    inline def apply(
      attach: (String, CompressOptions) => js.Promise[js.Array[CompressResult]],
      compress: (js.Array[File], CompressOptions) => js.Promise[js.Array[CompressResult]]
    ): Compress = {
      val __obj = js.Dynamic.literal(attach = js.Any.fromFunction2(attach), compress = js.Any.fromFunction2(compress))
      __obj.asInstanceOf[Compress]
    }
    
    extension [Self <: Compress](x: Self) {
      
      inline def setAttach(value: (String, CompressOptions) => js.Promise[js.Array[CompressResult]]): Self = StObject.set(x, "attach", js.Any.fromFunction2(value))
      
      inline def setCompress(value: (js.Array[File], CompressOptions) => js.Promise[js.Array[CompressResult]]): Self = StObject.set(x, "compress", js.Any.fromFunction2(value))
    }
  }
  
  trait CompressOptions extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var resize: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object CompressOptions {
    
    inline def apply(): CompressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompressOptions]
    }
    
    extension [Self <: CompressOptions](x: Self) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait CompressResult extends StObject {
    
    var alt: String
    
    var data: String
    
    var elapsedTimeInSeconds: Double
    
    var endHeightInPx: Double
    
    var endSizeInMb: Double
    
    var endWidthInPx: Double
    
    var ext: String
    
    var initialHeightInPx: Double
    
    var initialSizeInMb: Double
    
    var initialWidthInPx: Double
    
    var iterations: Double
    
    var prefix: String
    
    var quality: Double
    
    var sizeReducedInPercent: Double
  }
  object CompressResult {
    
    inline def apply(
      alt: String,
      data: String,
      elapsedTimeInSeconds: Double,
      endHeightInPx: Double,
      endSizeInMb: Double,
      endWidthInPx: Double,
      ext: String,
      initialHeightInPx: Double,
      initialSizeInMb: Double,
      initialWidthInPx: Double,
      iterations: Double,
      prefix: String,
      quality: Double,
      sizeReducedInPercent: Double
    ): CompressResult = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], elapsedTimeInSeconds = elapsedTimeInSeconds.asInstanceOf[js.Any], endHeightInPx = endHeightInPx.asInstanceOf[js.Any], endSizeInMb = endSizeInMb.asInstanceOf[js.Any], endWidthInPx = endWidthInPx.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], initialHeightInPx = initialHeightInPx.asInstanceOf[js.Any], initialSizeInMb = initialSizeInMb.asInstanceOf[js.Any], initialWidthInPx = initialWidthInPx.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], sizeReducedInPercent = sizeReducedInPercent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompressResult]
    }
    
    extension [Self <: CompressResult](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setElapsedTimeInSeconds(value: Double): Self = StObject.set(x, "elapsedTimeInSeconds", value.asInstanceOf[js.Any])
      
      inline def setEndHeightInPx(value: Double): Self = StObject.set(x, "endHeightInPx", value.asInstanceOf[js.Any])
      
      inline def setEndSizeInMb(value: Double): Self = StObject.set(x, "endSizeInMb", value.asInstanceOf[js.Any])
      
      inline def setEndWidthInPx(value: Double): Self = StObject.set(x, "endWidthInPx", value.asInstanceOf[js.Any])
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setInitialHeightInPx(value: Double): Self = StObject.set(x, "initialHeightInPx", value.asInstanceOf[js.Any])
      
      inline def setInitialSizeInMb(value: Double): Self = StObject.set(x, "initialSizeInMb", value.asInstanceOf[js.Any])
      
      inline def setInitialWidthInPx(value: Double): Self = StObject.set(x, "initialWidthInPx", value.asInstanceOf[js.Any])
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setSizeReducedInPercent(value: Double): Self = StObject.set(x, "sizeReducedInPercent", value.asInstanceOf[js.Any])
    }
  }
}
