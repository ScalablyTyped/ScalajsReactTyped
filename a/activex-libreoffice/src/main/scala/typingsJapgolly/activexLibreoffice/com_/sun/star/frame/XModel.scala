package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a component which is created from an URL and arguments.
  *
  * It is a representation of a resource in the sense that it was created/loaded from the resource. The arguments are passed to the loader to modify its
  * behavior. An example for such an argument is "AsTemplate", which loads the resource as a template for a new document. (see {@link
  * com.sun.star.document.MediaDescriptor} for further details)
  *
  * Models can be controlled by controller components, which are usually views of the model. (see {@link Controller} for further details)
  *
  * If there is at least one controller, there is by definition a current controller. And if that controller supports the interface {@link
  * com.sun.star.view.XSelectionSupplier} , it has a current selection too.
  * @see com.sun.star.document.MediaDescriptor
  * @see Controller
  * @see com.sun.star.view.XSelectionSupplier
  */
trait XModel
  extends StObject
     with XComponent {
  
  /**
    * provides read access on currently representation of the {@link com.sun.star.document.MediaDescriptor} of this model which describes the model and its
    * state
    * @returns the arguments with which the model was originally created or stored the last time.
    */
  val Args: SafeArray[PropertyValue]
  
  /**
    * provides access to the controller which currently controls this model
    * @returns If the controller which is active is a controller of this model, it will be returned. If not, the controller which was the last active of this mo
    */
  var CurrentController: XController
  
  /**
    * provides read access on current selection on controller
    * @returns the current selection in the current controller. If there is no current controller, it returns `NULL` .
    */
  val CurrentSelection: XInterface
  
  /**
    * provides information about the location of this model
    * @returns the URL of the resource which is represented by this model.
    * @see XStorable.getLocation()
    */
  val URL: String
  
  /**
    * informs a model about its resource description.
    * @param URL specifies the resource
    * @param Arguments are optional arguments for that resource (see {@link com.sun.star.document.MediaDescriptor} )
    * @returns `TRUE` for success ; `FALSE` otherwise
    */
  def attachResource(URL: String, Arguments: SeqEquiv[PropertyValue]): Boolean
  
  /**
    * is called whenever a new controller is created for this model.
    *
    * The {@link com.sun.star.lang.XComponent} interface of the controller must be used to recognize when it is deleted.
    * @param Controller a new controller for this model
    * @see XModel.disconnectController()
    */
  def connectController(Controller: XController): Unit
  
  /**
    * is called whenever an existing controller should be deregistered at this model.
    *
    * The {@link com.sun.star.lang.XComponent} interface of the controller must be used to recognize when it is deleted.
    * @param Controller the existing controller which should be deregistered
    * @see XModel.connectController()
    */
  def disconnectController(Controller: XController): Unit
  
  /**
    * provides read access on currently representation of the {@link com.sun.star.document.MediaDescriptor} of this model which describes the model and its
    * state
    * @returns the arguments with which the model was originally created or stored the last time.
    */
  def getArgs(): SafeArray[PropertyValue]
  
  /**
    * provides access to the controller which currently controls this model
    * @returns If the controller which is active is a controller of this model, it will be returned. If not, the controller which was the last active of this mo
    */
  def getCurrentController(): XController
  
  /**
    * provides read access on current selection on controller
    * @returns the current selection in the current controller. If there is no current controller, it returns `NULL` .
    */
  def getCurrentSelection(): XInterface
  
  /**
    * provides information about the location of this model
    * @returns the URL of the resource which is represented by this model.
    * @see XStorable.getLocation()
    */
  def getURL(): String
  
  /**
    * determines if there is at least one lock remaining.
    *
    * While there is at least one lock remaining, some notifications for display updates are not broadcasted to the controllers.
    * @returns `TRUE` if any lock exist ; `FALSE` otherwise
    */
  def hasControllersLocked(): Boolean
  
  /**
    * suspends some notifications to the controllers which are used for display updates.
    *
    * The calls to {@link XModel.lockControllers()} and {@link XModel.unlockControllers()} may be nested and even overlapping, but they must be in pairs.
    * While there is at least one lock remaining, some notifications for display updates are not broadcasted.
    */
  def lockControllers(): Unit
  
  /**
    * sets a registered controller as the current controller.
    * @param Controller reference to an already existing connected controller, which should be the new active one
    * @throws com::sun::star::container::NoSuchElementException if **xController** isn't an already connected controller on this model
    */
  def setCurrentController(Controller: XController): Unit
  
  /**
    * resumes the notifications which were suspended by {@link XModel.lockControllers()} .
    *
    * The calls to {@link XModel.lockControllers()} and {@link XModel.unlockControllers()} may be nested and even overlapping, but they must be in pairs.
    * While there is at least one lock remaining, some notifications for display updates are not broadcasted.
    */
  def unlockControllers(): Unit
}
object XModel {
  
