package typingsJapgolly.probeImageSize

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.needle.mod.NeedleOptions
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.probeImageSize.probeImageSizeStrings.ECONTENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Get image size without full download. Supported image types: JPG, GIF, PNG, WebP, BMP, TIFF, SVG, PSD.
    */
  inline def apply(source: String): js.Promise[ProbeResult] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProbeResult]]
  inline def apply(source: String, opts: NeedleOptions): js.Promise[ProbeResult] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProbeResult]]
  inline def apply(source: ReadableStream): js.Promise[ProbeResult] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProbeResult]]
  inline def apply(source: ReadableStream, keepOpen: Boolean): js.Promise[ProbeResult] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], keepOpen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProbeResult]]
  
  @JSImport("probe-image-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("probe-image-size", "Error")
  @js.native
  open class Error protected ()
    extends StObject
       with typingsJapgolly.std.Error {
    def this(message: String) = this()
    def this(message: String, code: ECONTENT) = this()
    def this(message: String, code: Null, statusCode: Double) = this()
    def this(message: String, code: Unit, statusCode: Double) = this()
    def this(message: String, code: ECONTENT, statusCode: Double) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  @JSImport("probe-image-size", "Error")
  @js.native
  val Error: Instantiable3[
    /* message */ String, 
    /* code */ js.UndefOr[ECONTENT | Null], 
    /* statusCode */ js.UndefOr[Double], 
    js.Error
  ] = js.native
  
  @JSImport("probe-image-size", "parsers")
  @js.native
  val parsers: Parsers_ = js.native
  
  inline def sync(data: Buffer): ProbeResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(data.asInstanceOf[js.Any]).asInstanceOf[ProbeResult | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.probeImageSize.probeImageSizeInts.`1`
    - typingsJapgolly.probeImageSize.probeImageSizeInts.`2`
    - typingsJapgolly.probeImageSize.probeImageSizeInts.`3`
    - typingsJapgolly.probeImageSize.probeImageSizeInts.`4`
    - typingsJapgolly.probeImageSize.probeImageSizeInts.`5`
    - typingsJapgolly.probeImageSize.probeImageSizeInts.`6`
    - typingsJapgolly.probeImageSize.probeImageSizeInts.`7`
    - typingsJapgolly.probeImageSize.probeImageSizeInts.`8`
  */
  trait Orientation extends StObject
  object Orientation {
    
    inline def `1`: typingsJapgolly.probeImageSize.probeImageSizeInts.`1` = 1.asInstanceOf[typingsJapgolly.probeImageSize.probeImageSizeInts.`1`]
    
    inline def `2`: typingsJapgolly.probeImageSize.probeImageSizeInts.`2` = 2.asInstanceOf[typingsJapgolly.probeImageSize.probeImageSizeInts.`2`]
    
    inline def `3`: typingsJapgolly.probeImageSize.probeImageSizeInts.`3` = 3.asInstanceOf[typingsJapgolly.probeImageSize.probeImageSizeInts.`3`]
    
    inline def `4`: typingsJapgolly.probeImageSize.probeImageSizeInts.`4` = 4.asInstanceOf[typingsJapgolly.probeImageSize.probeImageSizeInts.`4`]
    
    inline def `5`: typingsJapgolly.probeImageSize.probeImageSizeInts.`5` = 5.asInstanceOf[typingsJapgolly.probeImageSize.probeImageSizeInts.`5`]
    
    inline def `6`: typingsJapgolly.probeImageSize.probeImageSizeInts.`6` = 6.asInstanceOf[typingsJapgolly.probeImageSize.probeImageSizeInts.`6`]
    
    inline def `7`: typingsJapgolly.probeImageSize.probeImageSizeInts.`7` = 7.asInstanceOf[typingsJapgolly.probeImageSize.probeImageSizeInts.`7`]
    
    inline def `8`: typingsJapgolly.probeImageSize.probeImageSizeInts.`8` = 8.asInstanceOf[typingsJapgolly.probeImageSize.probeImageSizeInts.`8`]
  }
  
  type Parser = js.Function0[ParserStream]
  
  // tslint:disable-next-line:no-empty-interface
  type ParserStream = Transform
  
  trait Parsers_ extends StObject {
    
    def avif(): ParserStream
    @JSName("avif")
    var avif_Original: Parser
    
    def bmp(): ParserStream
    @JSName("bmp")
    var bmp_Original: Parser
    
    def gif(): ParserStream
    @JSName("gif")
    var gif_Original: Parser
    
    def ico(): ParserStream
    @JSName("ico")
    var ico_Original: Parser
    
    def jpeg(): ParserStream
    @JSName("jpeg")
    var jpeg_Original: Parser
    
    def png(): ParserStream
    @JSName("png")
    var png_Original: Parser
    
    def psd(): ParserStream
    @JSName("psd")
    var psd_Original: Parser
    
    def svg(): ParserStream
    @JSName("svg")
    var svg_Original: Parser
    
    def tiff(): ParserStream
    @JSName("tiff")
    var tiff_Original: Parser
    
    def webp(): ParserStream
    @JSName("webp")
    var webp_Original: Parser
  }
  object Parsers_ {
    
    inline def apply(
      avif: CallbackTo[ParserStream],
      bmp: CallbackTo[ParserStream],
      gif: CallbackTo[ParserStream],
      ico: CallbackTo[ParserStream],
      jpeg: CallbackTo[ParserStream],
      png: CallbackTo[ParserStream],
      psd: CallbackTo[ParserStream],
      svg: CallbackTo[ParserStream],
      tiff: CallbackTo[ParserStream],
      webp: CallbackTo[ParserStream]
    ): Parsers_ = {
      val __obj = js.Dynamic.literal(avif = avif.toJsFn, bmp = bmp.toJsFn, gif = gif.toJsFn, ico = ico.toJsFn, jpeg = jpeg.toJsFn, png = png.toJsFn, psd = psd.toJsFn, svg = svg.toJsFn, tiff = tiff.toJsFn, webp = webp.toJsFn)
      __obj.asInstanceOf[Parsers_]
    }
    
    extension [Self <: Parsers_](x: Self) {
      
      inline def setAvif(value: CallbackTo[ParserStream]): Self = StObject.set(x, "avif", value.toJsFn)
      
      inline def setBmp(value: CallbackTo[ParserStream]): Self = StObject.set(x, "bmp", value.toJsFn)
      
      inline def setGif(value: CallbackTo[ParserStream]): Self = StObject.set(x, "gif", value.toJsFn)
      
      inline def setIco(value: CallbackTo[ParserStream]): Self = StObject.set(x, "ico", value.toJsFn)
      
      inline def setJpeg(value: CallbackTo[ParserStream]): Self = StObject.set(x, "jpeg", value.toJsFn)
      
      inline def setPng(value: CallbackTo[ParserStream]): Self = StObject.set(x, "png", value.toJsFn)
      
      inline def setPsd(value: CallbackTo[ParserStream]): Self = StObject.set(x, "psd", value.toJsFn)
      
      inline def setSvg(value: CallbackTo[ParserStream]): Self = StObject.set(x, "svg", value.toJsFn)
      
      inline def setTiff(value: CallbackTo[ParserStream]): Self = StObject.set(x, "tiff", value.toJsFn)
      
      inline def setWebp(value: CallbackTo[ParserStream]): Self = StObject.set(x, "webp", value.toJsFn)
    }
  }
  
  type ProbeError = js.Error
  
  trait ProbeResult extends StObject {
    
    var hUnits: String
    
    var height: Double
    
    var length: Double
    
    var mime: String
    
    var orientation: js.UndefOr[Orientation] = js.undefined
    
    var `type`: String
    
    var url: String
    
    var variants: js.UndefOr[js.Array[Variant]] = js.undefined
    
    var wUnits: String
    
    var width: Double
  }
  object ProbeResult {
    
    inline def apply(
      hUnits: String,
      height: Double,
      length: Double,
      mime: String,
      `type`: String,
      url: String,
      wUnits: String,
      width: Double
    ): ProbeResult = {
      val __obj = js.Dynamic.literal(hUnits = hUnits.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], wUnits = wUnits.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProbeResult]
    }
    
    extension [Self <: ProbeResult](x: Self) {
      
      inline def setHUnits(value: String): Self = StObject.set(x, "hUnits", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVariants(value: js.Array[Variant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
      
      inline def setVariantsVarargs(value: Variant*): Self = StObject.set(x, "variants", js.Array(value*))
      
      inline def setWUnits(value: String): Self = StObject.set(x, "wUnits", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Variant extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Variant {
    
    inline def apply(height: Double, width: Double): Variant = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variant]
    }
    
    extension [Self <: Variant](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
