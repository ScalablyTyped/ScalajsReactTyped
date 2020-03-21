package typingsJapgolly.onesignalCordovaPlugin

import typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSActionType
import typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSDisplayType
import typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSInFocusDisplayOption
import typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSLockScreenVisibility
import typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSLogLevel
import typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSNotificationPermission
import typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSNotificationPermissionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object onesignalCordovaPluginNumbers {
  @js.native
  sealed trait `-1` extends OSLockScreenVisibility
  
  @js.native
  sealed trait `0`
    extends OSActionType
       with OSDisplayType
       with OSInFocusDisplayOption
       with OSLockScreenVisibility
       with OSLogLevel
       with OSNotificationPermission
  
  @js.native
  sealed trait `1`
    extends OSActionType
       with OSDisplayType
       with OSInFocusDisplayOption
       with OSLockScreenVisibility
       with OSLogLevel
       with OSNotificationPermission
       with OSNotificationPermissionState
  
  @js.native
  sealed trait `2`
    extends OSDisplayType
       with OSInFocusDisplayOption
       with OSLogLevel
       with OSNotificationPermission
       with OSNotificationPermissionState
  
  @js.native
  sealed trait `3` extends OSLogLevel
  
  @js.native
  sealed trait `4` extends OSLogLevel
  
  @js.native
  sealed trait `5` extends OSLogLevel
  
  @js.native
  sealed trait `6` extends OSLogLevel
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
  @scala.inline
  def `3`: `3` = 3.asInstanceOf[`3`]
  @scala.inline
  def `4`: `4` = 4.asInstanceOf[`4`]
  @scala.inline
  def `5`: `5` = 5.asInstanceOf[`5`]
  @scala.inline
  def `6`: `6` = 6.asInstanceOf[`6`]
}

