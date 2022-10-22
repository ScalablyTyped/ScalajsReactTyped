package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControl
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControlContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XTabController
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XTabControllerModel
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is superseded by {@link com.sun.star.form.runtime.XFormController} .
  * @deprecated Deprecated
  */
trait XFormController
  extends StObject
     with XTabController {
  
  val CurrentControl: XControl
  
  def addActivateListener(l: XFormControllerListener): Unit
  
  def getCurrentControl(): XControl
  
  def removeActivateListener(l: XFormControllerListener): Unit
}
object XFormController {
  
  inline def apply(
    Container: XControlContainer,
    Controls: SafeArray[XControl],
    CurrentControl: XControl,
    acquire: Callback,
    activateFirst: Callback,
    activateLast: Callback,
    activateTabOrder: Callback,
    addActivateListener: XFormControllerListener => Callback,
    autoTabOrder: Callback,
    getContainer: CallbackTo[XControlContainer],
    getControls: CallbackTo[SafeArray[XControl]],
    getCurrentControl: CallbackTo[XControl],
    getModel: CallbackTo[XTabControllerModel],
    queryInterface: `type` => Any,
    release: Callback,
    removeActivateListener: XFormControllerListener => Callback,
    setContainer: XControlContainer => Callback,
    setModel: XTabControllerModel => Callback
  ): XFormController = {
    val __obj = js.Dynamic.literal(Container = Container.asInstanceOf[js.Any], Controls = Controls.asInstanceOf[js.Any], CurrentControl = CurrentControl.asInstanceOf[js.Any], acquire = acquire.toJsFn, activateFirst = activateFirst.toJsFn, activateLast = activateLast.toJsFn, activateTabOrder = activateTabOrder.toJsFn, addActivateListener = js.Any.fromFunction1((t0: XFormControllerListener) => addActivateListener(t0).runNow()), autoTabOrder = autoTabOrder.toJsFn, getContainer = getContainer.toJsFn, getControls = getControls.toJsFn, getCurrentControl = getCurrentControl.toJsFn, getModel = getModel.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeActivateListener = js.Any.fromFunction1((t0: XFormControllerListener) => removeActivateListener(t0).runNow()), setContainer = js.Any.fromFunction1((t0: XControlContainer) => setContainer(t0).runNow()), setModel = js.Any.fromFunction1((t0: XTabControllerModel) => setModel(t0).runNow()))
    __obj.asInstanceOf[XFormController]
  }
  
  extension [Self <: XFormController](x: Self) {
    
    inline def setAddActivateListener(value: XFormControllerListener => Callback): Self = StObject.set(x, "addActivateListener", js.Any.fromFunction1((t0: XFormControllerListener) => value(t0).runNow()))
    
    inline def setCurrentControl(value: XControl): Self = StObject.set(x, "CurrentControl", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentControl(value: CallbackTo[XControl]): Self = StObject.set(x, "getCurrentControl", value.toJsFn)
    
    inline def setRemoveActivateListener(value: XFormControllerListener => Callback): Self = StObject.set(x, "removeActivateListener", js.Any.fromFunction1((t0: XFormControllerListener) => value(t0).runNow()))
  }
}
