package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XFlushListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XNumberFormatsSupplier
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * simplifies the accessing of data sources and it's corresponding database document.
  * @see DataSource
  * @see XDocumentDataSource
  */
trait DocumentDataSource
  extends StObject
     with DataSource
     with XDocumentDataSource
object DocumentDataSource {
  
  inline def apply(
    Bookmarks: XNameAccess,
    DatabaseDocument: XOfficeDatabaseDocument,
    Info: SafeArray[PropertyValue],
    IsPasswordRequired: Boolean,
    IsReadOnly: Boolean,
    LoginTimeout: Double,
    Name: String,
    NumberFormatsSupplier: XNumberFormatsSupplier,
    Password: String,
    PropertySetInfo: XPropertySetInfo,
    QueryDefinitions: XNameAccess,
    Settings: XPropertySet,
    SuppressVersionColumns: Boolean,
    TableFilter: SafeArray[String],
    TableTypeFilter: SafeArray[String],
    URL: String,
    User: String,
    acquire: Callback,
    addFlushListener: XFlushListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    connectWithCompletion: XInteractionHandler => XConnection,
    flush: Callback,
    getBookmarks: CallbackTo[XNameAccess],
    getConnection: (String, String) => XConnection,
    getIsolatedConnection: (String, String) => XConnection,
    getIsolatedConnectionWithCompletion: XInteractionHandler => XConnection,
    getLoginTimeout: CallbackTo[Double],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getQueryDefinitions: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback,
    removeFlushListener: XFlushListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setLoginTimeout: Double => Callback,
    setPropertyValue: (String, Any) => Callback
  ): DocumentDataSource = {
    val __obj = js.Dynamic.literal(Bookmarks = Bookmarks.asInstanceOf[js.Any], DatabaseDocument = DatabaseDocument.asInstanceOf[js.Any], Info = Info.asInstanceOf[js.Any], IsPasswordRequired = IsPasswordRequired.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], LoginTimeout = LoginTimeout.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberFormatsSupplier = NumberFormatsSupplier.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], QueryDefinitions = QueryDefinitions.asInstanceOf[js.Any], Settings = Settings.asInstanceOf[js.Any], SuppressVersionColumns = SuppressVersionColumns.asInstanceOf[js.Any], TableFilter = TableFilter.asInstanceOf[js.Any], TableTypeFilter = TableTypeFilter.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], acquire = acquire.toJsFn, addFlushListener = js.Any.fromFunction1((t0: XFlushListener) => addFlushListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), connectWithCompletion = js.Any.fromFunction1(connectWithCompletion), flush = flush.toJsFn, getBookmarks = getBookmarks.toJsFn, getConnection = js.Any.fromFunction2(getConnection), getIsolatedConnection = js.Any.fromFunction2(getIsolatedConnection), getIsolatedConnectionWithCompletion = js.Any.fromFunction1(getIsolatedConnectionWithCompletion), getLoginTimeout = getLoginTimeout.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getQueryDefinitions = getQueryDefinitions.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeFlushListener = js.Any.fromFunction1((t0: XFlushListener) => removeFlushListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setLoginTimeout = js.Any.fromFunction1((t0: Double) => setLoginTimeout(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[DocumentDataSource]
  }
}
