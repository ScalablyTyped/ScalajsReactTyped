package typingsJapgolly.chromeApps.chrome.runtime

import typingsJapgolly.chromeApps.chromeAppsStrings.usb_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional permissions
  * @see NotAllowedAsOptionalPermissions for permissions that you're not allowed to set on demand.
  */
/* Inlined std.Exclude<chrome-apps.chrome.runtime.Permission, chrome-apps.chrome.runtime.NotAllowedAsOptionalPermissions> */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.browser
  - typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotshape
  - typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotfullscreen
  - typingsJapgolly.chromeApps.chromeAppsStrings.alarms
  - typingsJapgolly.chromeApps.chromeAppsStrings.contextMenus
  - typingsJapgolly.chromeApps.chromeAppsStrings.audio
  - typingsJapgolly.chromeApps.chromeAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk
  - typingsJapgolly.chromeApps.chromeAppsStrings.gcm
  - typingsJapgolly.chromeApps.chromeAppsStrings.idle
  - typingsJapgolly.chromeApps.chromeAppsStrings.chromeColonSlashSlashfaviconSlash
  - typingsJapgolly.chromeApps.chromeAppsStrings.enterpriseDotdeviceAttributes
  - typingsJapgolly.chromeApps.chromeAppsStrings.enterpriseDotplatformKeys
  - typingsJapgolly.chromeApps.chromeAppsStrings.systemDotnetwork
  - typingsJapgolly.chromeApps.chromeAppsStrings.platformKeys
  - typingsJapgolly.chromeApps.chromeAppsStrings.background
  - typingsJapgolly.chromeApps.chromeAppsStrings.dns
  - typingsJapgolly.chromeApps.chromeAppsStrings.systemDotpowerSource
  - typingsJapgolly.chromeApps.chromeAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk
  - typingsJapgolly.chromeApps.chromeAppsStrings.webview
  - typingsJapgolly.chromeApps.chromeAppsStrings.unlimitedStorage
  - typingsJapgolly.chromeApps.chromeAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk
  - typingsJapgolly.chromeApps.chromeAppsStrings.syncFileSystem
  - typingsJapgolly.chromeApps.chromeAppsStrings.usbDevices
  - typingsJapgolly.chromeApps.chromeAppsStrings.systemDotdisplay
  - typingsJapgolly.chromeApps.chromeAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk
  - typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotalwaysOnTop
  - typingsJapgolly.chromeApps.chromeAppsStrings.serial
  - typingsJapgolly.chromeApps.chromeAppsStrings.systemDotcpu
  - typingsJapgolly.chromeApps.chromeAppsStrings.networkingDotconfig
  - typingsJapgolly.chromeApps.chromeAppsStrings.videoCapture
  - typingsJapgolly.chromeApps.chromeAppsStrings.appview
  - typingsJapgolly.chromeApps.chromeAppsStrings.nativeMessaging
  - typingsJapgolly.chromeApps.chromeAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`
  - typingsJapgolly.chromeApps.chromeAppsStrings.mediaGalleries
  - typingsJapgolly.chromeApps.chromeAppsStrings.clipboardWrite
  - typingsJapgolly.chromeApps.chromeAppsStrings.printerProvider
  - typingsJapgolly.chromeApps.chromeAppsStrings.clipboard
  - typingsJapgolly.chromeApps.chromeAppsStrings.desktopCapture
  - typingsJapgolly.chromeApps.chromeAppsStrings.fileSystemProvider
  - typingsJapgolly.chromeApps.chromeAppsStrings.clipboardRead
  - typingsJapgolly.chromeApps.chromeAppsStrings.networkingDotonc
  - typingsJapgolly.chromeApps.chromeAppsStrings.pointerLock
  - typingsJapgolly.chromeApps.chromeAppsStrings.usb_
  - typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotfullscreenDotoverrideEsc
  - typingsJapgolly.chromeApps.chromeAppsStrings.storage
  - typingsJapgolly.chromeApps.chromeAppsStrings.alwaysOnTopWindows
  - typingsJapgolly.chromeApps.chromeAppsStrings.audioCapture
  - typingsJapgolly.chromeApps.chromeAppsStrings.systemDotstorage
  - typingsJapgolly.chromeApps.chromeAppsStrings.fileBrowserHandler
  - typingsJapgolly.chromeApps.chromeAppsStrings.power
  - typingsJapgolly.chromeApps.chromeAppsStrings.vpnProvider
  - typingsJapgolly.chromeApps.chromeAppsStrings.Lessthansignall_urlsGreaterthansign
  - typingsJapgolly.chromeApps.chromeAppsStrings.virtualKeyboard
  - typingsJapgolly.chromeApps.chromeAppsStrings.socket
  - typingsJapgolly.chromeApps.chromeAppsStrings.documentScan
  - typingsJapgolly.chromeApps.chromeAppsStrings.systemDotmemory
  - typingsJapgolly.chromeApps.chromeAppsStrings.identity
  - typingsJapgolly.chromeApps.chromeAppsStrings.certificateProvider
  - typingsJapgolly.chromeApps.chromeAppsStrings.notifications
  - typingsJapgolly.chromeApps.chromeAppsStrings.fileSystem
  - typingsJapgolly.chromeApps.chromeAppsStrings.runtime
  - typingsJapgolly.chromeApps.chromeAppsStrings.hid
*/
trait OptionalPermission extends js.Object

object OptionalPermission {
  @scala.inline
  def Lessthansignall_urlsGreaterthansign: typingsJapgolly.chromeApps.chromeAppsStrings.Lessthansignall_urlsGreaterthansign = this.cast("<all_urls>")
  @scala.inline
  def alarms: typingsJapgolly.chromeApps.chromeAppsStrings.alarms = this.cast("alarms")
  @scala.inline
  def alwaysOnTopWindows: typingsJapgolly.chromeApps.chromeAppsStrings.alwaysOnTopWindows = this.cast("alwaysOnTopWindows")
  @scala.inline
  def appDotwindowDotalwaysOnTop: typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotalwaysOnTop = this.cast("app.window.alwaysOnTop")
  @scala.inline
  def appDotwindowDotfullscreen: typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotfullscreen = this.cast("app.window.fullscreen")
  @scala.inline
  def appDotwindowDotfullscreenDotoverrideEsc: typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotfullscreenDotoverrideEsc = this.cast("app.window.fullscreen.overrideEsc")
  @scala.inline
  def appDotwindowDotshape: typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotshape = this.cast("app.window.shape")
  @scala.inline
  def appview: typingsJapgolly.chromeApps.chromeAppsStrings.appview = this.cast("appview")
  @scala.inline
  def audio: typingsJapgolly.chromeApps.chromeAppsStrings.audio = this.cast("audio")
  @scala.inline
  def audioCapture: typingsJapgolly.chromeApps.chromeAppsStrings.audioCapture = this.cast("audioCapture")
  @scala.inline
  def background: typingsJapgolly.chromeApps.chromeAppsStrings.background = this.cast("background")
  @scala.inline
  def browser: typingsJapgolly.chromeApps.chromeAppsStrings.browser = this.cast("browser")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def certificateProvider: typingsJapgolly.chromeApps.chromeAppsStrings.certificateProvider = this.cast("certificateProvider")
  @scala.inline
  def chromeColonSlashSlashfaviconSlash: typingsJapgolly.chromeApps.chromeAppsStrings.chromeColonSlashSlashfaviconSlash = this.cast("chrome://favicon/")
  @scala.inline
  def clipboard: typingsJapgolly.chromeApps.chromeAppsStrings.clipboard = this.cast("clipboard")
  @scala.inline
  def clipboardRead: typingsJapgolly.chromeApps.chromeAppsStrings.clipboardRead = this.cast("clipboardRead")
  @scala.inline
  def clipboardWrite: typingsJapgolly.chromeApps.chromeAppsStrings.clipboardWrite = this.cast("clipboardWrite")
  @scala.inline
  def contextMenus: typingsJapgolly.chromeApps.chromeAppsStrings.contextMenus = this.cast("contextMenus")
  @scala.inline
  def desktopCapture: typingsJapgolly.chromeApps.chromeAppsStrings.desktopCapture = this.cast("desktopCapture")
  @scala.inline
  def dns: typingsJapgolly.chromeApps.chromeAppsStrings.dns = this.cast("dns")
  @scala.inline
  def documentScan: typingsJapgolly.chromeApps.chromeAppsStrings.documentScan = this.cast("documentScan")
  @scala.inline
  def enterpriseDotdeviceAttributes: typingsJapgolly.chromeApps.chromeAppsStrings.enterpriseDotdeviceAttributes = this.cast("enterprise.deviceAttributes")
  @scala.inline
  def enterpriseDotplatformKeys: typingsJapgolly.chromeApps.chromeAppsStrings.enterpriseDotplatformKeys = this.cast("enterprise.platformKeys")
  @scala.inline
  def fileBrowserHandler: typingsJapgolly.chromeApps.chromeAppsStrings.fileBrowserHandler = this.cast("fileBrowserHandler")
  @scala.inline
  def fileColonSlashSlashSlashAsteriskSlashAsterisk: typingsJapgolly.chromeApps.chromeAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk = this.cast("file:///*/*")
  @scala.inline
  def fileSystem: typingsJapgolly.chromeApps.chromeAppsStrings.fileSystem = this.cast("fileSystem")
  @scala.inline
  def fileSystemProvider: typingsJapgolly.chromeApps.chromeAppsStrings.fileSystemProvider = this.cast("fileSystemProvider")
  @scala.inline
  def gcm: typingsJapgolly.chromeApps.chromeAppsStrings.gcm = this.cast("gcm")
  @scala.inline
  def hid: typingsJapgolly.chromeApps.chromeAppsStrings.hid = this.cast("hid")
  @scala.inline
  def httpColonSlashSlashAsteriskSlashAsterisk: typingsJapgolly.chromeApps.chromeAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk = this.cast("http://*/*")
  @scala.inline
  def httpsColonSlashSlashAsteriskSlashAsterisk: typingsJapgolly.chromeApps.chromeAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk = this.cast("https://*/*")
  @scala.inline
  def `httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`: typingsJapgolly.chromeApps.chromeAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk` = this.cast("https://www.google-analytics.com/*")
  @scala.inline
  def httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk: typingsJapgolly.chromeApps.chromeAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk = this.cast("https://www.googleapis.com/*")
  @scala.inline
  def identity: typingsJapgolly.chromeApps.chromeAppsStrings.identity = this.cast("identity")
  @scala.inline
  def idle: typingsJapgolly.chromeApps.chromeAppsStrings.idle = this.cast("idle")
  @scala.inline
  def mediaGalleries: typingsJapgolly.chromeApps.chromeAppsStrings.mediaGalleries = this.cast("mediaGalleries")
  @scala.inline
  def nativeMessaging: typingsJapgolly.chromeApps.chromeAppsStrings.nativeMessaging = this.cast("nativeMessaging")
  @scala.inline
  def networkingDotconfig: typingsJapgolly.chromeApps.chromeAppsStrings.networkingDotconfig = this.cast("networking.config")
  @scala.inline
  def networkingDotonc: typingsJapgolly.chromeApps.chromeAppsStrings.networkingDotonc = this.cast("networking.onc")
  @scala.inline
  def notifications: typingsJapgolly.chromeApps.chromeAppsStrings.notifications = this.cast("notifications")
  @scala.inline
  def platformKeys: typingsJapgolly.chromeApps.chromeAppsStrings.platformKeys = this.cast("platformKeys")
  @scala.inline
  def pointerLock: typingsJapgolly.chromeApps.chromeAppsStrings.pointerLock = this.cast("pointerLock")
  @scala.inline
  def power: typingsJapgolly.chromeApps.chromeAppsStrings.power = this.cast("power")
  @scala.inline
  def printerProvider: typingsJapgolly.chromeApps.chromeAppsStrings.printerProvider = this.cast("printerProvider")
  @scala.inline
  def runtime: typingsJapgolly.chromeApps.chromeAppsStrings.runtime = this.cast("runtime")
  @scala.inline
  def serial: typingsJapgolly.chromeApps.chromeAppsStrings.serial = this.cast("serial")
  @scala.inline
  def socket: typingsJapgolly.chromeApps.chromeAppsStrings.socket = this.cast("socket")
  @scala.inline
  def storage: typingsJapgolly.chromeApps.chromeAppsStrings.storage = this.cast("storage")
  @scala.inline
  def syncFileSystem: typingsJapgolly.chromeApps.chromeAppsStrings.syncFileSystem = this.cast("syncFileSystem")
  @scala.inline
  def systemDotcpu: typingsJapgolly.chromeApps.chromeAppsStrings.systemDotcpu = this.cast("system.cpu")
  @scala.inline
  def systemDotdisplay: typingsJapgolly.chromeApps.chromeAppsStrings.systemDotdisplay = this.cast("system.display")
  @scala.inline
  def systemDotmemory: typingsJapgolly.chromeApps.chromeAppsStrings.systemDotmemory = this.cast("system.memory")
  @scala.inline
  def systemDotnetwork: typingsJapgolly.chromeApps.chromeAppsStrings.systemDotnetwork = this.cast("system.network")
  @scala.inline
  def systemDotpowerSource: typingsJapgolly.chromeApps.chromeAppsStrings.systemDotpowerSource = this.cast("system.powerSource")
  @scala.inline
  def systemDotstorage: typingsJapgolly.chromeApps.chromeAppsStrings.systemDotstorage = this.cast("system.storage")
  @scala.inline
  def unlimitedStorage: typingsJapgolly.chromeApps.chromeAppsStrings.unlimitedStorage = this.cast("unlimitedStorage")
  @scala.inline
  def usb: usb_ = this.cast("usb")
  @scala.inline
  def usbDevices: typingsJapgolly.chromeApps.chromeAppsStrings.usbDevices = this.cast("usbDevices")
  @scala.inline
  def videoCapture: typingsJapgolly.chromeApps.chromeAppsStrings.videoCapture = this.cast("videoCapture")
  @scala.inline
  def virtualKeyboard: typingsJapgolly.chromeApps.chromeAppsStrings.virtualKeyboard = this.cast("virtualKeyboard")
  @scala.inline
  def vpnProvider: typingsJapgolly.chromeApps.chromeAppsStrings.vpnProvider = this.cast("vpnProvider")
  @scala.inline
  def webview: typingsJapgolly.chromeApps.chromeAppsStrings.webview = this.cast("webview")
}

