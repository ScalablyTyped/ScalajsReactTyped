package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamFramerateLimiter extends StObject
@JSImport("steam-user", "EStreamFramerateLimiter")
@js.native
object EStreamFramerateLimiter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamFramerateLimiter & Double] = js.native
  
  @js.native
  sealed trait SlowCapture
    extends StObject
       with EStreamFramerateLimiter
  /* 1 */ val SlowCapture: typingsJapgolly.steamUser.mod.EStreamFramerateLimiter.SlowCapture & Double = js.native
  
  @js.native
  sealed trait SlowConvert
    extends StObject
       with EStreamFramerateLimiter
  /* 2 */ val SlowConvert: typingsJapgolly.steamUser.mod.EStreamFramerateLimiter.SlowConvert & Double = js.native
  
  @js.native
  sealed trait SlowDecode
    extends StObject
       with EStreamFramerateLimiter
  /* 16 */ val SlowDecode: typingsJapgolly.steamUser.mod.EStreamFramerateLimiter.SlowDecode & Double = js.native
  
  @js.native
  sealed trait SlowDisplay
    extends StObject
       with EStreamFramerateLimiter
  /* 64 */ val SlowDisplay: typingsJapgolly.steamUser.mod.EStreamFramerateLimiter.SlowDisplay & Double = js.native
  
  @js.native
  sealed trait SlowEncode
    extends StObject
       with EStreamFramerateLimiter
  /* 4 */ val SlowEncode: typingsJapgolly.steamUser.mod.EStreamFramerateLimiter.SlowEncode & Double = js.native
  
  @js.native
  sealed trait SlowGame
    extends StObject
       with EStreamFramerateLimiter
  /* 32 */ val SlowGame: typingsJapgolly.steamUser.mod.EStreamFramerateLimiter.SlowGame & Double = js.native
  
  @js.native
  sealed trait SlowNetwork
    extends StObject
       with EStreamFramerateLimiter
  /* 8 */ val SlowNetwork: typingsJapgolly.steamUser.mod.EStreamFramerateLimiter.SlowNetwork & Double = js.native
}
