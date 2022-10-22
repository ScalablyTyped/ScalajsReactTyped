package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the common properties of a database column. Could be used for the creation of a database columns within a table.
  * @see com.sun.star.sdbcx.Column
  * @see com.sun.star.sdbcx.Table
  */
trait ColumnDescriptor
  extends StObject
     with Descriptor {
  
  /** specifies how to create an auto-increment column. */
  var AutoIncrementCreation: String
  
  /** keeps a default value for a column, is provided as string. */
  var DefaultValue: String
  
  /** keeps a description of the object. */
  var Description: String
  
  /**
    * indicates whether the column is automatically numbered, thus read-only.
    * @see com.sun.star.sdbc.ColumnValue
    */
  var IsAutoIncrement: Boolean
  
  /**
    * indicates the nullability of values in the designated column.
    * @see com.sun.star.sdbc.ColumnValue
    */
  var IsNullable: Double
  
  /** indicates that the column contains some kind of time or date stamp used to track updates. */
  var IsRowVersion: Boolean
  
  /** gets a column's number of decimal digits. */
  var Precision: Double
  
  /** gets a column's number of digits to right of the decimal point. */
  var Scale: Double
  
  /** is the {@link com.sun.star.sdbc.DataType} of the column. */
  var Type: Double
  
  /** is the type name used by the database. If the column type is a user-defined type, then a fully-qualified type name is returned. May be empty. */
  var TypeName: String
}
object ColumnDescriptor {
  
  inline def apply(
    AutoIncrementCreation: String,
    DefaultValue: String,
    Description: String,
    IsAutoIncrement: Boolean,
    IsNullable: Double,
    IsRowVersion: Boolean,
    Name: String,
    Precision: Double,
    PropertySetInfo: XPropertySetInfo,
    Scale: Double,
    Type: Double,
    TypeName: String,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback
  ): ColumnDescriptor = {
    val __obj = js.Dynamic.literal(AutoIncrementCreation = AutoIncrementCreation.asInstanceOf[js.Any], DefaultValue = DefaultValue.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], IsAutoIncrement = IsAutoIncrement.asInstanceOf[js.Any], IsNullable = IsNullable.asInstanceOf[js.Any], IsRowVersion = IsRowVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Scale = Scale.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[ColumnDescriptor]
  }
  
  extension [Self <: ColumnDescriptor](x: Self) {
    
    inline def setAutoIncrementCreation(value: String): Self = StObject.set(x, "AutoIncrementCreation", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setIsAutoIncrement(value: Boolean): Self = StObject.set(x, "IsAutoIncrement", value.asInstanceOf[js.Any])
    
    inline def setIsNullable(value: Double): Self = StObject.set(x, "IsNullable", value.asInstanceOf[js.Any])
    
    inline def setIsRowVersion(value: Boolean): Self = StObject.set(x, "IsRowVersion", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "Precision", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "Scale", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: String): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
  }
}
