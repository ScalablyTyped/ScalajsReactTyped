package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomType extends StObject
@JSImport("steam-client", "EChatRoomType")
@js.native
object EChatRoomType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomType & Double] = js.native
  
  @js.native
  sealed trait Friend
    extends StObject
       with EChatRoomType
  /* 1 */ val Friend: typingsJapgolly.steamClient.mod.EChatRoomType.Friend & Double = js.native
  
  @js.native
  sealed trait Lobby
    extends StObject
       with EChatRoomType
  /* 3 */ val Lobby: typingsJapgolly.steamClient.mod.EChatRoomType.Lobby & Double = js.native
  
  @js.native
  sealed trait MUC
    extends StObject
       with EChatRoomType
  /* 2 */ val MUC: typingsJapgolly.steamClient.mod.EChatRoomType.MUC & Double = js.native
}
