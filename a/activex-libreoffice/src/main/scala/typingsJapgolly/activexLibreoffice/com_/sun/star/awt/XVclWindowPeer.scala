package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to the VCL window implementation.
  * @deprecated Deprecated
  */
trait XVclWindowPeer
  extends StObject
     with XWindowPeer {
  
  /** enables clipping of sibling windows. */
  def enableClipSiblings(bClip: Boolean): Unit
  
  /** returns the value of the property with the specified name. */
  def getProperty(PropertyName: String): Any
  
  /** returns the font, foreground and background color for the specified type. */
  def getStyles(
    nType: Double,
    Font: js.Array[FontDescriptor],
    ForegroundColor: js.Array[Color],
    BackgroundColor: js.Array[Color]
  ): Unit
  
  /** returns `TRUE` if the window peer is a child, `FALSE` otherwise. */
  def isChild(Peer: XWindowPeer): Boolean
  
  /** returns `TRUE` if the window peer is in design mode, `FALSE` otherwise. */
  def isDesignMode(): Boolean
  
  /** sets the control font. */
  def setControlFont(aFont: FontDescriptor): Unit
  
  /** sets the design mode for use in a design editor. */
  def setDesignMode(bOn: Boolean): Unit
  
  /** sets the foreground color. */
  def setForeground(Color: Color): Unit
  
  /** sets the value of the property with the specified name. */
  def setProperty(PropertyName: String, Value: Any): Unit
}
object XVclWindowPeer {
  
  inline def apply(
    Toolkit: XToolkit,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    dispose: Callback,
    enableClipSiblings: Boolean => Callback,
    getProperty: String => Any,
    getStyles: (Double, js.Array[FontDescriptor], js.Array[Color], js.Array[Color]) => Callback,
    getToolkit: CallbackTo[XToolkit],
    invalidate: Double => Callback,
    invalidateRect: (Rectangle, Double) => Callback,
    isChild: XWindowPeer => Boolean,
    isDesignMode: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    setBackground: Color => Callback,
    setControlFont: FontDescriptor => Callback,
    setDesignMode: Boolean => Callback,
    setForeground: Color => Callback,
    setPointer: XPointer => Callback,
    setProperty: (String, Any) => Callback
  ): XVclWindowPeer = {
    val __obj = js.Dynamic.literal(Toolkit = Toolkit.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, enableClipSiblings = js.Any.fromFunction1((t0: Boolean) => enableClipSiblings(t0).runNow()), getProperty = js.Any.fromFunction1(getProperty), getStyles = js.Any.fromFunction4((t0: Double, t1: js.Array[FontDescriptor], t2: js.Array[Color], t3: js.Array[Color]) => (getStyles(t0, t1, t2, t3)).runNow()), getToolkit = getToolkit.toJsFn, invalidate = js.Any.fromFunction1((t0: Double) => invalidate(t0).runNow()), invalidateRect = js.Any.fromFunction2((t0: Rectangle, t1: Double) => (invalidateRect(t0, t1)).runNow()), isChild = js.Any.fromFunction1(isChild), isDesignMode = isDesignMode.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setBackground = js.Any.fromFunction1((t0: Color) => setBackground(t0).runNow()), setControlFont = js.Any.fromFunction1((t0: FontDescriptor) => setControlFont(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setForeground = js.Any.fromFunction1((t0: Color) => setForeground(t0).runNow()), setPointer = js.Any.fromFunction1((t0: XPointer) => setPointer(t0).runNow()), setProperty = js.Any.fromFunction2((t0: String, t1: Any) => (setProperty(t0, t1)).runNow()))
    __obj.asInstanceOf[XVclWindowPeer]
  }
  
  extension [Self <: XVclWindowPeer](x: Self) {
    
    inline def setEnableClipSiblings(value: Boolean => Callback): Self = StObject.set(x, "enableClipSiblings", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setGetProperty(value: String => Any): Self = StObject.set(x, "getProperty", js.Any.fromFunction1(value))
    
    inline def setGetStyles(value: (Double, js.Array[FontDescriptor], js.Array[Color], js.Array[Color]) => Callback): Self = StObject.set(x, "getStyles", js.Any.fromFunction4((t0: Double, t1: js.Array[FontDescriptor], t2: js.Array[Color], t3: js.Array[Color]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setIsChild(value: XWindowPeer => Boolean): Self = StObject.set(x, "isChild", js.Any.fromFunction1(value))
    
    inline def setIsDesignMode(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDesignMode", value.toJsFn)
    
    inline def setSetControlFont(value: FontDescriptor => Callback): Self = StObject.set(x, "setControlFont", js.Any.fromFunction1((t0: FontDescriptor) => value(t0).runNow()))
    
    inline def setSetDesignMode(value: Boolean => Callback): Self = StObject.set(x, "setDesignMode", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetForeground(value: Color => Callback): Self = StObject.set(x, "setForeground", js.Any.fromFunction1((t0: Color) => value(t0).runNow()))
    
    inline def setSetProperty(value: (String, Any) => Callback): Self = StObject.set(x, "setProperty", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
