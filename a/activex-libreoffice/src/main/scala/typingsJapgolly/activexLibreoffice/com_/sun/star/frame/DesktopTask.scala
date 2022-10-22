package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use the {@link Frame} service instead of this
  * @deprecated Deprecated
  */
trait DesktopTask
  extends StObject
     with XDesktopTask
     with XPropertySet
     with XWindowArranger
     with XFramesSupplier {
  
  var IsAlwaysVisible: Boolean
  
  var IsDesktop: Boolean
  
  var IsFloating: Boolean
  
  /** use th visible state of the frame container window instead of this */
  var IsVisible: Boolean
  
  /** use the position of the frame container window instead of this */
  var Position: Point
  
  /** use the size of the frame container window instead of this */
  var Size: typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
  
  /** use property {@link Frame.Title} instead of that */
  var Title: String
  
  /**
    * is called to initialize the frame within a window - the container window.
    *
    * This window will be used as parent for the component window and to support some UI relevant features of the frame service. Note: Re-parenting mustn't
    * supported by a real frame implementation! It's designed for initializing - not for setting.
    *
    * This frame will take over ownership of the window referred from **xWindow** . Thus, the previous owner is not allowed to dispose this window anymore.
    * @param xWindow the new container window
    * @see XFrame.getContainerWindow()
    */
  /* InferMemberOverrides */
  override def initialize(xWindow: XWindow): Unit
}
object DesktopTask {
  
  inline def apply(
    ActiveFrame: XFrame,
    ComponentWindow: XWindow,
    ContainerWindow: XWindow,
    Controller: XController,
    Creator: XFramesSupplier,
    Frames: XFrames,
    IsAlwaysVisible: Boolean,
    IsDesktop: Boolean,
    IsFloating: Boolean,
    IsVisible: Boolean,
    Name: String,
    Position: Point,
    PropertySetInfo: XPropertySetInfo,
    Size: Size,
    Title: String,
    acquire: Callback,
    activate: Callback,
    addEventListener: XEventListener => Callback,
    addFrameActionListener: XFrameActionListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    arrange: Double => Callback,
    close: CallbackTo[Boolean],
    contextChanged: Callback,
    deactivate: Callback,
    dispose: Callback,
    findFrame: (String, Double) => XFrame,
    getActiveFrame: CallbackTo[XFrame],
    getComponentWindow: CallbackTo[XWindow],
    getContainerWindow: CallbackTo[XWindow],
    getController: CallbackTo[XController],
    getCreator: CallbackTo[XFramesSupplier],
    getFrames: CallbackTo[XFrames],
    getName: CallbackTo[String],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    hasArrangeCommand: Double => Boolean,
    initialize: XWindow => Callback,
    isActive: CallbackTo[Boolean],
    isTop: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removeFrameActionListener: XFrameActionListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setActiveFrame: XFrame => Callback,
    setComponent: (XWindow, XController) => Boolean,
    setCreator: XFramesSupplier => Callback,
    setName: String => Callback,
    setPropertyValue: (String, Any) => Callback
  ): DesktopTask = {
    val __obj = js.Dynamic.literal(ActiveFrame = ActiveFrame.asInstanceOf[js.Any], ComponentWindow = ComponentWindow.asInstanceOf[js.Any], ContainerWindow = ContainerWindow.asInstanceOf[js.Any], Controller = Controller.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Frames = Frames.asInstanceOf[js.Any], IsAlwaysVisible = IsAlwaysVisible.asInstanceOf[js.Any], IsDesktop = IsDesktop.asInstanceOf[js.Any], IsFloating = IsFloating.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], acquire = acquire.toJsFn, activate = activate.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFrameActionListener = js.Any.fromFunction1((t0: XFrameActionListener) => addFrameActionListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), arrange = js.Any.fromFunction1((t0: Double) => arrange(t0).runNow()), close = close.toJsFn, contextChanged = contextChanged.toJsFn, deactivate = deactivate.toJsFn, dispose = dispose.toJsFn, findFrame = js.Any.fromFunction2(findFrame), getActiveFrame = getActiveFrame.toJsFn, getComponentWindow = getComponentWindow.toJsFn, getContainerWindow = getContainerWindow.toJsFn, getController = getController.toJsFn, getCreator = getCreator.toJsFn, getFrames = getFrames.toJsFn, getName = getName.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasArrangeCommand = js.Any.fromFunction1(hasArrangeCommand), initialize = js.Any.fromFunction1((t0: XWindow) => initialize(t0).runNow()), isActive = isActive.toJsFn, isTop = isTop.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFrameActionListener = js.Any.fromFunction1((t0: XFrameActionListener) => removeFrameActionListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setActiveFrame = js.Any.fromFunction1((t0: XFrame) => setActiveFrame(t0).runNow()), setComponent = js.Any.fromFunction2(setComponent), setCreator = js.Any.fromFunction1((t0: XFramesSupplier) => setCreator(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[DesktopTask]
  }
  
  extension [Self <: DesktopTask](x: Self) {
    
    inline def setInitialize(value: XWindow => Callback): Self = StObject.set(x, "initialize", js.Any.fromFunction1((t0: XWindow) => value(t0).runNow()))
    
    inline def setIsAlwaysVisible(value: Boolean): Self = StObject.set(x, "IsAlwaysVisible", value.asInstanceOf[js.Any])
    
    inline def setIsDesktop(value: Boolean): Self = StObject.set(x, "IsDesktop", value.asInstanceOf[js.Any])
    
    inline def setIsFloating(value: Boolean): Self = StObject.set(x, "IsFloating", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "IsVisible", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Point): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
