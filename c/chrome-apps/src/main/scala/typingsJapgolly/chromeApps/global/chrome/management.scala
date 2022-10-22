package typingsJapgolly.chromeApps.global.chrome

import typingsJapgolly.chromeApps.chrome.management.ExtensionInfo
import typingsJapgolly.chromeApps.chrome.management.UninstallOptions
import typingsJapgolly.chromeApps.chromeAppsStrings.OPEN_AS_PINNED_TAB
import typingsJapgolly.chromeApps.chromeAppsStrings.OPEN_AS_REGULAR_TAB
import typingsJapgolly.chromeApps.chromeAppsStrings.OPEN_AS_WINDOW
import typingsJapgolly.chromeApps.chromeAppsStrings.OPEN_FULL_SCREEN
import typingsJapgolly.chromeApps.chromeAppsStrings.`extension`
import typingsJapgolly.chromeApps.chromeAppsStrings.admin_
import typingsJapgolly.chromeApps.chromeAppsStrings.development_
import typingsJapgolly.chromeApps.chromeAppsStrings.hosted_app
import typingsJapgolly.chromeApps.chromeAppsStrings.legacy_packaged_app
import typingsJapgolly.chromeApps.chromeAppsStrings.normal_
import typingsJapgolly.chromeApps.chromeAppsStrings.other_
import typingsJapgolly.chromeApps.chromeAppsStrings.packaged_app
import typingsJapgolly.chromeApps.chromeAppsStrings.permissions_increase_
import typingsJapgolly.chromeApps.chromeAppsStrings.sideload_
import typingsJapgolly.chromeApps.chromeAppsStrings.theme
import typingsJapgolly.chromeApps.chromeAppsStrings.unknown__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.management
////////////////
// Management //
////////////////
/**
  * The chrome.management API provides ways to
  * manage the list of apps
  * that are installed and running.
  */
object management {
  
  @JSGlobal("chrome.management")
  @js.native
  val ^ : js.Any = js.native
  
  object ExtensionDisabledReason {
    
    @JSGlobal("chrome.management.ExtensionDisabledReason")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.management.ExtensionDisabledReason.PERMISSIONS_INCREASE")
    @js.native
    def PERMISSIONS_INCREASE: permissions_increase_ = js.native
    inline def PERMISSIONS_INCREASE_=(x: permissions_increase_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERMISSIONS_INCREASE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionDisabledReason.UNKNOWN")
    @js.native
    def UNKNOWN: unknown__ = js.native
    inline def UNKNOWN_=(x: unknown__): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
  }
  
  object ExtensionInstallType {
    
    @JSGlobal("chrome.management.ExtensionInstallType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.management.ExtensionInstallType.ADMIN")
    @js.native
    def ADMIN: admin_ = js.native
    inline def ADMIN_=(x: admin_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADMIN")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionInstallType.DEVELOPMENT")
    @js.native
    def DEVELOPMENT: development_ = js.native
    inline def DEVELOPMENT_=(x: development_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEVELOPMENT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionInstallType.NORMAL")
    @js.native
    def NORMAL: normal_ = js.native
    inline def NORMAL_=(x: normal_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionInstallType.OTHER")
    @js.native
    def OTHER: other_ = js.native
    inline def OTHER_=(x: other_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OTHER")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionInstallType.SIDELOAD")
    @js.native
    def SIDELOAD: sideload_ = js.native
    inline def SIDELOAD_=(x: sideload_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIDELOAD")(x.asInstanceOf[js.Any])
  }
  
  object ExtensionType {
    
    @JSGlobal("chrome.management.ExtensionType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.management.ExtensionType.EXTENSION")
    @js.native
    def EXTENSION: `extension` = js.native
    inline def EXTENSION_=(x: `extension`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXTENSION")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionType.HOSTED_APP")
    @js.native
    def HOSTED_APP: hosted_app = js.native
    inline def HOSTED_APP_=(x: hosted_app): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOSTED_APP")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionType.LEGACY_PACKAGED_APP")
    @js.native
    def LEGACY_PACKAGED_APP: legacy_packaged_app = js.native
    inline def LEGACY_PACKAGED_APP_=(x: legacy_packaged_app): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEGACY_PACKAGED_APP")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionType.PACKAGED_APP")
    @js.native
    def PACKAGED_APP: packaged_app = js.native
    inline def PACKAGED_APP_=(x: packaged_app): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PACKAGED_APP")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.ExtensionType.THEME")
    @js.native
    def THEME: theme = js.native
    inline def THEME_=(x: theme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THEME")(x.asInstanceOf[js.Any])
  }
  
  object LaunchType {
    
    @JSGlobal("chrome.management.LaunchType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.management.LaunchType.OPEN_AS_PINNED_TAB")
    @js.native
    def OPEN_AS_PINNED_TAB: typingsJapgolly.chromeApps.chromeAppsStrings.OPEN_AS_PINNED_TAB = js.native
    inline def OPEN_AS_PINNED_TAB_=(x: OPEN_AS_PINNED_TAB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_AS_PINNED_TAB")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.LaunchType.OPEN_AS_REGULAR_TAB")
    @js.native
    def OPEN_AS_REGULAR_TAB: typingsJapgolly.chromeApps.chromeAppsStrings.OPEN_AS_REGULAR_TAB = js.native
    inline def OPEN_AS_REGULAR_TAB_=(x: OPEN_AS_REGULAR_TAB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_AS_REGULAR_TAB")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.LaunchType.OPEN_AS_WINDOW")
    @js.native
    def OPEN_AS_WINDOW: typingsJapgolly.chromeApps.chromeAppsStrings.OPEN_AS_WINDOW = js.native
    inline def OPEN_AS_WINDOW_=(x: OPEN_AS_WINDOW): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_AS_WINDOW")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.management.LaunchType.OPEN_FULL_SCREEN")
    @js.native
    def OPEN_FULL_SCREEN: typingsJapgolly.chromeApps.chromeAppsStrings.OPEN_FULL_SCREEN = js.native
    inline def OPEN_FULL_SCREEN_=(x: OPEN_FULL_SCREEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN_FULL_SCREEN")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Returns a list of permission warnings for the given extension manifest string.
    * @param manifestStr Extension manifest JSON string. See example
    * @param [callback] Permissions warnings as string array
    * @example
    * chrome.management.getPermissionWarningsByManifest(JSON.stringify(chrome.runtime.getManifest()), (warnings) => { *Do something here* });
    */
  inline def getPermissionWarningsByManifest(manifestStr: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPermissionWarningsByManifest")(manifestStr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getPermissionWarningsByManifest(manifestStr: String, callback: js.Function1[/* permissionWarnings */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getPermissionWarningsByManifest")(manifestStr.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns information about the calling extension, app, or theme. Note: This function can be used without requesting the 'management' permission in the manifest.
    * @since Chrome 39.
    * @param [callback] If you specify the callback parameter, it should be a function that looks like this:
    * function( ExtensionInfo result) {...};
    */
  inline def getSelf(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelf")().asInstanceOf[Unit]
  inline def getSelf(callback: js.Function1[/* result */ ExtensionInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelf")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Uninstalls the calling extension.
    * Note: This function can be used without requesting the 'management' permission in the manifest.
    * @since Chrome 26.
    * @param [options] Optional unstall options
    * @param [callback]
    */
  inline def uninstallSelf(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstallSelf")().asInstanceOf[Unit]
  inline def uninstallSelf(options: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uninstallSelf")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def uninstallSelf(options: UninstallOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstallSelf")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def uninstallSelf(options: UninstallOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("uninstallSelf")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
