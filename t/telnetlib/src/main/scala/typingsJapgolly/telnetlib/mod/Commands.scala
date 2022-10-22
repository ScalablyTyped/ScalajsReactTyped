package typingsJapgolly.telnetlib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Commands extends StObject
@JSImport("telnetlib", "Commands")
@js.native
object Commands extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Commands & Double] = js.native
  
  @js.native
  sealed trait AO
    extends StObject
       with Commands
  /* 245 */ val AO: typingsJapgolly.telnetlib.mod.Commands.AO & Double = js.native
  
  @js.native
  sealed trait AYT
    extends StObject
       with Commands
  /* 246 */ val AYT: typingsJapgolly.telnetlib.mod.Commands.AYT & Double = js.native
  
  @js.native
  sealed trait BRK
    extends StObject
       with Commands
  /* 243 */ val BRK: typingsJapgolly.telnetlib.mod.Commands.BRK & Double = js.native
  
  @js.native
  sealed trait DM
    extends StObject
       with Commands
  /* 242 */ val DM: typingsJapgolly.telnetlib.mod.Commands.DM & Double = js.native
  
  @js.native
  sealed trait DO
    extends StObject
       with Commands
  /* 253 */ val DO: typingsJapgolly.telnetlib.mod.Commands.DO & Double = js.native
  
  @js.native
  sealed trait DONT
    extends StObject
       with Commands
  /* 254 */ val DONT: typingsJapgolly.telnetlib.mod.Commands.DONT & Double = js.native
  
  @js.native
  sealed trait EC
    extends StObject
       with Commands
  /* 247 */ val EC: typingsJapgolly.telnetlib.mod.Commands.EC & Double = js.native
  
  @js.native
  sealed trait EL
    extends StObject
       with Commands
  /* 248 */ val EL: typingsJapgolly.telnetlib.mod.Commands.EL & Double = js.native
  
  @js.native
  sealed trait EOR
    extends StObject
       with Commands
  /* 239 */ val EOR: typingsJapgolly.telnetlib.mod.Commands.EOR & Double = js.native
  
  @js.native
  sealed trait GA
    extends StObject
       with Commands
  /* 249 */ val GA: typingsJapgolly.telnetlib.mod.Commands.GA & Double = js.native
  
  @js.native
  sealed trait IAC
    extends StObject
       with Commands
  /* 255 */ val IAC: typingsJapgolly.telnetlib.mod.Commands.IAC & Double = js.native
  
  @js.native
  sealed trait IP
    extends StObject
       with Commands
  /* 244 */ val IP: typingsJapgolly.telnetlib.mod.Commands.IP & Double = js.native
  
  @js.native
  sealed trait NOP
    extends StObject
       with Commands
  /* 241 */ val NOP: typingsJapgolly.telnetlib.mod.Commands.NOP & Double = js.native
  
  @js.native
  sealed trait SB
    extends StObject
       with Commands
  /* 250 */ val SB: typingsJapgolly.telnetlib.mod.Commands.SB & Double = js.native
  
  @js.native
  sealed trait SE
    extends StObject
       with Commands
  /* 240 */ val SE: typingsJapgolly.telnetlib.mod.Commands.SE & Double = js.native
  
  @js.native
  sealed trait WILL
    extends StObject
       with Commands
  /* 251 */ val WILL: typingsJapgolly.telnetlib.mod.Commands.WILL & Double = js.native
  
  @js.native
  sealed trait WONT
    extends StObject
       with Commands
  /* 252 */ val WONT: typingsJapgolly.telnetlib.mod.Commands.WONT & Double = js.native
}
