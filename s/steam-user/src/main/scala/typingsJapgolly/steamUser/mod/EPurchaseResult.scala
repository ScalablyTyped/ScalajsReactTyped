package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPurchaseResult extends StObject
@JSImport("steam-user", "EPurchaseResult")
@js.native
object EPurchaseResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPurchaseResult & Double] = js.native
  
  @js.native
  sealed trait AlreadyOwned
    extends StObject
       with EPurchaseResult
  /* 9 */ val AlreadyOwned: typingsJapgolly.steamUser.mod.EPurchaseResult.AlreadyOwned & Double = js.native
  
  @js.native
  sealed trait BaseGameRequired
    extends StObject
       with EPurchaseResult
  /* 24 */ val BaseGameRequired: typingsJapgolly.steamUser.mod.EPurchaseResult.BaseGameRequired & Double = js.native
  
  @js.native
  sealed trait DuplicatedKey
    extends StObject
       with EPurchaseResult
  /* 15 */ val DuplicatedKey: typingsJapgolly.steamUser.mod.EPurchaseResult.DuplicatedKey & Double = js.native
  
  @js.native
  sealed trait InvalidKey
    extends StObject
       with EPurchaseResult
  /* 14 */ val InvalidKey: typingsJapgolly.steamUser.mod.EPurchaseResult.InvalidKey & Double = js.native
  
  @js.native
  sealed trait OK
    extends StObject
       with EPurchaseResult
  /* 0 */ val OK: typingsJapgolly.steamUser.mod.EPurchaseResult.OK & Double = js.native
  
  @js.native
  sealed trait OnCooldown
    extends StObject
       with EPurchaseResult
  /* 53 */ val OnCooldown: typingsJapgolly.steamUser.mod.EPurchaseResult.OnCooldown & Double = js.native
  
  @js.native
  sealed trait RegionLockedKey
    extends StObject
       with EPurchaseResult
  /* 13 */ val RegionLockedKey: typingsJapgolly.steamUser.mod.EPurchaseResult.RegionLockedKey & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with EPurchaseResult
  /* -1 */ val Unknown: typingsJapgolly.steamUser.mod.EPurchaseResult.Unknown & Double = js.native
}
