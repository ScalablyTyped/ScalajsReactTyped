package typingsJapgolly.pollyjsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait ACTIONS extends StObject
  @JSImport("@pollyjs/utils", "ACTIONS")
  @js.native
  object ACTIONS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ACTIONS & String] = js.native
    
    @js.native
    sealed trait INTERCEPT
      extends StObject
         with ACTIONS
    /* "intercept" */ val INTERCEPT: typingsJapgolly.pollyjsUtils.mod.ACTIONS.INTERCEPT & String = js.native
    
    @js.native
    sealed trait PASSTHROUGH
      extends StObject
         with ACTIONS
    /* "passthrough" */ val PASSTHROUGH: typingsJapgolly.pollyjsUtils.mod.ACTIONS.PASSTHROUGH & String = js.native
    
    @js.native
    sealed trait RECORD
      extends StObject
         with ACTIONS
    /* "record" */ val RECORD: typingsJapgolly.pollyjsUtils.mod.ACTIONS.RECORD & String = js.native
    
    @js.native
    sealed trait REPLAY
      extends StObject
         with ACTIONS
    /* "replay" */ val REPLAY: typingsJapgolly.pollyjsUtils.mod.ACTIONS.REPLAY & String = js.native
  }
  
  @js.native
  sealed trait EXPIRY_STRATEGIES extends StObject
  @JSImport("@pollyjs/utils", "EXPIRY_STRATEGIES")
  @js.native
  object EXPIRY_STRATEGIES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EXPIRY_STRATEGIES & String] = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with EXPIRY_STRATEGIES
    /* "error" */ val ERROR: typingsJapgolly.pollyjsUtils.mod.EXPIRY_STRATEGIES.ERROR & String = js.native
    
    @js.native
    sealed trait RECORD
      extends StObject
         with EXPIRY_STRATEGIES
    /* "record" */ val RECORD: typingsJapgolly.pollyjsUtils.mod.EXPIRY_STRATEGIES.RECORD & String = js.native
    
    @js.native
    sealed trait WARN
      extends StObject
         with EXPIRY_STRATEGIES
    /* "warn" */ val WARN: typingsJapgolly.pollyjsUtils.mod.EXPIRY_STRATEGIES.WARN & String = js.native
  }
  
  @js.native
  sealed trait MODES extends StObject
  @JSImport("@pollyjs/utils", "MODES")
  @js.native
  object MODES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MODES & String] = js.native
    
    @js.native
    sealed trait PASSTHROUGH
      extends StObject
         with MODES
    /* "passthrough" */ val PASSTHROUGH: typingsJapgolly.pollyjsUtils.mod.MODES.PASSTHROUGH & String = js.native
    
    @js.native
    sealed trait RECORD
      extends StObject
         with MODES
    /* "record" */ val RECORD: typingsJapgolly.pollyjsUtils.mod.MODES.RECORD & String = js.native
    
    @js.native
    sealed trait REPLAY
      extends StObject
         with MODES
    /* "replay" */ val REPLAY: typingsJapgolly.pollyjsUtils.mod.MODES.REPLAY & String = js.native
    
    @js.native
    sealed trait STOPPED
      extends StObject
         with MODES
    /* "stopped" */ val STOPPED: typingsJapgolly.pollyjsUtils.mod.MODES.STOPPED & String = js.native
  }
}
