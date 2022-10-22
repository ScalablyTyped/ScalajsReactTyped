package typingsJapgolly.chrome.global.chrome

import typingsJapgolly.chrome.Window
import typingsJapgolly.chrome.chrome.runtime.ConnectInfo
import typingsJapgolly.chrome.chrome.runtime.ExtensionConnectEvent
import typingsJapgolly.chrome.chrome.runtime.ExtensionMessageEvent
import typingsJapgolly.chrome.chrome.runtime.LastError
import typingsJapgolly.chrome.chrome.runtime.Manifest
import typingsJapgolly.chrome.chrome.runtime.MessageOptions
import typingsJapgolly.chrome.chrome.runtime.PlatformInfo
import typingsJapgolly.chrome.chrome.runtime.Port
import typingsJapgolly.chrome.chrome.runtime.RequestUpdateCheckStatus
import typingsJapgolly.chrome.chrome.runtime.RuntimeEvent
import typingsJapgolly.chrome.chrome.runtime.RuntimeInstalledEvent
import typingsJapgolly.chrome.chrome.runtime.RuntimeRestartRequiredEvent
import typingsJapgolly.chrome.chrome.runtime.RuntimeUpdateAvailableEvent
import typingsJapgolly.chrome.chrome.runtime.UpdateCheckDetails
import typingsJapgolly.filesystem.DirectoryEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Runtime
////////////////////
/**
  * Use the chrome.runtime API to retrieve the background page, return details about the manifest, and listen for and respond to events in the app or extension lifecycle. You can also use this API to convert the relative path of URLs to fully-qualified URLs.
  * @since Chrome 22
  */
object runtime {
  
