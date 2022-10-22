package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatRoomJoinState extends StObject
@JSImport("steam-user", "EChatRoomJoinState")
@js.native
object EChatRoomJoinState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatRoomJoinState & Double] = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with EChatRoomJoinState
  /* 0 */ val Default: typingsJapgolly.steamUser.mod.EChatRoomJoinState.Default & Double = js.native
  
  @js.native
  sealed trait Joined
    extends StObject
       with EChatRoomJoinState
  /* 2 */ val Joined: typingsJapgolly.steamUser.mod.EChatRoomJoinState.Joined & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EChatRoomJoinState
  /* 1 */ val None: typingsJapgolly.steamUser.mod.EChatRoomJoinState.None & Double = js.native
  
  @js.native
  sealed trait TestInvalid
    extends StObject
       with EChatRoomJoinState
  /* 99 */ val TestInvalid: typingsJapgolly.steamUser.mod.EChatRoomJoinState.TestInvalid & Double = js.native
}
