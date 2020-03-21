package typingsJapgolly.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/session", JSImport.Namespace)
@js.native
object coreSessionMod extends js.Object {
  @js.native
  object SessionState extends js.Object {
    /* "AckWait" */ val AckWait: typingsJapgolly.sipJs.sessionSessionMod.SessionState.AckWait with String = js.native
    /* "Confirmed" */ val Confirmed: typingsJapgolly.sipJs.sessionSessionMod.SessionState.Confirmed with String = js.native
    /* "Early" */ val Early: typingsJapgolly.sipJs.sessionSessionMod.SessionState.Early with String = js.native
    /* "Initial" */ val Initial: typingsJapgolly.sipJs.sessionSessionMod.SessionState.Initial with String = js.native
    /* "Terminated" */ val Terminated: typingsJapgolly.sipJs.sessionSessionMod.SessionState.Terminated with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.sessionSessionMod.SessionState with String] = js.native
  }
  
  @js.native
  object SignalingState extends js.Object {
    /* "Closed" */ val Closed: typingsJapgolly.sipJs.sessionSessionMod.SignalingState.Closed with String = js.native
    /* "HaveLocalOffer" */ val HaveLocalOffer: typingsJapgolly.sipJs.sessionSessionMod.SignalingState.HaveLocalOffer with String = js.native
    /* "HaveRemoteOffer" */ val HaveRemoteOffer: typingsJapgolly.sipJs.sessionSessionMod.SignalingState.HaveRemoteOffer with String = js.native
    /* "Initial" */ val Initial: typingsJapgolly.sipJs.sessionSessionMod.SignalingState.Initial with String = js.native
    /* "Stable" */ val Stable: typingsJapgolly.sipJs.sessionSessionMod.SignalingState.Stable with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.sessionSessionMod.SignalingState with String] = js.native
  }
  
}

