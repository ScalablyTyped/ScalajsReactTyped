package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies some extended operations for a window component.
  *
  * A window is a rectangular region on an output device with its own position, size, and internal coordinate system. A window is used for displaying
  * data. In addition, the window receives events from the user.
  */
trait XWindow2
  extends StObject
     with XWindow {
  
  /** returns the inner bounds of the window, also known as the client size. */
  var OutputSize: Size
  
  /** returns the inner bounds of the window, also known as the client size. */
  def getOutputSize(): Size
  
  /** returns the focus state of the window */
  def hasFocus(): Boolean
  
  /** returns the activation state of the window */
  def isActive(): Boolean
  
  /** returns the enabled state of the window */
  def isEnabled(): Boolean
  
  /** returns the visibility state of the window */
  def isVisible(): Boolean
  
  /**
    * sets the inner bounds of the window, also known as the client size
    * @param Size the inner width and height of the window.
    */
  def setOutputSize(Size: Size): Unit
}
object XWindow2 {
  
  inline def apply(
    OutputSize: Size,
    PosSize: Rectangle,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addFocusListener: XFocusListener => Callback,
    addKeyListener: XKeyListener => Callback,
    addMouseListener: XMouseListener => Callback,
    addMouseMotionListener: XMouseMotionListener => Callback,
    addPaintListener: XPaintListener => Callback,
    addWindowListener: XWindowListener => Callback,
    dispose: Callback,
    getOutputSize: CallbackTo[Size],
    getPosSize: CallbackTo[Rectangle],
    hasFocus: CallbackTo[Boolean],
    isActive: CallbackTo[Boolean],
    isEnabled: CallbackTo[Boolean],
    isVisible: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removeFocusListener: XFocusListener => Callback,
    removeKeyListener: XKeyListener => Callback,
    removeMouseListener: XMouseListener => Callback,
    removeMouseMotionListener: XMouseMotionListener => Callback,
    removePaintListener: XPaintListener => Callback,
    removeWindowListener: XWindowListener => Callback,
    setEnable: Boolean => Callback,
    setFocus: Callback,
    setOutputSize: Size => Callback,
    setPosSize: (Double, Double, Double, Double, Double) => Callback,
    setVisible: Boolean => Callback
  ): XWindow2 = {
    val __obj = js.Dynamic.literal(OutputSize = OutputSize.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), dispose = dispose.toJsFn, getOutputSize = getOutputSize.toJsFn, getPosSize = getPosSize.toJsFn, hasFocus = hasFocus.toJsFn, isActive = isActive.toJsFn, isEnabled = isEnabled.toJsFn, isVisible = isVisible.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setOutputSize = js.Any.fromFunction1((t0: Size) => setOutputSize(t0).runNow()), setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[XWindow2]
  }
  
  extension [Self <: XWindow2](x: Self) {
    
    inline def setGetOutputSize(value: CallbackTo[Size]): Self = StObject.set(x, "getOutputSize", value.toJsFn)
    
    inline def setHasFocus(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasFocus", value.toJsFn)
    
    inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
    
    inline def setIsEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEnabled", value.toJsFn)
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setOutputSize(value: Size): Self = StObject.set(x, "OutputSize", value.asInstanceOf[js.Any])
    
    inline def setSetOutputSize(value: Size => Callback): Self = StObject.set(x, "setOutputSize", js.Any.fromFunction1((t0: Size) => value(t0).runNow()))
  }
}
