package typingsJapgolly.chrome.global.chrome

import typingsJapgolly.chrome.chrome.contentSettings.CameraContentSetting
import typingsJapgolly.chrome.chrome.contentSettings.CookieContentSetting
import typingsJapgolly.chrome.chrome.contentSettings.FullscreenContentSetting
import typingsJapgolly.chrome.chrome.contentSettings.ImagesContentSetting
import typingsJapgolly.chrome.chrome.contentSettings.JavascriptContentSetting
import typingsJapgolly.chrome.chrome.contentSettings.LocationContentSetting
import typingsJapgolly.chrome.chrome.contentSettings.MicrophoneContentSetting
import typingsJapgolly.chrome.chrome.contentSettings.MouselockContentSetting
import typingsJapgolly.chrome.chrome.contentSettings.MultipleAutomaticDownloadsContentSetting
import typingsJapgolly.chrome.chrome.contentSettings.NotificationsContentSetting
import typingsJapgolly.chrome.chrome.contentSettings.PluginsContentSetting
import typingsJapgolly.chrome.chrome.contentSettings.PopupsContentSetting
import typingsJapgolly.chrome.chrome.contentSettings.PpapiBrokerContentSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Content Settings
////////////////////
/**
  * Use the chrome.contentSettings API to change settings that control whether websites can use features such as cookies, JavaScript, and plugins. More generally speaking, content settings allow you to customize Chrome's behavior on a per-site basis instead of globally.
  * Availability: Since Chrome 16.
  * Permissions:  "contentSettings"
  */
object contentSettings {
  
  @JSGlobal("chrome.contentSettings")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.contentSettings.automaticDownloads")
  @js.native
  def automaticDownloads: MultipleAutomaticDownloadsContentSetting = js.native
  inline def automaticDownloads_=(x: MultipleAutomaticDownloadsContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("automaticDownloads")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.contentSettings.camera")
  @js.native
  def camera: CameraContentSetting = js.native
  inline def camera_=(x: CameraContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("camera")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.contentSettings.cookies")
  @js.native
  def cookies: CookieContentSetting = js.native
  inline def cookies_=(x: CookieContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookies")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.contentSettings.fullscreen")
  @js.native
  def fullscreen: FullscreenContentSetting = js.native
  inline def fullscreen_=(x: FullscreenContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.contentSettings.images")
  @js.native
  def images: ImagesContentSetting = js.native
  inline def images_=(x: ImagesContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("images")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.contentSettings.javascript")
  @js.native
  def javascript: JavascriptContentSetting = js.native
  inline def javascript_=(x: JavascriptContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("javascript")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.contentSettings.location")
  @js.native
  def location: LocationContentSetting = js.native
  inline def location_=(x: LocationContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("location")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.contentSettings.microphone")
  @js.native
  def microphone: MicrophoneContentSetting = js.native
  inline def microphone_=(x: MicrophoneContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("microphone")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.contentSettings.mouselock")
  @js.native
  def mouselock: MouselockContentSetting = js.native
  inline def mouselock_=(x: MouselockContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouselock")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.contentSettings.notifications")
  @js.native
  def notifications: NotificationsContentSetting = js.native
  inline def notifications_=(x: NotificationsContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notifications")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.contentSettings.plugins")
  @js.native
  def plugins: PluginsContentSetting = js.native
  inline def plugins_=(x: PluginsContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.contentSettings.popups")
  @js.native
  def popups: PopupsContentSetting = js.native
  inline def popups_=(x: PopupsContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popups")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.contentSettings.unsandboxedPlugins")
  @js.native
  def unsandboxedPlugins: PpapiBrokerContentSetting = js.native
  inline def unsandboxedPlugins_=(x: PpapiBrokerContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unsandboxedPlugins")(x.asInstanceOf[js.Any])
}
