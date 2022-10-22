package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the actual window implementation on the device. */
trait XWindowPeer
  extends StObject
     with XComponent {
  
  /** returns the toolkit which created this object. */
  val Toolkit: XToolkit
  
  /** returns the toolkit which created this object. */
  def getToolkit(): XToolkit
  
  /**
    * invalidates the whole window with the specified {@link InvalidateStyle} .
    * @param Flags see {@link com.sun.star.awt.InvalidateStyle}
    */
  def invalidate(Flags: Double): Unit
  
  /**
    * invalidates a rectangular area of the window with the specified {@link InvalidateStyle} .
    * @param Rect the area to invalidate.
    * @param Flags see {@link com.sun.star.awt.InvalidateStyle}
    */
  def invalidateRect(Rect: Rectangle, Flags: Double): Unit
  
  /** sets the background color. */
  def setBackground(Color: Color): Unit
  
  /** sets the mouse pointer. */
  def setPointer(Pointer: XPointer): Unit
}
object XWindowPeer {
  
  inline def apply(
    Toolkit: XToolkit,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    dispose: Callback,
    getToolkit: CallbackTo[XToolkit],
    invalidate: Double => Callback,
    invalidateRect: (Rectangle, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    setBackground: Color => Callback,
    setPointer: XPointer => Callback
  ): XWindowPeer = {
    val __obj = js.Dynamic.literal(Toolkit = Toolkit.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, getToolkit = getToolkit.toJsFn, invalidate = js.Any.fromFunction1((t0: Double) => invalidate(t0).runNow()), invalidateRect = js.Any.fromFunction2((t0: Rectangle, t1: Double) => (invalidateRect(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setBackground = js.Any.fromFunction1((t0: Color) => setBackground(t0).runNow()), setPointer = js.Any.fromFunction1((t0: XPointer) => setPointer(t0).runNow()))
    __obj.asInstanceOf[XWindowPeer]
  }
  
  extension [Self <: XWindowPeer](x: Self) {
    
    inline def setGetToolkit(value: CallbackTo[XToolkit]): Self = StObject.set(x, "getToolkit", value.toJsFn)
    
    inline def setInvalidate(value: Double => Callback): Self = StObject.set(x, "invalidate", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setInvalidateRect(value: (Rectangle, Double) => Callback): Self = StObject.set(x, "invalidateRect", js.Any.fromFunction2((t0: Rectangle, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetBackground(value: Color => Callback): Self = StObject.set(x, "setBackground", js.Any.fromFunction1((t0: Color) => value(t0).runNow()))
    
    inline def setSetPointer(value: XPointer => Callback): Self = StObject.set(x, "setPointer", js.Any.fromFunction1((t0: XPointer) => value(t0).runNow()))
    
    inline def setToolkit(value: XToolkit): Self = StObject.set(x, "Toolkit", value.asInstanceOf[js.Any])
  }
}
