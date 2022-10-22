package typingsJapgolly.stropheJs.stropheMod.global.Strophe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends StObject
/** Constants: Log Level Constants
  *  Logging level indicators.
  *
  *  LogLevel.DEBUG - Debug output
  *  LogLevel.INFO - Informational output
  *  LogLevel.WARN - Warnings
  *  LogLevel.ERROR - Errors
  *  LogLevel.FATAL - Fatal errors
  */
@JSGlobal("Strophe.LogLevel")
@js.native
object LogLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with LogLevel
  /* 0 */ val DEBUG: typingsJapgolly.stropheJs.stropheMod.global.Strophe.LogLevel.DEBUG & Double = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with LogLevel
  /* 3 */ val ERROR: typingsJapgolly.stropheJs.stropheMod.global.Strophe.LogLevel.ERROR & Double = js.native
  
  @js.native
  sealed trait FATAL
    extends StObject
       with LogLevel
  /* 4 */ val FATAL: typingsJapgolly.stropheJs.stropheMod.global.Strophe.LogLevel.FATAL & Double = js.native
  
  @js.native
  sealed trait INFO
    extends StObject
       with LogLevel
  /* 1 */ val INFO: typingsJapgolly.stropheJs.stropheMod.global.Strophe.LogLevel.INFO & Double = js.native
  
  @js.native
  sealed trait WARN
    extends StObject
       with LogLevel
  /* 2 */ val WARN: typingsJapgolly.stropheJs.stropheMod.global.Strophe.LogLevel.WARN & Double = js.native
}
