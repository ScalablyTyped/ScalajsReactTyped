package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XNumberFormatsSupplier
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a component, which controls DatabaseAccessConnections and acts like a shared {@link DataSource} .
  * @deprecated Deprecated
  */
trait DatabaseAccess
  extends StObject
     with XPropertySet
     with XDatabaseAccess
     with XCompletedConnection {
  
  /** is a list of arbitrary string tag/value pairs as connection arguments; normally at least a "user" and "password" property should be included. */
  var ConnectInfo: SafeArray[PropertyValue]
  
  /** indicates a database url of the form ; ` jdbc:subprotocol:subname` or ` sdbc:subprotocol:subname` */
  var ConnectURL: String
  
  /** indicates that a password is always necessary. */
  var IsPasswordRequired: Boolean
  
  /** determines whether modifications on the data access bean are allowed or not. */
  var IsReadOnly: Boolean
  
  /** provides an object for formatting numbers. */
  var NumberFormatsSupplier: XNumberFormatsSupplier
  
  /** defines a list of tables, on which the bean should have it's focus. If empty, all tables are rejected. */
  var TableFilter: SafeArray[String]
  
  /** defines a list of table types, on which the bean should have it's focus. If empty, all tables types are rejected. */
  var TableTypeFilter: SafeArray[String]
  
  /** is the title of the bean. */
  var Title: String
  
  /** is the URL of the bean. */
  var URL: String
}
object DatabaseAccess {
  
  inline def apply(
    ConnectInfo: SafeArray[PropertyValue],
    ConnectURL: String,
    IsPasswordRequired: Boolean,
    IsReadOnly: Boolean,
    LoginTimeout: Double,
    NumberFormatsSupplier: XNumberFormatsSupplier,
    PropertySetInfo: XPropertySetInfo,
    TableFilter: SafeArray[String],
    TableTypeFilter: SafeArray[String],
    Title: String,
    URL: String,
    acquire: Callback,
    addDatabaseAccessListener: XDatabaseAccessListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    connectWithCompletion: XInteractionHandler => XConnection,
    getConnection: (String, String) => XConnection,
    getIsolatedConnection: (String, String) => XConnection,
    getLoginTimeout: CallbackTo[Double],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    hasConnections: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeDatabaseAccessListener: XDatabaseAccessListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setLoginTimeout: Double => Callback,
    setPropertyValue: (String, Any) => Callback,
    suspendConnections: CallbackTo[Boolean]
  ): DatabaseAccess = {
    val __obj = js.Dynamic.literal(ConnectInfo = ConnectInfo.asInstanceOf[js.Any], ConnectURL = ConnectURL.asInstanceOf[js.Any], IsPasswordRequired = IsPasswordRequired.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], LoginTimeout = LoginTimeout.asInstanceOf[js.Any], NumberFormatsSupplier = NumberFormatsSupplier.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TableFilter = TableFilter.asInstanceOf[js.Any], TableTypeFilter = TableTypeFilter.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, addDatabaseAccessListener = js.Any.fromFunction1((t0: XDatabaseAccessListener) => addDatabaseAccessListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), connectWithCompletion = js.Any.fromFunction1(connectWithCompletion), getConnection = js.Any.fromFunction2(getConnection), getIsolatedConnection = js.Any.fromFunction2(getIsolatedConnection), getLoginTimeout = getLoginTimeout.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasConnections = hasConnections.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeDatabaseAccessListener = js.Any.fromFunction1((t0: XDatabaseAccessListener) => removeDatabaseAccessListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setLoginTimeout = js.Any.fromFunction1((t0: Double) => setLoginTimeout(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), suspendConnections = suspendConnections.toJsFn)
    __obj.asInstanceOf[DatabaseAccess]
  }
  
  extension [Self <: DatabaseAccess](x: Self) {
    
    inline def setConnectInfo(value: SafeArray[PropertyValue]): Self = StObject.set(x, "ConnectInfo", value.asInstanceOf[js.Any])
    
    inline def setConnectURL(value: String): Self = StObject.set(x, "ConnectURL", value.asInstanceOf[js.Any])
    
    inline def setIsPasswordRequired(value: Boolean): Self = StObject.set(x, "IsPasswordRequired", value.asInstanceOf[js.Any])
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "IsReadOnly", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatsSupplier(value: XNumberFormatsSupplier): Self = StObject.set(x, "NumberFormatsSupplier", value.asInstanceOf[js.Any])
    
    inline def setTableFilter(value: SafeArray[String]): Self = StObject.set(x, "TableFilter", value.asInstanceOf[js.Any])
    
    inline def setTableTypeFilter(value: SafeArray[String]): Self = StObject.set(x, "TableTypeFilter", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
