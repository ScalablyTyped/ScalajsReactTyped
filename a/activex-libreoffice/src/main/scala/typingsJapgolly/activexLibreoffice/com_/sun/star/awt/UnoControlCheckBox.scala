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

/** specifies a check box control. */
trait UnoControlCheckBox
  extends StObject
     with UnoControl
     with XCheckBox
     with XLayoutConstrains
object UnoControlCheckBox {
  
  inline def apply(
    AccessibleContext: XAccessibleContext,
    Context: XInterface,
    Graphics: XGraphics,
    MinimumSize: Size,
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    PreferredSize: Size,
    Size: Size,
    State: Double,
    View: XView,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addFocusListener: XFocusListener => Callback,
    addItemListener: XItemListener => Callback,
    addKeyListener: XKeyListener => Callback,
    addMouseListener: XMouseListener => Callback,
    addMouseMotionListener: XMouseMotionListener => Callback,
    addPaintListener: XPaintListener => Callback,
    addWindowListener: XWindowListener => Callback,
    calcAdjustedSize: Size => Size,
    createPeer: (XToolkit, XWindowPeer) => Callback,
    dispose: Callback,
    draw: (Double, Double) => Callback,
    enableTriState: Boolean => Callback,
    getAccessibleContext: CallbackTo[XAccessibleContext],
    getContext: CallbackTo[XInterface],
    getGraphics: CallbackTo[XGraphics],
    getMinimumSize: CallbackTo[Size],
    getModel: CallbackTo[XControlModel],
    getPeer: CallbackTo[XWindowPeer],
    getPosSize: CallbackTo[Rectangle],
    getPreferredSize: CallbackTo[Size],
    getSize: CallbackTo[Size],
    getState: CallbackTo[Double],
    getView: CallbackTo[XView],
    isDesignMode: CallbackTo[Boolean],
    isTransparent: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removeFocusListener: XFocusListener => Callback,
    removeItemListener: XItemListener => Callback,
    removeKeyListener: XKeyListener => Callback,
    removeMouseListener: XMouseListener => Callback,
    removeMouseMotionListener: XMouseMotionListener => Callback,
    removePaintListener: XPaintListener => Callback,
    removeWindowListener: XWindowListener => Callback,
    setContext: XInterface => Callback,
    setDesignMode: Boolean => Callback,
    setEnable: Boolean => Callback,
    setFocus: Callback,
    setGraphics: XGraphics => Boolean,
    setLabel: String => Callback,
    setModel: XControlModel => Boolean,
    setPosSize: (Double, Double, Double, Double, Double) => Callback,
    setState: Double => Callback,
    setVisible: Boolean => Callback,
    setZoom: (Double, Double) => Callback
  ): UnoControlCheckBox = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], MinimumSize = MinimumSize.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], PreferredSize = PreferredSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addItemListener = js.Any.fromFunction1((t0: XItemListener) => addItemListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), createPeer = js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (createPeer(t0, t1)).runNow()), dispose = dispose.toJsFn, draw = js.Any.fromFunction2((t0: Double, t1: Double) => (draw(t0, t1)).runNow()), enableTriState = js.Any.fromFunction1((t0: Boolean) => enableTriState(t0).runNow()), getAccessibleContext = getAccessibleContext.toJsFn, getContext = getContext.toJsFn, getGraphics = getGraphics.toJsFn, getMinimumSize = getMinimumSize.toJsFn, getModel = getModel.toJsFn, getPeer = getPeer.toJsFn, getPosSize = getPosSize.toJsFn, getPreferredSize = getPreferredSize.toJsFn, getSize = getSize.toJsFn, getState = getState.toJsFn, getView = getView.toJsFn, isDesignMode = isDesignMode.toJsFn, isTransparent = isTransparent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeItemListener = js.Any.fromFunction1((t0: XItemListener) => removeItemListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), setContext = js.Any.fromFunction1((t0: XInterface) => setContext(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setGraphics = js.Any.fromFunction1(setGraphics), setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setState = js.Any.fromFunction1((t0: Double) => setState(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), setZoom = js.Any.fromFunction2((t0: Double, t1: Double) => (setZoom(t0, t1)).runNow()))
    __obj.asInstanceOf[UnoControlCheckBox]
  }
}
