package typingsJapgolly.chromeApps.global.chrome

import typingsJapgolly.chromeApps.Window
import typingsJapgolly.chromeApps.anon.APPUPDATE
import typingsJapgolly.chromeApps.anon.NOUPDATE
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chrome.runtime.ConnectInfo
import typingsJapgolly.chromeApps.chrome.runtime.ExtensionConnectEvent
import typingsJapgolly.chromeApps.chrome.runtime.ExtensionMessageEvent
import typingsJapgolly.chromeApps.chrome.runtime.InstalledDetails
import typingsJapgolly.chromeApps.chrome.runtime.LastError
import typingsJapgolly.chromeApps.chrome.runtime.Manifest
import typingsJapgolly.chromeApps.chrome.runtime.MessageOptions
import typingsJapgolly.chromeApps.chrome.runtime.PlatformInfo
import typingsJapgolly.chromeApps.chrome.runtime.Port
import typingsJapgolly.chromeApps.chrome.runtime.RuntimeEvent
import typingsJapgolly.chromeApps.chrome.runtime.UpdateAvailableDetails
import typingsJapgolly.chromeApps.chrome.runtime.UpdateCheckDetails
import typingsJapgolly.chromeApps.chromeAppsStrings.APP_UPDATE
import typingsJapgolly.chromeApps.chromeAppsStrings.NO_UPDATE
import typingsJapgolly.chromeApps.chromeAppsStrings.OS_UPDATE
import typingsJapgolly.chromeApps.chromeAppsStrings.PERIODIC
import typingsJapgolly.chromeApps.chromeAppsStrings.THROTTLED
import typingsJapgolly.chromeApps.chromeAppsStrings.UPDATE_AVAILABLE
import typingsJapgolly.chromeApps.chromeAppsStrings.`x86-32`
import typingsJapgolly.chromeApps.chromeAppsStrings.`x86-64`
import typingsJapgolly.chromeApps.chromeAppsStrings.android_
import typingsJapgolly.chromeApps.chromeAppsStrings.app_update_
import typingsJapgolly.chromeApps.chromeAppsStrings.arm_
import typingsJapgolly.chromeApps.chromeAppsStrings.chrome_update_
import typingsJapgolly.chromeApps.chromeAppsStrings.cros_
import typingsJapgolly.chromeApps.chromeAppsStrings.install_
import typingsJapgolly.chromeApps.chromeAppsStrings.linux_
import typingsJapgolly.chromeApps.chromeAppsStrings.mac_
import typingsJapgolly.chromeApps.chromeAppsStrings.mips64_
import typingsJapgolly.chromeApps.chromeAppsStrings.mips_
import typingsJapgolly.chromeApps.chromeAppsStrings.no_update_
import typingsJapgolly.chromeApps.chromeAppsStrings.openbsd_
import typingsJapgolly.chromeApps.chromeAppsStrings.os_update_
import typingsJapgolly.chromeApps.chromeAppsStrings.periodic_
import typingsJapgolly.chromeApps.chromeAppsStrings.shared_module_update_
import typingsJapgolly.chromeApps.chromeAppsStrings.throttled_
import typingsJapgolly.chromeApps.chromeAppsStrings.update_
import typingsJapgolly.chromeApps.chromeAppsStrings.update_available_
import typingsJapgolly.chromeApps.chromeAppsStrings.win_
import typingsJapgolly.filesystem.DirectoryEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.runtime
/////////////
// Runtime //
/////////////
/**
  * Use the chrome.runtime API to retrieve the background page, return details about the manifest, and listen for and respond to events in the app lifecycle. You can also use this API to convert the relative path of URLs to fully-qualified URLs.
  * @since Chrome 22
  */
object runtime {
  
  @JSGlobal("chrome.runtime")
  @js.native
  val ^ : js.Any = js.native
  
  object OnInstalledReason {
    
