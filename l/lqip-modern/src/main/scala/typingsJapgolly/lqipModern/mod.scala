package typingsJapgolly.lqipModern

import typingsJapgolly.lqipModern.anon.DataURIBase64
import typingsJapgolly.lqipModern.lqipModernStrings.jpeg
import typingsJapgolly.lqipModern.lqipModernStrings.jpg
import typingsJapgolly.lqipModern.lqipModernStrings.webp
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: String): js.Promise[LqipResult] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LqipResult]]
  inline def apply(input: String, options: LqipOptions): js.Promise[LqipResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LqipResult]]
  inline def apply(input: js.Array[Buffer | String]): js.Promise[js.Array[LqipResult]] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[LqipResult]]]
  inline def apply(input: js.Array[Buffer | String], options: LqipOptions): js.Promise[js.Array[LqipResult]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[LqipResult]]]
  inline def apply(input: Buffer): js.Promise[LqipResult] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LqipResult]]
  inline def apply(input: Buffer, options: LqipOptions): js.Promise[LqipResult] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LqipResult]]
  
  @JSImport("lqip-modern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DefaultOptions
    extends StObject
       with LqipOptions {
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    var resize: js.UndefOr[Double | js.Array[Any]] = js.undefined
  }
  object DefaultOptions {
    
    inline def apply(): DefaultOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultOptions]
    }
    
    extension [Self <: DefaultOptions](x: Self) {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setResize(value: Double | js.Array[Any]): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setResizeVarargs(value: Any*): Self = StObject.set(x, "resize", js.Array(value*))
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.lqipModern.mod.LqipOptions because Already inherited */ trait JpegOptions
    extends StObject
       with DefaultOptions {
    
    val outputFormat: jpeg
    
    val outputOptions: js.UndefOr[typingsJapgolly.sharp.mod.JpegOptions] = js.undefined
  }
  object JpegOptions {
    
    inline def apply(): JpegOptions = {
      val __obj = js.Dynamic.literal(outputFormat = "jpeg")
      __obj.asInstanceOf[JpegOptions]
    }
    
    extension [Self <: JpegOptions](x: Self) {
      
      inline def setOutputFormat(value: jpeg): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      inline def setOutputOptions(value: typingsJapgolly.sharp.mod.JpegOptions): Self = StObject.set(x, "outputOptions", value.asInstanceOf[js.Any])
      
      inline def setOutputOptionsUndefined: Self = StObject.set(x, "outputOptions", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.lqipModern.mod.LqipOptions because Already inherited */ trait JpgOptions
    extends StObject
       with DefaultOptions {
    
    val outputFormat: jpg
    
    val outputOptions: js.UndefOr[typingsJapgolly.sharp.mod.JpegOptions] = js.undefined
  }
  object JpgOptions {
    
    inline def apply(): JpgOptions = {
      val __obj = js.Dynamic.literal(outputFormat = "jpg")
      __obj.asInstanceOf[JpgOptions]
    }
    
    extension [Self <: JpgOptions](x: Self) {
      
      inline def setOutputFormat(value: jpg): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      inline def setOutputOptions(value: typingsJapgolly.sharp.mod.JpegOptions): Self = StObject.set(x, "outputOptions", value.asInstanceOf[js.Any])
      
      inline def setOutputOptionsUndefined: Self = StObject.set(x, "outputOptions", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lqipModern.mod.WebpOptions
    - typingsJapgolly.lqipModern.mod.JpegOptions
    - typingsJapgolly.lqipModern.mod.JpgOptions
    - typingsJapgolly.lqipModern.mod.DefaultOptions
  */
  trait LqipOptions extends StObject
  object LqipOptions {
    
    inline def DefaultOptions(): typingsJapgolly.lqipModern.mod.DefaultOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.lqipModern.mod.DefaultOptions]
    }
    
    inline def JpegOptions(): typingsJapgolly.lqipModern.mod.JpegOptions = {
      val __obj = js.Dynamic.literal(outputFormat = "jpeg")
      __obj.asInstanceOf[typingsJapgolly.lqipModern.mod.JpegOptions]
    }
    
    inline def JpgOptions(): typingsJapgolly.lqipModern.mod.JpgOptions = {
      val __obj = js.Dynamic.literal(outputFormat = "jpg")
      __obj.asInstanceOf[typingsJapgolly.lqipModern.mod.JpgOptions]
    }
    
    inline def WebpOptions(): typingsJapgolly.lqipModern.mod.WebpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.lqipModern.mod.WebpOptions]
    }
  }
  
  trait LqipResult extends StObject {
    
    var content: Buffer
    
    var metadata: DataURIBase64
  }
  object LqipResult {
    
    inline def apply(content: Buffer, metadata: DataURIBase64): LqipResult = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[LqipResult]
    }
    
    extension [Self <: LqipResult](x: Self) {
      
      inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: DataURIBase64): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lqipModern.lqipModernStrings.webp
    - scala.Unit
    - typingsJapgolly.lqipModern.lqipModernStrings.jpeg
    - typingsJapgolly.lqipModern.lqipModernStrings.jpg
  */
  type OutputFormat = js.UndefOr[_OutputFormat]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.lqipModern.mod.LqipOptions because Already inherited */ trait WebpOptions
    extends StObject
       with DefaultOptions {
    
    val outputFormat: js.UndefOr[webp] = js.undefined
    
    val outputOptions: js.UndefOr[typingsJapgolly.sharp.mod.WebpOptions] = js.undefined
  }
  object WebpOptions {
    
    inline def apply(): WebpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebpOptions]
    }
    
    extension [Self <: WebpOptions](x: Self) {
      
      inline def setOutputFormat(value: webp): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
      
      inline def setOutputOptions(value: typingsJapgolly.sharp.mod.WebpOptions): Self = StObject.set(x, "outputOptions", value.asInstanceOf[js.Any])
      
      inline def setOutputOptionsUndefined: Self = StObject.set(x, "outputOptions", js.undefined)
    }
  }
  
  trait _OutputFormat extends StObject
}
