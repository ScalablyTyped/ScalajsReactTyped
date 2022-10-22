package typingsJapgolly.detox.mod.global.Detox

import typingsJapgolly.detox.anon.SourceApp
import typingsJapgolly.detox.detoxStrings.android
import typingsJapgolly.detox.detoxStrings.ios
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends StObject {
  
  /**
    * Access the user-defined launch-arguments predefined through static scopes such as the Detox configuration file and
    * command-line arguments. This access allows - through dedicated methods, for both value-querying and
    * modification (see {@link AppLaunchArgs}).
    * Refer to the [dedicated guide](https://wix.github.io/Detox/docs/api/launch-args) for complete details.
    *
    * @example
    * // With Detox being preconfigured statically to use these arguments in app launch:
    * // {
    * //   mockServerPort: 1234,
    * // }
    * // The following code would result in these arguments eventually passed into the launched app:
    * // {
    * //   mockServerPort: 4321,
    * //   mockServerToken: 'uvwxyz',
    * // }
    * device.appLaunchArgs.modify({
    *   mockServerPort: 4321,
    *   mockServerToken: 'abcdef',
    * });
    * await device.launchApp({ launchArgs: { mockServerToken: 'uvwxyz' } }};
    *
    * @see AppLaunchArgs
    */
  var appLaunchArgs: AppLaunchArgs = js.native
  
  /**
    * (iOS only) Saves a view hierarchy snapshot (*.viewhierarchy) of the currently opened application
    * to a temporary folder and schedules putting it to the artifacts folder upon the completion of
    * the current test. The file can be opened later in Xcode 12.0 and above.
    * @see https://developer.apple.com/documentation/xcode-release-notes/xcode-12-release-notes#:~:text=57933113
    * @param [name="capture"] optional name for the *.viewhierarchy artifact
    * @returns a temporary path to the captured view hierarchy snapshot.
    * @example
    * test('Menu items should have logout', async () => {
    *   await device.captureViewHierarchy('myElements');
    *   // The temporary path will remain valid until the test completion.
    *   // Afterwards, the artifact will be moved, e.g.:
    *   // * on success, to: <artifacts-location>/✓ Menu items should have Logout/myElements.viewhierarchy
    *   // * on failure, to: <artifacts-location>/✗ Menu items should have Logout/myElements.viewhierarchy
    * });
    */
  def captureViewHierarchy(): js.Promise[String] = js.native
  def captureViewHierarchy(name: String): js.Promise[String] = js.native
  
  /**
    * Clears the simulator keychain (iOS Only)
    */
  def clearKeychain(): js.Promise[Unit] = js.native
  
  /**
    * Temporarily disable synchronization (idle/busy monitoring) with the app - namely, stop waiting for the app to go idle before moving forward in the test execution.
    *
    * <p/>This API is useful for cases where test assertions must be made in an area of your application where it is okay for it to ever remain partly *busy* (e.g. due to an
    * endlessly repeating on-screen animation). However, using it inherently suggests that you are likely to resort to applying `sleep()`'s in your test code - testing
    * that area, **which is not recommended and can never be 100% stable.
    * **Therefore, as a rule of thumb, test code running "inside" a sync-disabled mode must be reduced to the bare minimum.
    *
    * <p/>Note: Synchronization is enabled by default, and it gets **reenabled on every launch of a new instance of the app.**
    *
    * @example await device.disableSynchronization();
    */
  def disableSynchronization(): js.Promise[Unit] = js.native
  
  /**
    * Reenable synchronization (idle/busy monitoring) with the app - namely, resume waiting for the app to go idle before moving forward in the test execution, after a
    * previous disabling of it through a call to `device.disableSynchronization()`.
    *
    * <p/>Warning: Making this call would resume synchronization **instantly**, having its returned promise only resolve when the app becomes idle again.
    * In other words, this **must only be called after you navigate back to "the safe zone", where the app should be able to eventually become idle again**, or it would
    * remain suspended "forever" (i.e. until a safeguard time-out expires).
    *
    * @example await device.enableSynchronization();
    */
  def enableSynchronization(): js.Promise[Unit] = js.native
  
  /**
    * Returns the current device, ios or android.
    *
    * @example
    * if (device.getPlatform() === 'ios') {
    *     await expect(loopSwitch).toHaveValue('1');
    * }
    */
  def getPlatform(): ios | android = js.native
  
  /**
    * (Android Only)
    * Exposes UiAutomator's UiDevice API (https://developer.android.com/reference/android/support/test/uiautomator/UiDevice).
    * This is not a part of the official Detox API,
    * it may break and change whenever an update to UiDevice or UiAutomator gradle dependencies ('androidx.test.uiautomator:uiautomator') is introduced.
    * UIDevice's autogenerated code reference: https://github.com/wix/Detox/blob/master/detox/src/android/espressoapi/UIDevice.js
    */
  def getUiDevice(): js.Promise[Unit] = js.native
  
  /**
    * Holds the environment-unique ID of the device - namely, the adb ID on Android (e.g. emulator-5554) and the Mac-global simulator UDID on iOS,
    * as used by simctl (e.g. AAAAAAAA-BBBB-CCCC-DDDD-EEEEEEEEEEEE).
    *
    * The value will be undefined until the device is properly prepared (i.e. in detox.init())
    */
  var id: String = js.native
  
  /**
    * By default, installApp() with no params will install the app file defined in the current configuration.
    * To install another app, specify its path
    * @example await device.installApp();
    * @example await device.installApp('path/to/other/app');
    */
  def installApp(): js.Promise[Unit] = js.native
  def installApp(path: Any): js.Promise[Unit] = js.native
  
  /**
    * Launch the app.
    *
    * <p>For info regarding launch arguments, refer to the [dedicated guide](https://wix.github.io/Detox/docs/api/launch-args).
    *
    * @example
    * // Terminate the app and launch it again. If set to false, the simulator will try to bring app from background,
    * // if the app isn't running, it will launch a new instance. default is false
    * await device.launchApp({newInstance: true});
    * @example
    * // Grant or deny runtime permissions for your application.
    * await device.launchApp({permissions: {calendar: 'YES'}});
    * @example
    * // Mock opening the app from URL to test your app's deep link handling mechanism.
    * await device.launchApp({url: url});
    * @example
    * // Start the app with some custom arguments.
    * await device.launchApp({
    *   launchArgs: {arg1: 1, arg2: "2"},
    * });
    */
  def launchApp(): js.Promise[Unit] = js.native
  def launchApp(config: DeviceLaunchAppConfig): js.Promise[Unit] = js.native
  
  /**
    * Simulates the success of a face match via FaceID (iOS Only)
    */
  def matchFace(): js.Promise[Unit] = js.native
  
  /**
    * Simulates the success of a finger match via TouchID (iOS Only)
    */
  def matchFinger(): js.Promise[Unit] = js.native
  
  /**
    * Holds a descriptive name of the device. Example: emulator-5554 (Pixel_API_29)
    * The value will be undefined until the device is properly prepared (i.e. in detox.init()).
    */
  var name: String = js.native
  
  /**
    * Mock opening the app from URL. sourceApp is an optional parameter to specify source application bundle id.
    */
  def openURL(url: SourceApp): js.Promise[Unit] = js.native
  
  /**
    * Simulate press back button (Android Only)
    * @example await device.pressBack();
    */
  def pressBack(): js.Promise[Unit] = js.native
  
  /**
    * If this is a React Native app, reload the React Native JS bundle. This action is much faster than device.launchApp(), and can be used if you just need to reset your React Native logic.
    *
    * @example await device.reloadReactNative()
    */
  def reloadReactNative(): js.Promise[Unit] = js.native
  
  /**
    * Resets the Simulator to clean state (like the Simulator > Reset Content and Settings... menu item), especially removing previously set permissions.
    *
    * @example await device.resetContentAndSettings();
    */
  def resetContentAndSettings(): js.Promise[Unit] = js.native
  
  /**
    * (Android Only)
    * Runs `adb reverse tcp:PORT tcp:PORT` for the current device
    * to enable network requests forwarding on localhost:PORT (computer<->device).
    * For more information, see {@link https://www.reddit.com/r/reactnative/comments/5etpqw/what_do_you_call_what_adb_reverse_is_doing|here}.
    * This is a no-op when running on iOS.
    */
  def reverseTcpPort(port: Double): js.Promise[Unit] = js.native
  
  /**
    * Select the current app (relevant only to multi-app configs) by its name.
    * After execution, all app-specific device methods will target the selected app.
    *
    * @see DetoxAppConfig#name
    * @example
    * await device.selectApp('passenger');
    * await device.launchApp(); // passenger
    * // ... run tests for the passenger app
    * await device.uninstallApp(); // passenger
    * await device.selectApp('driver');
    * await device.installApp(); // driver
    * await device.launchApp(); // driver
    * // ... run tests for the driver app
    * await device.terminateApp(); // driver
    */
  def selectApp(app: String): js.Promise[Unit] = js.native
  
  /**
    * Send application to background by bringing com.apple.springboard to the foreground.
    * Combining sendToHome() with launchApp({newInstance: false}) will simulate app coming back from background.
    * @example
    * await device.sendToHome();
    * await device.launchApp({newInstance: false});
    */
  def sendToHome(): js.Promise[Unit] = js.native
  
  /**
    * Mock handling of received user activity when app is in foreground.
    */
  def sendUserActivity(params: Any*): js.Promise[Unit] = js.native
  
  /**
    * Mock handling of received user notification when app is in foreground.
    */
  def sendUserNotification(params: Any*): js.Promise[Unit] = js.native
  
  /**
    * Toggles device enrollment in biometric auth (TouchID or FaceID) (iOS Only)
    * @example await device.setBiometricEnrollment(true);
    * @example await device.setBiometricEnrollment(false);
    */
  def setBiometricEnrollment(enabled: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Sets the simulator/emulator location to the given latitude and longitude.
    *
    * <p/>On iOS `setLocation` is dependent on [fbsimctl](https://github.com/facebook/idb/tree/4b7929480c3c0f158f33f78a5b802c1d0e7030d2/fbsimctl)
    * which [is now deprecated](https://github.com/wix/Detox/issues/1371).
    * If `fbsimctl` is not installed, the command will fail, asking for it to be installed.
    *
    * <p/>On Android `setLocation` will work with both Android Emulator (bundled with Android development tools) and Genymotion.
    * The correct permissions must be set in your app manifest.
    *
    * @example await device.setLocation(32.0853, 34.7818);
    */
  def setLocation(lat: Double, lon: Double): js.Promise[Unit] = js.native
  
  /**
    * Takes "portrait" or "landscape" and rotates the device to the given orientation. Currently only available in the iOS Simulator.
    */
  def setOrientation(orientation: Orientation): js.Promise[Unit] = js.native
  
  /**
    * Disable EarlGrey's network synchronization mechanism on preferred endpoints. Useful if you want to on skip over synchronizing on certain URLs.
    *
    * @example await device.setURLBlacklist(['.*127.0.0.1.*']);
    */
  def setURLBlacklist(urls: js.Array[String]): js.Promise[Unit] = js.native
  
  /**
    * Simulate shake (iOS Only)
    */
  def shake(): js.Promise[Unit] = js.native
  
  /**
    * Takes a screenshot on the device and schedules putting it in the artifacts folder upon completion of the current test.
    * @param name for the screenshot artifact
    * @returns a temporary path to the screenshot.
    * @example
    * test('Menu items should have logout', async () => {
    *   const tempPath = await device.takeScreenshot('tap on menu');
    *   // The temporary path will remain valid until the test completion.
    *   // Afterwards, the screenshot will be moved, e.g.:
    *   // * on success, to: <artifacts-location>/✓ Menu items should have Logout/tap on menu.png
    *   // * on failure, to: <artifacts-location>/✗ Menu items should have Logout/tap on menu.png
    * });
    */
  def takeScreenshot(name: String): js.Promise[String] = js.native
  
  /**
    * Terminate the app.
    *
    * @example
    * // By default, terminateApp() with no params will terminate the app
    * await device.terminateApp();
    * @example
    * // To terminate another app, specify its bundle id
    * await device.terminateApp('other.bundle.id');
    */
  def terminateApp(): js.Promise[Unit] = js.native
  def terminateApp(bundle: String): js.Promise[Unit] = js.native
  
  /**
    * By default, uninstallApp() with no params will uninstall the app defined in the current configuration.
    * To uninstall another app, specify its bundle id
    * @example await device.installApp('other.bundle.id');
    */
  def uninstallApp(): js.Promise[Unit] = js.native
  def uninstallApp(bundle: String): js.Promise[Unit] = js.native
  
  /**
    * Simulates the failure of a face match via FaceID (iOS Only)
    */
  def unmatchFace(): js.Promise[Unit] = js.native
  
  /**
    * Simulates the failure of a finger match via TouchID (iOS Only)
    */
  def unmatchFinger(): js.Promise[Unit] = js.native
  
  /**
    * (Android Only)
    * Runs `adb reverse --remove tcp:PORT tcp:PORT` for the current device
    * to disable network requests forwarding on localhost:PORT (computer<->device).
    * For more information, see {@link https://www.reddit.com/r/reactnative/comments/5etpqw/what_do_you_call_what_adb_reverse_is_doing|here}.
    * This is a no-op when running on iOS.
    */
  def unreverseTcpPort(port: Double): js.Promise[Unit] = js.native
}
