package typingsJapgolly.menubar

import typingsJapgolly.electron.Electron.App
import typingsJapgolly.electron.mod.Tray
import typingsJapgolly.menubar.anon.PartialOptions
import typingsJapgolly.menubar.libMenubarMod.Menubar
import typingsJapgolly.menubar.libUtilGetWindowPositionMod.TaskbarLocation_
import typingsJapgolly.menubar.libUtilGetWindowPositionMod.WindowPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("menubar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("menubar", "Menubar")
  @js.native
  open class Menubar_ protected () extends Menubar {
    def this(app: App) = this()
    def this(app: App, options: PartialOptions) = this()
  }
  
  inline def getWindowPosition(tray: Tray): WindowPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowPosition")(tray.asInstanceOf[js.Any]).asInstanceOf[WindowPosition]
  
  inline def menubar(): Menubar = ^.asInstanceOf[js.Dynamic].applyDynamic("menubar")().asInstanceOf[Menubar]
  inline def menubar(options: PartialOptions): Menubar = ^.asInstanceOf[js.Dynamic].applyDynamic("menubar")(options.asInstanceOf[js.Any]).asInstanceOf[Menubar]
  
  inline def taskbarLocation(tray: Tray): TaskbarLocation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("taskbarLocation")(tray.asInstanceOf[js.Any]).asInstanceOf[TaskbarLocation_]
}
