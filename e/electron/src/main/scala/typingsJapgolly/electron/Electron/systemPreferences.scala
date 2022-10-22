package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.`accent-color-changed`
import typingsJapgolly.electron.electronStrings.`color-changed`
import typingsJapgolly.electron.electronStrings.`high-contrast-color-scheme-changed`
import typingsJapgolly.electron.electronStrings.`inverted-color-scheme-changed`
import typingsJapgolly.electron.electronStrings.`not-determined`
import typingsJapgolly.electron.electronStrings.array
import typingsJapgolly.electron.electronStrings.blue
import typingsJapgolly.electron.electronStrings.boolean
import typingsJapgolly.electron.electronStrings.brown
import typingsJapgolly.electron.electronStrings.camera
import typingsJapgolly.electron.electronStrings.dark
import typingsJapgolly.electron.electronStrings.denied
import typingsJapgolly.electron.electronStrings.dictionary
import typingsJapgolly.electron.electronStrings.double
import typingsJapgolly.electron.electronStrings.float
import typingsJapgolly.electron.electronStrings.granted
import typingsJapgolly.electron.electronStrings.gray
import typingsJapgolly.electron.electronStrings.green
import typingsJapgolly.electron.electronStrings.integer
import typingsJapgolly.electron.electronStrings.light
import typingsJapgolly.electron.electronStrings.microphone
import typingsJapgolly.electron.electronStrings.orange
import typingsJapgolly.electron.electronStrings.pink
import typingsJapgolly.electron.electronStrings.purple
import typingsJapgolly.electron.electronStrings.red
import typingsJapgolly.electron.electronStrings.restricted
import typingsJapgolly.electron.electronStrings.screen
import typingsJapgolly.electron.electronStrings.string
import typingsJapgolly.electron.electronStrings.unknown_
import typingsJapgolly.electron.electronStrings.url
import typingsJapgolly.electron.electronStrings.yellow
import typingsJapgolly.node.eventsMod.global.NodeJS.EventEmitter
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemPreferences
  extends StObject
     with EventEmitter {
  
  @JSName("addListener")
  def addListener_accentcolorchanged(
    event: `accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_colorchanged(event: `color-changed`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_highcontrastcolorschemechanged(
    event: `high-contrast-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* highContrastColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_invertedcolorschemechanged(
    event: `inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ Boolean, Unit]
  ): this.type = js.native
  
  /**
    * A `string` property that can be `dark`, `light` or `unknown`. It determines the
    * macOS appearance setting for your application. This maps to values in:
    * NSApplication.appearance. Setting this will override the system default as well
    * as the value of `getEffectiveAppearance`.
    *
    * Possible values that can be set are `dark` and `light`, and possible return
    * values are `dark`, `light`, and `unknown`.
    *
    * This property is only available on macOS 10.14 Mojave or newer.
    *
    * @platform darwin
    */
  var appLevelAppearance: dark | light | unknown_ = js.native
  
  /**
    * A promise that resolves with `true` if consent was granted and `false` if it was
    * denied. If an invalid `mediaType` is passed, the promise will be rejected. If an
    * access request was denied and later is changed through the System Preferences
    * pane, a restart of the app will be required for the new permissions to take
    * effect. If access has already been requested and denied, it _must_ be changed
    * through the preference pane; an alert will not pop up and the promise will
    * resolve with the existing access status.
    *
    * **Important:** In order to properly leverage this API, you must set the
    * `NSMicrophoneUsageDescription` and `NSCameraUsageDescription` strings in your
    * app's `Info.plist` file. The values for these keys will be used to populate the
    * permission dialogs so that the user will be properly informed as to the purpose
    * of the permission request. See Electron Application Distribution for more
    * information about how to set these in the context of Electron.
    *
    * This user consent was not required until macOS 10.14 Mojave, so this method will
    * always return `true` if your system is running 10.13 High Sierra or lower.
    *
    * @platform darwin
    */
  def askForMediaAccess(mediaType: microphone | camera): js.Promise[Boolean] = js.native
  
  /**
    * whether or not this device has the ability to use Touch ID.
    *
    * **NOTE:** This API will return `false` on macOS systems older than Sierra
    * 10.12.2.
    *
    * @platform darwin
    */
  def canPromptTouchID(): Boolean = js.native
  
  /**
    * A `string` property that can be `dark`, `light` or `unknown`.
    *
    * Returns the macOS appearance setting that is currently applied to your
    * application, maps to NSApplication.effectiveAppearance
    *
    * @platform darwin
    */
  val effectiveAppearance: dark | light | unknown_ = js.native
  
  /**
    * The users current system wide accent color preference in RGBA hexadecimal form.
    *
    * This API is only available on macOS 10.14 Mojave or newer.
    *
    * @platform win32,darwin
    */
  def getAccentColor(): String = js.native
  
  /**
    * * `shouldRenderRichAnimation` boolean - Returns true if rich animations should
    * be rendered. Looks at session type (e.g. remote desktop) and accessibility
    * settings to give guidance for heavy animations.
    * * `scrollAnimationsEnabledBySystem` boolean - Determines on a per-platform basis
    * whether scroll animations (e.g. produced by home/end key) should be enabled.
    * * `prefersReducedMotion` boolean - Determines whether the user desires reduced
    * motion based on platform APIs.
    *
    * Returns an object with system animation settings.
    */
  def getAnimationSettings(): AnimationSettings = js.native
  
  /**
    * | `null` - Can be `dark`, `light` or `unknown`.
    *
    * Gets the macOS appearance setting that you have declared you want for your
    * application, maps to NSApplication.appearance. You can use the
    * `setAppLevelAppearance` API to set this value.
    *
    * @deprecated
    * @platform darwin
    */
  def getAppLevelAppearance(): dark | light | unknown_ = js.native
  
  /**
    * The system color setting in RGB hexadecimal form (`#ABCDEF`). See the Windows
    * docs and the macOS docs for more details.
    *
    * The following colors are only available on macOS 10.14: `find-highlight`,
    * `selected-content-background`, `separator`,
    * `unemphasized-selected-content-background`,
    * `unemphasized-selected-text-background`, and `unemphasized-selected-text`.
    *
    * @platform win32,darwin
    */
  def getColor(
    color: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 62, starting with typingsJapgolly.electron.electronStrings.`3d-dark-shadow`, typingsJapgolly.electron.electronStrings.`3d-face`, typingsJapgolly.electron.electronStrings.`3d-highlight` */ Any
  ): String = js.native
  
  /**
    * Can be `dark`, `light` or `unknown`.
    *
    * Gets the macOS appearance setting that is currently applied to your application,
    * maps to NSApplication.effectiveAppearance
    *
    * @platform darwin
    */
  def getEffectiveAppearance(): dark | light | unknown_ = js.native
  
  /**
    * Can be `not-determined`, `granted`, `denied`, `restricted` or `unknown`.
    *
    * This user consent was not required on macOS 10.13 High Sierra or lower so this
    * method will always return `granted`. macOS 10.14 Mojave or higher requires
    * consent for `microphone` and `camera` access. macOS 10.15 Catalina or higher
    * requires consent for `screen` access.
    *
    * Windows 10 has a global setting controlling `microphone` and `camera` access for
    * all win32 applications. It will always return `granted` for `screen` and for all
    * media types on older versions of Windows.
    *
    * @platform win32,darwin
    */
  def getMediaAccessStatus(mediaType: microphone | camera | screen): `not-determined` | granted | denied | restricted | unknown_ = js.native
  
  /**
    * The standard system color formatted as `#RRGGBBAA`.
    *
    * Returns one of several standard system colors that automatically adapt to
    * vibrancy and changes in accessibility settings like 'Increase contrast' and
    * 'Reduce transparency'. See Apple Documentation for  more details.
    *
    * @platform darwin
    */
  def getSystemColor(color: blue | brown | gray | green | orange | pink | purple | red | yellow): String = js.native
  
  /**
    * The value of `key` in `NSUserDefaults`.
    *
    * Some popular `key` and `type`s are:
    *
    * * `AppleInterfaceStyle`: `string`
    * * `AppleAquaColorVariant`: `integer`
    * * `AppleHighlightColor`: `string`
    * * `AppleShowScrollBars`: `string`
    * * `NSNavRecentPlaces`: `array`
    * * `NSPreferredWebServices`: `dictionary`
    * * `NSUserDictionaryReplacementItems`: `array`
    *
    * @platform darwin
    */
  @JSName("getUserDefault")
  def getUserDefault_array(key: String, `type`: array): js.Array[Any] = js.native
  @JSName("getUserDefault")
  def getUserDefault_boolean(key: String, `type`: boolean): Boolean = js.native
  @JSName("getUserDefault")
  def getUserDefault_dictionary(key: String, `type`: dictionary): Record[String, Any] = js.native
  @JSName("getUserDefault")
  def getUserDefault_double(key: String, `type`: double): Double = js.native
  @JSName("getUserDefault")
  def getUserDefault_float(key: String, `type`: float): Double = js.native
  @JSName("getUserDefault")
  def getUserDefault_integer(key: String, `type`: integer): Double = js.native
  @JSName("getUserDefault")
  def getUserDefault_string(key: String, `type`: string): String = js.native
  @JSName("getUserDefault")
  def getUserDefault_url(key: String, `type`: url): String = js.native
  
  /**
    * `true` if DWM composition (Aero Glass) is enabled, and `false` otherwise.
    *
    * An example of using it to determine if you should create a transparent window or
    * not (transparent windows won't work correctly when DWM composition is disabled):
    *
    * @platform win32
    */
  def isAeroGlassEnabled(): Boolean = js.native
  
  /**
    * Whether the system is in Dark Mode.
    *
    * **Deprecated:** Should use the new `nativeTheme.shouldUseDarkColors` API.
    *
    * @deprecated
    * @platform darwin,win32
    */
  def isDarkMode(): Boolean = js.native
  
  /**
    * `true` if a high contrast theme is active, `false` otherwise.
    *
    * **Deprecated:** Should use the new `nativeTheme.shouldUseHighContrastColors`
    * API.
    *
    * @deprecated
    * @platform darwin,win32
    */
  def isHighContrastColorScheme(): Boolean = js.native
  
  /**
    * `true` if an inverted color scheme (a high contrast color scheme with light text
    * and dark backgrounds) is active, `false` otherwise.
    *
    * **Deprecated:** Should use the new `nativeTheme.shouldUseInvertedColorScheme`
    * API.
    *
    * @deprecated
    * @platform win32
    */
  def isInvertedColorScheme(): Boolean = js.native
  
  /**
    * Whether the Swipe between pages setting is on.
    *
    * @platform darwin
    */
  def isSwipeTrackingFromScrollEventsEnabled(): Boolean = js.native
  
  /**
    * `true` if the current process is a trusted accessibility client and `false` if
    * it is not.
    *
    * @platform darwin
    */
  def isTrustedAccessibilityClient(prompt: Boolean): Boolean = js.native
  
  // Docs: https://electronjs.org/docs/api/system-preferences
  @JSName("on")
  def on_accentcolorchanged(
    event: `accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ String, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_colorchanged(event: `color-changed`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  /**
    * **Deprecated:** Should use the new `updated` event on the `nativeTheme` module.
    *
    * @deprecated
    * @platform win32
    */
  @JSName("on")
  def on_highcontrastcolorschemechanged(
    event: `high-contrast-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* highContrastColorScheme */ Boolean, Unit]
  ): this.type = js.native
  /**
    * **Deprecated:** Should use the new `updated` event on the `nativeTheme` module.
    *
    * @deprecated
    * @platform win32
    */
  @JSName("on")
  def on_invertedcolorschemechanged(
    event: `inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ Boolean, Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_accentcolorchanged(
    event: `accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_colorchanged(event: `color-changed`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("once")
  def once_highcontrastcolorschemechanged(
    event: `high-contrast-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* highContrastColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_invertedcolorschemechanged(
    event: `inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ Boolean, Unit]
  ): this.type = js.native
  
  /**
    * Posts `event` as native notifications of macOS. The `userInfo` is an Object that
    * contains the user information dictionary sent along with the notification.
    *
    * @platform darwin
    */
  def postLocalNotification(event: String, userInfo: Record[String, Any]): Unit = js.native
  
  /**
    * Posts `event` as native notifications of macOS. The `userInfo` is an Object that
    * contains the user information dictionary sent along with the notification.
    *
    * @platform darwin
    */
  def postNotification(event: String, userInfo: Record[String, Any]): Unit = js.native
  def postNotification(event: String, userInfo: Record[String, Any], deliverImmediately: Boolean): Unit = js.native
  
  /**
    * Posts `event` as native notifications of macOS. The `userInfo` is an Object that
    * contains the user information dictionary sent along with the notification.
    *
    * @platform darwin
    */
  def postWorkspaceNotification(event: String, userInfo: Record[String, Any]): Unit = js.native
  
  /**
    * resolves if the user has successfully authenticated with Touch ID.
    *
    * This API itself will not protect your user data; rather, it is a mechanism to
    * allow you to do so. Native apps will need to set Access Control Constants like
    * `kSecAccessControlUserPresence` on their keychain entry so that reading it would
    * auto-prompt for Touch ID biometric consent. This could be done with
    * `node-keytar`, such that one would store an encryption key with `node-keytar`
    * and only fetch it if `promptTouchID()` resolves.
    *
    * **NOTE:** This API will return a rejected Promise on macOS systems older than
    * Sierra 10.12.2.
    *
    * @platform darwin
    */
  def promptTouchID(reason: String): js.Promise[Unit] = js.native
  
  /**
    * Add the specified defaults to your application's `NSUserDefaults`.
    *
    * @platform darwin
    */
  def registerDefaults(defaults: Record[String, String | Boolean | Double]): Unit = js.native
  
  @JSName("removeListener")
  def removeListener_accentcolorchanged(
    event: `accent-color-changed`,
    listener: js.Function2[/* event */ Event, /* newColor */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_colorchanged(event: `color-changed`, listener: js.Function1[/* event */ Event, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_highcontrastcolorschemechanged(
    event: `high-contrast-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* highContrastColorScheme */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_invertedcolorschemechanged(
    event: `inverted-color-scheme-changed`,
    listener: js.Function2[/* event */ Event, /* invertedColorScheme */ Boolean, Unit]
  ): this.type = js.native
  
  /**
    * Removes the `key` in `NSUserDefaults`. This can be used to restore the default
    * or global value of a `key` previously set with `setUserDefault`.
    *
    * @platform darwin
    */
  def removeUserDefault(key: String): Unit = js.native
  
  /**
    * Sets the appearance setting for your application, this should override the
    * system default and override the value of `getEffectiveAppearance`.
    *
    * @deprecated
    * @platform darwin
    */
  def setAppLevelAppearance(): Unit = js.native
  def setAppLevelAppearance(appearance: dark | light): Unit = js.native
  
  /**
    * Set the value of `key` in `NSUserDefaults`.
    *
    * Note that `type` should match actual type of `value`. An exception is thrown if
    * they don't.
    *
    * Some popular `key` and `type`s are:
    *
    * * `ApplePressAndHoldEnabled`: `boolean`
    *
    * @platform darwin
    */
  @JSName("setUserDefault")
  def setUserDefault_array(key: String, `type`: array, value: js.Array[Any]): Unit = js.native
  @JSName("setUserDefault")
  def setUserDefault_boolean(key: String, `type`: boolean, value: Boolean): Unit = js.native
  @JSName("setUserDefault")
  def setUserDefault_dictionary(key: String, `type`: dictionary, value: Record[String, Any]): Unit = js.native
  @JSName("setUserDefault")
  def setUserDefault_double(key: String, `type`: double, value: Double): Unit = js.native
  @JSName("setUserDefault")
  def setUserDefault_float(key: String, `type`: float, value: Double): Unit = js.native
  @JSName("setUserDefault")
  def setUserDefault_integer(key: String, `type`: integer, value: Double): Unit = js.native
  @JSName("setUserDefault")
  def setUserDefault_string(key: String, `type`: string, value: String): Unit = js.native
  @JSName("setUserDefault")
  def setUserDefault_url(key: String, `type`: url, value: String): Unit = js.native
  
  /**
    * The ID of this subscription
    *
    * Same as `subscribeNotification`, but uses `NSNotificationCenter` for local
    * defaults. This is necessary for events such as
    * `NSUserDefaultsDidChangeNotification`.
    *
    * If `event` is null, the `NSNotificationCenter` doesn’t use it as criteria for
    * delivery to the observer. See docs for more information.
    *
    * @platform darwin
    */
  def subscribeLocalNotification(
    event: String,
    callback: js.Function3[/* event */ String, /* userInfo */ Record[String, Any], /* object */ String, Unit]
  ): Double = js.native
  def subscribeLocalNotification(
    event: Null,
    callback: js.Function3[/* event */ String, /* userInfo */ Record[String, Any], /* object */ String, Unit]
  ): Double = js.native
  
  /**
    * The ID of this subscription
    *
    * Subscribes to native notifications of macOS, `callback` will be called with
    * `callback(event, userInfo)` when the corresponding `event` happens. The
    * `userInfo` is an Object that contains the user information dictionary sent along
    * with the notification. The `object` is the sender of the notification, and only
    * supports `NSString` values for now.
    *
    * The `id` of the subscriber is returned, which can be used to unsubscribe the
    * `event`.
    *
    * Under the hood this API subscribes to `NSDistributedNotificationCenter`, example
    * values of `event` are:
    *
    * * `AppleInterfaceThemeChangedNotification`
    * * `AppleAquaColorVariantChanged`
    * * `AppleColorPreferencesChangedNotification`
    * * `AppleShowScrollBarsSettingChanged`
    *
    * If `event` is null, the `NSDistributedNotificationCenter` doesn’t use it as
    * criteria for delivery to the observer. See docs  for more information.
    *
    * @platform darwin
    */
  def subscribeNotification(
    event: String,
    callback: js.Function3[/* event */ String, /* userInfo */ Record[String, Any], /* object */ String, Unit]
  ): Double = js.native
  def subscribeNotification(
    event: Null,
    callback: js.Function3[/* event */ String, /* userInfo */ Record[String, Any], /* object */ String, Unit]
  ): Double = js.native
  
  /**
    * The ID of this subscription
    *
    * Same as `subscribeNotification`, but uses
    * `NSWorkspace.sharedWorkspace.notificationCenter`. This is necessary for events
    * such as `NSWorkspaceDidActivateApplicationNotification`.
    *
    * If `event` is null, the `NSWorkspaceNotificationCenter` doesn’t use it as
    * criteria for delivery to the observer. See docs for more information.
    *
    * @platform darwin
    */
  def subscribeWorkspaceNotification(
    event: String,
    callback: js.Function3[/* event */ String, /* userInfo */ Record[String, Any], /* object */ String, Unit]
  ): Double = js.native
  def subscribeWorkspaceNotification(
    event: Null,
    callback: js.Function3[/* event */ String, /* userInfo */ Record[String, Any], /* object */ String, Unit]
  ): Double = js.native
  
  /**
    * Same as `unsubscribeNotification`, but removes the subscriber from
    * `NSNotificationCenter`.
    *
    * @platform darwin
    */
  def unsubscribeLocalNotification(id: Double): Unit = js.native
  
  /**
    * Removes the subscriber with `id`.
    *
    * @platform darwin
    */
  def unsubscribeNotification(id: Double): Unit = js.native
  
  /**
    * Same as `unsubscribeNotification`, but removes the subscriber from
    * `NSWorkspace.sharedWorkspace.notificationCenter`.
    *
    * @platform darwin
    */
  def unsubscribeWorkspaceNotification(id: Double): Unit = js.native
}
