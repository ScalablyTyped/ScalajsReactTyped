package typingsJapgolly.urbanairshipCordova.UrbanAirshipPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.urbanairshipCordova.AnonAlert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region API Definitions
trait UrbanAirshipStatic extends js.Object {
  /**
    * The enumeration values for use with setNotificationTypes().
    */
  var notificationType: AnonAlert
  /**
    * (Android Only)
    *
    * Clears the notifications posted by the application.
    *
    * @param callback The function to call on completion.
    */
  def clearNotifications(callback: js.Function0[Unit]): Unit
  /**
    * Fluent API to edit the channel tag groups by adding or removing tags,
    * then applying the changes.
    *
    * For exmaple:
    *
    * UAirship.editChannelTagGroups()
    *      .addTags("loyalty", ["platinum-member", "gold-member"])
    *      .removeTags("loyalty", ["silver-member", "bronze-member"])
    *      .apply()
    */
  def editChannelTagGroups(): EditChannelTagGroupsApi
  /**
    * Fluent API to edit the named user tag groups by adding or removing
    * tags, then applying the changes.
    *
    * For example:
    *
    * UAirship.editNamedUserTagGroups()
    *      .addTags("loyalty", ["platinum-member", "gold-member"])
    *      .removeTags("loyalty", ["silver-member", "bronze-member"])
    *      .apply()
    *
    * @returns The chainable API instance.
    */
  def editNamedUserTagGroups(): EditNamedUserTagGroupsApi
  /**
    * Gets the alias for this device.
    *
    * @param callback The function to call on completion.
    */
  def getAlias(callback: js.Function1[/* alias */ String, Unit]): Unit
  /**
    * (iOS Only)
    *
    * Gets the current application badge number.
    *
    * @param callback The function to call on completion.
    */
  def getBadgeNumber(callback: js.Function1[/* badgeNumber */ Double, Unit]): Unit
  /**
    * Get the push identifier for the device. The channel ID is used to send
    * messages to the device for testing, and is the canonical identifier for
    * the device in Urban Airship.
    *
    * @param callback The function to call on completion.
    */
  def getChannelID(callback: js.Function1[/* id */ String, Unit]): Unit
  /**
    * Returns the push message object that contains the data associated with a
    * push notification. The extras dictionary can contain arbitrary key/value
    * data that you use in your application.
    *
    * @param clear Set to true to clear the notification.
    * @param callback The function to call on completion.
    */
  def getLaunchNotification(clear: Boolean, callback: js.Function1[/* push */ PushEvent, Unit]): Unit
  /**
    * Gets the named user ID for this device.
    *
    * @param callback The function to call on completion.
    */
  def getNamedUser(callback: js.Function1[/* namedUserId */ String, Unit]): Unit
  /**
    * Get the current quiet time. The quietTime object represents a timespan
    * during which notifications should be silenced. The typical use case is
    * to expose a preference to your users so that they can enable this setting
    * and specify an interval during which they do not wish to be disturbed.
    *
    * @param callback The function to call on completion.
    */
  def getQuietTime(callback: js.Function1[/* quietTime */ QuietTimeTimeSpan, Unit]): Unit
  /**
    * Returns the tags for the device.
    *
    * @param callback The function to call on completion.
    */
  def getTags(callback: js.Function1[/* tags */ js.Array[String], Unit]): Unit
  /**
    * Checks if analytics is enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isAnalyticsEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit
  /**
    * Checks if background location updates are enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isBackgroundLocationEnabled(callback: js.Function0[Unit]): Unit
  /**
    * Checks if quiet time is currently in effect.
    *
    * @param callback The function to call on completion.
    */
  def isInQuietTime(callback: js.Function1[/* inQuietTime */ Boolean, Unit]): Unit
  /**
    * Checks if location is enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isLocationEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit
  /**
    * Checks if quiet time is enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isQuietTimeEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit
  /**
    * (Android Only)
    *
    * Checks if sound is enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isSoundEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit
  /**
    * Checks if user notifications are enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isUserNotificationsEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit
  /**
    * (Android Only)
    *
    * Checks if vibration is enabled or not.
    *
    * @param callback The function to call on completion.
    */
  def isVibrateEnabled(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit
  /**
    * Records the current location of the device.
    *
    * @param callback The function to call on completion.
    */
  def recordCurrentLocation(callback: js.Function0[Unit]): Unit
  /**
    * (iOS Only)
    *
    * Reset the badge number to zero.
    *
    * @param callback The function to call on completion.
    */
  def resetBadge(callback: js.Function0[Unit]): Unit
  /**
    * Runs an Urban Airship action.
    *
    * @param actionName The name of the action to run.
    * @param actionValue The value for the action.
    * @param callback The function to call on completion.
    */
  def runAction(
    actionName: String,
    actionValue: String,
    callback: js.Function1[/* result */ RunActionResult, Unit]
  ): Unit
  /**
    * Set alias for the device.
    *
    * @param alias The alias to set for this device.
    * @param callback The function to call on completion.
    */
  def setAlias(alias: String, callback: js.Function0[Unit]): Unit
  /**
    * Enables or disables analytics. Disabling analytics will delete any
    * locally stored events and prevent any events from uploading. Features
    * that depend on analytics being enabled may not work properly if it’s
    * disabled (reports, region triggers, location segmentation, push to
    * local time).
    *
    * @param enabled Set to true to enable analytics, false to disable.
    * @param callback The function to call on completion.
    */
  def setAnalyticsEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit
  /**
    * (iOS Only)
    *
    * Set whether the UA Autobadge feature is enabled.
    *
    * @param enabled Set to true to enable Autobadge, false to disable.
    * @param callback The function to call on completion.
    */
  def setAutobadgeEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit
  /**
    * Enables or disables background location on the device.
    *
    * @param enabled Set to true to enable background location, false to disable.
    * @param callback The function to call on completion.
    */
  def setBackgroundLocationEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit
  /**
    * (iOS Only)
    *
    * Set the current application badge number.
    *
    * @param badge The number to use for the badge.
    * @param callback The function to call on completion.
    */
  def setBadgeNumber(badge: Double, callback: js.Function0[Unit]): Unit
  /**
    * Enables or disables Urban Airship location services on the device.
    *
    * @param enabled Set to true to enable location, false to disable.
    * @param callback The function to call on completion.
    */
  def setLocationEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit
  /**
    * Set the named user ID for this device.
    *
    * @param namedUser The named user ID.
    * @param callback The function to call on completion.
    */
  def setNamedUser(namedUserId: String, callback: js.Function0[Unit]): Unit
  /**
    * (iOS Only)
    *
    * On iOS, registration for push requires specifying what
    * combination of badges, sound and alerts are desired. This function
    * must be explicitly called in order to begin the registration process.
    *
    * For example:
    *
    * UAirship.setNotificationTypes(UAirship.notificationType.sound |
    *                                  UAirship.notificationType.alert);
    *
    * @param bitmask The notification types to set.
    * @param callback The function to call on completion.
    */
  def setNotificationTypes(bitmask: Double, callback: js.Function0[Unit]): Unit
  /**
    * Set the quiet time for the device.
    *
    * @param startHour The start hour for quiet time.
    * @param startMinute The start minute for quiet time.
    * @param endHour The end hour for quiet time.
    * @param endMinute the end minute for quiet time.
    * @param callback The function to call on completion.
    */
  def setQuietTime(
    startHour: Double,
    startMinute: Double,
    endHour: Double,
    endMinute: Double,
    callback: js.Function0[Unit]
  ): Unit
  /**
    * Enables or disables quiet time.
    *
    * @param enabled Set to true to enable quiet time, false to disable.
    * @param callback The function to call on completion.
    */
  def setQuietTimeEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit
  /**
    * (Android only, iOS sound settings come in the push)
    *
    * Set whether the device makes sound on push.
    *
    * @param enabled Set to true to enable sound, false to disable.
    * @param callback The function to call on completion.
    */
  def setSoundEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit
  /**
    * Sets tags for the device.
    *
    * @param tags An array of tags.
    * @param callback The function to call on completion.
    */
  def setTags(tags: js.Array[String], callback: js.Function0[Unit]): Unit
  /**
    * Enables or disables user notifications on the device.
    * This will prompt users to opt-in to notifications on iOS.
    *
    * @param enabled Set to true to enable notifications, false to disable.
    * @param callback The function to call on completion.
    */
  def setUserNotificationsEnabled(enabled: Boolean, callback: js.Function1[/* status */ String, Unit]): Unit
  /**
    * (Android Only)
    *
    * Set whether the device vibrates on push.
    *
    * @param enabled Set to true to enable vibration, false to disable.
    * @param callback The function to call on completion.
    */
  def setVibrateEnabled(enabled: Boolean, callback: js.Function0[Unit]): Unit
}

object UrbanAirshipStatic {
  @scala.inline
  def apply(
    clearNotifications: js.Function0[Unit] => Callback,
    editChannelTagGroups: CallbackTo[EditChannelTagGroupsApi],
    editNamedUserTagGroups: CallbackTo[EditNamedUserTagGroupsApi],
    getAlias: js.Function1[/* alias */ String, Unit] => Callback,
    getBadgeNumber: js.Function1[/* badgeNumber */ Double, Unit] => Callback,
    getChannelID: js.Function1[/* id */ String, Unit] => Callback,
    getLaunchNotification: (Boolean, js.Function1[/* push */ PushEvent, Unit]) => Callback,
    getNamedUser: js.Function1[/* namedUserId */ String, Unit] => Callback,
    getQuietTime: js.Function1[/* quietTime */ QuietTimeTimeSpan, Unit] => Callback,
    getTags: js.Function1[/* tags */ js.Array[String], Unit] => Callback,
    isAnalyticsEnabled: js.Function1[/* enabled */ Boolean, Unit] => Callback,
    isBackgroundLocationEnabled: js.Function0[Unit] => Callback,
    isInQuietTime: js.Function1[/* inQuietTime */ Boolean, Unit] => Callback,
    isLocationEnabled: js.Function1[/* enabled */ Boolean, Unit] => Callback,
    isQuietTimeEnabled: js.Function1[/* enabled */ Boolean, Unit] => Callback,
    isSoundEnabled: js.Function1[/* enabled */ Boolean, Unit] => Callback,
    isUserNotificationsEnabled: js.Function1[/* enabled */ Boolean, Unit] => Callback,
    isVibrateEnabled: js.Function1[/* enabled */ Boolean, Unit] => Callback,
    notificationType: AnonAlert,
    recordCurrentLocation: js.Function0[Unit] => Callback,
    resetBadge: js.Function0[Unit] => Callback,
    runAction: (String, String, js.Function1[/* result */ RunActionResult, Unit]) => Callback,
    setAlias: (String, js.Function0[Unit]) => Callback,
    setAnalyticsEnabled: (Boolean, js.Function0[Unit]) => Callback,
    setAutobadgeEnabled: (Boolean, js.Function0[Unit]) => Callback,
    setBackgroundLocationEnabled: (Boolean, js.Function0[Unit]) => Callback,
    setBadgeNumber: (Double, js.Function0[Unit]) => Callback,
    setLocationEnabled: (Boolean, js.Function0[Unit]) => Callback,
    setNamedUser: (String, js.Function0[Unit]) => Callback,
    setNotificationTypes: (Double, js.Function0[Unit]) => Callback,
    setQuietTime: (Double, Double, Double, Double, js.Function0[Unit]) => Callback,
    setQuietTimeEnabled: (Boolean, js.Function0[Unit]) => Callback,
    setSoundEnabled: (Boolean, js.Function0[Unit]) => Callback,
    setTags: (js.Array[String], js.Function0[Unit]) => Callback,
    setUserNotificationsEnabled: (Boolean, js.Function1[/* status */ String, Unit]) => Callback,
    setVibrateEnabled: (Boolean, js.Function0[Unit]) => Callback
  ): UrbanAirshipStatic = {
    val __obj = js.Dynamic.literal(notificationType = notificationType.asInstanceOf[js.Any])
    __obj.updateDynamic("clearNotifications")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => clearNotifications(t0).runNow()))
    __obj.updateDynamic("editChannelTagGroups")(editChannelTagGroups.toJsFn)
    __obj.updateDynamic("editNamedUserTagGroups")(editNamedUserTagGroups.toJsFn)
    __obj.updateDynamic("getAlias")(js.Any.fromFunction1((t0: js.Function1[/* alias */ java.lang.String, scala.Unit]) => getAlias(t0).runNow()))
    __obj.updateDynamic("getBadgeNumber")(js.Any.fromFunction1((t0: js.Function1[/* badgeNumber */ scala.Double, scala.Unit]) => getBadgeNumber(t0).runNow()))
    __obj.updateDynamic("getChannelID")(js.Any.fromFunction1((t0: js.Function1[/* id */ java.lang.String, scala.Unit]) => getChannelID(t0).runNow()))
    __obj.updateDynamic("getLaunchNotification")(js.Any.fromFunction2((t0: scala.Boolean, t1: js.Function1[
  /* push */ typingsJapgolly.urbanairshipCordova.UrbanAirshipPlugin.PushEvent, 
  scala.Unit]) => getLaunchNotification(t0, t1).runNow()))
    __obj.updateDynamic("getNamedUser")(js.Any.fromFunction1((t0: js.Function1[/* namedUserId */ java.lang.String, scala.Unit]) => getNamedUser(t0).runNow()))
    __obj.updateDynamic("getQuietTime")(js.Any.fromFunction1((t0: js.Function1[
  /* quietTime */ typingsJapgolly.urbanairshipCordova.UrbanAirshipPlugin.QuietTimeTimeSpan, 
  scala.Unit]) => getQuietTime(t0).runNow()))
    __obj.updateDynamic("getTags")(js.Any.fromFunction1((t0: js.Function1[/* tags */ js.Array[java.lang.String], scala.Unit]) => getTags(t0).runNow()))
    __obj.updateDynamic("isAnalyticsEnabled")(js.Any.fromFunction1((t0: js.Function1[/* enabled */ scala.Boolean, scala.Unit]) => isAnalyticsEnabled(t0).runNow()))
    __obj.updateDynamic("isBackgroundLocationEnabled")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => isBackgroundLocationEnabled(t0).runNow()))
    __obj.updateDynamic("isInQuietTime")(js.Any.fromFunction1((t0: js.Function1[/* inQuietTime */ scala.Boolean, scala.Unit]) => isInQuietTime(t0).runNow()))
    __obj.updateDynamic("isLocationEnabled")(js.Any.fromFunction1((t0: js.Function1[/* enabled */ scala.Boolean, scala.Unit]) => isLocationEnabled(t0).runNow()))
    __obj.updateDynamic("isQuietTimeEnabled")(js.Any.fromFunction1((t0: js.Function1[/* enabled */ scala.Boolean, scala.Unit]) => isQuietTimeEnabled(t0).runNow()))
    __obj.updateDynamic("isSoundEnabled")(js.Any.fromFunction1((t0: js.Function1[/* enabled */ scala.Boolean, scala.Unit]) => isSoundEnabled(t0).runNow()))
    __obj.updateDynamic("isUserNotificationsEnabled")(js.Any.fromFunction1((t0: js.Function1[/* enabled */ scala.Boolean, scala.Unit]) => isUserNotificationsEnabled(t0).runNow()))
    __obj.updateDynamic("isVibrateEnabled")(js.Any.fromFunction1((t0: js.Function1[/* enabled */ scala.Boolean, scala.Unit]) => isVibrateEnabled(t0).runNow()))
    __obj.updateDynamic("recordCurrentLocation")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => recordCurrentLocation(t0).runNow()))
    __obj.updateDynamic("resetBadge")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => resetBadge(t0).runNow()))
    __obj.updateDynamic("runAction")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Function1[
  /* result */ typingsJapgolly.urbanairshipCordova.UrbanAirshipPlugin.RunActionResult, 
  scala.Unit]) => runAction(t0, t1, t2).runNow()))
    __obj.updateDynamic("setAlias")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => setAlias(t0, t1).runNow()))
    __obj.updateDynamic("setAnalyticsEnabled")(js.Any.fromFunction2((t0: scala.Boolean, t1: js.Function0[scala.Unit]) => setAnalyticsEnabled(t0, t1).runNow()))
    __obj.updateDynamic("setAutobadgeEnabled")(js.Any.fromFunction2((t0: scala.Boolean, t1: js.Function0[scala.Unit]) => setAutobadgeEnabled(t0, t1).runNow()))
    __obj.updateDynamic("setBackgroundLocationEnabled")(js.Any.fromFunction2((t0: scala.Boolean, t1: js.Function0[scala.Unit]) => setBackgroundLocationEnabled(t0, t1).runNow()))
    __obj.updateDynamic("setBadgeNumber")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function0[scala.Unit]) => setBadgeNumber(t0, t1).runNow()))
    __obj.updateDynamic("setLocationEnabled")(js.Any.fromFunction2((t0: scala.Boolean, t1: js.Function0[scala.Unit]) => setLocationEnabled(t0, t1).runNow()))
    __obj.updateDynamic("setNamedUser")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => setNamedUser(t0, t1).runNow()))
    __obj.updateDynamic("setNotificationTypes")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function0[scala.Unit]) => setNotificationTypes(t0, t1).runNow()))
    __obj.updateDynamic("setQuietTime")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: js.Function0[scala.Unit]) => setQuietTime(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("setQuietTimeEnabled")(js.Any.fromFunction2((t0: scala.Boolean, t1: js.Function0[scala.Unit]) => setQuietTimeEnabled(t0, t1).runNow()))
    __obj.updateDynamic("setSoundEnabled")(js.Any.fromFunction2((t0: scala.Boolean, t1: js.Function0[scala.Unit]) => setSoundEnabled(t0, t1).runNow()))
    __obj.updateDynamic("setTags")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Function0[scala.Unit]) => setTags(t0, t1).runNow()))
    __obj.updateDynamic("setUserNotificationsEnabled")(js.Any.fromFunction2((t0: scala.Boolean, t1: js.Function1[/* status */ java.lang.String, scala.Unit]) => setUserNotificationsEnabled(t0, t1).runNow()))
    __obj.updateDynamic("setVibrateEnabled")(js.Any.fromFunction2((t0: scala.Boolean, t1: js.Function0[scala.Unit]) => setVibrateEnabled(t0, t1).runNow()))
    __obj.asInstanceOf[UrbanAirshipStatic]
  }
}

