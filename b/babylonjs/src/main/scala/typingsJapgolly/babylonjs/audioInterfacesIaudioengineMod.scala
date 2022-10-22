package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.AudioContext
import org.scalajs.dom.GainNode
import typingsJapgolly.babylonjs.audioAnalyserMod.Analyser
import typingsJapgolly.babylonjs.miscObservableMod.Observable
import typingsJapgolly.babylonjs.sceneMod.IDisposable
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioInterfacesIaudioengineMod {
  
  trait IAudioEngine
    extends StObject
       with IDisposable {
    
    /**
      * Defines if Babylon should emit a warning if WebAudio is not supported.
      * @ignoreNaming
      */
    var WarnedWebAudioUnsupported: Boolean
    
    /**
      * Gets the current AudioContext if available.
      */
    val audioContext: Nullable[AudioContext]
    
    /**
      * Gets whether the current host supports Web Audio and thus could create AudioContexts.
      */
    val canUseWebAudio: Boolean
    
    /**
      * Connect the audio engine to an audio analyser allowing some amazing
      * synchronization between the sounds/music and your visualization (VuMeter for instance).
      * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#using-the-analyser
      * @param analyser The analyser to connect to the engine
      */
    def connectToAnalyser(analyser: Analyser): Unit
    
    /**
      * Gets the global volume sets on the master gain.
      * @returns the global volume if set or -1 otherwise
      */
    def getGlobalVolume(): Double
    
    /**
      * Gets whether or not mp3 are supported by your browser.
      */
    val isMP3supported: Boolean
    
    /**
      * Gets whether or not ogg are supported by your browser.
      */
    val isOGGsupported: Boolean
    
    /**
      * Flags the audio engine in Locked state.
      * This happens due to new browser policies preventing audio to autoplay.
      */
    def lock(): Unit
    
    /**
      * The master gain node defines the global audio volume of your audio engine.
      */
    val masterGain: GainNode
    
    /**
      * Event raised when audio has been locked on the browser.
      */
    var onAudioLockedObservable: Observable[IAudioEngine]
    
    /**
      * Event raised when audio has been unlocked on the browser.
      */
    var onAudioUnlockedObservable: Observable[IAudioEngine]
    
    /**
      * Sets the global volume of your experience (sets on the master gain).
      * @param newVolume Defines the new global volume of the application
      */
    def setGlobalVolume(newVolume: Double): Unit
    
    /**
      * Unlocks the audio engine once a user action has been done on the dom.
      * This is helpful to resume play once browser policies have been satisfied.
      */
    def unlock(): Unit
    
    /**
      * Gets whether or not the audio engine is unlocked (require first a user gesture on some browser).
      */
    val unlocked: Boolean
    
    /**
      * Defines if the audio engine relies on a custom unlocked button.
      * In this case, the embedded button will not be displayed.
      */
    var useCustomUnlockedButton: Boolean
  }
  object IAudioEngine {
    
    inline def apply(
      WarnedWebAudioUnsupported: Boolean,
      canUseWebAudio: Boolean,
      connectToAnalyser: Analyser => Callback,
      dispose: Callback,
      getGlobalVolume: CallbackTo[Double],
      isMP3supported: Boolean,
      isOGGsupported: Boolean,
      lock: Callback,
      masterGain: GainNode,
      onAudioLockedObservable: Observable[IAudioEngine],
      onAudioUnlockedObservable: Observable[IAudioEngine],
      setGlobalVolume: Double => Callback,
      unlock: Callback,
      unlocked: Boolean,
      useCustomUnlockedButton: Boolean
    ): IAudioEngine = {
      val __obj = js.Dynamic.literal(WarnedWebAudioUnsupported = WarnedWebAudioUnsupported.asInstanceOf[js.Any], canUseWebAudio = canUseWebAudio.asInstanceOf[js.Any], connectToAnalyser = js.Any.fromFunction1((t0: Analyser) => connectToAnalyser(t0).runNow()), dispose = dispose.toJsFn, getGlobalVolume = getGlobalVolume.toJsFn, isMP3supported = isMP3supported.asInstanceOf[js.Any], isOGGsupported = isOGGsupported.asInstanceOf[js.Any], lock = lock.toJsFn, masterGain = masterGain.asInstanceOf[js.Any], onAudioLockedObservable = onAudioLockedObservable.asInstanceOf[js.Any], onAudioUnlockedObservable = onAudioUnlockedObservable.asInstanceOf[js.Any], setGlobalVolume = js.Any.fromFunction1((t0: Double) => setGlobalVolume(t0).runNow()), unlock = unlock.toJsFn, unlocked = unlocked.asInstanceOf[js.Any], useCustomUnlockedButton = useCustomUnlockedButton.asInstanceOf[js.Any], audioContext = null)
      __obj.asInstanceOf[IAudioEngine]
    }
    
    extension [Self <: IAudioEngine](x: Self) {
      
      inline def setAudioContext(value: Nullable[AudioContext]): Self = StObject.set(x, "audioContext", value.asInstanceOf[js.Any])
      
      inline def setAudioContextNull: Self = StObject.set(x, "audioContext", null)
      
      inline def setCanUseWebAudio(value: Boolean): Self = StObject.set(x, "canUseWebAudio", value.asInstanceOf[js.Any])
      
      inline def setConnectToAnalyser(value: Analyser => Callback): Self = StObject.set(x, "connectToAnalyser", js.Any.fromFunction1((t0: Analyser) => value(t0).runNow()))
      
      inline def setGetGlobalVolume(value: CallbackTo[Double]): Self = StObject.set(x, "getGlobalVolume", value.toJsFn)
      
      inline def setIsMP3supported(value: Boolean): Self = StObject.set(x, "isMP3supported", value.asInstanceOf[js.Any])
      
      inline def setIsOGGsupported(value: Boolean): Self = StObject.set(x, "isOGGsupported", value.asInstanceOf[js.Any])
      
      inline def setLock(value: Callback): Self = StObject.set(x, "lock", value.toJsFn)
      
      inline def setMasterGain(value: GainNode): Self = StObject.set(x, "masterGain", value.asInstanceOf[js.Any])
      
      inline def setOnAudioLockedObservable(value: Observable[IAudioEngine]): Self = StObject.set(x, "onAudioLockedObservable", value.asInstanceOf[js.Any])
      
      inline def setOnAudioUnlockedObservable(value: Observable[IAudioEngine]): Self = StObject.set(x, "onAudioUnlockedObservable", value.asInstanceOf[js.Any])
      
      inline def setSetGlobalVolume(value: Double => Callback): Self = StObject.set(x, "setGlobalVolume", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setUnlock(value: Callback): Self = StObject.set(x, "unlock", value.toJsFn)
      
      inline def setUnlocked(value: Boolean): Self = StObject.set(x, "unlocked", value.asInstanceOf[js.Any])
      
      inline def setUseCustomUnlockedButton(value: Boolean): Self = StObject.set(x, "useCustomUnlockedButton", value.asInstanceOf[js.Any])
      
      inline def setWarnedWebAudioUnsupported(value: Boolean): Self = StObject.set(x, "WarnedWebAudioUnsupported", value.asInstanceOf[js.Any])
    }
  }
}
