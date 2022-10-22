package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for the {@link UnoControlDialog} service. This service actually implements a whole whack of interfaces. This is the just the subset that
  * our code needs.
  * @since LibreOffice 4.2
  */
trait XUnoControlDialog
  extends StObject
     with XControlContainer
     with XControl
     with XWindow
     with XTopWindow
     with XDialog2
object XUnoControlDialog {
  
  inline def apply(
    Context: XInterface,
    Controls: SafeArray[XControl],
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    Title: String,
    View: XView,
    acquire: Callback,
    addControl: (String, XControl) => Callback,
    addEventListener: XEventListener => Callback,
    addFocusListener: XFocusListener => Callback,
    addKeyListener: XKeyListener => Callback,
    addMouseListener: XMouseListener => Callback,
    addMouseMotionListener: XMouseMotionListener => Callback,
    addPaintListener: XPaintListener => Callback,
    addTopWindowListener: XTopWindowListener => Callback,
    addWindowListener: XWindowListener => Callback,
    createPeer: (XToolkit, XWindowPeer) => Callback,
    dispose: Callback,
    endDialog: Double => Callback,
    endExecute: Callback,
    execute: CallbackTo[Double],
    getContext: CallbackTo[XInterface],
    getControl: String => XControl,
    getControls: CallbackTo[SafeArray[XControl]],
    getModel: CallbackTo[XControlModel],
    getPeer: CallbackTo[XWindowPeer],
    getPosSize: CallbackTo[Rectangle],
    getTitle: CallbackTo[String],
    getView: CallbackTo[XView],
    isDesignMode: CallbackTo[Boolean],
    isTransparent: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeControl: XControl => Callback,
    removeEventListener: XEventListener => Callback,
    removeFocusListener: XFocusListener => Callback,
    removeKeyListener: XKeyListener => Callback,
    removeMouseListener: XMouseListener => Callback,
    removeMouseMotionListener: XMouseMotionListener => Callback,
    removePaintListener: XPaintListener => Callback,
    removeTopWindowListener: XTopWindowListener => Callback,
    removeWindowListener: XWindowListener => Callback,
    setContext: XInterface => Callback,
    setDesignMode: Boolean => Callback,
    setEnable: Boolean => Callback,
    setFocus: Callback,
    setHelpId: String => Callback,
    setMenuBar: XMenuBar => Callback,
    setModel: XControlModel => Boolean,
    setPosSize: (Double, Double, Double, Double, Double) => Callback,
    setStatusText: String => Callback,
    setTitle: String => Callback,
    setVisible: Boolean => Callback,
    toBack: Callback,
    toFront: Callback
  ): XUnoControlDialog = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Controls = Controls.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = acquire.toJsFn, addControl = js.Any.fromFunction2((t0: String, t1: XControl) => (addControl(t0, t1)).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addTopWindowListener = js.Any.fromFunction1((t0: XTopWindowListener) => addTopWindowListener(t0).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), createPeer = js.Any.fromFunction2((t0: XToolkit, t1: XWindowPeer) => (createPeer(t0, t1)).runNow()), dispose = dispose.toJsFn, endDialog = js.Any.fromFunction1((t0: Double) => endDialog(t0).runNow()), endExecute = endExecute.toJsFn, execute = execute.toJsFn, getContext = getContext.toJsFn, getControl = js.Any.fromFunction1(getControl), getControls = getControls.toJsFn, getModel = getModel.toJsFn, getPeer = getPeer.toJsFn, getPosSize = getPosSize.toJsFn, getTitle = getTitle.toJsFn, getView = getView.toJsFn, isDesignMode = isDesignMode.toJsFn, isTransparent = isTransparent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeControl = js.Any.fromFunction1((t0: XControl) => removeControl(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removeTopWindowListener = js.Any.fromFunction1((t0: XTopWindowListener) => removeTopWindowListener(t0).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), setContext = js.Any.fromFunction1((t0: XInterface) => setContext(t0).runNow()), setDesignMode = js.Any.fromFunction1((t0: Boolean) => setDesignMode(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setHelpId = js.Any.fromFunction1((t0: String) => setHelpId(t0).runNow()), setMenuBar = js.Any.fromFunction1((t0: XMenuBar) => setMenuBar(t0).runNow()), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setStatusText = js.Any.fromFunction1((t0: String) => setStatusText(t0).runNow()), setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), toBack = toBack.toJsFn, toFront = toFront.toJsFn)
    __obj.asInstanceOf[XUnoControlDialog]
  }
}
