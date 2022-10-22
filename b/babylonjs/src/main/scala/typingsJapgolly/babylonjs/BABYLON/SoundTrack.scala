package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoundTrack extends StObject {
  
  /* private */ var _connectedAnalyser: Any
  
  /* private */ var _initializeSoundTrackAudioGraph: Any
  
  /* private */ var _isInitialized: Any
  
  /* private */ var _options: Any
  
  /* private */ var _outputAudioNode: Any
  
  /* private */ var _scene: Any
  
  /**
    * Adds a sound to this sound track
    * @param sound define the sound to add
    * @ignoreNaming
    */
  def addSound(sound: Sound): Unit
  
  /**
    * Connect the sound track to an audio analyser allowing some amazing
    * synchronization between the sounds/music and your visualization (VuMeter for instance).
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#using-the-analyser
    * @param analyser The analyser to connect to the engine
    */
  def connectToAnalyser(analyser: Analyser): Unit
  
  /**
    * Release the sound track and its associated resources
    */
  def dispose(): Unit
  
  /**
    * The unique identifier of the sound track in the scene.
    */
  var id: Double
  
  /**
    * Removes a sound to this sound track
    * @param sound define the sound to remove
    * @ignoreNaming
    */
  def removeSound(sound: Sound): Unit
  
  /**
    * Set a global volume for the full sound track.
    * @param newVolume Define the new volume of the sound track
    */
  def setVolume(newVolume: Double): Unit
  
  /**
    * The list of sounds included in the sound track.
    */
  var soundCollection: js.Array[Sound]
  
  /**
    * Switch the panning model to Equal Power:
    * Represents the equal-power panning algorithm, generally regarded as simple and efficient. equalpower is the default value.
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  def switchPanningModelToEqualPower(): Unit
  
  /**
    * Switch the panning model to HRTF:
    * Renders a stereo output of higher quality than equalpower — it uses a convolution with measured impulse responses from human subjects.
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  def switchPanningModelToHRTF(): Unit
}
object SoundTrack {
  
  inline def apply(
    _connectedAnalyser: Any,
    _initializeSoundTrackAudioGraph: Any,
    _isInitialized: Any,
    _options: Any,
    _outputAudioNode: Any,
    _scene: Any,
    addSound: Sound => Callback,
    connectToAnalyser: Analyser => Callback,
    dispose: Callback,
    id: Double,
    removeSound: Sound => Callback,
    setVolume: Double => Callback,
    soundCollection: js.Array[Sound],
    switchPanningModelToEqualPower: Callback,
    switchPanningModelToHRTF: Callback
  ): SoundTrack = {
    val __obj = js.Dynamic.literal(_connectedAnalyser = _connectedAnalyser.asInstanceOf[js.Any], _initializeSoundTrackAudioGraph = _initializeSoundTrackAudioGraph.asInstanceOf[js.Any], _isInitialized = _isInitialized.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _outputAudioNode = _outputAudioNode.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], addSound = js.Any.fromFunction1((t0: Sound) => addSound(t0).runNow()), connectToAnalyser = js.Any.fromFunction1((t0: Analyser) => connectToAnalyser(t0).runNow()), dispose = dispose.toJsFn, id = id.asInstanceOf[js.Any], removeSound = js.Any.fromFunction1((t0: Sound) => removeSound(t0).runNow()), setVolume = js.Any.fromFunction1((t0: Double) => setVolume(t0).runNow()), soundCollection = soundCollection.asInstanceOf[js.Any], switchPanningModelToEqualPower = switchPanningModelToEqualPower.toJsFn, switchPanningModelToHRTF = switchPanningModelToHRTF.toJsFn)
    __obj.asInstanceOf[SoundTrack]
  }
  
  extension [Self <: SoundTrack](x: Self) {
    
    inline def setAddSound(value: Sound => Callback): Self = StObject.set(x, "addSound", js.Any.fromFunction1((t0: Sound) => value(t0).runNow()))
    
    inline def setConnectToAnalyser(value: Analyser => Callback): Self = StObject.set(x, "connectToAnalyser", js.Any.fromFunction1((t0: Analyser) => value(t0).runNow()))
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRemoveSound(value: Sound => Callback): Self = StObject.set(x, "removeSound", js.Any.fromFunction1((t0: Sound) => value(t0).runNow()))
    
    inline def setSetVolume(value: Double => Callback): Self = StObject.set(x, "setVolume", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSoundCollection(value: js.Array[Sound]): Self = StObject.set(x, "soundCollection", value.asInstanceOf[js.Any])
    
    inline def setSoundCollectionVarargs(value: Sound*): Self = StObject.set(x, "soundCollection", js.Array(value*))
    
    inline def setSwitchPanningModelToEqualPower(value: Callback): Self = StObject.set(x, "switchPanningModelToEqualPower", value.toJsFn)
    
    inline def setSwitchPanningModelToHRTF(value: Callback): Self = StObject.set(x, "switchPanningModelToHRTF", value.toJsFn)
    
    inline def set_connectedAnalyser(value: Any): Self = StObject.set(x, "_connectedAnalyser", value.asInstanceOf[js.Any])
    
    inline def set_initializeSoundTrackAudioGraph(value: Any): Self = StObject.set(x, "_initializeSoundTrackAudioGraph", value.asInstanceOf[js.Any])
    
    inline def set_isInitialized(value: Any): Self = StObject.set(x, "_isInitialized", value.asInstanceOf[js.Any])
    
    inline def set_options(value: Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    
    inline def set_outputAudioNode(value: Any): Self = StObject.set(x, "_outputAudioNode", value.asInstanceOf[js.Any])
    
    inline def set_scene(value: Any): Self = StObject.set(x, "_scene", value.asInstanceOf[js.Any])
  }
}
