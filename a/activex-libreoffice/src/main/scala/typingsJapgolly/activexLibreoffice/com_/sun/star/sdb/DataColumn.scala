package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XArray
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XBlob
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XClob
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XRef
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** defines a column used for a result set which contains the data definition and the data of the column of the current row of a result set. */
trait DataColumn
  extends StObject
     with ResultColumn
     with XColumn
     with XColumnUpdate {
  
  /** contains the original value of the column. */
  var OriginalValue: Any
  
  /**
    * contains the column's value. This could be a constraint property, to veto modifications, if a new value does not fit into rules defined for the
    * column.
    */
  var Value: Any
}
object DataColumn {
  
  inline def apply(
    Align: Double,
    Array: XArray,
    BinaryStream: XInputStream,
    Blob: XBlob,
    Boolean: Boolean,
    Byte: Double,
    Bytes: SafeArray[Double],
    CatalogName: String,
    CharacterStream: XInputStream,
    Clob: XClob,
    ControlDefault: String,
    ControlModel: XPropertySet,
    Date: Date,
    DefaultValue: String,
    Description: String,
    DisplaySize: Double,
    Double: Double,
    Float: Double,
    FormatKey: Double,
    HelpText: String,
    Hidden: Boolean,
    Int: Double,
    IsAutoIncrement: Boolean,
    IsCaseSensitive: Boolean,
    IsCurrency: Boolean,
    IsDefinitelyWritable: Boolean,
    IsNullable: Double,
    IsReadOnly: Boolean,
    IsRowVersion: Boolean,
    IsSearchable: Boolean,
    IsSigned: Boolean,
    IsWritable: Boolean,
    Label: String,
    Long: Double,
    Name: String,
    OriginalValue: Any,
    Position: Double,
    Precision: Double,
    PropertySetInfo: XPropertySetInfo,
    Ref: XRef,
    Scale: Double,
    SchemaName: String,
    ServiceName: String,
    Short: Double,
    String: String,
    TableName: String,
    Time: Time,
    Timestamp: DateTime,
    Type: Double,
    TypeName: String,
    Value: Any,
    Width: Double,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    createDataDescriptor: CallbackTo[XPropertySet],
    getArray: CallbackTo[XArray],
    getBinaryStream: CallbackTo[XInputStream],
    getBlob: CallbackTo[XBlob],
    getBoolean: CallbackTo[Boolean],
    getByte: CallbackTo[Double],
    getBytes: CallbackTo[SafeArray[Double]],
    getCharacterStream: CallbackTo[XInputStream],
    getClob: CallbackTo[XClob],
    getDate: CallbackTo[Date],
    getDouble: CallbackTo[Double],
    getFloat: CallbackTo[Double],
    getInt: CallbackTo[Double],
    getLong: CallbackTo[Double],
    getObject: XNameAccess => Any,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getRef: CallbackTo[XRef],
    getShort: CallbackTo[Double],
    getString: CallbackTo[String],
    getTime: CallbackTo[Time],
    getTimestamp: CallbackTo[DateTime],
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback,
    updateBinaryStream: (XInputStream, Double) => Callback,
    updateBoolean: Boolean => Callback,
    updateByte: Double => Callback,
    updateBytes: SeqEquiv[Double] => Callback,
    updateCharacterStream: (XInputStream, Double) => Callback,
    updateDate: Date => Callback,
    updateDouble: Double => Callback,
    updateFloat: Double => Callback,
    updateInt: Double => Callback,
    updateLong: Double => Callback,
    updateNull: Callback,
    updateNumericObject: (Any, Double) => Callback,
    updateObject: Any => Callback,
    updateShort: Double => Callback,
    updateString: String => Callback,
    updateTime: Time => Callback,
    updateTimestamp: DateTime => Callback,
    wasNull: CallbackTo[Boolean]
  ): DataColumn = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], Array = Array.asInstanceOf[js.Any], BinaryStream = BinaryStream.asInstanceOf[js.Any], Blob = Blob.asInstanceOf[js.Any], Boolean = Boolean.asInstanceOf[js.Any], Byte = Byte.asInstanceOf[js.Any], Bytes = Bytes.asInstanceOf[js.Any], CatalogName = CatalogName.asInstanceOf[js.Any], CharacterStream = CharacterStream.asInstanceOf[js.Any], Clob = Clob.asInstanceOf[js.Any], ControlDefault = ControlDefault.asInstanceOf[js.Any], ControlModel = ControlModel.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], DefaultValue = DefaultValue.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DisplaySize = DisplaySize.asInstanceOf[js.Any], Double = Double.asInstanceOf[js.Any], Float = Float.asInstanceOf[js.Any], FormatKey = FormatKey.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], Int = Int.asInstanceOf[js.Any], IsAutoIncrement = IsAutoIncrement.asInstanceOf[js.Any], IsCaseSensitive = IsCaseSensitive.asInstanceOf[js.Any], IsCurrency = IsCurrency.asInstanceOf[js.Any], IsDefinitelyWritable = IsDefinitelyWritable.asInstanceOf[js.Any], IsNullable = IsNullable.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], IsRowVersion = IsRowVersion.asInstanceOf[js.Any], IsSearchable = IsSearchable.asInstanceOf[js.Any], IsSigned = IsSigned.asInstanceOf[js.Any], IsWritable = IsWritable.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Long = Long.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OriginalValue = OriginalValue.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Precision = Precision.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Ref = Ref.asInstanceOf[js.Any], Scale = Scale.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], Short = Short.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], TypeName = TypeName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), createDataDescriptor = createDataDescriptor.toJsFn, getArray = getArray.toJsFn, getBinaryStream = getBinaryStream.toJsFn, getBlob = getBlob.toJsFn, getBoolean = getBoolean.toJsFn, getByte = getByte.toJsFn, getBytes = getBytes.toJsFn, getCharacterStream = getCharacterStream.toJsFn, getClob = getClob.toJsFn, getDate = getDate.toJsFn, getDouble = getDouble.toJsFn, getFloat = getFloat.toJsFn, getInt = getInt.toJsFn, getLong = getLong.toJsFn, getObject = js.Any.fromFunction1(getObject), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRef = getRef.toJsFn, getShort = getShort.toJsFn, getString = getString.toJsFn, getTime = getTime.toJsFn, getTimestamp = getTimestamp.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), updateBinaryStream = js.Any.fromFunction2((t0: XInputStream, t1: Double) => (updateBinaryStream(t0, t1)).runNow()), updateBoolean = js.Any.fromFunction1((t0: Boolean) => updateBoolean(t0).runNow()), updateByte = js.Any.fromFunction1((t0: Double) => updateByte(t0).runNow()), updateBytes = js.Any.fromFunction1((t0: SeqEquiv[Double]) => updateBytes(t0).runNow()), updateCharacterStream = js.Any.fromFunction2((t0: XInputStream, t1: Double) => (updateCharacterStream(t0, t1)).runNow()), updateDate = js.Any.fromFunction1((t0: Date) => updateDate(t0).runNow()), updateDouble = js.Any.fromFunction1((t0: Double) => updateDouble(t0).runNow()), updateFloat = js.Any.fromFunction1((t0: Double) => updateFloat(t0).runNow()), updateInt = js.Any.fromFunction1((t0: Double) => updateInt(t0).runNow()), updateLong = js.Any.fromFunction1((t0: Double) => updateLong(t0).runNow()), updateNull = updateNull.toJsFn, updateNumericObject = js.Any.fromFunction2((t0: Any, t1: Double) => (updateNumericObject(t0, t1)).runNow()), updateObject = js.Any.fromFunction1((t0: Any) => updateObject(t0).runNow()), updateShort = js.Any.fromFunction1((t0: Double) => updateShort(t0).runNow()), updateString = js.Any.fromFunction1((t0: String) => updateString(t0).runNow()), updateTime = js.Any.fromFunction1((t0: Time) => updateTime(t0).runNow()), updateTimestamp = js.Any.fromFunction1((t0: DateTime) => updateTimestamp(t0).runNow()), wasNull = wasNull.toJsFn)
    __obj.asInstanceOf[DataColumn]
  }
  
  extension [Self <: DataColumn](x: Self) {
    
    inline def setOriginalValue(value: Any): Self = StObject.set(x, "OriginalValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
