package typingsJapgolly.sipJs.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "SessionState")
@js.native
object SessionState extends js.Object {
  /* "Established" */ val Established: typingsJapgolly.sipJs.sessionStateMod.SessionState.Established with String = js.native
  /* "Establishing" */ val Establishing: typingsJapgolly.sipJs.sessionStateMod.SessionState.Establishing with String = js.native
  /* "Initial" */ val Initial: typingsJapgolly.sipJs.sessionStateMod.SessionState.Initial with String = js.native
  /* "Terminated" */ val Terminated: typingsJapgolly.sipJs.sessionStateMod.SessionState.Terminated with String = js.native
  /* "Terminating" */ val Terminating: typingsJapgolly.sipJs.sessionStateMod.SessionState.Terminating with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.sessionStateMod.SessionState with String] = js.native
}

