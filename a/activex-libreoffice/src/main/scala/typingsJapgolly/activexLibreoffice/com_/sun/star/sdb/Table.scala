package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.FontDescriptor
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends the service {@link com.sun.star.sdbcx.Table} with additional display information, sorting, and filtering criteria. */
trait Table
  extends StObject
     with typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx.Table
     with DataSettings {
  
  /**
    * indicates the privileges for the table.
    * @see com.sun.star.sdbcx.Privilege
    */
  var Privileges: Double
}
object Table {
  
  inline def apply(
    ApplyFilter: Boolean,
    CatalogName: String,
    Columns: XNameAccess,
    Description: String,
    Filter: String,
    FontDescriptor: FontDescriptor,
    GroupBy: String,
    HavingClause: String,
    Indexes: XNameAccess,
    Keys: XIndexAccess,
    Name: String,
    Order: String,
    Privileges: Double,
    PropertySetInfo: XPropertySetInfo,
    RowHeight: Double,
    SchemaName: String,
    TextColor: Color,
    Type: String,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    alterColumnByIndex: (Double, XPropertySet) => Callback,
    alterColumnByName: (String, XPropertySet) => Callback,
    createDataDescriptor: CallbackTo[XPropertySet],
    getColumns: CallbackTo[XNameAccess],
    getIndexes: CallbackTo[XNameAccess],
    getKeys: CallbackTo[XIndexAccess],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    rename: String => Callback,
    setPropertyValue: (String, Any) => Callback
  ): Table = {
    val __obj = js.Dynamic.literal(ApplyFilter = ApplyFilter.asInstanceOf[js.Any], CatalogName = CatalogName.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], FontDescriptor = FontDescriptor.asInstanceOf[js.Any], GroupBy = GroupBy.asInstanceOf[js.Any], HavingClause = HavingClause.asInstanceOf[js.Any], Indexes = Indexes.asInstanceOf[js.Any], Keys = Keys.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], Privileges = Privileges.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RowHeight = RowHeight.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), alterColumnByIndex = js.Any.fromFunction2((t0: Double, t1: XPropertySet) => (alterColumnByIndex(t0, t1)).runNow()), alterColumnByName = js.Any.fromFunction2((t0: String, t1: XPropertySet) => (alterColumnByName(t0, t1)).runNow()), createDataDescriptor = createDataDescriptor.toJsFn, getColumns = getColumns.toJsFn, getIndexes = getIndexes.toJsFn, getKeys = getKeys.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), rename = js.Any.fromFunction1((t0: String) => rename(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[Table]
  }
  
  extension [Self <: Table](x: Self) {
    
    inline def setPrivileges(value: Double): Self = StObject.set(x, "Privileges", value.asInstanceOf[js.Any])
  }
}
