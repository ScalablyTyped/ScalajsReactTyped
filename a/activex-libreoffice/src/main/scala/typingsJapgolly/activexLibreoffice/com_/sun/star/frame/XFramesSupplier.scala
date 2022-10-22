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
  * provides access to sub frames of current one
  * @see XFrames
  */
trait XFramesSupplier
  extends StObject
     with XFrame {
  
  /**
    * gets the current active frame of this container (not of any other available supplier)
    *
    * This may be the frame itself. The active frame is defined as the frame which contains (recursively) the window with the focus. If no window within the
    * frame contains the focus, this method returns the last frame which had the focus. If no containing window ever had the focus, the first frame within
    * this frame is returned.
    * @returns the {@link Frame} which is active within this frame.
    */
  var ActiveFrame: XFrame
  
  /**
    * provides access to this container and to all other {@link XFramesSupplier} which are available from this node of frame tree
    * @returns the collection of frames which is represented by a {@link FramesContainer} .
    */
  val Frames: XFrames
  
  /**
    * gets the current active frame of this container (not of any other available supplier)
    *
    * This may be the frame itself. The active frame is defined as the frame which contains (recursively) the window with the focus. If no window within the
    * frame contains the focus, this method returns the last frame which had the focus. If no containing window ever had the focus, the first frame within
    * this frame is returned.
    * @returns the {@link Frame} which is active within this frame.
    */
  def getActiveFrame(): XFrame
  
  /**
    * provides access to this container and to all other {@link XFramesSupplier} which are available from this node of frame tree
    * @returns the collection of frames which is represented by a {@link FramesContainer} .
    */
  def getFrames(): XFrames
  
  /**
    * is called on activation of a direct sub-frame.
    *
    * This method is only allowed to be called by a sub-frame according to {@link XFrame.activate()} or {@link XFramesSupplier.setActiveFrame()} . After
    * this call {@link XFramesSupplier.getActiveFrame()} will return the frame specified by **Frame** .
    *
    * In general this method first calls the method {@link XFramesSupplier.setActiveFrame()} at the creator frame with **this** as the current argument.
    * Then it broadcasts the {@link FrameActionEvent} FrameAction::FRAME_ACTIVATED.
    *
    * Note: Given parameter **Frame** must already exist inside the container (e.g., inserted by using {@link XFrames.append()} )
    * @param Frame the new active child frame inside this container
    */
  def setActiveFrame(Frame: XFrame): Unit
}
object XFramesSupplier {
  
  inline def apply(
    ActiveFrame: XFrame,
    ComponentWindow: XWindow,
    ContainerWindow: XWindow,
    Controller: XController,
    Creator: XFramesSupplier,
    Frames: XFrames,
    Name: String,
    acquire: Callback,
    activate: Callback,
    addEventListener: XEventListener => Callback,
    addFrameActionListener: XFrameActionListener => Callback,
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
    initialize: XWindow => Callback,
    isActive: CallbackTo[Boolean],
    isTop: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removeFrameActionListener: XFrameActionListener => Callback,
    setActiveFrame: XFrame => Callback,
    setComponent: (XWindow, XController) => Boolean,
    setCreator: XFramesSupplier => Callback,
    setName: String => Callback
  ): XFramesSupplier = {
    val __obj = js.Dynamic.literal(ActiveFrame = ActiveFrame.asInstanceOf[js.Any], ComponentWindow = ComponentWindow.asInstanceOf[js.Any], ContainerWindow = ContainerWindow.asInstanceOf[js.Any], Controller = Controller.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Frames = Frames.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, activate = activate.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFrameActionListener = js.Any.fromFunction1((t0: XFrameActionListener) => addFrameActionListener(t0).runNow()), contextChanged = contextChanged.toJsFn, deactivate = deactivate.toJsFn, dispose = dispose.toJsFn, findFrame = js.Any.fromFunction2(findFrame), getActiveFrame = getActiveFrame.toJsFn, getComponentWindow = getComponentWindow.toJsFn, getContainerWindow = getContainerWindow.toJsFn, getController = getController.toJsFn, getCreator = getCreator.toJsFn, getFrames = getFrames.toJsFn, getName = getName.toJsFn, initialize = js.Any.fromFunction1((t0: XWindow) => initialize(t0).runNow()), isActive = isActive.toJsFn, isTop = isTop.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFrameActionListener = js.Any.fromFunction1((t0: XFrameActionListener) => removeFrameActionListener(t0).runNow()), setActiveFrame = js.Any.fromFunction1((t0: XFrame) => setActiveFrame(t0).runNow()), setComponent = js.Any.fromFunction2(setComponent), setCreator = js.Any.fromFunction1((t0: XFramesSupplier) => setCreator(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
    __obj.asInstanceOf[XFramesSupplier]
  }
  
  extension [Self <: XFramesSupplier](x: Self) {
    
    inline def setActiveFrame(value: XFrame): Self = StObject.set(x, "ActiveFrame", value.asInstanceOf[js.Any])
    
    inline def setFrames(value: XFrames): Self = StObject.set(x, "Frames", value.asInstanceOf[js.Any])
    
    inline def setGetActiveFrame(value: CallbackTo[XFrame]): Self = StObject.set(x, "getActiveFrame", value.toJsFn)
    
    inline def setGetFrames(value: CallbackTo[XFrames]): Self = StObject.set(x, "getFrames", value.toJsFn)
    
    inline def setSetActiveFrame(value: XFrame => Callback): Self = StObject.set(x, "setActiveFrame", js.Any.fromFunction1((t0: XFrame) => value(t0).runNow()))
  }
}
