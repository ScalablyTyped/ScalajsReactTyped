package typingsJapgolly.alexaVoiceService

import typingsJapgolly.alexaVoiceService.mod.AVSParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AVS {
    
    @JSGlobal("AVS")
    @js.native
    open class ^ protected ()
      extends typingsJapgolly.alexaVoiceService.mod.^ {
      def this(params: AVSParams) = this()
    }
    
    @JSGlobal("AVS.EventTypes")
    @js.native
    object EventTypes extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.alexaVoiceService.mod.EventTypes & Double] = js.native
      
      /* 2 */ val ERROR: typingsJapgolly.alexaVoiceService.mod.EventTypes.ERROR & Double = js.native
      
      /* 4 */ val LOG: typingsJapgolly.alexaVoiceService.mod.EventTypes.LOG & Double = js.native
      
      /* 5 */ val LOGIN: typingsJapgolly.alexaVoiceService.mod.EventTypes.LOGIN & Double = js.native
      
      /* 6 */ val LOGOUT: typingsJapgolly.alexaVoiceService.mod.EventTypes.LOGOUT & Double = js.native
      
      /* 1 */ val RECORD_START: typingsJapgolly.alexaVoiceService.mod.EventTypes.RECORD_START & Double = js.native
      
      /* 0 */ val RECORD_STOP: typingsJapgolly.alexaVoiceService.mod.EventTypes.RECORD_STOP & Double = js.native
      
      /* 8 */ val REFRESH_TOKEN_SET: typingsJapgolly.alexaVoiceService.mod.EventTypes.REFRESH_TOKEN_SET & Double = js.native
      
      /* 3 */ val TOKEN_INVALID: typingsJapgolly.alexaVoiceService.mod.EventTypes.TOKEN_INVALID & Double = js.native
      
      /* 7 */ val TOKEN_SET: typingsJapgolly.alexaVoiceService.mod.EventTypes.TOKEN_SET & Double = js.native
    }
    
    @JSGlobal("AVS.Player")
    @js.native
    open class Player ()
      extends typingsJapgolly.alexaVoiceService.mod.Player
    object Player {
      
      @JSGlobal("AVS.Player.EventTypes")
      @js.native
      object EventTypes extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.alexaVoiceService.mod.Player.EventTypes & Double] = js.native
        
        /* 7 */ val DEQUE: typingsJapgolly.alexaVoiceService.mod.Player.EventTypes.DEQUE & Double = js.native
        
        /* 6 */ val ENQUEUE: typingsJapgolly.alexaVoiceService.mod.Player.EventTypes.ENQUEUE & Double = js.native
        
        /* 1 */ val ERROR: typingsJapgolly.alexaVoiceService.mod.Player.EventTypes.ERROR & Double = js.native
        
        /* 0 */ val LOG: typingsJapgolly.alexaVoiceService.mod.Player.EventTypes.LOG & Double = js.native
        
        /* 4 */ val PAUSE: typingsJapgolly.alexaVoiceService.mod.Player.EventTypes.PAUSE & Double = js.native
        
        /* 2 */ val PLAY: typingsJapgolly.alexaVoiceService.mod.Player.EventTypes.PLAY & Double = js.native
        
        /* 3 */ val REPLAY: typingsJapgolly.alexaVoiceService.mod.Player.EventTypes.REPLAY & Double = js.native
        
        /* 5 */ val STOP: typingsJapgolly.alexaVoiceService.mod.Player.EventTypes.STOP & Double = js.native
      }
    }
  }
}
