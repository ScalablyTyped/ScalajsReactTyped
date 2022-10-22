package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends interface {@link XModel} .
  *
  * The following functions are added:
  *
  * enumeration of all currently connected controller objects. (not {@link getCurrentController()} only, which depends on focus)establish new view
  * controller factory methods, which will make it possible to create new views for this model.
  */
trait XModel2
  extends StObject
     with XModel {
  
  /**
    * provides the available names of the factory to be used to create views.
    *
    * The names are usually logical view names. The following names have a defined meaning, i.e. every concrete implementation which returns such a name
    * must ensure it has the same meaning, and if a concrete implementation has a view with the given meaning, it must give it the name as defined here:
    * **Default** specifies the default view of the document.**Preview** specifies a preview of the document. A minimal implementation of such a view is a
    * **Default** view which is read-only.**PrintPreview** specifies a print preview of the document.
    *
    * Implementations of this interface might decide to support additional view names, which then are documented in the respective service descriptions.
    * @returns a sequence of names of all supported views for this document.
    * @see createView
    */
  val AvailableViewControllerNames: SafeArray[String]
  
  /**
    * provides list of all currently connected controller objects.
    *
    * Please note: Because this interface will might be used inside multi threaded environments those list can contain still disposed items or it new added
    * controller will be missing (if they was added after this enumeration was created).
    * @returns list of controller objects. Enumeration can be empty but not NULL.
    */
  val Controllers: XEnumeration
  
  /**
    * creates the default view instance for this model.
    *
    * Effectively, this method is equivalent to calling createView() with the `ViewName` being `"Default"` .
    * @param Frame used to place the new created view there
    * @returns the new view controller instance
    * @throws com::sun::star::lang::IllegalArgumentException if one of the given parameter was wrong
    * @throws com::sun::star::uno::Exception if creation of a new view failed by other reasons
    */
  def createDefaultViewController(Frame: XFrame): XController2
  
  /**
    * creates a new view instance classified by the specified name and arguments.
    *
    * The newly created controller must not be connected with the document and the frame. That is, you should neither call {@link XFrame.setComponent()} ,
    * nor {@link XController.attachFrame()} , nor {@link XController.attachModel()} , nor {@link XModel.connectController()} , not {@link
    * XModel.setCurrentController()} . All of this is the responsibility of the caller, which will do it in the proper order.
    * @param ViewName classified name of instance
    * @param Arguments arguments used for creation
    * @param Frame used to place the new created view there
    * @returns the new view controller instance
    * @throws com::sun::star::lang::IllegalArgumentException if one of the given parameter was wrong
    * @throws com::sun::star::uno::Exception if creation of a new view failed by other reasons
    */
  def createViewController(ViewName: String, Arguments: SeqEquiv[PropertyValue], Frame: XFrame): XController2
  
  /**
    * provides the available names of the factory to be used to create views.
    *
    * The names are usually logical view names. The following names have a defined meaning, i.e. every concrete implementation which returns such a name
    * must ensure it has the same meaning, and if a concrete implementation has a view with the given meaning, it must give it the name as defined here:
    * **Default** specifies the default view of the document.**Preview** specifies a preview of the document. A minimal implementation of such a view is a
    * **Default** view which is read-only.**PrintPreview** specifies a print preview of the document.
    *
    * Implementations of this interface might decide to support additional view names, which then are documented in the respective service descriptions.
    * @returns a sequence of names of all supported views for this document.
    * @see createView
    */
  def getAvailableViewControllerNames(): SafeArray[String]
  
  /**
    * provides list of all currently connected controller objects.
    *
    * Please note: Because this interface will might be used inside multi threaded environments those list can contain still disposed items or it new added
    * controller will be missing (if they was added after this enumeration was created).
    * @returns list of controller objects. Enumeration can be empty but not NULL.
    */
  def getControllers(): XEnumeration
}
object XModel2 {
  
  inline def apply(
    Args: SafeArray[PropertyValue],
    AvailableViewControllerNames: SafeArray[String],
    Controllers: XEnumeration,
    CurrentController: XController,
    CurrentSelection: XInterface,
    URL: String,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    attachResource: (String, SeqEquiv[PropertyValue]) => Boolean,
    connectController: XController => Callback,
    createDefaultViewController: XFrame => XController2,
    createViewController: (String, SeqEquiv[PropertyValue], XFrame) => XController2,
    disconnectController: XController => Callback,
    dispose: Callback,
    getArgs: CallbackTo[SafeArray[PropertyValue]],
    getAvailableViewControllerNames: CallbackTo[SafeArray[String]],
    getControllers: CallbackTo[XEnumeration],
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
  ): XModel2 = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], AvailableViewControllerNames = AvailableViewControllerNames.asInstanceOf[js.Any], Controllers = Controllers.asInstanceOf[js.Any], CurrentController = CurrentController.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1((t0: XController) => connectController(t0).runNow()), createDefaultViewController = js.Any.fromFunction1(createDefaultViewController), createViewController = js.Any.fromFunction3(createViewController), disconnectController = js.Any.fromFunction1((t0: XController) => disconnectController(t0).runNow()), dispose = dispose.toJsFn, getArgs = getArgs.toJsFn, getAvailableViewControllerNames = getAvailableViewControllerNames.toJsFn, getControllers = getControllers.toJsFn, getCurrentController = getCurrentController.toJsFn, getCurrentSelection = getCurrentSelection.toJsFn, getURL = getURL.toJsFn, hasControllersLocked = hasControllersLocked.toJsFn, lockControllers = lockControllers.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setCurrentController = js.Any.fromFunction1((t0: XController) => setCurrentController(t0).runNow()), unlockControllers = unlockControllers.toJsFn)
    __obj.asInstanceOf[XModel2]
  }
  
  extension [Self <: XModel2](x: Self) {
    
    inline def setAvailableViewControllerNames(value: SafeArray[String]): Self = StObject.set(x, "AvailableViewControllerNames", value.asInstanceOf[js.Any])
    
    inline def setControllers(value: XEnumeration): Self = StObject.set(x, "Controllers", value.asInstanceOf[js.Any])
    
    inline def setCreateDefaultViewController(value: XFrame => XController2): Self = StObject.set(x, "createDefaultViewController", js.Any.fromFunction1(value))
    
    inline def setCreateViewController(value: (String, SeqEquiv[PropertyValue], XFrame) => XController2): Self = StObject.set(x, "createViewController", js.Any.fromFunction3(value))
    
    inline def setGetAvailableViewControllerNames(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getAvailableViewControllerNames", value.toJsFn)
    
    inline def setGetControllers(value: CallbackTo[XEnumeration]): Self = StObject.set(x, "getControllers", value.toJsFn)
  }
}
