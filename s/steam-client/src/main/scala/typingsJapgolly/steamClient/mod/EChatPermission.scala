package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatPermission extends StObject
@JSImport("steam-client", "EChatPermission")
@js.native
object EChatPermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatPermission & Double] = js.native
  
  @js.native
  sealed trait Ban
    extends StObject
       with EChatPermission
  /* 256 */ val Ban: typingsJapgolly.steamClient.mod.EChatPermission.Ban & Double = js.native
  
  @js.native
  sealed trait ChangeAccess
    extends StObject
       with EChatPermission
  /* 512 */ val ChangeAccess: typingsJapgolly.steamClient.mod.EChatPermission.ChangeAccess & Double = js.native
  
  @js.native
  sealed trait ChangePermissions
    extends StObject
       with EChatPermission
  /* 128 */ val ChangePermissions: typingsJapgolly.steamClient.mod.EChatPermission.ChangePermissions & Double = js.native
  
  @js.native
  sealed trait Close
    extends StObject
       with EChatPermission
  /* 1 */ val Close: typingsJapgolly.steamClient.mod.EChatPermission.Close & Double = js.native
  
  // 8
  @js.native
  sealed trait EveryoneDefault
    extends StObject
       with EChatPermission
  /* 8 | 2 */ val EveryoneDefault: typingsJapgolly.steamClient.mod.EChatPermission.EveryoneDefault & Double = js.native
  
  @js.native
  sealed trait EveryoneNotInClanDefault
    extends StObject
       with EChatPermission
  /* 8 */ val EveryoneNotInClanDefault: typingsJapgolly.steamClient.mod.EChatPermission.EveryoneNotInClanDefault & Double = js.native
  
  @js.native
  sealed trait Invite
    extends StObject
       with EChatPermission
  /* 2 */ val Invite: typingsJapgolly.steamClient.mod.EChatPermission.Invite & Double = js.native
  
  @js.native
  sealed trait Kick
    extends StObject
       with EChatPermission
  /* 16 */ val Kick: typingsJapgolly.steamClient.mod.EChatPermission.Kick & Double = js.native
  
  // 891
  @js.native
  sealed trait Mask
    extends StObject
       with EChatPermission
  /* 1019 */ val Mask: typingsJapgolly.steamClient.mod.EChatPermission.Mask & Double = js.native
  
  // 10
  // todo: this doesn't seem correct...
  @js.native
  sealed trait MemberDefault
    extends StObject
       with EChatPermission
  /* 256 | 16 | 8 | 2 */ val MemberDefault: typingsJapgolly.steamClient.mod.EChatPermission.MemberDefault & Double = js.native
  
  @js.native
  sealed trait Mute
    extends StObject
       with EChatPermission
  /* 32 */ val Mute: typingsJapgolly.steamClient.mod.EChatPermission.Mute & Double = js.native
  
  // 282
  @js.native
  sealed trait OfficerDefault
    extends StObject
       with EChatPermission
  /* 256 | 16 | 8 | 2 */ val OfficerDefault: typingsJapgolly.steamClient.mod.EChatPermission.OfficerDefault & Double = js.native
  
  // 282
  @js.native
  sealed trait OwnerDefault
    extends StObject
       with EChatPermission
  /* 512 | 256 | 64 | 32 | 16 | 8 | 2 | 1 */ val OwnerDefault: typingsJapgolly.steamClient.mod.EChatPermission.OwnerDefault & Double = js.native
  
  @js.native
  sealed trait SetMetadata
    extends StObject
       with EChatPermission
  /* 64 */ val SetMetadata: typingsJapgolly.steamClient.mod.EChatPermission.SetMetadata & Double = js.native
  
  @js.native
  sealed trait Talk
    extends StObject
       with EChatPermission
  /* 8 */ val Talk: typingsJapgolly.steamClient.mod.EChatPermission.Talk & Double = js.native
}
