package typingsJapgolly.electronPositioner

import typingsJapgolly.electron.Electron.CrossProcessExports.Rectangle
import typingsJapgolly.electron.mod.BrowserWindow
import typingsJapgolly.electronPositioner.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-positioner", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ElectronPositioner {
    def this(browserWindow: BrowserWindow) = this()
  }
  
  @js.native
  trait ElectronPositioner extends StObject {
    
    def calculate(position: Position): X = js.native
    def calculate(position: Position, trayBounds: Rectangle): X = js.native
    def calculate(position: TrayPosition, trayBounds: Rectangle): X = js.native
    
    def move(position: Position): Unit = js.native
    def move(position: Position, trayBounds: Rectangle): Unit = js.native
    def move(position: TrayPosition, trayBounds: Rectangle): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.electronPositioner.electronPositionerStrings.topLeft
    - typingsJapgolly.electronPositioner.electronPositionerStrings.topRight
    - typingsJapgolly.electronPositioner.electronPositionerStrings.bottomLeft
    - typingsJapgolly.electronPositioner.electronPositionerStrings.bottomRight
    - typingsJapgolly.electronPositioner.electronPositionerStrings.topCenter
    - typingsJapgolly.electronPositioner.electronPositionerStrings.bottomCenter
    - typingsJapgolly.electronPositioner.electronPositionerStrings.leftCenter
    - typingsJapgolly.electronPositioner.electronPositionerStrings.rightCenter
    - typingsJapgolly.electronPositioner.electronPositionerStrings.center
  */
  trait Position extends StObject
  object Position {
    
    inline def bottomCenter: typingsJapgolly.electronPositioner.electronPositionerStrings.bottomCenter = "bottomCenter".asInstanceOf[typingsJapgolly.electronPositioner.electronPositionerStrings.bottomCenter]
    
    inline def bottomLeft: typingsJapgolly.electronPositioner.electronPositionerStrings.bottomLeft = "bottomLeft".asInstanceOf[typingsJapgolly.electronPositioner.electronPositionerStrings.bottomLeft]
    
    inline def bottomRight: typingsJapgolly.electronPositioner.electronPositionerStrings.bottomRight = "bottomRight".asInstanceOf[typingsJapgolly.electronPositioner.electronPositionerStrings.bottomRight]
    
    inline def center: typingsJapgolly.electronPositioner.electronPositionerStrings.center = "center".asInstanceOf[typingsJapgolly.electronPositioner.electronPositionerStrings.center]
    
    inline def leftCenter: typingsJapgolly.electronPositioner.electronPositionerStrings.leftCenter = "leftCenter".asInstanceOf[typingsJapgolly.electronPositioner.electronPositionerStrings.leftCenter]
    
    inline def rightCenter: typingsJapgolly.electronPositioner.electronPositionerStrings.rightCenter = "rightCenter".asInstanceOf[typingsJapgolly.electronPositioner.electronPositionerStrings.rightCenter]
    
    inline def topCenter: typingsJapgolly.electronPositioner.electronPositionerStrings.topCenter = "topCenter".asInstanceOf[typingsJapgolly.electronPositioner.electronPositionerStrings.topCenter]
    
    inline def topLeft: typingsJapgolly.electronPositioner.electronPositionerStrings.topLeft = "topLeft".asInstanceOf[typingsJapgolly.electronPositioner.electronPositionerStrings.topLeft]
    
    inline def topRight: typingsJapgolly.electronPositioner.electronPositionerStrings.topRight = "topRight".asInstanceOf[typingsJapgolly.electronPositioner.electronPositionerStrings.topRight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.electronPositioner.electronPositionerStrings.trayLeft
    - typingsJapgolly.electronPositioner.electronPositionerStrings.trayBottomLeft
    - typingsJapgolly.electronPositioner.electronPositionerStrings.trayRight
    - typingsJapgolly.electronPositioner.electronPositionerStrings.trayBottomRight
    - typingsJapgolly.electronPositioner.electronPositionerStrings.trayCenter
    - typingsJapgolly.electronPositioner.electronPositionerStrings.trayBottomCenter
  */
  trait TrayPosition extends StObject
  object TrayPosition {
    
    inline def trayBottomCenter: typingsJapgolly.electronPositioner.electronPositionerStrings.trayBottomCenter = "trayBottomCenter".asInstanceOf[typingsJapgolly.electronPositioner.electronPositionerStrings.trayBottomCenter]
    
    inline def trayBottomLeft: typingsJapgolly.electronPositioner.electronPositionerStrings.trayBottomLeft = "trayBottomLeft".asInstanceOf[typingsJapgolly.electronPositioner.electronPositionerStrings.trayBottomLeft]
    
    inline def trayBottomRight: typingsJapgolly.electronPositioner.electronPositionerStrings.trayBottomRight = "trayBottomRight".asInstanceOf[typingsJapgolly.electronPositioner.electronPositionerStrings.trayBottomRight]
    
    inline def trayCenter: typingsJapgolly.electronPositioner.electronPositionerStrings.trayCenter = "trayCenter".asInstanceOf[typingsJapgolly.electronPositioner.electronPositionerStrings.trayCenter]
    
    inline def trayLeft: typingsJapgolly.electronPositioner.electronPositionerStrings.trayLeft = "trayLeft".asInstanceOf[typingsJapgolly.electronPositioner.electronPositionerStrings.trayLeft]
    
    inline def trayRight: typingsJapgolly.electronPositioner.electronPositionerStrings.trayRight = "trayRight".asInstanceOf[typingsJapgolly.electronPositioner.electronPositionerStrings.trayRight]
  }
}
