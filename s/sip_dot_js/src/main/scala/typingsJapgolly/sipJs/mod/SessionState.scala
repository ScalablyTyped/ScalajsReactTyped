package typingsJapgolly.sipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "SessionState")
@js.native
object SessionState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.libApiSessionStateMod.SessionState & String] = js.native
  
  /* "Established" */ val Established: typingsJapgolly.sipJs.libApiSessionStateMod.SessionState.Established & String = js.native
  
  /* "Establishing" */ val Establishing: typingsJapgolly.sipJs.libApiSessionStateMod.SessionState.Establishing & String = js.native
  
  /* "Initial" */ val Initial: typingsJapgolly.sipJs.libApiSessionStateMod.SessionState.Initial & String = js.native
  
  /* "Terminated" */ val Terminated: typingsJapgolly.sipJs.libApiSessionStateMod.SessionState.Terminated & String = js.native
  
  /* "Terminating" */ val Terminating: typingsJapgolly.sipJs.libApiSessionStateMod.SessionState.Terminating & String = js.native
}
