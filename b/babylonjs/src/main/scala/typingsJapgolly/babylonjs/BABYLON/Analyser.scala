package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.AudioNode
import typingsJapgolly.babylonjs.anon.Height
import typingsJapgolly.babylonjs.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Analyser extends StObject {
  
  /**
    * Gets or sets the bar graph amplitude
    * @ignorenaming
    */
  var BARGRAPHAMPLITUDE: Double
  
  /**
    * Gets or sets the position of the debug canvas
    * @ignorenaming
    */
  var DEBUGCANVASPOS: X
  
  /**
    * Gets or sets the debug canvas size
    * @ignorenaming
    */
  var DEBUGCANVASSIZE: Height
  
  /**
    * Gets or sets the FFT table size
    * @ignorenaming
    */
  var FFT_SIZE: Double
  
  /**
    * Gets or sets the smoothing
    * @ignorenaming
    */
  var SMOOTHING: Double
  
  /* private */ var _audioEngine: Any
  
  /* private */ var _byteFreqs: Any
  
  /* private */ var _byteTime: Any
  
  /* private */ var _debugCanvas: Any
  
  /* private */ var _debugCanvasContext: Any
  
  /* private */ var _floatFreqs: Any
  
  /* private */ var _registerFunc: Any
  
  /* private */ var _scene: Any
  
  /* private */ var _webAudioAnalyser: Any
  
  /**
    * Connects two audio nodes
    * @param inputAudioNode defines first node to connect
    * @param outputAudioNode defines second node to connect
    */
  def connectAudioNodes(inputAudioNode: AudioNode, outputAudioNode: AudioNode): Unit
  
  /**
    * Releases all associated resources
    */
  def dispose(): Unit
  
  /**
    * Renders the debug canvas
    */
  def drawDebugCanvas(): Unit
  
  /**
    * Gets the current frequency data as a byte array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteFrequencyData
    * @returns a Uint8Array
    */
  def getByteFrequencyData(): js.typedarray.Uint8Array
  
  /**
    * Gets the current waveform as a byte array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteTimeDomainData
    * @returns a Uint8Array
    */
  def getByteTimeDomainData(): js.typedarray.Uint8Array
  
  /**
    * Gets the current frequency data as a float array
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/getByteFrequencyData
    * @returns a Float32Array
    */
  def getFloatFrequencyData(): js.typedarray.Float32Array
  
  /**
    * Get the number of data values you will have to play with for the visualization
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/frequencyBinCount
    * @returns a number
    */
  def getFrequencyBinCount(): Double
  
  /**
    * Stops rendering the debug canvas and removes it
    */
  def stopDebugCanvas(): Unit
}
object Analyser {
  
