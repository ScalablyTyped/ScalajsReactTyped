package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XArray
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XBlob
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XClob
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XParameters
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XRef
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XRowSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XRowSetListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.sheet.XRangeSelection
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * identifies a {@link XDataProvider} for result sets.
  * @see XDataProvider
  * @see DataProvider
  */
trait XDatabaseDataProvider
  extends StObject
     with XDataProvider
     with XRangeXMLConversion
     with XInitialization
     with XComponent
     with XPropertySet
     with XParameters
     with XRowSet {
  
  /** specifies the active connection which is used to create the resulting report. */
  var ActiveConnection: XConnection
  
  /** indicates whether the filter should be applied or not, default is `FALSE` . */
  var ApplyFilter: Boolean
  
  /**
    * is the command which should be executed, the type of command depends on the CommandType.
    *
    * In case of a {@link CommandType} of CommandType::COMMAND, means in case the {@link Command} specifies an SQL statement, the inherited {@link
    * com.sun.star.sdbc.RowSet.EscapeProcessing} becomes relevant: ;  It then can be to used to specify whether the SQL statement should be analyzed on the
    * client side before sending it to the database server. ;  The default value for {@link com.sun.star.sdbc.RowSet.EscapeProcessing} is `TRUE` . By
    * switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL, to your database.
    * @see com.sun.star.sdb.CommandType
    */
  var Command: String
  
  /**
    * specifies the type of the command to be executed to retrieve a result set.
    *
    * {@link Command} needs to be interpreted depending on the value of this property.
    *
    * This property is only meaningful together with the {@link Command} property, thus either **both** or **none** of them are present.
    * @see com.sun.star.sdb.CommandType
    */
  var CommandType: Double
  
  /** is the name of the data source to use, this could be a named data source or the URL of a data access component. */
  var DataSourceName: String
  
  /**
    * is used for subreports and contains the names of the columns of the subreport which are related to the master fields of the parent report.
    *
    * Entries in this sequence can either denote column names in the sub report, or parameter names. ;  For instance, you could base the report on the SQL
    * statement `SELECT * FROM invoices WHERE cust_ref = :cid` , and add `cid` to the DetailFields property. In this case, the parameter will be filled from
    * the corresponding master field. ;  Alternatively, you could simply base your report on the table `invoices` , and add the column name `cust_ref` to
    * the DetailFields. In this case, and implicit filter clause `WHERE cust_ref = :<new_param_name>` will be created, and the artificial parameter will be
    * filled from the corresponding master field. ;  If a string in this property denotes both a column name and a parameter name, it is undefined which way
    * it is interpreted, but implementations of the service are required to either decide for the parameter or the column, and proceed as usual.
    *
    * The columns specified herein typically represent a part of the primary key fields or their aliases of the detail report.
    *
    * If the report is no sub report (e.g. its parent is not a report itself), this property is not evaluated.
    */
  var DetailFields: SafeArray[String]
  
  /**
    * specifies if the {@link Command} should be analyzed on the client side before sending it to the database server.
    *
    * The default value of this property is `TRUE` . By switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL,
    * to your database.
    *
    * This property is usually present together with the {@link Command} and {@link CommandType} properties, and is evaluated if and only if {@link
    * CommandType} equals CommandType::COMMAND.
    */
  var EscapeProcessing: Boolean
  
  /**
    * specifies an additional filter to optionally use.
    *
    * The Filter string has to form a SQL WHERE-clause, **without** the WHERE-string itself.
    *
    * If a {@link DataSourceName} , {@link Command} and {@link CommandType} are specified, a RowSet can be created with this information. If the results
    * provided by the row set are to be additionally filtered, the Filter property can be used.
    *
    * Note that the Filter property does not make sense if a resultSet has been specified in the DataAccessDescriptor.
    * @see com.sun.star.sdb.RowSet
    * @see ResultSet
    */
  var Filter: String
  
  /** additional group by for the row set */
  var GroupBy: String
  
  /** additional having clause for the row set */
  var HavingClause: String
  
  /**
    * is used for subreports and contains the names of columns of the parent report.
    *
    * These columns are typically the foreign key fields of the parent report. The values of theses columns are used to identify the data for the subreport.
    * Each time the parent report changes its current row, the subreport requeries it's data based on the values of the master fields.
    *
    * If the report is no sub report (e.g. its parent is not a report itself), this property is not evaluated.
    */
  var MasterFields: SafeArray[String]
  
  /** is a additional sort order definition for a row set. */
  var Order: String
  
  /**
    * specifies the maximal count of rows which should be fetched.
    *
    * A value of zero implies that no limit exists.
    */
  var RowLimit: Double
}
object XDatabaseDataProvider {
  
