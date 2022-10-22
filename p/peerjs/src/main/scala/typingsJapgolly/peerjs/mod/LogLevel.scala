package typingsJapgolly.peerjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends StObject
@JSImport("peerjs", "LogLevel")
@js.native
object LogLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with LogLevel
  /* 3 */ val All: typingsJapgolly.peerjs.mod.LogLevel.All & Double = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with LogLevel
  /* 0 */ val Disabled: typingsJapgolly.peerjs.mod.LogLevel.Disabled & Double = js.native
  
  @js.native
  sealed trait Errors
    extends StObject
       with LogLevel
  /* 1 */ val Errors: typingsJapgolly.peerjs.mod.LogLevel.Errors & Double = js.native
  
  @js.native
  sealed trait Warnings
    extends StObject
       with LogLevel
  /* 2 */ val Warnings: typingsJapgolly.peerjs.mod.LogLevel.Warnings & Double = js.native
}
