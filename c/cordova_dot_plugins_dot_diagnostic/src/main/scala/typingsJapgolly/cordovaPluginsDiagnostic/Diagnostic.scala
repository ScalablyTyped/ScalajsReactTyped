package typingsJapgolly.cordovaPluginsDiagnostic

import typingsJapgolly.cordovaPluginsDiagnostic.anon.ACCEPTHANDOVER
import typingsJapgolly.cordovaPluginsDiagnostic.anon.ALERT
import typingsJapgolly.cordovaPluginsDiagnostic.anon.ALWAYS
import typingsJapgolly.cordovaPluginsDiagnostic.anon.ARMv6
import typingsJapgolly.cordovaPluginsDiagnostic.anon.ApiLevel
import typingsJapgolly.cordovaPluginsDiagnostic.anon.BATTERYSAVING
import typingsJapgolly.cordovaPluginsDiagnostic.anon.DENIEDALWAYS
import typingsJapgolly.cordovaPluginsDiagnostic.anon.FULL
import typingsJapgolly.cordovaPluginsDiagnostic.anon.GRANTED
import typingsJapgolly.cordovaPluginsDiagnostic.anon.MinApiLevel
import typingsJapgolly.cordovaPluginsDiagnostic.anon.POWEREDOFF
import typingsJapgolly.cordovaPluginsDiagnostic.anon.POWEREDON
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Checks whether device hardware features are enabled or available to the app, e.g. camera, GPS, wifi
  */
@js.native
trait Diagnostic extends StObject {
  
  /**
    * ANDROID ONLY
    * Constants for the various NFC power states.
    * @type {Object}
    */
  var NFCState: POWEREDON = js.native
  
  /**
    * Constants for the various Bluetooth hardware states.
    * @type {Object}
    */
  var bluetoothState: POWEREDOFF = js.native
  
  /**
    * ANDROID ONLY
    * Constants for the various CPU architectures.
    * @type {Object}
    */
  var cpuArchitecture: ARMv6 = js.native
  
  /**
    * Enables debug mode, which logs native plugin debug messages to the native and JS consoles.
    * Debug mode is initially disabled on plugin initialisation.
    */
  var enableDebug: js.UndefOr[js.Function1[/* successCallback */ js.Function0[Unit], Unit]] = js.native
  
