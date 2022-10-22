package typingsJapgolly.playable

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLVideoElement
import typingsJapgolly.playable.distSrcConstantsEngineStateMod.EngineState
import typingsJapgolly.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesPlaybackEngineOutputNativeStateEngineMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/output/native/state-engine", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with StateEngine {
    def this(eventEmitter: IEventEmitter, video: HTMLVideoElement) = this()
  }
  
  @JSImport("playable/dist/src/modules/playback-engine/output/native/state-engine", "NATIVE_VIDEO_EVENTS_TO_STATE")
  @js.native
  val NATIVE_VIDEO_EVENTS_TO_STATE: js.Array[String] = js.native
  
  @js.native
  trait StateEngine extends StObject {
    
    /* private */ var _bindCallbacks: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _currentState: Any = js.native
    
    /* private */ var _eventEmitter: Any = js.native
    
    /* private */ var _initialTimeStamp: Any = js.native
    
    /* private */ var _isMetadataLoaded: Any = js.native
    
    /* private */ var _processEventFromVideo: Any = js.native
    
    /* private */ var _setInitialTimeStamp: Any = js.native
    
    /* private */ var _setStateTimestamp: Any = js.native
    
    /* private */ var _statesTimestamps: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    /* private */ var _video: Any = js.native
    
    def clearTimestamps(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def isMetadataLoaded: Boolean = js.native
    
    def setState(state: EngineState): Unit = js.native
    
    def state: EngineState = js.native
    
    def stateTimestamps: StringDictionary[Double] = js.native
  }
}
