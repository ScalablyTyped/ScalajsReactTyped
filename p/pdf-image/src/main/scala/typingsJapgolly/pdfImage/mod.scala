package typingsJapgolly.pdfImage

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pdfImage.anon.ReadonlyConvertOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pdf-image", "PDFImage")
  @js.native
  open class PDFImage[CombinedImage /* <: Boolean */] protected () extends StObject {
    def this(
      path: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type OptionalSpread<CombinedImage> is not an array type */ options: OptionalSpread[CombinedImage]
    ) = this()
    
    def combineImages(imagePaths: js.Array[String]): js.Promise[String] = js.native
    
    def constructCombineCommandForFile(imagePaths: js.Array[String]): String = js.native
    
    def constructConvertCommandForPage(pageNumber: Double): String = js.native
    
    def constructConvertOptions(): String = js.native
    
    def constructGetInfoCommand(): String = js.native
    
    def convertFile(): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: CombinedImage extends true ? string : std.Array<string> */ js.Any
      ] = js.native
    
    def convertPage(pageNumber: Double): js.Promise[String] = js.native
    
    def getInfo(): js.Promise[PDFInfo] = js.native
    
    def getOutputImagePathForFile(): String = js.native
    
    def getOutputImagePathForPage(pageNumber: Double): String = js.native
    
    def parseGetInfoCommandOutput(output: String): StringDictionary[String] = js.native
    
    def setConvertExtension(): Unit = js.native
    def setConvertExtension(convertExtension: String): Unit = js.native
    
    def setConvertOptions(): Unit = js.native
    def setConvertOptions(convertOptions: ReadonlyConvertOptions): Unit = js.native
    
    def setPdfFileBaseName(): Unit = js.native
    def setPdfFileBaseName(pdfFileBaseName: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pdfImage.pdfImageStrings.`-adaptive-blur`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-adaptive-resize`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-adaptive-sharpen`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-adjoin`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-affine`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-alpha`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-annotate`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-antialias`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-append`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-authenticate`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-auto-gamma`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-auto-level`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-auto-orient`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-auto-threshold`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-background`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-bench`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-bias`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-black-threshold`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-blue-primary`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-blue-shift`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-blur`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-border`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-bordercolor`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-brightness-contrast`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-canny`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-caption`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-cdl`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-channel`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-charcoal`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-chop`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-clahe`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-clamp`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-clip`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-clip-mask`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-clip-path`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-clone`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-clut`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-connected-components`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-contrast-stretch`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-coalesce`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-colorize`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-color-matrix`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-colors`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-colorspace`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-combine`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-comment`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-compare`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-complexoperator`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-compose`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-composite`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-compress`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-contrast`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-convolve`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-copy`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-crop`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-cycle`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-decipher`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-debug`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-define`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-deconstruct`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-delay`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-delete`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-density`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-depth`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-despeckle`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-direction`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-display`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-dispose`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-distribute-cache`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-distort`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-dither`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-draw`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-duplicate`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-edge`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-emboss`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-encipher`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-encoding`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-endian`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-enhance`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-equalize`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-evaluate`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-evaluate-sequence`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-extent`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-extract`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-family`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-features`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-fft`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-fill`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-filter`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-flatten`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-flip`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-floodfill`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-flop`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-font`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-format`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-frame`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-function`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-fuzz`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-fx`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-gamma`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-gaussian-blur`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-geometry`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-gravity`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-grayscale`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-green-primary`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-help`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-hough-lines`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-identify`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-ift`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-implode`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-insert`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-intensity`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-intent`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-interlace`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-interline-spacing`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-interpolate`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-interword-spacing`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-kerning`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-kmeans`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-kuwahara`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-label`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-lat`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-layers`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-level`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-limit`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-linear-stretch`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-liquid-rescale`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-list`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-log`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-loop`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-mattecolor`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-median`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-mean-shift`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-metric`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-mode`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-modulate`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-moments`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-monitor`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-monochrome`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-morph`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-morphology`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-motion-blur`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-negate`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-noise`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-normalize`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-opaque`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-ordered-dither`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-orient`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-page`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-paint`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-perceptible`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-ping`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-pointsize`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-polaroid`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-poly`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-posterize`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-precision`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-preview`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-print`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-process`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-profile`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-quality`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-quantize`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-quiet`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-radial-blur`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-raise`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-random-threshold`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-range-threshold`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-read-mask`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-red-primary`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-regard-warnings`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-region`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-remap`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-render`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-repage`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-resample`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-resize`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-respect-parentheses`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-roll`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-rotate`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-sample`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-sampling-factor`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-scale`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-scene`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-seed`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-segment`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-selective-blur`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-separate`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-sepia-tone`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-set`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-shade`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-shadow`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-sharpen`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-shave`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-shear`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-sigmoidal-contrast`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-smush`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-size`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-sketch`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-solarize`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-splice`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-spread`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-statistic`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-strip`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-stroke`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-strokewidth`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-stretch`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-style`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-swap`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-swirl`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-synchronize`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-taint`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-texture`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-threshold`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-thumbnail`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-tile`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-tile-offset`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-tint`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-transform`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-transparent`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-transparent-color`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-transpose`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-transverse`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-treedepth`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-trim`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-type`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-undercolor`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-unique-colors`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-units`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-unsharp`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-verbose`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-version`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-view`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-vignette`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-virtual-pixel`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-wave`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-wavelet-denoise`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-weight`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-white-point`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-white-threshold`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-write`
    - typingsJapgolly.pdfImage.pdfImageStrings.`-write-mask`
  */
  trait ConvertOptionKey extends StObject
  object ConvertOptionKey {
    
    inline def `-adaptive-blur`: typingsJapgolly.pdfImage.pdfImageStrings.`-adaptive-blur` = "-adaptive-blur".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-adaptive-blur`]
    
    inline def `-adaptive-resize`: typingsJapgolly.pdfImage.pdfImageStrings.`-adaptive-resize` = "-adaptive-resize".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-adaptive-resize`]
    
    inline def `-adaptive-sharpen`: typingsJapgolly.pdfImage.pdfImageStrings.`-adaptive-sharpen` = "-adaptive-sharpen".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-adaptive-sharpen`]
    
    inline def `-adjoin`: typingsJapgolly.pdfImage.pdfImageStrings.`-adjoin` = "-adjoin".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-adjoin`]
    
    inline def `-affine`: typingsJapgolly.pdfImage.pdfImageStrings.`-affine` = "-affine".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-affine`]
    
    inline def `-alpha`: typingsJapgolly.pdfImage.pdfImageStrings.`-alpha` = "-alpha".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-alpha`]
    
    inline def `-annotate`: typingsJapgolly.pdfImage.pdfImageStrings.`-annotate` = "-annotate".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-annotate`]
    
    inline def `-antialias`: typingsJapgolly.pdfImage.pdfImageStrings.`-antialias` = "-antialias".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-antialias`]
    
    inline def `-append`: typingsJapgolly.pdfImage.pdfImageStrings.`-append` = "-append".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-append`]
    
    inline def `-authenticate`: typingsJapgolly.pdfImage.pdfImageStrings.`-authenticate` = "-authenticate".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-authenticate`]
    
    inline def `-auto-gamma`: typingsJapgolly.pdfImage.pdfImageStrings.`-auto-gamma` = "-auto-gamma".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-auto-gamma`]
    
    inline def `-auto-level`: typingsJapgolly.pdfImage.pdfImageStrings.`-auto-level` = "-auto-level".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-auto-level`]
    
    inline def `-auto-orient`: typingsJapgolly.pdfImage.pdfImageStrings.`-auto-orient` = "-auto-orient".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-auto-orient`]
    
    inline def `-auto-threshold`: typingsJapgolly.pdfImage.pdfImageStrings.`-auto-threshold` = "-auto-threshold".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-auto-threshold`]
    
    inline def `-background`: typingsJapgolly.pdfImage.pdfImageStrings.`-background` = "-background".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-background`]
    
    inline def `-bench`: typingsJapgolly.pdfImage.pdfImageStrings.`-bench` = "-bench".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-bench`]
    
    inline def `-bias`: typingsJapgolly.pdfImage.pdfImageStrings.`-bias` = "-bias".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-bias`]
    
    inline def `-black-threshold`: typingsJapgolly.pdfImage.pdfImageStrings.`-black-threshold` = "-black-threshold".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-black-threshold`]
    
    inline def `-blue-primary`: typingsJapgolly.pdfImage.pdfImageStrings.`-blue-primary` = "-blue-primary".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-blue-primary`]
    
    inline def `-blue-shift`: typingsJapgolly.pdfImage.pdfImageStrings.`-blue-shift` = "-blue-shift".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-blue-shift`]
    
    inline def `-blur`: typingsJapgolly.pdfImage.pdfImageStrings.`-blur` = "-blur".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-blur`]
    
    inline def `-border`: typingsJapgolly.pdfImage.pdfImageStrings.`-border` = "-border".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-border`]
    
    inline def `-bordercolor`: typingsJapgolly.pdfImage.pdfImageStrings.`-bordercolor` = "-bordercolor".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-bordercolor`]
    
    inline def `-brightness-contrast`: typingsJapgolly.pdfImage.pdfImageStrings.`-brightness-contrast` = "-brightness-contrast".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-brightness-contrast`]
    
    inline def `-canny`: typingsJapgolly.pdfImage.pdfImageStrings.`-canny` = "-canny".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-canny`]
    
    inline def `-caption`: typingsJapgolly.pdfImage.pdfImageStrings.`-caption` = "-caption".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-caption`]
    
    inline def `-cdl`: typingsJapgolly.pdfImage.pdfImageStrings.`-cdl` = "-cdl".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-cdl`]
    
    inline def `-channel`: typingsJapgolly.pdfImage.pdfImageStrings.`-channel` = "-channel".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-channel`]
    
    inline def `-charcoal`: typingsJapgolly.pdfImage.pdfImageStrings.`-charcoal` = "-charcoal".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-charcoal`]
    
    inline def `-chop`: typingsJapgolly.pdfImage.pdfImageStrings.`-chop` = "-chop".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-chop`]
    
    inline def `-clahe`: typingsJapgolly.pdfImage.pdfImageStrings.`-clahe` = "-clahe".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-clahe`]
    
    inline def `-clamp`: typingsJapgolly.pdfImage.pdfImageStrings.`-clamp` = "-clamp".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-clamp`]
    
    inline def `-clip`: typingsJapgolly.pdfImage.pdfImageStrings.`-clip` = "-clip".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-clip`]
    
    inline def `-clip-mask`: typingsJapgolly.pdfImage.pdfImageStrings.`-clip-mask` = "-clip-mask".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-clip-mask`]
    
    inline def `-clip-path`: typingsJapgolly.pdfImage.pdfImageStrings.`-clip-path` = "-clip-path".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-clip-path`]
    
    inline def `-clone`: typingsJapgolly.pdfImage.pdfImageStrings.`-clone` = "-clone".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-clone`]
    
    inline def `-clut`: typingsJapgolly.pdfImage.pdfImageStrings.`-clut` = "-clut".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-clut`]
    
    inline def `-coalesce`: typingsJapgolly.pdfImage.pdfImageStrings.`-coalesce` = "-coalesce".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-coalesce`]
    
    inline def `-color-matrix`: typingsJapgolly.pdfImage.pdfImageStrings.`-color-matrix` = "-color-matrix".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-color-matrix`]
    
    inline def `-colorize`: typingsJapgolly.pdfImage.pdfImageStrings.`-colorize` = "-colorize".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-colorize`]
    
    inline def `-colors`: typingsJapgolly.pdfImage.pdfImageStrings.`-colors` = "-colors".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-colors`]
    
    inline def `-colorspace`: typingsJapgolly.pdfImage.pdfImageStrings.`-colorspace` = "-colorspace".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-colorspace`]
    
    inline def `-combine`: typingsJapgolly.pdfImage.pdfImageStrings.`-combine` = "-combine".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-combine`]
    
    inline def `-comment`: typingsJapgolly.pdfImage.pdfImageStrings.`-comment` = "-comment".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-comment`]
    
    inline def `-compare`: typingsJapgolly.pdfImage.pdfImageStrings.`-compare` = "-compare".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-compare`]
    
    inline def `-complexoperator`: typingsJapgolly.pdfImage.pdfImageStrings.`-complexoperator` = "-complexoperator".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-complexoperator`]
    
    inline def `-compose`: typingsJapgolly.pdfImage.pdfImageStrings.`-compose` = "-compose".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-compose`]
    
    inline def `-composite`: typingsJapgolly.pdfImage.pdfImageStrings.`-composite` = "-composite".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-composite`]
    
    inline def `-compress`: typingsJapgolly.pdfImage.pdfImageStrings.`-compress` = "-compress".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-compress`]
    
    inline def `-connected-components`: typingsJapgolly.pdfImage.pdfImageStrings.`-connected-components` = "-connected-components".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-connected-components`]
    
    inline def `-contrast`: typingsJapgolly.pdfImage.pdfImageStrings.`-contrast` = "-contrast".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-contrast`]
    
    inline def `-contrast-stretch`: typingsJapgolly.pdfImage.pdfImageStrings.`-contrast-stretch` = "-contrast-stretch".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-contrast-stretch`]
    
    inline def `-convolve`: typingsJapgolly.pdfImage.pdfImageStrings.`-convolve` = "-convolve".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-convolve`]
    
    inline def `-copy`: typingsJapgolly.pdfImage.pdfImageStrings.`-copy` = "-copy".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-copy`]
    
    inline def `-crop`: typingsJapgolly.pdfImage.pdfImageStrings.`-crop` = "-crop".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-crop`]
    
    inline def `-cycle`: typingsJapgolly.pdfImage.pdfImageStrings.`-cycle` = "-cycle".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-cycle`]
    
    inline def `-debug`: typingsJapgolly.pdfImage.pdfImageStrings.`-debug` = "-debug".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-debug`]
    
    inline def `-decipher`: typingsJapgolly.pdfImage.pdfImageStrings.`-decipher` = "-decipher".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-decipher`]
    
    inline def `-deconstruct`: typingsJapgolly.pdfImage.pdfImageStrings.`-deconstruct` = "-deconstruct".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-deconstruct`]
    
    inline def `-define`: typingsJapgolly.pdfImage.pdfImageStrings.`-define` = "-define".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-define`]
    
    inline def `-delay`: typingsJapgolly.pdfImage.pdfImageStrings.`-delay` = "-delay".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-delay`]
    
    inline def `-delete`: typingsJapgolly.pdfImage.pdfImageStrings.`-delete` = "-delete".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-delete`]
    
    inline def `-density`: typingsJapgolly.pdfImage.pdfImageStrings.`-density` = "-density".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-density`]
    
    inline def `-depth`: typingsJapgolly.pdfImage.pdfImageStrings.`-depth` = "-depth".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-depth`]
    
    inline def `-despeckle`: typingsJapgolly.pdfImage.pdfImageStrings.`-despeckle` = "-despeckle".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-despeckle`]
    
    inline def `-direction`: typingsJapgolly.pdfImage.pdfImageStrings.`-direction` = "-direction".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-direction`]
    
    inline def `-display`: typingsJapgolly.pdfImage.pdfImageStrings.`-display` = "-display".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-display`]
    
    inline def `-dispose`: typingsJapgolly.pdfImage.pdfImageStrings.`-dispose` = "-dispose".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-dispose`]
    
    inline def `-distort`: typingsJapgolly.pdfImage.pdfImageStrings.`-distort` = "-distort".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-distort`]
    
    inline def `-distribute-cache`: typingsJapgolly.pdfImage.pdfImageStrings.`-distribute-cache` = "-distribute-cache".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-distribute-cache`]
    
    inline def `-dither`: typingsJapgolly.pdfImage.pdfImageStrings.`-dither` = "-dither".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-dither`]
    
    inline def `-draw`: typingsJapgolly.pdfImage.pdfImageStrings.`-draw` = "-draw".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-draw`]
    
    inline def `-duplicate`: typingsJapgolly.pdfImage.pdfImageStrings.`-duplicate` = "-duplicate".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-duplicate`]
    
    inline def `-edge`: typingsJapgolly.pdfImage.pdfImageStrings.`-edge` = "-edge".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-edge`]
    
    inline def `-emboss`: typingsJapgolly.pdfImage.pdfImageStrings.`-emboss` = "-emboss".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-emboss`]
    
    inline def `-encipher`: typingsJapgolly.pdfImage.pdfImageStrings.`-encipher` = "-encipher".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-encipher`]
    
    inline def `-encoding`: typingsJapgolly.pdfImage.pdfImageStrings.`-encoding` = "-encoding".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-encoding`]
    
    inline def `-endian`: typingsJapgolly.pdfImage.pdfImageStrings.`-endian` = "-endian".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-endian`]
    
    inline def `-enhance`: typingsJapgolly.pdfImage.pdfImageStrings.`-enhance` = "-enhance".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-enhance`]
    
    inline def `-equalize`: typingsJapgolly.pdfImage.pdfImageStrings.`-equalize` = "-equalize".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-equalize`]
    
    inline def `-evaluate`: typingsJapgolly.pdfImage.pdfImageStrings.`-evaluate` = "-evaluate".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-evaluate`]
    
    inline def `-evaluate-sequence`: typingsJapgolly.pdfImage.pdfImageStrings.`-evaluate-sequence` = "-evaluate-sequence".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-evaluate-sequence`]
    
    inline def `-extent`: typingsJapgolly.pdfImage.pdfImageStrings.`-extent` = "-extent".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-extent`]
    
    inline def `-extract`: typingsJapgolly.pdfImage.pdfImageStrings.`-extract` = "-extract".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-extract`]
    
    inline def `-family`: typingsJapgolly.pdfImage.pdfImageStrings.`-family` = "-family".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-family`]
    
    inline def `-features`: typingsJapgolly.pdfImage.pdfImageStrings.`-features` = "-features".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-features`]
    
    inline def `-fft`: typingsJapgolly.pdfImage.pdfImageStrings.`-fft` = "-fft".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-fft`]
    
    inline def `-fill`: typingsJapgolly.pdfImage.pdfImageStrings.`-fill` = "-fill".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-fill`]
    
    inline def `-filter`: typingsJapgolly.pdfImage.pdfImageStrings.`-filter` = "-filter".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-filter`]
    
    inline def `-flatten`: typingsJapgolly.pdfImage.pdfImageStrings.`-flatten` = "-flatten".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-flatten`]
    
    inline def `-flip`: typingsJapgolly.pdfImage.pdfImageStrings.`-flip` = "-flip".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-flip`]
    
    inline def `-floodfill`: typingsJapgolly.pdfImage.pdfImageStrings.`-floodfill` = "-floodfill".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-floodfill`]
    
    inline def `-flop`: typingsJapgolly.pdfImage.pdfImageStrings.`-flop` = "-flop".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-flop`]
    
    inline def `-font`: typingsJapgolly.pdfImage.pdfImageStrings.`-font` = "-font".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-font`]
    
    inline def `-format`: typingsJapgolly.pdfImage.pdfImageStrings.`-format` = "-format".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-format`]
    
    inline def `-frame`: typingsJapgolly.pdfImage.pdfImageStrings.`-frame` = "-frame".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-frame`]
    
    inline def `-function`: typingsJapgolly.pdfImage.pdfImageStrings.`-function` = "-function".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-function`]
    
    inline def `-fuzz`: typingsJapgolly.pdfImage.pdfImageStrings.`-fuzz` = "-fuzz".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-fuzz`]
    
    inline def `-fx`: typingsJapgolly.pdfImage.pdfImageStrings.`-fx` = "-fx".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-fx`]
    
    inline def `-gamma`: typingsJapgolly.pdfImage.pdfImageStrings.`-gamma` = "-gamma".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-gamma`]
    
    inline def `-gaussian-blur`: typingsJapgolly.pdfImage.pdfImageStrings.`-gaussian-blur` = "-gaussian-blur".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-gaussian-blur`]
    
    inline def `-geometry`: typingsJapgolly.pdfImage.pdfImageStrings.`-geometry` = "-geometry".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-geometry`]
    
    inline def `-gravity`: typingsJapgolly.pdfImage.pdfImageStrings.`-gravity` = "-gravity".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-gravity`]
    
    inline def `-grayscale`: typingsJapgolly.pdfImage.pdfImageStrings.`-grayscale` = "-grayscale".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-grayscale`]
    
    inline def `-green-primary`: typingsJapgolly.pdfImage.pdfImageStrings.`-green-primary` = "-green-primary".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-green-primary`]
    
    inline def `-help`: typingsJapgolly.pdfImage.pdfImageStrings.`-help` = "-help".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-help`]
    
    inline def `-hough-lines`: typingsJapgolly.pdfImage.pdfImageStrings.`-hough-lines` = "-hough-lines".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-hough-lines`]
    
    inline def `-identify`: typingsJapgolly.pdfImage.pdfImageStrings.`-identify` = "-identify".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-identify`]
    
    inline def `-ift`: typingsJapgolly.pdfImage.pdfImageStrings.`-ift` = "-ift".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-ift`]
    
    inline def `-implode`: typingsJapgolly.pdfImage.pdfImageStrings.`-implode` = "-implode".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-implode`]
    
    inline def `-insert`: typingsJapgolly.pdfImage.pdfImageStrings.`-insert` = "-insert".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-insert`]
    
    inline def `-intensity`: typingsJapgolly.pdfImage.pdfImageStrings.`-intensity` = "-intensity".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-intensity`]
    
    inline def `-intent`: typingsJapgolly.pdfImage.pdfImageStrings.`-intent` = "-intent".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-intent`]
    
    inline def `-interlace`: typingsJapgolly.pdfImage.pdfImageStrings.`-interlace` = "-interlace".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-interlace`]
    
    inline def `-interline-spacing`: typingsJapgolly.pdfImage.pdfImageStrings.`-interline-spacing` = "-interline-spacing".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-interline-spacing`]
    
    inline def `-interpolate`: typingsJapgolly.pdfImage.pdfImageStrings.`-interpolate` = "-interpolate".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-interpolate`]
    
    inline def `-interword-spacing`: typingsJapgolly.pdfImage.pdfImageStrings.`-interword-spacing` = "-interword-spacing".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-interword-spacing`]
    
    inline def `-kerning`: typingsJapgolly.pdfImage.pdfImageStrings.`-kerning` = "-kerning".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-kerning`]
    
    inline def `-kmeans`: typingsJapgolly.pdfImage.pdfImageStrings.`-kmeans` = "-kmeans".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-kmeans`]
    
    inline def `-kuwahara`: typingsJapgolly.pdfImage.pdfImageStrings.`-kuwahara` = "-kuwahara".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-kuwahara`]
    
    inline def `-label`: typingsJapgolly.pdfImage.pdfImageStrings.`-label` = "-label".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-label`]
    
    inline def `-lat`: typingsJapgolly.pdfImage.pdfImageStrings.`-lat` = "-lat".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-lat`]
    
    inline def `-layers`: typingsJapgolly.pdfImage.pdfImageStrings.`-layers` = "-layers".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-layers`]
    
    inline def `-level`: typingsJapgolly.pdfImage.pdfImageStrings.`-level` = "-level".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-level`]
    
    inline def `-limit`: typingsJapgolly.pdfImage.pdfImageStrings.`-limit` = "-limit".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-limit`]
    
    inline def `-linear-stretch`: typingsJapgolly.pdfImage.pdfImageStrings.`-linear-stretch` = "-linear-stretch".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-linear-stretch`]
    
    inline def `-liquid-rescale`: typingsJapgolly.pdfImage.pdfImageStrings.`-liquid-rescale` = "-liquid-rescale".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-liquid-rescale`]
    
    inline def `-list`: typingsJapgolly.pdfImage.pdfImageStrings.`-list` = "-list".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-list`]
    
    inline def `-log`: typingsJapgolly.pdfImage.pdfImageStrings.`-log` = "-log".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-log`]
    
    inline def `-loop`: typingsJapgolly.pdfImage.pdfImageStrings.`-loop` = "-loop".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-loop`]
    
    inline def `-mattecolor`: typingsJapgolly.pdfImage.pdfImageStrings.`-mattecolor` = "-mattecolor".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-mattecolor`]
    
    inline def `-mean-shift`: typingsJapgolly.pdfImage.pdfImageStrings.`-mean-shift` = "-mean-shift".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-mean-shift`]
    
    inline def `-median`: typingsJapgolly.pdfImage.pdfImageStrings.`-median` = "-median".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-median`]
    
    inline def `-metric`: typingsJapgolly.pdfImage.pdfImageStrings.`-metric` = "-metric".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-metric`]
    
    inline def `-mode`: typingsJapgolly.pdfImage.pdfImageStrings.`-mode` = "-mode".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-mode`]
    
    inline def `-modulate`: typingsJapgolly.pdfImage.pdfImageStrings.`-modulate` = "-modulate".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-modulate`]
    
    inline def `-moments`: typingsJapgolly.pdfImage.pdfImageStrings.`-moments` = "-moments".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-moments`]
    
    inline def `-monitor`: typingsJapgolly.pdfImage.pdfImageStrings.`-monitor` = "-monitor".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-monitor`]
    
    inline def `-monochrome`: typingsJapgolly.pdfImage.pdfImageStrings.`-monochrome` = "-monochrome".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-monochrome`]
    
    inline def `-morph`: typingsJapgolly.pdfImage.pdfImageStrings.`-morph` = "-morph".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-morph`]
    
    inline def `-morphology`: typingsJapgolly.pdfImage.pdfImageStrings.`-morphology` = "-morphology".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-morphology`]
    
    inline def `-motion-blur`: typingsJapgolly.pdfImage.pdfImageStrings.`-motion-blur` = "-motion-blur".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-motion-blur`]
    
    inline def `-negate`: typingsJapgolly.pdfImage.pdfImageStrings.`-negate` = "-negate".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-negate`]
    
    inline def `-noise`: typingsJapgolly.pdfImage.pdfImageStrings.`-noise` = "-noise".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-noise`]
    
    inline def `-normalize`: typingsJapgolly.pdfImage.pdfImageStrings.`-normalize` = "-normalize".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-normalize`]
    
    inline def `-opaque`: typingsJapgolly.pdfImage.pdfImageStrings.`-opaque` = "-opaque".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-opaque`]
    
    inline def `-ordered-dither`: typingsJapgolly.pdfImage.pdfImageStrings.`-ordered-dither` = "-ordered-dither".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-ordered-dither`]
    
    inline def `-orient`: typingsJapgolly.pdfImage.pdfImageStrings.`-orient` = "-orient".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-orient`]
    
    inline def `-page`: typingsJapgolly.pdfImage.pdfImageStrings.`-page` = "-page".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-page`]
    
    inline def `-paint`: typingsJapgolly.pdfImage.pdfImageStrings.`-paint` = "-paint".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-paint`]
    
    inline def `-perceptible`: typingsJapgolly.pdfImage.pdfImageStrings.`-perceptible` = "-perceptible".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-perceptible`]
    
    inline def `-ping`: typingsJapgolly.pdfImage.pdfImageStrings.`-ping` = "-ping".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-ping`]
    
    inline def `-pointsize`: typingsJapgolly.pdfImage.pdfImageStrings.`-pointsize` = "-pointsize".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-pointsize`]
    
    inline def `-polaroid`: typingsJapgolly.pdfImage.pdfImageStrings.`-polaroid` = "-polaroid".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-polaroid`]
    
    inline def `-poly`: typingsJapgolly.pdfImage.pdfImageStrings.`-poly` = "-poly".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-poly`]
    
    inline def `-posterize`: typingsJapgolly.pdfImage.pdfImageStrings.`-posterize` = "-posterize".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-posterize`]
    
    inline def `-precision`: typingsJapgolly.pdfImage.pdfImageStrings.`-precision` = "-precision".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-precision`]
    
    inline def `-preview`: typingsJapgolly.pdfImage.pdfImageStrings.`-preview` = "-preview".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-preview`]
    
    inline def `-print`: typingsJapgolly.pdfImage.pdfImageStrings.`-print` = "-print".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-print`]
    
    inline def `-process`: typingsJapgolly.pdfImage.pdfImageStrings.`-process` = "-process".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-process`]
    
    inline def `-profile`: typingsJapgolly.pdfImage.pdfImageStrings.`-profile` = "-profile".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-profile`]
    
    inline def `-quality`: typingsJapgolly.pdfImage.pdfImageStrings.`-quality` = "-quality".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-quality`]
    
    inline def `-quantize`: typingsJapgolly.pdfImage.pdfImageStrings.`-quantize` = "-quantize".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-quantize`]
    
    inline def `-quiet`: typingsJapgolly.pdfImage.pdfImageStrings.`-quiet` = "-quiet".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-quiet`]
    
    inline def `-radial-blur`: typingsJapgolly.pdfImage.pdfImageStrings.`-radial-blur` = "-radial-blur".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-radial-blur`]
    
    inline def `-raise`: typingsJapgolly.pdfImage.pdfImageStrings.`-raise` = "-raise".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-raise`]
    
    inline def `-random-threshold`: typingsJapgolly.pdfImage.pdfImageStrings.`-random-threshold` = "-random-threshold".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-random-threshold`]
    
    inline def `-range-threshold`: typingsJapgolly.pdfImage.pdfImageStrings.`-range-threshold` = "-range-threshold".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-range-threshold`]
    
    inline def `-read-mask`: typingsJapgolly.pdfImage.pdfImageStrings.`-read-mask` = "-read-mask".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-read-mask`]
    
    inline def `-red-primary`: typingsJapgolly.pdfImage.pdfImageStrings.`-red-primary` = "-red-primary".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-red-primary`]
    
    inline def `-regard-warnings`: typingsJapgolly.pdfImage.pdfImageStrings.`-regard-warnings` = "-regard-warnings".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-regard-warnings`]
    
    inline def `-region`: typingsJapgolly.pdfImage.pdfImageStrings.`-region` = "-region".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-region`]
    
    inline def `-remap`: typingsJapgolly.pdfImage.pdfImageStrings.`-remap` = "-remap".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-remap`]
    
    inline def `-render`: typingsJapgolly.pdfImage.pdfImageStrings.`-render` = "-render".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-render`]
    
    inline def `-repage`: typingsJapgolly.pdfImage.pdfImageStrings.`-repage` = "-repage".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-repage`]
    
    inline def `-resample`: typingsJapgolly.pdfImage.pdfImageStrings.`-resample` = "-resample".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-resample`]
    
    inline def `-resize`: typingsJapgolly.pdfImage.pdfImageStrings.`-resize` = "-resize".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-resize`]
    
    inline def `-respect-parentheses`: typingsJapgolly.pdfImage.pdfImageStrings.`-respect-parentheses` = "-respect-parentheses".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-respect-parentheses`]
    
    inline def `-roll`: typingsJapgolly.pdfImage.pdfImageStrings.`-roll` = "-roll".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-roll`]
    
    inline def `-rotate`: typingsJapgolly.pdfImage.pdfImageStrings.`-rotate` = "-rotate".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-rotate`]
    
    inline def `-sample`: typingsJapgolly.pdfImage.pdfImageStrings.`-sample` = "-sample".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-sample`]
    
    inline def `-sampling-factor`: typingsJapgolly.pdfImage.pdfImageStrings.`-sampling-factor` = "-sampling-factor".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-sampling-factor`]
    
    inline def `-scale`: typingsJapgolly.pdfImage.pdfImageStrings.`-scale` = "-scale".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-scale`]
    
    inline def `-scene`: typingsJapgolly.pdfImage.pdfImageStrings.`-scene` = "-scene".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-scene`]
    
    inline def `-seed`: typingsJapgolly.pdfImage.pdfImageStrings.`-seed` = "-seed".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-seed`]
    
    inline def `-segment`: typingsJapgolly.pdfImage.pdfImageStrings.`-segment` = "-segment".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-segment`]
    
    inline def `-selective-blur`: typingsJapgolly.pdfImage.pdfImageStrings.`-selective-blur` = "-selective-blur".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-selective-blur`]
    
    inline def `-separate`: typingsJapgolly.pdfImage.pdfImageStrings.`-separate` = "-separate".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-separate`]
    
    inline def `-sepia-tone`: typingsJapgolly.pdfImage.pdfImageStrings.`-sepia-tone` = "-sepia-tone".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-sepia-tone`]
    
    inline def `-set`: typingsJapgolly.pdfImage.pdfImageStrings.`-set` = "-set".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-set`]
    
    inline def `-shade`: typingsJapgolly.pdfImage.pdfImageStrings.`-shade` = "-shade".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-shade`]
    
    inline def `-shadow`: typingsJapgolly.pdfImage.pdfImageStrings.`-shadow` = "-shadow".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-shadow`]
    
    inline def `-sharpen`: typingsJapgolly.pdfImage.pdfImageStrings.`-sharpen` = "-sharpen".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-sharpen`]
    
    inline def `-shave`: typingsJapgolly.pdfImage.pdfImageStrings.`-shave` = "-shave".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-shave`]
    
    inline def `-shear`: typingsJapgolly.pdfImage.pdfImageStrings.`-shear` = "-shear".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-shear`]
    
    inline def `-sigmoidal-contrast`: typingsJapgolly.pdfImage.pdfImageStrings.`-sigmoidal-contrast` = "-sigmoidal-contrast".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-sigmoidal-contrast`]
    
    inline def `-size`: typingsJapgolly.pdfImage.pdfImageStrings.`-size` = "-size".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-size`]
    
    inline def `-sketch`: typingsJapgolly.pdfImage.pdfImageStrings.`-sketch` = "-sketch".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-sketch`]
    
    inline def `-smush`: typingsJapgolly.pdfImage.pdfImageStrings.`-smush` = "-smush".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-smush`]
    
    inline def `-solarize`: typingsJapgolly.pdfImage.pdfImageStrings.`-solarize` = "-solarize".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-solarize`]
    
    inline def `-splice`: typingsJapgolly.pdfImage.pdfImageStrings.`-splice` = "-splice".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-splice`]
    
    inline def `-spread`: typingsJapgolly.pdfImage.pdfImageStrings.`-spread` = "-spread".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-spread`]
    
    inline def `-statistic`: typingsJapgolly.pdfImage.pdfImageStrings.`-statistic` = "-statistic".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-statistic`]
    
    inline def `-stretch`: typingsJapgolly.pdfImage.pdfImageStrings.`-stretch` = "-stretch".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-stretch`]
    
    inline def `-strip`: typingsJapgolly.pdfImage.pdfImageStrings.`-strip` = "-strip".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-strip`]
    
    inline def `-stroke`: typingsJapgolly.pdfImage.pdfImageStrings.`-stroke` = "-stroke".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-stroke`]
    
    inline def `-strokewidth`: typingsJapgolly.pdfImage.pdfImageStrings.`-strokewidth` = "-strokewidth".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-strokewidth`]
    
    inline def `-style`: typingsJapgolly.pdfImage.pdfImageStrings.`-style` = "-style".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-style`]
    
    inline def `-swap`: typingsJapgolly.pdfImage.pdfImageStrings.`-swap` = "-swap".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-swap`]
    
    inline def `-swirl`: typingsJapgolly.pdfImage.pdfImageStrings.`-swirl` = "-swirl".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-swirl`]
    
    inline def `-synchronize`: typingsJapgolly.pdfImage.pdfImageStrings.`-synchronize` = "-synchronize".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-synchronize`]
    
    inline def `-taint`: typingsJapgolly.pdfImage.pdfImageStrings.`-taint` = "-taint".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-taint`]
    
    inline def `-texture`: typingsJapgolly.pdfImage.pdfImageStrings.`-texture` = "-texture".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-texture`]
    
    inline def `-threshold`: typingsJapgolly.pdfImage.pdfImageStrings.`-threshold` = "-threshold".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-threshold`]
    
    inline def `-thumbnail`: typingsJapgolly.pdfImage.pdfImageStrings.`-thumbnail` = "-thumbnail".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-thumbnail`]
    
    inline def `-tile`: typingsJapgolly.pdfImage.pdfImageStrings.`-tile` = "-tile".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-tile`]
    
    inline def `-tile-offset`: typingsJapgolly.pdfImage.pdfImageStrings.`-tile-offset` = "-tile-offset".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-tile-offset`]
    
    inline def `-tint`: typingsJapgolly.pdfImage.pdfImageStrings.`-tint` = "-tint".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-tint`]
    
    inline def `-transform`: typingsJapgolly.pdfImage.pdfImageStrings.`-transform` = "-transform".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-transform`]
    
    inline def `-transparent`: typingsJapgolly.pdfImage.pdfImageStrings.`-transparent` = "-transparent".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-transparent`]
    
    inline def `-transparent-color`: typingsJapgolly.pdfImage.pdfImageStrings.`-transparent-color` = "-transparent-color".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-transparent-color`]
    
    inline def `-transpose`: typingsJapgolly.pdfImage.pdfImageStrings.`-transpose` = "-transpose".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-transpose`]
    
    inline def `-transverse`: typingsJapgolly.pdfImage.pdfImageStrings.`-transverse` = "-transverse".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-transverse`]
    
    inline def `-treedepth`: typingsJapgolly.pdfImage.pdfImageStrings.`-treedepth` = "-treedepth".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-treedepth`]
    
    inline def `-trim`: typingsJapgolly.pdfImage.pdfImageStrings.`-trim` = "-trim".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-trim`]
    
    inline def `-type`: typingsJapgolly.pdfImage.pdfImageStrings.`-type` = "-type".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-type`]
    
    inline def `-undercolor`: typingsJapgolly.pdfImage.pdfImageStrings.`-undercolor` = "-undercolor".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-undercolor`]
    
    inline def `-unique-colors`: typingsJapgolly.pdfImage.pdfImageStrings.`-unique-colors` = "-unique-colors".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-unique-colors`]
    
    inline def `-units`: typingsJapgolly.pdfImage.pdfImageStrings.`-units` = "-units".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-units`]
    
    inline def `-unsharp`: typingsJapgolly.pdfImage.pdfImageStrings.`-unsharp` = "-unsharp".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-unsharp`]
    
    inline def `-verbose`: typingsJapgolly.pdfImage.pdfImageStrings.`-verbose` = "-verbose".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-verbose`]
    
    inline def `-version`: typingsJapgolly.pdfImage.pdfImageStrings.`-version` = "-version".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-version`]
    
    inline def `-view`: typingsJapgolly.pdfImage.pdfImageStrings.`-view` = "-view".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-view`]
    
    inline def `-vignette`: typingsJapgolly.pdfImage.pdfImageStrings.`-vignette` = "-vignette".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-vignette`]
    
    inline def `-virtual-pixel`: typingsJapgolly.pdfImage.pdfImageStrings.`-virtual-pixel` = "-virtual-pixel".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-virtual-pixel`]
    
    inline def `-wave`: typingsJapgolly.pdfImage.pdfImageStrings.`-wave` = "-wave".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-wave`]
    
    inline def `-wavelet-denoise`: typingsJapgolly.pdfImage.pdfImageStrings.`-wavelet-denoise` = "-wavelet-denoise".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-wavelet-denoise`]
    
    inline def `-weight`: typingsJapgolly.pdfImage.pdfImageStrings.`-weight` = "-weight".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-weight`]
    
    inline def `-white-point`: typingsJapgolly.pdfImage.pdfImageStrings.`-white-point` = "-white-point".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-white-point`]
    
    inline def `-white-threshold`: typingsJapgolly.pdfImage.pdfImageStrings.`-white-threshold` = "-white-threshold".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-white-threshold`]
    
    inline def `-write`: typingsJapgolly.pdfImage.pdfImageStrings.`-write` = "-write".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-write`]
    
    inline def `-write-mask`: typingsJapgolly.pdfImage.pdfImageStrings.`-write-mask` = "-write-mask".asInstanceOf[typingsJapgolly.pdfImage.pdfImageStrings.`-write-mask`]
  }
  
  /* Inlined {[ key in pdf-image.pdf-image.ConvertOptionKey ]:? string} */
  trait ConvertOptions extends StObject {
    
    var `-adaptive-blur`: js.UndefOr[String] = js.undefined
    
    var `-adaptive-resize`: js.UndefOr[String] = js.undefined
    
    var `-adaptive-sharpen`: js.UndefOr[String] = js.undefined
    
    var `-adjoin`: js.UndefOr[String] = js.undefined
    
    var `-affine`: js.UndefOr[String] = js.undefined
    
    var `-alpha`: js.UndefOr[String] = js.undefined
    
    var `-annotate`: js.UndefOr[String] = js.undefined
    
    var `-antialias`: js.UndefOr[String] = js.undefined
    
    var `-append`: js.UndefOr[String] = js.undefined
    
    var `-authenticate`: js.UndefOr[String] = js.undefined
    
    var `-auto-gamma`: js.UndefOr[String] = js.undefined
    
    var `-auto-level`: js.UndefOr[String] = js.undefined
    
    var `-auto-orient`: js.UndefOr[String] = js.undefined
    
    var `-auto-threshold`: js.UndefOr[String] = js.undefined
    
    var `-background`: js.UndefOr[String] = js.undefined
    
    var `-bench`: js.UndefOr[String] = js.undefined
    
    var `-bias`: js.UndefOr[String] = js.undefined
    
    var `-black-threshold`: js.UndefOr[String] = js.undefined
    
    var `-blue-primary`: js.UndefOr[String] = js.undefined
    
    var `-blue-shift`: js.UndefOr[String] = js.undefined
    
    var `-blur`: js.UndefOr[String] = js.undefined
    
    var `-border`: js.UndefOr[String] = js.undefined
    
    var `-bordercolor`: js.UndefOr[String] = js.undefined
    
    var `-brightness-contrast`: js.UndefOr[String] = js.undefined
    
    var `-canny`: js.UndefOr[String] = js.undefined
    
    var `-caption`: js.UndefOr[String] = js.undefined
    
    var `-cdl`: js.UndefOr[String] = js.undefined
    
    var `-channel`: js.UndefOr[String] = js.undefined
    
    var `-charcoal`: js.UndefOr[String] = js.undefined
    
    var `-chop`: js.UndefOr[String] = js.undefined
    
    var `-clahe`: js.UndefOr[String] = js.undefined
    
    var `-clamp`: js.UndefOr[String] = js.undefined
    
    var `-clip`: js.UndefOr[String] = js.undefined
    
    var `-clip-mask`: js.UndefOr[String] = js.undefined
    
    var `-clip-path`: js.UndefOr[String] = js.undefined
    
    var `-clone`: js.UndefOr[String] = js.undefined
    
    var `-clut`: js.UndefOr[String] = js.undefined
    
    var `-coalesce`: js.UndefOr[String] = js.undefined
    
    var `-color-matrix`: js.UndefOr[String] = js.undefined
    
    var `-colorize`: js.UndefOr[String] = js.undefined
    
    var `-colors`: js.UndefOr[String] = js.undefined
    
    var `-colorspace`: js.UndefOr[String] = js.undefined
    
    var `-combine`: js.UndefOr[String] = js.undefined
    
    var `-comment`: js.UndefOr[String] = js.undefined
    
    var `-compare`: js.UndefOr[String] = js.undefined
    
    var `-complexoperator`: js.UndefOr[String] = js.undefined
    
    var `-compose`: js.UndefOr[String] = js.undefined
    
    var `-composite`: js.UndefOr[String] = js.undefined
    
    var `-compress`: js.UndefOr[String] = js.undefined
    
    var `-connected-components`: js.UndefOr[String] = js.undefined
    
    var `-contrast`: js.UndefOr[String] = js.undefined
    
    var `-contrast-stretch`: js.UndefOr[String] = js.undefined
    
    var `-convolve`: js.UndefOr[String] = js.undefined
    
    var `-copy`: js.UndefOr[String] = js.undefined
    
    var `-crop`: js.UndefOr[String] = js.undefined
    
    var `-cycle`: js.UndefOr[String] = js.undefined
    
    var `-debug`: js.UndefOr[String] = js.undefined
    
    var `-decipher`: js.UndefOr[String] = js.undefined
    
    var `-deconstruct`: js.UndefOr[String] = js.undefined
    
    var `-define`: js.UndefOr[String] = js.undefined
    
    var `-delay`: js.UndefOr[String] = js.undefined
    
    var `-delete`: js.UndefOr[String] = js.undefined
    
    var `-density`: js.UndefOr[String] = js.undefined
    
    var `-depth`: js.UndefOr[String] = js.undefined
    
    var `-despeckle`: js.UndefOr[String] = js.undefined
    
    var `-direction`: js.UndefOr[String] = js.undefined
    
    var `-display`: js.UndefOr[String] = js.undefined
    
    var `-dispose`: js.UndefOr[String] = js.undefined
    
    var `-distort`: js.UndefOr[String] = js.undefined
    
    var `-distribute-cache`: js.UndefOr[String] = js.undefined
    
    var `-dither`: js.UndefOr[String] = js.undefined
    
    var `-draw`: js.UndefOr[String] = js.undefined
    
    var `-duplicate`: js.UndefOr[String] = js.undefined
    
    var `-edge`: js.UndefOr[String] = js.undefined
    
    var `-emboss`: js.UndefOr[String] = js.undefined
    
    var `-encipher`: js.UndefOr[String] = js.undefined
    
    var `-encoding`: js.UndefOr[String] = js.undefined
    
    var `-endian`: js.UndefOr[String] = js.undefined
    
    var `-enhance`: js.UndefOr[String] = js.undefined
    
    var `-equalize`: js.UndefOr[String] = js.undefined
    
    var `-evaluate`: js.UndefOr[String] = js.undefined
    
    var `-evaluate-sequence`: js.UndefOr[String] = js.undefined
    
    var `-extent`: js.UndefOr[String] = js.undefined
    
    var `-extract`: js.UndefOr[String] = js.undefined
    
    var `-family`: js.UndefOr[String] = js.undefined
    
    var `-features`: js.UndefOr[String] = js.undefined
    
    var `-fft`: js.UndefOr[String] = js.undefined
    
    var `-fill`: js.UndefOr[String] = js.undefined
    
    var `-filter`: js.UndefOr[String] = js.undefined
    
    var `-flatten`: js.UndefOr[String] = js.undefined
    
    var `-flip`: js.UndefOr[String] = js.undefined
    
    var `-floodfill`: js.UndefOr[String] = js.undefined
    
    var `-flop`: js.UndefOr[String] = js.undefined
    
    var `-font`: js.UndefOr[String] = js.undefined
    
    var `-format`: js.UndefOr[String] = js.undefined
    
    var `-frame`: js.UndefOr[String] = js.undefined
    
    var `-function`: js.UndefOr[String] = js.undefined
    
    var `-fuzz`: js.UndefOr[String] = js.undefined
    
    var `-fx`: js.UndefOr[String] = js.undefined
    
    var `-gamma`: js.UndefOr[String] = js.undefined
    
    var `-gaussian-blur`: js.UndefOr[String] = js.undefined
    
    var `-geometry`: js.UndefOr[String] = js.undefined
    
    var `-gravity`: js.UndefOr[String] = js.undefined
    
    var `-grayscale`: js.UndefOr[String] = js.undefined
    
    var `-green-primary`: js.UndefOr[String] = js.undefined
    
    var `-help`: js.UndefOr[String] = js.undefined
    
    var `-hough-lines`: js.UndefOr[String] = js.undefined
    
    var `-identify`: js.UndefOr[String] = js.undefined
    
    var `-ift`: js.UndefOr[String] = js.undefined
    
    var `-implode`: js.UndefOr[String] = js.undefined
    
    var `-insert`: js.UndefOr[String] = js.undefined
    
    var `-intensity`: js.UndefOr[String] = js.undefined
    
    var `-intent`: js.UndefOr[String] = js.undefined
    
    var `-interlace`: js.UndefOr[String] = js.undefined
    
    var `-interline-spacing`: js.UndefOr[String] = js.undefined
    
    var `-interpolate`: js.UndefOr[String] = js.undefined
    
    var `-interword-spacing`: js.UndefOr[String] = js.undefined
    
    var `-kerning`: js.UndefOr[String] = js.undefined
    
    var `-kmeans`: js.UndefOr[String] = js.undefined
    
    var `-kuwahara`: js.UndefOr[String] = js.undefined
    
    var `-label`: js.UndefOr[String] = js.undefined
    
    var `-lat`: js.UndefOr[String] = js.undefined
    
    var `-layers`: js.UndefOr[String] = js.undefined
    
    var `-level`: js.UndefOr[String] = js.undefined
    
    var `-limit`: js.UndefOr[String] = js.undefined
    
    var `-linear-stretch`: js.UndefOr[String] = js.undefined
    
    var `-liquid-rescale`: js.UndefOr[String] = js.undefined
    
    var `-list`: js.UndefOr[String] = js.undefined
    
    var `-log`: js.UndefOr[String] = js.undefined
    
    var `-loop`: js.UndefOr[String] = js.undefined
    
    var `-mattecolor`: js.UndefOr[String] = js.undefined
    
    var `-mean-shift`: js.UndefOr[String] = js.undefined
    
    var `-median`: js.UndefOr[String] = js.undefined
    
    var `-metric`: js.UndefOr[String] = js.undefined
    
    var `-mode`: js.UndefOr[String] = js.undefined
    
    var `-modulate`: js.UndefOr[String] = js.undefined
    
    var `-moments`: js.UndefOr[String] = js.undefined
    
    var `-monitor`: js.UndefOr[String] = js.undefined
    
    var `-monochrome`: js.UndefOr[String] = js.undefined
    
    var `-morph`: js.UndefOr[String] = js.undefined
    
    var `-morphology`: js.UndefOr[String] = js.undefined
    
    var `-motion-blur`: js.UndefOr[String] = js.undefined
    
    var `-negate`: js.UndefOr[String] = js.undefined
    
    var `-noise`: js.UndefOr[String] = js.undefined
    
    var `-normalize`: js.UndefOr[String] = js.undefined
    
    var `-opaque`: js.UndefOr[String] = js.undefined
    
    var `-ordered-dither`: js.UndefOr[String] = js.undefined
    
    var `-orient`: js.UndefOr[String] = js.undefined
    
    var `-page`: js.UndefOr[String] = js.undefined
    
    var `-paint`: js.UndefOr[String] = js.undefined
    
    var `-perceptible`: js.UndefOr[String] = js.undefined
    
    var `-ping`: js.UndefOr[String] = js.undefined
    
    var `-pointsize`: js.UndefOr[String] = js.undefined
    
    var `-polaroid`: js.UndefOr[String] = js.undefined
    
    var `-poly`: js.UndefOr[String] = js.undefined
    
    var `-posterize`: js.UndefOr[String] = js.undefined
    
    var `-precision`: js.UndefOr[String] = js.undefined
    
    var `-preview`: js.UndefOr[String] = js.undefined
    
    var `-print`: js.UndefOr[String] = js.undefined
    
    var `-process`: js.UndefOr[String] = js.undefined
    
    var `-profile`: js.UndefOr[String] = js.undefined
    
    var `-quality`: js.UndefOr[String] = js.undefined
    
    var `-quantize`: js.UndefOr[String] = js.undefined
    
    var `-quiet`: js.UndefOr[String] = js.undefined
    
    var `-radial-blur`: js.UndefOr[String] = js.undefined
    
    var `-raise`: js.UndefOr[String] = js.undefined
    
    var `-random-threshold`: js.UndefOr[String] = js.undefined
    
    var `-range-threshold`: js.UndefOr[String] = js.undefined
    
    var `-read-mask`: js.UndefOr[String] = js.undefined
    
    var `-red-primary`: js.UndefOr[String] = js.undefined
    
    var `-regard-warnings`: js.UndefOr[String] = js.undefined
    
    var `-region`: js.UndefOr[String] = js.undefined
    
    var `-remap`: js.UndefOr[String] = js.undefined
    
    var `-render`: js.UndefOr[String] = js.undefined
    
    var `-repage`: js.UndefOr[String] = js.undefined
    
    var `-resample`: js.UndefOr[String] = js.undefined
    
    var `-resize`: js.UndefOr[String] = js.undefined
    
    var `-respect-parentheses`: js.UndefOr[String] = js.undefined
    
    var `-roll`: js.UndefOr[String] = js.undefined
    
    var `-rotate`: js.UndefOr[String] = js.undefined
    
    var `-sample`: js.UndefOr[String] = js.undefined
    
    var `-sampling-factor`: js.UndefOr[String] = js.undefined
    
    var `-scale`: js.UndefOr[String] = js.undefined
    
    var `-scene`: js.UndefOr[String] = js.undefined
    
    var `-seed`: js.UndefOr[String] = js.undefined
    
    var `-segment`: js.UndefOr[String] = js.undefined
    
    var `-selective-blur`: js.UndefOr[String] = js.undefined
    
    var `-separate`: js.UndefOr[String] = js.undefined
    
    var `-sepia-tone`: js.UndefOr[String] = js.undefined
    
    var `-set`: js.UndefOr[String] = js.undefined
    
    var `-shade`: js.UndefOr[String] = js.undefined
    
    var `-shadow`: js.UndefOr[String] = js.undefined
    
    var `-sharpen`: js.UndefOr[String] = js.undefined
    
    var `-shave`: js.UndefOr[String] = js.undefined
    
    var `-shear`: js.UndefOr[String] = js.undefined
    
    var `-sigmoidal-contrast`: js.UndefOr[String] = js.undefined
    
    var `-size`: js.UndefOr[String] = js.undefined
    
    var `-sketch`: js.UndefOr[String] = js.undefined
    
    var `-smush`: js.UndefOr[String] = js.undefined
    
    var `-solarize`: js.UndefOr[String] = js.undefined
    
    var `-splice`: js.UndefOr[String] = js.undefined
    
    var `-spread`: js.UndefOr[String] = js.undefined
    
    var `-statistic`: js.UndefOr[String] = js.undefined
    
    var `-stretch`: js.UndefOr[String] = js.undefined
    
    var `-strip`: js.UndefOr[String] = js.undefined
    
    var `-stroke`: js.UndefOr[String] = js.undefined
    
    var `-strokewidth`: js.UndefOr[String] = js.undefined
    
    var `-style`: js.UndefOr[String] = js.undefined
    
    var `-swap`: js.UndefOr[String] = js.undefined
    
    var `-swirl`: js.UndefOr[String] = js.undefined
    
    var `-synchronize`: js.UndefOr[String] = js.undefined
    
    var `-taint`: js.UndefOr[String] = js.undefined
    
    var `-texture`: js.UndefOr[String] = js.undefined
    
    var `-threshold`: js.UndefOr[String] = js.undefined
    
    var `-thumbnail`: js.UndefOr[String] = js.undefined
    
    var `-tile`: js.UndefOr[String] = js.undefined
    
    var `-tile-offset`: js.UndefOr[String] = js.undefined
    
    var `-tint`: js.UndefOr[String] = js.undefined
    
    var `-transform`: js.UndefOr[String] = js.undefined
    
    var `-transparent`: js.UndefOr[String] = js.undefined
    
    var `-transparent-color`: js.UndefOr[String] = js.undefined
    
    var `-transpose`: js.UndefOr[String] = js.undefined
    
    var `-transverse`: js.UndefOr[String] = js.undefined
    
    var `-treedepth`: js.UndefOr[String] = js.undefined
    
    var `-trim`: js.UndefOr[String] = js.undefined
    
    var `-type`: js.UndefOr[String] = js.undefined
    
    var `-undercolor`: js.UndefOr[String] = js.undefined
    
    var `-unique-colors`: js.UndefOr[String] = js.undefined
    
    var `-units`: js.UndefOr[String] = js.undefined
    
    var `-unsharp`: js.UndefOr[String] = js.undefined
    
    var `-verbose`: js.UndefOr[String] = js.undefined
    
    var `-version`: js.UndefOr[String] = js.undefined
    
    var `-view`: js.UndefOr[String] = js.undefined
    
    var `-vignette`: js.UndefOr[String] = js.undefined
    
    var `-virtual-pixel`: js.UndefOr[String] = js.undefined
    
    var `-wave`: js.UndefOr[String] = js.undefined
    
    var `-wavelet-denoise`: js.UndefOr[String] = js.undefined
    
    var `-weight`: js.UndefOr[String] = js.undefined
    
    var `-white-point`: js.UndefOr[String] = js.undefined
    
    var `-white-threshold`: js.UndefOr[String] = js.undefined
    
    var `-write`: js.UndefOr[String] = js.undefined
    
    var `-write-mask`: js.UndefOr[String] = js.undefined
  }
  object ConvertOptions {
    
    inline def apply(): ConvertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConvertOptions]
    }
    
    extension [Self <: ConvertOptions](x: Self) {
      
      inline def `set-adaptive-blur`(value: String): Self = StObject.set(x, "-adaptive-blur", value.asInstanceOf[js.Any])
      
      inline def `set-adaptive-blurUndefined`: Self = StObject.set(x, "-adaptive-blur", js.undefined)
      
      inline def `set-adaptive-resize`(value: String): Self = StObject.set(x, "-adaptive-resize", value.asInstanceOf[js.Any])
      
      inline def `set-adaptive-resizeUndefined`: Self = StObject.set(x, "-adaptive-resize", js.undefined)
      
      inline def `set-adaptive-sharpen`(value: String): Self = StObject.set(x, "-adaptive-sharpen", value.asInstanceOf[js.Any])
      
      inline def `set-adaptive-sharpenUndefined`: Self = StObject.set(x, "-adaptive-sharpen", js.undefined)
      
      inline def `set-adjoin`(value: String): Self = StObject.set(x, "-adjoin", value.asInstanceOf[js.Any])
      
      inline def `set-adjoinUndefined`: Self = StObject.set(x, "-adjoin", js.undefined)
      
      inline def `set-affine`(value: String): Self = StObject.set(x, "-affine", value.asInstanceOf[js.Any])
      
      inline def `set-affineUndefined`: Self = StObject.set(x, "-affine", js.undefined)
      
      inline def `set-alpha`(value: String): Self = StObject.set(x, "-alpha", value.asInstanceOf[js.Any])
      
      inline def `set-alphaUndefined`: Self = StObject.set(x, "-alpha", js.undefined)
      
      inline def `set-annotate`(value: String): Self = StObject.set(x, "-annotate", value.asInstanceOf[js.Any])
      
      inline def `set-annotateUndefined`: Self = StObject.set(x, "-annotate", js.undefined)
      
      inline def `set-antialias`(value: String): Self = StObject.set(x, "-antialias", value.asInstanceOf[js.Any])
      
      inline def `set-antialiasUndefined`: Self = StObject.set(x, "-antialias", js.undefined)
      
      inline def `set-append`(value: String): Self = StObject.set(x, "-append", value.asInstanceOf[js.Any])
      
      inline def `set-appendUndefined`: Self = StObject.set(x, "-append", js.undefined)
      
      inline def `set-authenticate`(value: String): Self = StObject.set(x, "-authenticate", value.asInstanceOf[js.Any])
      
      inline def `set-authenticateUndefined`: Self = StObject.set(x, "-authenticate", js.undefined)
      
      inline def `set-auto-gamma`(value: String): Self = StObject.set(x, "-auto-gamma", value.asInstanceOf[js.Any])
      
      inline def `set-auto-gammaUndefined`: Self = StObject.set(x, "-auto-gamma", js.undefined)
      
      inline def `set-auto-level`(value: String): Self = StObject.set(x, "-auto-level", value.asInstanceOf[js.Any])
      
      inline def `set-auto-levelUndefined`: Self = StObject.set(x, "-auto-level", js.undefined)
      
      inline def `set-auto-orient`(value: String): Self = StObject.set(x, "-auto-orient", value.asInstanceOf[js.Any])
      
      inline def `set-auto-orientUndefined`: Self = StObject.set(x, "-auto-orient", js.undefined)
      
      inline def `set-auto-threshold`(value: String): Self = StObject.set(x, "-auto-threshold", value.asInstanceOf[js.Any])
      
      inline def `set-auto-thresholdUndefined`: Self = StObject.set(x, "-auto-threshold", js.undefined)
      
      inline def `set-background`(value: String): Self = StObject.set(x, "-background", value.asInstanceOf[js.Any])
      
      inline def `set-backgroundUndefined`: Self = StObject.set(x, "-background", js.undefined)
      
      inline def `set-bench`(value: String): Self = StObject.set(x, "-bench", value.asInstanceOf[js.Any])
      
      inline def `set-benchUndefined`: Self = StObject.set(x, "-bench", js.undefined)
      
      inline def `set-bias`(value: String): Self = StObject.set(x, "-bias", value.asInstanceOf[js.Any])
      
      inline def `set-biasUndefined`: Self = StObject.set(x, "-bias", js.undefined)
      
      inline def `set-black-threshold`(value: String): Self = StObject.set(x, "-black-threshold", value.asInstanceOf[js.Any])
      
      inline def `set-black-thresholdUndefined`: Self = StObject.set(x, "-black-threshold", js.undefined)
      
      inline def `set-blue-primary`(value: String): Self = StObject.set(x, "-blue-primary", value.asInstanceOf[js.Any])
      
      inline def `set-blue-primaryUndefined`: Self = StObject.set(x, "-blue-primary", js.undefined)
      
      inline def `set-blue-shift`(value: String): Self = StObject.set(x, "-blue-shift", value.asInstanceOf[js.Any])
      
      inline def `set-blue-shiftUndefined`: Self = StObject.set(x, "-blue-shift", js.undefined)
      
      inline def `set-blur`(value: String): Self = StObject.set(x, "-blur", value.asInstanceOf[js.Any])
      
      inline def `set-blurUndefined`: Self = StObject.set(x, "-blur", js.undefined)
      
      inline def `set-border`(value: String): Self = StObject.set(x, "-border", value.asInstanceOf[js.Any])
      
      inline def `set-borderUndefined`: Self = StObject.set(x, "-border", js.undefined)
      
      inline def `set-bordercolor`(value: String): Self = StObject.set(x, "-bordercolor", value.asInstanceOf[js.Any])
      
      inline def `set-bordercolorUndefined`: Self = StObject.set(x, "-bordercolor", js.undefined)
      
      inline def `set-brightness-contrast`(value: String): Self = StObject.set(x, "-brightness-contrast", value.asInstanceOf[js.Any])
      
      inline def `set-brightness-contrastUndefined`: Self = StObject.set(x, "-brightness-contrast", js.undefined)
      
      inline def `set-canny`(value: String): Self = StObject.set(x, "-canny", value.asInstanceOf[js.Any])
      
      inline def `set-cannyUndefined`: Self = StObject.set(x, "-canny", js.undefined)
      
      inline def `set-caption`(value: String): Self = StObject.set(x, "-caption", value.asInstanceOf[js.Any])
      
      inline def `set-captionUndefined`: Self = StObject.set(x, "-caption", js.undefined)
      
      inline def `set-cdl`(value: String): Self = StObject.set(x, "-cdl", value.asInstanceOf[js.Any])
      
      inline def `set-cdlUndefined`: Self = StObject.set(x, "-cdl", js.undefined)
      
      inline def `set-channel`(value: String): Self = StObject.set(x, "-channel", value.asInstanceOf[js.Any])
      
      inline def `set-channelUndefined`: Self = StObject.set(x, "-channel", js.undefined)
      
      inline def `set-charcoal`(value: String): Self = StObject.set(x, "-charcoal", value.asInstanceOf[js.Any])
      
      inline def `set-charcoalUndefined`: Self = StObject.set(x, "-charcoal", js.undefined)
      
      inline def `set-chop`(value: String): Self = StObject.set(x, "-chop", value.asInstanceOf[js.Any])
      
      inline def `set-chopUndefined`: Self = StObject.set(x, "-chop", js.undefined)
      
      inline def `set-clahe`(value: String): Self = StObject.set(x, "-clahe", value.asInstanceOf[js.Any])
      
      inline def `set-claheUndefined`: Self = StObject.set(x, "-clahe", js.undefined)
      
      inline def `set-clamp`(value: String): Self = StObject.set(x, "-clamp", value.asInstanceOf[js.Any])
      
      inline def `set-clampUndefined`: Self = StObject.set(x, "-clamp", js.undefined)
      
      inline def `set-clip`(value: String): Self = StObject.set(x, "-clip", value.asInstanceOf[js.Any])
      
      inline def `set-clip-mask`(value: String): Self = StObject.set(x, "-clip-mask", value.asInstanceOf[js.Any])
      
      inline def `set-clip-maskUndefined`: Self = StObject.set(x, "-clip-mask", js.undefined)
      
      inline def `set-clip-path`(value: String): Self = StObject.set(x, "-clip-path", value.asInstanceOf[js.Any])
      
      inline def `set-clip-pathUndefined`: Self = StObject.set(x, "-clip-path", js.undefined)
      
      inline def `set-clipUndefined`: Self = StObject.set(x, "-clip", js.undefined)
      
      inline def `set-clone`(value: String): Self = StObject.set(x, "-clone", value.asInstanceOf[js.Any])
      
      inline def `set-cloneUndefined`: Self = StObject.set(x, "-clone", js.undefined)
      
      inline def `set-clut`(value: String): Self = StObject.set(x, "-clut", value.asInstanceOf[js.Any])
      
      inline def `set-clutUndefined`: Self = StObject.set(x, "-clut", js.undefined)
      
      inline def `set-coalesce`(value: String): Self = StObject.set(x, "-coalesce", value.asInstanceOf[js.Any])
      
      inline def `set-coalesceUndefined`: Self = StObject.set(x, "-coalesce", js.undefined)
      
      inline def `set-color-matrix`(value: String): Self = StObject.set(x, "-color-matrix", value.asInstanceOf[js.Any])
      
      inline def `set-color-matrixUndefined`: Self = StObject.set(x, "-color-matrix", js.undefined)
      
      inline def `set-colorize`(value: String): Self = StObject.set(x, "-colorize", value.asInstanceOf[js.Any])
      
      inline def `set-colorizeUndefined`: Self = StObject.set(x, "-colorize", js.undefined)
      
      inline def `set-colors`(value: String): Self = StObject.set(x, "-colors", value.asInstanceOf[js.Any])
      
      inline def `set-colorsUndefined`: Self = StObject.set(x, "-colors", js.undefined)
      
      inline def `set-colorspace`(value: String): Self = StObject.set(x, "-colorspace", value.asInstanceOf[js.Any])
      
      inline def `set-colorspaceUndefined`: Self = StObject.set(x, "-colorspace", js.undefined)
      
      inline def `set-combine`(value: String): Self = StObject.set(x, "-combine", value.asInstanceOf[js.Any])
      
      inline def `set-combineUndefined`: Self = StObject.set(x, "-combine", js.undefined)
      
      inline def `set-comment`(value: String): Self = StObject.set(x, "-comment", value.asInstanceOf[js.Any])
      
      inline def `set-commentUndefined`: Self = StObject.set(x, "-comment", js.undefined)
      
      inline def `set-compare`(value: String): Self = StObject.set(x, "-compare", value.asInstanceOf[js.Any])
      
      inline def `set-compareUndefined`: Self = StObject.set(x, "-compare", js.undefined)
      
      inline def `set-complexoperator`(value: String): Self = StObject.set(x, "-complexoperator", value.asInstanceOf[js.Any])
      
      inline def `set-complexoperatorUndefined`: Self = StObject.set(x, "-complexoperator", js.undefined)
      
      inline def `set-compose`(value: String): Self = StObject.set(x, "-compose", value.asInstanceOf[js.Any])
      
      inline def `set-composeUndefined`: Self = StObject.set(x, "-compose", js.undefined)
      
      inline def `set-composite`(value: String): Self = StObject.set(x, "-composite", value.asInstanceOf[js.Any])
      
      inline def `set-compositeUndefined`: Self = StObject.set(x, "-composite", js.undefined)
      
      inline def `set-compress`(value: String): Self = StObject.set(x, "-compress", value.asInstanceOf[js.Any])
      
      inline def `set-compressUndefined`: Self = StObject.set(x, "-compress", js.undefined)
      
      inline def `set-connected-components`(value: String): Self = StObject.set(x, "-connected-components", value.asInstanceOf[js.Any])
      
      inline def `set-connected-componentsUndefined`: Self = StObject.set(x, "-connected-components", js.undefined)
      
      inline def `set-contrast`(value: String): Self = StObject.set(x, "-contrast", value.asInstanceOf[js.Any])
      
      inline def `set-contrast-stretch`(value: String): Self = StObject.set(x, "-contrast-stretch", value.asInstanceOf[js.Any])
      
      inline def `set-contrast-stretchUndefined`: Self = StObject.set(x, "-contrast-stretch", js.undefined)
      
      inline def `set-contrastUndefined`: Self = StObject.set(x, "-contrast", js.undefined)
      
      inline def `set-convolve`(value: String): Self = StObject.set(x, "-convolve", value.asInstanceOf[js.Any])
      
      inline def `set-convolveUndefined`: Self = StObject.set(x, "-convolve", js.undefined)
      
      inline def `set-copy`(value: String): Self = StObject.set(x, "-copy", value.asInstanceOf[js.Any])
      
      inline def `set-copyUndefined`: Self = StObject.set(x, "-copy", js.undefined)
      
      inline def `set-crop`(value: String): Self = StObject.set(x, "-crop", value.asInstanceOf[js.Any])
      
      inline def `set-cropUndefined`: Self = StObject.set(x, "-crop", js.undefined)
      
      inline def `set-cycle`(value: String): Self = StObject.set(x, "-cycle", value.asInstanceOf[js.Any])
      
      inline def `set-cycleUndefined`: Self = StObject.set(x, "-cycle", js.undefined)
      
      inline def `set-debug`(value: String): Self = StObject.set(x, "-debug", value.asInstanceOf[js.Any])
      
      inline def `set-debugUndefined`: Self = StObject.set(x, "-debug", js.undefined)
      
      inline def `set-decipher`(value: String): Self = StObject.set(x, "-decipher", value.asInstanceOf[js.Any])
      
      inline def `set-decipherUndefined`: Self = StObject.set(x, "-decipher", js.undefined)
      
      inline def `set-deconstruct`(value: String): Self = StObject.set(x, "-deconstruct", value.asInstanceOf[js.Any])
      
      inline def `set-deconstructUndefined`: Self = StObject.set(x, "-deconstruct", js.undefined)
      
      inline def `set-define`(value: String): Self = StObject.set(x, "-define", value.asInstanceOf[js.Any])
      
      inline def `set-defineUndefined`: Self = StObject.set(x, "-define", js.undefined)
      
      inline def `set-delay`(value: String): Self = StObject.set(x, "-delay", value.asInstanceOf[js.Any])
      
      inline def `set-delayUndefined`: Self = StObject.set(x, "-delay", js.undefined)
      
      inline def `set-delete`(value: String): Self = StObject.set(x, "-delete", value.asInstanceOf[js.Any])
      
      inline def `set-deleteUndefined`: Self = StObject.set(x, "-delete", js.undefined)
      
      inline def `set-density`(value: String): Self = StObject.set(x, "-density", value.asInstanceOf[js.Any])
      
      inline def `set-densityUndefined`: Self = StObject.set(x, "-density", js.undefined)
      
      inline def `set-depth`(value: String): Self = StObject.set(x, "-depth", value.asInstanceOf[js.Any])
      
      inline def `set-depthUndefined`: Self = StObject.set(x, "-depth", js.undefined)
      
      inline def `set-despeckle`(value: String): Self = StObject.set(x, "-despeckle", value.asInstanceOf[js.Any])
      
      inline def `set-despeckleUndefined`: Self = StObject.set(x, "-despeckle", js.undefined)
      
      inline def `set-direction`(value: String): Self = StObject.set(x, "-direction", value.asInstanceOf[js.Any])
      
      inline def `set-directionUndefined`: Self = StObject.set(x, "-direction", js.undefined)
      
      inline def `set-display`(value: String): Self = StObject.set(x, "-display", value.asInstanceOf[js.Any])
      
      inline def `set-displayUndefined`: Self = StObject.set(x, "-display", js.undefined)
      
      inline def `set-dispose`(value: String): Self = StObject.set(x, "-dispose", value.asInstanceOf[js.Any])
      
      inline def `set-disposeUndefined`: Self = StObject.set(x, "-dispose", js.undefined)
      
      inline def `set-distort`(value: String): Self = StObject.set(x, "-distort", value.asInstanceOf[js.Any])
      
      inline def `set-distortUndefined`: Self = StObject.set(x, "-distort", js.undefined)
      
      inline def `set-distribute-cache`(value: String): Self = StObject.set(x, "-distribute-cache", value.asInstanceOf[js.Any])
      
      inline def `set-distribute-cacheUndefined`: Self = StObject.set(x, "-distribute-cache", js.undefined)
      
      inline def `set-dither`(value: String): Self = StObject.set(x, "-dither", value.asInstanceOf[js.Any])
      
      inline def `set-ditherUndefined`: Self = StObject.set(x, "-dither", js.undefined)
      
      inline def `set-draw`(value: String): Self = StObject.set(x, "-draw", value.asInstanceOf[js.Any])
      
      inline def `set-drawUndefined`: Self = StObject.set(x, "-draw", js.undefined)
      
      inline def `set-duplicate`(value: String): Self = StObject.set(x, "-duplicate", value.asInstanceOf[js.Any])
      
      inline def `set-duplicateUndefined`: Self = StObject.set(x, "-duplicate", js.undefined)
      
      inline def `set-edge`(value: String): Self = StObject.set(x, "-edge", value.asInstanceOf[js.Any])
      
      inline def `set-edgeUndefined`: Self = StObject.set(x, "-edge", js.undefined)
      
      inline def `set-emboss`(value: String): Self = StObject.set(x, "-emboss", value.asInstanceOf[js.Any])
      
      inline def `set-embossUndefined`: Self = StObject.set(x, "-emboss", js.undefined)
      
      inline def `set-encipher`(value: String): Self = StObject.set(x, "-encipher", value.asInstanceOf[js.Any])
      
      inline def `set-encipherUndefined`: Self = StObject.set(x, "-encipher", js.undefined)
      
      inline def `set-encoding`(value: String): Self = StObject.set(x, "-encoding", value.asInstanceOf[js.Any])
      
      inline def `set-encodingUndefined`: Self = StObject.set(x, "-encoding", js.undefined)
      
      inline def `set-endian`(value: String): Self = StObject.set(x, "-endian", value.asInstanceOf[js.Any])
      
      inline def `set-endianUndefined`: Self = StObject.set(x, "-endian", js.undefined)
      
      inline def `set-enhance`(value: String): Self = StObject.set(x, "-enhance", value.asInstanceOf[js.Any])
      
      inline def `set-enhanceUndefined`: Self = StObject.set(x, "-enhance", js.undefined)
      
      inline def `set-equalize`(value: String): Self = StObject.set(x, "-equalize", value.asInstanceOf[js.Any])
      
      inline def `set-equalizeUndefined`: Self = StObject.set(x, "-equalize", js.undefined)
      
      inline def `set-evaluate`(value: String): Self = StObject.set(x, "-evaluate", value.asInstanceOf[js.Any])
      
      inline def `set-evaluate-sequence`(value: String): Self = StObject.set(x, "-evaluate-sequence", value.asInstanceOf[js.Any])
      
      inline def `set-evaluate-sequenceUndefined`: Self = StObject.set(x, "-evaluate-sequence", js.undefined)
      
      inline def `set-evaluateUndefined`: Self = StObject.set(x, "-evaluate", js.undefined)
      
      inline def `set-extent`(value: String): Self = StObject.set(x, "-extent", value.asInstanceOf[js.Any])
      
      inline def `set-extentUndefined`: Self = StObject.set(x, "-extent", js.undefined)
      
      inline def `set-extract`(value: String): Self = StObject.set(x, "-extract", value.asInstanceOf[js.Any])
      
      inline def `set-extractUndefined`: Self = StObject.set(x, "-extract", js.undefined)
      
      inline def `set-family`(value: String): Self = StObject.set(x, "-family", value.asInstanceOf[js.Any])
      
      inline def `set-familyUndefined`: Self = StObject.set(x, "-family", js.undefined)
      
      inline def `set-features`(value: String): Self = StObject.set(x, "-features", value.asInstanceOf[js.Any])
      
      inline def `set-featuresUndefined`: Self = StObject.set(x, "-features", js.undefined)
      
      inline def `set-fft`(value: String): Self = StObject.set(x, "-fft", value.asInstanceOf[js.Any])
      
      inline def `set-fftUndefined`: Self = StObject.set(x, "-fft", js.undefined)
      
      inline def `set-fill`(value: String): Self = StObject.set(x, "-fill", value.asInstanceOf[js.Any])
      
      inline def `set-fillUndefined`: Self = StObject.set(x, "-fill", js.undefined)
      
      inline def `set-filter`(value: String): Self = StObject.set(x, "-filter", value.asInstanceOf[js.Any])
      
      inline def `set-filterUndefined`: Self = StObject.set(x, "-filter", js.undefined)
      
      inline def `set-flatten`(value: String): Self = StObject.set(x, "-flatten", value.asInstanceOf[js.Any])
      
      inline def `set-flattenUndefined`: Self = StObject.set(x, "-flatten", js.undefined)
      
      inline def `set-flip`(value: String): Self = StObject.set(x, "-flip", value.asInstanceOf[js.Any])
      
      inline def `set-flipUndefined`: Self = StObject.set(x, "-flip", js.undefined)
      
      inline def `set-floodfill`(value: String): Self = StObject.set(x, "-floodfill", value.asInstanceOf[js.Any])
      
      inline def `set-floodfillUndefined`: Self = StObject.set(x, "-floodfill", js.undefined)
      
      inline def `set-flop`(value: String): Self = StObject.set(x, "-flop", value.asInstanceOf[js.Any])
      
      inline def `set-flopUndefined`: Self = StObject.set(x, "-flop", js.undefined)
      
      inline def `set-font`(value: String): Self = StObject.set(x, "-font", value.asInstanceOf[js.Any])
      
      inline def `set-fontUndefined`: Self = StObject.set(x, "-font", js.undefined)
      
      inline def `set-format`(value: String): Self = StObject.set(x, "-format", value.asInstanceOf[js.Any])
      
      inline def `set-formatUndefined`: Self = StObject.set(x, "-format", js.undefined)
      
      inline def `set-frame`(value: String): Self = StObject.set(x, "-frame", value.asInstanceOf[js.Any])
      
      inline def `set-frameUndefined`: Self = StObject.set(x, "-frame", js.undefined)
      
      inline def `set-function`(value: String): Self = StObject.set(x, "-function", value.asInstanceOf[js.Any])
      
      inline def `set-functionUndefined`: Self = StObject.set(x, "-function", js.undefined)
      
      inline def `set-fuzz`(value: String): Self = StObject.set(x, "-fuzz", value.asInstanceOf[js.Any])
      
      inline def `set-fuzzUndefined`: Self = StObject.set(x, "-fuzz", js.undefined)
      
      inline def `set-fx`(value: String): Self = StObject.set(x, "-fx", value.asInstanceOf[js.Any])
      
      inline def `set-fxUndefined`: Self = StObject.set(x, "-fx", js.undefined)
      
      inline def `set-gamma`(value: String): Self = StObject.set(x, "-gamma", value.asInstanceOf[js.Any])
      
      inline def `set-gammaUndefined`: Self = StObject.set(x, "-gamma", js.undefined)
      
      inline def `set-gaussian-blur`(value: String): Self = StObject.set(x, "-gaussian-blur", value.asInstanceOf[js.Any])
      
      inline def `set-gaussian-blurUndefined`: Self = StObject.set(x, "-gaussian-blur", js.undefined)
      
      inline def `set-geometry`(value: String): Self = StObject.set(x, "-geometry", value.asInstanceOf[js.Any])
      
      inline def `set-geometryUndefined`: Self = StObject.set(x, "-geometry", js.undefined)
      
      inline def `set-gravity`(value: String): Self = StObject.set(x, "-gravity", value.asInstanceOf[js.Any])
      
      inline def `set-gravityUndefined`: Self = StObject.set(x, "-gravity", js.undefined)
      
      inline def `set-grayscale`(value: String): Self = StObject.set(x, "-grayscale", value.asInstanceOf[js.Any])
      
      inline def `set-grayscaleUndefined`: Self = StObject.set(x, "-grayscale", js.undefined)
      
      inline def `set-green-primary`(value: String): Self = StObject.set(x, "-green-primary", value.asInstanceOf[js.Any])
      
      inline def `set-green-primaryUndefined`: Self = StObject.set(x, "-green-primary", js.undefined)
      
      inline def `set-help`(value: String): Self = StObject.set(x, "-help", value.asInstanceOf[js.Any])
      
      inline def `set-helpUndefined`: Self = StObject.set(x, "-help", js.undefined)
      
      inline def `set-hough-lines`(value: String): Self = StObject.set(x, "-hough-lines", value.asInstanceOf[js.Any])
      
      inline def `set-hough-linesUndefined`: Self = StObject.set(x, "-hough-lines", js.undefined)
      
      inline def `set-identify`(value: String): Self = StObject.set(x, "-identify", value.asInstanceOf[js.Any])
      
      inline def `set-identifyUndefined`: Self = StObject.set(x, "-identify", js.undefined)
      
      inline def `set-ift`(value: String): Self = StObject.set(x, "-ift", value.asInstanceOf[js.Any])
      
      inline def `set-iftUndefined`: Self = StObject.set(x, "-ift", js.undefined)
      
      inline def `set-implode`(value: String): Self = StObject.set(x, "-implode", value.asInstanceOf[js.Any])
      
      inline def `set-implodeUndefined`: Self = StObject.set(x, "-implode", js.undefined)
      
      inline def `set-insert`(value: String): Self = StObject.set(x, "-insert", value.asInstanceOf[js.Any])
      
      inline def `set-insertUndefined`: Self = StObject.set(x, "-insert", js.undefined)
      
      inline def `set-intensity`(value: String): Self = StObject.set(x, "-intensity", value.asInstanceOf[js.Any])
      
      inline def `set-intensityUndefined`: Self = StObject.set(x, "-intensity", js.undefined)
      
      inline def `set-intent`(value: String): Self = StObject.set(x, "-intent", value.asInstanceOf[js.Any])
      
      inline def `set-intentUndefined`: Self = StObject.set(x, "-intent", js.undefined)
      
      inline def `set-interlace`(value: String): Self = StObject.set(x, "-interlace", value.asInstanceOf[js.Any])
      
      inline def `set-interlaceUndefined`: Self = StObject.set(x, "-interlace", js.undefined)
      
      inline def `set-interline-spacing`(value: String): Self = StObject.set(x, "-interline-spacing", value.asInstanceOf[js.Any])
      
      inline def `set-interline-spacingUndefined`: Self = StObject.set(x, "-interline-spacing", js.undefined)
      
      inline def `set-interpolate`(value: String): Self = StObject.set(x, "-interpolate", value.asInstanceOf[js.Any])
      
      inline def `set-interpolateUndefined`: Self = StObject.set(x, "-interpolate", js.undefined)
      
      inline def `set-interword-spacing`(value: String): Self = StObject.set(x, "-interword-spacing", value.asInstanceOf[js.Any])
      
      inline def `set-interword-spacingUndefined`: Self = StObject.set(x, "-interword-spacing", js.undefined)
      
      inline def `set-kerning`(value: String): Self = StObject.set(x, "-kerning", value.asInstanceOf[js.Any])
      
      inline def `set-kerningUndefined`: Self = StObject.set(x, "-kerning", js.undefined)
      
      inline def `set-kmeans`(value: String): Self = StObject.set(x, "-kmeans", value.asInstanceOf[js.Any])
      
      inline def `set-kmeansUndefined`: Self = StObject.set(x, "-kmeans", js.undefined)
      
      inline def `set-kuwahara`(value: String): Self = StObject.set(x, "-kuwahara", value.asInstanceOf[js.Any])
      
      inline def `set-kuwaharaUndefined`: Self = StObject.set(x, "-kuwahara", js.undefined)
      
      inline def `set-label`(value: String): Self = StObject.set(x, "-label", value.asInstanceOf[js.Any])
      
      inline def `set-labelUndefined`: Self = StObject.set(x, "-label", js.undefined)
      
      inline def `set-lat`(value: String): Self = StObject.set(x, "-lat", value.asInstanceOf[js.Any])
      
      inline def `set-latUndefined`: Self = StObject.set(x, "-lat", js.undefined)
      
      inline def `set-layers`(value: String): Self = StObject.set(x, "-layers", value.asInstanceOf[js.Any])
      
      inline def `set-layersUndefined`: Self = StObject.set(x, "-layers", js.undefined)
      
      inline def `set-level`(value: String): Self = StObject.set(x, "-level", value.asInstanceOf[js.Any])
      
      inline def `set-levelUndefined`: Self = StObject.set(x, "-level", js.undefined)
      
      inline def `set-limit`(value: String): Self = StObject.set(x, "-limit", value.asInstanceOf[js.Any])
      
      inline def `set-limitUndefined`: Self = StObject.set(x, "-limit", js.undefined)
      
      inline def `set-linear-stretch`(value: String): Self = StObject.set(x, "-linear-stretch", value.asInstanceOf[js.Any])
      
      inline def `set-linear-stretchUndefined`: Self = StObject.set(x, "-linear-stretch", js.undefined)
      
      inline def `set-liquid-rescale`(value: String): Self = StObject.set(x, "-liquid-rescale", value.asInstanceOf[js.Any])
      
      inline def `set-liquid-rescaleUndefined`: Self = StObject.set(x, "-liquid-rescale", js.undefined)
      
      inline def `set-list`(value: String): Self = StObject.set(x, "-list", value.asInstanceOf[js.Any])
      
      inline def `set-listUndefined`: Self = StObject.set(x, "-list", js.undefined)
      
      inline def `set-log`(value: String): Self = StObject.set(x, "-log", value.asInstanceOf[js.Any])
      
      inline def `set-logUndefined`: Self = StObject.set(x, "-log", js.undefined)
      
      inline def `set-loop`(value: String): Self = StObject.set(x, "-loop", value.asInstanceOf[js.Any])
      
      inline def `set-loopUndefined`: Self = StObject.set(x, "-loop", js.undefined)
      
      inline def `set-mattecolor`(value: String): Self = StObject.set(x, "-mattecolor", value.asInstanceOf[js.Any])
      
      inline def `set-mattecolorUndefined`: Self = StObject.set(x, "-mattecolor", js.undefined)
      
      inline def `set-mean-shift`(value: String): Self = StObject.set(x, "-mean-shift", value.asInstanceOf[js.Any])
      
      inline def `set-mean-shiftUndefined`: Self = StObject.set(x, "-mean-shift", js.undefined)
      
      inline def `set-median`(value: String): Self = StObject.set(x, "-median", value.asInstanceOf[js.Any])
      
      inline def `set-medianUndefined`: Self = StObject.set(x, "-median", js.undefined)
      
      inline def `set-metric`(value: String): Self = StObject.set(x, "-metric", value.asInstanceOf[js.Any])
      
      inline def `set-metricUndefined`: Self = StObject.set(x, "-metric", js.undefined)
      
      inline def `set-mode`(value: String): Self = StObject.set(x, "-mode", value.asInstanceOf[js.Any])
      
      inline def `set-modeUndefined`: Self = StObject.set(x, "-mode", js.undefined)
      
      inline def `set-modulate`(value: String): Self = StObject.set(x, "-modulate", value.asInstanceOf[js.Any])
      
      inline def `set-modulateUndefined`: Self = StObject.set(x, "-modulate", js.undefined)
      
      inline def `set-moments`(value: String): Self = StObject.set(x, "-moments", value.asInstanceOf[js.Any])
      
      inline def `set-momentsUndefined`: Self = StObject.set(x, "-moments", js.undefined)
      
      inline def `set-monitor`(value: String): Self = StObject.set(x, "-monitor", value.asInstanceOf[js.Any])
      
      inline def `set-monitorUndefined`: Self = StObject.set(x, "-monitor", js.undefined)
      
      inline def `set-monochrome`(value: String): Self = StObject.set(x, "-monochrome", value.asInstanceOf[js.Any])
      
      inline def `set-monochromeUndefined`: Self = StObject.set(x, "-monochrome", js.undefined)
      
      inline def `set-morph`(value: String): Self = StObject.set(x, "-morph", value.asInstanceOf[js.Any])
      
      inline def `set-morphUndefined`: Self = StObject.set(x, "-morph", js.undefined)
      
      inline def `set-morphology`(value: String): Self = StObject.set(x, "-morphology", value.asInstanceOf[js.Any])
      
      inline def `set-morphologyUndefined`: Self = StObject.set(x, "-morphology", js.undefined)
      
      inline def `set-motion-blur`(value: String): Self = StObject.set(x, "-motion-blur", value.asInstanceOf[js.Any])
      
      inline def `set-motion-blurUndefined`: Self = StObject.set(x, "-motion-blur", js.undefined)
      
      inline def `set-negate`(value: String): Self = StObject.set(x, "-negate", value.asInstanceOf[js.Any])
      
      inline def `set-negateUndefined`: Self = StObject.set(x, "-negate", js.undefined)
      
      inline def `set-noise`(value: String): Self = StObject.set(x, "-noise", value.asInstanceOf[js.Any])
      
      inline def `set-noiseUndefined`: Self = StObject.set(x, "-noise", js.undefined)
      
      inline def `set-normalize`(value: String): Self = StObject.set(x, "-normalize", value.asInstanceOf[js.Any])
      
      inline def `set-normalizeUndefined`: Self = StObject.set(x, "-normalize", js.undefined)
      
      inline def `set-opaque`(value: String): Self = StObject.set(x, "-opaque", value.asInstanceOf[js.Any])
      
      inline def `set-opaqueUndefined`: Self = StObject.set(x, "-opaque", js.undefined)
      
      inline def `set-ordered-dither`(value: String): Self = StObject.set(x, "-ordered-dither", value.asInstanceOf[js.Any])
      
      inline def `set-ordered-ditherUndefined`: Self = StObject.set(x, "-ordered-dither", js.undefined)
      
      inline def `set-orient`(value: String): Self = StObject.set(x, "-orient", value.asInstanceOf[js.Any])
      
      inline def `set-orientUndefined`: Self = StObject.set(x, "-orient", js.undefined)
      
      inline def `set-page`(value: String): Self = StObject.set(x, "-page", value.asInstanceOf[js.Any])
      
      inline def `set-pageUndefined`: Self = StObject.set(x, "-page", js.undefined)
      
      inline def `set-paint`(value: String): Self = StObject.set(x, "-paint", value.asInstanceOf[js.Any])
      
      inline def `set-paintUndefined`: Self = StObject.set(x, "-paint", js.undefined)
      
      inline def `set-perceptible`(value: String): Self = StObject.set(x, "-perceptible", value.asInstanceOf[js.Any])
      
      inline def `set-perceptibleUndefined`: Self = StObject.set(x, "-perceptible", js.undefined)
      
      inline def `set-ping`(value: String): Self = StObject.set(x, "-ping", value.asInstanceOf[js.Any])
      
      inline def `set-pingUndefined`: Self = StObject.set(x, "-ping", js.undefined)
      
      inline def `set-pointsize`(value: String): Self = StObject.set(x, "-pointsize", value.asInstanceOf[js.Any])
      
      inline def `set-pointsizeUndefined`: Self = StObject.set(x, "-pointsize", js.undefined)
      
      inline def `set-polaroid`(value: String): Self = StObject.set(x, "-polaroid", value.asInstanceOf[js.Any])
      
      inline def `set-polaroidUndefined`: Self = StObject.set(x, "-polaroid", js.undefined)
      
      inline def `set-poly`(value: String): Self = StObject.set(x, "-poly", value.asInstanceOf[js.Any])
      
      inline def `set-polyUndefined`: Self = StObject.set(x, "-poly", js.undefined)
      
      inline def `set-posterize`(value: String): Self = StObject.set(x, "-posterize", value.asInstanceOf[js.Any])
      
      inline def `set-posterizeUndefined`: Self = StObject.set(x, "-posterize", js.undefined)
      
      inline def `set-precision`(value: String): Self = StObject.set(x, "-precision", value.asInstanceOf[js.Any])
      
      inline def `set-precisionUndefined`: Self = StObject.set(x, "-precision", js.undefined)
      
      inline def `set-preview`(value: String): Self = StObject.set(x, "-preview", value.asInstanceOf[js.Any])
      
      inline def `set-previewUndefined`: Self = StObject.set(x, "-preview", js.undefined)
      
      inline def `set-print`(value: String): Self = StObject.set(x, "-print", value.asInstanceOf[js.Any])
      
      inline def `set-printUndefined`: Self = StObject.set(x, "-print", js.undefined)
      
      inline def `set-process`(value: String): Self = StObject.set(x, "-process", value.asInstanceOf[js.Any])
      
      inline def `set-processUndefined`: Self = StObject.set(x, "-process", js.undefined)
      
      inline def `set-profile`(value: String): Self = StObject.set(x, "-profile", value.asInstanceOf[js.Any])
      
      inline def `set-profileUndefined`: Self = StObject.set(x, "-profile", js.undefined)
      
      inline def `set-quality`(value: String): Self = StObject.set(x, "-quality", value.asInstanceOf[js.Any])
      
      inline def `set-qualityUndefined`: Self = StObject.set(x, "-quality", js.undefined)
      
      inline def `set-quantize`(value: String): Self = StObject.set(x, "-quantize", value.asInstanceOf[js.Any])
      
      inline def `set-quantizeUndefined`: Self = StObject.set(x, "-quantize", js.undefined)
      
      inline def `set-quiet`(value: String): Self = StObject.set(x, "-quiet", value.asInstanceOf[js.Any])
      
      inline def `set-quietUndefined`: Self = StObject.set(x, "-quiet", js.undefined)
      
      inline def `set-radial-blur`(value: String): Self = StObject.set(x, "-radial-blur", value.asInstanceOf[js.Any])
      
      inline def `set-radial-blurUndefined`: Self = StObject.set(x, "-radial-blur", js.undefined)
      
      inline def `set-raise`(value: String): Self = StObject.set(x, "-raise", value.asInstanceOf[js.Any])
      
      inline def `set-raiseUndefined`: Self = StObject.set(x, "-raise", js.undefined)
      
      inline def `set-random-threshold`(value: String): Self = StObject.set(x, "-random-threshold", value.asInstanceOf[js.Any])
      
      inline def `set-random-thresholdUndefined`: Self = StObject.set(x, "-random-threshold", js.undefined)
      
      inline def `set-range-threshold`(value: String): Self = StObject.set(x, "-range-threshold", value.asInstanceOf[js.Any])
      
      inline def `set-range-thresholdUndefined`: Self = StObject.set(x, "-range-threshold", js.undefined)
      
      inline def `set-read-mask`(value: String): Self = StObject.set(x, "-read-mask", value.asInstanceOf[js.Any])
      
      inline def `set-read-maskUndefined`: Self = StObject.set(x, "-read-mask", js.undefined)
      
      inline def `set-red-primary`(value: String): Self = StObject.set(x, "-red-primary", value.asInstanceOf[js.Any])
      
      inline def `set-red-primaryUndefined`: Self = StObject.set(x, "-red-primary", js.undefined)
      
      inline def `set-regard-warnings`(value: String): Self = StObject.set(x, "-regard-warnings", value.asInstanceOf[js.Any])
      
      inline def `set-regard-warningsUndefined`: Self = StObject.set(x, "-regard-warnings", js.undefined)
      
      inline def `set-region`(value: String): Self = StObject.set(x, "-region", value.asInstanceOf[js.Any])
      
      inline def `set-regionUndefined`: Self = StObject.set(x, "-region", js.undefined)
      
      inline def `set-remap`(value: String): Self = StObject.set(x, "-remap", value.asInstanceOf[js.Any])
      
      inline def `set-remapUndefined`: Self = StObject.set(x, "-remap", js.undefined)
      
      inline def `set-render`(value: String): Self = StObject.set(x, "-render", value.asInstanceOf[js.Any])
      
      inline def `set-renderUndefined`: Self = StObject.set(x, "-render", js.undefined)
      
      inline def `set-repage`(value: String): Self = StObject.set(x, "-repage", value.asInstanceOf[js.Any])
      
      inline def `set-repageUndefined`: Self = StObject.set(x, "-repage", js.undefined)
      
      inline def `set-resample`(value: String): Self = StObject.set(x, "-resample", value.asInstanceOf[js.Any])
      
      inline def `set-resampleUndefined`: Self = StObject.set(x, "-resample", js.undefined)
      
      inline def `set-resize`(value: String): Self = StObject.set(x, "-resize", value.asInstanceOf[js.Any])
      
      inline def `set-resizeUndefined`: Self = StObject.set(x, "-resize", js.undefined)
      
      inline def `set-respect-parentheses`(value: String): Self = StObject.set(x, "-respect-parentheses", value.asInstanceOf[js.Any])
      
      inline def `set-respect-parenthesesUndefined`: Self = StObject.set(x, "-respect-parentheses", js.undefined)
      
      inline def `set-roll`(value: String): Self = StObject.set(x, "-roll", value.asInstanceOf[js.Any])
      
      inline def `set-rollUndefined`: Self = StObject.set(x, "-roll", js.undefined)
      
      inline def `set-rotate`(value: String): Self = StObject.set(x, "-rotate", value.asInstanceOf[js.Any])
      
      inline def `set-rotateUndefined`: Self = StObject.set(x, "-rotate", js.undefined)
      
      inline def `set-sample`(value: String): Self = StObject.set(x, "-sample", value.asInstanceOf[js.Any])
      
      inline def `set-sampleUndefined`: Self = StObject.set(x, "-sample", js.undefined)
      
      inline def `set-sampling-factor`(value: String): Self = StObject.set(x, "-sampling-factor", value.asInstanceOf[js.Any])
      
      inline def `set-sampling-factorUndefined`: Self = StObject.set(x, "-sampling-factor", js.undefined)
      
      inline def `set-scale`(value: String): Self = StObject.set(x, "-scale", value.asInstanceOf[js.Any])
      
      inline def `set-scaleUndefined`: Self = StObject.set(x, "-scale", js.undefined)
      
      inline def `set-scene`(value: String): Self = StObject.set(x, "-scene", value.asInstanceOf[js.Any])
      
      inline def `set-sceneUndefined`: Self = StObject.set(x, "-scene", js.undefined)
      
      inline def `set-seed`(value: String): Self = StObject.set(x, "-seed", value.asInstanceOf[js.Any])
      
      inline def `set-seedUndefined`: Self = StObject.set(x, "-seed", js.undefined)
      
      inline def `set-segment`(value: String): Self = StObject.set(x, "-segment", value.asInstanceOf[js.Any])
      
      inline def `set-segmentUndefined`: Self = StObject.set(x, "-segment", js.undefined)
      
      inline def `set-selective-blur`(value: String): Self = StObject.set(x, "-selective-blur", value.asInstanceOf[js.Any])
      
      inline def `set-selective-blurUndefined`: Self = StObject.set(x, "-selective-blur", js.undefined)
      
      inline def `set-separate`(value: String): Self = StObject.set(x, "-separate", value.asInstanceOf[js.Any])
      
      inline def `set-separateUndefined`: Self = StObject.set(x, "-separate", js.undefined)
      
      inline def `set-sepia-tone`(value: String): Self = StObject.set(x, "-sepia-tone", value.asInstanceOf[js.Any])
      
      inline def `set-sepia-toneUndefined`: Self = StObject.set(x, "-sepia-tone", js.undefined)
      
      inline def `set-set`(value: String): Self = StObject.set(x, "-set", value.asInstanceOf[js.Any])
      
      inline def `set-setUndefined`: Self = StObject.set(x, "-set", js.undefined)
      
      inline def `set-shade`(value: String): Self = StObject.set(x, "-shade", value.asInstanceOf[js.Any])
      
      inline def `set-shadeUndefined`: Self = StObject.set(x, "-shade", js.undefined)
      
      inline def `set-shadow`(value: String): Self = StObject.set(x, "-shadow", value.asInstanceOf[js.Any])
      
      inline def `set-shadowUndefined`: Self = StObject.set(x, "-shadow", js.undefined)
      
      inline def `set-sharpen`(value: String): Self = StObject.set(x, "-sharpen", value.asInstanceOf[js.Any])
      
      inline def `set-sharpenUndefined`: Self = StObject.set(x, "-sharpen", js.undefined)
      
      inline def `set-shave`(value: String): Self = StObject.set(x, "-shave", value.asInstanceOf[js.Any])
      
      inline def `set-shaveUndefined`: Self = StObject.set(x, "-shave", js.undefined)
      
      inline def `set-shear`(value: String): Self = StObject.set(x, "-shear", value.asInstanceOf[js.Any])
      
      inline def `set-shearUndefined`: Self = StObject.set(x, "-shear", js.undefined)
      
      inline def `set-sigmoidal-contrast`(value: String): Self = StObject.set(x, "-sigmoidal-contrast", value.asInstanceOf[js.Any])
      
      inline def `set-sigmoidal-contrastUndefined`: Self = StObject.set(x, "-sigmoidal-contrast", js.undefined)
      
      inline def `set-size`(value: String): Self = StObject.set(x, "-size", value.asInstanceOf[js.Any])
      
      inline def `set-sizeUndefined`: Self = StObject.set(x, "-size", js.undefined)
      
      inline def `set-sketch`(value: String): Self = StObject.set(x, "-sketch", value.asInstanceOf[js.Any])
      
      inline def `set-sketchUndefined`: Self = StObject.set(x, "-sketch", js.undefined)
      
      inline def `set-smush`(value: String): Self = StObject.set(x, "-smush", value.asInstanceOf[js.Any])
      
      inline def `set-smushUndefined`: Self = StObject.set(x, "-smush", js.undefined)
      
      inline def `set-solarize`(value: String): Self = StObject.set(x, "-solarize", value.asInstanceOf[js.Any])
      
      inline def `set-solarizeUndefined`: Self = StObject.set(x, "-solarize", js.undefined)
      
      inline def `set-splice`(value: String): Self = StObject.set(x, "-splice", value.asInstanceOf[js.Any])
      
      inline def `set-spliceUndefined`: Self = StObject.set(x, "-splice", js.undefined)
      
      inline def `set-spread`(value: String): Self = StObject.set(x, "-spread", value.asInstanceOf[js.Any])
      
      inline def `set-spreadUndefined`: Self = StObject.set(x, "-spread", js.undefined)
      
      inline def `set-statistic`(value: String): Self = StObject.set(x, "-statistic", value.asInstanceOf[js.Any])
      
      inline def `set-statisticUndefined`: Self = StObject.set(x, "-statistic", js.undefined)
      
      inline def `set-stretch`(value: String): Self = StObject.set(x, "-stretch", value.asInstanceOf[js.Any])
      
      inline def `set-stretchUndefined`: Self = StObject.set(x, "-stretch", js.undefined)
      
      inline def `set-strip`(value: String): Self = StObject.set(x, "-strip", value.asInstanceOf[js.Any])
      
      inline def `set-stripUndefined`: Self = StObject.set(x, "-strip", js.undefined)
      
      inline def `set-stroke`(value: String): Self = StObject.set(x, "-stroke", value.asInstanceOf[js.Any])
      
      inline def `set-strokeUndefined`: Self = StObject.set(x, "-stroke", js.undefined)
      
      inline def `set-strokewidth`(value: String): Self = StObject.set(x, "-strokewidth", value.asInstanceOf[js.Any])
      
      inline def `set-strokewidthUndefined`: Self = StObject.set(x, "-strokewidth", js.undefined)
      
      inline def `set-style`(value: String): Self = StObject.set(x, "-style", value.asInstanceOf[js.Any])
      
      inline def `set-styleUndefined`: Self = StObject.set(x, "-style", js.undefined)
      
      inline def `set-swap`(value: String): Self = StObject.set(x, "-swap", value.asInstanceOf[js.Any])
      
      inline def `set-swapUndefined`: Self = StObject.set(x, "-swap", js.undefined)
      
      inline def `set-swirl`(value: String): Self = StObject.set(x, "-swirl", value.asInstanceOf[js.Any])
      
      inline def `set-swirlUndefined`: Self = StObject.set(x, "-swirl", js.undefined)
      
      inline def `set-synchronize`(value: String): Self = StObject.set(x, "-synchronize", value.asInstanceOf[js.Any])
      
      inline def `set-synchronizeUndefined`: Self = StObject.set(x, "-synchronize", js.undefined)
      
      inline def `set-taint`(value: String): Self = StObject.set(x, "-taint", value.asInstanceOf[js.Any])
      
      inline def `set-taintUndefined`: Self = StObject.set(x, "-taint", js.undefined)
      
      inline def `set-texture`(value: String): Self = StObject.set(x, "-texture", value.asInstanceOf[js.Any])
      
      inline def `set-textureUndefined`: Self = StObject.set(x, "-texture", js.undefined)
      
      inline def `set-threshold`(value: String): Self = StObject.set(x, "-threshold", value.asInstanceOf[js.Any])
      
      inline def `set-thresholdUndefined`: Self = StObject.set(x, "-threshold", js.undefined)
      
      inline def `set-thumbnail`(value: String): Self = StObject.set(x, "-thumbnail", value.asInstanceOf[js.Any])
      
      inline def `set-thumbnailUndefined`: Self = StObject.set(x, "-thumbnail", js.undefined)
      
      inline def `set-tile`(value: String): Self = StObject.set(x, "-tile", value.asInstanceOf[js.Any])
      
      inline def `set-tile-offset`(value: String): Self = StObject.set(x, "-tile-offset", value.asInstanceOf[js.Any])
      
      inline def `set-tile-offsetUndefined`: Self = StObject.set(x, "-tile-offset", js.undefined)
      
      inline def `set-tileUndefined`: Self = StObject.set(x, "-tile", js.undefined)
      
      inline def `set-tint`(value: String): Self = StObject.set(x, "-tint", value.asInstanceOf[js.Any])
      
      inline def `set-tintUndefined`: Self = StObject.set(x, "-tint", js.undefined)
      
      inline def `set-transform`(value: String): Self = StObject.set(x, "-transform", value.asInstanceOf[js.Any])
      
      inline def `set-transformUndefined`: Self = StObject.set(x, "-transform", js.undefined)
      
      inline def `set-transparent`(value: String): Self = StObject.set(x, "-transparent", value.asInstanceOf[js.Any])
      
      inline def `set-transparent-color`(value: String): Self = StObject.set(x, "-transparent-color", value.asInstanceOf[js.Any])
      
      inline def `set-transparent-colorUndefined`: Self = StObject.set(x, "-transparent-color", js.undefined)
      
      inline def `set-transparentUndefined`: Self = StObject.set(x, "-transparent", js.undefined)
      
      inline def `set-transpose`(value: String): Self = StObject.set(x, "-transpose", value.asInstanceOf[js.Any])
      
      inline def `set-transposeUndefined`: Self = StObject.set(x, "-transpose", js.undefined)
      
      inline def `set-transverse`(value: String): Self = StObject.set(x, "-transverse", value.asInstanceOf[js.Any])
      
      inline def `set-transverseUndefined`: Self = StObject.set(x, "-transverse", js.undefined)
      
      inline def `set-treedepth`(value: String): Self = StObject.set(x, "-treedepth", value.asInstanceOf[js.Any])
      
      inline def `set-treedepthUndefined`: Self = StObject.set(x, "-treedepth", js.undefined)
      
      inline def `set-trim`(value: String): Self = StObject.set(x, "-trim", value.asInstanceOf[js.Any])
      
      inline def `set-trimUndefined`: Self = StObject.set(x, "-trim", js.undefined)
      
      inline def `set-type`(value: String): Self = StObject.set(x, "-type", value.asInstanceOf[js.Any])
      
      inline def `set-typeUndefined`: Self = StObject.set(x, "-type", js.undefined)
      
      inline def `set-undercolor`(value: String): Self = StObject.set(x, "-undercolor", value.asInstanceOf[js.Any])
      
      inline def `set-undercolorUndefined`: Self = StObject.set(x, "-undercolor", js.undefined)
      
      inline def `set-unique-colors`(value: String): Self = StObject.set(x, "-unique-colors", value.asInstanceOf[js.Any])
      
      inline def `set-unique-colorsUndefined`: Self = StObject.set(x, "-unique-colors", js.undefined)
      
      inline def `set-units`(value: String): Self = StObject.set(x, "-units", value.asInstanceOf[js.Any])
      
      inline def `set-unitsUndefined`: Self = StObject.set(x, "-units", js.undefined)
      
      inline def `set-unsharp`(value: String): Self = StObject.set(x, "-unsharp", value.asInstanceOf[js.Any])
      
      inline def `set-unsharpUndefined`: Self = StObject.set(x, "-unsharp", js.undefined)
      
      inline def `set-verbose`(value: String): Self = StObject.set(x, "-verbose", value.asInstanceOf[js.Any])
      
      inline def `set-verboseUndefined`: Self = StObject.set(x, "-verbose", js.undefined)
      
      inline def `set-version`(value: String): Self = StObject.set(x, "-version", value.asInstanceOf[js.Any])
      
      inline def `set-versionUndefined`: Self = StObject.set(x, "-version", js.undefined)
      
      inline def `set-view`(value: String): Self = StObject.set(x, "-view", value.asInstanceOf[js.Any])
      
      inline def `set-viewUndefined`: Self = StObject.set(x, "-view", js.undefined)
      
      inline def `set-vignette`(value: String): Self = StObject.set(x, "-vignette", value.asInstanceOf[js.Any])
      
      inline def `set-vignetteUndefined`: Self = StObject.set(x, "-vignette", js.undefined)
      
      inline def `set-virtual-pixel`(value: String): Self = StObject.set(x, "-virtual-pixel", value.asInstanceOf[js.Any])
      
      inline def `set-virtual-pixelUndefined`: Self = StObject.set(x, "-virtual-pixel", js.undefined)
      
      inline def `set-wave`(value: String): Self = StObject.set(x, "-wave", value.asInstanceOf[js.Any])
      
      inline def `set-waveUndefined`: Self = StObject.set(x, "-wave", js.undefined)
      
      inline def `set-wavelet-denoise`(value: String): Self = StObject.set(x, "-wavelet-denoise", value.asInstanceOf[js.Any])
      
      inline def `set-wavelet-denoiseUndefined`: Self = StObject.set(x, "-wavelet-denoise", js.undefined)
      
      inline def `set-weight`(value: String): Self = StObject.set(x, "-weight", value.asInstanceOf[js.Any])
      
      inline def `set-weightUndefined`: Self = StObject.set(x, "-weight", js.undefined)
      
      inline def `set-white-point`(value: String): Self = StObject.set(x, "-white-point", value.asInstanceOf[js.Any])
      
      inline def `set-white-pointUndefined`: Self = StObject.set(x, "-white-point", js.undefined)
      
      inline def `set-white-threshold`(value: String): Self = StObject.set(x, "-white-threshold", value.asInstanceOf[js.Any])
      
      inline def `set-white-thresholdUndefined`: Self = StObject.set(x, "-white-threshold", js.undefined)
      
      inline def `set-write`(value: String): Self = StObject.set(x, "-write", value.asInstanceOf[js.Any])
      
      inline def `set-write-mask`(value: String): Self = StObject.set(x, "-write-mask", value.asInstanceOf[js.Any])
      
      inline def `set-write-maskUndefined`: Self = StObject.set(x, "-write-mask", js.undefined)
      
      inline def `set-writeUndefined`: Self = StObject.set(x, "-write", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    CombinedImage extends true ? [pdf-image.pdf-image.Options & {  combinedImage :CombinedImage}] : [] | [pdf-image.pdf-image.Options & {  combinedImage :CombinedImage | undefined}]
    }}}
    */
  @js.native
  trait OptionalSpread[CombinedImage /* <: Boolean */] extends StObject
  
  trait Options extends StObject {
    
    var convertExtension: js.UndefOr[String] = js.undefined
    
    var convertOptions: js.UndefOr[ConvertOptions] = js.undefined
    
    var graphicsMagick: js.UndefOr[Boolean] = js.undefined
    
    var outputDirectory: js.UndefOr[String] = js.undefined
    
    var pdfFileBaseName: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConvertExtension(value: String): Self = StObject.set(x, "convertExtension", value.asInstanceOf[js.Any])
      
      inline def setConvertExtensionUndefined: Self = StObject.set(x, "convertExtension", js.undefined)
      
      inline def setConvertOptions(value: ConvertOptions): Self = StObject.set(x, "convertOptions", value.asInstanceOf[js.Any])
      
      inline def setConvertOptionsUndefined: Self = StObject.set(x, "convertOptions", js.undefined)
      
      inline def setGraphicsMagick(value: Boolean): Self = StObject.set(x, "graphicsMagick", value.asInstanceOf[js.Any])
      
      inline def setGraphicsMagickUndefined: Self = StObject.set(x, "graphicsMagick", js.undefined)
      
      inline def setOutputDirectory(value: String): Self = StObject.set(x, "outputDirectory", value.asInstanceOf[js.Any])
      
      inline def setOutputDirectoryUndefined: Self = StObject.set(x, "outputDirectory", js.undefined)
      
      inline def setPdfFileBaseName(value: String): Self = StObject.set(x, "pdfFileBaseName", value.asInstanceOf[js.Any])
      
      inline def setPdfFileBaseNameUndefined: Self = StObject.set(x, "pdfFileBaseName", js.undefined)
    }
  }
  
  trait PDFInfo
    extends StObject
       with /* key */ StringDictionary[String] {
    
    var CreationDate: String
    
    var Creator: String
    
    var Encrypted: String
    
    var `File size`: String
    
    var Form: String
    
    var JavaScript: String
    
    var Optimized: String
    
    var `PDF version`: String
    
    var `Page rot`: String
    
    var `Page size`: String
    
    var Pages: String
    
    var Producer: String
    
    var Suspects: String
    
    var Tagged: String
    
    var UserProperties: String
  }
  object PDFInfo {
    
    inline def apply(
      CreationDate: String,
      Creator: String,
      Encrypted: String,
      `File size`: String,
      Form: String,
      JavaScript: String,
      Optimized: String,
      `PDF version`: String,
      `Page rot`: String,
      `Page size`: String,
      Pages: String,
      Producer: String,
      Suspects: String,
      Tagged: String,
      UserProperties: String
    ): PDFInfo = {
      val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Encrypted = Encrypted.asInstanceOf[js.Any], Form = Form.asInstanceOf[js.Any], JavaScript = JavaScript.asInstanceOf[js.Any], Optimized = Optimized.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Producer = Producer.asInstanceOf[js.Any], Suspects = Suspects.asInstanceOf[js.Any], Tagged = Tagged.asInstanceOf[js.Any], UserProperties = UserProperties.asInstanceOf[js.Any])
      __obj.updateDynamic("File size")((`File size`).asInstanceOf[js.Any])
      __obj.updateDynamic("PDF version")((`PDF version`).asInstanceOf[js.Any])
      __obj.updateDynamic("Page rot")((`Page rot`).asInstanceOf[js.Any])
      __obj.updateDynamic("Page size")((`Page size`).asInstanceOf[js.Any])
      __obj.asInstanceOf[PDFInfo]
    }
    
    extension [Self <: PDFInfo](x: Self) {
      
      inline def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreator(value: String): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
      
      inline def setEncrypted(value: String): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
      
      inline def `setFile size`(value: String): Self = StObject.set(x, "File size", value.asInstanceOf[js.Any])
      
      inline def setForm(value: String): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
      
      inline def setJavaScript(value: String): Self = StObject.set(x, "JavaScript", value.asInstanceOf[js.Any])
      
      inline def setOptimized(value: String): Self = StObject.set(x, "Optimized", value.asInstanceOf[js.Any])
      
      inline def `setPDF version`(value: String): Self = StObject.set(x, "PDF version", value.asInstanceOf[js.Any])
      
      inline def `setPage rot`(value: String): Self = StObject.set(x, "Page rot", value.asInstanceOf[js.Any])
      
      inline def `setPage size`(value: String): Self = StObject.set(x, "Page size", value.asInstanceOf[js.Any])
      
      inline def setPages(value: String): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
      
      inline def setProducer(value: String): Self = StObject.set(x, "Producer", value.asInstanceOf[js.Any])
      
      inline def setSuspects(value: String): Self = StObject.set(x, "Suspects", value.asInstanceOf[js.Any])
      
      inline def setTagged(value: String): Self = StObject.set(x, "Tagged", value.asInstanceOf[js.Any])
      
      inline def setUserProperties(value: String): Self = StObject.set(x, "UserProperties", value.asInstanceOf[js.Any])
    }
  }
}
