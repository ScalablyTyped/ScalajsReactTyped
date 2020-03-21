package typingsJapgolly.sipJs.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "SessionState")
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

