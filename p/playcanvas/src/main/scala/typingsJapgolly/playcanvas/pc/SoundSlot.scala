package typingsJapgolly.playcanvas.pc

import org.scalajs.dom.raw.AudioNode
import typingsJapgolly.playcanvas.AnonAsset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.SoundSlot
  * @augments pc.EventHandler
  * @classdesc The SoundSlot controls playback of an audio asset.
  * @description Create a new SoundSlot.
  * @param {pc.SoundComponent} component - The Component that created this slot.
  * @param {string} name - The name of the slot.
  * @param {object} options - Settings for the slot.
  * @param {number} [options.volume=1] - The playback volume, between 0 and 1.
  * @param {number} [options.pitch=1] - The relative pitch, default of 1, plays at normal pitch.
  * @param {boolean} [options.loop=false] - If true the sound will restart when it reaches the end.
  * @param {number} [options.startTime=0] - The start time from which the sound will start playing.
  * @param {number} [options.duration=null] - The duration of the sound that the slot will play starting from startTime.
  * @param {boolean} [options.overlap=false] - If true then sounds played from slot will be played independently of each other. Otherwise the slot will first stop the current sound before starting the new one.
  * @param {boolean} [options.autoPlay=false] - If true the slot will start playing as soon as its audio asset is loaded.
  * @param {number} [options.asset=null] - The asset id of the audio asset that is going to be played by this slot.
  * @property {string} name The name of the slot.
  * @property {string} asset The asset id.
  * @property {boolean} autoPlay If true the slot will begin playing as soon as it is loaded.
  * @property {number} volume The volume modifier to play the sound with. In range 0-1.
  * @property {number} pitch The pitch modifier to play the sound with. Must be larger than 0.01.
  * @property {number} startTime The start time from which the sound will start playing.
  * @property {number} duration The duration of the sound that the slot will play starting from startTime.
  * @property {boolean} loop If true the slot will restart when it finishes playing.
  * @property {boolean} overlap If true then sounds played from slot will be played independently of each other. Otherwise the slot will first stop the current sound before starting the new one.
  * @property {boolean} isLoaded Returns true if the asset of the slot is loaded.
  * @property {boolean} isPlaying Returns true if the slot is currently playing.
  * @property {boolean} isPaused Returns true if the slot is currently paused.
  * @property {boolean} isStopped Returns true if the slot is currently stopped.
  * @property {pc.SoundInstance[]} instances An array that contains all the {@link pc.SoundInstance}s currently being played by the slot.
  */
@JSGlobal("pc.SoundSlot")
@js.native
class SoundSlot protected () extends EventHandler {
  def this(component: SoundComponent, name: String, options: AnonAsset) = this()
  /**
    * The asset id.
    */
  var asset: String = js.native
  /**
    * If true the slot will begin playing as soon as it is loaded.
    */
  var autoPlay: Boolean = js.native
  /**
    * The duration of the sound that the slot will play starting from startTime.
    */
  var duration: Double = js.native
  /**
    * An array that contains all the {@link pc.SoundInstance}s currently being played by the slot.
    */
  var instances: js.Array[SoundInstance] = js.native
  /**
    * Returns true if the asset of the slot is loaded.
    */
  var isLoaded: Boolean = js.native
  /**
    * Returns true if the slot is currently paused.
    */
  var isPaused: Boolean = js.native
  /**
    * Returns true if the slot is currently playing.
    */
  var isPlaying: Boolean = js.native
  /**
    * Returns true if the slot is currently stopped.
    */
  var isStopped: Boolean = js.native
  /**
    * If true the slot will restart when it finishes playing.
    */
  var loop: Boolean = js.native
  /**
    * The name of the slot.
    */
  var name: String = js.native
  /**
    * If true then sounds played from slot will be played independently of each other. Otherwise the slot will first stop the current sound before starting the new one.
    */
  var overlap: Boolean = js.native
  /**
    * The pitch modifier to play the sound with. Must be larger than 0.01.
    */
  var pitch: Double = js.native
  /**
    * The start time from which the sound will start playing.
    */
  var startTime: Double = js.native
  /**
    * The volume modifier to play the sound with. In range 0-1.
    */
  var volume: Double = js.native
  /**
    * @function
    * @name pc.SoundSlot#clearExternalNodes
    * @description Clears any external nodes set by {@link pc.SoundSlot#setExternalNodes}.
    */
  def clearExternalNodes(): Unit = js.native
  /**
    * @function
    * @name pc.SoundSlot#getExternalNodes
    * @description Gets an array that contains the two external nodes set by {@link pc.SoundSlot#setExternalNodes}.
    * @returns {AudioNode[]} An array of 2 elements that contains the first and last nodes set by {@link pc.SoundSlot#setExternalNodes}.
    */
  def getExternalNodes(): js.Array[AudioNode] = js.native
  /**
    * @function
    * @name pc.SoundSlot#load
    * @description Loads the asset assigned to this slot.
    */
  def load(): Unit = js.native
  /**
    * @function
    * @name pc.SoundSlot#pause
    * @description Pauses all sound instances. To continue playback call {@link pc.SoundSlot#resume}.
    * @returns {boolean} True if the sound instances paused successfully, false otherwise.
    */
  def pause(): Boolean = js.native
  /**
    * @function pc.SoundSlot#play
    * @description Plays a sound. If {@link pc.SoundSlot#overlap} is true the new sound
    * instance will be played independently of any other instances already playing.
    * Otherwise existing sound instances will stop before playing the new sound.
    * @returns {pc.SoundInstance} The new sound instance.
    */
  def play(): SoundInstance = js.native
  /**
    * @function
    * @name pc.SoundSlot#resume
    * @description Resumes playback of all paused sound instances.
    * @returns {boolean} True if any instances were resumed.
    */
  def resume(): Boolean = js.native
  /**
    * @function
    * @name pc.SoundSlot#setExternalNodes
    * @description Connect external Web Audio API nodes. Any sound played by this slot will
    * automatically attach the specified nodes to the source that plays the sound. You need to pass
    * the first node of the node graph that you created externally and the last node of that graph. The first
    * node will be connected to the audio source and the last node will be connected to the destination of the AudioContext (e.g. speakers).
    * @param {AudioNode} firstNode - The first node that will be connected to the audio source of sound instances.
    * @param {AudioNode} [lastNode] - The last node that will be connected to the destination of the AudioContext.
    * If unspecified then the firstNode will be connected to the destination instead.
    * @example
    * var context = app.systems.sound.context;
    * var analyzer = context.createAnalyzer();
    * var distortion = context.createWaveShaper();
    * var filter = context.createBiquadFilter();
    * analyzer.connect(distortion);
    * distortion.connect(filter);
    * slot.setExternalNodes(analyzer, filter);
    */
  def setExternalNodes(firstNode: AudioNode): Unit = js.native
  def setExternalNodes(firstNode: AudioNode, lastNode: AudioNode): Unit = js.native
  /**
    * @function
    * @name pc.SoundSlot#stop
    * @description Stops playback of all sound instances.
    * @returns {boolean} True if any instances were stopped.
    */
  def stop(): Boolean = js.native
}

