package typingsJapgolly.urbanairshipCordova

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event
import typingsJapgolly.urbanairshipCordova.anon.Alert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UrbanAirshipPlugin {
  
  /**
    * Describes the chainable API object returned by editChannelTagGroups().
    */
  @js.native
  trait EditChannelTagGroupsApi extends StObject {
    
    /**
      * Used to add the given tags to the given tag group.
      *
      * @param tagGroup The tag group to add tags to.
      * @param tags The tags to add to the group.
      *
      * @returns The chainable API instance.
      */
    def addTags(tagGroup: String, tags: js.Array[String]): EditChannelTagGroupsApi = js.native
    
    /**
      * Used to apply the changes from the chained API call.
      *
      * @param callback The optional function to call on completion.
      */
    @JSName("apply")
    def apply(): Unit = js.native
    @JSName("apply")
    def apply(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Used to remove the given tags from the given tag group.
      *
      * @param tagGroup The tag group to remove tags from.
      * @param tags The tags to remove from the group.
      *
      * @returns The chainable API instance.
      */
    def removeTags(tagGroup: String, tags: js.Array[String]): EditChannelTagGroupsApi = js.native
  }
  
  /**
    * Describes the chainable API object returned by editNamedUserTagGroups().
    */
  @js.native
  trait EditNamedUserTagGroupsApi extends StObject {
    
    /**
      * Used to add the given tags to the given tag group.
      *
      * @param tagGroup The tag group to add tags to.
      * @param tags The tags to add to the group.
      *
      * @returns The chainable API instance.
      */
    def addTags(tagGroup: String, tags: js.Array[String]): EditNamedUserTagGroupsApi = js.native
    
    /**
      * Used to apply the changes from the chained API call.
      *
      * @param callback The optional function to call on completion.
      */
    @JSName("apply")
    def apply(): Unit = js.native
    @JSName("apply")
    def apply(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Used to remove the given tags from the given tag group.
      *
      * @param tagGroup The tag group to remove tags from.
      * @param tags The tags to remove from the group.
      *
      * @returns The chainable API instance.
      */
    def removeTags(tagGroup: String, tags: js.Array[String]): EditNamedUserTagGroupsApi = js.native
  }
  
  //#endregion
  //#region Data Types
  @js.native
  trait PushEvent
    extends StObject
       with Event {
    
    var extras: StringDictionary[Any] = js.native
    
    var message: String = js.native
  }
  
  /**
    * Represents a timespan during which notifications should be silenced.
    *
    * For example, 10PM - 6AM would be:
    * { startHour: 22, startMinute: 0, endHour: 6, endMinute: 0 }
    */
  trait QuietTimeTimeSpan extends StObject {
    
    var endHour: Double
    
    var endMinute: Double
    
    var startHour: Double
    
    var startMinute: Double
  }
  object QuietTimeTimeSpan {
    
    inline def apply(endHour: Double, endMinute: Double, startHour: Double, startMinute: Double): QuietTimeTimeSpan = {
      val __obj = js.Dynamic.literal(endHour = endHour.asInstanceOf[js.Any], endMinute = endMinute.asInstanceOf[js.Any], startHour = startHour.asInstanceOf[js.Any], startMinute = startMinute.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuietTimeTimeSpan]
    }
    
    extension [Self <: QuietTimeTimeSpan](x: Self) {
      
      inline def setEndHour(value: Double): Self = StObject.set(x, "endHour", value.asInstanceOf[js.Any])
      
      inline def setEndMinute(value: Double): Self = StObject.set(x, "endMinute", value.asInstanceOf[js.Any])
      
      inline def setStartHour(value: Double): Self = StObject.set(x, "startHour", value.asInstanceOf[js.Any])
      
      inline def setStartMinute(value: Double): Self = StObject.set(x, "startMinute", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RegistrationEvent
    extends StObject
       with Event {
    
    /**
      * The channel ID for the device.
      */
    var channelID: String = js.native
    
    /**
      * (iOS Only)
      *
      * The push token for the device.
      */
    var deviceToken: String = js.native
    
    var error: String = js.native
  }
  
  /**
    * The result of the runAction() call.
    */
  trait RunActionResult extends StObject {
    
    var error: String
    
    var value: Any
  }
  object RunActionResult {
    
    inline def apply(error: String, value: Any): RunActionResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunActionResult]
    }
    
    extension [Self <: RunActionResult](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  //#region API Definitions
  trait UrbanAirshipStatic extends StObject {
    
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
      * The enumeration values for use with setNotificationTypes().
      */
    var notificationType: Alert
    
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
    
    inline def apply(
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
      notificationType: Alert,
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
      val __obj = js.Dynamic.literal(clearNotifications = js.Any.fromFunction1((t0: js.Function0[Unit]) => clearNotifications(t0).runNow()), editChannelTagGroups = editChannelTagGroups.toJsFn, editNamedUserTagGroups = editNamedUserTagGroups.toJsFn, getAlias = js.Any.fromFunction1((t0: js.Function1[/* alias */ String, Unit]) => getAlias(t0).runNow()), getBadgeNumber = js.Any.fromFunction1((t0: js.Function1[/* badgeNumber */ Double, Unit]) => getBadgeNumber(t0).runNow()), getChannelID = js.Any.fromFunction1((t0: js.Function1[/* id */ String, Unit]) => getChannelID(t0).runNow()), getLaunchNotification = js.Any.fromFunction2((t0: Boolean, t1: js.Function1[/* push */ PushEvent, Unit]) => (getLaunchNotification(t0, t1)).runNow()), getNamedUser = js.Any.fromFunction1((t0: js.Function1[/* namedUserId */ String, Unit]) => getNamedUser(t0).runNow()), getQuietTime = js.Any.fromFunction1((t0: js.Function1[/* quietTime */ QuietTimeTimeSpan, Unit]) => getQuietTime(t0).runNow()), getTags = js.Any.fromFunction1((t0: js.Function1[/* tags */ js.Array[String], Unit]) => getTags(t0).runNow()), isAnalyticsEnabled = js.Any.fromFunction1((t0: js.Function1[/* enabled */ Boolean, Unit]) => isAnalyticsEnabled(t0).runNow()), isBackgroundLocationEnabled = js.Any.fromFunction1((t0: js.Function0[Unit]) => isBackgroundLocationEnabled(t0).runNow()), isInQuietTime = js.Any.fromFunction1((t0: js.Function1[/* inQuietTime */ Boolean, Unit]) => isInQuietTime(t0).runNow()), isLocationEnabled = js.Any.fromFunction1((t0: js.Function1[/* enabled */ Boolean, Unit]) => isLocationEnabled(t0).runNow()), isQuietTimeEnabled = js.Any.fromFunction1((t0: js.Function1[/* enabled */ Boolean, Unit]) => isQuietTimeEnabled(t0).runNow()), isSoundEnabled = js.Any.fromFunction1((t0: js.Function1[/* enabled */ Boolean, Unit]) => isSoundEnabled(t0).runNow()), isUserNotificationsEnabled = js.Any.fromFunction1((t0: js.Function1[/* enabled */ Boolean, Unit]) => isUserNotificationsEnabled(t0).runNow()), isVibrateEnabled = js.Any.fromFunction1((t0: js.Function1[/* enabled */ Boolean, Unit]) => isVibrateEnabled(t0).runNow()), notificationType = notificationType.asInstanceOf[js.Any], recordCurrentLocation = js.Any.fromFunction1((t0: js.Function0[Unit]) => recordCurrentLocation(t0).runNow()), resetBadge = js.Any.fromFunction1((t0: js.Function0[Unit]) => resetBadge(t0).runNow()), runAction = js.Any.fromFunction3((t0: String, t1: String, t2: js.Function1[/* result */ RunActionResult, Unit]) => (runAction(t0, t1, t2)).runNow()), setAlias = js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (setAlias(t0, t1)).runNow()), setAnalyticsEnabled = js.Any.fromFunction2((t0: Boolean, t1: js.Function0[Unit]) => (setAnalyticsEnabled(t0, t1)).runNow()), setAutobadgeEnabled = js.Any.fromFunction2((t0: Boolean, t1: js.Function0[Unit]) => (setAutobadgeEnabled(t0, t1)).runNow()), setBackgroundLocationEnabled = js.Any.fromFunction2((t0: Boolean, t1: js.Function0[Unit]) => (setBackgroundLocationEnabled(t0, t1)).runNow()), setBadgeNumber = js.Any.fromFunction2((t0: Double, t1: js.Function0[Unit]) => (setBadgeNumber(t0, t1)).runNow()), setLocationEnabled = js.Any.fromFunction2((t0: Boolean, t1: js.Function0[Unit]) => (setLocationEnabled(t0, t1)).runNow()), setNamedUser = js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (setNamedUser(t0, t1)).runNow()), setNotificationTypes = js.Any.fromFunction2((t0: Double, t1: js.Function0[Unit]) => (setNotificationTypes(t0, t1)).runNow()), setQuietTime = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: js.Function0[Unit]) => (setQuietTime(t0, t1, t2, t3, t4)).runNow()), setQuietTimeEnabled = js.Any.fromFunction2((t0: Boolean, t1: js.Function0[Unit]) => (setQuietTimeEnabled(t0, t1)).runNow()), setSoundEnabled = js.Any.fromFunction2((t0: Boolean, t1: js.Function0[Unit]) => (setSoundEnabled(t0, t1)).runNow()), setTags = js.Any.fromFunction2((t0: js.Array[String], t1: js.Function0[Unit]) => (setTags(t0, t1)).runNow()), setUserNotificationsEnabled = js.Any.fromFunction2((t0: Boolean, t1: js.Function1[/* status */ String, Unit]) => (setUserNotificationsEnabled(t0, t1)).runNow()), setVibrateEnabled = js.Any.fromFunction2((t0: Boolean, t1: js.Function0[Unit]) => (setVibrateEnabled(t0, t1)).runNow()))
      __obj.asInstanceOf[UrbanAirshipStatic]
    }
    
    extension [Self <: UrbanAirshipStatic](x: Self) {
      
      inline def setClearNotifications(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "clearNotifications", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setEditChannelTagGroups(value: CallbackTo[EditChannelTagGroupsApi]): Self = StObject.set(x, "editChannelTagGroups", value.toJsFn)
      
      inline def setEditNamedUserTagGroups(value: CallbackTo[EditNamedUserTagGroupsApi]): Self = StObject.set(x, "editNamedUserTagGroups", value.toJsFn)
      
      inline def setGetAlias(value: js.Function1[/* alias */ String, Unit] => Callback): Self = StObject.set(x, "getAlias", js.Any.fromFunction1((t0: js.Function1[/* alias */ String, Unit]) => value(t0).runNow()))
      
      inline def setGetBadgeNumber(value: js.Function1[/* badgeNumber */ Double, Unit] => Callback): Self = StObject.set(x, "getBadgeNumber", js.Any.fromFunction1((t0: js.Function1[/* badgeNumber */ Double, Unit]) => value(t0).runNow()))
      
      inline def setGetChannelID(value: js.Function1[/* id */ String, Unit] => Callback): Self = StObject.set(x, "getChannelID", js.Any.fromFunction1((t0: js.Function1[/* id */ String, Unit]) => value(t0).runNow()))
      
      inline def setGetLaunchNotification(value: (Boolean, js.Function1[/* push */ PushEvent, Unit]) => Callback): Self = StObject.set(x, "getLaunchNotification", js.Any.fromFunction2((t0: Boolean, t1: js.Function1[/* push */ PushEvent, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setGetNamedUser(value: js.Function1[/* namedUserId */ String, Unit] => Callback): Self = StObject.set(x, "getNamedUser", js.Any.fromFunction1((t0: js.Function1[/* namedUserId */ String, Unit]) => value(t0).runNow()))
      
      inline def setGetQuietTime(value: js.Function1[/* quietTime */ QuietTimeTimeSpan, Unit] => Callback): Self = StObject.set(x, "getQuietTime", js.Any.fromFunction1((t0: js.Function1[/* quietTime */ QuietTimeTimeSpan, Unit]) => value(t0).runNow()))
      
      inline def setGetTags(value: js.Function1[/* tags */ js.Array[String], Unit] => Callback): Self = StObject.set(x, "getTags", js.Any.fromFunction1((t0: js.Function1[/* tags */ js.Array[String], Unit]) => value(t0).runNow()))
      
      inline def setIsAnalyticsEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Callback): Self = StObject.set(x, "isAnalyticsEnabled", js.Any.fromFunction1((t0: js.Function1[/* enabled */ Boolean, Unit]) => value(t0).runNow()))
      
      inline def setIsBackgroundLocationEnabled(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "isBackgroundLocationEnabled", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setIsInQuietTime(value: js.Function1[/* inQuietTime */ Boolean, Unit] => Callback): Self = StObject.set(x, "isInQuietTime", js.Any.fromFunction1((t0: js.Function1[/* inQuietTime */ Boolean, Unit]) => value(t0).runNow()))
      
      inline def setIsLocationEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Callback): Self = StObject.set(x, "isLocationEnabled", js.Any.fromFunction1((t0: js.Function1[/* enabled */ Boolean, Unit]) => value(t0).runNow()))
      
      inline def setIsQuietTimeEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Callback): Self = StObject.set(x, "isQuietTimeEnabled", js.Any.fromFunction1((t0: js.Function1[/* enabled */ Boolean, Unit]) => value(t0).runNow()))
      
      inline def setIsSoundEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Callback): Self = StObject.set(x, "isSoundEnabled", js.Any.fromFunction1((t0: js.Function1[/* enabled */ Boolean, Unit]) => value(t0).runNow()))
      
      inline def setIsUserNotificationsEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Callback): Self = StObject.set(x, "isUserNotificationsEnabled", js.Any.fromFunction1((t0: js.Function1[/* enabled */ Boolean, Unit]) => value(t0).runNow()))
      
      inline def setIsVibrateEnabled(value: js.Function1[/* enabled */ Boolean, Unit] => Callback): Self = StObject.set(x, "isVibrateEnabled", js.Any.fromFunction1((t0: js.Function1[/* enabled */ Boolean, Unit]) => value(t0).runNow()))
      
      inline def setNotificationType(value: Alert): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
      
      inline def setRecordCurrentLocation(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "recordCurrentLocation", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setResetBadge(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "resetBadge", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setRunAction(value: (String, String, js.Function1[/* result */ RunActionResult, Unit]) => Callback): Self = StObject.set(x, "runAction", js.Any.fromFunction3((t0: String, t1: String, t2: js.Function1[/* result */ RunActionResult, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetAlias(value: (String, js.Function0[Unit]) => Callback): Self = StObject.set(x, "setAlias", js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSetAnalyticsEnabled(value: (Boolean, js.Function0[Unit]) => Callback): Self = StObject.set(x, "setAnalyticsEnabled", js.Any.fromFunction2((t0: Boolean, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSetAutobadgeEnabled(value: (Boolean, js.Function0[Unit]) => Callback): Self = StObject.set(x, "setAutobadgeEnabled", js.Any.fromFunction2((t0: Boolean, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSetBackgroundLocationEnabled(value: (Boolean, js.Function0[Unit]) => Callback): Self = StObject.set(x, "setBackgroundLocationEnabled", js.Any.fromFunction2((t0: Boolean, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSetBadgeNumber(value: (Double, js.Function0[Unit]) => Callback): Self = StObject.set(x, "setBadgeNumber", js.Any.fromFunction2((t0: Double, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSetLocationEnabled(value: (Boolean, js.Function0[Unit]) => Callback): Self = StObject.set(x, "setLocationEnabled", js.Any.fromFunction2((t0: Boolean, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSetNamedUser(value: (String, js.Function0[Unit]) => Callback): Self = StObject.set(x, "setNamedUser", js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSetNotificationTypes(value: (Double, js.Function0[Unit]) => Callback): Self = StObject.set(x, "setNotificationTypes", js.Any.fromFunction2((t0: Double, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSetQuietTime(value: (Double, Double, Double, Double, js.Function0[Unit]) => Callback): Self = StObject.set(x, "setQuietTime", js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: js.Function0[Unit]) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setSetQuietTimeEnabled(value: (Boolean, js.Function0[Unit]) => Callback): Self = StObject.set(x, "setQuietTimeEnabled", js.Any.fromFunction2((t0: Boolean, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSetSoundEnabled(value: (Boolean, js.Function0[Unit]) => Callback): Self = StObject.set(x, "setSoundEnabled", js.Any.fromFunction2((t0: Boolean, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSetTags(value: (js.Array[String], js.Function0[Unit]) => Callback): Self = StObject.set(x, "setTags", js.Any.fromFunction2((t0: js.Array[String], t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSetUserNotificationsEnabled(value: (Boolean, js.Function1[/* status */ String, Unit]) => Callback): Self = StObject.set(x, "setUserNotificationsEnabled", js.Any.fromFunction2((t0: Boolean, t1: js.Function1[/* status */ String, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSetVibrateEnabled(value: (Boolean, js.Function0[Unit]) => Callback): Self = StObject.set(x, "setVibrateEnabled", js.Any.fromFunction2((t0: Boolean, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    }
  }
}
