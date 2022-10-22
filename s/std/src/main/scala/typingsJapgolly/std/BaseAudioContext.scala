package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.statechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseAudioContext
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** Available only in secure contexts. */
  /* standard dom */
  val audioWorklet: AudioWorklet = js.native
  
  /* standard dom */
  def createAnalyser(): org.scalajs.dom.AnalyserNode = js.native
  
  /* standard dom */
  def createBiquadFilter(): org.scalajs.dom.BiquadFilterNode = js.native
  
  /* standard dom */
  def createBuffer(numberOfChannels: Double, length: Double, sampleRate: Double): org.scalajs.dom.AudioBuffer = js.native
  
  /* standard dom */
  def createBufferSource(): org.scalajs.dom.AudioBufferSourceNode = js.native
  
  /* standard dom */
  def createChannelMerger(): org.scalajs.dom.ChannelMergerNode = js.native
  def createChannelMerger(numberOfInputs: Double): org.scalajs.dom.ChannelMergerNode = js.native
  
  /* standard dom */
  def createChannelSplitter(): org.scalajs.dom.ChannelSplitterNode = js.native
  def createChannelSplitter(numberOfOutputs: Double): org.scalajs.dom.ChannelSplitterNode = js.native
  
  /* standard dom */
  def createConstantSource(): ConstantSourceNode = js.native
  
  /* standard dom */
  def createConvolver(): org.scalajs.dom.ConvolverNode = js.native
  
  /* standard dom */
  def createDelay(): org.scalajs.dom.DelayNode = js.native
  def createDelay(maxDelayTime: Double): org.scalajs.dom.DelayNode = js.native
  
  /* standard dom */
  def createDynamicsCompressor(): org.scalajs.dom.DynamicsCompressorNode = js.native
  
  /* standard dom */
  def createGain(): org.scalajs.dom.GainNode = js.native
  
  /* standard dom */
  def createIIRFilter(feedforward: js.Array[Double], feedback: js.Array[Double]): IIRFilterNode = js.native
  /* standard dom.iterable */
  def createIIRFilter(feedforward: js.Iterable[Double], feedback: js.Iterable[Double]): IIRFilterNode = js.native
  
  /* standard dom */
  def createOscillator(): org.scalajs.dom.OscillatorNode = js.native
  
  /* standard dom */
  def createPanner(): org.scalajs.dom.PannerNode = js.native
  
  /* standard dom */
  def createPeriodicWave(real: js.Array[Double], imag: js.Array[Double]): org.scalajs.dom.PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: js.Array[Double], constraints: PeriodicWaveConstraints): org.scalajs.dom.PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: js.typedarray.Float32Array): org.scalajs.dom.PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: js.typedarray.Float32Array, constraints: PeriodicWaveConstraints): org.scalajs.dom.PeriodicWave = js.native
  /* standard dom.iterable */
  def createPeriodicWave(real: js.Iterable[Double], imag: js.Iterable[Double]): org.scalajs.dom.PeriodicWave = js.native
  def createPeriodicWave(real: js.Iterable[Double], imag: js.Iterable[Double], constraints: PeriodicWaveConstraints): org.scalajs.dom.PeriodicWave = js.native
  def createPeriodicWave(real: js.typedarray.Float32Array, imag: js.Array[Double]): org.scalajs.dom.PeriodicWave = js.native
  def createPeriodicWave(real: js.typedarray.Float32Array, imag: js.Array[Double], constraints: PeriodicWaveConstraints): org.scalajs.dom.PeriodicWave = js.native
  def createPeriodicWave(real: js.typedarray.Float32Array, imag: js.typedarray.Float32Array): org.scalajs.dom.PeriodicWave = js.native
  def createPeriodicWave(
    real: js.typedarray.Float32Array,
    imag: js.typedarray.Float32Array,
    constraints: PeriodicWaveConstraints
  ): org.scalajs.dom.PeriodicWave = js.native
  
  /** @deprecated */
  /* standard dom */
  def createScriptProcessor(): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Double, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Unit, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Unit, numberOfInputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Unit, numberOfInputChannels: Double, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Unit, numberOfInputChannels: Unit, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  
  /* standard dom */
  def createStereoPanner(): org.scalajs.dom.StereoPannerNode = js.native
  
  /* standard dom */
  def createWaveShaper(): org.scalajs.dom.WaveShaperNode = js.native
  
  /* standard dom */
  val currentTime: Double = js.native
  
  /* standard dom */
  def decodeAudioData(audioData: js.typedarray.ArrayBuffer): js.Promise[org.scalajs.dom.AudioBuffer] = js.native
  def decodeAudioData(audioData: js.typedarray.ArrayBuffer, successCallback: Null, errorCallback: DecodeErrorCallback): js.Promise[org.scalajs.dom.AudioBuffer] = js.native
  def decodeAudioData(audioData: js.typedarray.ArrayBuffer, successCallback: Unit, errorCallback: DecodeErrorCallback): js.Promise[org.scalajs.dom.AudioBuffer] = js.native
  def decodeAudioData(audioData: js.typedarray.ArrayBuffer, successCallback: DecodeSuccessCallback): js.Promise[org.scalajs.dom.AudioBuffer] = js.native
  def decodeAudioData(
    audioData: js.typedarray.ArrayBuffer,
    successCallback: DecodeSuccessCallback,
    errorCallback: DecodeErrorCallback
  ): js.Promise[org.scalajs.dom.AudioBuffer] = js.native
  
  /* standard dom */
  val destination: org.scalajs.dom.AudioDestinationNode = js.native
  
  /* standard dom */
  val listener: org.scalajs.dom.AudioListener = js.native
  
  /* standard dom */
  var onstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard dom */
  val sampleRate: Double = js.native
  
  /* standard dom */
  val state: AudioContextState = js.native
}
