package typingsJapgolly.gifwrap

import typingsJapgolly.gifwrap.anon.Colors
import typingsJapgolly.gifwrap.anon.MaxHeight
import typingsJapgolly.gifwrap.gifwrapInts.`0`
import typingsJapgolly.gifwrap.gifwrapInts.`1`
import typingsJapgolly.gifwrap.gifwrapInts.`2`
import typingsJapgolly.gifwrap.gifwrapInts.`3`
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.Error
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gifwrap", "BitmapImage")
  @js.native
  open class BitmapImage protected () extends StObject {
    def this(bitmapImage: BitmapImage) = this()
    def this(bitmap: JimpBitmap) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, backgroundRGBA: Double) = this()
    def this(width: Double, height: Double, buffer: Buffer) = this()
    
    var bitmap: JimpBitmap = js.native
    
    def blit(
      toImage: BitmapImage,
      toX: Double,
      toY: Double,
      fromX: Double,
      fromY: Double,
      fromWidth: Double,
      fromHeight: Double
    ): this.type = js.native
    
    def fillRGBA(color: Double): this.type = js.native
    
    def getRGBA(x: Double, y: Double): Double = js.native
    
    def getRGBASet(): Set[Double] = js.native
    
    def greyscale(): this.type = js.native
    
    def reframe(xOffset: Double, yOffset: Double, width: Double, height: Double): this.type = js.native
    def reframe(xOffset: Double, yOffset: Double, width: Double, height: Double, fillRGBA: Double): this.type = js.native
    
    def scale(factor: Double): this.type = js.native
    
    def scanAllCoords(handler: js.Function3[/* x */ Double, /* y */ Double, /* bufferIndex */ Double, Unit]): Unit = js.native
    
    def scanAllIndexes(handler: js.Function1[/* bufferIndex */ Double, Unit]): Unit = js.native
  }
  
  @JSImport("gifwrap", "Gif")
  @js.native
  open class Gif protected ()
    extends StObject
       with GifSpec {
    def this(frames: js.Array[GifFrame], buffer: Buffer) = this()
    def this(frames: js.Array[GifFrame], buffer: Buffer, spec: GifSpec) = this()
    
    var buffer: Buffer = js.native
    
    @JSName("colorScope")
    var colorScope_Gif: `0` | `1` | `2` = js.native
    
    var frames: js.Array[GifFrame] = js.native
    
    var height: Double = js.native
    
    @JSName("loops")
    var loops_Gif: Double = js.native
    
    var usesTransparency: Boolean = js.native
    
    var width: Double = js.native
  }
  /* static members */
  object Gif {
    
    @JSImport("gifwrap", "Gif.GlobalColorsOnly")
    @js.native
    val GlobalColorsOnly: `1` = js.native
    
    @JSImport("gifwrap", "Gif.GlobalColorsPreferred")
    @js.native
    val GlobalColorsPreferred: `0` = js.native
    
    @JSImport("gifwrap", "Gif.LocalColorsOnly")
    @js.native
    val LocalColorsOnly: `2` = js.native
  }
  
  @JSImport("gifwrap", "GifCodec")
  @js.native
  open class GifCodec ()
    extends StObject
       with GifEncoder
       with GifDecoder {
    def this(options: GifCodecOptions) = this()
    
    /* CompleteClass */
    override def decodeGif(buffer: Buffer): js.Promise[Gif] = js.native
    
    /* CompleteClass */
    override def encodeGif(frames: js.Array[GifFrame], spec: GifSpec): js.Promise[Gif] = js.native
  }
  
  @JSImport("gifwrap", "GifError")
  @js.native
  open class GifError protected ()
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
  
  @JSImport("gifwrap", "GifFrame")
  @js.native
  open class GifFrame protected ()
    extends BitmapImage
       with GifFrameOptions {
    def this(bitmapImage: BitmapImage) = this()
    def this(bitmap: JimpBitmap) = this()
    def this(frame: GifFrame) = this()
    def this(bitmapImage: BitmapImage, options: GifFrameOptions) = this()
    def this(bitmap: JimpBitmap, options: GifFrameOptions) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, backgroundRGBA: Double) = this()
    def this(width: Double, height: Double, buffer: Buffer) = this()
    def this(width: Double, height: Double, backgroundRGBA: Double, options: GifFrameOptions) = this()
    def this(width: Double, height: Double, backgroundRGBA: Unit, options: GifFrameOptions) = this()
    def this(width: Double, height: Double, buffer: Buffer, options: GifFrameOptions) = this()
    
    @JSName("delayCentisecs")
    var delayCentisecs_GifFrame: Double = js.native
    
    @JSName("disposalMethod")
    var disposalMethod_GifFrame: `0` | `1` | `2` | `3` = js.native
    
    def getPalette(): GifPalette = js.native
    
    var interlaced: Boolean = js.native
    
    @JSName("xOffset")
    var xOffset_GifFrame: Double = js.native
    
    @JSName("yOffset")
    var yOffset_GifFrame: Double = js.native
  }
  /* static members */
  object GifFrame {
    
    @JSImport("gifwrap", "GifFrame.DisposeNothing")
    @js.native
    val DisposeNothing: `1` = js.native
    
    @JSImport("gifwrap", "GifFrame.DisposeToAnything")
    @js.native
    val DisposeToAnything: `0` = js.native
    
    @JSImport("gifwrap", "GifFrame.DisposeToBackgroundColor")
    @js.native
    val DisposeToBackgroundColor: `2` = js.native
    
    @JSImport("gifwrap", "GifFrame.DisposeToPrevious")
    @js.native
    val DisposeToPrevious: `3` = js.native
  }
  
  object GifUtil {
    
    @JSImport("gifwrap", "GifUtil")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cloneFrames(frames: js.Array[GifFrame]): js.Array[GifFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneFrames")(frames.asInstanceOf[js.Any]).asInstanceOf[js.Array[GifFrame]]
    
    inline def copyAsJimp(jimp: Any, bitmapImageToCopy: BitmapImage): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAsJimp")(jimp.asInstanceOf[js.Any], bitmapImageToCopy.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getColorInfo(frames: js.Array[GifFrame]): Colors = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorInfo")(frames.asInstanceOf[js.Any]).asInstanceOf[Colors]
    inline def getColorInfo(frames: js.Array[GifFrame], maxGlobalIndex: Double): Colors = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorInfo")(frames.asInstanceOf[js.Any], maxGlobalIndex.asInstanceOf[js.Any])).asInstanceOf[Colors]
    
    inline def getMaxDimensions(frames: js.Array[GifFrame]): MaxHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxDimensions")(frames.asInstanceOf[js.Any]).asInstanceOf[MaxHeight]
    
    inline def quantizeDekker(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeDekker")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeDekker(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double, dither: Dither): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeDekker")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any], dither.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeDekker(imageOrImages: BitmapImage, maxColorIndexes: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeDekker")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeDekker(imageOrImages: BitmapImage, maxColorIndexes: Double, dither: Dither): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeDekker")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any], dither.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def quantizeSorokin(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeSorokin")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeSorokin(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double, histogram: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeSorokin")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any], histogram.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeSorokin(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double, histogram: String, dither: Dither): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeSorokin")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any], histogram.asInstanceOf[js.Any], dither.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeSorokin(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double, histogram: Unit, dither: Dither): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeSorokin")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any], histogram.asInstanceOf[js.Any], dither.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeSorokin(imageOrImages: BitmapImage, maxColorIndexes: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeSorokin")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeSorokin(imageOrImages: BitmapImage, maxColorIndexes: Double, histogram: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeSorokin")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any], histogram.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeSorokin(imageOrImages: BitmapImage, maxColorIndexes: Double, histogram: String, dither: Dither): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeSorokin")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any], histogram.asInstanceOf[js.Any], dither.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeSorokin(imageOrImages: BitmapImage, maxColorIndexes: Double, histogram: Unit, dither: Dither): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeSorokin")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any], histogram.asInstanceOf[js.Any], dither.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def quantizeWu(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeWu")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeWu(imageOrImages: js.Array[BitmapImage], maxColorIndexes: Double, significantBits: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeWu")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any], significantBits.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeWu(
      imageOrImages: js.Array[BitmapImage],
      maxColorIndexes: Double,
      significantBits: Double,
      dither: Dither
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeWu")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any], significantBits.asInstanceOf[js.Any], dither.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeWu(
      imageOrImages: js.Array[BitmapImage],
      maxColorIndexes: Double,
      significantBits: Unit,
      dither: Dither
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeWu")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any], significantBits.asInstanceOf[js.Any], dither.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeWu(imageOrImages: BitmapImage, maxColorIndexes: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeWu")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeWu(imageOrImages: BitmapImage, maxColorIndexes: Double, significantBits: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeWu")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any], significantBits.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeWu(imageOrImages: BitmapImage, maxColorIndexes: Double, significantBits: Double, dither: Dither): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeWu")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any], significantBits.asInstanceOf[js.Any], dither.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def quantizeWu(imageOrImages: BitmapImage, maxColorIndexes: Double, significantBits: Unit, dither: Dither): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("quantizeWu")(imageOrImages.asInstanceOf[js.Any], maxColorIndexes.asInstanceOf[js.Any], significantBits.asInstanceOf[js.Any], dither.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def read(source: String): js.Promise[Gif] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Gif]]
    inline def read(source: String, decoder: GifDecoder): js.Promise[Gif] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(source.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Gif]]
    inline def read(source: Buffer): js.Promise[Gif] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Gif]]
    inline def read(source: Buffer, decoder: GifDecoder): js.Promise[Gif] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(source.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Gif]]
    
    inline def shareAsJimp(jimp: Any, bitmapImageToCopy: BitmapImage): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("shareAsJimp")(jimp.asInstanceOf[js.Any], bitmapImageToCopy.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def write(path: String, frames: js.Array[GifFrame]): js.Promise[Gif] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(path.asInstanceOf[js.Any], frames.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Gif]]
    inline def write(path: String, frames: js.Array[GifFrame], spec: Unit, encoder: GifEncoder): js.Promise[Gif] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(path.asInstanceOf[js.Any], frames.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Gif]]
    inline def write(path: String, frames: js.Array[GifFrame], spec: GifSpec): js.Promise[Gif] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(path.asInstanceOf[js.Any], frames.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Gif]]
    inline def write(path: String, frames: js.Array[GifFrame], spec: GifSpec, encoder: GifEncoder): js.Promise[Gif] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(path.asInstanceOf[js.Any], frames.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Gif]]
  }
  
  trait Dither extends StObject {
    
    // default = true
    var calculateErrorLikeGIMP: js.UndefOr[Boolean] = js.undefined
    
    var ditherAlgorithm: DitherAlgorithm
    
    var minimumColorDistanceToDither: js.UndefOr[Double] = js.undefined
    
    // default = 0
    var serpentine: js.UndefOr[Boolean] = js.undefined
  }
  object Dither {
    
    inline def apply(ditherAlgorithm: DitherAlgorithm): Dither = {
      val __obj = js.Dynamic.literal(ditherAlgorithm = ditherAlgorithm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dither]
    }
    
    extension [Self <: Dither](x: Self) {
      
      inline def setCalculateErrorLikeGIMP(value: Boolean): Self = StObject.set(x, "calculateErrorLikeGIMP", value.asInstanceOf[js.Any])
      
      inline def setCalculateErrorLikeGIMPUndefined: Self = StObject.set(x, "calculateErrorLikeGIMP", js.undefined)
      
      inline def setDitherAlgorithm(value: DitherAlgorithm): Self = StObject.set(x, "ditherAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setMinimumColorDistanceToDither(value: Double): Self = StObject.set(x, "minimumColorDistanceToDither", value.asInstanceOf[js.Any])
      
      inline def setMinimumColorDistanceToDitherUndefined: Self = StObject.set(x, "minimumColorDistanceToDither", js.undefined)
      
      inline def setSerpentine(value: Boolean): Self = StObject.set(x, "serpentine", value.asInstanceOf[js.Any])
      
      inline def setSerpentineUndefined: Self = StObject.set(x, "serpentine", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.gifwrap.gifwrapStrings.FloydSteinberg
    - typingsJapgolly.gifwrap.gifwrapStrings.FalseFloydSteinberg
    - typingsJapgolly.gifwrap.gifwrapStrings.Stucki
    - typingsJapgolly.gifwrap.gifwrapStrings.Atkinson
    - typingsJapgolly.gifwrap.gifwrapStrings.Jarvis
    - typingsJapgolly.gifwrap.gifwrapStrings.Burkes
    - typingsJapgolly.gifwrap.gifwrapStrings.Sierra
    - typingsJapgolly.gifwrap.gifwrapStrings.TwoSierra
    - typingsJapgolly.gifwrap.gifwrapStrings.SierraLite
  */
  trait DitherAlgorithm extends StObject
  object DitherAlgorithm {
    
    inline def Atkinson: typingsJapgolly.gifwrap.gifwrapStrings.Atkinson = "Atkinson".asInstanceOf[typingsJapgolly.gifwrap.gifwrapStrings.Atkinson]
    
    inline def Burkes: typingsJapgolly.gifwrap.gifwrapStrings.Burkes = "Burkes".asInstanceOf[typingsJapgolly.gifwrap.gifwrapStrings.Burkes]
    
    inline def FalseFloydSteinberg: typingsJapgolly.gifwrap.gifwrapStrings.FalseFloydSteinberg = "FalseFloydSteinberg".asInstanceOf[typingsJapgolly.gifwrap.gifwrapStrings.FalseFloydSteinberg]
    
    inline def FloydSteinberg: typingsJapgolly.gifwrap.gifwrapStrings.FloydSteinberg = "FloydSteinberg".asInstanceOf[typingsJapgolly.gifwrap.gifwrapStrings.FloydSteinberg]
    
    inline def Jarvis: typingsJapgolly.gifwrap.gifwrapStrings.Jarvis = "Jarvis".asInstanceOf[typingsJapgolly.gifwrap.gifwrapStrings.Jarvis]
    
    inline def Sierra: typingsJapgolly.gifwrap.gifwrapStrings.Sierra = "Sierra".asInstanceOf[typingsJapgolly.gifwrap.gifwrapStrings.Sierra]
    
    inline def SierraLite: typingsJapgolly.gifwrap.gifwrapStrings.SierraLite = "SierraLite".asInstanceOf[typingsJapgolly.gifwrap.gifwrapStrings.SierraLite]
    
    inline def Stucki: typingsJapgolly.gifwrap.gifwrapStrings.Stucki = "Stucki".asInstanceOf[typingsJapgolly.gifwrap.gifwrapStrings.Stucki]
    
    inline def TwoSierra: typingsJapgolly.gifwrap.gifwrapStrings.TwoSierra = "TwoSierra".asInstanceOf[typingsJapgolly.gifwrap.gifwrapStrings.TwoSierra]
  }
  
  trait GifCodecOptions extends StObject {
    
    var transparentRGB: js.UndefOr[Double] = js.undefined
  }
  object GifCodecOptions {
    
    inline def apply(): GifCodecOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GifCodecOptions]
    }
    
    extension [Self <: GifCodecOptions](x: Self) {
      
      inline def setTransparentRGB(value: Double): Self = StObject.set(x, "transparentRGB", value.asInstanceOf[js.Any])
      
      inline def setTransparentRGBUndefined: Self = StObject.set(x, "transparentRGB", js.undefined)
    }
  }
  
  trait GifDecoder extends StObject {
    
    def decodeGif(buffer: Buffer): js.Promise[Gif]
  }
  object GifDecoder {
    
    inline def apply(decodeGif: Buffer => js.Promise[Gif]): GifDecoder = {
      val __obj = js.Dynamic.literal(decodeGif = js.Any.fromFunction1(decodeGif))
      __obj.asInstanceOf[GifDecoder]
    }
    
    extension [Self <: GifDecoder](x: Self) {
      
      inline def setDecodeGif(value: Buffer => js.Promise[Gif]): Self = StObject.set(x, "decodeGif", js.Any.fromFunction1(value))
    }
  }
  
  trait GifEncoder extends StObject {
    
    def encodeGif(frames: js.Array[GifFrame], spec: GifSpec): js.Promise[Gif]
  }
  object GifEncoder {
    
    inline def apply(encodeGif: (js.Array[GifFrame], GifSpec) => js.Promise[Gif]): GifEncoder = {
      val __obj = js.Dynamic.literal(encodeGif = js.Any.fromFunction2(encodeGif))
      __obj.asInstanceOf[GifEncoder]
    }
    
    extension [Self <: GifEncoder](x: Self) {
      
      inline def setEncodeGif(value: (js.Array[GifFrame], GifSpec) => js.Promise[Gif]): Self = StObject.set(x, "encodeGif", js.Any.fromFunction2(value))
    }
  }
  
  trait GifFrameOptions extends StObject {
    
    var delayCentisecs: js.UndefOr[Double] = js.undefined
    
    var disposalMethod: js.UndefOr[`0` | `1` | `2` | `3`] = js.undefined
    
    var isInterlaced: js.UndefOr[Boolean] = js.undefined
    
    var xOffset: js.UndefOr[Double] = js.undefined
    
    var yOffset: js.UndefOr[Double] = js.undefined
  }
  object GifFrameOptions {
    
    inline def apply(): GifFrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GifFrameOptions]
    }
    
    extension [Self <: GifFrameOptions](x: Self) {
      
      inline def setDelayCentisecs(value: Double): Self = StObject.set(x, "delayCentisecs", value.asInstanceOf[js.Any])
      
      inline def setDelayCentisecsUndefined: Self = StObject.set(x, "delayCentisecs", js.undefined)
      
      inline def setDisposalMethod(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "disposalMethod", value.asInstanceOf[js.Any])
      
      inline def setDisposalMethodUndefined: Self = StObject.set(x, "disposalMethod", js.undefined)
      
      inline def setIsInterlaced(value: Boolean): Self = StObject.set(x, "isInterlaced", value.asInstanceOf[js.Any])
      
      inline def setIsInterlacedUndefined: Self = StObject.set(x, "isInterlaced", js.undefined)
      
      inline def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
      
      inline def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
      
      inline def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
      
      inline def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
    }
  }
  
  trait GifPalette extends StObject {
    
    var colors: js.Array[Double]
    
    var indexCount: Double
    
    var usesTransparency: Boolean
  }
  object GifPalette {
    
    inline def apply(colors: js.Array[Double], indexCount: Double, usesTransparency: Boolean): GifPalette = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], indexCount = indexCount.asInstanceOf[js.Any], usesTransparency = usesTransparency.asInstanceOf[js.Any])
      __obj.asInstanceOf[GifPalette]
    }
    
    extension [Self <: GifPalette](x: Self) {
      
      inline def setColors(value: js.Array[Double]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsVarargs(value: Double*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setIndexCount(value: Double): Self = StObject.set(x, "indexCount", value.asInstanceOf[js.Any])
      
      inline def setUsesTransparency(value: Boolean): Self = StObject.set(x, "usesTransparency", value.asInstanceOf[js.Any])
    }
  }
  
  trait GifSpec extends StObject {
    
    var colorScope: js.UndefOr[`0` | `1` | `2`] = js.undefined
    
    var loops: js.UndefOr[Double] = js.undefined
  }
  object GifSpec {
    
    inline def apply(): GifSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GifSpec]
    }
    
    extension [Self <: GifSpec](x: Self) {
      
      inline def setColorScope(value: `0` | `1` | `2`): Self = StObject.set(x, "colorScope", value.asInstanceOf[js.Any])
      
      inline def setColorScopeUndefined: Self = StObject.set(x, "colorScope", js.undefined)
      
      inline def setLoops(value: Double): Self = StObject.set(x, "loops", value.asInstanceOf[js.Any])
      
      inline def setLoopsUndefined: Self = StObject.set(x, "loops", js.undefined)
    }
  }
  
  trait JimpBitmap extends StObject {
    
    var data: Buffer
    
    var height: Double
    
    var width: Double
  }
  object JimpBitmap {
    
    inline def apply(data: Buffer, height: Double, width: Double): JimpBitmap = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[JimpBitmap]
    }
    
    extension [Self <: JimpBitmap](x: Self) {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