  inline def apply(
    Args: SafeArray[PropertyValue],
    CurrentController: XController,
    CurrentSelection: XInterface,
    URL: String,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    attachResource: (String, SeqEquiv[PropertyValue]) => Boolean,
    connectController: XController => Callback,
    disconnectController: XController => Callback,
    dispose: Callback,
    getArgs: CallbackTo[SafeArray[PropertyValue]],
    getCurrentController: CallbackTo[XController],
    getCurrentSelection: CallbackTo[XInterface],
    getURL: CallbackTo[String],
    hasControllersLocked: CallbackTo[Boolean],
    lockControllers: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    setCurrentController: XController => Callback,
    unlockControllers: Callback
  ): XModel = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], CurrentController = CurrentController.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1((t0: XController) => connectController(t0).runNow()), disconnectController = js.Any.fromFunction1((t0: XController) => disconnectController(t0).runNow()), dispose = dispose.toJsFn, getArgs = getArgs.toJsFn, getCurrentController = getCurrentController.toJsFn, getCurrentSelection = getCurrentSelection.toJsFn, getURL = getURL.toJsFn, hasControllersLocked = hasControllersLocked.toJsFn, lockControllers = lockControllers.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setCurrentController = js.Any.fromFunction1((t0: XController) => setCurrentController(t0).runNow()), unlockControllers = unlockControllers.toJsFn)
    __obj.asInstanceOf[XModel]
  }
  
  extension [Self <: XModel](x: Self) {
    
    inline def setArgs(value: SafeArray[PropertyValue]): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    inline def setAttachResource(value: (String, SeqEquiv[PropertyValue]) => Boolean): Self = StObject.set(x, "attachResource", js.Any.fromFunction2(value))
    
    inline def setConnectController(value: XController => Callback): Self = StObject.set(x, "connectController", js.Any.fromFunction1((t0: XController) => value(t0).runNow()))
    
    inline def setCurrentController(value: XController): Self = StObject.set(x, "CurrentController", value.asInstanceOf[js.Any])
    
    inline def setCurrentSelection(value: XInterface): Self = StObject.set(x, "CurrentSelection", value.asInstanceOf[js.Any])
    
    inline def setDisconnectController(value: XController => Callback): Self = StObject.set(x, "disconnectController", js.Any.fromFunction1((t0: XController) => value(t0).runNow()))
    
    inline def setGetArgs(value: CallbackTo[SafeArray[PropertyValue]]): Self = StObject.set(x, "getArgs", value.toJsFn)
    
    inline def setGetCurrentController(value: CallbackTo[XController]): Self = StObject.set(x, "getCurrentController", value.toJsFn)
    
    inline def setGetCurrentSelection(value: CallbackTo[XInterface]): Self = StObject.set(x, "getCurrentSelection", value.toJsFn)
    
    inline def setGetURL(value: CallbackTo[String]): Self = StObject.set(x, "getURL", value.toJsFn)
    
    inline def setHasControllersLocked(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasControllersLocked", value.toJsFn)
    
    inline def setLockControllers(value: Callback): Self = StObject.set(x, "lockControllers", value.toJsFn)
    
    inline def setSetCurrentController(value: XController => Callback): Self = StObject.set(x, "setCurrentController", js.Any.fromFunction1((t0: XController) => value(t0).runNow()))
    
    inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    
    inline def setUnlockControllers(value: Callback): Self = StObject.set(x, "unlockControllers", value.toJsFn)
  }
}
