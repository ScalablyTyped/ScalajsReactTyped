package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomGroupPermissions extends StObject
@JSImport("steam-user", "EChatRoomGroupPermissions")
@js.native
object EChatRoomGroupPermissions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomGroupPermissions & Double] = js.native
  
  @js.native
  sealed trait CanAdminChannel
    extends StObject
       with EChatRoomGroupPermissions
  /* 16 */ val CanAdminChannel: typingsJapgolly.steamUser.mod.EChatRoomGroupPermissions.CanAdminChannel & Double = js.native
  
  @js.native
  sealed trait CanBan
    extends StObject
       with EChatRoomGroupPermissions
  /* 8 */ val CanBan: typingsJapgolly.steamUser.mod.EChatRoomGroupPermissions.CanBan & Double = js.native
  
  @js.native
  sealed trait CanInvite
    extends StObject
       with EChatRoomGroupPermissions
  /* 2 */ val CanInvite: typingsJapgolly.steamUser.mod.EChatRoomGroupPermissions.CanInvite & Double = js.native
  
  @js.native
  sealed trait CanKick
    extends StObject
       with EChatRoomGroupPermissions
  /* 4 */ val CanKick: typingsJapgolly.steamUser.mod.EChatRoomGroupPermissions.CanKick & Double = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with EChatRoomGroupPermissions
  /* 0 */ val Default: typingsJapgolly.steamUser.mod.EChatRoomGroupPermissions.Default & Double = js.native
  
  @js.native
  sealed trait Valid
    extends StObject
       with EChatRoomGroupPermissions
  /* 1 */ val Valid: typingsJapgolly.steamUser.mod.EChatRoomGroupPermissions.Valid & Double = js.native
}
