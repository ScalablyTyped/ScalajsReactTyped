package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControl
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControlContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XTabControllerModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XChild
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.DispatchDescriptor
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XDispatch
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XDispatchProvider
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdb.XRowSetApproveBroadcaster
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdb.XRowSetApproveListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdb.XSQLErrorBroadcaster
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdb.XSQLErrorListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is superseded by {@link com.sun.star.form.runtime.FormController} .
  * @deprecated Deprecated
  */
trait FormController
  extends StObject
     with XDispatchProvider
     with XFormController
     with XChild
     with XComponent
     with XEnumerationAccess
     with XModifyBroadcaster
     with XConfirmDeleteBroadcaster
     with XSQLErrorBroadcaster
     with XRowSetApproveBroadcaster
     with XDatabaseParameterBroadcaster
object FormController {
  
  inline def apply(
    Container: XControlContainer,
    Controls: SafeArray[XControl],
    CurrentControl: XControl,
    ElementType: `type`,
    Parent: XInterface,
    acquire: Callback,
    activateFirst: Callback,
    activateLast: Callback,
    activateTabOrder: Callback,
    addActivateListener: XFormControllerListener => Callback,
    addConfirmDeleteListener: XConfirmDeleteListener => Callback,
    addEventListener: XEventListener => Callback,
    addModifyListener: XModifyListener => Callback,
    addParameterListener: XDatabaseParameterListener => Callback,
    addRowSetApproveListener: XRowSetApproveListener => Callback,
    addSQLErrorListener: XSQLErrorListener => Callback,
    autoTabOrder: Callback,
    createEnumeration: CallbackTo[XEnumeration],
    dispose: Callback,
    getContainer: CallbackTo[XControlContainer],
    getControls: CallbackTo[SafeArray[XControl]],
    getCurrentControl: CallbackTo[XControl],
    getElementType: CallbackTo[`type`],
    getModel: CallbackTo[XTabControllerModel],
    getParent: CallbackTo[XInterface],
    hasElements: CallbackTo[Boolean],
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => Any,
    release: Callback,
    removeActivateListener: XFormControllerListener => Callback,
    removeConfirmDeleteListener: XConfirmDeleteListener => Callback,
    removeEventListener: XEventListener => Callback,
    removeModifyListener: XModifyListener => Callback,
    removeParameterListener: XDatabaseParameterListener => Callback,
    removeRowSetApproveListener: XRowSetApproveListener => Callback,
    removeSQLErrorListener: XSQLErrorListener => Callback,
    setContainer: XControlContainer => Callback,
    setModel: XTabControllerModel => Callback,
    setParent: XInterface => Callback
  ): FormController = {
    val __obj = js.Dynamic.literal(Container = Container.asInstanceOf[js.Any], Controls = Controls.asInstanceOf[js.Any], CurrentControl = CurrentControl.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], acquire = acquire.toJsFn, activateFirst = activateFirst.toJsFn, activateLast = activateLast.toJsFn, activateTabOrder = activateTabOrder.toJsFn, addActivateListener = js.Any.fromFunction1((t0: XFormControllerListener) => addActivateListener(t0).runNow()), addConfirmDeleteListener = js.Any.fromFunction1((t0: XConfirmDeleteListener) => addConfirmDeleteListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), addParameterListener = js.Any.fromFunction1((t0: XDatabaseParameterListener) => addParameterListener(t0).runNow()), addRowSetApproveListener = js.Any.fromFunction1((t0: XRowSetApproveListener) => addRowSetApproveListener(t0).runNow()), addSQLErrorListener = js.Any.fromFunction1((t0: XSQLErrorListener) => addSQLErrorListener(t0).runNow()), autoTabOrder = autoTabOrder.toJsFn, createEnumeration = createEnumeration.toJsFn, dispose = dispose.toJsFn, getContainer = getContainer.toJsFn, getControls = getControls.toJsFn, getCurrentControl = getCurrentControl.toJsFn, getElementType = getElementType.toJsFn, getModel = getModel.toJsFn, getParent = getParent.toJsFn, hasElements = hasElements.toJsFn, queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeActivateListener = js.Any.fromFunction1((t0: XFormControllerListener) => removeActivateListener(t0).runNow()), removeConfirmDeleteListener = js.Any.fromFunction1((t0: XConfirmDeleteListener) => removeConfirmDeleteListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), removeParameterListener = js.Any.fromFunction1((t0: XDatabaseParameterListener) => removeParameterListener(t0).runNow()), removeRowSetApproveListener = js.Any.fromFunction1((t0: XRowSetApproveListener) => removeRowSetApproveListener(t0).runNow()), removeSQLErrorListener = js.Any.fromFunction1((t0: XSQLErrorListener) => removeSQLErrorListener(t0).runNow()), setContainer = js.Any.fromFunction1((t0: XControlContainer) => setContainer(t0).runNow()), setModel = js.Any.fromFunction1((t0: XTabControllerModel) => setModel(t0).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()))
    __obj.asInstanceOf[FormController]
  }
}
