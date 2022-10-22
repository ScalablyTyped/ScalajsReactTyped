package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControlContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XTabControllerModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.2 */
trait TabOrderDialog
  extends StObject
     with XExecutableDialog {
  
  def createWithModel(TabbingModel: XTabControllerModel, ControlContext: XControlContainer, ParentWindow: XWindow): Unit
}
object TabOrderDialog {
  
  inline def apply(
    acquire: Callback,
    createWithModel: (XTabControllerModel, XControlContainer, XWindow) => Callback,
    execute: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setTitle: String => Callback
  ): TabOrderDialog = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createWithModel = js.Any.fromFunction3((t0: XTabControllerModel, t1: XControlContainer, t2: XWindow) => (createWithModel(t0, t1, t2)).runNow()), execute = execute.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[TabOrderDialog]
  }
  
  extension [Self <: TabOrderDialog](x: Self) {
    
    inline def setCreateWithModel(value: (XTabControllerModel, XControlContainer, XWindow) => Callback): Self = StObject.set(x, "createWithModel", js.Any.fromFunction3((t0: XTabControllerModel, t1: XControlContainer, t2: XWindow) => (value(t0, t1, t2)).runNow()))
  }
}
