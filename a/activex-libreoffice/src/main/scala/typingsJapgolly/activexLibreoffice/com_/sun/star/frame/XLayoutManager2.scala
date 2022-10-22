package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.ConfigurationEvent
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.DockingArea
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.XDockingAreaAcceptor
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.XUIConfigurationListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.XUIElement
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Unified interface for {@link LayoutManager} service.
  * @since LibreOffice 4.2
  */
trait XLayoutManager2
  extends StObject
     with XLayoutManager
     with XFrameActionListener
     with XUIConfigurationListener
     with XMenuBarMergingAcceptor
     with XLayoutManagerEventBroadcaster
object XLayoutManager2 {
  
  inline def apply(
    CurrentDockingArea: Rectangle,
    DockingAreaAcceptor: XDockingAreaAcceptor,
    Elements: SafeArray[XUIElement],
    acquire: Callback,
    addLayoutManagerEventListener: XLayoutManagerListener => Callback,
    attachFrame: XFrame => Callback,
    createElement: String => Callback,
    destroyElement: String => Callback,
    disposing: EventObject => Callback,
    doLayout: Callback,
    dockAllWindows: Double => Boolean,
    dockWindow: (String, DockingArea, Point) => Boolean,
    elementInserted: ConfigurationEvent => Callback,
    elementRemoved: ConfigurationEvent => Callback,
    elementReplaced: ConfigurationEvent => Callback,
    floatWindow: String => Boolean,
    frameAction: FrameActionEvent => Callback,
    getCurrentDockingArea: CallbackTo[Rectangle],
    getDockingAreaAcceptor: CallbackTo[XDockingAreaAcceptor],
    getElement: String => XUIElement,
    getElementPos: String => Point,
    getElementSize: String => Size,
    getElements: CallbackTo[SafeArray[XUIElement]],
    hideElement: String => Boolean,
    isElementDocked: String => Boolean,
    isElementFloating: String => Boolean,
    isElementLocked: String => Boolean,
    isElementVisible: String => Boolean,
    isVisible: CallbackTo[Boolean],
    lock: Callback,
    lockWindow: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    removeLayoutManagerEventListener: XLayoutManagerListener => Callback,
    removeMergedMenuBar: Callback,
    requestElement: String => Boolean,
    reset: Callback,
    setDockingAreaAcceptor: XDockingAreaAcceptor => Callback,
    setElementPos: (String, Point) => Callback,
    setElementPosSize: (String, Point, Size) => Callback,
    setElementSize: (String, Size) => Callback,
    setMergedMenuBar: XIndexAccess => Boolean,
    setVisible: Boolean => Callback,
    showElement: String => Boolean,
    unlock: Callback,
    unlockWindow: String => Boolean
  ): XLayoutManager2 = {
    val __obj = js.Dynamic.literal(CurrentDockingArea = CurrentDockingArea.asInstanceOf[js.Any], DockingAreaAcceptor = DockingAreaAcceptor.asInstanceOf[js.Any], Elements = Elements.asInstanceOf[js.Any], acquire = acquire.toJsFn, addLayoutManagerEventListener = js.Any.fromFunction1((t0: XLayoutManagerListener) => addLayoutManagerEventListener(t0).runNow()), attachFrame = js.Any.fromFunction1((t0: XFrame) => attachFrame(t0).runNow()), createElement = js.Any.fromFunction1((t0: String) => createElement(t0).runNow()), destroyElement = js.Any.fromFunction1((t0: String) => destroyElement(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), doLayout = doLayout.toJsFn, dockAllWindows = js.Any.fromFunction1(dockAllWindows), dockWindow = js.Any.fromFunction3(dockWindow), elementInserted = js.Any.fromFunction1((t0: ConfigurationEvent) => elementInserted(t0).runNow()), elementRemoved = js.Any.fromFunction1((t0: ConfigurationEvent) => elementRemoved(t0).runNow()), elementReplaced = js.Any.fromFunction1((t0: ConfigurationEvent) => elementReplaced(t0).runNow()), floatWindow = js.Any.fromFunction1(floatWindow), frameAction = js.Any.fromFunction1((t0: FrameActionEvent) => frameAction(t0).runNow()), getCurrentDockingArea = getCurrentDockingArea.toJsFn, getDockingAreaAcceptor = getDockingAreaAcceptor.toJsFn, getElement = js.Any.fromFunction1(getElement), getElementPos = js.Any.fromFunction1(getElementPos), getElementSize = js.Any.fromFunction1(getElementSize), getElements = getElements.toJsFn, hideElement = js.Any.fromFunction1(hideElement), isElementDocked = js.Any.fromFunction1(isElementDocked), isElementFloating = js.Any.fromFunction1(isElementFloating), isElementLocked = js.Any.fromFunction1(isElementLocked), isElementVisible = js.Any.fromFunction1(isElementVisible), isVisible = isVisible.toJsFn, lock = lock.toJsFn, lockWindow = js.Any.fromFunction1(lockWindow), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeLayoutManagerEventListener = js.Any.fromFunction1((t0: XLayoutManagerListener) => removeLayoutManagerEventListener(t0).runNow()), removeMergedMenuBar = removeMergedMenuBar.toJsFn, requestElement = js.Any.fromFunction1(requestElement), reset = reset.toJsFn, setDockingAreaAcceptor = js.Any.fromFunction1((t0: XDockingAreaAcceptor) => setDockingAreaAcceptor(t0).runNow()), setElementPos = js.Any.fromFunction2((t0: String, t1: Point) => (setElementPos(t0, t1)).runNow()), setElementPosSize = js.Any.fromFunction3((t0: String, t1: Point, t2: Size) => (setElementPosSize(t0, t1, t2)).runNow()), setElementSize = js.Any.fromFunction2((t0: String, t1: Size) => (setElementSize(t0, t1)).runNow()), setMergedMenuBar = js.Any.fromFunction1(setMergedMenuBar), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), showElement = js.Any.fromFunction1(showElement), unlock = unlock.toJsFn, unlockWindow = js.Any.fromFunction1(unlockWindow))
    __obj.asInstanceOf[XLayoutManager2]
  }
}
