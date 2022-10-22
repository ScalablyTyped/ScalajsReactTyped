package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a top level frame in the frame hierarchy with the desktop as root
  *
  * Please use the service {@link Frame} instead of this deprecated {@link Task} . If it's method {@link XFrame.isTop()} returns `TRUE` , it's the same as
  * a check for the {@link Task} service.
  * @deprecated Deprecated
  * @see Frame
  * @since OOo 1.1.2
  */
trait Task
  extends StObject
     with XTask
object Task {
  
  inline def apply(
    ComponentWindow: XWindow,
    ContainerWindow: XWindow,
    Controller: XController,
    Creator: XFramesSupplier,
    Name: String,
    acquire: Callback,
    activate: Callback,
    addEventListener: XEventListener => Callback,
    addFrameActionListener: XFrameActionListener => Callback,
    arrangeWindowsHorizontal: Callback,
    arrangeWindowsVertical: Callback,
    close: CallbackTo[Boolean],
    contextChanged: Callback,
    deactivate: Callback,
    dispose: Callback,
    findFrame: (String, Double) => XFrame,
    getComponentWindow: CallbackTo[XWindow],
    getContainerWindow: CallbackTo[XWindow],
    getController: CallbackTo[XController],
    getCreator: CallbackTo[XFramesSupplier],
    getName: CallbackTo[String],
    initialize: XWindow => Callback,
    isActive: CallbackTo[Boolean],
    isTop: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removeFrameActionListener: XFrameActionListener => Callback,
    setComponent: (XWindow, XController) => Boolean,
    setCreator: XFramesSupplier => Callback,
    setName: String => Callback,
    tileWindows: Callback
  ): Task = {
    val __obj = js.Dynamic.literal(ComponentWindow = ComponentWindow.asInstanceOf[js.Any], ContainerWindow = ContainerWindow.asInstanceOf[js.Any], Controller = Controller.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, activate = activate.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFrameActionListener = js.Any.fromFunction1((t0: XFrameActionListener) => addFrameActionListener(t0).runNow()), arrangeWindowsHorizontal = arrangeWindowsHorizontal.toJsFn, arrangeWindowsVertical = arrangeWindowsVertical.toJsFn, close = close.toJsFn, contextChanged = contextChanged.toJsFn, deactivate = deactivate.toJsFn, dispose = dispose.toJsFn, findFrame = js.Any.fromFunction2(findFrame), getComponentWindow = getComponentWindow.toJsFn, getContainerWindow = getContainerWindow.toJsFn, getController = getController.toJsFn, getCreator = getCreator.toJsFn, getName = getName.toJsFn, initialize = js.Any.fromFunction1((t0: XWindow) => initialize(t0).runNow()), isActive = isActive.toJsFn, isTop = isTop.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFrameActionListener = js.Any.fromFunction1((t0: XFrameActionListener) => removeFrameActionListener(t0).runNow()), setComponent = js.Any.fromFunction2(setComponent), setCreator = js.Any.fromFunction1((t0: XFramesSupplier) => setCreator(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), tileWindows = tileWindows.toJsFn)
    __obj.asInstanceOf[Task]
  }
}
