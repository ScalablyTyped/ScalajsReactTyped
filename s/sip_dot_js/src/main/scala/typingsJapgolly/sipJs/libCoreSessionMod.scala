package typingsJapgolly.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreSessionMod {
  
  @JSImport("sip.js/lib/core/session", "SessionState")
  @js.native
  object SessionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.libCoreSessionSessionMod.SessionState & String] = js.native
    
    /* "AckWait" */ val AckWait: typingsJapgolly.sipJs.libCoreSessionSessionMod.SessionState.AckWait & String = js.native
    
    /* "Confirmed" */ val Confirmed: typingsJapgolly.sipJs.libCoreSessionSessionMod.SessionState.Confirmed & String = js.native
    
    /* "Early" */ val Early: typingsJapgolly.sipJs.libCoreSessionSessionMod.SessionState.Early & String = js.native
    
    /* "Initial" */ val Initial: typingsJapgolly.sipJs.libCoreSessionSessionMod.SessionState.Initial & String = js.native
    
    /* "Terminated" */ val Terminated: typingsJapgolly.sipJs.libCoreSessionSessionMod.SessionState.Terminated & String = js.native
  }
  
  @JSImport("sip.js/lib/core/session", "SignalingState")
  @js.native
  object SignalingState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState & String] = js.native
    
    /* "Closed" */ val Closed: typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState.Closed & String = js.native
    
    /* "HaveLocalOffer" */ val HaveLocalOffer: typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState.HaveLocalOffer & String = js.native
    
    /* "HaveRemoteOffer" */ val HaveRemoteOffer: typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState.HaveRemoteOffer & String = js.native
    
    /* "Initial" */ val Initial: typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState.Initial & String = js.native
    
    /* "Stable" */ val Stable: typingsJapgolly.sipJs.libCoreSessionSessionMod.SignalingState.Stable & String = js.native
  }
}
