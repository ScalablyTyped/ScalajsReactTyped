package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERemoteDeviceStreamingResult extends StObject
@JSImport("steam-user", "ERemoteDeviceStreamingResult")
@js.native
object ERemoteDeviceStreamingResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERemoteDeviceStreamingResult & Double] = js.native
  
  @js.native
  sealed trait BroadcastingActive
    extends StObject
       with ERemoteDeviceStreamingResult
  /* 9 */ val BroadcastingActive: typingsJapgolly.steamUser.mod.ERemoteDeviceStreamingResult.BroadcastingActive & Double = js.native
  
  @js.native
  sealed trait Busy
    extends StObject
       with ERemoteDeviceStreamingResult
  /* 4 */ val Busy: typingsJapgolly.steamUser.mod.ERemoteDeviceStreamingResult.Busy & Double = js.native
  
  @js.native
  sealed trait Canceled
    extends StObject
       with ERemoteDeviceStreamingResult
  /* 6 */ val Canceled: typingsJapgolly.steamUser.mod.ERemoteDeviceStreamingResult.Canceled & Double = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with ERemoteDeviceStreamingResult
  /* 8 */ val Disabled: typingsJapgolly.steamUser.mod.ERemoteDeviceStreamingResult.Disabled & Double = js.native
  
  @js.native
  sealed trait DriversNotInstalled
    extends StObject
       with ERemoteDeviceStreamingResult
  /* 7 */ val DriversNotInstalled: typingsJapgolly.steamUser.mod.ERemoteDeviceStreamingResult.DriversNotInstalled & Double = js.native
  
  @js.native
  sealed trait Failed
    extends StObject
       with ERemoteDeviceStreamingResult
  /* 3 */ val Failed: typingsJapgolly.steamUser.mod.ERemoteDeviceStreamingResult.Failed & Double = js.native
  
  @js.native
  sealed trait GameLaunchFailed
    extends StObject
       with ERemoteDeviceStreamingResult
  /* 14 */ val GameLaunchFailed: typingsJapgolly.steamUser.mod.ERemoteDeviceStreamingResult.GameLaunchFailed & Double = js.native
  
  @js.native
  sealed trait InProgress
    extends StObject
       with ERemoteDeviceStreamingResult
  /* 5 */ val InProgress: typingsJapgolly.steamUser.mod.ERemoteDeviceStreamingResult.InProgress & Double = js.native
  
  @js.native
  sealed trait Invisible
    extends StObject
       with ERemoteDeviceStreamingResult
  /* 13 */ val Invisible: typingsJapgolly.steamUser.mod.ERemoteDeviceStreamingResult.Invisible & Double = js.native
  
  @js.native
  sealed trait PINRequired
    extends StObject
       with ERemoteDeviceStreamingResult
  /* 11 */ val PINRequired: typingsJapgolly.steamUser.mod.ERemoteDeviceStreamingResult.PINRequired & Double = js.native
  
  @js.native
  sealed trait ScreenLocked
    extends StObject
       with ERemoteDeviceStreamingResult
  /* 2 */ val ScreenLocked: typingsJapgolly.steamUser.mod.ERemoteDeviceStreamingResult.ScreenLocked & Double = js.native
  
  @js.native
  sealed trait Success
    extends StObject
       with ERemoteDeviceStreamingResult
  /* 0 */ val Success: typingsJapgolly.steamUser.mod.ERemoteDeviceStreamingResult.Success & Double = js.native
  
  @js.native
  sealed trait TransportUnavailable
    extends StObject
       with ERemoteDeviceStreamingResult
  /* 12 */ val TransportUnavailable: typingsJapgolly.steamUser.mod.ERemoteDeviceStreamingResult.TransportUnavailable & Double = js.native
  
  @js.native
  sealed trait Unauthorized
    extends StObject
       with ERemoteDeviceStreamingResult
  /* 1 */ val Unauthorized: typingsJapgolly.steamUser.mod.ERemoteDeviceStreamingResult.Unauthorized & Double = js.native
  
  @js.native
  sealed trait VRActive
    extends StObject
       with ERemoteDeviceStreamingResult
  /* 10 */ val VRActive: typingsJapgolly.steamUser.mod.ERemoteDeviceStreamingResult.VRActive & Double = js.native
}
