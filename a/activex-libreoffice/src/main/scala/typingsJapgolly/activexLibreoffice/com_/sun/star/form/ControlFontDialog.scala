package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
trait ControlFontDialog
  extends StObject
     with XExecutableDialog {
  
  def createWithGridModel(GridModel: XPropertySet): Unit
}
object ControlFontDialog {
  
  inline def apply(
    acquire: Callback,
    createWithGridModel: XPropertySet => Callback,
    execute: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setTitle: String => Callback
  ): ControlFontDialog = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createWithGridModel = js.Any.fromFunction1((t0: XPropertySet) => createWithGridModel(t0).runNow()), execute = execute.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[ControlFontDialog]
  }
  
  extension [Self <: ControlFontDialog](x: Self) {
    
    inline def setCreateWithGridModel(value: XPropertySet => Callback): Self = StObject.set(x, "createWithGridModel", js.Any.fromFunction1((t0: XPropertySet) => value(t0).runNow()))
  }
}
