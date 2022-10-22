package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EMouseMode extends StObject
@JSImport("steam-user", "EMouseMode")
@js.native
object EMouseMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMouseMode & Double] = js.native
  
  @js.native
  sealed trait AbsoluteCursor
    extends StObject
       with EMouseMode
  /* 2 */ val AbsoluteCursor: typingsJapgolly.steamUser.mod.EMouseMode.AbsoluteCursor & Double = js.native
  
  @js.native
  sealed trait Relative
    extends StObject
       with EMouseMode
  /* 4 */ val Relative: typingsJapgolly.steamUser.mod.EMouseMode.Relative & Double = js.native
  
  @js.native
  sealed trait RelativeCursor
    extends StObject
       with EMouseMode
  /* 1 */ val RelativeCursor: typingsJapgolly.steamUser.mod.EMouseMode.RelativeCursor & Double = js.native
  
  @js.native
  sealed trait Touch
    extends StObject
       with EMouseMode
  /* 3 */ val Touch: typingsJapgolly.steamUser.mod.EMouseMode.Touch & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with EMouseMode
  /* 0 */ val Unknown: typingsJapgolly.steamUser.mod.EMouseMode.Unknown & Double = js.native
}