  inline def apply(
    ActiveConnection: XConnection,
    ApplyFilter: Boolean,
    Command: String,
    CommandType: Double,
    DataSourceName: String,
    DetailFields: SafeArray[String],
    EscapeProcessing: Boolean,
    Filter: String,
    GroupBy: String,
    HavingClause: String,
    MasterFields: SafeArray[String],
    Order: String,
    PropertySetInfo: XPropertySetInfo,
    RangeSelection: XRangeSelection,
    Row: Double,
    RowLimit: Double,
    Statement: XInterface,
    absolute: Double => Boolean,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addRowSetListener: XRowSetListener => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    afterLast: Callback,
    beforeFirst: Callback,
    clearParameters: Callback,
    convertRangeFromXML: String => String,
    convertRangeToXML: String => String,
    createDataSequenceByRangeRepresentation: String => XDataSequence,
    createDataSequenceByRangeRepresentationPossible: String => Boolean,
    createDataSequenceByValueArray: (String, String) => XDataSequence,
    createDataSource: SeqEquiv[PropertyValue] => XDataSource,
    createDataSourcePossible: SeqEquiv[PropertyValue] => Boolean,
    detectArguments: XDataSource => SafeArray[PropertyValue],
    dispose: Callback,
    execute: Callback,
    first: CallbackTo[Boolean],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getRangeSelection: CallbackTo[XRangeSelection],
    getRow: CallbackTo[Double],
    getStatement: CallbackTo[XInterface],
    initialize: SeqEquiv[Any] => Callback,
    isAfterLast: CallbackTo[Boolean],
    isBeforeFirst: CallbackTo[Boolean],
    isFirst: CallbackTo[Boolean],
    isLast: CallbackTo[Boolean],
    last: CallbackTo[Boolean],
    next: CallbackTo[Boolean],
    previous: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    refreshRow: Callback,
    relative: Double => Boolean,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeRowSetListener: XRowSetListener => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    rowDeleted: CallbackTo[Boolean],
    rowInserted: CallbackTo[Boolean],
    rowUpdated: CallbackTo[Boolean],
    setArray: (Double, XArray) => Callback,
    setBinaryStream: (Double, XInputStream, Double) => Callback,
    setBlob: (Double, XBlob) => Callback,
    setBoolean: (Double, Boolean) => Callback,
    setByte: (Double, Double) => Callback,
    setBytes: (Double, SeqEquiv[Double]) => Callback,
    setCharacterStream: (Double, XInputStream, Double) => Callback,
    setClob: (Double, XClob) => Callback,
    setDate: (Double, Date) => Callback,
    setDouble: (Double, Double) => Callback,
    setFloat: (Double, Double) => Callback,
    setInt: (Double, Double) => Callback,
    setLong: (Double, Double) => Callback,
    setNull: (Double, Double) => Callback,
    setObject: (Double, Any) => Callback,
    setObjectNull: (Double, Double, String) => Callback,
    setObjectWithInfo: (Double, Any, Double, Double) => Callback,
    setPropertyValue: (String, Any) => Callback,
    setRef: (Double, XRef) => Callback,
    setShort: (Double, Double) => Callback,
    setString: (Double, String) => Callback,
    setTime: (Double, Time) => Callback,
    setTimestamp: (Double, DateTime) => Callback
  ): XDatabaseDataProvider = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], ApplyFilter = ApplyFilter.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], CommandType = CommandType.asInstanceOf[js.Any], DataSourceName = DataSourceName.asInstanceOf[js.Any], DetailFields = DetailFields.asInstanceOf[js.Any], EscapeProcessing = EscapeProcessing.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], GroupBy = GroupBy.asInstanceOf[js.Any], HavingClause = HavingClause.asInstanceOf[js.Any], MasterFields = MasterFields.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RangeSelection = RangeSelection.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], RowLimit = RowLimit.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], absolute = js.Any.fromFunction1(absolute), acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addRowSetListener = js.Any.fromFunction1((t0: XRowSetListener) => addRowSetListener(t0).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), afterLast = afterLast.toJsFn, beforeFirst = beforeFirst.toJsFn, clearParameters = clearParameters.toJsFn, convertRangeFromXML = js.Any.fromFunction1(convertRangeFromXML), convertRangeToXML = js.Any.fromFunction1(convertRangeToXML), createDataSequenceByRangeRepresentation = js.Any.fromFunction1(createDataSequenceByRangeRepresentation), createDataSequenceByRangeRepresentationPossible = js.Any.fromFunction1(createDataSequenceByRangeRepresentationPossible), createDataSequenceByValueArray = js.Any.fromFunction2(createDataSequenceByValueArray), createDataSource = js.Any.fromFunction1(createDataSource), createDataSourcePossible = js.Any.fromFunction1(createDataSourcePossible), detectArguments = js.Any.fromFunction1(detectArguments), dispose = dispose.toJsFn, execute = execute.toJsFn, first = first.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRangeSelection = getRangeSelection.toJsFn, getRow = getRow.toJsFn, getStatement = getStatement.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), isAfterLast = isAfterLast.toJsFn, isBeforeFirst = isBeforeFirst.toJsFn, isFirst = isFirst.toJsFn, isLast = isLast.toJsFn, last = last.toJsFn, next = next.toJsFn, previous = previous.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), refreshRow = refreshRow.toJsFn, relative = js.Any.fromFunction1(relative), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeRowSetListener = js.Any.fromFunction1((t0: XRowSetListener) => removeRowSetListener(t0).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), rowDeleted = rowDeleted.toJsFn, rowInserted = rowInserted.toJsFn, rowUpdated = rowUpdated.toJsFn, setArray = js.Any.fromFunction2((t0: Double, t1: XArray) => (setArray(t0, t1)).runNow()), setBinaryStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (setBinaryStream(t0, t1, t2)).runNow()), setBlob = js.Any.fromFunction2((t0: Double, t1: XBlob) => (setBlob(t0, t1)).runNow()), setBoolean = js.Any.fromFunction2((t0: Double, t1: Boolean) => (setBoolean(t0, t1)).runNow()), setByte = js.Any.fromFunction2((t0: Double, t1: Double) => (setByte(t0, t1)).runNow()), setBytes = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[Double]) => (setBytes(t0, t1)).runNow()), setCharacterStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (setCharacterStream(t0, t1, t2)).runNow()), setClob = js.Any.fromFunction2((t0: Double, t1: XClob) => (setClob(t0, t1)).runNow()), setDate = js.Any.fromFunction2((t0: Double, t1: Date) => (setDate(t0, t1)).runNow()), setDouble = js.Any.fromFunction2((t0: Double, t1: Double) => (setDouble(t0, t1)).runNow()), setFloat = js.Any.fromFunction2((t0: Double, t1: Double) => (setFloat(t0, t1)).runNow()), setInt = js.Any.fromFunction2((t0: Double, t1: Double) => (setInt(t0, t1)).runNow()), setLong = js.Any.fromFunction2((t0: Double, t1: Double) => (setLong(t0, t1)).runNow()), setNull = js.Any.fromFunction2((t0: Double, t1: Double) => (setNull(t0, t1)).runNow()), setObject = js.Any.fromFunction2((t0: Double, t1: Any) => (setObject(t0, t1)).runNow()), setObjectNull = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (setObjectNull(t0, t1, t2)).runNow()), setObjectWithInfo = js.Any.fromFunction4((t0: Double, t1: Any, t2: Double, t3: Double) => (setObjectWithInfo(t0, t1, t2, t3)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setRef = js.Any.fromFunction2((t0: Double, t1: XRef) => (setRef(t0, t1)).runNow()), setShort = js.Any.fromFunction2((t0: Double, t1: Double) => (setShort(t0, t1)).runNow()), setString = js.Any.fromFunction2((t0: Double, t1: String) => (setString(t0, t1)).runNow()), setTime = js.Any.fromFunction2((t0: Double, t1: Time) => (setTime(t0, t1)).runNow()), setTimestamp = js.Any.fromFunction2((t0: Double, t1: DateTime) => (setTimestamp(t0, t1)).runNow()))
    __obj.asInstanceOf[XDatabaseDataProvider]
  }
  
  extension [Self <: XDatabaseDataProvider](x: Self) {
    
    inline def setActiveConnection(value: XConnection): Self = StObject.set(x, "ActiveConnection", value.asInstanceOf[js.Any])
    
    inline def setApplyFilter(value: Boolean): Self = StObject.set(x, "ApplyFilter", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: String): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setCommandType(value: Double): Self = StObject.set(x, "CommandType", value.asInstanceOf[js.Any])
    
    inline def setDataSourceName(value: String): Self = StObject.set(x, "DataSourceName", value.asInstanceOf[js.Any])
    
    inline def setDetailFields(value: SafeArray[String]): Self = StObject.set(x, "DetailFields", value.asInstanceOf[js.Any])
    
    inline def setEscapeProcessing(value: Boolean): Self = StObject.set(x, "EscapeProcessing", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setGroupBy(value: String): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    inline def setHavingClause(value: String): Self = StObject.set(x, "HavingClause", value.asInstanceOf[js.Any])
    
    inline def setMasterFields(value: SafeArray[String]): Self = StObject.set(x, "MasterFields", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: String): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setRowLimit(value: Double): Self = StObject.set(x, "RowLimit", value.asInstanceOf[js.Any])
  }
}
