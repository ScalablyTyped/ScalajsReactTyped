package typingsJapgolly.electronUtil

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.electron.Electron.Accelerator
import typingsJapgolly.electron.Electron.CrossProcessExports.MenuItemConstructorOptions
import typingsJapgolly.electron.Electron.CrossProcessExports.Rectangle
import typingsJapgolly.electron.Electron.CrossProcessExports.Session_
import typingsJapgolly.electron.Electron.CrossProcessExports.Size
import typingsJapgolly.electron.Electron.KeyboardEvent
import typingsJapgolly.electron.Electron.Menu
import typingsJapgolly.electron.Electron.MenuItem
import typingsJapgolly.electron.Electron.NativeImage_
import typingsJapgolly.electron.Electron.SharingItem
import typingsJapgolly.electron.mod.BrowserWindow
import typingsJapgolly.electronUtil.electronUtilStrings.Advanced
import typingsJapgolly.electronUtil.electronUtilStrings.Captioning
import typingsJapgolly.electronUtil.electronUtilStrings.Dictation
import typingsJapgolly.electronUtil.electronUtilStrings.FDE
import typingsJapgolly.electronUtil.electronUtilStrings.Firewall
import typingsJapgolly.electronUtil.electronUtilStrings.General
import typingsJapgolly.electronUtil.electronUtilStrings.Hearing
import typingsJapgolly.electronUtil.electronUtilStrings.Internet
import typingsJapgolly.electronUtil.electronUtilStrings.Keyboard
import typingsJapgolly.electronUtil.electronUtilStrings.Media_Descriptions
import typingsJapgolly.electronUtil.electronUtilStrings.Mouse
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_Accessibility
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_Advertising
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_AllFiles
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_Assistive
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_Automation
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_Calendars
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_Camera
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_Contacts
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_DesktopFolder
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_Diagnostics
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_DocumentsFolder
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_DownloadsFolder
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_LocationServices
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_Microphone
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_Photos
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_Reminders
import typingsJapgolly.electronUtil.electronUtilStrings.Privacy_ScreenCapture
import typingsJapgolly.electronUtil.electronUtilStrings.Seeing_Display
import typingsJapgolly.electronUtil.electronUtilStrings.Seeing_VoiceOver
import typingsJapgolly.electronUtil.electronUtilStrings.Seeing_Zoom
import typingsJapgolly.electronUtil.electronUtilStrings.Services_ARDService
import typingsJapgolly.electronUtil.electronUtilStrings.Services_BluetoothSharing
import typingsJapgolly.electronUtil.electronUtilStrings.Services_PersonalFileSharing
import typingsJapgolly.electronUtil.electronUtilStrings.Services_PrinterSharing
import typingsJapgolly.electronUtil.electronUtilStrings.Services_RemoteAppleEvent
import typingsJapgolly.electronUtil.electronUtilStrings.Services_RemoteLogin
import typingsJapgolly.electronUtil.electronUtilStrings.Services_ScreenSharing
import typingsJapgolly.electronUtil.electronUtilStrings.SpeakableItems
import typingsJapgolly.electronUtil.electronUtilStrings.Switch
import typingsJapgolly.electronUtil.electronUtilStrings.TTS
import typingsJapgolly.electronUtil.electronUtilStrings.about
import typingsJapgolly.electronUtil.electronUtilStrings.appMenu
import typingsJapgolly.electronUtil.electronUtilStrings.checkbox
import typingsJapgolly.electronUtil.electronUtilStrings.clearRecentDocuments
import typingsJapgolly.electronUtil.electronUtilStrings.close
import typingsJapgolly.electronUtil.electronUtilStrings.copy
import typingsJapgolly.electronUtil.electronUtilStrings.cut
import typingsJapgolly.electronUtil.electronUtilStrings.delete
import typingsJapgolly.electronUtil.electronUtilStrings.editMenu
import typingsJapgolly.electronUtil.electronUtilStrings.fileMenu
import typingsJapgolly.electronUtil.electronUtilStrings.forceReload
import typingsJapgolly.electronUtil.electronUtilStrings.front
import typingsJapgolly.electronUtil.electronUtilStrings.help
import typingsJapgolly.electronUtil.electronUtilStrings.hide
import typingsJapgolly.electronUtil.electronUtilStrings.hideOthers
import typingsJapgolly.electronUtil.electronUtilStrings.linux
import typingsJapgolly.electronUtil.electronUtilStrings.macos
import typingsJapgolly.electronUtil.electronUtilStrings.mergeAllWindows
import typingsJapgolly.electronUtil.electronUtilStrings.minimize
import typingsJapgolly.electronUtil.electronUtilStrings.moveTabToNewWindow
import typingsJapgolly.electronUtil.electronUtilStrings.normal
import typingsJapgolly.electronUtil.electronUtilStrings.paste
import typingsJapgolly.electronUtil.electronUtilStrings.pasteAndMatchStyle
import typingsJapgolly.electronUtil.electronUtilStrings.privacy_
import typingsJapgolly.electronUtil.electronUtilStrings.quit
import typingsJapgolly.electronUtil.electronUtilStrings.radio
import typingsJapgolly.electronUtil.electronUtilStrings.recentDocuments
import typingsJapgolly.electronUtil.electronUtilStrings.redo
import typingsJapgolly.electronUtil.electronUtilStrings.reload
import typingsJapgolly.electronUtil.electronUtilStrings.resetZoom
import typingsJapgolly.electronUtil.electronUtilStrings.security
import typingsJapgolly.electronUtil.electronUtilStrings.selectAll
import typingsJapgolly.electronUtil.electronUtilStrings.selectNextTab
import typingsJapgolly.electronUtil.electronUtilStrings.selectPreviousTab
import typingsJapgolly.electronUtil.electronUtilStrings.separator
import typingsJapgolly.electronUtil.electronUtilStrings.services
import typingsJapgolly.electronUtil.electronUtilStrings.shareMenu
import typingsJapgolly.electronUtil.electronUtilStrings.sharing
import typingsJapgolly.electronUtil.electronUtilStrings.showSubstitutions
import typingsJapgolly.electronUtil.electronUtilStrings.speech
import typingsJapgolly.electronUtil.electronUtilStrings.startSpeaking
import typingsJapgolly.electronUtil.electronUtilStrings.stopSpeaking
import typingsJapgolly.electronUtil.electronUtilStrings.submenu
import typingsJapgolly.electronUtil.electronUtilStrings.toggleDevTools
import typingsJapgolly.electronUtil.electronUtilStrings.toggleSmartDashes
import typingsJapgolly.electronUtil.electronUtilStrings.toggleSmartQuotes
import typingsJapgolly.electronUtil.electronUtilStrings.toggleSpellChecker
import typingsJapgolly.electronUtil.electronUtilStrings.toggleTabBar
import typingsJapgolly.electronUtil.electronUtilStrings.toggleTextReplacement
import typingsJapgolly.electronUtil.electronUtilStrings.togglefullscreen
import typingsJapgolly.electronUtil.electronUtilStrings.undo
import typingsJapgolly.electronUtil.electronUtilStrings.unhide
import typingsJapgolly.electronUtil.electronUtilStrings.universalaccess
import typingsJapgolly.electronUtil.electronUtilStrings.viewMenu
import typingsJapgolly.electronUtil.electronUtilStrings.window
import typingsJapgolly.electronUtil.electronUtilStrings.windowMenu
import typingsJapgolly.electronUtil.electronUtilStrings.windows
import typingsJapgolly.electronUtil.electronUtilStrings.zoom
import typingsJapgolly.electronUtil.electronUtilStrings.zoomIn
import typingsJapgolly.electronUtil.electronUtilStrings.zoomOut
import typingsJapgolly.newGithubIssueUrl.mod.Options
import typingsJapgolly.typeFest.sourceRequireAtLeastOneMod.RequireAtLeastOne
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def aboutMenuItem(): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("aboutMenuItem")().asInstanceOf[MenuItemConstructorOptions]
  inline def aboutMenuItem(options: AboutMenuItemOptions): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("aboutMenuItem")(options.asInstanceOf[js.Any]).asInstanceOf[MenuItemConstructorOptions]
  
  inline def activeWindow(): BrowserWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("activeWindow")().asInstanceOf[BrowserWindow]
  
  @JSImport("electron-util", "api")
  @js.native
  val api: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllElectron */ Any = js.native
  
  @JSImport("electron-util", "appLaunchTimestamp")
  @js.native
  val appLaunchTimestamp: Double = js.native
  
  inline def appMenu(): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("appMenu")().asInstanceOf[MenuItemConstructorOptions]
  inline def appMenu(menuItems: js.Array[MenuItemConstructorOptions]): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("appMenu")(menuItems.asInstanceOf[js.Any]).asInstanceOf[MenuItemConstructorOptions]
  
  inline def centerWindow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("centerWindow")().asInstanceOf[Unit]
  inline def centerWindow(options: CenterWindowOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("centerWindow")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("electron-util", "chromeVersion")
  @js.native
  val chromeVersion: String = js.native
  
  @JSImport("electron-util", "darkMode")
  @js.native
  val darkMode: DarkMode_ = js.native
  
  inline def debugInfo(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("debugInfo")().asInstanceOf[String]
  
  inline def disableZoom(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableZoom")().asInstanceOf[Unit]
  inline def disableZoom(window: BrowserWindow): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableZoom")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("electron-util", "electronVersion")
  @js.native
  val electronVersion: String = js.native
  
  inline def enforceMacOSAppLocation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforceMacOSAppLocation")().asInstanceOf[Unit]
  
  inline def fixPathForAsarUnpack(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixPathForAsarUnpack")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getWindowBoundsCentered(): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowBoundsCentered")().asInstanceOf[Rectangle]
  inline def getWindowBoundsCentered(options: GetWindowBoundsCenteredOptions): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowBoundsCentered")(options.asInstanceOf[js.Any]).asInstanceOf[Rectangle]
  
  object is {
    
    /**
    	Running in development, not in production.
    	*/
    @JSImport("electron-util", "is.development")
    @js.native
    val development: Boolean = js.native
    
    /**
    	Running on Linux.
    	*/
    @JSImport("electron-util", "is.linux")
    @js.native
    val linux: Boolean = js.native
    
    /**
    	The app is an Mac App Store build.
    	*/
    @JSImport("electron-util", "is.macAppStore")
    @js.native
    val macAppStore: Boolean = js.native
    
    /**
    	Running on macOS.
    	*/
    @JSImport("electron-util", "is.macos")
    @js.native
    val macos: Boolean = js.native
    
    /**
    	Running on the [main process](https://electronjs.org/docs/tutorial/quick-start/#main-process).
    	*/
    @JSImport("electron-util", "is.main")
    @js.native
    val main: Boolean = js.native
    
    /**
    	Running on the [renderer process](https://electronjs.org/docs/tutorial/quick-start/#renderer-process).
    	*/
    @JSImport("electron-util", "is.renderer")
    @js.native
    val renderer: Boolean = js.native
    
    /**
    	The app is using [ASAR](https://electronjs.org/docs/tutorial/application-packaging/).
    	*/
    @JSImport("electron-util", "is.usingAsar")
    @js.native
    val usingAsar: Boolean = js.native
    
    /**
    	Running on Windows.
    	*/
    @JSImport("electron-util", "is.windows")
    @js.native
    val windows: Boolean = js.native
    
    /**
    	The app is a Windows Store AppX build.
    	*/
    @JSImport("electron-util", "is.windowsStore")
    @js.native
    val windowsStore: Boolean = js.native
  }
  
  inline def isFirstAppLaunch(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirstAppLaunch")().asInstanceOf[Boolean]
  
  inline def menuBarHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("menuBarHeight")().asInstanceOf[Double]
  
  inline def openNewGitHubIssue(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openNewGitHubIssue")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def openSystemPreferences(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")().asInstanceOf[js.Promise[Unit]]
  inline def openSystemPreferences(
    pane: Unit,
    section: Advanced | Captioning | Dictation | FDE | Firewall | General | Hearing | Internet | Keyboard | Media_Descriptions | Mouse | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing | SpeakableItems | Switch | TTS
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def openSystemPreferences(
    pane: security,
    section: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def openSystemPreferences(
    pane: sharing,
    section: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def openSystemPreferences(pane: speech, section: Dictation | TTS): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def openSystemPreferences(
    pane: universalaccess,
    section: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def openSystemPreferences(pane: SystemPreferencesWindowsPane): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def openSystemPreferences_security(pane: security): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def openSystemPreferences_sharing(pane: sharing): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def openSystemPreferences_speech(pane: speech): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def openSystemPreferences_universalaccess(pane: universalaccess): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openSystemPreferences")(pane.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def openUrlMenuItem(): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("openUrlMenuItem")().asInstanceOf[MenuItemConstructorOptions]
  inline def openUrlMenuItem(options: OpenUrlMenuItemOptions): MenuItemConstructorOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("openUrlMenuItem")(options.asInstanceOf[js.Any]).asInstanceOf[MenuItemConstructorOptions]
  
  inline def platform[Macos, Windows, Linux, Default](choices: Choices[Macos, Windows, Linux, Default]): Macos | Windows | Linux | Default = ^.asInstanceOf[js.Dynamic].applyDynamic("platform")(choices.asInstanceOf[js.Any]).asInstanceOf[Macos | Windows | Linux | Default]
  
  inline def runJS(code: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("runJS")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def runJS(code: String, window: BrowserWindow): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("runJS")(code.asInstanceOf[js.Any], window.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def setContentSecurityPolicy(policy: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setContentSecurityPolicy")(policy.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setContentSecurityPolicy(policy: String, options: SetContentSecurityPolicyOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setContentSecurityPolicy")(policy.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def showAboutWindow(options: ShowAboutWindowOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showAboutWindow")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type AboutMenuItemOptions = ShowAboutWindowOptions
  
  trait CenterWindowOptions extends StObject {
    
    /**
    	Animate the change.
    	@default false
    	*/
    val animated: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Set a new window size.
    	Default: Size of `window`
    	@example
    	```
    	{width: 600, height: 400}
    	```
    	*/
    val size: js.UndefOr[Size] = js.undefined
    
    /**
    	Use the full display size when calculating the position.
    	By default, only the workable screen area is used, which excludes the Windows taskbar and macOS dock.
    	@default false
    	*/
    val useFullBounds: js.UndefOr[Boolean] = js.undefined
    
    /**
    	The window to center.
    	Default: Current window
    	*/
    val window: js.UndefOr[BrowserWindow] = js.undefined
  }
  object CenterWindowOptions {
    
    inline def apply(): CenterWindowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CenterWindowOptions]
    }
    
    extension [Self <: CenterWindowOptions](x: Self) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setUseFullBounds(value: Boolean): Self = StObject.set(x, "useFullBounds", value.asInstanceOf[js.Any])
      
      inline def setUseFullBoundsUndefined: Self = StObject.set(x, "useFullBounds", js.undefined)
      
      inline def setWindow(value: BrowserWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  type Choices[Macos, Windows, Linux, Default] = RequireAtLeastOne[_Choices[Macos, Windows, Linux, Default], macos | windows | linux]
  
  trait DarkMode_ extends StObject {
    
    /**
    	Whether the macOS dark mode is enabled.
    	On Windows and Linux, it's `false`.
    	*/
    val isEnabled: Boolean
    
    /**
    	The `callback` function is called when the macOS dark mode is toggled.
    	@returns A function, that when called, unsubscribes the listener. Calling it on Window and Linux works, but it just returns a no-op function.
    	*/
    def onChange(callback: js.Function0[Unit]): js.Function0[Unit]
  }
  object DarkMode_ {
    
    inline def apply(isEnabled: Boolean, onChange: js.Function0[Unit] => js.Function0[Unit]): DarkMode_ = {
      val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[DarkMode_]
    }
    
    extension [Self <: DarkMode_](x: Self) {
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    }
  }
  
  trait GetWindowBoundsCenteredOptions extends StObject {
    
    /**
    	Set a new window size.
    	Default: Size of `window`
    	@example
    	```
    	{width: 600, height: 400}
    	```
    	*/
    val size: js.UndefOr[Size] = js.undefined
    
    /**
    	Use the full display size when calculating the position.
    	By default, only the workable screen area is used, which excludes the Windows taskbar and macOS dock.
    	@default false
    	*/
    val useFullBounds: js.UndefOr[Boolean] = js.undefined
    
    /**
    	The window to get the bounds of.
    	Default: Current window
    	*/
    val window: js.UndefOr[BrowserWindow] = js.undefined
  }
  object GetWindowBoundsCenteredOptions {
    
    inline def apply(): GetWindowBoundsCenteredOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetWindowBoundsCenteredOptions]
    }
    
    extension [Self <: GetWindowBoundsCenteredOptions](x: Self) {
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setUseFullBounds(value: Boolean): Self = StObject.set(x, "useFullBounds", value.asInstanceOf[js.Any])
      
      inline def setUseFullBoundsUndefined: Self = StObject.set(x, "useFullBounds", js.undefined)
      
      inline def setWindow(value: BrowserWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  /* Inlined parent std.Readonly<electron.electron.MenuItemConstructorOptions> */
  trait OpenUrlMenuItemOptions extends StObject {
    
    val accelerator: js.UndefOr[Accelerator] = js.undefined
    
    val acceleratorWorksWhenHidden: js.UndefOr[Boolean] = js.undefined
    
    val after: js.UndefOr[js.Array[String]] = js.undefined
    
    val afterGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
    
    val before: js.UndefOr[js.Array[String]] = js.undefined
    
    val beforeGroupContaining: js.UndefOr[js.Array[String]] = js.undefined
    
    val checked: js.UndefOr[Boolean] = js.undefined
    
    val click: js.UndefOr[
        js.Function3[
          /* menuItem */ MenuItem, 
          /* browserWindow */ js.UndefOr[typingsJapgolly.electron.Electron.BrowserWindow], 
          /* event */ KeyboardEvent, 
          Unit
        ]
      ] = js.undefined
    
    val enabled: js.UndefOr[Boolean] = js.undefined
    
    val icon: js.UndefOr[NativeImage_ | String] = js.undefined
    
    val id: js.UndefOr[String] = js.undefined
    
    val label: js.UndefOr[String] = js.undefined
    
    val registerAccelerator: js.UndefOr[Boolean] = js.undefined
    
    val role: js.UndefOr[
        undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | toggleSpellChecker | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | showSubstitutions | toggleSmartQuotes | toggleSmartDashes | toggleTextReplacement | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | shareMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
      ] = js.undefined
    
    val sharingItem: js.UndefOr[SharingItem] = js.undefined
    
    val sublabel: js.UndefOr[String] = js.undefined
    
    val submenu: js.UndefOr[js.Array[typingsJapgolly.electron.Electron.MenuItemConstructorOptions] | Menu] = js.undefined
    
    val toolTip: js.UndefOr[String] = js.undefined
    
    val `type`: js.UndefOr[
        normal | separator | typingsJapgolly.electronUtil.electronUtilStrings.submenu | checkbox | radio
      ] = js.undefined
    
    /**
    	URL to be opened when the menu item is clicked.
    	*/
    val url: String
    
    val visible: js.UndefOr[Boolean] = js.undefined
  }
  object OpenUrlMenuItemOptions {
    
    inline def apply(url: String): OpenUrlMenuItemOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenUrlMenuItemOptions]
    }
    
    extension [Self <: OpenUrlMenuItemOptions](x: Self) {
      
      inline def setAccelerator(value: Accelerator): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
      
      inline def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
      
      inline def setAcceleratorWorksWhenHidden(value: Boolean): Self = StObject.set(x, "acceleratorWorksWhenHidden", value.asInstanceOf[js.Any])
      
      inline def setAcceleratorWorksWhenHiddenUndefined: Self = StObject.set(x, "acceleratorWorksWhenHidden", js.undefined)
      
      inline def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterGroupContaining(value: js.Array[String]): Self = StObject.set(x, "afterGroupContaining", value.asInstanceOf[js.Any])
      
      inline def setAfterGroupContainingUndefined: Self = StObject.set(x, "afterGroupContaining", js.undefined)
      
      inline def setAfterGroupContainingVarargs(value: String*): Self = StObject.set(x, "afterGroupContaining", js.Array(value*))
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setBefore(value: js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeGroupContaining(value: js.Array[String]): Self = StObject.set(x, "beforeGroupContaining", value.asInstanceOf[js.Any])
      
      inline def setBeforeGroupContainingUndefined: Self = StObject.set(x, "beforeGroupContaining", js.undefined)
      
      inline def setBeforeGroupContainingVarargs(value: String*): Self = StObject.set(x, "beforeGroupContaining", js.Array(value*))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value*))
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setClick(
        value: (/* menuItem */ MenuItem, /* browserWindow */ js.UndefOr[typingsJapgolly.electron.Electron.BrowserWindow], /* event */ KeyboardEvent) => Callback
      ): Self = StObject.set(x, "click", js.Any.fromFunction3((t0: /* menuItem */ MenuItem, t1: /* browserWindow */ js.UndefOr[typingsJapgolly.electron.Electron.BrowserWindow], t2: /* event */ KeyboardEvent) => (value(t0, t1, t2)).runNow()))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIcon(value: NativeImage_ | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRegisterAccelerator(value: Boolean): Self = StObject.set(x, "registerAccelerator", value.asInstanceOf[js.Any])
      
      inline def setRegisterAcceleratorUndefined: Self = StObject.set(x, "registerAccelerator", js.undefined)
      
      inline def setRole(
        value: undo | redo | cut | copy | paste | pasteAndMatchStyle | delete | selectAll | reload | forceReload | toggleDevTools | resetZoom | zoomIn | zoomOut | toggleSpellChecker | togglefullscreen | window | minimize | close | help | about | services | hide | hideOthers | unhide | quit | showSubstitutions | toggleSmartQuotes | toggleSmartDashes | toggleTextReplacement | startSpeaking | stopSpeaking | zoom | front | appMenu | fileMenu | editMenu | viewMenu | shareMenu | recentDocuments | toggleTabBar | selectNextTab | selectPreviousTab | mergeAllWindows | clearRecentDocuments | moveTabToNewWindow | windowMenu
      ): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSharingItem(value: SharingItem): Self = StObject.set(x, "sharingItem", value.asInstanceOf[js.Any])
      
      inline def setSharingItemUndefined: Self = StObject.set(x, "sharingItem", js.undefined)
      
      inline def setSublabel(value: String): Self = StObject.set(x, "sublabel", value.asInstanceOf[js.Any])
      
      inline def setSublabelUndefined: Self = StObject.set(x, "sublabel", js.undefined)
      
      inline def setSubmenu(value: js.Array[typingsJapgolly.electron.Electron.MenuItemConstructorOptions] | Menu): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
      
      inline def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
      
      inline def setSubmenuVarargs(value: typingsJapgolly.electron.Electron.MenuItemConstructorOptions*): Self = StObject.set(x, "submenu", js.Array(value*))
      
      inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
      
      inline def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
      
      inline def setType(value: normal | separator | submenu | checkbox | radio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait OptionalRectangle extends StObject {
    
    /**
    	The height of the rectangle (must be an integer).
    	*/
    val height: js.UndefOr[Double] = js.undefined
    
    /**
    	The width of the rectangle (must be an integer).
    	*/
    val width: js.UndefOr[Double] = js.undefined
    
    /**
    	The x coordinate of the origin of the rectangle (must be an integer).
    	*/
    val x: js.UndefOr[Double] = js.undefined
    
    /**
    	The y coordinate of the origin of the rectangle (must be an integer).
    	*/
    val y: js.UndefOr[Double] = js.undefined
  }
  object OptionalRectangle {
    
    inline def apply(): OptionalRectangle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalRectangle]
    }
    
    extension [Self <: OptionalRectangle](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait SetContentSecurityPolicyOptions extends StObject {
    
    /**
    	The session to apply the policy to.
    	Default: [`electron.session.defaultSession`](https://electronjs.org/docs/api/session#sessiondefaultsession)
    	*/
    val session: js.UndefOr[Session_] = js.undefined
  }
  object SetContentSecurityPolicyOptions {
    
    inline def apply(): SetContentSecurityPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetContentSecurityPolicyOptions]
    }
    
    extension [Self <: SetContentSecurityPolicyOptions](x: Self) {
      
      inline def setSession(value: Session_): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    }
  }
  
  trait ShowAboutWindowOptions extends StObject {
    
    /**
    	The copyright text.
    	*/
    val copyright: js.UndefOr[String] = js.undefined
    
    /**
    	An absolute path to the app icon.
    	Only used on Linux and Windows.
    	*/
    val icon: js.UndefOr[String] = js.undefined
    
    /**
    	Some additional text if needed. Shown below copyright info.
    	*/
    val text: js.UndefOr[String] = js.undefined
    
    /**
    	Customizable for localization. Used in the menu item label.
    	The app name is automatically appended at runtime.
    	Only used on Linux and Windows.
    	@default 'About'
    	*/
    val title: js.UndefOr[String] = js.undefined
    
    /**
    	The URL to the app's website.
    	Only used on Linux.
    	*/
    val website: js.UndefOr[String] = js.undefined
  }
  object ShowAboutWindowOptions {
    
    inline def apply(): ShowAboutWindowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowAboutWindowOptions]
    }
    
    extension [Self <: ShowAboutWindowOptions](x: Self) {
      
      inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    }
  }
  
  trait SystemPreferencesMacOsPanes extends StObject {
    
    var security: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture
    
    var sharing: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing
    
    var speech: Dictation | TTS
    
    var universalaccess: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
  }
  object SystemPreferencesMacOsPanes {
    
    inline def apply(
      security: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture,
      sharing: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing,
      speech: Dictation | TTS,
      universalaccess: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
    ): SystemPreferencesMacOsPanes = {
      val __obj = js.Dynamic.literal(security = security.asInstanceOf[js.Any], sharing = sharing.asInstanceOf[js.Any], speech = speech.asInstanceOf[js.Any], universalaccess = universalaccess.asInstanceOf[js.Any])
      __obj.asInstanceOf[SystemPreferencesMacOsPanes]
    }
    
    extension [Self <: SystemPreferencesMacOsPanes](x: Self) {
      
      inline def setSecurity(
        value: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture
      ): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSharing(
        value: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing
      ): Self = StObject.set(x, "sharing", value.asInstanceOf[js.Any])
      
      inline def setSpeech(value: Dictation | TTS): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
      
      inline def setUniversalaccess(
        value: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
      ): Self = StObject.set(x, "universalaccess", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.electronUtil.electronUtilStrings.display
    - typingsJapgolly.electronUtil.electronUtilStrings.sound
    - typingsJapgolly.electronUtil.electronUtilStrings.notifications
    - typingsJapgolly.electronUtil.electronUtilStrings.quiethours
    - typingsJapgolly.electronUtil.electronUtilStrings.powersleep
    - typingsJapgolly.electronUtil.electronUtilStrings.batterysaver
    - typingsJapgolly.electronUtil.electronUtilStrings.storagesense
    - typingsJapgolly.electronUtil.electronUtilStrings.tabletmode
    - typingsJapgolly.electronUtil.electronUtilStrings.multitasking
    - typingsJapgolly.electronUtil.electronUtilStrings.project
    - typingsJapgolly.electronUtil.electronUtilStrings.crossdevice
    - typingsJapgolly.electronUtil.electronUtilStrings.clipboard
    - typingsJapgolly.electronUtil.electronUtilStrings.remotedesktop
    - typingsJapgolly.electronUtil.electronUtilStrings.about
    - typingsJapgolly.electronUtil.electronUtilStrings.bluetooth
    - typingsJapgolly.electronUtil.electronUtilStrings.connecteddevices
    - typingsJapgolly.electronUtil.electronUtilStrings.printers
    - typingsJapgolly.electronUtil.electronUtilStrings.mousetouchpad
    - typingsJapgolly.electronUtil.electronUtilStrings.`devices-touchpad`
    - typingsJapgolly.electronUtil.electronUtilStrings.typing
    - typingsJapgolly.electronUtil.electronUtilStrings.wheel
    - typingsJapgolly.electronUtil.electronUtilStrings.pen
    - typingsJapgolly.electronUtil.electronUtilStrings.autoplay
    - typingsJapgolly.electronUtil.electronUtilStrings.usb
    - typingsJapgolly.electronUtil.electronUtilStrings.`mobile-devices`
    - typingsJapgolly.electronUtil.electronUtilStrings.network
    - typingsJapgolly.electronUtil.electronUtilStrings.`network-status`
    - typingsJapgolly.electronUtil.electronUtilStrings.`network-cellular`
    - typingsJapgolly.electronUtil.electronUtilStrings.`network-wifi`
    - typingsJapgolly.electronUtil.electronUtilStrings.`network-wificalling`
    - typingsJapgolly.electronUtil.electronUtilStrings.`network-ethernet`
    - typingsJapgolly.electronUtil.electronUtilStrings.`network-dialup`
    - typingsJapgolly.electronUtil.electronUtilStrings.`network-vpn`
    - typingsJapgolly.electronUtil.electronUtilStrings.`network-airplanemode`
    - typingsJapgolly.electronUtil.electronUtilStrings.`network-mobilehotspot`
    - typingsJapgolly.electronUtil.electronUtilStrings.nfctransactions
    - typingsJapgolly.electronUtil.electronUtilStrings.datausage
    - typingsJapgolly.electronUtil.electronUtilStrings.`network-proxy`
    - typingsJapgolly.electronUtil.electronUtilStrings.personalization
    - typingsJapgolly.electronUtil.electronUtilStrings.`personalization-background`
    - typingsJapgolly.electronUtil.electronUtilStrings.`personalization-colors`
    - typingsJapgolly.electronUtil.electronUtilStrings.lockscreen
    - typingsJapgolly.electronUtil.electronUtilStrings.themes
    - typingsJapgolly.electronUtil.electronUtilStrings.fonts
    - typingsJapgolly.electronUtil.electronUtilStrings.`personalization-start`
    - typingsJapgolly.electronUtil.electronUtilStrings.taskbar
    - typingsJapgolly.electronUtil.electronUtilStrings.appsfeatures
    - typingsJapgolly.electronUtil.electronUtilStrings.optionalfeatures
    - typingsJapgolly.electronUtil.electronUtilStrings.defaultapps
    - typingsJapgolly.electronUtil.electronUtilStrings.maps
    - typingsJapgolly.electronUtil.electronUtilStrings.appsforwebsites
    - typingsJapgolly.electronUtil.electronUtilStrings.videoplayback
    - typingsJapgolly.electronUtil.electronUtilStrings.startupapps
    - typingsJapgolly.electronUtil.electronUtilStrings.yourinfo
    - typingsJapgolly.electronUtil.electronUtilStrings.emailandaccounts
    - typingsJapgolly.electronUtil.electronUtilStrings.signinoptions
    - typingsJapgolly.electronUtil.electronUtilStrings.workplace
    - typingsJapgolly.electronUtil.electronUtilStrings.otherusers
    - typingsJapgolly.electronUtil.electronUtilStrings.sync
    - typingsJapgolly.electronUtil.electronUtilStrings.dateandtime
    - typingsJapgolly.electronUtil.electronUtilStrings.regionformatting
    - typingsJapgolly.electronUtil.electronUtilStrings.regionlanguage
    - typingsJapgolly.electronUtil.electronUtilStrings.speech
    - typingsJapgolly.electronUtil.electronUtilStrings.`gaming-gamebar`
    - typingsJapgolly.electronUtil.electronUtilStrings.`gaming-gamedvr`
    - typingsJapgolly.electronUtil.electronUtilStrings.`gaming-broadcasting`
    - typingsJapgolly.electronUtil.electronUtilStrings.`gaming-gamemode`
    - typingsJapgolly.electronUtil.electronUtilStrings.`gaming-xboxnetworking`
    - typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-display`
    - typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-cursorandpointersize`
    - typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-cursor`
    - typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-magnifier`
    - typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-colorfilter`
    - typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-highcontrast`
    - typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-narrator`
    - typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-audio`
    - typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-closedcaptioning`
    - typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-speechrecognition`
    - typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-keyboard`
    - typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-mouse`
    - typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-eyecontrol`
    - typingsJapgolly.electronUtil.electronUtilStrings.`search-permissions`
    - typingsJapgolly.electronUtil.electronUtilStrings.`cortana-windowssearch`
    - typingsJapgolly.electronUtil.electronUtilStrings.cortana
    - typingsJapgolly.electronUtil.electronUtilStrings.`cortana-talktocortana`
    - typingsJapgolly.electronUtil.electronUtilStrings.`cortana-permissions`
    - typingsJapgolly.electronUtil.electronUtilStrings.privacy_
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-speech`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-speechtyping`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-feedback`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-activityhistory`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-location`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-webcam`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-microphone`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-voiceactivation`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-notifications`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-accountinfo`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-contacts`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-calendar`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-phonecalls`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-callhistory`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-email`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-eyetracker`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-tasks`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-messaging`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-radios`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-customdevices`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-backgroundapps`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-appdiagnostics`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-automaticfiledownloads`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-documents`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-pictures`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-videos`
    - typingsJapgolly.electronUtil.electronUtilStrings.`privacy-broadfilesystemaccess`
    - typingsJapgolly.electronUtil.electronUtilStrings.windowsupdate
    - typingsJapgolly.electronUtil.electronUtilStrings.`delivery-optimization`
    - typingsJapgolly.electronUtil.electronUtilStrings.windowsdefender
    - typingsJapgolly.electronUtil.electronUtilStrings.backup
    - typingsJapgolly.electronUtil.electronUtilStrings.troubleshoot
    - typingsJapgolly.electronUtil.electronUtilStrings.recovery
    - typingsJapgolly.electronUtil.electronUtilStrings.activation
    - typingsJapgolly.electronUtil.electronUtilStrings.findmydevice
    - typingsJapgolly.electronUtil.electronUtilStrings.developers
    - typingsJapgolly.electronUtil.electronUtilStrings.windowsinsider
  */
  trait SystemPreferencesWindowsPane extends StObject
  object SystemPreferencesWindowsPane {
    
    inline def about: typingsJapgolly.electronUtil.electronUtilStrings.about = "about".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.about]
    
    inline def activation: typingsJapgolly.electronUtil.electronUtilStrings.activation = "activation".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.activation]
    
    inline def appsfeatures: typingsJapgolly.electronUtil.electronUtilStrings.appsfeatures = "appsfeatures".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.appsfeatures]
    
    inline def appsforwebsites: typingsJapgolly.electronUtil.electronUtilStrings.appsforwebsites = "appsforwebsites".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.appsforwebsites]
    
    inline def autoplay: typingsJapgolly.electronUtil.electronUtilStrings.autoplay = "autoplay".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.autoplay]
    
    inline def backup: typingsJapgolly.electronUtil.electronUtilStrings.backup = "backup".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.backup]
    
    inline def batterysaver: typingsJapgolly.electronUtil.electronUtilStrings.batterysaver = "batterysaver".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.batterysaver]
    
    inline def bluetooth: typingsJapgolly.electronUtil.electronUtilStrings.bluetooth = "bluetooth".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.bluetooth]
    
    inline def clipboard: typingsJapgolly.electronUtil.electronUtilStrings.clipboard = "clipboard".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.clipboard]
    
    inline def connecteddevices: typingsJapgolly.electronUtil.electronUtilStrings.connecteddevices = "connecteddevices".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.connecteddevices]
    
    inline def cortana: typingsJapgolly.electronUtil.electronUtilStrings.cortana = "cortana".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.cortana]
    
    inline def `cortana-permissions`: typingsJapgolly.electronUtil.electronUtilStrings.`cortana-permissions` = "cortana-permissions".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`cortana-permissions`]
    
    inline def `cortana-talktocortana`: typingsJapgolly.electronUtil.electronUtilStrings.`cortana-talktocortana` = "cortana-talktocortana".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`cortana-talktocortana`]
    
    inline def `cortana-windowssearch`: typingsJapgolly.electronUtil.electronUtilStrings.`cortana-windowssearch` = "cortana-windowssearch".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`cortana-windowssearch`]
    
    inline def crossdevice: typingsJapgolly.electronUtil.electronUtilStrings.crossdevice = "crossdevice".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.crossdevice]
    
    inline def datausage: typingsJapgolly.electronUtil.electronUtilStrings.datausage = "datausage".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.datausage]
    
    inline def dateandtime: typingsJapgolly.electronUtil.electronUtilStrings.dateandtime = "dateandtime".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.dateandtime]
    
    inline def defaultapps: typingsJapgolly.electronUtil.electronUtilStrings.defaultapps = "defaultapps".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.defaultapps]
    
    inline def `delivery-optimization`: typingsJapgolly.electronUtil.electronUtilStrings.`delivery-optimization` = "delivery-optimization".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`delivery-optimization`]
    
    inline def developers: typingsJapgolly.electronUtil.electronUtilStrings.developers = "developers".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.developers]
    
    inline def `devices-touchpad`: typingsJapgolly.electronUtil.electronUtilStrings.`devices-touchpad` = "devices-touchpad".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`devices-touchpad`]
    
    inline def display: typingsJapgolly.electronUtil.electronUtilStrings.display = "display".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.display]
    
    inline def `easeofaccess-audio`: typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-audio` = "easeofaccess-audio".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-audio`]
    
    inline def `easeofaccess-closedcaptioning`: typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-closedcaptioning` = "easeofaccess-closedcaptioning".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-closedcaptioning`]
    
    inline def `easeofaccess-colorfilter`: typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-colorfilter` = "easeofaccess-colorfilter".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-colorfilter`]
    
    inline def `easeofaccess-cursor`: typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-cursor` = "easeofaccess-cursor".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-cursor`]
    
    inline def `easeofaccess-cursorandpointersize`: typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-cursorandpointersize` = "easeofaccess-cursorandpointersize".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-cursorandpointersize`]
    
    inline def `easeofaccess-display`: typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-display` = "easeofaccess-display".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-display`]
    
    inline def `easeofaccess-eyecontrol`: typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-eyecontrol` = "easeofaccess-eyecontrol".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-eyecontrol`]
    
    inline def `easeofaccess-highcontrast`: typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-highcontrast` = "easeofaccess-highcontrast".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-highcontrast`]
    
    inline def `easeofaccess-keyboard`: typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-keyboard` = "easeofaccess-keyboard".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-keyboard`]
    
    inline def `easeofaccess-magnifier`: typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-magnifier` = "easeofaccess-magnifier".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-magnifier`]
    
    inline def `easeofaccess-mouse`: typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-mouse` = "easeofaccess-mouse".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-mouse`]
    
    inline def `easeofaccess-narrator`: typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-narrator` = "easeofaccess-narrator".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-narrator`]
    
    inline def `easeofaccess-speechrecognition`: typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-speechrecognition` = "easeofaccess-speechrecognition".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`easeofaccess-speechrecognition`]
    
    inline def emailandaccounts: typingsJapgolly.electronUtil.electronUtilStrings.emailandaccounts = "emailandaccounts".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.emailandaccounts]
    
    inline def findmydevice: typingsJapgolly.electronUtil.electronUtilStrings.findmydevice = "findmydevice".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.findmydevice]
    
    inline def fonts: typingsJapgolly.electronUtil.electronUtilStrings.fonts = "fonts".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.fonts]
    
    inline def `gaming-broadcasting`: typingsJapgolly.electronUtil.electronUtilStrings.`gaming-broadcasting` = "gaming-broadcasting".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`gaming-broadcasting`]
    
    inline def `gaming-gamebar`: typingsJapgolly.electronUtil.electronUtilStrings.`gaming-gamebar` = "gaming-gamebar".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`gaming-gamebar`]
    
    inline def `gaming-gamedvr`: typingsJapgolly.electronUtil.electronUtilStrings.`gaming-gamedvr` = "gaming-gamedvr".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`gaming-gamedvr`]
    
    inline def `gaming-gamemode`: typingsJapgolly.electronUtil.electronUtilStrings.`gaming-gamemode` = "gaming-gamemode".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`gaming-gamemode`]
    
    inline def `gaming-xboxnetworking`: typingsJapgolly.electronUtil.electronUtilStrings.`gaming-xboxnetworking` = "gaming-xboxnetworking".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`gaming-xboxnetworking`]
    
    inline def lockscreen: typingsJapgolly.electronUtil.electronUtilStrings.lockscreen = "lockscreen".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.lockscreen]
    
    inline def maps: typingsJapgolly.electronUtil.electronUtilStrings.maps = "maps".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.maps]
    
    inline def `mobile-devices`: typingsJapgolly.electronUtil.electronUtilStrings.`mobile-devices` = "mobile-devices".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`mobile-devices`]
    
    inline def mousetouchpad: typingsJapgolly.electronUtil.electronUtilStrings.mousetouchpad = "mousetouchpad".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.mousetouchpad]
    
    inline def multitasking: typingsJapgolly.electronUtil.electronUtilStrings.multitasking = "multitasking".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.multitasking]
    
    inline def network: typingsJapgolly.electronUtil.electronUtilStrings.network = "network".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.network]
    
    inline def `network-airplanemode`: typingsJapgolly.electronUtil.electronUtilStrings.`network-airplanemode` = "network-airplanemode".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`network-airplanemode`]
    
    inline def `network-cellular`: typingsJapgolly.electronUtil.electronUtilStrings.`network-cellular` = "network-cellular".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`network-cellular`]
    
    inline def `network-dialup`: typingsJapgolly.electronUtil.electronUtilStrings.`network-dialup` = "network-dialup".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`network-dialup`]
    
    inline def `network-ethernet`: typingsJapgolly.electronUtil.electronUtilStrings.`network-ethernet` = "network-ethernet".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`network-ethernet`]
    
    inline def `network-mobilehotspot`: typingsJapgolly.electronUtil.electronUtilStrings.`network-mobilehotspot` = "network-mobilehotspot".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`network-mobilehotspot`]
    
    inline def `network-proxy`: typingsJapgolly.electronUtil.electronUtilStrings.`network-proxy` = "network-proxy".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`network-proxy`]
    
    inline def `network-status`: typingsJapgolly.electronUtil.electronUtilStrings.`network-status` = "network-status".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`network-status`]
    
    inline def `network-vpn`: typingsJapgolly.electronUtil.electronUtilStrings.`network-vpn` = "network-vpn".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`network-vpn`]
    
    inline def `network-wifi`: typingsJapgolly.electronUtil.electronUtilStrings.`network-wifi` = "network-wifi".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`network-wifi`]
    
    inline def `network-wificalling`: typingsJapgolly.electronUtil.electronUtilStrings.`network-wificalling` = "network-wificalling".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`network-wificalling`]
    
    inline def nfctransactions: typingsJapgolly.electronUtil.electronUtilStrings.nfctransactions = "nfctransactions".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.nfctransactions]
    
    inline def notifications: typingsJapgolly.electronUtil.electronUtilStrings.notifications = "notifications".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.notifications]
    
    inline def optionalfeatures: typingsJapgolly.electronUtil.electronUtilStrings.optionalfeatures = "optionalfeatures".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.optionalfeatures]
    
    inline def otherusers: typingsJapgolly.electronUtil.electronUtilStrings.otherusers = "otherusers".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.otherusers]
    
    inline def pen: typingsJapgolly.electronUtil.electronUtilStrings.pen = "pen".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.pen]
    
    inline def personalization: typingsJapgolly.electronUtil.electronUtilStrings.personalization = "personalization".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.personalization]
    
    inline def `personalization-background`: typingsJapgolly.electronUtil.electronUtilStrings.`personalization-background` = "personalization-background".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`personalization-background`]
    
    inline def `personalization-colors`: typingsJapgolly.electronUtil.electronUtilStrings.`personalization-colors` = "personalization-colors".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`personalization-colors`]
    
    inline def `personalization-start`: typingsJapgolly.electronUtil.electronUtilStrings.`personalization-start` = "personalization-start".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`personalization-start`]
    
    inline def powersleep: typingsJapgolly.electronUtil.electronUtilStrings.powersleep = "powersleep".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.powersleep]
    
    inline def printers: typingsJapgolly.electronUtil.electronUtilStrings.printers = "printers".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.printers]
    
    inline def privacy: privacy_ = "privacy".asInstanceOf[privacy_]
    
    inline def `privacy-accountinfo`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-accountinfo` = "privacy-accountinfo".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-accountinfo`]
    
    inline def `privacy-activityhistory`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-activityhistory` = "privacy-activityhistory".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-activityhistory`]
    
    inline def `privacy-appdiagnostics`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-appdiagnostics` = "privacy-appdiagnostics".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-appdiagnostics`]
    
    inline def `privacy-automaticfiledownloads`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-automaticfiledownloads` = "privacy-automaticfiledownloads".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-automaticfiledownloads`]
    
    inline def `privacy-backgroundapps`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-backgroundapps` = "privacy-backgroundapps".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-backgroundapps`]
    
    inline def `privacy-broadfilesystemaccess`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-broadfilesystemaccess` = "privacy-broadfilesystemaccess".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-broadfilesystemaccess`]
    
    inline def `privacy-calendar`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-calendar` = "privacy-calendar".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-calendar`]
    
    inline def `privacy-callhistory`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-callhistory` = "privacy-callhistory".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-callhistory`]
    
    inline def `privacy-contacts`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-contacts` = "privacy-contacts".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-contacts`]
    
    inline def `privacy-customdevices`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-customdevices` = "privacy-customdevices".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-customdevices`]
    
    inline def `privacy-documents`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-documents` = "privacy-documents".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-documents`]
    
    inline def `privacy-email`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-email` = "privacy-email".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-email`]
    
    inline def `privacy-eyetracker`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-eyetracker` = "privacy-eyetracker".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-eyetracker`]
    
    inline def `privacy-feedback`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-feedback` = "privacy-feedback".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-feedback`]
    
    inline def `privacy-location`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-location` = "privacy-location".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-location`]
    
    inline def `privacy-messaging`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-messaging` = "privacy-messaging".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-messaging`]
    
    inline def `privacy-microphone`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-microphone` = "privacy-microphone".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-microphone`]
    
    inline def `privacy-notifications`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-notifications` = "privacy-notifications".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-notifications`]
    
    inline def `privacy-phonecalls`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-phonecalls` = "privacy-phonecalls".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-phonecalls`]
    
    inline def `privacy-pictures`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-pictures` = "privacy-pictures".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-pictures`]
    
    inline def `privacy-radios`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-radios` = "privacy-radios".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-radios`]
    
    inline def `privacy-speech`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-speech` = "privacy-speech".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-speech`]
    
    inline def `privacy-speechtyping`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-speechtyping` = "privacy-speechtyping".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-speechtyping`]
    
    inline def `privacy-tasks`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-tasks` = "privacy-tasks".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-tasks`]
    
    inline def `privacy-videos`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-videos` = "privacy-videos".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-videos`]
    
    inline def `privacy-voiceactivation`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-voiceactivation` = "privacy-voiceactivation".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-voiceactivation`]
    
    inline def `privacy-webcam`: typingsJapgolly.electronUtil.electronUtilStrings.`privacy-webcam` = "privacy-webcam".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`privacy-webcam`]
    
    inline def project: typingsJapgolly.electronUtil.electronUtilStrings.project = "project".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.project]
    
    inline def quiethours: typingsJapgolly.electronUtil.electronUtilStrings.quiethours = "quiethours".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.quiethours]
    
    inline def recovery: typingsJapgolly.electronUtil.electronUtilStrings.recovery = "recovery".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.recovery]
    
    inline def regionformatting: typingsJapgolly.electronUtil.electronUtilStrings.regionformatting = "regionformatting".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.regionformatting]
    
    inline def regionlanguage: typingsJapgolly.electronUtil.electronUtilStrings.regionlanguage = "regionlanguage".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.regionlanguage]
    
    inline def remotedesktop: typingsJapgolly.electronUtil.electronUtilStrings.remotedesktop = "remotedesktop".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.remotedesktop]
    
    inline def `search-permissions`: typingsJapgolly.electronUtil.electronUtilStrings.`search-permissions` = "search-permissions".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.`search-permissions`]
    
    inline def signinoptions: typingsJapgolly.electronUtil.electronUtilStrings.signinoptions = "signinoptions".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.signinoptions]
    
    inline def sound: typingsJapgolly.electronUtil.electronUtilStrings.sound = "sound".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.sound]
    
    inline def speech: typingsJapgolly.electronUtil.electronUtilStrings.speech = "speech".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.speech]
    
    inline def startupapps: typingsJapgolly.electronUtil.electronUtilStrings.startupapps = "startupapps".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.startupapps]
    
    inline def storagesense: typingsJapgolly.electronUtil.electronUtilStrings.storagesense = "storagesense".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.storagesense]
    
    inline def sync: typingsJapgolly.electronUtil.electronUtilStrings.sync = "sync".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.sync]
    
    inline def tabletmode: typingsJapgolly.electronUtil.electronUtilStrings.tabletmode = "tabletmode".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.tabletmode]
    
    inline def taskbar: typingsJapgolly.electronUtil.electronUtilStrings.taskbar = "taskbar".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.taskbar]
    
    inline def themes: typingsJapgolly.electronUtil.electronUtilStrings.themes = "themes".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.themes]
    
    inline def troubleshoot: typingsJapgolly.electronUtil.electronUtilStrings.troubleshoot = "troubleshoot".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.troubleshoot]
    
    inline def typing: typingsJapgolly.electronUtil.electronUtilStrings.typing = "typing".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.typing]
    
    inline def usb: typingsJapgolly.electronUtil.electronUtilStrings.usb = "usb".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.usb]
    
    inline def videoplayback: typingsJapgolly.electronUtil.electronUtilStrings.videoplayback = "videoplayback".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.videoplayback]
    
    inline def wheel: typingsJapgolly.electronUtil.electronUtilStrings.wheel = "wheel".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.wheel]
    
    inline def windowsdefender: typingsJapgolly.electronUtil.electronUtilStrings.windowsdefender = "windowsdefender".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.windowsdefender]
    
    inline def windowsinsider: typingsJapgolly.electronUtil.electronUtilStrings.windowsinsider = "windowsinsider".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.windowsinsider]
    
    inline def windowsupdate: typingsJapgolly.electronUtil.electronUtilStrings.windowsupdate = "windowsupdate".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.windowsupdate]
    
    inline def workplace: typingsJapgolly.electronUtil.electronUtilStrings.workplace = "workplace".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.workplace]
    
    inline def yourinfo: typingsJapgolly.electronUtil.electronUtilStrings.yourinfo = "yourinfo".asInstanceOf[typingsJapgolly.electronUtil.electronUtilStrings.yourinfo]
  }
  
  trait _Choices[Macos, Windows, Linux, Default] extends StObject {
    
    val default: js.UndefOr[Default | js.Function0[Default]] = js.undefined
    
    val linux: js.UndefOr[Linux | js.Function0[Linux]] = js.undefined
    
    val macos: js.UndefOr[Macos | js.Function0[Macos]] = js.undefined
    
    val windows: js.UndefOr[Windows | js.Function0[Windows]] = js.undefined
  }
  object _Choices {
    
    inline def apply[Macos, Windows, Linux, Default](): _Choices[Macos, Windows, Linux, Default] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[_Choices[Macos, Windows, Linux, Default]]
    }
    
    extension [Self <: _Choices[?, ?, ?, ?], Macos, Windows, Linux, Default](x: Self & (_Choices[Macos, Windows, Linux, Default])) {
      
      inline def setDefault(value: Default | js.Function0[Default]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultCallbackTo(value: CallbackTo[Default]): Self = StObject.set(x, "default", value.toJsFn)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setLinux(value: Linux | js.Function0[Linux]): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
      
      inline def setLinuxCallbackTo(value: CallbackTo[Linux]): Self = StObject.set(x, "linux", value.toJsFn)
      
      inline def setLinuxUndefined: Self = StObject.set(x, "linux", js.undefined)
      
      inline def setMacos(value: Macos | js.Function0[Macos]): Self = StObject.set(x, "macos", value.asInstanceOf[js.Any])
      
      inline def setMacosCallbackTo(value: CallbackTo[Macos]): Self = StObject.set(x, "macos", value.toJsFn)
      
      inline def setMacosUndefined: Self = StObject.set(x, "macos", js.undefined)
      
      inline def setWindows(value: Windows | js.Function0[Windows]): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      inline def setWindowsCallbackTo(value: CallbackTo[Windows]): Self = StObject.set(x, "windows", value.toJsFn)
      
      inline def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
    }
  }
}
