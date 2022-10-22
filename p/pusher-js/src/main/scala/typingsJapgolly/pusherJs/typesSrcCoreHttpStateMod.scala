package typingsJapgolly.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreHttpStateMod {
  
  @JSImport("pusher-js/types/src/core/http/state", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State & Double] = js.native
    
    /* 3 */ val CLOSED: typingsJapgolly.pusherJs.typesSrcCoreHttpStateMod.State.CLOSED & Double = js.native
    
    /* 0 */ val CONNECTING: typingsJapgolly.pusherJs.typesSrcCoreHttpStateMod.State.CONNECTING & Double = js.native
    
    /* 1 */ val OPEN: typingsJapgolly.pusherJs.typesSrcCoreHttpStateMod.State.OPEN & Double = js.native
  }
  
  @js.native
  sealed trait State extends StObject
  @JSImport("pusher-js/types/src/core/http/state", "State")
  @js.native
  object State extends StObject {
    
    @js.native
    sealed trait CLOSED
      extends StObject
         with State
    
    @js.native
    sealed trait CONNECTING
      extends StObject
         with State
    
    @js.native
    sealed trait OPEN
      extends StObject
         with State
  }
}
