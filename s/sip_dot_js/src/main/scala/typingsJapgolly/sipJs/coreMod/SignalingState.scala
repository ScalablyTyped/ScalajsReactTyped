package typingsJapgolly.sipJs.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "SignalingState")
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

