package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERemoteDeviceAuthorizationResult extends StObject
@JSImport("steam-user", "ERemoteDeviceAuthorizationResult")
@js.native
object ERemoteDeviceAuthorizationResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERemoteDeviceAuthorizationResult & Double] = js.native
  
  @js.native
  sealed trait Busy
    extends StObject
       with ERemoteDeviceAuthorizationResult
  /* 4 */ val Busy: typingsJapgolly.steamUser.mod.ERemoteDeviceAuthorizationResult.Busy & Double = js.native
  
  @js.native
  sealed trait Canceled
    extends StObject
       with ERemoteDeviceAuthorizationResult
  /* 8 */ val Canceled: typingsJapgolly.steamUser.mod.ERemoteDeviceAuthorizationResult.Canceled & Double = js.native
  
  @js.native
  sealed trait Denied
    extends StObject
       with ERemoteDeviceAuthorizationResult
  /* 1 */ val Denied: typingsJapgolly.steamUser.mod.ERemoteDeviceAuthorizationResult.Denied & Double = js.native
  
  @js.native
  sealed trait Failed
    extends StObject
       with ERemoteDeviceAuthorizationResult
  /* 7 */ val Failed: typingsJapgolly.steamUser.mod.ERemoteDeviceAuthorizationResult.Failed & Double = js.native
  
  @js.native
  sealed trait InProgress
    extends StObject
       with ERemoteDeviceAuthorizationResult
  /* 5 */ val InProgress: typingsJapgolly.steamUser.mod.ERemoteDeviceAuthorizationResult.InProgress & Double = js.native
  
  @js.native
  sealed trait NotLoggedIn
    extends StObject
       with ERemoteDeviceAuthorizationResult
  /* 2 */ val NotLoggedIn: typingsJapgolly.steamUser.mod.ERemoteDeviceAuthorizationResult.NotLoggedIn & Double = js.native
  
  @js.native
  sealed trait Offline
    extends StObject
       with ERemoteDeviceAuthorizationResult
  /* 3 */ val Offline: typingsJapgolly.steamUser.mod.ERemoteDeviceAuthorizationResult.Offline & Double = js.native
  
  @js.native
  sealed trait Success
    extends StObject
       with ERemoteDeviceAuthorizationResult
  /* 0 */ val Success: typingsJapgolly.steamUser.mod.ERemoteDeviceAuthorizationResult.Success & Double = js.native
  
  @js.native
  sealed trait TimedOut
    extends StObject
       with ERemoteDeviceAuthorizationResult
  /* 6 */ val TimedOut: typingsJapgolly.steamUser.mod.ERemoteDeviceAuthorizationResult.TimedOut & Double = js.native
}
