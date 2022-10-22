package typingsJapgolly.meyda

import japgolly.scalajs.react.Callback
import org.scalajs.dom.AudioContext
import org.scalajs.dom.AudioNode
import typingsJapgolly.meyda.anon.Imag
import typingsJapgolly.meyda.anon.PartialMeydaFeaturesObjec
import typingsJapgolly.meyda.anon.Specific
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.ScriptProcessorNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("meyda", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("meyda", "EXTRACTION_STARTED")
  @js.native
  val EXTRACTION_STARTED: Boolean = js.native
  
  @JSImport("meyda", "MeydaAnalyzer")
  @js.native
  open class MeydaAnalyzer () extends StObject {
    
    def get(): PartialMeydaFeaturesObjec | Null = js.native
    def get(features: js.Array[MeydaAudioFeature]): PartialMeydaFeaturesObjec | Null = js.native
    def get(features: MeydaAudioFeature): PartialMeydaFeaturesObjec | Null = js.native
    
    def setSource(source: AudioNode): Unit = js.native
    
    def start(): Unit = js.native
    def start(features: js.Array[MeydaAudioFeature]): Unit = js.native
    def start(features: MeydaAudioFeature): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @JSImport("meyda", "audioContext")
  @js.native
  val audioContext: AudioContext | Null = js.native
  
  @JSImport("meyda", "bufferSize")
  @js.native
  val bufferSize: Double = js.native
  
  inline def callback(features: PartialMeydaFeaturesObjec): Unit | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("callback")(features.asInstanceOf[js.Any]).asInstanceOf[Unit | Null]
  
  @JSImport("meyda", "chromaBands")
  @js.native
  val chromaBands: Double = js.native
  
  inline def createMeydaAnalyzer(options: MeydaAnalyzerOptions): MeydaAnalyzer = ^.asInstanceOf[js.Dynamic].applyDynamic("createMeydaAnalyzer")(options.asInstanceOf[js.Any]).asInstanceOf[MeydaAnalyzer]
  
  inline def extract(feature: js.Array[MeydaAudioFeature], signal: MeydaSignal): PartialMeydaFeaturesObjec | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(feature.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[PartialMeydaFeaturesObjec | Null]
  inline def extract(feature: js.Array[MeydaAudioFeature], signal: MeydaSignal, previousSignal: MeydaSignal): PartialMeydaFeaturesObjec | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(feature.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], previousSignal.asInstanceOf[js.Any])).asInstanceOf[PartialMeydaFeaturesObjec | Null]
  inline def extract(feature: MeydaAudioFeature, signal: MeydaSignal): PartialMeydaFeaturesObjec | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(feature.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[PartialMeydaFeaturesObjec | Null]
  inline def extract(feature: MeydaAudioFeature, signal: MeydaSignal, previousSignal: MeydaSignal): PartialMeydaFeaturesObjec | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(feature.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], previousSignal.asInstanceOf[js.Any])).asInstanceOf[PartialMeydaFeaturesObjec | Null]
  
  @JSImport("meyda", "featureExtractors")
  @js.native
  val featureExtractors: Any = js.native
  
  @JSImport("meyda", "melBands")
  @js.native
  val melBands: Double = js.native
  
  @JSImport("meyda", "numberOfMFCCCoefficients")
  @js.native
  val numberOfMFCCCoefficients: Double = js.native
  
  @JSImport("meyda", "sampleRate")
  @js.native
  val sampleRate: Double = js.native
  
  @JSImport("meyda", "spn")
  @js.native
  val spn: ScriptProcessorNode | Null = js.native
  
  inline def windowing(signal: MeydaSignal): MeydaSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("windowing")(signal.asInstanceOf[js.Any]).asInstanceOf[MeydaSignal]
  inline def windowing(signal: MeydaSignal, windowname: MeydaWindowingFunction): MeydaSignal = (^.asInstanceOf[js.Dynamic].applyDynamic("windowing")(signal.asInstanceOf[js.Any], windowname.asInstanceOf[js.Any])).asInstanceOf[MeydaSignal]
  
  @JSImport("meyda", "windowingFunction")
  @js.native
  val windowingFunction: MeydaWindowingFunction = js.native
  
  trait MeydaAnalyzerOptions extends StObject {
    
    var audioContext: AudioContext
    
    var bufferSize: Double
    
    var callback: js.UndefOr[js.Function1[/* features */ PartialMeydaFeaturesObjec, Unit]] = js.undefined
    
    var channel: js.UndefOr[Double] = js.undefined
    
    var featureExtractors: js.UndefOr[MeydaAudioFeature | js.Array[MeydaAudioFeature]] = js.undefined
    
    var hopSize: js.UndefOr[Double] = js.undefined
    
    var inputs: js.UndefOr[Double] = js.undefined
    
    var numberOfMFCCCoefficients: js.UndefOr[Double] = js.undefined
    
    var outputs: js.UndefOr[Double] = js.undefined
    
    var sampleRate: js.UndefOr[Double] = js.undefined
    
    var source: AudioNode
    
    var startImmediately: js.UndefOr[Boolean] = js.undefined
    
    var windowingFunction: js.UndefOr[MeydaWindowingFunction] = js.undefined
  }
  object MeydaAnalyzerOptions {
    
    inline def apply(audioContext: AudioContext, bufferSize: Double, source: AudioNode): MeydaAnalyzerOptions = {
      val __obj = js.Dynamic.literal(audioContext = audioContext.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeydaAnalyzerOptions]
    }
    
    extension [Self <: MeydaAnalyzerOptions](x: Self) {
      
      inline def setAudioContext(value: AudioContext): Self = StObject.set(x, "audioContext", value.asInstanceOf[js.Any])
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setCallback(value: /* features */ PartialMeydaFeaturesObjec => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* features */ PartialMeydaFeaturesObjec) => value(t0).runNow()))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setFeatureExtractors(value: MeydaAudioFeature | js.Array[MeydaAudioFeature]): Self = StObject.set(x, "featureExtractors", value.asInstanceOf[js.Any])
      
      inline def setFeatureExtractorsUndefined: Self = StObject.set(x, "featureExtractors", js.undefined)
      
      inline def setFeatureExtractorsVarargs(value: MeydaAudioFeature*): Self = StObject.set(x, "featureExtractors", js.Array(value*))
      
      inline def setHopSize(value: Double): Self = StObject.set(x, "hopSize", value.asInstanceOf[js.Any])
      
      inline def setHopSizeUndefined: Self = StObject.set(x, "hopSize", js.undefined)
      
      inline def setInputs(value: Double): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      inline def setNumberOfMFCCCoefficients(value: Double): Self = StObject.set(x, "numberOfMFCCCoefficients", value.asInstanceOf[js.Any])
      
      inline def setNumberOfMFCCCoefficientsUndefined: Self = StObject.set(x, "numberOfMFCCCoefficients", js.undefined)
      
      inline def setOutputs(value: Double): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
      
      inline def setSource(value: AudioNode): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStartImmediately(value: Boolean): Self = StObject.set(x, "startImmediately", value.asInstanceOf[js.Any])
      
      inline def setStartImmediatelyUndefined: Self = StObject.set(x, "startImmediately", js.undefined)
      
      inline def setWindowingFunction(value: MeydaWindowingFunction): Self = StObject.set(x, "windowingFunction", value.asInstanceOf[js.Any])
      
      inline def setWindowingFunctionUndefined: Self = StObject.set(x, "windowingFunction", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.meyda.meydaStrings.amplitudeSpectrum
    - typingsJapgolly.meyda.meydaStrings.chroma
    - typingsJapgolly.meyda.meydaStrings.complexSpectrum
    - typingsJapgolly.meyda.meydaStrings.energy
    - typingsJapgolly.meyda.meydaStrings.loudness
    - typingsJapgolly.meyda.meydaStrings.mfcc
    - typingsJapgolly.meyda.meydaStrings.perceptualSharpness
    - typingsJapgolly.meyda.meydaStrings.perceptualSpread
    - typingsJapgolly.meyda.meydaStrings.powerSpectrum
    - typingsJapgolly.meyda.meydaStrings.rms
    - typingsJapgolly.meyda.meydaStrings.spectralCentroid
    - typingsJapgolly.meyda.meydaStrings.spectralFlatness
    - typingsJapgolly.meyda.meydaStrings.spectralFlux
    - typingsJapgolly.meyda.meydaStrings.spectralKurtosis
    - typingsJapgolly.meyda.meydaStrings.spectralRolloff
    - typingsJapgolly.meyda.meydaStrings.spectralSkewness
    - typingsJapgolly.meyda.meydaStrings.spectralSlope
    - typingsJapgolly.meyda.meydaStrings.spectralSpread
    - typingsJapgolly.meyda.meydaStrings.zcr
    - typingsJapgolly.meyda.meydaStrings.buffer
  */
  trait MeydaAudioFeature extends StObject
  object MeydaAudioFeature {
    
    inline def amplitudeSpectrum: typingsJapgolly.meyda.meydaStrings.amplitudeSpectrum = "amplitudeSpectrum".asInstanceOf[typingsJapgolly.meyda.meydaStrings.amplitudeSpectrum]
    
    inline def buffer: typingsJapgolly.meyda.meydaStrings.buffer = "buffer".asInstanceOf[typingsJapgolly.meyda.meydaStrings.buffer]
    
    inline def chroma: typingsJapgolly.meyda.meydaStrings.chroma = "chroma".asInstanceOf[typingsJapgolly.meyda.meydaStrings.chroma]
    
    inline def complexSpectrum: typingsJapgolly.meyda.meydaStrings.complexSpectrum = "complexSpectrum".asInstanceOf[typingsJapgolly.meyda.meydaStrings.complexSpectrum]
    
    inline def energy: typingsJapgolly.meyda.meydaStrings.energy = "energy".asInstanceOf[typingsJapgolly.meyda.meydaStrings.energy]
    
    inline def loudness: typingsJapgolly.meyda.meydaStrings.loudness = "loudness".asInstanceOf[typingsJapgolly.meyda.meydaStrings.loudness]
    
    inline def mfcc: typingsJapgolly.meyda.meydaStrings.mfcc = "mfcc".asInstanceOf[typingsJapgolly.meyda.meydaStrings.mfcc]
    
    inline def perceptualSharpness: typingsJapgolly.meyda.meydaStrings.perceptualSharpness = "perceptualSharpness".asInstanceOf[typingsJapgolly.meyda.meydaStrings.perceptualSharpness]
    
    inline def perceptualSpread: typingsJapgolly.meyda.meydaStrings.perceptualSpread = "perceptualSpread".asInstanceOf[typingsJapgolly.meyda.meydaStrings.perceptualSpread]
    
    inline def powerSpectrum: typingsJapgolly.meyda.meydaStrings.powerSpectrum = "powerSpectrum".asInstanceOf[typingsJapgolly.meyda.meydaStrings.powerSpectrum]
    
    inline def rms: typingsJapgolly.meyda.meydaStrings.rms = "rms".asInstanceOf[typingsJapgolly.meyda.meydaStrings.rms]
    
    inline def spectralCentroid: typingsJapgolly.meyda.meydaStrings.spectralCentroid = "spectralCentroid".asInstanceOf[typingsJapgolly.meyda.meydaStrings.spectralCentroid]
    
    inline def spectralFlatness: typingsJapgolly.meyda.meydaStrings.spectralFlatness = "spectralFlatness".asInstanceOf[typingsJapgolly.meyda.meydaStrings.spectralFlatness]
    
    inline def spectralFlux: typingsJapgolly.meyda.meydaStrings.spectralFlux = "spectralFlux".asInstanceOf[typingsJapgolly.meyda.meydaStrings.spectralFlux]
    
    inline def spectralKurtosis: typingsJapgolly.meyda.meydaStrings.spectralKurtosis = "spectralKurtosis".asInstanceOf[typingsJapgolly.meyda.meydaStrings.spectralKurtosis]
    
    inline def spectralRolloff: typingsJapgolly.meyda.meydaStrings.spectralRolloff = "spectralRolloff".asInstanceOf[typingsJapgolly.meyda.meydaStrings.spectralRolloff]
    
    inline def spectralSkewness: typingsJapgolly.meyda.meydaStrings.spectralSkewness = "spectralSkewness".asInstanceOf[typingsJapgolly.meyda.meydaStrings.spectralSkewness]
    
    inline def spectralSlope: typingsJapgolly.meyda.meydaStrings.spectralSlope = "spectralSlope".asInstanceOf[typingsJapgolly.meyda.meydaStrings.spectralSlope]
    
    inline def spectralSpread: typingsJapgolly.meyda.meydaStrings.spectralSpread = "spectralSpread".asInstanceOf[typingsJapgolly.meyda.meydaStrings.spectralSpread]
    
    inline def zcr: typingsJapgolly.meyda.meydaStrings.zcr = "zcr".asInstanceOf[typingsJapgolly.meyda.meydaStrings.zcr]
  }
  
  trait MeydaFeaturesObject extends StObject {
    
    var amplitudeSpectrum: js.typedarray.Float32Array
    
    var buffer: js.Array[Double]
    
    var chroma: js.Array[Double]
    
    var complexSpectrum: Imag
    
    var energy: Double
    
    var loudness: Specific
    
    var mfcc: js.Array[Double]
    
    var perceptualSharpness: Double
    
    var perceptualSpread: Double
    
    var powerSpectrum: js.typedarray.Float32Array
    
    var rms: Double
    
    var spectralCentroid: Double
    
    var spectralFlatness: Double
    
    var spectralKurtosis: Double
    
    var spectralRolloff: Double
    
    var spectralSkewness: Double
    
    var spectralSlope: Double
    
    var spectralSpread: Double
    
    var zcr: Double
  }
  object MeydaFeaturesObject {
    
    inline def apply(
      amplitudeSpectrum: js.typedarray.Float32Array,
      buffer: js.Array[Double],
      chroma: js.Array[Double],
      complexSpectrum: Imag,
      energy: Double,
      loudness: Specific,
      mfcc: js.Array[Double],
      perceptualSharpness: Double,
      perceptualSpread: Double,
      powerSpectrum: js.typedarray.Float32Array,
      rms: Double,
      spectralCentroid: Double,
      spectralFlatness: Double,
      spectralKurtosis: Double,
      spectralRolloff: Double,
      spectralSkewness: Double,
      spectralSlope: Double,
      spectralSpread: Double,
      zcr: Double
    ): MeydaFeaturesObject = {
      val __obj = js.Dynamic.literal(amplitudeSpectrum = amplitudeSpectrum.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], chroma = chroma.asInstanceOf[js.Any], complexSpectrum = complexSpectrum.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], loudness = loudness.asInstanceOf[js.Any], mfcc = mfcc.asInstanceOf[js.Any], perceptualSharpness = perceptualSharpness.asInstanceOf[js.Any], perceptualSpread = perceptualSpread.asInstanceOf[js.Any], powerSpectrum = powerSpectrum.asInstanceOf[js.Any], rms = rms.asInstanceOf[js.Any], spectralCentroid = spectralCentroid.asInstanceOf[js.Any], spectralFlatness = spectralFlatness.asInstanceOf[js.Any], spectralKurtosis = spectralKurtosis.asInstanceOf[js.Any], spectralRolloff = spectralRolloff.asInstanceOf[js.Any], spectralSkewness = spectralSkewness.asInstanceOf[js.Any], spectralSlope = spectralSlope.asInstanceOf[js.Any], spectralSpread = spectralSpread.asInstanceOf[js.Any], zcr = zcr.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeydaFeaturesObject]
    }
    
    extension [Self <: MeydaFeaturesObject](x: Self) {
      
      inline def setAmplitudeSpectrum(value: js.typedarray.Float32Array): Self = StObject.set(x, "amplitudeSpectrum", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: js.Array[Double]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferVarargs(value: Double*): Self = StObject.set(x, "buffer", js.Array(value*))
      
      inline def setChroma(value: js.Array[Double]): Self = StObject.set(x, "chroma", value.asInstanceOf[js.Any])
      
      inline def setChromaVarargs(value: Double*): Self = StObject.set(x, "chroma", js.Array(value*))
      
      inline def setComplexSpectrum(value: Imag): Self = StObject.set(x, "complexSpectrum", value.asInstanceOf[js.Any])
      
      inline def setEnergy(value: Double): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
      
      inline def setLoudness(value: Specific): Self = StObject.set(x, "loudness", value.asInstanceOf[js.Any])
      
      inline def setMfcc(value: js.Array[Double]): Self = StObject.set(x, "mfcc", value.asInstanceOf[js.Any])
      
      inline def setMfccVarargs(value: Double*): Self = StObject.set(x, "mfcc", js.Array(value*))
      
      inline def setPerceptualSharpness(value: Double): Self = StObject.set(x, "perceptualSharpness", value.asInstanceOf[js.Any])
      
      inline def setPerceptualSpread(value: Double): Self = StObject.set(x, "perceptualSpread", value.asInstanceOf[js.Any])
      
      inline def setPowerSpectrum(value: js.typedarray.Float32Array): Self = StObject.set(x, "powerSpectrum", value.asInstanceOf[js.Any])
      
      inline def setRms(value: Double): Self = StObject.set(x, "rms", value.asInstanceOf[js.Any])
      
      inline def setSpectralCentroid(value: Double): Self = StObject.set(x, "spectralCentroid", value.asInstanceOf[js.Any])
      
      inline def setSpectralFlatness(value: Double): Self = StObject.set(x, "spectralFlatness", value.asInstanceOf[js.Any])
      
      inline def setSpectralKurtosis(value: Double): Self = StObject.set(x, "spectralKurtosis", value.asInstanceOf[js.Any])
      
      inline def setSpectralRolloff(value: Double): Self = StObject.set(x, "spectralRolloff", value.asInstanceOf[js.Any])
      
      inline def setSpectralSkewness(value: Double): Self = StObject.set(x, "spectralSkewness", value.asInstanceOf[js.Any])
      
      inline def setSpectralSlope(value: Double): Self = StObject.set(x, "spectralSlope", value.asInstanceOf[js.Any])
      
      inline def setSpectralSpread(value: Double): Self = StObject.set(x, "spectralSpread", value.asInstanceOf[js.Any])
      
      inline def setZcr(value: Double): Self = StObject.set(x, "zcr", value.asInstanceOf[js.Any])
    }
  }
  
  type MeydaSignal = SliceableArrayLike[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.meyda.meydaStrings.blackman
    - typingsJapgolly.meyda.meydaStrings.sine
    - typingsJapgolly.meyda.meydaStrings.hanning
    - typingsJapgolly.meyda.meydaStrings.hamming
  */
  trait MeydaWindowingFunction extends StObject
  object MeydaWindowingFunction {
    
    inline def blackman: typingsJapgolly.meyda.meydaStrings.blackman = "blackman".asInstanceOf[typingsJapgolly.meyda.meydaStrings.blackman]
    
    inline def hamming: typingsJapgolly.meyda.meydaStrings.hamming = "hamming".asInstanceOf[typingsJapgolly.meyda.meydaStrings.hamming]
    
    inline def hanning: typingsJapgolly.meyda.meydaStrings.hanning = "hanning".asInstanceOf[typingsJapgolly.meyda.meydaStrings.hanning]
    
    inline def sine: typingsJapgolly.meyda.meydaStrings.sine = "sine".asInstanceOf[typingsJapgolly.meyda.meydaStrings.sine]
  }
  
  trait SliceableArrayLike[T]
    extends StObject
       with ArrayLike[T] {
    
    def slice(start: Double, end: Double): SliceableArrayLike[T]
  }
  object SliceableArrayLike {
    
    inline def apply[T](length: Double, slice: (Double, Double) => SliceableArrayLike[T]): SliceableArrayLike[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], slice = js.Any.fromFunction2(slice))
      __obj.asInstanceOf[SliceableArrayLike[T]]
    }
    
    extension [Self <: SliceableArrayLike[?], T](x: Self & SliceableArrayLike[T]) {
      
      inline def setSlice(value: (Double, Double) => SliceableArrayLike[T]): Self = StObject.set(x, "slice", js.Any.fromFunction2(value))
    }
  }
}
