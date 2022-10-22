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
  * use {@link XFrame} instead of this one
  * @deprecated Deprecated
  */
trait XTask
  extends StObject
     with XFrame {
  
  /** @deprecated Deprecated */
  def arrangeWindowsHorizontal(): Unit
  
  /** @deprecated Deprecated */
  def arrangeWindowsVertical(): Unit
  
  /**
    * use {@link com.sun.star.util.XCloseable} or {@link com.sun.star.lang.XComponent.dispose()} at a {@link Frame} instead of this one
    * @deprecated Deprecated
    */
  def close(): Boolean
  
  /** @deprecated Deprecated */
  def tileWindows(): Unit
}
object XTask {
  
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
  ): XTask = {
    val __obj = js.Dynamic.literal(ComponentWindow = ComponentWindow.asInstanceOf[js.Any], ContainerWindow = ContainerWindow.asInstanceOf[js.Any], Controller = Controller.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, activate = activate.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFrameActionListener = js.Any.fromFunction1((t0: XFrameActionListener) => addFrameActionListener(t0).runNow()), arrangeWindowsHorizontal = arrangeWindowsHorizontal.toJsFn, arrangeWindowsVertical = arrangeWindowsVertical.toJsFn, close = close.toJsFn, contextChanged = contextChanged.toJsFn, deactivate = deactivate.toJsFn, dispose = dispose.toJsFn, findFrame = js.Any.fromFunction2(findFrame), getComponentWindow = getComponentWindow.toJsFn, getContainerWindow = getContainerWindow.toJsFn, getController = getController.toJsFn, getCreator = getCreator.toJsFn, getName = getName.toJsFn, initialize = js.Any.fromFunction1((t0: XWindow) => initialize(t0).runNow()), isActive = isActive.toJsFn, isTop = isTop.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFrameActionListener = js.Any.fromFunction1((t0: XFrameActionListener) => removeFrameActionListener(t0).runNow()), setComponent = js.Any.fromFunction2(setComponent), setCreator = js.Any.fromFunction1((t0: XFramesSupplier) => setCreator(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), tileWindows = tileWindows.toJsFn)
    __obj.asInstanceOf[XTask]
  }
  
  extension [Self <: XTask](x: Self) {
    
    inline def setArrangeWindowsHorizontal(value: Callback): Self = StObject.set(x, "arrangeWindowsHorizontal", value.toJsFn)
    
    inline def setArrangeWindowsVertical(value: Callback): Self = StObject.set(x, "arrangeWindowsVertical", value.toJsFn)
    
    inline def setClose(value: CallbackTo[Boolean]): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setTileWindows(value: Callback): Self = StObject.set(x, "tileWindows", value.toJsFn)
  }
}
