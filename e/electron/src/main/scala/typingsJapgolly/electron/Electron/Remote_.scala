package typingsJapgolly.electron.Electron

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.electron.TypeofBrowserView
import typingsJapgolly.electron.TypeofBrowserWindow
import typingsJapgolly.electron.TypeofMenu
import typingsJapgolly.electron.TypeofNativeImage
import typingsJapgolly.electron.TypeofNotification
import typingsJapgolly.electron.TypeofSession
import typingsJapgolly.electron.TypeofTouchBar
import typingsJapgolly.electron.TypeofWebContents
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

trait Remote_ extends MainInterface {
  /**
    * The process object in the main process. This is the same as
    * remote.getGlobal('process') but is cached.
    */
  var process: js.UndefOr[js.Any] = js.undefined
  // Docs: http://electronjs.org/docs/api/remote
  def getCurrentWebContents(): WebContents_
  /**
    * Note: Do not use removeAllListeners on BrowserWindow. Use of this can remove all
    * blur listeners, disable click events on touch bar buttons, and other unintended
    * consequences.
    */
  def getCurrentWindow(): BrowserWindow
  def getGlobal(name: String): js.Any
  /**
    * e.g.
    */
  def require(module: String): js.Any
}

object Remote_ {
  @scala.inline
  def apply(
    BrowserView: TypeofBrowserView,
    BrowserWindow: TypeofBrowserWindow,
    ClientRequest: Instantiable1[
      /* options */ method | url | typingsJapgolly.electron.electronStrings.session | partition | typingsJapgolly.electron.electronStrings.protocol | host | hostname | port | path | redirect, 
      ClientRequest
    ],
    Cookies: Instantiable0[Cookies],
    Debugger: Instantiable0[Debugger],
    DownloadItem: Instantiable0[DownloadItem],
    IncomingMessage: Instantiable0[IncomingMessage],
    Menu: TypeofMenu,
    MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem],
    Notification: TypeofNotification,
    TouchBar: TypeofTouchBar,
    Tray: Instantiable1[/* image */ NativeImage_ | String, Tray],
    WebRequest: Instantiable0[WebRequest],
    app: App_,
    autoUpdater: AutoUpdater_,
    clipboard: Clipboard_,
    contentTracing: ContentTracing_,
    crashReporter: CrashReporter_,
    dialog: Dialog_,
    getCurrentWebContents: CallbackTo[WebContents_],
    getCurrentWindow: CallbackTo[BrowserWindow],
    getGlobal: String => CallbackTo[js.Any],
    globalShortcut: GlobalShortcut_,
    inAppPurchase: InAppPurchase_,
    ipcMain: IpcMain_,
    nativeImage: TypeofNativeImage,
    net: Net_,
    netLog: NetLog_,
    powerMonitor: PowerMonitor_,
    powerSaveBlocker: PowerSaveBlocker_,
    protocol: Protocol_,
    require: String => CallbackTo[js.Any],
    screen: Screen_,
    session: TypeofSession,
    shell: Shell_,
    systemPreferences: SystemPreferences_,
    webContents: TypeofWebContents,
    process: js.Any = null
  ): Remote_ = {
    val __obj = js.Dynamic.literal(BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], ClientRequest = ClientRequest.asInstanceOf[js.Any], Cookies = Cookies.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], DownloadItem = DownloadItem.asInstanceOf[js.Any], IncomingMessage = IncomingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], WebRequest = WebRequest.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webContents = webContents.asInstanceOf[js.Any])
    __obj.updateDynamic("getCurrentWebContents")(getCurrentWebContents.toJsFn)
    __obj.updateDynamic("getCurrentWindow")(getCurrentWindow.toJsFn)
    __obj.updateDynamic("getGlobal")(js.Any.fromFunction1((t0: java.lang.String) => getGlobal(t0).runNow()))
    __obj.updateDynamic("require")(js.Any.fromFunction1((t0: java.lang.String) => require(t0).runNow()))
    if (process != null) __obj.updateDynamic("process")(process.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remote_]
  }
}

