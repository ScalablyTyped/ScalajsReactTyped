package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the basic operations for a window component.
  *
  * A window is a rectangular region on an output device with its own position, size, and internal coordinate system. A window is used for displaying
  * data. In addition, the window receives events from the user.
  */
trait XWindow
  extends StObject
     with XComponent {
  
  /** returns the outer bounds of the window. */
  val PosSize: Rectangle
  
  /** adds a focus listener to the object. */
  def addFocusListener(xListener: XFocusListener): Unit
  
  /** adds a key listener to the object. */
  def addKeyListener(xListener: XKeyListener): Unit
  
  /** adds a mouse listener to the object. */
  def addMouseListener(xListener: XMouseListener): Unit
  
  /** adds a mouse motion listener to the object. */
  def addMouseMotionListener(xListener: XMouseMotionListener): Unit
  
  /** adds a paint listener to the object. */
  def addPaintListener(xListener: XPaintListener): Unit
  
  /**
    * adds a window listener to the object.
    * @param xListener the listener to add. If this listener also supports the {@link XWindowListener2} interface, it will receive the additional events decla
    */
  def addWindowListener(xListener: XWindowListener): Unit
  
  /** returns the outer bounds of the window. */
  def getPosSize(): Rectangle
  
  /** removes the specified focus listener from the listener list. */
  def removeFocusListener(xListener: XFocusListener): Unit
  
  /** removes the specified key listener from the listener list. */
  def removeKeyListener(xListener: XKeyListener): Unit
  
  /** removes the specified mouse listener from the listener list. */
  def removeMouseListener(xListener: XMouseListener): Unit
  
  /** removes the specified mouse motion listener from the listener list. */
  def removeMouseMotionListener(xListener: XMouseMotionListener): Unit
  
  /** removes the specified paint listener from the listener list. */
  def removePaintListener(xListener: XPaintListener): Unit
  
  /** removes the specified window listener from the listener list. */
  def removeWindowListener(xListener: XWindowListener): Unit
  
  /** enables or disables the window depending on the parameter. */
  def setEnable(Enable: Boolean): Unit
  
  /** sets the focus to the window. */
  def setFocus(): Unit
  
  /**
    * sets the outer bounds of the window.
    * @param X the x-coordinate of the window.
    * @param Y the y-coordinate of the window.
    * @param Width the width of the window.
    * @param Height the height of the window.
    * @param Flags Flags are of type {@link PosSize} and specify, which parameters are taken into account when setting the outer bounds of the window.
    */
  def setPosSize(X: Double, Y: Double, Width: Double, Height: Double, Flags: Double): Unit
  
  /** shows or hides the window depending on the parameter. */
  def setVisible(Visible: Boolean): Unit
}
object XWindow {
  
  inline def apply(
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
    getPosSize: CallbackTo[Rectangle],
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
    setPosSize: (Double, Double, Double, Double, Double) => Callback,
    setVisible: Boolean => Callback
  ): XWindow = {
    val __obj = js.Dynamic.literal(PosSize = PosSize.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), dispose = dispose.toJsFn, getPosSize = getPosSize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[XWindow]
  }
  
  extension [Self <: XWindow](x: Self) {
    
    inline def setAddFocusListener(value: XFocusListener => Callback): Self = StObject.set(x, "addFocusListener", js.Any.fromFunction1((t0: XFocusListener) => value(t0).runNow()))
    
    inline def setAddKeyListener(value: XKeyListener => Callback): Self = StObject.set(x, "addKeyListener", js.Any.fromFunction1((t0: XKeyListener) => value(t0).runNow()))
    
    inline def setAddMouseListener(value: XMouseListener => Callback): Self = StObject.set(x, "addMouseListener", js.Any.fromFunction1((t0: XMouseListener) => value(t0).runNow()))
    
    inline def setAddMouseMotionListener(value: XMouseMotionListener => Callback): Self = StObject.set(x, "addMouseMotionListener", js.Any.fromFunction1((t0: XMouseMotionListener) => value(t0).runNow()))
    
    inline def setAddPaintListener(value: XPaintListener => Callback): Self = StObject.set(x, "addPaintListener", js.Any.fromFunction1((t0: XPaintListener) => value(t0).runNow()))
    
    inline def setAddWindowListener(value: XWindowListener => Callback): Self = StObject.set(x, "addWindowListener", js.Any.fromFunction1((t0: XWindowListener) => value(t0).runNow()))
    
    inline def setGetPosSize(value: CallbackTo[Rectangle]): Self = StObject.set(x, "getPosSize", value.toJsFn)
    
    inline def setPosSize(value: Rectangle): Self = StObject.set(x, "PosSize", value.asInstanceOf[js.Any])
    
    inline def setRemoveFocusListener(value: XFocusListener => Callback): Self = StObject.set(x, "removeFocusListener", js.Any.fromFunction1((t0: XFocusListener) => value(t0).runNow()))
    
    inline def setRemoveKeyListener(value: XKeyListener => Callback): Self = StObject.set(x, "removeKeyListener", js.Any.fromFunction1((t0: XKeyListener) => value(t0).runNow()))
    
    inline def setRemoveMouseListener(value: XMouseListener => Callback): Self = StObject.set(x, "removeMouseListener", js.Any.fromFunction1((t0: XMouseListener) => value(t0).runNow()))
    
    inline def setRemoveMouseMotionListener(value: XMouseMotionListener => Callback): Self = StObject.set(x, "removeMouseMotionListener", js.Any.fromFunction1((t0: XMouseMotionListener) => value(t0).runNow()))
    
    inline def setRemovePaintListener(value: XPaintListener => Callback): Self = StObject.set(x, "removePaintListener", js.Any.fromFunction1((t0: XPaintListener) => value(t0).runNow()))
    
    inline def setRemoveWindowListener(value: XWindowListener => Callback): Self = StObject.set(x, "removeWindowListener", js.Any.fromFunction1((t0: XWindowListener) => value(t0).runNow()))
    
    inline def setSetEnable(value: Boolean => Callback): Self = StObject.set(x, "setEnable", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetFocus(value: Callback): Self = StObject.set(x, "setFocus", value.toJsFn)
    
    inline def setSetPosSize(value: (Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "setPosSize", js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
