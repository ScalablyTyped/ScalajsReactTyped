package typingsJapgolly.electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.electron.Electron.Accelerator
import typingsJapgolly.electron.Electron.App_
import typingsJapgolly.electron.Electron.AutoUpdater_
import typingsJapgolly.electron.Electron.BrowserWindowProxy
import typingsJapgolly.electron.Electron.ClientRequest
import typingsJapgolly.electron.Electron.Clipboard_
import typingsJapgolly.electron.Electron.ContentTracing_
import typingsJapgolly.electron.Electron.ContextBridge_
import typingsJapgolly.electron.Electron.Cookies
import typingsJapgolly.electron.Electron.CrashReporter_
import typingsJapgolly.electron.Electron.Debugger
import typingsJapgolly.electron.Electron.DesktopCapturer_
import typingsJapgolly.electron.Electron.Dialog_
import typingsJapgolly.electron.Electron.DownloadItem
import typingsJapgolly.electron.Electron.EventEmitter
import typingsJapgolly.electron.Electron.GlobalShortcut_
import typingsJapgolly.electron.Electron.InAppPurchase_
import typingsJapgolly.electron.Electron.IncomingMessage
import typingsJapgolly.electron.Electron.IpcMain_
import typingsJapgolly.electron.Electron.IpcRenderer_
import typingsJapgolly.electron.Electron.MenuItem
import typingsJapgolly.electron.Electron.MenuItemConstructorOptions
import typingsJapgolly.electron.Electron.NativeImage_
import typingsJapgolly.electron.Electron.NetLog_
import typingsJapgolly.electron.Electron.Net_
import typingsJapgolly.electron.Electron.PowerMonitor_
import typingsJapgolly.electron.Electron.PowerSaveBlocker_
import typingsJapgolly.electron.Electron.Protocol_
import typingsJapgolly.electron.Electron.Remote_
import typingsJapgolly.electron.Electron.Screen_
import typingsJapgolly.electron.Electron.Shell_
import typingsJapgolly.electron.Electron.SystemPreferences_
import typingsJapgolly.electron.Electron.TouchBarButton
import typingsJapgolly.electron.Electron.TouchBarButtonConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarColorPicker
import typingsJapgolly.electron.Electron.TouchBarColorPickerConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarGroup
import typingsJapgolly.electron.Electron.TouchBarGroupConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarLabel
import typingsJapgolly.electron.Electron.TouchBarLabelConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarPopover
import typingsJapgolly.electron.Electron.TouchBarPopoverConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarScrubber
import typingsJapgolly.electron.Electron.TouchBarScrubberConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarSegmentedControl
import typingsJapgolly.electron.Electron.TouchBarSegmentedControlConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarSlider
import typingsJapgolly.electron.Electron.TouchBarSliderConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarSpacer
import typingsJapgolly.electron.Electron.TouchBarSpacerConstructorOptions
import typingsJapgolly.electron.Electron.Tray
import typingsJapgolly.electron.Electron.WebFrame_
import typingsJapgolly.electron.Electron.WebRequest
import typingsJapgolly.electron.Electron.WebviewTag_
import typingsJapgolly.electron.electronStrings.host
import typingsJapgolly.electron.electronStrings.hostname
import typingsJapgolly.electron.electronStrings.method
import typingsJapgolly.electron.electronStrings.partition
import typingsJapgolly.electron.electronStrings.path
import typingsJapgolly.electron.electronStrings.port
import typingsJapgolly.electron.electronStrings.protocol
import typingsJapgolly.electron.electronStrings.redirect
import typingsJapgolly.electron.electronStrings.session
import typingsJapgolly.electron.electronStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofElectron extends js.Object {
  var Accelerator: Instantiable0[typingsJapgolly.electron.Electron.Accelerator]
  var BrowserView: TypeofBrowserView
  var BrowserWindow: TypeofBrowserWindow
  var BrowserWindowProxy: Instantiable0[typingsJapgolly.electron.Electron.BrowserWindowProxy]
  var ClientRequest: Instantiable1[
    /* options */ method | url | session | partition | typingsJapgolly.electron.electronStrings.protocol | host | hostname | port | path | redirect, 
    typingsJapgolly.electron.Electron.ClientRequest
  ]
  var Cookies: Instantiable0[typingsJapgolly.electron.Electron.Cookies]
  var Debugger: Instantiable0[typingsJapgolly.electron.Electron.Debugger]
  var DownloadItem: Instantiable0[typingsJapgolly.electron.Electron.DownloadItem]
  // TODO: Replace this declaration with NodeJS.EventEmitter
  var EventEmitter: Instantiable0[typingsJapgolly.electron.Electron.EventEmitter]
  var IncomingMessage: Instantiable0[typingsJapgolly.electron.Electron.IncomingMessage]
  var Menu: TypeofMenu
  var MenuItem: Instantiable1[
    /* options */ MenuItemConstructorOptions, 
    typingsJapgolly.electron.Electron.MenuItem
  ]
  var NativeImage: TypeofNativeImage
  var Notification: TypeofNotification
  var Session: TypeofSession
  var TouchBar: TypeofTouchBar
  var TouchBarButton: Instantiable1[
    /* options */ TouchBarButtonConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarButton
  ]
  var TouchBarColorPicker: Instantiable1[
    /* options */ TouchBarColorPickerConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarColorPicker
  ]
  var TouchBarGroup: Instantiable1[
    /* options */ TouchBarGroupConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarGroup
  ]
  var TouchBarLabel: Instantiable1[
    /* options */ TouchBarLabelConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarLabel
  ]
  var TouchBarPopover: Instantiable1[
    /* options */ TouchBarPopoverConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarPopover
  ]
  var TouchBarScrubber: Instantiable1[
    /* options */ TouchBarScrubberConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarScrubber
  ]
  var TouchBarSegmentedControl: Instantiable1[
    /* options */ TouchBarSegmentedControlConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarSegmentedControl
  ]
  var TouchBarSlider: Instantiable1[
    /* options */ TouchBarSliderConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarSlider
  ]
  var TouchBarSpacer: Instantiable1[
    /* options */ TouchBarSpacerConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarSpacer
  ]
  var Tray: Instantiable1[/* image */ NativeImage_ | String, typingsJapgolly.electron.Electron.Tray]
  var WebContents: TypeofWebContents
  var WebRequest: Instantiable0[typingsJapgolly.electron.Electron.WebRequest]
  val app: App_
  val autoUpdater: AutoUpdater_
  val clipboard: Clipboard_
  val contentTracing: ContentTracing_
  val contextBridge: ContextBridge_
  val crashReporter: CrashReporter_
  val desktopCapturer: DesktopCapturer_
  val dialog: Dialog_
  val globalShortcut: GlobalShortcut_
  val inAppPurchase: InAppPurchase_
  val ipcMain: IpcMain_
  val ipcRenderer: IpcRenderer_
  val net: Net_
  val netLog: NetLog_
  val powerMonitor: PowerMonitor_
  val powerSaveBlocker: PowerSaveBlocker_
  val protocol: Protocol_
  val remote: Remote_
  val screen: Screen_
  val shell: Shell_
  val systemPreferences: SystemPreferences_
  val webFrame: WebFrame_
  val webviewTag: WebviewTag_
}

