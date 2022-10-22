package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainerListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an abstract control which contains other controls. */
trait UnoControlContainer
  extends StObject
     with UnoControl
     with XUnoControlContainer
     with XControlContainer
     with XContainer
object UnoControlContainer {
  
  inline def apply(
    AccessibleContext: XAccessibleContext,
    Context: XInterface,
    Controls: SafeArray[XControl],
    Graphics: XGraphics,
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    Size: Size,
    TabControllers: SafeArray[XTabController],
    View: XView,
    acquire: Callback,
    addContainerListener: XContainerListener => Callback,
    addControl: (String, XControl) => Callback,
    addEventListener: XEventListener => Callback,
    addFocusListener: XFocusListener => Callback,
    addKeyListener: XKeyListener => Callback,
    addMouseListener: XMouseListener => Callback,
    addMouseMotionListener: XMouseMotionListener => Callback,
    addPaintListener: XPaintListener => Callback,
    addTabController: XTabController => Callback,
    addWindowListener: XWindowListener => Callback,
    createPeer: (XToolkit, XWindowPeer) => Callback,
    dispose: Callback,
    draw: (Double, Double) => Callback,
    getAccessibleContext: CallbackTo[XAccessibleContext],
    getContext: CallbackTo[XInterface],
    getControl: String => XControl,
    getControls: CallbackTo[SafeArray[XControl]],
    getGraphics: CallbackTo[XGraphics],
    getModel: CallbackTo[XControlModel],
    getPeer: CallbackTo[XWindowPeer],
    getPosSize: CallbackTo[Rectangle],
    getSize: CallbackTo[Size],
    getTabControllers: CallbackTo[SafeArray[XTabController]],
    getView: CallbackTo[XView],
    isDesignMode: CallbackTo[Boolean],
    isTransparent: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeContainerListener: XContainerListener => Callback,
    removeControl: XControl => Callback,
    removeEventListener: XEventListener => Callback,
    removeFocusListener: XFocusListener => Callback,
    removeKeyListener: XKeyListener => Callback,
    removeMouseListener: XMouseListener => Callback,
    removeMouseMotionListener: XMouseMotionListener => Callback,
    removePaintListener: XPaintListener => Callback,
    removeTabController: XTabController => Callback,
    removeWindowListener: XWindowListener => Callback,
    setContext: XInterface => Callback,
    setDesignMode: Boolean => Callback,
    setEnable: Boolean => Callback,
    setFocus: Callback,
    setGraphics: XGraphics => Boolean,
    setModel: XControlModel => Boolean,
    setPosSize: (Double, Double, Double, Double, Double) => Callback,
    setStatusText: String => Callback,
    setTabControllers: SeqEquiv[XTabController] => Callback,
    setVisible: Boolean => Callback,
    setZoom: (Double, Double) => Callback
  ): UnoControlContainer = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Controls = Controls.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TabControllers = TabControllers.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, addContainerListener = js.Any.fromFunction1((t0: XContainerListener) => addContainerListener(t0).runNow()), addControl = js.Any.fromFunction2((t0: String, t1: XControl) => (addControl(t0, t1)).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addTabController = js.Any.fromFunction1((t0: XTabController) => addTabController(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), createPeer = js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (createPeer(t0, t1)).runNow()), dispose = dispose.toJsFn, draw = js.Any.fromFunction2((t0: Double, t1: Double) => (draw(t0, t1)).runNow()), getAccessibleContext = getAccessibleContext.toJsFn, getContext = getContext.toJsFn, getControl = js.Any.fromFunction1(getControl), getControls = getControls.toJsFn, getGraphics = getGraphics.toJsFn, getModel = getModel.toJsFn, getPeer = getPeer.toJsFn, getPosSize = getPosSize.toJsFn, getSize = getSize.toJsFn, getTabControllers = getTabControllers.toJsFn, getView = getView.toJsFn, isDesignMode = isDesignMode.toJsFn, isTransparent = isTransparent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeContainerListener = js.Any.fromFunction1((t0: XContainerListener) => removeContainerListener(t0).runNow()), removeControl = js.Any.fromFunction1((t0: XControl) => removeControl(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeTabController = js.Any.fromFunction1((t0: XTabController) => removeTabController(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), setContext = js.Any.fromFunction1((t0: XInterface) => setContext(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setGraphics = js.Any.fromFunction1(setGraphics), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setStatusText = js.Any.fromFunction1((t0: String) => setStatusText(t0).runNow()), setTabControllers = js.Any.fromFunction1((t0: SeqEquiv[XTabController]) => setTabControllers(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), setZoom = js.Any.fromFunction2((t0: Double, t1: Double) => (setZoom(t0, t1)).runNow()))
    __obj.asInstanceOf[UnoControlContainer]
  }
}