  inline def apply(
    BARGRAPHAMPLITUDE: Double,
    DEBUGCANVASPOS: X,
    DEBUGCANVASSIZE: Height,
    FFT_SIZE: Double,
    SMOOTHING: Double,
    _audioEngine: Any,
    _byteFreqs: Any,
    _byteTime: Any,
    _debugCanvas: Any,
    _debugCanvasContext: Any,
    _floatFreqs: Any,
    _registerFunc: Any,
    _scene: Any,
    _webAudioAnalyser: Any,
    connectAudioNodes: (AudioNode, AudioNode) => Callback,
    dispose: Callback,
    drawDebugCanvas: Callback,
    getByteFrequencyData: CallbackTo[js.typedarray.Uint8Array],
    getByteTimeDomainData: CallbackTo[js.typedarray.Uint8Array],
    getFloatFrequencyData: CallbackTo[js.typedarray.Float32Array],
    getFrequencyBinCount: CallbackTo[Double],
    stopDebugCanvas: Callback
  ): Analyser = {
    val __obj = js.Dynamic.literal(BARGRAPHAMPLITUDE = BARGRAPHAMPLITUDE.asInstanceOf[js.Any], DEBUGCANVASPOS = DEBUGCANVASPOS.asInstanceOf[js.Any], DEBUGCANVASSIZE = DEBUGCANVASSIZE.asInstanceOf[js.Any], FFT_SIZE = FFT_SIZE.asInstanceOf[js.Any], SMOOTHING = SMOOTHING.asInstanceOf[js.Any], _audioEngine = _audioEngine.asInstanceOf[js.Any], _byteFreqs = _byteFreqs.asInstanceOf[js.Any], _byteTime = _byteTime.asInstanceOf[js.Any], _debugCanvas = _debugCanvas.asInstanceOf[js.Any], _debugCanvasContext = _debugCanvasContext.asInstanceOf[js.Any], _floatFreqs = _floatFreqs.asInstanceOf[js.Any], _registerFunc = _registerFunc.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], _webAudioAnalyser = _webAudioAnalyser.asInstanceOf[js.Any], connectAudioNodes = js.Any.fromFunction2((t0: AudioNode, t1: AudioNode) => (connectAudioNodes(t0, t1)).runNow()), dispose = dispose.toJsFn, drawDebugCanvas = drawDebugCanvas.toJsFn, getByteFrequencyData = getByteFrequencyData.toJsFn, getByteTimeDomainData = getByteTimeDomainData.toJsFn, getFloatFrequencyData = getFloatFrequencyData.toJsFn, getFrequencyBinCount = getFrequencyBinCount.toJsFn, stopDebugCanvas = stopDebugCanvas.toJsFn)
    __obj.asInstanceOf[Analyser]
  }
  
  extension [Self <: Analyser](x: Self) {
    
    inline def setBARGRAPHAMPLITUDE(value: Double): Self = StObject.set(x, "BARGRAPHAMPLITUDE", value.asInstanceOf[js.Any])
    
    inline def setConnectAudioNodes(value: (AudioNode, AudioNode) => Callback): Self = StObject.set(x, "connectAudioNodes", js.Any.fromFunction2((t0: AudioNode, t1: AudioNode) => (value(t0, t1)).runNow()))
    
    inline def setDEBUGCANVASPOS(value: X): Self = StObject.set(x, "DEBUGCANVASPOS", value.asInstanceOf[js.Any])
    
    inline def setDEBUGCANVASSIZE(value: Height): Self = StObject.set(x, "DEBUGCANVASSIZE", value.asInstanceOf[js.Any])
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setDrawDebugCanvas(value: Callback): Self = StObject.set(x, "drawDebugCanvas", value.toJsFn)
    
    inline def setFFT_SIZE(value: Double): Self = StObject.set(x, "FFT_SIZE", value.asInstanceOf[js.Any])
    
    inline def setGetByteFrequencyData(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "getByteFrequencyData", value.toJsFn)
    
    inline def setGetByteTimeDomainData(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "getByteTimeDomainData", value.toJsFn)
    
    inline def setGetFloatFrequencyData(value: CallbackTo[js.typedarray.Float32Array]): Self = StObject.set(x, "getFloatFrequencyData", value.toJsFn)
    
    inline def setGetFrequencyBinCount(value: CallbackTo[Double]): Self = StObject.set(x, "getFrequencyBinCount", value.toJsFn)
    
    inline def setSMOOTHING(value: Double): Self = StObject.set(x, "SMOOTHING", value.asInstanceOf[js.Any])
    
    inline def setStopDebugCanvas(value: Callback): Self = StObject.set(x, "stopDebugCanvas", value.toJsFn)
    
    inline def set_audioEngine(value: Any): Self = StObject.set(x, "_audioEngine", value.asInstanceOf[js.Any])
    
    inline def set_byteFreqs(value: Any): Self = StObject.set(x, "_byteFreqs", value.asInstanceOf[js.Any])
    
    inline def set_byteTime(value: Any): Self = StObject.set(x, "_byteTime", value.asInstanceOf[js.Any])
    
    inline def set_debugCanvas(value: Any): Self = StObject.set(x, "_debugCanvas", value.asInstanceOf[js.Any])
    
    inline def set_debugCanvasContext(value: Any): Self = StObject.set(x, "_debugCanvasContext", value.asInstanceOf[js.Any])
    
    inline def set_floatFreqs(value: Any): Self = StObject.set(x, "_floatFreqs", value.asInstanceOf[js.Any])
    
    inline def set_registerFunc(value: Any): Self = StObject.set(x, "_registerFunc", value.asInstanceOf[js.Any])
    
    inline def set_scene(value: Any): Self = StObject.set(x, "_scene", value.asInstanceOf[js.Any])
    
    inline def set_webAudioAnalyser(value: Any): Self = StObject.set(x, "_webAudioAnalyser", value.asInstanceOf[js.Any])
  }
}