  @JSGlobal("chrome.runtime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.runtime.OnInstalledReason")
  @js.native
  object OnInstalledReason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.chrome.chrome.runtime.OnInstalledReason & String] = js.native
    
    /* "chrome_update" */ val CHROME_UPDATE: typingsJapgolly.chrome.chrome.runtime.OnInstalledReason.CHROME_UPDATE & String = js.native
    
    /* "install" */ val INSTALL: typingsJapgolly.chrome.chrome.runtime.OnInstalledReason.INSTALL & String = js.native
    
    /* "shared_module_update" */ val SHARED_MODULE_UPDATE: typingsJapgolly.chrome.chrome.runtime.OnInstalledReason.SHARED_MODULE_UPDATE & String = js.native
    
    /* "update" */ val UPDATE: typingsJapgolly.chrome.chrome.runtime.OnInstalledReason.UPDATE & String = js.native
  }
  
  inline def connect(): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[Port]
  inline def connect(connectInfo: ConnectInfo): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(connectInfo.asInstanceOf[js.Any]).asInstanceOf[Port]
  inline def connect(extensionId: String): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(extensionId.asInstanceOf[js.Any]).asInstanceOf[Port]
  inline def connect(extensionId: String, connectInfo: ConnectInfo): Port = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(extensionId.asInstanceOf[js.Any], connectInfo.asInstanceOf[js.Any])).asInstanceOf[Port]
  
  inline def connectNative(application: String): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connectNative")(application.asInstanceOf[js.Any]).asInstanceOf[Port]
  
  inline def getBackgroundPage(callback: js.Function1[/* backgroundPage */ js.UndefOr[Window], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundPage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getManifest(): Manifest = ^.asInstanceOf[js.Dynamic].applyDynamic("getManifest")().asInstanceOf[Manifest]
  
  inline def getPackageDirectoryEntry(callback: js.Function1[/* directoryEntry */ DirectoryEntry, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageDirectoryEntry")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getPlatformInfo(): js.Promise[PlatformInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatformInfo")().asInstanceOf[js.Promise[PlatformInfo]]
  inline def getPlatformInfo(callback: js.Function1[/* platformInfo */ PlatformInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatformInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getURL(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getURL")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSGlobal("chrome.runtime.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.lastError")
  @js.native
  def lastError: js.UndefOr[LastError] = js.native
  inline def lastError_=(x: js.UndefOr[LastError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastError")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.onBrowserUpdateAvailable")
  @js.native
  def onBrowserUpdateAvailable: RuntimeEvent = js.native
  inline def onBrowserUpdateAvailable_=(x: RuntimeEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBrowserUpdateAvailable")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.onConnect")
  @js.native
  def onConnect: ExtensionConnectEvent = js.native
  
  @JSGlobal("chrome.runtime.onConnectExternal")
  @js.native
  def onConnectExternal: ExtensionConnectEvent = js.native
  inline def onConnectExternal_=(x: ExtensionConnectEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onConnectExternal")(x.asInstanceOf[js.Any])
  
  inline def onConnect_=(x: ExtensionConnectEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.onInstalled")
  @js.native
  def onInstalled: RuntimeInstalledEvent = js.native
  inline def onInstalled_=(x: RuntimeInstalledEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onInstalled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.onMessage")
  @js.native
  def onMessage: ExtensionMessageEvent = js.native
  
  @JSGlobal("chrome.runtime.onMessageExternal")
  @js.native
  def onMessageExternal: ExtensionMessageEvent = js.native
  inline def onMessageExternal_=(x: ExtensionMessageEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessageExternal")(x.asInstanceOf[js.Any])
  
  inline def onMessage_=(x: ExtensionMessageEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.onRestartRequired")
  @js.native
  def onRestartRequired: RuntimeRestartRequiredEvent = js.native
  inline def onRestartRequired_=(x: RuntimeRestartRequiredEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRestartRequired")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.onStartup")
  @js.native
  def onStartup: RuntimeEvent = js.native
  inline def onStartup_=(x: RuntimeEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStartup")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.onSuspend")
  @js.native
  def onSuspend: RuntimeEvent = js.native
  
  @JSGlobal("chrome.runtime.onSuspendCanceled")
  @js.native
  def onSuspendCanceled: RuntimeEvent = js.native
  inline def onSuspendCanceled_=(x: RuntimeEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSuspendCanceled")(x.asInstanceOf[js.Any])
  
  inline def onSuspend_=(x: RuntimeEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSuspend")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.runtime.onUpdateAvailable")
  @js.native
  def onUpdateAvailable: RuntimeUpdateAvailableEvent = js.native
  inline def onUpdateAvailable_=(x: RuntimeUpdateAvailableEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onUpdateAvailable")(x.asInstanceOf[js.Any])
  
  inline def openOptionsPage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openOptionsPage")().asInstanceOf[Unit]
  inline def openOptionsPage(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openOptionsPage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def reload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")().asInstanceOf[Unit]
  
  inline def requestUpdateCheck(
    callback: js.Function2[
      /* status */ RequestUpdateCheckStatus, 
      /* details */ js.UndefOr[UpdateCheckDetails], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestUpdateCheck")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def restart(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restart")().asInstanceOf[Unit]
  
  inline def restartAfterDelay(seconds: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restartAfterDelay")(seconds.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def restartAfterDelay(seconds: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("restartAfterDelay")(seconds.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sendMessage[M, R](extensionId: String, message: M): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(extensionId.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  inline def sendMessage[Message, Response](extensionId: String, message: Message, options: MessageOptions): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(extensionId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  inline def sendMessage[Message, Response](
    extensionId: String,
    message: Message,
    options: MessageOptions,
    responseCallback: js.Function1[/* response */ Response, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(extensionId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendMessage[M, R](extensionId: String, message: M, responseCallback: js.Function1[/* response */ R, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(extensionId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendMessage[M, R](message: M): js.Promise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[R]]
  inline def sendMessage[M, R](message: M, options: MessageOptions): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  inline def sendMessage[M, R](message: M, options: MessageOptions, responseCallback: js.Function1[/* response */ R, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sendMessage[M, R](message: M, responseCallback: js.Function1[/* response */ R, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(message.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sendNativeMessage(application: String, message: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendNativeMessage")(application.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def sendNativeMessage(application: String, message: js.Object, responseCallback: js.Function1[/* response */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendNativeMessage")(application.asInstanceOf[js.Any], message.asInstanceOf[js.Any], responseCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUninstallURL(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUninstallURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setUninstallURL(url: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUninstallURL")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
