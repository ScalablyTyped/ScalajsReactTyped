package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XRowSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface could be incomplete since I derived it from its places of use.
  * @since LibreOffice 4.1
  */
trait FilterDialog
  extends StObject
     with XExecutableDialog {
  
  def createDefault(): Unit
  
  def createWithQuery(QueryComposer: XSingleSelectQueryComposer, RowSet: XRowSet, ParentWindow: XWindow): Unit
}
object FilterDialog {
  
  inline def apply(
    acquire: Callback,
    createDefault: Callback,
    createWithQuery: (XSingleSelectQueryComposer, XRowSet, XWindow) => Callback,
    execute: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setTitle: String => Callback
  ): FilterDialog = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createDefault = createDefault.toJsFn, createWithQuery = js.Any.fromFunction3((t0: XSingleSelectQueryComposer, t1: XRowSet, t2: XWindow) => (createWithQuery(t0, t1, t2)).runNow()), execute = execute.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[FilterDialog]
  }
  
  extension [Self <: FilterDialog](x: Self) {
    
    inline def setCreateDefault(value: Callback): Self = StObject.set(x, "createDefault", value.toJsFn)
    
    inline def setCreateWithQuery(value: (XSingleSelectQueryComposer, XRowSet, XWindow) => Callback): Self = StObject.set(x, "createWithQuery", js.Any.fromFunction3((t0: XSingleSelectQueryComposer, t1: XRowSet, t2: XWindow) => (value(t0, t1, t2)).runNow()))
  }
}
