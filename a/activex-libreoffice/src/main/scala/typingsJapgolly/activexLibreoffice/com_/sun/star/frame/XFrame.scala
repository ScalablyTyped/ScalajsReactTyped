package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a frame object can be considered to be an "anchor" object where a component can be attached to.
  *
  * A frame can be (it's not a must!) a part of a frame tree. If not this frame won't be accessible by using the API. This mode make sense for previews.
  * The root node of the tree can be a {@link Desktop} implementation.
  * @see Desktop
  */
trait XFrame
  extends StObject
     with XComponent {
  
  /**
    * provides access to the component window
    *
    * Note: Don't dispose this window - the frame is the owner of it.
    * @returns the current visible component in this frame ;  or `NULL` if no one currently exist
    * @see XFrame.setComponent()
    */
  val ComponentWindow: XWindow
  
  /**
    * provides access to the container window of the frame.
    *
    * Normally this is used as the parent window of the component window.
    * @returns the container window of this frame
    * @see XFrame.initialize()
    */
  val ContainerWindow: XWindow
  
  /**
    * provides access to the controller
    *
    * Note: Don't dispose it - the frame is the owner of it. Use {@link XController.getFrame()} to dispose the frame after you the controller agreed with a
    * {@link XController.suspend()} call.
    * @returns the current controller within this frame ;  or `NULL` if no one currently exist
    * @see XFrame.setComponent()
    */
  val Controller: XController
  
  /**
    * provides access to the creator (parent) of this frame
    * @returns the frame container that created and contains this frame.
    * @see XFrame.setCreator()
    */
  var Creator: XFramesSupplier
  
  /**
    * access to the name property of this frame
    * @returns the programmatic name of this frame.
    * @see XFrame.setName()
    */
  var Name: String
  
  /**
    * activates this frame and thus the component within.
    *
    * At first the frame sets itself as the active frame of its creator by calling {@link XFramesSupplier.setActiveFrame()} , then it broadcasts an {@link
    * FrameActionEvent} with FrameAction::FRAME_ACTIVATED. The component within this frame may listen to this event to grab the focus on activation; for
    * simple components this can be done by the {@link FrameLoader} .
    *
    * Finally, most frames may grab the focus to one of its windows or forward the activation to a sub-frame.
    * @see XFrame.deactivate()
    * @see XFrame.isActive()
    */
  def activate(): Unit
  
  /**
    * registers an event listener, which will be called when certain things happen to the components within this frame or within sub-frames of this frame.
    *
    * E.g., it is possible to determine instantiation/destruction and activation/deactivation of components.
    * @param xListener specifies the listener which will be informed
    * @see XFrame.removeFrameActionListener()
    */
  def addFrameActionListener(xListener: XFrameActionListener): Unit
  
  /**
    * notifies the frame that the context of the controller within this frame changed (i.e. the selection).
    *
    * According to a call to this interface, the frame calls {@link XFrameActionListener.frameAction()} with FrameAction::CONTEXT_CHANGED to all listeners
    * which are registered using {@link XFrame.addFrameActionListener()} . For external controllers this event can be used to requery dispatches.
    * @see XFrameEventListener
    * @see FrameAction
    * @see XFrame.addFrameActionListener()
    */
  def contextChanged(): Unit
  
  /**
    * is called by the creator frame when another sub-frame gets activated.
    *
    * At first the frame deactivates its active sub-frame, if any. Then broadcasts a {@link FrameActionEvent} with FrameAction::FRAME_DEACTIVATING.
    * @see XFrame.activate()
    * @see XFrame.isActive()
    */
  def deactivate(): Unit
  
  /**
    * searches for a frame with the specified name.
    *
    * Frames may contain other frames (e.g., a frameset) and may be contained in other frames. This hierarchy is searched with this method. First some
    * special names are taken into account, i.e. "", "_self", "_top", "_blank" etc. **SearchFlags** is ignored when comparing these names with
    * **TargetFrameName** ; further steps are controlled by **SearchFlags** . If allowed, the name of the frame itself is compared with the desired one, and
    * then ( again if allowed ) the method is called for all children of the frame. Finally may be called for the siblings and then for parent frame (if
    * allowed).
    *
    * List of special target names: {{table here, see documentation}}
    *
    * If no frame with the given name is found, a new top frame is created; if this is allowed by a special flag {@link FrameSearchFlag.CREATE} . The new
    * frame also gets the desired name.
    * @param aTargetFrameName identify (a) a special target ("_blank","_self" ...) or(b) any well known frame to search it inside the current hierarchy
    * @param nSearchFlags optional parameter to regulate search if no special target was used for **TargetFrameName**
    * @see FrameSearchFlag
    */
  def findFrame(aTargetFrameName: String, nSearchFlags: Double): XFrame
  
  /**
    * provides access to the component window
    *
    * Note: Don't dispose this window - the frame is the owner of it.
    * @returns the current visible component in this frame ;  or `NULL` if no one currently exist
    * @see XFrame.setComponent()
    */
  def getComponentWindow(): XWindow
  
  /**
    * provides access to the container window of the frame.
    *
    * Normally this is used as the parent window of the component window.
    * @returns the container window of this frame
    * @see XFrame.initialize()
    */
  def getContainerWindow(): XWindow
  
  /**
    * provides access to the controller
    *
    * Note: Don't dispose it - the frame is the owner of it. Use {@link XController.getFrame()} to dispose the frame after you the controller agreed with a
    * {@link XController.suspend()} call.
    * @returns the current controller within this frame ;  or `NULL` if no one currently exist
    * @see XFrame.setComponent()
    */
  def getController(): XController
  
  /**
    * provides access to the creator (parent) of this frame
    * @returns the frame container that created and contains this frame.
    * @see XFrame.setCreator()
    */
  def getCreator(): XFramesSupplier
  
  /**
    * access to the name property of this frame
    * @returns the programmatic name of this frame.
    * @see XFrame.setName()
    */
  def getName(): String
  
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
  def initialize(xWindow: XWindow): Unit
  
  /**
    * determines if the frame is active.
    * @returns `TRUE` for active or UI active frames ; `FALSE` otherwise
    * @see XFrame.activate()
    * @see XFrame.deactivate()
    */
  def isActive(): Boolean
  
  /**
    * determines if the frame is a top frame.
    *
    * In general a top frame is the frame which is a direct child of a task frame or which does not have a parent. Possible frame searches must stop the
    * search at such a frame unless the flag {@link FrameSearchFlag.TASKS} is set.
    * @returns `TRUE` if frame supports top frame specification ; `FALSE` otherwise
    */
  def isTop(): Boolean
  
  /**
    * unregisters an event listener
    * @param xListener specifies the listener which won't be informed any longer
    * @see XFrame.addFrameActionListener()
    */
  def removeFrameActionListener(xListener: XFrameActionListener): Unit
  
  /**
    * sets a new component into the frame or release an existing one from a frame.
    * @param xComponentWindow the window of the new component or `NULL` for release  A valid component window should be a child of the frame container window.
    * @param xController the controller of the new component or `NULL` for release  Simple components may implement a {@link com.sun.star.awt.XWindow} only. I
    * @returns `TRUE` if setting of new component or release of an existing one was successfully ; `FALSE` otherwise (especially, if an existing controller disa
    * @see XFrame.getComponentWindow()
    * @see XFrame.getContainerWindow()
    * @see XFrame.getController()
    */
  def setComponent(xComponentWindow: XWindow, xController: XController): Boolean
  
  /**
    * sets the frame container that created this frame.
    *
    * Only the creator is allowed to call this method. But creator doesn't mean the implementation which creates this instance ... it means the parent frame
    * of the frame hierarchy. Because; normally a frame should be created by using the API and is necessary for searches inside the tree (e.g. {@link
    * XFrame.findFrame()} )
    * @param Creator the creator (parent) of this frame
    * @see XFrame.getCreator()
    */
  def setCreator(Creator: XFramesSupplier): Unit
  
  /**
    * sets the name of the frame.
    *
    * Normally the name of the frame is set initially (e.g. by the creator). The name of a frame will be used for identifying it if a frame search was
    * started. These searches can be forced by: {@link XFrame.findFrame()}{@link XDispatchProvider.queryDispatch()}{@link
    * XComponentLoader.loadComponentFromURL()} Note: Special targets like "_blank", "_self" etc. are not allowed. That's why frame names shouldn't start
    * with a sign "_".
    * @param aName the new programmatic name of this frame
    * @see XFrame.findFrame()
    * @see XFrame.getName()
    * @see XDispatchProvider
    * @see XComponentLoader
    */
  def setName(aName: String): Unit
}
object XFrame {
  
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
    setName: String => Callback
  ): XFrame = {
    val __obj = js.Dynamic.literal(ComponentWindow = ComponentWindow.asInstanceOf[js.Any], ContainerWindow = ContainerWindow.asInstanceOf[js.Any], Controller = Controller.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, activate = activate.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addFrameActionListener = js.Any.fromFunction1((t0: XFrameActionListener) => addFrameActionListener(t0).runNow()), contextChanged = contextChanged.toJsFn, deactivate = deactivate.toJsFn, dispose = dispose.toJsFn, findFrame = js.Any.fromFunction2(findFrame), getComponentWindow = getComponentWindow.toJsFn, getContainerWindow = getContainerWindow.toJsFn, getController = getController.toJsFn, getCreator = getCreator.toJsFn, getName = getName.toJsFn, initialize = js.Any.fromFunction1((t0: XWindow) => initialize(t0).runNow()), isActive = isActive.toJsFn, isTop = isTop.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeFrameActionListener = js.Any.fromFunction1((t0: XFrameActionListener) => removeFrameActionListener(t0).runNow()), setComponent = js.Any.fromFunction2(setComponent), setCreator = js.Any.fromFunction1((t0: XFramesSupplier) => setCreator(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
    __obj.asInstanceOf[XFrame]
  }
  
  extension [Self <: XFrame](x: Self) {
    
    inline def setActivate(value: Callback): Self = StObject.set(x, "activate", value.toJsFn)
    
    inline def setAddFrameActionListener(value: XFrameActionListener => Callback): Self = StObject.set(x, "addFrameActionListener", js.Any.fromFunction1((t0: XFrameActionListener) => value(t0).runNow()))
    
    inline def setComponentWindow(value: XWindow): Self = StObject.set(x, "ComponentWindow", value.asInstanceOf[js.Any])
    
    inline def setContainerWindow(value: XWindow): Self = StObject.set(x, "ContainerWindow", value.asInstanceOf[js.Any])
    
    inline def setContextChanged(value: Callback): Self = StObject.set(x, "contextChanged", value.toJsFn)
    
    inline def setController(value: XController): Self = StObject.set(x, "Controller", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XFramesSupplier): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDeactivate(value: Callback): Self = StObject.set(x, "deactivate", value.toJsFn)
    
    inline def setFindFrame(value: (String, Double) => XFrame): Self = StObject.set(x, "findFrame", js.Any.fromFunction2(value))
    
    inline def setGetComponentWindow(value: CallbackTo[XWindow]): Self = StObject.set(x, "getComponentWindow", value.toJsFn)
    
    inline def setGetContainerWindow(value: CallbackTo[XWindow]): Self = StObject.set(x, "getContainerWindow", value.toJsFn)
    
    inline def setGetController(value: CallbackTo[XController]): Self = StObject.set(x, "getController", value.toJsFn)
    
    inline def setGetCreator(value: CallbackTo[XFramesSupplier]): Self = StObject.set(x, "getCreator", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setInitialize(value: XWindow => Callback): Self = StObject.set(x, "initialize", js.Any.fromFunction1((t0: XWindow) => value(t0).runNow()))
    
    inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
    
    inline def setIsTop(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTop", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRemoveFrameActionListener(value: XFrameActionListener => Callback): Self = StObject.set(x, "removeFrameActionListener", js.Any.fromFunction1((t0: XFrameActionListener) => value(t0).runNow()))
    
    inline def setSetComponent(value: (XWindow, XController) => Boolean): Self = StObject.set(x, "setComponent", js.Any.fromFunction2(value))
    
    inline def setSetCreator(value: XFramesSupplier => Callback): Self = StObject.set(x, "setCreator", js.Any.fromFunction1((t0: XFramesSupplier) => value(t0).runNow()))
    
    inline def setSetName(value: String => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
