package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a scroll bar control. */
trait UnoControlScrollBar
  extends StObject
     with UnoControl
     with XScrollBar
object UnoControlScrollBar {
  
  inline def apply(
    AccessibleContext: XAccessibleContext,
    BlockIncrement: Double,
    Context: XInterface,
    Graphics: XGraphics,
    LineIncrement: Double,
    Maximum: Double,
    Model: XControlModel,
    Orientation: Double,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    Size: Size,
    Value: Double,
    View: XView,
    VisibleSize: Double,
    acquire: Callback,
    addAdjustmentListener: XAdjustmentListener => Callback,
    addEventListener: XEventListener => Callback,
    addFocusListener: XFocusListener => Callback,
    addKeyListener: XKeyListener => Callback,
    addMouseListener: XMouseListener => Callback,
    addMouseMotionListener: XMouseMotionListener => Callback,
    addPaintListener: XPaintListener => Callback,
    addWindowListener: XWindowListener => Callback,
    createPeer: (XToolkit, XWindowPeer) => Callback,
    dispose: Callback,
    draw: (Double, Double) => Callback,
    getAccessibleContext: CallbackTo[XAccessibleContext],
    getBlockIncrement: CallbackTo[Double],
    getContext: CallbackTo[XInterface],
    getGraphics: CallbackTo[XGraphics],
    getLineIncrement: CallbackTo[Double],
    getMaximum: CallbackTo[Double],
    getModel: CallbackTo[XControlModel],
    getOrientation: CallbackTo[Double],
    getPeer: CallbackTo[XWindowPeer],
    getPosSize: CallbackTo[Rectangle],
    getSize: CallbackTo[Size],
    getValue: CallbackTo[Double],
    getView: CallbackTo[XView],
    getVisibleSize: CallbackTo[Double],
    isDesignMode: CallbackTo[Boolean],
    isTransparent: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeAdjustmentListener: XAdjustmentListener => Callback,
    removeEventListener: XEventListener => Callback,
    removeFocusListener: XFocusListener => Callback,
    removeKeyListener: XKeyListener => Callback,
    removeMouseListener: XMouseListener => Callback,
    removeMouseMotionListener: XMouseMotionListener => Callback,
    removePaintListener: XPaintListener => Callback,
    removeWindowListener: XWindowListener => Callback,
    setBlockIncrement: Double => Callback,
    setContext: XInterface => Callback,
    setDesignMode: Boolean => Callback,
    setEnable: Boolean => Callback,
    setFocus: Callback,
    setGraphics: XGraphics => Boolean,
    setLineIncrement: Double => Callback,
    setMaximum: Double => Callback,
    setModel: XControlModel => Boolean,
    setOrientation: Double => Callback,
    setPosSize: (Double, Double, Double, Double, Double) => Callback,
    setValue: Double => Callback,
    setValues: (Double, Double, Double) => Callback,
    setVisible: Boolean => Callback,
    setVisibleSize: Double => Callback,
    setZoom: (Double, Double) => Callback
  ): UnoControlScrollBar = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], BlockIncrement = BlockIncrement.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], LineIncrement = LineIncrement.asInstanceOf[js.Any], Maximum = Maximum.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], VisibleSize = VisibleSize.asInstanceOf[js.Any], acquire = acquire.toJsFn, addAdjustmentListener = js.Any.fromFunction1((t0: XAdjustmentListener) => addAdjustmentListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), createPeer = js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (createPeer(t0, t1)).runNow()), dispose = dispose.toJsFn, draw = js.Any.fromFunction2((t0: Double, t1: Double) => (draw(t0, t1)).runNow()), getAccessibleContext = getAccessibleContext.toJsFn, getBlockIncrement = getBlockIncrement.toJsFn, getContext = getContext.toJsFn, getGraphics = getGraphics.toJsFn, getLineIncrement = getLineIncrement.toJsFn, getMaximum = getMaximum.toJsFn, getModel = getModel.toJsFn, getOrientation = getOrientation.toJsFn, getPeer = getPeer.toJsFn, getPosSize = getPosSize.toJsFn, getSize = getSize.toJsFn, getValue = getValue.toJsFn, getView = getView.toJsFn, getVisibleSize = getVisibleSize.toJsFn, isDesignMode = isDesignMode.toJsFn, isTransparent = isTransparent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeAdjustmentListener = js.Any.fromFunction1((t0: XAdjustmentListener) => removeAdjustmentListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), setBlockIncrement = js.Any.fromFunction1((t0: Double) => setBlockIncrement(t0).runNow()), setContext = js.Any.fromFunction1((t0: XInterface) => setContext(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setGraphics = js.Any.fromFunction1(setGraphics), setLineIncrement = js.Any.fromFunction1((t0: Double) => setLineIncrement(t0).runNow()), setMaximum = js.Any.fromFunction1((t0: Double) => setMaximum(t0).runNow()), setModel = js.Any.fromFunction1(setModel), setOrientation = js.Any.fromFunction1((t0: Double) => setOrientation(t0).runNow()), setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setValue = js.Any.fromFunction1((t0: Double) => setValue(t0).runNow()), setValues = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setValues(t0, t1, t2)).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), setVisibleSize = js.Any.fromFunction1((t0: Double) => setVisibleSize(t0).runNow()), setZoom = js.Any.fromFunction2((t0: Double, t1: Double) => (setZoom(t0, t1)).runNow()))
    __obj.asInstanceOf[UnoControlScrollBar]
  }
}
