package typingsJapgolly.chromeApps.chrome.runtime

import typingsJapgolly.chromeApps.chromeAppsStrings.audio_
import typingsJapgolly.chromeApps.chromeAppsStrings.background_
import typingsJapgolly.chromeApps.chromeAppsStrings.usb_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional permissions
  * @see NotAllowedAsOptionalPermissions for permissions that you're not allowed to set on demand.
  */
/* Inlined std.Exclude<chrome-apps.chrome.runtime.Permission, chrome-apps.chrome.runtime.NotAllowedAsOptionalPermissions> */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.pointerLock
  - typingsJapgolly.chromeApps.chromeAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk
  - typingsJapgolly.chromeApps.chromeAppsStrings.clipboardRead
  - typingsJapgolly.chromeApps.chromeAppsStrings.systemDotstorage
  - typingsJapgolly.chromeApps.chromeAppsStrings.enterpriseDotdeviceAttributes
  - typingsJapgolly.chromeApps.chromeAppsStrings.clipboardWrite
  - typingsJapgolly.chromeApps.chromeAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk
  - typingsJapgolly.chromeApps.chromeAppsStrings.systemDotnetwork
  - typingsJapgolly.chromeApps.chromeAppsStrings.background_
  - typingsJapgolly.chromeApps.chromeAppsStrings.alwaysOnTopWindows
  - typingsJapgolly.chromeApps.chromeAppsStrings.webview
  - typingsJapgolly.chromeApps.chromeAppsStrings.hid
  - typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotfullscreen
  - typingsJapgolly.chromeApps.chromeAppsStrings.systemDotdisplay
  - typingsJapgolly.chromeApps.chromeAppsStrings.browser
  - typingsJapgolly.chromeApps.chromeAppsStrings.mediaGalleries
  - typingsJapgolly.chromeApps.chromeAppsStrings.alarms
  - typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotshape
  - typingsJapgolly.chromeApps.chromeAppsStrings.networkingDotconfig
  - typingsJapgolly.chromeApps.chromeAppsStrings.systemDotmemory
  - typingsJapgolly.chromeApps.chromeAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`
  - typingsJapgolly.chromeApps.chromeAppsStrings.idle
  - typingsJapgolly.chromeApps.chromeAppsStrings.vpnProvider
  - typingsJapgolly.chromeApps.chromeAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk
  - typingsJapgolly.chromeApps.chromeAppsStrings.documentScan
  - typingsJapgolly.chromeApps.chromeAppsStrings.power
  - typingsJapgolly.chromeApps.chromeAppsStrings.dns
  - typingsJapgolly.chromeApps.chromeAppsStrings.fileSystem
  - typingsJapgolly.chromeApps.chromeAppsStrings.unlimitedStorage
  - typingsJapgolly.chromeApps.chromeAppsStrings.Lessthansignall_urlsGreaterthansign
  - typingsJapgolly.chromeApps.chromeAppsStrings.notifications
  - typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotfullscreenDotoverrideEsc
  - typingsJapgolly.chromeApps.chromeAppsStrings.certificateProvider
  - typingsJapgolly.chromeApps.chromeAppsStrings.usbDevices
  - typingsJapgolly.chromeApps.chromeAppsStrings.fileBrowserHandler
  - typingsJapgolly.chromeApps.chromeAppsStrings.audioCapture
  - typingsJapgolly.chromeApps.chromeAppsStrings.videoCapture
  - typingsJapgolly.chromeApps.chromeAppsStrings.nativeMessaging
  - typingsJapgolly.chromeApps.chromeAppsStrings.fileSystemProvider
  - typingsJapgolly.chromeApps.chromeAppsStrings.socket
  - typingsJapgolly.chromeApps.chromeAppsStrings.gcm
  - typingsJapgolly.chromeApps.chromeAppsStrings.desktopCapture
  - typingsJapgolly.chromeApps.chromeAppsStrings.networkingDotonc
  - typingsJapgolly.chromeApps.chromeAppsStrings.usb_
  - typingsJapgolly.chromeApps.chromeAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk
  - typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotalwaysOnTop
  - typingsJapgolly.chromeApps.chromeAppsStrings.virtualKeyboard
  - typingsJapgolly.chromeApps.chromeAppsStrings.runtime
  - typingsJapgolly.chromeApps.chromeAppsStrings.audio_
  - typingsJapgolly.chromeApps.chromeAppsStrings.clipboard
  - typingsJapgolly.chromeApps.chromeAppsStrings.platformKeys
  - typingsJapgolly.chromeApps.chromeAppsStrings.contextMenus
  - typingsJapgolly.chromeApps.chromeAppsStrings.chromeColonSlashSlashfaviconSlash
  - typingsJapgolly.chromeApps.chromeAppsStrings.storage
  - typingsJapgolly.chromeApps.chromeAppsStrings.printerProvider
  - typingsJapgolly.chromeApps.chromeAppsStrings.appview
  - typingsJapgolly.chromeApps.chromeAppsStrings.enterpriseDotplatformKeys
  - typingsJapgolly.chromeApps.chromeAppsStrings.systemDotpowerSource
  - typingsJapgolly.chromeApps.chromeAppsStrings.systemDotcpu
  - typingsJapgolly.chromeApps.chromeAppsStrings.syncFileSystem
  - typingsJapgolly.chromeApps.chromeAppsStrings.serial
  - typingsJapgolly.chromeApps.chromeAppsStrings.identity
*/
trait OptionalPermission extends StObject
object OptionalPermission {
  
  inline def Lessthansignall_urlsGreaterthansign: typingsJapgolly.chromeApps.chromeAppsStrings.Lessthansignall_urlsGreaterthansign = "<all_urls>".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.Lessthansignall_urlsGreaterthansign]
  
  inline def alarms: typingsJapgolly.chromeApps.chromeAppsStrings.alarms = "alarms".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.alarms]
  
  inline def alwaysOnTopWindows: typingsJapgolly.chromeApps.chromeAppsStrings.alwaysOnTopWindows = "alwaysOnTopWindows".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.alwaysOnTopWindows]
  
  inline def appDotwindowDotalwaysOnTop: typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotalwaysOnTop = "app.window.alwaysOnTop".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotalwaysOnTop]
  
  inline def appDotwindowDotfullscreen: typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotfullscreen = "app.window.fullscreen".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotfullscreen]
  
  inline def appDotwindowDotfullscreenDotoverrideEsc: typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotfullscreenDotoverrideEsc = "app.window.fullscreen.overrideEsc".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotfullscreenDotoverrideEsc]
  
  inline def appDotwindowDotshape: typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotshape = "app.window.shape".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.appDotwindowDotshape]
  
  inline def appview: typingsJapgolly.chromeApps.chromeAppsStrings.appview = "appview".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.appview]
  
  inline def audio: audio_ = "audio".asInstanceOf[audio_]
  
  inline def audioCapture: typingsJapgolly.chromeApps.chromeAppsStrings.audioCapture = "audioCapture".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.audioCapture]
  
  inline def background: background_ = "background".asInstanceOf[background_]
  
  inline def browser: typingsJapgolly.chromeApps.chromeAppsStrings.browser = "browser".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.browser]
  
  inline def certificateProvider: typingsJapgolly.chromeApps.chromeAppsStrings.certificateProvider = "certificateProvider".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.certificateProvider]
  
  inline def chromeColonSlashSlashfaviconSlash: typingsJapgolly.chromeApps.chromeAppsStrings.chromeColonSlashSlashfaviconSlash = "chrome://favicon/".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.chromeColonSlashSlashfaviconSlash]
  
  inline def clipboard: typingsJapgolly.chromeApps.chromeAppsStrings.clipboard = "clipboard".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.clipboard]
  
  inline def clipboardRead: typingsJapgolly.chromeApps.chromeAppsStrings.clipboardRead = "clipboardRead".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.clipboardRead]
  
  inline def clipboardWrite: typingsJapgolly.chromeApps.chromeAppsStrings.clipboardWrite = "clipboardWrite".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.clipboardWrite]
  
  inline def contextMenus: typingsJapgolly.chromeApps.chromeAppsStrings.contextMenus = "contextMenus".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.contextMenus]
  
  inline def desktopCapture: typingsJapgolly.chromeApps.chromeAppsStrings.desktopCapture = "desktopCapture".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.desktopCapture]
  
  inline def dns: typingsJapgolly.chromeApps.chromeAppsStrings.dns = "dns".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.dns]
  
  inline def documentScan: typingsJapgolly.chromeApps.chromeAppsStrings.documentScan = "documentScan".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.documentScan]
  
  inline def enterpriseDotdeviceAttributes: typingsJapgolly.chromeApps.chromeAppsStrings.enterpriseDotdeviceAttributes = "enterprise.deviceAttributes".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.enterpriseDotdeviceAttributes]
  
  inline def enterpriseDotplatformKeys: typingsJapgolly.chromeApps.chromeAppsStrings.enterpriseDotplatformKeys = "enterprise.platformKeys".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.enterpriseDotplatformKeys]
  
  inline def fileBrowserHandler: typingsJapgolly.chromeApps.chromeAppsStrings.fileBrowserHandler = "fileBrowserHandler".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.fileBrowserHandler]
  
  inline def fileColonSlashSlashSlashAsteriskSlashAsterisk: typingsJapgolly.chromeApps.chromeAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk = "file:///*/*".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk]
  
  inline def fileSystem: typingsJapgolly.chromeApps.chromeAppsStrings.fileSystem = "fileSystem".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.fileSystem]
  
  inline def fileSystemProvider: typingsJapgolly.chromeApps.chromeAppsStrings.fileSystemProvider = "fileSystemProvider".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.fileSystemProvider]
  
  inline def gcm: typingsJapgolly.chromeApps.chromeAppsStrings.gcm = "gcm".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.gcm]
  
  inline def hid: typingsJapgolly.chromeApps.chromeAppsStrings.hid = "hid".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.hid]
  
  inline def httpColonSlashSlashAsteriskSlashAsterisk: typingsJapgolly.chromeApps.chromeAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk = "http://*/*".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk]
  
  inline def httpsColonSlashSlashAsteriskSlashAsterisk: typingsJapgolly.chromeApps.chromeAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk = "https://*/*".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk]
  
  inline def `httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`: typingsJapgolly.chromeApps.chromeAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk` = "https://www.google-analytics.com/*".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`]
  
  inline def httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk: typingsJapgolly.chromeApps.chromeAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk = "https://www.googleapis.com/*".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk]
  
  inline def identity: typingsJapgolly.chromeApps.chromeAppsStrings.identity = "identity".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.identity]
  
  inline def idle: typingsJapgolly.chromeApps.chromeAppsStrings.idle = "idle".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.idle]
  
  inline def mediaGalleries: typingsJapgolly.chromeApps.chromeAppsStrings.mediaGalleries = "mediaGalleries".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.mediaGalleries]
  
  inline def nativeMessaging: typingsJapgolly.chromeApps.chromeAppsStrings.nativeMessaging = "nativeMessaging".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.nativeMessaging]
  
  inline def networkingDotconfig: typingsJapgolly.chromeApps.chromeAppsStrings.networkingDotconfig = "networking.config".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.networkingDotconfig]
  
  inline def networkingDotonc: typingsJapgolly.chromeApps.chromeAppsStrings.networkingDotonc = "networking.onc".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.networkingDotonc]
  
  inline def notifications: typingsJapgolly.chromeApps.chromeAppsStrings.notifications = "notifications".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.notifications]
  
  inline def platformKeys: typingsJapgolly.chromeApps.chromeAppsStrings.platformKeys = "platformKeys".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.platformKeys]
  
  inline def pointerLock: typingsJapgolly.chromeApps.chromeAppsStrings.pointerLock = "pointerLock".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.pointerLock]
  
  inline def power: typingsJapgolly.chromeApps.chromeAppsStrings.power = "power".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.power]
  
  inline def printerProvider: typingsJapgolly.chromeApps.chromeAppsStrings.printerProvider = "printerProvider".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.printerProvider]
  
  inline def runtime: typingsJapgolly.chromeApps.chromeAppsStrings.runtime = "runtime".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.runtime]
  
  inline def serial: typingsJapgolly.chromeApps.chromeAppsStrings.serial = "serial".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.serial]
  
  inline def socket: typingsJapgolly.chromeApps.chromeAppsStrings.socket = "socket".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.socket]
  
  inline def storage: typingsJapgolly.chromeApps.chromeAppsStrings.storage = "storage".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.storage]
  
  inline def syncFileSystem: typingsJapgolly.chromeApps.chromeAppsStrings.syncFileSystem = "syncFileSystem".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.syncFileSystem]
  
  inline def systemDotcpu: typingsJapgolly.chromeApps.chromeAppsStrings.systemDotcpu = "system.cpu".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.systemDotcpu]
  
  inline def systemDotdisplay: typingsJapgolly.chromeApps.chromeAppsStrings.systemDotdisplay = "system.display".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.systemDotdisplay]
  
  inline def systemDotmemory: typingsJapgolly.chromeApps.chromeAppsStrings.systemDotmemory = "system.memory".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.systemDotmemory]
  
  inline def systemDotnetwork: typingsJapgolly.chromeApps.chromeAppsStrings.systemDotnetwork = "system.network".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.systemDotnetwork]
  
  inline def systemDotpowerSource: typingsJapgolly.chromeApps.chromeAppsStrings.systemDotpowerSource = "system.powerSource".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.systemDotpowerSource]
  
  inline def systemDotstorage: typingsJapgolly.chromeApps.chromeAppsStrings.systemDotstorage = "system.storage".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.systemDotstorage]
  
  inline def unlimitedStorage: typingsJapgolly.chromeApps.chromeAppsStrings.unlimitedStorage = "unlimitedStorage".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.unlimitedStorage]
  
  inline def usb: usb_ = "usb".asInstanceOf[usb_]
  
  inline def usbDevices: typingsJapgolly.chromeApps.chromeAppsStrings.usbDevices = "usbDevices".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.usbDevices]
  
  inline def videoCapture: typingsJapgolly.chromeApps.chromeAppsStrings.videoCapture = "videoCapture".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.videoCapture]
  
  inline def virtualKeyboard: typingsJapgolly.chromeApps.chromeAppsStrings.virtualKeyboard = "virtualKeyboard".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.virtualKeyboard]
  
  inline def vpnProvider: typingsJapgolly.chromeApps.chromeAppsStrings.vpnProvider = "vpnProvider".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.vpnProvider]
  
  inline def webview: typingsJapgolly.chromeApps.chromeAppsStrings.webview = "webview".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.webview]
}
