package typingsJapgolly.steamid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Instance extends StObject
// Instance constants
@JSImport("steamid", "Instance")
@js.native
object Instance extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Instance & Double] = js.native
  
  @js.native
  sealed trait ALL
    extends StObject
       with Instance
  /* 0 */ val ALL: typingsJapgolly.steamid.mod.Instance.ALL & Double = js.native
  
  @js.native
  sealed trait CONSOLE
    extends StObject
       with Instance
  /* 2 */ val CONSOLE: typingsJapgolly.steamid.mod.Instance.CONSOLE & Double = js.native
  
  @js.native
  sealed trait DESKTOP
    extends StObject
       with Instance
  /* 1 */ val DESKTOP: typingsJapgolly.steamid.mod.Instance.DESKTOP & Double = js.native
  
  @js.native
  sealed trait WEB
    extends StObject
       with Instance
  /* 4 */ val WEB: typingsJapgolly.steamid.mod.Instance.WEB & Double = js.native
}
