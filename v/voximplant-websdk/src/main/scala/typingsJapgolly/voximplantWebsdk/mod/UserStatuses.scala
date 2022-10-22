package typingsJapgolly.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserStatuses extends StObject
@JSImport("voximplant-websdk", "UserStatuses")
@js.native
object UserStatuses extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserStatuses & Double] = js.native
  
  /**
    *    User is away
    */
  @js.native
  sealed trait Away
    extends StObject
       with UserStatuses
  /* 0 */ val Away: typingsJapgolly.voximplantWebsdk.mod.UserStatuses.Away & Double = js.native
  
  /**
    *    User is available for chat
    */
  @js.native
  sealed trait Chat
    extends StObject
       with UserStatuses
  /* 1 */ val Chat: typingsJapgolly.voximplantWebsdk.mod.UserStatuses.Chat & Double = js.native
  
  /**
    *    User is in DND state (Do Not Disturbed)
    */
  @js.native
  sealed trait DND
    extends StObject
       with UserStatuses
  /* 2 */ val DND: typingsJapgolly.voximplantWebsdk.mod.UserStatuses.DND & Double = js.native
  
  /**
    *    User is offline
    */
  @js.native
  sealed trait Offline
    extends StObject
       with UserStatuses
  /* 3 */ val Offline: typingsJapgolly.voximplantWebsdk.mod.UserStatuses.Offline & Double = js.native
  
  /**
    *    User is online
    */
  @js.native
  sealed trait Online
    extends StObject
       with UserStatuses
  /* 4 */ val Online: typingsJapgolly.voximplantWebsdk.mod.UserStatuses.Online & Double = js.native
  
  /**
    *    User is in XA state (eXtended Away)
    */
  @js.native
  sealed trait XA
    extends StObject
       with UserStatuses
  /* 5 */ val XA: typingsJapgolly.voximplantWebsdk.mod.UserStatuses.XA & Double = js.native
}
