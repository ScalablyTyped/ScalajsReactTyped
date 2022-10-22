package typingsJapgolly.menubar

import typingsJapgolly.electron.mod.Tray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilGetWindowPositionMod {
  
  @JSImport("menubar/lib/util/getWindowPosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWindowPosition(tray: Tray): WindowPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindowPosition")(tray.asInstanceOf[js.Any]).asInstanceOf[WindowPosition]
  
  inline def taskbarLocation(tray: Tray): TaskbarLocation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("taskbarLocation")(tray.asInstanceOf[js.Any]).asInstanceOf[TaskbarLocation_]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.menubar.menubarStrings.top
    - typingsJapgolly.menubar.menubarStrings.bottom
    - typingsJapgolly.menubar.menubarStrings.left
    - typingsJapgolly.menubar.menubarStrings.right
  */
  trait TaskbarLocation_ extends StObject
  object TaskbarLocation_ {
    
    inline def bottom: typingsJapgolly.menubar.menubarStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.menubar.menubarStrings.bottom]
    
    inline def left: typingsJapgolly.menubar.menubarStrings.left = "left".asInstanceOf[typingsJapgolly.menubar.menubarStrings.left]
    
    inline def right: typingsJapgolly.menubar.menubarStrings.right = "right".asInstanceOf[typingsJapgolly.menubar.menubarStrings.right]
    
    inline def top: typingsJapgolly.menubar.menubarStrings.top = "top".asInstanceOf[typingsJapgolly.menubar.menubarStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.menubar.menubarStrings.trayCenter
    - typingsJapgolly.menubar.menubarStrings.topRight
    - typingsJapgolly.menubar.menubarStrings.trayBottomCenter
    - typingsJapgolly.menubar.menubarStrings.bottomLeft
    - typingsJapgolly.menubar.menubarStrings.bottomRight
  */
  trait WindowPosition extends StObject
  object WindowPosition {
    
    inline def bottomLeft: typingsJapgolly.menubar.menubarStrings.bottomLeft = "bottomLeft".asInstanceOf[typingsJapgolly.menubar.menubarStrings.bottomLeft]
    
    inline def bottomRight: typingsJapgolly.menubar.menubarStrings.bottomRight = "bottomRight".asInstanceOf[typingsJapgolly.menubar.menubarStrings.bottomRight]
    
    inline def topRight: typingsJapgolly.menubar.menubarStrings.topRight = "topRight".asInstanceOf[typingsJapgolly.menubar.menubarStrings.topRight]
    
    inline def trayBottomCenter: typingsJapgolly.menubar.menubarStrings.trayBottomCenter = "trayBottomCenter".asInstanceOf[typingsJapgolly.menubar.menubarStrings.trayBottomCenter]
    
    inline def trayCenter: typingsJapgolly.menubar.menubarStrings.trayCenter = "trayCenter".asInstanceOf[typingsJapgolly.menubar.menubarStrings.trayCenter]
  }
}
