package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to define a new index for a database table.
  * @see com.sun.star.sdbcx.Index
  */
trait IndexDescriptor
  extends StObject
     with Descriptor
     with XColumnsSupplier {
  
  /** is the name of the index catalog, may be empty. */
  var Catalog: String
  
  /** indicates that the index is clustered. */
  var IsClustered: Boolean
  
  /** indicates that the index allow only unique values. */
  var IsUnique: Boolean
}
object IndexDescriptor {
  
  inline def apply(
    Catalog: String,
    Columns: XNameAccess,
    IsClustered: Boolean,
    IsUnique: Boolean,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getColumns: CallbackTo[XNameAccess],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback
  ): IndexDescriptor = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], IsClustered = IsClustered.asInstanceOf[js.Any], IsUnique = IsUnique.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getColumns = getColumns.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[IndexDescriptor]
  }
  
  extension [Self <: IndexDescriptor](x: Self) {
    
    inline def setCatalog(value: String): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    inline def setIsClustered(value: Boolean): Self = StObject.set(x, "IsClustered", value.asInstanceOf[js.Any])
    
    inline def setIsUnique(value: Boolean): Self = StObject.set(x, "IsUnique", value.asInstanceOf[js.Any])
  }
}
