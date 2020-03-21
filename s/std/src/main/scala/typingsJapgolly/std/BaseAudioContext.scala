package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.std.stdStrings.statechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseAudioContext extends EventTarget {
  val audioWorklet: AudioWorklet = js.native
  val currentTime: Double = js.native
  val destination: org.scalajs.dom.raw.AudioDestinationNode = js.native
  val listener: org.scalajs.dom.raw.AudioListener = js.native
  var onstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  val sampleRate: Double = js.native
  val state: AudioContextState = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(`type`: statechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def createAnalyser(): org.scalajs.dom.raw.AnalyserNode = js.native
  def createBiquadFilter(): org.scalajs.dom.raw.BiquadFilterNode = js.native
  def createBuffer(numberOfChannels: Double, length: Double, sampleRate: Double): org.scalajs.dom.raw.AudioBuffer = js.native
  def createBufferSource(): org.scalajs.dom.raw.AudioBufferSourceNode = js.native
  def createChannelMerger(): org.scalajs.dom.raw.ChannelMergerNode = js.native
  def createChannelMerger(numberOfInputs: Double): org.scalajs.dom.raw.ChannelMergerNode = js.native
  def createChannelSplitter(): org.scalajs.dom.raw.ChannelSplitterNode = js.native
  def createChannelSplitter(numberOfOutputs: Double): org.scalajs.dom.raw.ChannelSplitterNode = js.native
  def createConstantSource(): ConstantSourceNode = js.native
  def createConvolver(): org.scalajs.dom.raw.ConvolverNode = js.native
  def createDelay(): org.scalajs.dom.raw.DelayNode = js.native
  def createDelay(maxDelayTime: Double): org.scalajs.dom.raw.DelayNode = js.native
  def createDynamicsCompressor(): org.scalajs.dom.raw.DynamicsCompressorNode = js.native
  def createGain(): org.scalajs.dom.raw.GainNode = js.native
  def createIIRFilter(feedforward: js.Array[Double], feedback: js.Array[Double]): IIRFilterNode = js.native
  def createIIRFilter(feedforward: Iterable[Double], feedback: Iterable[Double]): IIRFilterNode = js.native
  def createOscillator(): org.scalajs.dom.raw.OscillatorNode = js.native
  def createPanner(): org.scalajs.dom.raw.PannerNode = js.native
  def createPeriodicWave(real: js.Array[Double], imag: js.Array[Double]): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: js.Array[Double], constraints: PeriodicWaveConstraints): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: Float32Array): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: js.Array[Double], imag: Float32Array, constraints: PeriodicWaveConstraints): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: Float32Array, imag: js.Array[Double]): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: Float32Array, imag: js.Array[Double], constraints: PeriodicWaveConstraints): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: Float32Array, imag: Float32Array): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: Float32Array, imag: Float32Array, constraints: PeriodicWaveConstraints): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: Iterable[Double], imag: Iterable[Double]): org.scalajs.dom.raw.PeriodicWave = js.native
  def createPeriodicWave(real: Iterable[Double], imag: Iterable[Double], constraints: PeriodicWaveConstraints): org.scalajs.dom.raw.PeriodicWave = js.native
  def createScriptProcessor(): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Double): ScriptProcessorNode = js.native
  def createScriptProcessor(bufferSize: Double, numberOfInputChannels: Double, numberOfOutputChannels: Double): ScriptProcessorNode = js.native
  def createStereoPanner(): org.scalajs.dom.raw.StereoPannerNode = js.native
  def createWaveShaper(): org.scalajs.dom.raw.WaveShaperNode = js.native
  def decodeAudioData(audioData: scala.scalajs.js.typedarray.ArrayBuffer): js.Promise[org.scalajs.dom.raw.AudioBuffer] = js.native
  def decodeAudioData(
    audioData: scala.scalajs.js.typedarray.ArrayBuffer,
    successCallback: Null,
    errorCallback: DecodeErrorCallback
  ): js.Promise[org.scalajs.dom.raw.AudioBuffer] = js.native
  def decodeAudioData(audioData: scala.scalajs.js.typedarray.ArrayBuffer, successCallback: DecodeSuccessCallback): js.Promise[org.scalajs.dom.raw.AudioBuffer] = js.native
  def decodeAudioData(
    audioData: scala.scalajs.js.typedarray.ArrayBuffer,
    successCallback: DecodeSuccessCallback,
    errorCallback: DecodeErrorCallback
  ): js.Promise[org.scalajs.dom.raw.AudioBuffer] = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(`type`: statechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
}

@JSGlobal("BaseAudioContext")
@js.native
object BaseAudioContext extends Instantiable0[BaseAudioContext]