    @JSGlobal("chrome.runtime.OnInstalledReason")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.runtime.OnInstalledReason.CHROME_UPDATE")
    @js.native
    def CHROME_UPDATE: chrome_update_ = js.native
    inline def CHROME_UPDATE_=(x: chrome_update_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHROME_UPDATE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.OnInstalledReason.INSTALL")
    @js.native
    def INSTALL: install_ = js.native
    inline def INSTALL_=(x: install_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTALL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.OnInstalledReason.SHARED_MODULE_UPDATE")
    @js.native
    def SHARED_MODULE_UPDATE: shared_module_update_ = js.native
    inline def SHARED_MODULE_UPDATE_=(x: shared_module_update_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHARED_MODULE_UPDATE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.OnInstalledReason.UPDATE")
    @js.native
    def UPDATE: update_ = js.native
    inline def UPDATE_=(x: update_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPDATE")(x.asInstanceOf[js.Any])
  }
  
  object OnRestartRequiredReason {
    
    @JSGlobal("chrome.runtime.OnRestartRequiredReason")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.runtime.OnRestartRequiredReason.APP_UPDATE")
    @js.native
    def APP_UPDATE: app_update_ = js.native
    inline def APP_UPDATE_=(x: app_update_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APP_UPDATE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.OnRestartRequiredReason.OS_UPDATE")
    @js.native
    def OS_UPDATE: os_update_ = js.native
    inline def OS_UPDATE_=(x: os_update_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OS_UPDATE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.OnRestartRequiredReason.PERIODIC")
    @js.native
    def PERIODIC: periodic_ = js.native
    inline def PERIODIC_=(x: periodic_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERIODIC")(x.asInstanceOf[js.Any])
  }
  
  object PlatformArch {
    
    @JSGlobal("chrome.runtime.PlatformArch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.runtime.PlatformArch.ARM")
    @js.native
    def ARM: arm_ = js.native
    inline def ARM_=(x: arm_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARM")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformArch.MIPS")
    @js.native
    def MIPS: mips_ = js.native
    
    @JSGlobal("chrome.runtime.PlatformArch.MIPS64")
    @js.native
    def MIPS64: mips64_ = js.native
    inline def MIPS64_=(x: mips64_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIPS64")(x.asInstanceOf[js.Any])
    
    inline def MIPS_=(x: mips_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIPS")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformArch.X86_32")
    @js.native
    def X86_32: `x86-32` = js.native
    inline def X86_32_=(x: `x86-32`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X86_32")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformArch.X86_64")
    @js.native
    def X86_64: `x86-64` = js.native
    inline def X86_64_=(x: `x86-64`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X86_64")(x.asInstanceOf[js.Any])
  }
  
  /* was `typeof PlatformArch` */
  object PlatformNaclArch {
    
    @JSGlobal("chrome.runtime.PlatformNaclArch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.runtime.PlatformNaclArch.ARM")
    @js.native
    def ARM: arm_ = js.native
    inline def ARM_=(x: arm_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARM")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformNaclArch.MIPS")
    @js.native
    def MIPS: mips_ = js.native
    
    @JSGlobal("chrome.runtime.PlatformNaclArch.MIPS64")
    @js.native
    def MIPS64: mips64_ = js.native
    inline def MIPS64_=(x: mips64_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIPS64")(x.asInstanceOf[js.Any])
    
    inline def MIPS_=(x: mips_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIPS")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformNaclArch.X86_32")
    @js.native
    def X86_32: `x86-32` = js.native
    inline def X86_32_=(x: `x86-32`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X86_32")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformNaclArch.X86_64")
    @js.native
    def X86_64: `x86-64` = js.native
    inline def X86_64_=(x: `x86-64`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X86_64")(x.asInstanceOf[js.Any])
  }
  
  object PlatformOs {
    
    @JSGlobal("chrome.runtime.PlatformOs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.runtime.PlatformOs.ANDROID")
    @js.native
    def ANDROID: android_ = js.native
    inline def ANDROID_=(x: android_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANDROID")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformOs.CROS")
    @js.native
    def CROS: cros_ = js.native
    inline def CROS_=(x: cros_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CROS")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformOs.LINUX")
    @js.native
    def LINUX: linux_ = js.native
    inline def LINUX_=(x: linux_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINUX")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformOs.MAC")
    @js.native
    def MAC: mac_ = js.native
    inline def MAC_=(x: mac_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAC")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformOs.OPENBSD")
    @js.native
    def OPENBSD: openbsd_ = js.native
    inline def OPENBSD_=(x: openbsd_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENBSD")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformOs.WIN")
    @js.native
    def WIN: win_ = js.native
    inline def WIN_=(x: win_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WIN")(x.asInstanceOf[js.Any])
  }
  
  object RequestUpdateCheckStatus {
    
    @JSGlobal("chrome.runtime.RequestUpdateCheckStatus")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.runtime.RequestUpdateCheckStatus.NO_UPDATE")
    @js.native
    def NO_UPDATE: no_update_ = js.native
    inline def NO_UPDATE_=(x: no_update_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_UPDATE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.RequestUpdateCheckStatus.THROTTLED")
    @js.native
    def THROTTLED: throttled_ = js.native
    inline def THROTTLED_=(x: throttled_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THROTTLED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.RequestUpdateCheckStatus.UPDATE_AVAILABLE")
    @js.native
    def UPDATE_AVAILABLE: update_available_ = js.native
    inline def UPDATE_AVAILABLE_=(x: update_available_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPDATE_AVAILABLE")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Attempts to connect to connect listeners within an app (such as the background page), or other apps.
    * This is useful for content scripts connecting to their extension processes, inter-app communication, and web messaging.
    * Note that this does not connect to any listeners in a content script.
    * @since Chrome 26.
    */
  inline def connect(): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[Port]
  inline def connect(connectInfo: ConnectInfo): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(connectInfo.asInstanceOf[js.Any]).asInstanceOf[Port]
  /**
    * Attempts to connect to connect listeners within an app (such as the background page), or other apps.
    * This is useful for content scripts connecting to their extension processes, inter-app communication, and web messaging.
    * Note that this does not connect to any listeners in a content script.
    * @since Chrome 26.
    * @param extensionId Optional; ID of the extension.
    * The ID of the extension or app to connect to.
    * If omitted, a connection will be attempted with your own app.
    * Required if sending messages from a web page for web messaging.
    */
  inline def connect(extensionId: String): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(extensionId.asInstanceOf[js.Any]).asInstanceOf[Port]
  inline def connect(extensionId: String, connectInfo: ConnectInfo): Port = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(extensionId.asInstanceOf[js.Any], connectInfo.asInstanceOf[js.Any])).asInstanceOf[Port]
  
  /**
    * Connects to a native application in the host machine.
    * @since Chrome 28.
    * @param application The name of the registered application to connect to.
    */
  inline def connectNative(application: String): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connectNative")(application.asInstanceOf[js.Any]).asInstanceOf[Port]
  
  /**
    * Retrieves the JavaScript 'window' object for the background page running inside the current app.
    * If the background page is an event page, the system will ensure it is loaded before calling the callback.
    * If there is no background page, an error is set.
    */
  inline def getBackgroundPage(callback: js.Function1[/* backgroundPage */ js.UndefOr[Window], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundPage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Returns details about the app from the manifest.
    * The object returned is a serialization of the full manifest file.
    * @returns The manifest details.
    */
  inline def getManifest(): Manifest = ^.asInstanceOf[js.Dynamic].applyDynamic("getManifest")().asInstanceOf[Manifest]
  
  /**
    * Returns a DirectoryEntry for the package directory.
    * @since Chrome 29.
    */
  inline def getPackageDirectoryEntry(callback: js.Function1[/* directoryEntry */ DirectoryEntry, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageDirectoryEntry")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Returns information about the current platform.
    * @since Chrome 29.
    * @param callback Called with results
    */
  inline def getPlatformInfo(callback: js.Function1[/* platformInfo */ PlatformInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatformInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Converts a relative path within an app install directory to a fully-qualified URL.
    * @param path A path to a resource within an app expressed relative to its install directory.
    */
  inline def getURL(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getURL")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** The ID of the app. */
  @JSGlobal("chrome.runtime.id")
  @js.native
  val id: String = js.native
  
  /** This will be defined during an API method callback if there was an error */
  @JSGlobal("chrome.runtime.lastError")
  @js.native
  val lastError: js.UndefOr[LastError] = js.native
  
  /**
    * @deprecated since Chrome 33. Please use **chrome.runtime.onRestartRequired**.
    * Fired when a Chrome update is available, but isn't installed immediately because a browser restart is required.
    */
  @JSGlobal("chrome.runtime.onBrowserUpdateAvailable")
  @js.native
  val onBrowserUpdateAvailable: RuntimeEvent = js.native
  
  /**
    * Fired when a connection is made from either an extension process or a content script.
    * @since Chrome 26.
    */
  @JSGlobal("chrome.runtime.onConnect")
  @js.native
  val onConnect: ExtensionConnectEvent = js.native
  
  /**
    * Fired when a connection is made from another extension.
    * @since Chrome 26.
    */
  @JSGlobal("chrome.runtime.onConnectExternal")
  @js.native
  val onConnectExternal: ExtensionConnectEvent = js.native
  
  /** Fired when the extension is first installed, when the extension is updated to a new version, and when Chrome is updated to a new version. */
  @JSGlobal("chrome.runtime.onInstalled")
  @js.native
  val onInstalled: typingsJapgolly.chromeApps.chrome.events.Event[js.Function1[/* details */ InstalledDetails, Unit]] = js.native
  
  /**
    * Fired when a message is sent from either an extension process or a content script.
    * @since Chrome 26.
    */
  @JSGlobal("chrome.runtime.onMessage")
  @js.native
  val onMessage: ExtensionMessageEvent = js.native
  
  /**
    * Fired when a message is sent from another app. Cannot be used in a content script.
    * @since Chrome 26.
    */
  @JSGlobal("chrome.runtime.onMessageExternal")
  @js.native
  val onMessageExternal: ExtensionMessageEvent = js.native
  
  /**
    * @required(Chrome OS Kiosk app) Currently, this event is only fired for Chrome OS kiosk apps.
    * Fired when an app or the device that it runs on needs to be restarted.
    * The app should close all its windows at its earliest convenient time to let the restart to happen.
    * If the app does nothing, a restart will be enforced after a 24-hour grace period has passed.
    * @since Chrome 29.
    */
  @JSGlobal("chrome.runtime.onRestartRequired")
  @js.native
  val onRestartRequired: typingsJapgolly.chromeApps.chrome.events.Event[
    js.Function1[
      /* reason */ ToStringLiteral[
        APPUPDATE, 
        /* keyof chrome-apps.anon.APPUPDATE */ APP_UPDATE | OS_UPDATE | PERIODIC, 
        /* import warning: importer.ImportType#apply Failed type conversion: keyof {  APP_UPDATE :'app_update',   OS_UPDATE :'os_update',   PERIODIC :'periodic'} extends keyof {  APP_UPDATE :'app_update',   OS_UPDATE :'os_update',   PERIODIC :'periodic'} ? std.Exclude<keyof {  APP_UPDATE :'app_update',   OS_UPDATE :'os_update',   PERIODIC :'periodic'}, 'app_update' | 'os_update' | 'periodic'> : never */ js.Any
      ], 
      Unit
    ]
  ] = js.native
  
  /**
    * Fired when a profile that has this app installed first starts up. This event is not fired when an incognito profile is started, even if this app is operating in 'split' incognito mode.
    * @since Chrome 23.
    */
  @JSGlobal("chrome.runtime.onStartup")
  @js.native
  val onStartup: RuntimeEvent = js.native
  
  /** Sent to the event page just before it is unloaded. This gives the extension opportunity to do some clean up. Note that since the page is unloading, any asynchronous operations started while handling this event are not guaranteed to complete. If more activity for the event page occurs before it gets unloaded the onSuspendCanceled event will be sent and the page won't be unloaded. */
  @JSGlobal("chrome.runtime.onSuspend")
  @js.native
  val onSuspend: RuntimeEvent = js.native
  
  /** Sent after onSuspend to indicate that the app won't be unloaded after all. */
  @JSGlobal("chrome.runtime.onSuspendCanceled")
  @js.native
  val onSuspendCanceled: RuntimeEvent = js.native
  
  /**
    * Fired when an update is available, but isn't installed immediately because the app is currently running.
    * If you do nothing, the update will be installed the next time the background page gets unloaded,
    * if you want it to be installed sooner you can explicitly call chrome.runtime.reload().
    * If your extension is using a persistent background page, the background page of course never gets unloaded,
    * so unless you call chrome.runtime.reload() manually in response to this event the update
    * will not get installed until the next time chrome itself restarts. If no handlers are listening for this event,
    * and your extension has a persistent background page, it behaves as if chrome.runtime.reload()
    * is called in response to this event.
    * @since Chrome 25.
    */
  @JSGlobal("chrome.runtime.onUpdateAvailable")
  @js.native
  val onUpdateAvailable: typingsJapgolly.chromeApps.chrome.events.Event[js.Function1[/* details */ UpdateAvailableDetails, Unit]] = js.native
  
  /**
    * Reloads the app .
    * @since Chrome 25.
    */
  inline def reload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")().asInstanceOf[Unit]
  
  /**
    * Requests an update check for this app.
    * @since Chrome 25.
    * @param callback
    * Parameter status: Result of the update check. See enum RequestUpdateCheckStatus.
    * Optional parameter details: If an update is available, this contains more information about the available update.
    */
  inline def requestUpdateCheck(
    callback: js.Function2[
      /* status */ ToStringLiteral[
        NOUPDATE, 
        /* keyof chrome-apps.anon.NOUPDATE */ THROTTLED | NO_UPDATE | UPDATE_AVAILABLE, 
        /* import warning: importer.ImportType#apply Failed type conversion: keyof {  THROTTLED :'throttled',   NO_UPDATE :'no_update',   UPDATE_AVAILABLE :'update_available'} extends keyof {  THROTTLED :'throttled',   NO_UPDATE :'no_update',   UPDATE_AVAILABLE :'update_available'} ? std.Exclude<keyof {  THROTTLED :'throttled',   NO_UPDATE :'no_update',   UPDATE_AVAILABLE :'update_available'}, 'throttled' | 'no_update' | 'update_available'> : never */ js.Any
      ], 
      /* details */ js.UndefOr[UpdateCheckDetails], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestUpdateCheck")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Restart the ChromeOS device when the app runs in kiosk mode. Otherwise, it's no-op.
    * @since Chrome 32.
    */
  inline def restart(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restart")().asInstanceOf[Unit]
  
  /**
    * Restart the ChromeOS device when the app runs in kiosk mode after the
    * given seconds. If called again before the time ends, the reboot will
    * be delayed. If called with a value of -1, the reboot will be
    * cancelled. It's a no-op in non-kiosk mode. It's only allowed to be
    * called repeatedly by the first extension to invoke this API.
    * @since Chrome 53.
    * @param seconds
    * @param callback
    */
  inline def restartAfterDelay(seconds: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restartAfterDelay")(seconds.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def restartAfterDelay(seconds: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("restartAfterDelay")(seconds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sends a single message to event listeners within your app or a different app. Similar to runtime.connect but only sends a single message, with an optional response. If sending to your extension, the runtime.onMessage event will be fired in each page, or runtime.onMessageExternal, if a different extension. Note that extensions cannot send messages to content scripts using this method.
    * @since Chrome 32.
    * @param extensionId The ID of the app to send the message to. If omitted, the message will be sent to your own app. Required if sending messages from a web page for web messaging.
    * @param [responseCallback]
    * Parameter response: The JSON response object sent by the handler of the message. If an error occurs while connecting to the extension, the callback will be called with no arguments and runtime.lastError will be set to the error message.
    */
  inline def sendMessage(extensionId: String, message: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(extensionId.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendMessage(
    extensionId: String,
    message: Any,
    options: Null,
    responseCallback: js.Function1[/* response */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(extensionId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendMessage(
    extensionId: String,
    message: Any,
    options: Unit,
    responseCallback: js.Function1[/* response */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(extensionId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendMessage(extensionId: String, message: Any, options: MessageOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(extensionId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendMessage(
    extensionId: String,
    message: Any,
    options: MessageOptions,
    responseCallback: js.Function1[/* response */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(extensionId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Sends a single message to event listeners within your app or a different app. Similar to runtime.connect but only sends a single message, with an optional response.
    * If sending to your extension, the runtime.onMessage event will be fired in each page, or runtime.onMessageExternal, if a different extension.
    * Note that extensions cannot send messages to content scripts using this method.
    * @since Chrome 26.
    * @param [responseCallback]
    * Parameter response: The JSON response object sent by the handler of the message. If an error occurs while connecting to the extension, the callback will be called with no arguments and runtime.lastError will be set to the error message.
    */
  /**
    * Sends a single message to event listeners within your app or a different app. Similar to runtime.connect but only sends a single message, with an optional response. If sending to your extension, the runtime.onMessage event will be fired in each page, or runtime.onMessageExternal, if a different extension. Note that extensions cannot send messages to content scripts using this method.
    * @since Chrome 32.
    * @param [responseCallback]
    * Parameter response: The JSON response object sent by the handler of the message. If an error occurs while connecting to the extension, the callback will be called with no arguments and runtime.lastError will be set to the error message.
    */
  inline def sendMessage(message: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def sendMessage(message: Any, options: Null, responseCallback: js.Function1[/* response */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendMessage(message: Any, options: Unit, responseCallback: js.Function1[/* response */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendMessage(message: Any, options: MessageOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendMessage(message: Any, options: MessageOptions, responseCallback: js.Function1[/* response */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendMessage(message: Any, responseCallback: js.Function1[/* response */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(message.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Send a single message to a native application.
    * @since Chrome 28.
    * @param application The of the native messaging host.
    * @param message The message that will be passed to the native messaging host.
    * @param responseCallback Optional.
    * Parameter response: The response message sent by the native messaging host. If an error occurs while connecting to the native messaging host, the callback will be called with no arguments and runtime.lastError will be set to the error message.
    */
  inline def sendNativeMessage(application: String, message: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendNativeMessage")(application.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendNativeMessage(application: String, message: js.Object, responseCallback: js.Function1[/* response */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendNativeMessage")(application.asInstanceOf[js.Any], message.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the URL to be visited upon uninstallation. This may be used to clean up server-side data, do analytics, and implement surveys. Maximum 255 characters.
    * @since Chrome 41.
    * @param url Since Chrome 34.
    * URL to be opened after the extension is uninstalled. This URL must have an http: or https: scheme. Set an empty string to not open a new tab upon uninstallation.
    * @param callback Called when the uninstall URL is set. If the given URL is invalid, runtime.lastError will be set.
    */
  inline def setUninstallURL(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUninstallURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setUninstallURL(url: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUninstallURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