object TypeofElectron {
  @scala.inline
  def apply(
    Accelerator: Instantiable0[Accelerator],
    BrowserView: TypeofBrowserView,
    BrowserWindow: TypeofBrowserWindow,
    BrowserWindowProxy: Instantiable0[BrowserWindowProxy],
    ClientRequest: Instantiable1[
      /* options */ method | url | session | partition | protocol | host | hostname | port | path | redirect, 
      ClientRequest
    ],
    Cookies: Instantiable0[Cookies],
    Debugger: Instantiable0[Debugger],
    DownloadItem: Instantiable0[DownloadItem],
    EventEmitter: Instantiable0[EventEmitter],
    IncomingMessage: Instantiable0[IncomingMessage],
    Menu: TypeofMenu,
    MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem],
    NativeImage: TypeofNativeImage,
    Notification: TypeofNotification,
    Session: TypeofSession,
    TouchBar: TypeofTouchBar,
    TouchBarButton: Instantiable1[/* options */ TouchBarButtonConstructorOptions, TouchBarButton],
    TouchBarColorPicker: Instantiable1[/* options */ TouchBarColorPickerConstructorOptions, TouchBarColorPicker],
    TouchBarGroup: Instantiable1[/* options */ TouchBarGroupConstructorOptions, TouchBarGroup],
    TouchBarLabel: Instantiable1[/* options */ TouchBarLabelConstructorOptions, TouchBarLabel],
    TouchBarPopover: Instantiable1[/* options */ TouchBarPopoverConstructorOptions, TouchBarPopover],
    TouchBarScrubber: Instantiable1[/* options */ TouchBarScrubberConstructorOptions, TouchBarScrubber],
    TouchBarSegmentedControl: Instantiable1[/* options */ TouchBarSegmentedControlConstructorOptions, TouchBarSegmentedControl],
    TouchBarSlider: Instantiable1[/* options */ TouchBarSliderConstructorOptions, TouchBarSlider],
    TouchBarSpacer: Instantiable1[/* options */ TouchBarSpacerConstructorOptions, TouchBarSpacer],
    Tray: Instantiable1[/* image */ NativeImage_ | String, Tray],
    WebContents: TypeofWebContents,
    WebRequest: Instantiable0[WebRequest],
    app: App_,
    autoUpdater: AutoUpdater_,
    clipboard: Clipboard_,
    contentTracing: ContentTracing_,
    contextBridge: ContextBridge_,
    crashReporter: CrashReporter_,
    desktopCapturer: DesktopCapturer_,
    dialog: Dialog_,
    globalShortcut: GlobalShortcut_,
    inAppPurchase: InAppPurchase_,
    ipcMain: IpcMain_,
    ipcRenderer: IpcRenderer_,
    net: Net_,
    netLog: NetLog_,
    powerMonitor: PowerMonitor_,
    powerSaveBlocker: PowerSaveBlocker_,
    protocol: Protocol_,
    remote: Remote_,
    screen: Screen_,
    shell: Shell_,
    systemPreferences: SystemPreferences_,
    webFrame: WebFrame_,
    webviewTag: WebviewTag_
  ): TypeofElectron = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], BrowserWindowProxy = BrowserWindowProxy.asInstanceOf[js.Any], ClientRequest = ClientRequest.asInstanceOf[js.Any], Cookies = Cookies.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], DownloadItem = DownloadItem.asInstanceOf[js.Any], EventEmitter = EventEmitter.asInstanceOf[js.Any], IncomingMessage = IncomingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], NativeImage = NativeImage.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], TouchBarButton = TouchBarButton.asInstanceOf[js.Any], TouchBarColorPicker = TouchBarColorPicker.asInstanceOf[js.Any], TouchBarGroup = TouchBarGroup.asInstanceOf[js.Any], TouchBarLabel = TouchBarLabel.asInstanceOf[js.Any], TouchBarPopover = TouchBarPopover.asInstanceOf[js.Any], TouchBarScrubber = TouchBarScrubber.asInstanceOf[js.Any], TouchBarSegmentedControl = TouchBarSegmentedControl.asInstanceOf[js.Any], TouchBarSlider = TouchBarSlider.asInstanceOf[js.Any], TouchBarSpacer = TouchBarSpacer.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], WebContents = WebContents.asInstanceOf[js.Any], WebRequest = WebRequest.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], contextBridge = contextBridge.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], ipcRenderer = ipcRenderer.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webFrame = webFrame.asInstanceOf[js.Any], webviewTag = webviewTag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofElectron]
  }
}

