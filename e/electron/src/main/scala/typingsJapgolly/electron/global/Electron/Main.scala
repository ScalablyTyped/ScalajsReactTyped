package typingsJapgolly.electron.global.Electron

import typingsJapgolly.electron.Electron.AutoResizeOptions
import typingsJapgolly.electron.Electron.FromPartitionOptions
import typingsJapgolly.electron.Electron.Main.App
import typingsJapgolly.electron.Electron.Main.AutoUpdater
import typingsJapgolly.electron.Electron.Main.ContentTracing
import typingsJapgolly.electron.Electron.Main.DesktopCapturer
import typingsJapgolly.electron.Electron.Main.Dialog
import typingsJapgolly.electron.Electron.Main.GlobalShortcut
import typingsJapgolly.electron.Electron.Main.InAppPurchase
import typingsJapgolly.electron.Electron.Main.IpcMain
import typingsJapgolly.electron.Electron.Main.NativeTheme
import typingsJapgolly.electron.Electron.Main.Net
import typingsJapgolly.electron.Electron.Main.NetLog
import typingsJapgolly.electron.Electron.Main.PowerMonitor
import typingsJapgolly.electron.Electron.Main.PowerSaveBlocker
import typingsJapgolly.electron.Electron.Main.Protocol
import typingsJapgolly.electron.Electron.Main.PushNotifications
import typingsJapgolly.electron.Electron.Main.SafeStorage
import typingsJapgolly.electron.Electron.Main.Screen
import typingsJapgolly.electron.Electron.Main.SystemPreferences
import typingsJapgolly.electron.Electron.Rectangle
import typingsJapgolly.electron.Electron.SharingItem
import typingsJapgolly.electron.electronStrings.checkbox
import typingsJapgolly.electron.electronStrings.normal
import typingsJapgolly.electron.electronStrings.radio
import typingsJapgolly.electron.electronStrings.separator
import typingsJapgolly.electron.electronStrings.submenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Main {
  
  @JSGlobal("Electron.Main.BrowserView")
  @js.native
  open class BrowserView ()
    extends StObject
       with typingsJapgolly.electron.Electron.BrowserView {
    
    /**
      * The `bounds` of this BrowserView instance as `Object`.
      *
      * @experimental
      */
    /* CompleteClass */
    override def getBounds(): Rectangle = js.native
    
    /* CompleteClass */
    override def setAutoResize(options: AutoResizeOptions): Unit = js.native
    
    /**
      * Examples of valid `color` values:
      *
      * * Hex
      *   * #fff (RGB)
      *   * #ffff (ARGB)
      *   * #ffffff (RRGGBB)
      *   * #ffffffff (AARRGGBB)
      * * RGB
      *   * rgb(([\d]+),\s*([\d]+),\s*([\d]+))
      *     * e.g. rgb(255, 255, 255)
      * * RGBA
      *   * rgba(([\d]+),\s*([\d]+),\s*([\d]+),\s*([\d.]+))
      *     * e.g. rgba(255, 255, 255, 1.0)
      * * HSL
      *   * hsl((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%)
      *     * e.g. hsl(200, 20%, 50%)
      * * HSLA
      *   * hsla((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%,\s*([\d.]+))
      *     * e.g. hsla(200, 20%, 50%, 0.5)
      * * Color name
      *   * Options are listed in SkParseColor.cpp
      *   * Similar to CSS Color Module Level 3 keywords, but case-sensitive.
      *     * e.g. `blueviolet` or `red`
      *
      * **Note:** Hex format with alpha takes `AARRGGBB` or `ARGB`, _not_ `RRGGBBA` or
      * `RGA`.
      *
      * @experimental
      */
    /* CompleteClass */
    override def setBackgroundColor(color: String): Unit = js.native
    
    /**
      * Resizes and moves the view to the supplied bounds relative to the window.
      *
      * @experimental
      */
    /* CompleteClass */
    override def setBounds(bounds: Rectangle): Unit = js.native
    
    /**
      * A `WebContents` object owned by this view.
      *
      * @experimental
      */
    /* CompleteClass */
    var webContents: typingsJapgolly.electron.Electron.WebContents_ = js.native
  }
  
  @JSGlobal("Electron.Main.BrowserWindow")
  @js.native
  open class BrowserWindow ()
    extends typingsJapgolly.electron.Electron.BrowserWindow
  
  @JSGlobal("Electron.Main.Menu")
  @js.native
  open class Menu ()
    extends StObject
       with typingsJapgolly.electron.Electron.Menu
  
  @JSGlobal("Electron.Main.MenuItem")
  @js.native
  open class MenuItem ()
    extends StObject
       with typingsJapgolly.electron.Electron.MenuItem {
    
    /**
      * A `boolean` indicating whether the item is checked, this property can be
      * dynamically changed.
      *
      * A `checkbox` menu item will toggle the `checked` property on and off when
      * selected.
      *
      * A `radio` menu item will turn on its `checked` property when clicked, and will
      * turn off that property for all adjacent items in the same menu.
      *
      * You can add a `click` function for additional behavior.
      */
    /* CompleteClass */
    var checked: Boolean = js.native
    
    /**
      * A `Function` that is fired when the MenuItem receives a click event. It can be
      * called with `menuItem.click(event, focusedWindow, focusedWebContents)`.
      *
      * * `event` KeyboardEvent
      * * `focusedWindow` BrowserWindow
      * * `focusedWebContents` WebContents
      */
    /* CompleteClass */
    var click: js.Function = js.native
    
    /**
      * A `number` indicating an item's sequential unique id.
      */
    /* CompleteClass */
    var commandId: Double = js.native
    
    /**
      * A `boolean` indicating whether the item is enabled, this property can be
      * dynamically changed.
      */
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /**
      * A `string` indicating the item's unique id, this property can be dynamically
      * changed.
      */
    /* CompleteClass */
    var id: String = js.native
    
    /**
      * A `string` indicating the item's visible label.
      */
    /* CompleteClass */
    var label: String = js.native
    
    /**
      * A `Menu` that the item is a part of.
      */
    /* CompleteClass */
    var menu: typingsJapgolly.electron.Electron.Menu = js.native
    
    /**
      * A `boolean` indicating if the accelerator should be registered with the system
      * or just displayed.
      *
      * This property can be dynamically changed.
      */
    /* CompleteClass */
    var registerAccelerator: Boolean = js.native
    
    /**
      * A `SharingItem` indicating the item to share when the `role` is `shareMenu`.
      *
      * This property can be dynamically changed.
      *
      * @platform darwin
      */
    /* CompleteClass */
    var sharingItem: SharingItem = js.native
    
    /**
      * A `string` indicating the item's sublabel.
      */
    /* CompleteClass */
    var sublabel: String = js.native
    
    /**
      * A `string` indicating the item's hover text.
      *
      * @platform darwin
      */
    /* CompleteClass */
    var toolTip: String = js.native
    
    /**
      * A `string` indicating the type of the item. Can be `normal`, `separator`,
      * `submenu`, `checkbox` or `radio`.
      */
    /* CompleteClass */
    var `type`: normal | separator | submenu | checkbox | radio = js.native
    
    /**
      * An `Accelerator | null` indicating the item's user-assigned accelerator for the
      * menu item.
      *
      * **Note:** This property is only initialized after the `MenuItem` has been added
      * to a `Menu`. Either via `Menu.buildFromTemplate` or via
      * `Menu.append()/insert()`.  Accessing before initialization will just return
      * `null`.
      *
      * @platform darwin
      */
    /* CompleteClass */
    override val userAccelerator: typingsJapgolly.electron.Electron.Accelerator | Null = js.native
    
    /**
      * A `boolean` indicating whether the item is visible, this property can be
      * dynamically changed.
      */
    /* CompleteClass */
    var visible: Boolean = js.native
  }
  
  @JSGlobal("Electron.Main.MessageChannelMain")
  @js.native
  open class MessageChannelMain ()
    extends typingsJapgolly.electron.Electron.MessageChannelMain
  
  @JSGlobal("Electron.Main.Notification")
  @js.native
  open class Notification ()
    extends typingsJapgolly.electron.Electron.Notification
  
  @JSGlobal("Electron.Main.ShareMenu")
  @js.native
  open class ShareMenu ()
    extends typingsJapgolly.electron.Electron.ShareMenu
  
  @JSGlobal("Electron.Main.TouchBar")
  @js.native
  open class TouchBar ()
    extends StObject
       with typingsJapgolly.electron.Electron.TouchBar {
    
    /**
      * A `TouchBarItem` that will replace the "esc" button on the touch bar when set.
      * Setting to `null` restores the default "esc" button. Changing this value
      * immediately updates the escape item in the touch bar.
      */
    /* CompleteClass */
    var escapeItem: typingsJapgolly.electron.Electron.TouchBarButton | typingsJapgolly.electron.Electron.TouchBarColorPicker | typingsJapgolly.electron.Electron.TouchBarGroup | typingsJapgolly.electron.Electron.TouchBarLabel | typingsJapgolly.electron.Electron.TouchBarPopover | typingsJapgolly.electron.Electron.TouchBarScrubber | typingsJapgolly.electron.Electron.TouchBarSegmentedControl | typingsJapgolly.electron.Electron.TouchBarSlider | typingsJapgolly.electron.Electron.TouchBarSpacer | Null = js.native
  }
  
  @JSGlobal("Electron.Main.Tray")
  @js.native
  open class Tray ()
    extends typingsJapgolly.electron.Electron.Tray
  
  @JSGlobal("Electron.Main.app")
  @js.native
  val app: App = js.native
  
  @JSGlobal("Electron.Main.autoUpdater")
  @js.native
  val autoUpdater: AutoUpdater = js.native
  
  @JSGlobal("Electron.Main.contentTracing")
  @js.native
  val contentTracing: ContentTracing = js.native
  
  @JSGlobal("Electron.Main.desktopCapturer")
  @js.native
  val desktopCapturer: DesktopCapturer = js.native
  
  @JSGlobal("Electron.Main.dialog")
  @js.native
  val dialog: Dialog = js.native
  
  @JSGlobal("Electron.Main.globalShortcut")
  @js.native
  val globalShortcut: GlobalShortcut = js.native
  
  @JSGlobal("Electron.Main.inAppPurchase")
  @js.native
  val inAppPurchase: InAppPurchase = js.native
  
  @JSGlobal("Electron.Main.ipcMain")
  @js.native
  val ipcMain: IpcMain = js.native
  
  @JSGlobal("Electron.Main.nativeTheme")
  @js.native
  val nativeTheme: NativeTheme = js.native
  
  @JSGlobal("Electron.Main.net")
  @js.native
  val net: Net = js.native
  
  @JSGlobal("Electron.Main.netLog")
  @js.native
  val netLog: NetLog = js.native
  
  @JSGlobal("Electron.Main.powerMonitor")
  @js.native
  val powerMonitor: PowerMonitor = js.native
  
  @JSGlobal("Electron.Main.powerSaveBlocker")
  @js.native
  val powerSaveBlocker: PowerSaveBlocker = js.native
  
  @JSGlobal("Electron.Main.protocol")
  @js.native
  val protocol: Protocol = js.native
  
  @JSGlobal("Electron.Main.pushNotifications")
  @js.native
  val pushNotifications: PushNotifications = js.native
  
  @JSGlobal("Electron.Main.safeStorage")
  @js.native
  val safeStorage: SafeStorage = js.native
  
  @JSGlobal("Electron.Main.screen")
  @js.native
  val screen: Screen = js.native
  
  /* was `typeof Session` */
  @JSGlobal("Electron.Main.session")
  @js.native
  open class session ()
    extends typingsJapgolly.electron.Electron.Session_
  /* was `typeof Session` */
  object session {
    
    @JSGlobal("Electron.Main.session")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A `Session` object, the default session object of the app.
      */
    /* static member */
    @JSGlobal("Electron.Main.session.defaultSession")
    @js.native
    def defaultSession: typingsJapgolly.electron.Electron.Session_ = js.native
    inline def defaultSession_=(x: typingsJapgolly.electron.Electron.Session_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSession")(x.asInstanceOf[js.Any])
    
    // Docs: https://electronjs.org/docs/api/session
    /**
      * A session instance from `partition` string. When there is an existing `Session`
      * with the same `partition`, it will be returned; otherwise a new `Session`
      * instance will be created with `options`.
      *
      * If `partition` starts with `persist:`, the page will use a persistent session
      * available to all pages in the app with the same `partition`. if there is no
      * `persist:` prefix, the page will use an in-memory session. If the `partition` is
      * empty then default session of the app will be returned.
      *
      * To create a `Session` with `options`, you have to ensure the `Session` with the
      * `partition` has never been used before. There is no way to change the `options`
      * of an existing `Session` object.
      */
    /* static member */
    inline def fromPartition(partition: String): typingsJapgolly.electron.Electron.Session_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPartition")(partition.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.electron.Electron.Session_]
    inline def fromPartition(partition: String, options: FromPartitionOptions): typingsJapgolly.electron.Electron.Session_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPartition")(partition.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.electron.Electron.Session_]
  }
  
  @JSGlobal("Electron.Main.systemPreferences")
  @js.native
  val systemPreferences: SystemPreferences = js.native
  
  /* was `typeof WebContents` */
  @JSGlobal("Electron.Main.webContents")
  @js.native
  open class webContents ()
    extends typingsJapgolly.electron.Electron.WebContents_
  /* was `typeof WebContents` */
  object webContents {
    
    @JSGlobal("Electron.Main.webContents")
    @js.native
    val ^ : js.Any = js.native
    
    // Docs: https://electronjs.org/docs/api/web-contents
    /**
      * | undefined - A WebContents instance with the given TargetID, or `undefined` if
      * there is no WebContents associated with the given TargetID.
      *
      * When communicating with the Chrome DevTools Protocol, it can be useful to lookup
      * a WebContents instance based on its assigned TargetID.
      */
    /* static member */
    inline def fromDevToolsTargetId(targetId: String): typingsJapgolly.electron.Electron.WebContents_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDevToolsTargetId")(targetId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.electron.Electron.WebContents_]
    
    /**
      * | undefined - A WebContents instance with the given WebFrameMain, or `undefined`
      * if there is no WebContents associated with the given WebFrameMain.
      */
    /* static member */
    inline def fromFrame(frame: typingsJapgolly.electron.Electron.WebFrameMain_): typingsJapgolly.electron.Electron.WebContents_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.electron.Electron.WebContents_]
    
    /**
      * | undefined - A WebContents instance with the given ID, or `undefined` if there
      * is no WebContents associated with the given ID.
      */
    /* static member */
    inline def fromId(id: Double): typingsJapgolly.electron.Electron.WebContents_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(id.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.electron.Electron.WebContents_]
    
    /**
      * An array of all `WebContents` instances. This will contain web contents for all
      * windows, webviews, opened devtools, and devtools extension background pages.
      */
    /* static member */
    inline def getAllWebContents(): js.Array[typingsJapgolly.electron.Electron.WebContents_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllWebContents")().asInstanceOf[js.Array[typingsJapgolly.electron.Electron.WebContents_]]
    
    /**
      * | null - The web contents that is focused in this application, otherwise returns
      * `null`.
      */
    /* static member */
    inline def getFocusedWebContents(): typingsJapgolly.electron.Electron.WebContents_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusedWebContents")().asInstanceOf[typingsJapgolly.electron.Electron.WebContents_]
  }
  
  /* was `typeof WebFrameMain` */
  @JSGlobal("Electron.Main.webFrameMain")
  @js.native
  open class webFrameMain ()
    extends typingsJapgolly.electron.Electron.WebFrameMain_
  /* was `typeof WebFrameMain` */
  object webFrameMain {
    
    @JSGlobal("Electron.Main.webFrameMain")
    @js.native
    val ^ : js.Any = js.native
    
    // Docs: https://electronjs.org/docs/api/web-frame-main
    /**
      * A frame with the given process and routing IDs, or `undefined` if there is no
      * WebFrameMain associated with the given IDs.
      */
    /* static member */
    inline def fromId(processId: Double, routingId: Double): js.UndefOr[typingsJapgolly.electron.Electron.WebFrameMain_] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(processId.asInstanceOf[js.Any], routingId.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typingsJapgolly.electron.Electron.WebFrameMain_]]
  }
}