  /**
    * Returns CPU architecture of the current device.
    * @param successCallback
    * @param errorCallback
    */
  var getArchitecture: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* state */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Returns the background refresh authorization status for the application.
    * @param successCallback
    * @param errorCallback
    */
  var getBackgroundRefreshStatus: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Returns the Bluetooth authorization status of the application on the device.
    * @param successCallback
    * @param errorCallback
    */
  def getBluetoothAuthorizationStatus(
    successCallback: js.Function1[
      /* statuses */ js.Array[typingsJapgolly.cordovaPluginsDiagnostic.anon.String], 
      Unit
    ],
    errorCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  
  /**
    * ANDROID ONLY
    * Returns the authorization statuses for various Bluetooth run-time permissions on Android 12+ / API 31+
    * On Android 11 / API 30 and below, all will be returned as GRANTED if the manifest has BLUETOOTH since they are implicitly granted at build-time.
    * @param successCallback
    * @param errorCallback
    */
  var getBluetoothAuthorizationStatuses: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[
        /* statuses */ js.Array[typingsJapgolly.cordovaPluginsDiagnostic.anon.String], 
        Unit
      ], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Returns the state of Bluetooth on the device.
    * @param successCallback
    * @param errorCallback
    */
  var getBluetoothState: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* state */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Returns details of the SDK levels used to build the app.
    *
    * @param successCallback
    * @param errorCallback
    */
  var getBuildOSVersion: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* details */ MinApiLevel, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Returns the calendar authorization status for the application.
    * @param successCallback
    * @param errorCallback
    */
  var getCalendarAuthorizationStatus: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Returns the camera authorization status for the application.
    * @param successCallback
    * @param errorCallback
    * @param externalStorageOrParams
    */
  var getCameraAuthorizationStatus: js.UndefOr[
    js.Function3[
      /* successCallbackOrParams */ js.UndefOr[js.Function1[/* status */ String, Unit | js.Object]], 
      /* errorCallback */ js.UndefOr[js.Function1[/* error */ String, Unit]], 
      /* externalStorageOrParams */ js.UndefOr[Boolean | js.Object], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Returns the authorization status for the application to use the Camera Roll in Photos app.
    * @param successCallback
    * @param errorCallback
    */
  var getCameraRollAuthorizationStatus: js.UndefOr[
    js.Function3[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      /* accessLevel */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  
  /**
    * Returns the contacts authorization status for the application.
    * @param successCallback
    * @param errorCallback
    */
  var getContactsAuthorizationStatus: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Returns the current battery level of the device as a percentage.
    * @param successCallback
    * @param errorCallback
    */
  var getCurrentBatteryLevel: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* level */ Double, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Returns details of the OS of the device on which the app is currently running
    *
    * @param successCallback
    * @param errorCallback
    */
  var getDeviceOSVersion: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* details */ ApiLevel, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Returns details of external SD card(s): absolute path, is writable, free space
    * @param successCallback
    * @param errorCallback
    */
  var getExternalSdCardDetails: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ Any, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Returns the authorisation status for runtime permission to use the external storage.
    * @param successCallback
    * @param errorCallback
    */
  var getExternalStorageAuthorizationStatus: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Returns the location accuracy authorization for the application.
    * @param successCallback
    * @param errorCallback
    */
  var getLocationAccuracyAuthorization: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Returns the location authorization status for the application.
    * @param successCallback
    * @param errorCallback
    */
  var getLocationAuthorizationStatus: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Android ONLY
    * Returns the individual location authorization status for each type of location access (FINE, COARSE and BACKGROUND).
    * @param successCallback
    * @param errorCallback
    */
  var getLocationAuthorizationStatuses: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Returns the current location mode setting for the device.
    * @param successCallback
    * @param errorCallback
    */
  var getLocationMode: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* mode */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Returns the microphone authorization status for the application.
    * @param successCallback
    * @param errorCallback
    */
  var getMicrophoneAuthorizationStatus: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Checks motion authorization status for the application.
    * @param successCallback
    * @param errorCallback
    */
  var getMotionAuthorizationStatus: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Returns the current authorisation status for a given permission.
    * @param successCallback
    * @param errorCallback
    * @param permission
    */
  var getPermissionAuthorizationStatus: js.UndefOr[
    js.Function3[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      /* permission */ String, 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Returns the current authorisation status for multiple permissions.
    * @param successCallback
    * @param errorCallback
    * @param permissions
    */
  var getPermissionsAuthorizationStatus: js.UndefOr[
    js.Function3[
      /* successCallback */ js.Function1[/* status */ Record[String, String], Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      /* permissions */ js.Array[String], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Returns the reminders authorization status for the application.
    * @param successCallback
    * @param errorCallback
    */
  var getRemindersAuthorizationStatus: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Indicates the current setting of notification types for the app in the Settings app.
    * @param successCallback
    * @param errorCallback
    */
  var getRemoteNotificationTypes: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* types */ Any, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Returns the remote notifications authorization status for the application.
    * @param successCallback
    * @param errorCallback
    */
  var getRemoteNotificationsAuthorizationStatus: js.UndefOr[
    js.Function2[
      /* successCallbackOrParams */ js.UndefOr[js.Function1[/* status */ String, Unit | js.Object]], 
      /* errorCallback */ js.UndefOr[js.Function1[/* error */ String, Unit]], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Checks if the device supports Bluetooth Low Energy (LE) Peripheral mode.
    * @param successCallback
    * @param errorCallback
    */
  var hasBluetoothLEPeripheralSupport: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* supported */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Checks if the device has Bluetooth Low Energy (LE) capabilities.
    * @param successCallback
    * @param errorCallback
    */
  var hasBluetoothLESupport: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* supported */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Checks if the device has Bluetooth capabilities.
    * @param successCallback
    * @param errorCallback
    */
  var hasBluetoothSupport: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* supported */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Checks if ADB mode(debug mode) is enabled.
    * @param successCallback
    * @param errorCallback
    */
  var isADBModeEnabled: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* enabled */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    *
    * Checks if airplane mode is enabled on device.
    *
    * @param successCallback
    * @param errorCallback
    */
  var isAirplaneModeEnabled: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function0[Boolean], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Checks if the device setting for Airplane Mode is switched on.
    * @param successCallback
    * @param errorCallback
    */
  var isAirplaneModeOn: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* enabled */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Checks if the application is authorized for background refresh.
    * @param successCallback
    * @param errorCallback
    */
  var isBackgroundRefreshAuthorized: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* authorized */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Checks if Bluetooth is available to the app.
    * Returns true if the device has Bluetooth capabilities AND if Bluetooth setting is switched on (same on Android, iOS)
    * @param successCallback
    * @param errorCallback
    */
  def isBluetoothAvailable(
    successCallback: js.Function1[/* available */ Boolean, Unit],
    errorCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  
  /**
    * ANDROID ONLY
    * Checks if the device setting for Bluetooth is switched on.
    * @param successCallback
    * @param errorCallback
    */
  var isBluetoothEnabled: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* enabled */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Checks if the application is authorized to use the calendar.
    * @param successCallback
    * @param errorCallback
    */
  var isCalendarAuthorized: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* authorized */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Checks if the application is authorized to use the camera.
    * @param successCallback
    * @param errorCallback
    * @param externalStorageOrParams
    */
  var isCameraAuthorized: js.UndefOr[
    js.Function3[
      /* successCallbackOrParams */ js.UndefOr[js.Function1[/* authorized */ Boolean, Unit | js.Object]], 
      /* errorCallback */ js.UndefOr[js.Function1[/* error */ String, Unit]], 
      /* externalStorageOrParams */ js.UndefOr[Boolean | js.Object], 
      Unit
    ]
  ] = js.native
  
  /**
    * Checks if camera is available.
    * On Android & iOS this returns true if the device has a camera AND the application is authorized to use it.
    * @param successCallbackOrParams
    * @param errorCallback
    * @param externalStorageOrParams
    */
  def isCameraAvailable(): Unit = js.native
  def isCameraAvailable(successCallbackOrParams: js.Function1[/* available */ Boolean, Unit | js.Object]): Unit = js.native
  def isCameraAvailable(
    successCallbackOrParams: js.Function1[/* available */ Boolean, Unit | js.Object],
    errorCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  def isCameraAvailable(
    successCallbackOrParams: js.Function1[/* available */ Boolean, Unit | js.Object],
    errorCallback: js.Function1[/* error */ String, Unit],
    externalStorageOrParams: js.Object
  ): Unit = js.native
  def isCameraAvailable(
    successCallbackOrParams: js.Function1[/* available */ Boolean, Unit | js.Object],
    errorCallback: js.Function1[/* error */ String, Unit],
    externalStorageOrParams: Boolean
  ): Unit = js.native
  def isCameraAvailable(
    successCallbackOrParams: js.Function1[/* available */ Boolean, Unit | js.Object],
    errorCallback: Unit,
    externalStorageOrParams: js.Object
  ): Unit = js.native
  def isCameraAvailable(
    successCallbackOrParams: js.Function1[/* available */ Boolean, Unit | js.Object],
    errorCallback: Unit,
    externalStorageOrParams: Boolean
  ): Unit = js.native
  def isCameraAvailable(successCallbackOrParams: Unit, errorCallback: js.Function1[/* error */ String, Unit]): Unit = js.native
  def isCameraAvailable(
    successCallbackOrParams: Unit,
    errorCallback: js.Function1[/* error */ String, Unit],
    externalStorageOrParams: js.Object
  ): Unit = js.native
  def isCameraAvailable(
    successCallbackOrParams: Unit,
    errorCallback: js.Function1[/* error */ String, Unit],
    externalStorageOrParams: Boolean
  ): Unit = js.native
  def isCameraAvailable(successCallbackOrParams: Unit, errorCallback: Unit, externalStorageOrParams: js.Object): Unit = js.native
  def isCameraAvailable(successCallbackOrParams: Unit, errorCallback: Unit, externalStorageOrParams: Boolean): Unit = js.native
  
  /**
    * Checks if camera hardware is present on device.
    * @param successCallback
    * @param errorCallback
    */
  var isCameraPresent: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* present */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Checks if the application is authorized to use the Camera Roll in Photos app.
    * @param successCallback
    * @param errorCallback
    */
  var isCameraRollAuthorized: js.UndefOr[
    js.Function3[
      /* successCallback */ js.Function1[/* authorized */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      /* accessLevel */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  
  /**
    * Checks if the application is authorized to use contacts (address book).
    * @param successCallback
    * @param errorCallback
    */
  var isContactsAuthorized: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* authorized */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Checks if the device data roaming setting is enabled.
    * Returns true if data roaming is enabled.
    * @param successCallback
    * @param errorCallback
    */
  var isDataRoamingEnabled: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* enabled */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Checks if device is rooted.
    * @param successCallback
    * @param errorCallback
    */
  var isDeviceRooted: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* enabled */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Checks if the application is authorized to use external storage.
    * @param successCallback
    * @param errorCallback
    */
  var isExternalStorageAuthorized: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* authorized */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Checks if high-accuracy locations are available to the app from GPS hardware.
    * Returns true if Location mode is enabled and is set to "Device only" or "High accuracy" AND if the app is authorised to use location.
    * @param successCallback
    * @param errorCallback
    */
  var isGpsLocationAvailable: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* available */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Checks if the device location setting is set to return high-accuracy locations from GPS hardware.
    * Returns true if Location mode is enabled and is set to either Device only or High accuracy
    * @param successCallback
    * @param errorCallback
    */
  var isGpsLocationEnabled: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* enabled */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Checks if the application is authorized to use location.
    * @param successCallback
    * @param errorCallback
    */
  var isLocationAuthorized: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* authorized */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Checks if app is able to access device location.
    * @param successCallback
    * @param errorCallback
    */
  def isLocationAvailable(
    successCallback: js.Function1[/* available */ Boolean, Unit],
    errorCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  
  /**
    * Returns true if the device setting for location is on.
    * On Android this returns true if Location Mode is switched on.
    * On iOS this returns true if Location Services is switched on.
    * @param successCallback
    * @param errorCallback
    */
  var isLocationEnabled: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* enabled */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Checks if the application is authorized to use the microphone.
    * @param successCallback
    * @param errorCallback
    */
  var isMicrophoneAuthorized: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* authorized */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    *
    * Checks if mobile data is enabled on device.
    *
    * @param successCallback
    * @param errorCallback
    */
  var isMobileDataEnabled: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function0[Boolean], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Checks if motion tracking is available on the current device.
    * @param successCallback
    * @param errorCallback
    */
  var isMotionAvailable: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* available */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Checks if it's possible to determine the outcome of a motion authorization request on the current device.
    * @param successCallback
    * @param errorCallback
    */
  var isMotionRequestOutcomeAvailable: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* available */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    *  Checks if NFC is available to the app.
    * @param successCallback
    * @param errorCallback
    */
  var isNFCAvailable: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* present */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Checks if the device setting for NFC is switched on.
    * @param successCallback
    * @param errorCallback
    */
  var isNFCEnabled: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* present */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Checks if NFC hardware is present on device.
    * @param successCallback
    * @param errorCallback
    */
  var isNFCPresent: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* present */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Checks if low-accuracy locations are available to the app from network triangulation/WiFi access points.
    * Returns true if Location mode is enabled and is set to "Battery saving" or "High accuracy" AND if the app is authorised to use location.
    * @param successCallback
    * @param errorCallback
    */
  var isNetworkLocationAvailable: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* available */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Checks if the device location setting is set to return high-accuracy locations from GPS hardware.
    * Returns true if Location mode is enabled and is set to either Battery saving or High accuracy
    * @param successCallback
    * @param errorCallback
    */
  var isNetworkLocationEnabled: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* enabled */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Indicates if the app is registered for remote (push) notifications on the device.
    * @param successCallback
    * @param errorCallback
    */
  var isRegisteredForRemoteNotifications: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* registered */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Checks if the application is authorized to use reminders.
    * @param successCallback
    * @param errorCallback
    */
  var isRemindersAuthorized: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* authorized */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Checks if remote (push) notifications are enabled.
    * @param successCallback
    * @param errorCallback
    */
  var isRemoteNotificationsEnabled: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* enabled */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Indicates if the plugin is currently requesting a runtime permission via the native API.
    */
  var isRequestingPermission: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /**
    * Checks if Wifi is available.
    * On iOS this returns true if the device is connected to a network by WiFi.
    * On Android this returns true if the WiFi setting is set to enabled, and is the same as isWifiEnabled()
    * @param successCallback
    * @param errorCallback
    */
  def isWifiAvailable(
    successCallback: js.Function1[/* available */ Boolean, Unit],
    errorCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  
  /**
    * ANDROID ONLY
    * Returns true if the WiFi setting is set to enabled, and is the same as isWifiAvailable()
    * @param successCallback
    * @param errorCallback
    */
  var isWifiEnabled: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* enabled */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Location accuracy authorization
    * @type {Object}
    */
  var locationAccuracyAuthorization: FULL = js.native
  
  /**
    * Location authorization mode
    * @type {Object}
    */
  var locationAuthorizationMode: ALWAYS = js.native
  
  /**
    * ANDROID ONLY
    * Constants for the various location modes on Android.
    * @type {Object}
    */
  var locationMode: BATTERYSAVING = js.native
  
  /**
    * iOS ONLY
    * Constants for requesting and reporting the various motion states.
    * @type {Object}
    */
  var motionStatus: GRANTED = js.native
  
  /**
    * ANDROID ONLY
    * "Dangerous" permissions that need to be requested at run-time (Android 6.0/API 23 and above)
    * See http://developer.android.com/guide/topics/security/permissions.html#perm-groups
    * @type {Object}
    */
  var permission: ACCEPTHANDOVER = js.native
  
  /**
    * Constants for requesting and reporting the various permission states.
    * @type {Object}
    */
  var permissionStatus: DENIEDALWAYS = js.native
  
  /**
    * iOS ONLY
    * Presents limited library picker UI on iOS 14+
    * @param successCallback
    * @param errorCallback
    */
  var presentLimitedLibraryPicker: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* identifiers */ js.UndefOr[js.Array[String]], Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Registers a function to be called when a change in Bluetooth state occurs. Pass in a falsey value to de-register the currently registered function.
    * @param successCallback
    */
  var registerBluetoothStateChangeHandler: js.UndefOr[
    js.Function1[
      /* successCallback */ js.UndefOr[js.Function1[/* state */ String | Null, Unit]], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Registers a function to be called when a change in location accuracy authorization occurs.
    * @param successCallback
    */
  var registerLocationAccuracyAuthorizationChangeHandler: js.UndefOr[js.Function1[/* successCallback */ js.Function1[/* state */ String, Unit], Unit]] = js.native
  
  /**
    * Registers a function to be called when a change in Location state occurs. Pass in a falsey value to de-register the currently registered function.
    * On Android, this occurs when the Location Mode is changed.
    * On iOS, this occurs when location authorization status is changed. This can be triggered either by the user's response to a location permission authorization dialog, by the user turning on/off Location Services, or by the user changing the Location authorization state specifically for your app.
    * @param successCallback
    */
  var registerLocationStateChangeHandler: js.UndefOr[
    js.Function1[/* successCallback */ js.UndefOr[js.Function1[/* state */ String, Unit]], Unit]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Registers a function to be called when a change in NFC state occurs.
    * Pass in a falsey value to de-register the currently registered function.
    * @param successCallback
    */
  var registerNFCStateChangeHandler: js.UndefOr[
    js.Function1[/* successCallback */ js.UndefOr[js.Function1[/* state */ String, Unit]], Unit]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Registers a function to be called when a runtime permission request has completed. Pass in a falsey value to de-register the currently registered function.
    * @param successCallback
    */
  var registerPermissionRequestCompleteHandler: js.UndefOr[
    js.Function1[/* successCallback */ js.UndefOr[js.Function1[/* statuses */ Any, Unit]], Unit]
  ] = js.native
  
  /**
    * iOS ONLY
    * Constants for requesting/reporting the various types of remote notification permission types on iOS devices.
    * @type {Object}
    */
  var remoteNotificationType: ALERT = js.native
  
  /**
    * Requests Bluetooth authorization for the application.
    * @param successCallback
    * @param errorCallback
    * @param permissions - ANDROID ONLY
    */
  var requestBluetoothAuthorization: js.UndefOr[
    js.Function3[
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      /* permissions */ js.UndefOr[js.Array[String]], 
      Unit
    ]
  ] = js.native
  
  /**
    * Requests calendar authorization for the application.
    * @param successCallback
    * @param errorCallback
    */
  var requestCalendarAuthorization: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Requests camera authorization for the application.
    * @param successCallback
    * @param errorCallback
    * @param externalStorageOrParams
    */
  var requestCameraAuthorization: js.UndefOr[
    js.Function3[
      /* successCallbackOrParams */ js.UndefOr[js.Function1[/* status */ String, Unit | js.Object]], 
      /* errorCallback */ js.UndefOr[js.Function1[/* error */ String, Unit]], 
      /* externalStorageOrParams */ js.UndefOr[Boolean | js.Object], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Requests camera roll authorization for the application.
    * @param successCallback
    * @param errorCallback
    */
  var requestCameraRollAuthorization: js.UndefOr[
    js.Function3[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      /* accessLevel */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  
  /**
    * Requests contacts authorization for the application.
    * @param successCallback
    * @param errorCallback
    */
  var requestContactsAuthorization: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Requests authorisation for runtime permission to use the external storage.
    * @param successCallback
    * @param errorCallback
    */
  var requestExternalStorageAuthorization: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * Requests location authorization for the application.
    * @param successCallback
    * @param errorCallback
    * @param mode - (optional / iOS & Android >= 10) location authorization mode specified as a locationAuthorizationMode constant. If not specified, defaults to WHEN_IN_USE.
    * @param accuracy
    */
  var requestLocationAuthorization: js.UndefOr[
    js.Function4[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      /* mode */ js.UndefOr[String], 
      /* accuracy */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  
  /**
    * Requests microphone authorization for the application.
    * @param successCallback
    * @param errorCallback
    */
  var requestMicrophoneAuthorization: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Requests motion authorization for the application.
    * @param successCallback
    * @param errorCallback
    */
  var requestMotionAuthorization: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Requests reminders authorization for the application.
    * @param successCallback
    * @param errorCallback
    */
  var requestRemindersAuthorization: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Requests remote notifications authorization for the application.
    * @param successCallback
    * @param errorCallback
    * @param types
    * @param omitRegistration
    */
  var requestRemoteNotificationsAuthorization: js.UndefOr[
    js.Function4[
      /* successCallbackOrParams */ js.UndefOr[js.Function1[/* status */ String, Unit | js.Object]], 
      /* errorCallback */ js.UndefOr[js.Function1[/* error */ String, Unit]], 
      /* types */ js.UndefOr[js.Array[String]], 
      /* omitRegistration */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Requests app to be granted authorisation for a runtime permission.
    * @param successCallback
    * @param errorCallback
    * @param permission
    */
  var requestRuntimePermission: js.UndefOr[
    js.Function3[
      /* successCallback */ js.Function1[/* status */ String, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      /* permission */ String, 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Requests app to be granted authorisation for multiple runtime permissions.
    * @param successCallback
    * @param errorCallback
    * @param permissions
    */
  var requestRuntimePermissions: js.UndefOr[
    js.Function3[
      /* successCallback */ js.Function1[/* status */ Record[String, String], Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      /* permissions */ js.Array[String], 
      Unit
    ]
  ] = js.native
  
  /**
    * iOS ONLY
    * Requests temporary access to full location accuracy for the application.
    * @param purpose
    * @param successCallback
    * @param errorCallback
    */
  var requestTemporaryFullAccuracyAuthorization: js.UndefOr[
    js.Function3[
      /* purpose */ String, 
      /* successCallback */ js.UndefOr[js.Function1[/* status */ String, Unit]], 
      /* errorCallback */ js.UndefOr[js.Function1[/* error */ String, Unit]], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Restarts the application.
    * By default, a "warm" restart will be performed in which the main Cordova activity is immediately restarted, causing the Webview instance to be recreated.
    * However, if the `cold` parameter is set to true, then the application will be "cold" restarted, meaning a system exit will be performed, causing the entire application to be restarted.
    * This is useful if you want to fully reset the native application state but will cause the application to briefly disappear and re-appear.
    *
    * Note: There is no successCallback() since if the operation is successful, the application will restart immediately before any success callback can be applied.
    * @param {(error: string) => void} errorCallback
    * @param {boolean} cold
    */
  var restart: js.UndefOr[
    js.Function2[/* errorCallback */ js.Function1[/* error */ String, Unit], /* cold */ Boolean, Unit]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Enables/disables Bluetooth on the device.
    * @param successCallback
    * @param errorCallback
    * @param state
    */
  var setBluetoothState: js.UndefOr[
    js.Function3[
      /* successCallback */ js.Function1[/* enabled */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      /* state */ Boolean, 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Enables/disables WiFi on the device.
    * @param successCallback
    * @param errorCallback
    * @param state
    */
  var setWifiState: js.UndefOr[
    js.Function3[
      /* successCallback */ js.Function1[/* enabled */ Boolean, Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      /* state */ Boolean, 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Displays Bluetooth settings to allow user to enable Bluetooth.
    */
  var switchToBluetoothSettings: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * ANDROID ONLY
    * Displays the device location settings to allow user to enable location services/change location mode.
    */
  var switchToLocationSettings: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * ANDROID ONLY
    * Displays mobile settings to allow user to enable mobile data.
    */
  var switchToMobileDataSettings: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Opens settings page for this app.
    * On Android, this opens the "App Info" page in the Settings app.
    * On iOS, this opens the app settings page in the Settings app.
    */
  var switchToSettings: js.UndefOr[
    js.Function2[
      /* successCallback */ js.Function0[Unit], 
      /* errorCallback */ js.Function1[/* error */ String, Unit], 
      Unit
    ]
  ] = js.native
  
  /**
    * ANDROID ONLY
    * Displays WiFi settings to allow user to enable WiFi.
    */
  var switchToWifiSettings: js.UndefOr[js.Function0[Unit]] = js.native
}
