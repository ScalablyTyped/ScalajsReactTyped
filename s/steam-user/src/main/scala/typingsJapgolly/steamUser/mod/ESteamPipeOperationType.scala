package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ESteamPipeOperationType extends StObject
@JSImport("steam-user", "ESteamPipeOperationType")
@js.native
object ESteamPipeOperationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ESteamPipeOperationType & Double] = js.native
  
  @js.native
  sealed trait DecryptCPU
    extends StObject
       with ESteamPipeOperationType
  /* 1 */ val DecryptCPU: typingsJapgolly.steamUser.mod.ESteamPipeOperationType.DecryptCPU & Double = js.native
  
  @js.native
  sealed trait DiskRead
    extends StObject
       with ESteamPipeOperationType
  /* 2 */ val DiskRead: typingsJapgolly.steamUser.mod.ESteamPipeOperationType.DiskRead & Double = js.native
  
  @js.native
  sealed trait DiskWrite
    extends StObject
       with ESteamPipeOperationType
  /* 3 */ val DiskWrite: typingsJapgolly.steamUser.mod.ESteamPipeOperationType.DiskWrite & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with ESteamPipeOperationType
  /* 0 */ val Invalid: typingsJapgolly.steamUser.mod.ESteamPipeOperationType.Invalid & Double = js.native
}
