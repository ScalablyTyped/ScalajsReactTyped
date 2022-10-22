package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.playable.anon.AutoJoinPolicy
import typingsJapgolly.playable.anon.GetInstance
import typingsJapgolly.playable.anon.GetMediaSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTestkitChomecastApiMockMod {
  
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "CastTestFramework")
  @js.native
  open class CastTestFramework () extends StObject {
    
    def CastContext: GetInstance = js.native
    
    def CastContextEventType: Any = js.native
    
    var RemotePlayer: Instantiable0[typingsJapgolly.playable.distSrcTestkitChomecastApiMockMod.RemotePlayer] = js.native
    
    var RemotePlayerController: Instantiable1[
        /* player */ RemotePlayer, 
        typingsJapgolly.playable.distSrcTestkitChomecastApiMockMod.RemotePlayerController
      ] = js.native
    
    def RemotePlayerEventType: Any = js.native
    
    def SessionState: Any = js.native
    
    /* private */ var _context: Any = js.native
    
    def context: CastContext = js.native
    
    def trigger(`type`: eventType, event: Any): Unit = js.native
  }
  
  @js.native
  sealed trait RemotePlayerEventType extends StObject
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "RemotePlayerEventType")
  @js.native
  object RemotePlayerEventType extends StObject {
    
    @js.native
    sealed trait ANY_CHANGE
      extends StObject
         with RemotePlayerEventType
    
    @js.native
    sealed trait IS_PAUSED_CHANGED
      extends StObject
         with RemotePlayerEventType
  }
  
  @js.native
  sealed trait SessionState extends StObject
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "SessionState")
  @js.native
  object SessionState extends StObject {
    
    @js.native
    sealed trait NO_SESSION
      extends StObject
         with SessionState
    
    @js.native
    sealed trait SESSION_ENDED
      extends StObject
         with SessionState
    
    @js.native
    sealed trait SESSION_ENDING
      extends StObject
         with SessionState
    
    @js.native
    sealed trait SESSION_RESUMED
      extends StObject
         with SessionState
    
    @js.native
    sealed trait SESSION_STARTED
      extends StObject
         with SessionState
    
    @js.native
    sealed trait SESSION_STARTING
      extends StObject
         with SessionState
    
    @js.native
    sealed trait SESSION_START_FAILED
      extends StObject
         with SessionState
  }
  
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "WindowChromeAPIMock")
  @js.native
  open class WindowChromeAPIMock () extends StObject {
    
    def cast: AutoJoinPolicy = js.native
  }
  
  @js.native
  sealed trait eventType extends StObject
  @JSImport("playable/dist/src/testkit/chomecast-api-mock", "eventType")
  @js.native
  object eventType extends StObject {
    
    @js.native
    sealed trait CAST_STATE_CHANGED
      extends StObject
         with eventType
    
    @js.native
    sealed trait SESSION_STATE_CHANGED
      extends StObject
         with eventType
  }
  
  @js.native
  trait CastContext
    extends StObject
       with Publisher {
    
    var _estimatedTime: Double = js.native
    
    def getCurrentSession(): GetMediaSession = js.native
    
    def list: StringDictionary[js.Array[js.Function]] = js.native
    
    def setOptions(): Unit = js.native
  }
  
  trait Publisher extends StObject {
    
    /* protected */ var _listeners: StringDictionary[js.Array[js.Function]]
    
    def addEventListener(`type`: eventType, func: js.Function): Unit
    
    def trigger(`type`: eventType, event: Any): Unit
  }
  object Publisher {
    
    inline def apply(
      _listeners: StringDictionary[js.Array[js.Function]],
      addEventListener: (eventType, js.Function) => Callback,
      trigger: (eventType, Any) => Callback
    ): Publisher = {
      val __obj = js.Dynamic.literal(_listeners = _listeners.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2((t0: eventType, t1: js.Function) => (addEventListener(t0, t1)).runNow()), trigger = js.Any.fromFunction2((t0: eventType, t1: Any) => (trigger(t0, t1)).runNow()))
      __obj.asInstanceOf[Publisher]
    }
    
    extension [Self <: Publisher](x: Self) {
      
      inline def setAddEventListener(value: (eventType, js.Function) => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: eventType, t1: js.Function) => (value(t0, t1)).runNow()))
      
      inline def setTrigger(value: (eventType, Any) => Callback): Self = StObject.set(x, "trigger", js.Any.fromFunction2((t0: eventType, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def set_listeners(value: StringDictionary[js.Array[js.Function]]): Self = StObject.set(x, "_listeners", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemotePlayer extends StObject {
    
    var currentTime: Double
  }
  object RemotePlayer {
    
    inline def apply(currentTime: Double): RemotePlayer = {
      val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemotePlayer]
    }
    
    extension [Self <: RemotePlayer](x: Self) {
      
      inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemotePlayerController
    extends StObject
       with Publisher {
    
    var player: RemotePlayer
    
    def seek(): Unit
    
    def setVolumeLevel(): Unit
  }
  object RemotePlayerController {
    
    inline def apply(
      _listeners: StringDictionary[js.Array[js.Function]],
      addEventListener: (eventType, js.Function) => Callback,
      player: RemotePlayer,
      seek: Callback,
      setVolumeLevel: Callback,
      trigger: (eventType, Any) => Callback
    ): RemotePlayerController = {
      val __obj = js.Dynamic.literal(_listeners = _listeners.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2((t0: eventType, t1: js.Function) => (addEventListener(t0, t1)).runNow()), player = player.asInstanceOf[js.Any], seek = seek.toJsFn, setVolumeLevel = setVolumeLevel.toJsFn, trigger = js.Any.fromFunction2((t0: eventType, t1: Any) => (trigger(t0, t1)).runNow()))
      __obj.asInstanceOf[RemotePlayerController]
    }
    
    extension [Self <: RemotePlayerController](x: Self) {
      
      inline def setPlayer(value: RemotePlayer): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
      
      inline def setSeek(value: Callback): Self = StObject.set(x, "seek", value.toJsFn)
      
      inline def setSetVolumeLevel(value: Callback): Self = StObject.set(x, "setVolumeLevel", value.toJsFn)
    }
  }
  
  trait WindowCastAPIMock extends StObject {
    
    var framework: CastTestFramework
  }
  object WindowCastAPIMock {
    
    inline def apply(framework: CastTestFramework): WindowCastAPIMock = {
      val __obj = js.Dynamic.literal(framework = framework.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowCastAPIMock]
    }
    
    extension [Self <: WindowCastAPIMock](x: Self) {
      
      inline def setFramework(value: CastTestFramework): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    }
  }
}
