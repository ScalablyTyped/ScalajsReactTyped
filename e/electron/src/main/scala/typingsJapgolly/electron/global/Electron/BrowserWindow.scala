package typingsJapgolly.electron.global.Electron

import typingsJapgolly.electron.Electron.BrowserWindowConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.BrowserWindow")
@js.native
/**
  * BrowserWindow
  */
open class BrowserWindow ()
  extends typingsJapgolly.electron.Electron.BrowserWindow {
  def this(options: BrowserWindowConstructorOptions) = this()
}
object BrowserWindow {
  
  @JSGlobal("Electron.BrowserWindow")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The window that owns the given `browserView`. If the given view is not attached
    * to any window, returns `null`.
    */
  /* static member */
  inline def fromBrowserView(browserView: typingsJapgolly.electron.Electron.BrowserView): typingsJapgolly.electron.Electron.BrowserWindow | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBrowserView")(browserView.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.electron.Electron.BrowserWindow | Null]
  
  /**
    * The window with the given `id`.
    */
  /* static member */
  inline def fromId(id: Double): typingsJapgolly.electron.Electron.BrowserWindow | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(id.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.electron.Electron.BrowserWindow | Null]
  
  /**
    * The window that owns the given `webContents` or `null` if the contents are not
    * owned by a window.
    */
  /* static member */
  inline def fromWebContents(webContents: typingsJapgolly.electron.Electron.WebContents_): typingsJapgolly.electron.Electron.BrowserWindow | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWebContents")(webContents.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.electron.Electron.BrowserWindow | Null]
  
  /**
    * An array of all opened browser windows.
    */
  /* static member */
  inline def getAllWindows(): js.Array[typingsJapgolly.electron.Electron.BrowserWindow] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllWindows")().asInstanceOf[js.Array[typingsJapgolly.electron.Electron.BrowserWindow]]
  
  /**
    * The window that is focused in this application, otherwise returns `null`.
    */
  /* static member */
  inline def getFocusedWindow(): typingsJapgolly.electron.Electron.BrowserWindow | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusedWindow")().asInstanceOf[typingsJapgolly.electron.Electron.BrowserWindow | Null]
}
