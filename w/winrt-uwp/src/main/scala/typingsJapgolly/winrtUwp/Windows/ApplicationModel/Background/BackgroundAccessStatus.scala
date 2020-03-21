package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundAccessStatus extends js.Object

/** On Windows, this enumeration specifies an app's ability to perform background activity and display a tile on the lock screen. For Windows Phone Store apps, it only indicates an app's ability to perform background activity. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundAccessStatus")
@js.native
object BackgroundAccessStatus extends js.Object {
  /** Windows: The user chose "allow" in the dialog box. The app is added to the lock screen and can set up background tasks, but it cannot use the real-time connectivity (RTC) broker. This means that the app might not function while the device is in connected standby. Note that apps that do not specify RTC in their manifest will always demonstrate this behavior. After this value has been returned, subsequent calls to the RequestAccessAsync method do not present the dialog box to the user. */
  @js.native
  sealed trait allowedMayUseActiveRealTimeConnectivity extends BackgroundAccessStatus
  
  /** Windows: The user chose "allow" in the dialog box. The app is added to the lock screen, can set up background tasks, and, if it has the capability, can use the real-time connectivity (RTC) broker. This means that the app can function while the device is in the connected standby state. After this value has been returned, subsequent calls to the RequestAccessAsync method do not present the dialog box to the user. */
  @js.native
  sealed trait allowedWithAlwaysOnRealTimeConnectivity extends BackgroundAccessStatus
  
  /** Windows: The user chose "don't allow" in the dialog box. The app is not added to the lock screen. After this value has been returned, subsequent calls to the RequestAccessAsync method do not present the dialog box to the user. */
  @js.native
  sealed trait denied extends BackgroundAccessStatus
  
  /** Windows: The user has not selected "allow" or "don't allow" in the dialog box, or dismissed it without making a choice. */
  @js.native
  sealed trait unspecified extends BackgroundAccessStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundAccessStatus with Double] = js.native
  /* 2 */ @js.native
  object allowedMayUseActiveRealTimeConnectivity extends TopLevel[allowedMayUseActiveRealTimeConnectivity with Double]
  
  /* 1 */ @js.native
  object allowedWithAlwaysOnRealTimeConnectivity extends TopLevel[allowedWithAlwaysOnRealTimeConnectivity with Double]
  
  /* 3 */ @js.native
  object denied extends TopLevel[denied with Double]
  
  /* 0 */ @js.native
  object unspecified extends TopLevel[unspecified with Double]
  
}

