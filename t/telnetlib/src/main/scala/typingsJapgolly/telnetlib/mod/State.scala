package typingsJapgolly.telnetlib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait State extends StObject
@JSImport("telnetlib", "State")
@js.native
object State extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[State & String] = js.native
  
  @js.native
  sealed trait DATA
    extends StObject
       with State
  /* "DATA" */ val DATA: typingsJapgolly.telnetlib.mod.State.DATA & String = js.native
  
  @js.native
  sealed trait DO
    extends StObject
       with State
  /* "DO" */ val DO: typingsJapgolly.telnetlib.mod.State.DO & String = js.native
  
  @js.native
  sealed trait DONT
    extends StObject
       with State
  /* "DONT" */ val DONT: typingsJapgolly.telnetlib.mod.State.DONT & String = js.native
  
  @js.native
  sealed trait IAC
    extends StObject
       with State
  /* "IAC" */ val IAC: typingsJapgolly.telnetlib.mod.State.IAC & String = js.native
  
  @js.native
  sealed trait SB
    extends StObject
       with State
  /* "SB" */ val SB: typingsJapgolly.telnetlib.mod.State.SB & String = js.native
  
  @js.native
  sealed trait SBIAC
    extends StObject
       with State
  /* "SBIAC" */ val SBIAC: typingsJapgolly.telnetlib.mod.State.SBIAC & String = js.native
  
  @js.native
  sealed trait WILL
    extends StObject
       with State
  /* "WILL" */ val WILL: typingsJapgolly.telnetlib.mod.State.WILL & String = js.native
  
  @js.native
  sealed trait WONT
    extends StObject
       with State
  /* "WONT" */ val WONT: typingsJapgolly.telnetlib.mod.State.WONT & String = js.native
}
