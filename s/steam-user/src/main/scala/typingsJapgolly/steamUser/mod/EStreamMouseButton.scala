package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamMouseButton extends StObject
@JSImport("steam-user", "EStreamMouseButton")
@js.native
object EStreamMouseButton extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamMouseButton & Double] = js.native
  
  @js.native
  sealed trait Left
    extends StObject
       with EStreamMouseButton
  /* 1 */ val Left: typingsJapgolly.steamUser.mod.EStreamMouseButton.Left & Double = js.native
  
  @js.native
  sealed trait Middle
    extends StObject
       with EStreamMouseButton
  /* 16 */ val Middle: typingsJapgolly.steamUser.mod.EStreamMouseButton.Middle & Double = js.native
  
  @js.native
  sealed trait Right
    extends StObject
       with EStreamMouseButton
  /* 2 */ val Right: typingsJapgolly.steamUser.mod.EStreamMouseButton.Right & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with EStreamMouseButton
  /* 4096 */ val Unknown: typingsJapgolly.steamUser.mod.EStreamMouseButton.Unknown & Double = js.native
  
  @js.native
  sealed trait X1
    extends StObject
       with EStreamMouseButton
  /* 32 */ val X1: typingsJapgolly.steamUser.mod.EStreamMouseButton.X1 & Double = js.native
  
  @js.native
  sealed trait X2
    extends StObject
       with EStreamMouseButton
  /* 64 */ val X2: typingsJapgolly.steamUser.mod.EStreamMouseButton.X2 & Double = js.native
}
