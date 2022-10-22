package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface could be incomplete since I derived it from its places of use.
  * @since LibreOffice 4.1
  */
trait AddressBookSourceDialog
  extends StObject
     with XExecutableDialog {
  
  def createWithDataSource(
    ParentWindow: XWindow,
    DataSource: XPropertySet,
    DataSourceName: String,
    Command: String,
    Title: String
  ): Unit
}
object AddressBookSourceDialog {
  
  inline def apply(
    acquire: Callback,
    createWithDataSource: (XWindow, XPropertySet, String, String, String) => Callback,
    execute: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setTitle: String => Callback
  ): AddressBookSourceDialog = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createWithDataSource = js.Any.fromFunction5((t0: XWindow, t1: XPropertySet, t2: String, t3: String, t4: String) => (createWithDataSource(t0, t1, t2, t3, t4)).runNow()), execute = execute.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[AddressBookSourceDialog]
  }
  
  extension [Self <: AddressBookSourceDialog](x: Self) {
    
    inline def setCreateWithDataSource(value: (XWindow, XPropertySet, String, String, String) => Callback): Self = StObject.set(x, "createWithDataSource", js.Any.fromFunction5((t0: XWindow, t1: XPropertySet, t2: String, t3: String, t4: String) => (value(t0, t1, t2, t3, t4)).runNow()))
  }
}
