package typingsJapgolly.wavesurferJs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wavesurferJs.anon.ArrayRGBAlength256
import typingsJapgolly.wavesurferJs.typesPluginMod.PluginDefinition
import typingsJapgolly.wavesurferJs.typesPluginMod.PluginParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPluginSpectrogramMod {
  
  @JSImport("wavesurfer.js/src/plugin/spectrogram", JSImport.Default)
  @js.native
  open class default protected () extends SpectrogramPlugin {
    def this(params: SpectrogramPluginParams, ws: typingsJapgolly.wavesurferJs.srcWavesurferMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wavesurfer.js/src/plugin/spectrogram", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(params: SpectrogramPluginParams): PluginDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(params.asInstanceOf[js.Any]).asInstanceOf[PluginDefinition]
  }
  
  type RGBA = js.Tuple4[Double, Double, Double, Double]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.wavesurferJs.typesPluginMod.WaveSurferPlugin because Inheritance from two classes. Inlined init, destroy */ @js.native
  trait SpectrogramPlugin
    extends typingsJapgolly.wavesurferJs.srcUtilObserverMod.default {
    
    val alpha: Double = js.native
    
    val colorMap: js.Array[js.Array[Double]] = js.native
    
    val container: HTMLElement = js.native
    
    def destroy(): Unit = js.native
    
    val drawer: typingsJapgolly.wavesurferJs.srcDrawerMod.default = js.native
    
    val fftSamples: Double = js.native
    
    val frequenciesDataUrl: String = js.native
    
    val height: Double = js.native
    
    def init(): Unit = js.native
    
    val noverlap: Double = js.native
    
    val params: SpectrogramPluginParams = js.native
    
    val pixelRatio: Double = js.native
    
    val spectrCc: CanvasRenderingContext2D = js.native
    
    val util: /* import warning: importer.ImportType#apply Failed type conversion: wavesurfer.js.wavesurfer.js/src/wavesurfer.default['util'] */ js.Any = js.native
    
    val wavesurfer: typingsJapgolly.wavesurferJs.srcWavesurferMod.default = js.native
    
    val width: Double = js.native
    
    val windowFunc: WindowFunction = js.native
    
    val wrapper: HTMLElement = js.native
  }
  
  trait SpectrogramPluginParams
    extends StObject
       with PluginParams {
    
    /** Some window functions have this extra value (between 0 and 1). */
    var alpha: js.UndefOr[Double] = js.undefined
    
    /** A 256 long array of 4-element arrays. Each entry should contain a float between 0 and 1 and specify r, g, b, and alpha. */
    var colorMap: js.UndefOr[ArrayRGBAlength256] = js.undefined
    
    /** Selector of element or element in which to render. */
    var container: String | HTMLElement
    
    /** Number of samples to fetch to FFT. Must be a power of 2. */
    var fftSamples: js.UndefOr[Double] = js.undefined
    
    /** Set to true to display frequency labels. */
    var labels: js.UndefOr[Boolean] = js.undefined
    
    /** Size of the overlapping window. Must be < fftSamples. Auto deduced from canvas size by default. */
    var noverlap: js.UndefOr[Double] = js.undefined
    
    /** Controls the size of the spectrogram in relation with its canvas (1 = Draw on the whole canvas. 2 = Draw on a quarter, i.e. 1/2 the length and 1/2 the width). */
    var pixelRatio: js.UndefOr[Double] = js.undefined
    
    /** Render with separate spectograms for the channels of the audio. */
    var splitChannels: js.UndefOr[Boolean] = js.undefined
    
    /** The window function to be used. */
    var windowFunc: js.UndefOr[WindowFunction] = js.undefined
  }
  object SpectrogramPluginParams {
    
    inline def apply(container: String | HTMLElement): SpectrogramPluginParams = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpectrogramPluginParams]
    }
    
    extension [Self <: SpectrogramPluginParams](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setColorMap(value: ArrayRGBAlength256): Self = StObject.set(x, "colorMap", value.asInstanceOf[js.Any])
      
      inline def setColorMapUndefined: Self = StObject.set(x, "colorMap", js.undefined)
      
      inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setFftSamples(value: Double): Self = StObject.set(x, "fftSamples", value.asInstanceOf[js.Any])
      
      inline def setFftSamplesUndefined: Self = StObject.set(x, "fftSamples", js.undefined)
      
      inline def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setNoverlap(value: Double): Self = StObject.set(x, "noverlap", value.asInstanceOf[js.Any])
      
      inline def setNoverlapUndefined: Self = StObject.set(x, "noverlap", js.undefined)
      
      inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setSplitChannels(value: Boolean): Self = StObject.set(x, "splitChannels", value.asInstanceOf[js.Any])
      
      inline def setSplitChannelsUndefined: Self = StObject.set(x, "splitChannels", js.undefined)
      
      inline def setWindowFunc(value: WindowFunction): Self = StObject.set(x, "windowFunc", value.asInstanceOf[js.Any])
      
      inline def setWindowFuncUndefined: Self = StObject.set(x, "windowFunc", js.undefined)
    }
  }
  
  /* augmented module */
  object WavesurferAugmentingMod {
    
    trait WaveSurfer extends StObject {
      
      def FFT(bufferSize: Double, sampleRate: Double, windowFunc: WindowFunction, alpha: Double): Unit
    }
    object WaveSurfer {
      
      inline def apply(FFT: (Double, Double, WindowFunction, Double) => Callback): WaveSurfer = {
        val __obj = js.Dynamic.literal(FFT = js.Any.fromFunction4((t0: Double, t1: Double, t2: WindowFunction, t3: Double) => (FFT(t0, t1, t2, t3)).runNow()))
        __obj.asInstanceOf[WaveSurfer]
      }
      
      extension [Self <: WaveSurfer](x: Self) {
        
        inline def setFFT(value: (Double, Double, WindowFunction, Double) => Callback): Self = StObject.set(x, "FFT", js.Any.fromFunction4((t0: Double, t1: Double, t2: WindowFunction, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wavesurferJs.wavesurferJsStrings.bartlett
    - typingsJapgolly.wavesurferJs.wavesurferJsStrings.bartlettHann
    - typingsJapgolly.wavesurferJs.wavesurferJsStrings.blackman
    - typingsJapgolly.wavesurferJs.wavesurferJsStrings.cosine
    - typingsJapgolly.wavesurferJs.wavesurferJsStrings.gauss
    - typingsJapgolly.wavesurferJs.wavesurferJsStrings.hamming
    - typingsJapgolly.wavesurferJs.wavesurferJsStrings.hann
    - typingsJapgolly.wavesurferJs.wavesurferJsStrings.lanczoz
    - typingsJapgolly.wavesurferJs.wavesurferJsStrings.rectangular
    - typingsJapgolly.wavesurferJs.wavesurferJsStrings.triangular
  */
  trait WindowFunction extends StObject
  object WindowFunction {
    
    inline def bartlett: typingsJapgolly.wavesurferJs.wavesurferJsStrings.bartlett = "bartlett".asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsStrings.bartlett]
    
    inline def bartlettHann: typingsJapgolly.wavesurferJs.wavesurferJsStrings.bartlettHann = "bartlettHann".asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsStrings.bartlettHann]
    
    inline def blackman: typingsJapgolly.wavesurferJs.wavesurferJsStrings.blackman = "blackman".asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsStrings.blackman]
    
    inline def cosine: typingsJapgolly.wavesurferJs.wavesurferJsStrings.cosine = "cosine".asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsStrings.cosine]
    
    inline def gauss: typingsJapgolly.wavesurferJs.wavesurferJsStrings.gauss = "gauss".asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsStrings.gauss]
    
    inline def hamming: typingsJapgolly.wavesurferJs.wavesurferJsStrings.hamming = "hamming".asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsStrings.hamming]
    
    inline def hann: typingsJapgolly.wavesurferJs.wavesurferJsStrings.hann = "hann".asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsStrings.hann]
    
    inline def lanczoz: typingsJapgolly.wavesurferJs.wavesurferJsStrings.lanczoz = "lanczoz".asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsStrings.lanczoz]
    
    inline def rectangular: typingsJapgolly.wavesurferJs.wavesurferJsStrings.rectangular = "rectangular".asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsStrings.rectangular]
    
    inline def triangular: typingsJapgolly.wavesurferJs.wavesurferJsStrings.triangular = "triangular".asInstanceOf[typingsJapgolly.wavesurferJs.wavesurferJsStrings.triangular]
  }
}
