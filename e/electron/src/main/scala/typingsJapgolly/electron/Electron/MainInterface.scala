package typingsJapgolly.electron.Electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.electron.TypeofClassBrowserView
import typingsJapgolly.electron.TypeofClassBrowserWindow
import typingsJapgolly.electron.TypeofClassMenu
import typingsJapgolly.electron.TypeofClassNativeImage
import typingsJapgolly.electron.TypeofClassNotification
import typingsJapgolly.electron.TypeofClassSession
import typingsJapgolly.electron.TypeofClassTouchBar
import typingsJapgolly.electron.TypeofClassWebContents
import typingsJapgolly.electron.electronStrings.host
import typingsJapgolly.electron.electronStrings.hostname
import typingsJapgolly.electron.electronStrings.method
import typingsJapgolly.electron.electronStrings.partition
import typingsJapgolly.electron.electronStrings.path
import typingsJapgolly.electron.electronStrings.port
import typingsJapgolly.electron.electronStrings.redirect
import typingsJapgolly.electron.electronStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MainInterface extends CommonInterface {
  var BrowserView: TypeofClassBrowserView
  var BrowserWindow: TypeofClassBrowserWindow
  var ClientRequest: Instantiable1[
    /* options */ method | url | typingsJapgolly.electron.electronStrings.session | partition | typingsJapgolly.electron.electronStrings.protocol | host | hostname | port | path | redirect, 
    typingsJapgolly.electron.Electron.ClientRequest
  ]
  var Cookies: Instantiable0[typingsJapgolly.electron.Electron.Cookies]
  var Debugger: Instantiable0[typingsJapgolly.electron.Electron.Debugger]
  var DownloadItem: Instantiable0[typingsJapgolly.electron.Electron.DownloadItem]
  var IncomingMessage: Instantiable0[typingsJapgolly.electron.Electron.IncomingMessage]
  var Menu: TypeofClassMenu
  var MenuItem: Instantiable1[
    /* options */ MenuItemConstructorOptions, 
    typingsJapgolly.electron.Electron.MenuItem
  ]
  var Notification: TypeofClassNotification
  var TouchBar: TypeofClassTouchBar
  var Tray: Instantiable1[/* image */ NativeImage | String, typingsJapgolly.electron.Electron.Tray]
  var WebRequest: Instantiable0[typingsJapgolly.electron.Electron.WebRequest]
  var app: App
  var autoUpdater: AutoUpdater
  var contentTracing: ContentTracing
  var dialog: Dialog
  var globalShortcut: GlobalShortcut
  var inAppPurchase: InAppPurchase
  var ipcMain: IpcMain
  var net: Net
  var netLog: NetLog
  var powerMonitor: PowerMonitor
  var powerSaveBlocker: PowerSaveBlocker
  var protocol: Protocol
  var screen: Screen
  var session: TypeofClassSession
  var systemPreferences: SystemPreferences
  var webContents: TypeofClassWebContents
}

object MainInterface {
  @scala.inline
  def apply(
    BrowserView: TypeofClassBrowserView,
    BrowserWindow: TypeofClassBrowserWindow,
    ClientRequest: Instantiable1[
      /* options */ method | url | typingsJapgolly.electron.electronStrings.session | partition | typingsJapgolly.electron.electronStrings.protocol | host | hostname | port | path | redirect, 
      ClientRequest
    ],
    Cookies: Instantiable0[Cookies],
    Debugger: Instantiable0[Debugger],
    DownloadItem: Instantiable0[DownloadItem],
    IncomingMessage: Instantiable0[IncomingMessage],
    Menu: TypeofClassMenu,
    MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem],
    Notification: TypeofClassNotification,
    TouchBar: TypeofClassTouchBar,
    Tray: Instantiable1[/* image */ NativeImage | String, Tray],
    WebRequest: Instantiable0[WebRequest],
    app: App,
    autoUpdater: AutoUpdater,
    clipboard: Clipboard,
    contentTracing: ContentTracing,
    crashReporter: CrashReporter,
    dialog: Dialog,
    globalShortcut: GlobalShortcut,
    inAppPurchase: InAppPurchase,
    ipcMain: IpcMain,
    nativeImage: TypeofClassNativeImage,
    net: Net,
    netLog: NetLog,
    powerMonitor: PowerMonitor,
    powerSaveBlocker: PowerSaveBlocker,
    protocol: Protocol,
    screen: Screen,
    session: TypeofClassSession,
    shell: Shell,
    systemPreferences: SystemPreferences,
    webContents: TypeofClassWebContents
  ): MainInterface = {
    val __obj = js.Dynamic.literal(BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], ClientRequest = ClientRequest.asInstanceOf[js.Any], Cookies = Cookies.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], DownloadItem = DownloadItem.asInstanceOf[js.Any], IncomingMessage = IncomingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], WebRequest = WebRequest.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webContents = webContents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MainInterface]
  }
}

