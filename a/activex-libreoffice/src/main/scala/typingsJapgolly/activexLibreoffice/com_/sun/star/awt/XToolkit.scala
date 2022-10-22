package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a factory interface for the window toolkit.
  *
  * This is similar to the abstract window toolkit (AWT) in Java.
  */
trait XToolkit
  extends StObject
     with XInterface {
  
  /** returns the desktop window. */
  val DesktopWindow: XWindowPeer
  
  /**
    * For LibreOffice versions < 4.1, this method just returned an empty rectangle. After that, it started returning a valid value.
    * @returns the size and position of the primary display
    */
  val WorkArea: Rectangle
  
  /** creates a region. */
  def createRegion(): XRegion
  
  /** creates a virtual device that is compatible with the screen. */
  def createScreenCompatibleDevice(Width: Double, Height: Double): XDevice
  
  /** creates a new window using the given descriptor. */
  def createWindow(Descriptor: WindowDescriptor): XWindowPeer
  
  /** returns a sequence of windows which are newly created using the given descriptors. */
  def createWindows(Descriptors: SeqEquiv[WindowDescriptor]): SafeArray[XWindowPeer]
  
  /** returns the desktop window. */
  def getDesktopWindow(): XWindowPeer
  
  /**
    * For LibreOffice versions < 4.1, this method just returned an empty rectangle. After that, it started returning a valid value.
    * @returns the size and position of the primary display
    */
  def getWorkArea(): Rectangle
}
object XToolkit {
  
  inline def apply(
    DesktopWindow: XWindowPeer,
    WorkArea: Rectangle,
    acquire: Callback,
    createRegion: CallbackTo[XRegion],
    createScreenCompatibleDevice: (Double, Double) => XDevice,
    createWindow: WindowDescriptor => XWindowPeer,
    createWindows: SeqEquiv[WindowDescriptor] => SafeArray[XWindowPeer],
    getDesktopWindow: CallbackTo[XWindowPeer],
    getWorkArea: CallbackTo[Rectangle],
    queryInterface: `type` => Any,
    release: Callback
  ): XToolkit = {
    val __obj = js.Dynamic.literal(DesktopWindow = DesktopWindow.asInstanceOf[js.Any], WorkArea = WorkArea.asInstanceOf[js.Any], acquire = acquire.toJsFn, createRegion = createRegion.toJsFn, createScreenCompatibleDevice = js.Any.fromFunction2(createScreenCompatibleDevice), createWindow = js.Any.fromFunction1(createWindow), createWindows = js.Any.fromFunction1(createWindows), getDesktopWindow = getDesktopWindow.toJsFn, getWorkArea = getWorkArea.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XToolkit]
  }
  
  extension [Self <: XToolkit](x: Self) {
    
    inline def setCreateRegion(value: CallbackTo[XRegion]): Self = StObject.set(x, "createRegion", value.toJsFn)
    
    inline def setCreateScreenCompatibleDevice(value: (Double, Double) => XDevice): Self = StObject.set(x, "createScreenCompatibleDevice", js.Any.fromFunction2(value))
    
    inline def setCreateWindow(value: WindowDescriptor => XWindowPeer): Self = StObject.set(x, "createWindow", js.Any.fromFunction1(value))
    
    inline def setCreateWindows(value: SeqEquiv[WindowDescriptor] => SafeArray[XWindowPeer]): Self = StObject.set(x, "createWindows", js.Any.fromFunction1(value))
    
    inline def setDesktopWindow(value: XWindowPeer): Self = StObject.set(x, "DesktopWindow", value.asInstanceOf[js.Any])
    
    inline def setGetDesktopWindow(value: CallbackTo[XWindowPeer]): Self = StObject.set(x, "getDesktopWindow", value.toJsFn)
    
    inline def setGetWorkArea(value: CallbackTo[Rectangle]): Self = StObject.set(x, "getWorkArea", value.toJsFn)
    
    inline def setWorkArea(value: Rectangle): Self = StObject.set(x, "WorkArea", value.asInstanceOf[js.Any])
  }
}
