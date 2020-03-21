package typingsJapgolly.sipJs.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "RegistererState")
@js.native
object RegistererState extends js.Object {
  /* "Initial" */ val Initial: typingsJapgolly.sipJs.registererStateMod.RegistererState.Initial with String = js.native
  /* "Registered" */ val Registered: typingsJapgolly.sipJs.registererStateMod.RegistererState.Registered with String = js.native
  /* "Terminated" */ val Terminated: typingsJapgolly.sipJs.registererStateMod.RegistererState.Terminated with String = js.native
  /* "Unregistered" */ val Unregistered: typingsJapgolly.sipJs.registererStateMod.RegistererState.Unregistered with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.registererStateMod.RegistererState with String] = js.native
}

