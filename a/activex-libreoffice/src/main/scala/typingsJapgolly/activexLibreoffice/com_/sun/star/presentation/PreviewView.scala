package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XFocusListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XKeyHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XKeyListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XMouseClickHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XMouseListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XMouseMotionListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XPaintListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindowListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XDrawView
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.Controller
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.DispatchDescriptor
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XDispatch
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XFrame
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.XContextMenuInterceptor
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import typingsJapgolly.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This component integrates a preview view to a slide show of a presentation document into the desktop.
  * @since OOo 1.1.2
  */
trait PreviewView
  extends StObject
     with Controller
     with XWindow
     with XDrawView
     with XPropertySet {
  
  /** This is the area that is currently visible. */
  var VisibleArea: Rectangle
}
object PreviewView {
  
  inline def apply(
    CurrentPage: XDrawPage,
    Frame: XFrame,
    Model: XModel,
    PosSize: Rectangle,
    PropertySetInfo: XPropertySetInfo,
    Selection: Any,
    Transferable: XTransferable,
    ViewData: Any,
    VisibleArea: Rectangle,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addFocusListener: XFocusListener => Callback,
    addKeyHandler: XKeyHandler => Callback,
    addKeyListener: XKeyListener => Callback,
    addMouseClickHandler: XMouseClickHandler => Callback,
    addMouseListener: XMouseListener => Callback,
    addMouseMotionListener: XMouseMotionListener => Callback,
    addPaintListener: XPaintListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addSelectionChangeListener: XSelectionChangeListener => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    addWindowListener: XWindowListener => Callback,
    attachFrame: XFrame => Callback,
    attachModel: XModel => Boolean,
    dispose: Callback,
    getCurrentPage: CallbackTo[XDrawPage],
    getFrame: CallbackTo[XFrame],
    getModel: CallbackTo[XModel],
    getPosSize: CallbackTo[Rectangle],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getSelection: CallbackTo[Any],
    getTransferable: CallbackTo[XTransferable],
    getViewData: CallbackTo[Any],
    insertTransferable: XTransferable => Callback,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => Any,
    registerContextMenuInterceptor: XContextMenuInterceptor => Callback,
    release: Callback,
    releaseContextMenuInterceptor: XContextMenuInterceptor => Callback,
    removeEventListener: XEventListener => Callback,
    removeFocusListener: XFocusListener => Callback,
    removeKeyHandler: XKeyHandler => Callback,
    removeKeyListener: XKeyListener => Callback,
    removeMouseClickHandler: XMouseClickHandler => Callback,
    removeMouseListener: XMouseListener => Callback,
    removeMouseMotionListener: XMouseMotionListener => Callback,
    removePaintListener: XPaintListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeSelectionChangeListener: XSelectionChangeListener => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    removeWindowListener: XWindowListener => Callback,
    restoreViewData: Any => Callback,
    select: Any => Boolean,
    setCurrentPage: XDrawPage => Callback,
    setEnable: Boolean => Callback,
    setFocus: Callback,
    setPosSize: (Double, Double, Double, Double, Double) => Callback,
    setPropertyValue: (String, Any) => Callback,
    setVisible: Boolean => Callback,
    suspend: Boolean => Boolean
  ): PreviewView = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], Transferable = Transferable.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], VisibleArea = VisibleArea.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFocusListener = js.Any.fromFunction1((t0: XFocusListener) => addFocusListener(t0).runNow()), addKeyHandler = js.Any.fromFunction1((t0: XKeyHandler) => addKeyHandler(t0).runNow()), addKeyListener = js.Any.fromFunction1((t0: XKeyListener) => addKeyListener(t0).runNow()), addMouseClickHandler = js.Any.fromFunction1((t0: XMouseClickHandler) => addMouseClickHandler(t0).runNow()), addMouseListener = js.Any.fromFunction1((t0: XMouseListener) => addMouseListener(t0).runNow()), addMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => addMouseMotionListener(t0).runNow()), addPaintListener = js.Any.fromFunction1((t0: XPaintListener) => addPaintListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => addSelectionChangeListener(t0).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), addWindowListener = js.Any.fromFunction1((t0: XWindowListener) => addWindowListener(t0).runNow()), attachFrame = js.Any.fromFunction1((t0: XFrame) => attachFrame(t0).runNow()), attachModel = js.Any.fromFunction1(attachModel), dispose = dispose.toJsFn, getCurrentPage = getCurrentPage.toJsFn, getFrame = getFrame.toJsFn, getModel = getModel.toJsFn, getPosSize = getPosSize.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSelection = getSelection.toJsFn, getTransferable = getTransferable.toJsFn, getViewData = getViewData.toJsFn, insertTransferable = js.Any.fromFunction1((t0: XTransferable) => insertTransferable(t0).runNow()), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1((t0: XContextMenuInterceptor) => registerContextMenuInterceptor(t0).runNow()), release = release.toJsFn, releaseContextMenuInterceptor = js.Any.fromFunction1((t0: XContextMenuInterceptor) => releaseContextMenuInterceptor(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFocusListener = js.Any.fromFunction1((t0: XFocusListener) => removeFocusListener(t0).runNow()), removeKeyHandler = js.Any.fromFunction1((t0: XKeyHandler) => removeKeyHandler(t0).runNow()), removeKeyListener = js.Any.fromFunction1((t0: XKeyListener) => removeKeyListener(t0).runNow()), removeMouseClickHandler = js.Any.fromFunction1((t0: XMouseClickHandler) => removeMouseClickHandler(t0).runNow()), removeMouseListener = js.Any.fromFunction1((t0: XMouseListener) => removeMouseListener(t0).runNow()), removeMouseMotionListener = js.Any.fromFunction1((t0: XMouseMotionListener) => removeMouseMotionListener(t0).runNow()), removePaintListener = js.Any.fromFunction1((t0: XPaintListener) => removePaintListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => removeSelectionChangeListener(t0).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), removeWindowListener = js.Any.fromFunction1((t0: XWindowListener) => removeWindowListener(t0).runNow()), restoreViewData = js.Any.fromFunction1((t0: Any) => restoreViewData(t0).runNow()), select = js.Any.fromFunction1(select), setCurrentPage = js.Any.fromFunction1((t0: XDrawPage) => setCurrentPage(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setFocus = setFocus.toJsFn, setPosSize = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setPosSize(t0, t1, t2, t3, t4)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[PreviewView]
  }
  
  extension [Self <: PreviewView](x: Self) {
    
    inline def setVisibleArea(value: Rectangle): Self = StObject.set(x, "VisibleArea", value.asInstanceOf[js.Any])
  }
}
