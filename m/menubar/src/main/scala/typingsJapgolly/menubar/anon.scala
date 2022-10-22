package typingsJapgolly.menubar

import typingsJapgolly.electron.Electron.CrossProcessExports.BrowserWindowConstructorOptions
import typingsJapgolly.electron.Electron.CrossProcessExports.LoadURLOptions
import typingsJapgolly.electron.Electron.NativeImage_
import typingsJapgolly.electron.mod.Tray
import typingsJapgolly.menubar.menubarBooleans.`false`
import typingsJapgolly.menubar.menubarStrings.bottomCenter
import typingsJapgolly.menubar.menubarStrings.bottomLeft
import typingsJapgolly.menubar.menubarStrings.bottomRight
import typingsJapgolly.menubar.menubarStrings.center
import typingsJapgolly.menubar.menubarStrings.leftCenter
import typingsJapgolly.menubar.menubarStrings.rightCenter
import typingsJapgolly.menubar.menubarStrings.topCenter
import typingsJapgolly.menubar.menubarStrings.topLeft
import typingsJapgolly.menubar.menubarStrings.topRight
import typingsJapgolly.menubar.menubarStrings.trayBottomCenter
import typingsJapgolly.menubar.menubarStrings.trayBottomLeft
import typingsJapgolly.menubar.menubarStrings.trayBottomRight
import typingsJapgolly.menubar.menubarStrings.trayCenter
import typingsJapgolly.menubar.menubarStrings.trayLeft
import typingsJapgolly.menubar.menubarStrings.trayRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<menubar.menubar/lib/types.Options> */
  trait PartialOptions extends StObject {
    
    var activateWithApp: js.UndefOr[Boolean] = js.undefined
    
    var browserWindow: js.UndefOr[BrowserWindowConstructorOptions] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[String | NativeImage_] = js.undefined
    
    var index: js.UndefOr[String | `false`] = js.undefined
    
    var loadUrlOptions: js.UndefOr[LoadURLOptions] = js.undefined
    
    var preloadWindow: js.UndefOr[Boolean] = js.undefined
    
    var showDockIcon: js.UndefOr[Boolean] = js.undefined
    
    var showOnAllWorkspaces: js.UndefOr[Boolean] = js.undefined
    
    var showOnRightClick: js.UndefOr[Boolean] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
    
    var tray: js.UndefOr[Tray] = js.undefined
    
    var windowPosition: js.UndefOr[
        trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
      ] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setActivateWithApp(value: Boolean): Self = StObject.set(x, "activateWithApp", value.asInstanceOf[js.Any])
      
      inline def setActivateWithAppUndefined: Self = StObject.set(x, "activateWithApp", js.undefined)
      
      inline def setBrowserWindow(value: BrowserWindowConstructorOptions): Self = StObject.set(x, "browserWindow", value.asInstanceOf[js.Any])
      
      inline def setBrowserWindowUndefined: Self = StObject.set(x, "browserWindow", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setIcon(value: String | NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIndex(value: String | `false`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLoadUrlOptions(value: LoadURLOptions): Self = StObject.set(x, "loadUrlOptions", value.asInstanceOf[js.Any])
      
      inline def setLoadUrlOptionsUndefined: Self = StObject.set(x, "loadUrlOptions", js.undefined)
      
      inline def setPreloadWindow(value: Boolean): Self = StObject.set(x, "preloadWindow", value.asInstanceOf[js.Any])
      
      inline def setPreloadWindowUndefined: Self = StObject.set(x, "preloadWindow", js.undefined)
      
      inline def setShowDockIcon(value: Boolean): Self = StObject.set(x, "showDockIcon", value.asInstanceOf[js.Any])
      
      inline def setShowDockIconUndefined: Self = StObject.set(x, "showDockIcon", js.undefined)
      
      inline def setShowOnAllWorkspaces(value: Boolean): Self = StObject.set(x, "showOnAllWorkspaces", value.asInstanceOf[js.Any])
      
      inline def setShowOnAllWorkspacesUndefined: Self = StObject.set(x, "showOnAllWorkspaces", js.undefined)
      
      inline def setShowOnRightClick(value: Boolean): Self = StObject.set(x, "showOnRightClick", value.asInstanceOf[js.Any])
      
      inline def setShowOnRightClickUndefined: Self = StObject.set(x, "showOnRightClick", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTray(value: Tray): Self = StObject.set(x, "tray", value.asInstanceOf[js.Any])
      
      inline def setTrayUndefined: Self = StObject.set(x, "tray", js.undefined)
      
      inline def setWindowPosition(
        value: trayLeft | trayBottomLeft | trayRight | trayBottomRight | trayCenter | trayBottomCenter | topLeft | topRight | bottomLeft | bottomRight | topCenter | bottomCenter | leftCenter | rightCenter | center
      ): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      inline def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
    }
  }
}
