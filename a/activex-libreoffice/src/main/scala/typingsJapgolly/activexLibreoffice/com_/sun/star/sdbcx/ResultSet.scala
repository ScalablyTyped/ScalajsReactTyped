package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XArray
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XBlob
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XClob
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XRef
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XResultSetMetaData
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCancellable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends the SDBC {@link ResultSet} by the possibility of bookmark positioning, canceling the positioning, and updating of rows. */
trait ResultSet
  extends StObject
     with typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.ResultSet
     with XCancellable
     with XRowLocate
     with XDeleteRows {
  
  /**
    * returns whether the result set supports updating of newly inserted rows. This may not work, as the result set may contain automatic generated data
    * which is used as key information.
    */
  var CanUpdateInsertedRows: Boolean
  
  /** returns if the result set supports bookmark navigation. */
  var IsBookmarkable: Boolean
}
object ResultSet {
  
  inline def apply(
    Bookmark: Any,
    CanUpdateInsertedRows: Boolean,
    CursorName: String,
    FetchDirection: Double,
    FetchSize: Double,
    IsBookmarkable: Boolean,
    MetaData: XResultSetMetaData,
    PropertySetInfo: XPropertySetInfo,
    ResultSetConcurrency: Double,
    ResultSetType: Double,
    Row: Double,
    Statement: XInterface,
    Warnings: Any,
    absolute: Double => Boolean,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    afterLast: Callback,
    beforeFirst: Callback,
    cancel: Callback,
    cancelRowUpdates: Callback,
    clearWarnings: Callback,
    close: Callback,
    compareBookmarks: (Any, Any) => Double,
    deleteRow: Callback,
    deleteRows: SeqEquiv[Any] => SafeArray[Double],
    dispose: Callback,
    findColumn: String => Double,
    first: CallbackTo[Boolean],
    getArray: Double => XArray,
    getBinaryStream: Double => XInputStream,
    getBlob: Double => XBlob,
    getBookmark: CallbackTo[Any],
    getBoolean: Double => Boolean,
    getByte: Double => Double,
    getBytes: Double => SafeArray[Double],
    getCharacterStream: Double => XInputStream,
    getClob: Double => XClob,
    getDate: Double => Date,
    getDouble: Double => Double,
    getFloat: Double => Double,
    getInt: Double => Double,
    getLong: Double => Double,
    getMetaData: CallbackTo[XResultSetMetaData],
    getObject: (Double, XNameAccess) => Any,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getRef: Double => XRef,
    getRow: CallbackTo[Double],
    getShort: Double => Double,
    getStatement: CallbackTo[XInterface],
    getString: Double => String,
    getTime: Double => Time,
    getTimestamp: Double => DateTime,
    getWarnings: CallbackTo[Any],
    hasOrderedBookmarks: CallbackTo[Boolean],
    hashBookmark: Any => Double,
    insertRow: Callback,
    isAfterLast: CallbackTo[Boolean],
    isBeforeFirst: CallbackTo[Boolean],
    isFirst: CallbackTo[Boolean],
    isLast: CallbackTo[Boolean],
    last: CallbackTo[Boolean],
    moveRelativeToBookmark: (Any, Double) => Boolean,
    moveToBookmark: Any => Boolean,
    moveToCurrentRow: Callback,
    moveToInsertRow: Callback,
    next: CallbackTo[Boolean],
    previous: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    refreshRow: Callback,
    relative: Double => Boolean,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    rowDeleted: CallbackTo[Boolean],
    rowInserted: CallbackTo[Boolean],
    rowUpdated: CallbackTo[Boolean],
    setPropertyValue: (String, Any) => Callback,
    updateBinaryStream: (Double, XInputStream, Double) => Callback,
    updateBoolean: (Double, Boolean) => Callback,
    updateByte: (Double, Double) => Callback,
    updateBytes: (Double, SeqEquiv[Double]) => Callback,
    updateCharacterStream: (Double, XInputStream, Double) => Callback,
    updateDate: (Double, Date) => Callback,
    updateDouble: (Double, Double) => Callback,
    updateFloat: (Double, Double) => Callback,
    updateInt: (Double, Double) => Callback,
    updateLong: (Double, Double) => Callback,
    updateNull: Double => Callback,
    updateNumericObject: (Double, Any, Double) => Callback,
    updateObject: (Double, Any) => Callback,
    updateRow: Callback,
    updateShort: (Double, Double) => Callback,
    updateString: (Double, String) => Callback,
    updateTime: (Double, Time) => Callback,
    updateTimestamp: (Double, DateTime) => Callback,
    wasNull: CallbackTo[Boolean]
  ): ResultSet = {
    val __obj = js.Dynamic.literal(Bookmark = Bookmark.asInstanceOf[js.Any], CanUpdateInsertedRows = CanUpdateInsertedRows.asInstanceOf[js.Any], CursorName = CursorName.asInstanceOf[js.Any], FetchDirection = FetchDirection.asInstanceOf[js.Any], FetchSize = FetchSize.asInstanceOf[js.Any], IsBookmarkable = IsBookmarkable.asInstanceOf[js.Any], MetaData = MetaData.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ResultSetConcurrency = ResultSetConcurrency.asInstanceOf[js.Any], ResultSetType = ResultSetType.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any], absolute = js.Any.fromFunction1(absolute), acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), afterLast = afterLast.toJsFn, beforeFirst = beforeFirst.toJsFn, cancel = cancel.toJsFn, cancelRowUpdates = cancelRowUpdates.toJsFn, clearWarnings = clearWarnings.toJsFn, close = close.toJsFn, compareBookmarks = js.Any.fromFunction2(compareBookmarks), deleteRow = deleteRow.toJsFn, deleteRows = js.Any.fromFunction1(deleteRows), dispose = dispose.toJsFn, findColumn = js.Any.fromFunction1(findColumn), first = first.toJsFn, getArray = js.Any.fromFunction1(getArray), getBinaryStream = js.Any.fromFunction1(getBinaryStream), getBlob = js.Any.fromFunction1(getBlob), getBookmark = getBookmark.toJsFn, getBoolean = js.Any.fromFunction1(getBoolean), getByte = js.Any.fromFunction1(getByte), getBytes = js.Any.fromFunction1(getBytes), getCharacterStream = js.Any.fromFunction1(getCharacterStream), getClob = js.Any.fromFunction1(getClob), getDate = js.Any.fromFunction1(getDate), getDouble = js.Any.fromFunction1(getDouble), getFloat = js.Any.fromFunction1(getFloat), getInt = js.Any.fromFunction1(getInt), getLong = js.Any.fromFunction1(getLong), getMetaData = getMetaData.toJsFn, getObject = js.Any.fromFunction2(getObject), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRef = js.Any.fromFunction1(getRef), getRow = getRow.toJsFn, getShort = js.Any.fromFunction1(getShort), getStatement = getStatement.toJsFn, getString = js.Any.fromFunction1(getString), getTime = js.Any.fromFunction1(getTime), getTimestamp = js.Any.fromFunction1(getTimestamp), getWarnings = getWarnings.toJsFn, hasOrderedBookmarks = hasOrderedBookmarks.toJsFn, hashBookmark = js.Any.fromFunction1(hashBookmark), insertRow = insertRow.toJsFn, isAfterLast = isAfterLast.toJsFn, isBeforeFirst = isBeforeFirst.toJsFn, isFirst = isFirst.toJsFn, isLast = isLast.toJsFn, last = last.toJsFn, moveRelativeToBookmark = js.Any.fromFunction2(moveRelativeToBookmark), moveToBookmark = js.Any.fromFunction1(moveToBookmark), moveToCurrentRow = moveToCurrentRow.toJsFn, moveToInsertRow = moveToInsertRow.toJsFn, next = next.toJsFn, previous = previous.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), refreshRow = refreshRow.toJsFn, relative = js.Any.fromFunction1(relative), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), rowDeleted = rowDeleted.toJsFn, rowInserted = rowInserted.toJsFn, rowUpdated = rowUpdated.toJsFn, setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), updateBinaryStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (updateBinaryStream(t0, t1, t2)).runNow()), updateBoolean = js.Any.fromFunction2((t0: Double, t1: Boolean) => (updateBoolean(t0, t1)).runNow()), updateByte = js.Any.fromFunction2((t0: Double, t1: Double) => (updateByte(t0, t1)).runNow()), updateBytes = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[Double]) => (updateBytes(t0, t1)).runNow()), updateCharacterStream = js.Any.fromFunction3((t0: Double, t1: XInputStream, t2: Double) => (updateCharacterStream(t0, t1, t2)).runNow()), updateDate = js.Any.fromFunction2((t0: Double, t1: Date) => (updateDate(t0, t1)).runNow()), updateDouble = js.Any.fromFunction2((t0: Double, t1: Double) => (updateDouble(t0, t1)).runNow()), updateFloat = js.Any.fromFunction2((t0: Double, t1: Double) => (updateFloat(t0, t1)).runNow()), updateInt = js.Any.fromFunction2((t0: Double, t1: Double) => (updateInt(t0, t1)).runNow()), updateLong = js.Any.fromFunction2((t0: Double, t1: Double) => (updateLong(t0, t1)).runNow()), updateNull = js.Any.fromFunction1((t0: Double) => updateNull(t0).runNow()), updateNumericObject = js.Any.fromFunction3((t0: Double, t1: Any, t2: Double) => (updateNumericObject(t0, t1, t2)).runNow()), updateObject = js.Any.fromFunction2((t0: Double, t1: Any) => (updateObject(t0, t1)).runNow()), updateRow = updateRow.toJsFn, updateShort = js.Any.fromFunction2((t0: Double, t1: Double) => (updateShort(t0, t1)).runNow()), updateString = js.Any.fromFunction2((t0: Double, t1: String) => (updateString(t0, t1)).runNow()), updateTime = js.Any.fromFunction2((t0: Double, t1: Time) => (updateTime(t0, t1)).runNow()), updateTimestamp = js.Any.fromFunction2((t0: Double, t1: DateTime) => (updateTimestamp(t0, t1)).runNow()), wasNull = wasNull.toJsFn)
    __obj.asInstanceOf[ResultSet]
  }
  
  extension [Self <: ResultSet](x: Self) {
    
    inline def setCanUpdateInsertedRows(value: Boolean): Self = StObject.set(x, "CanUpdateInsertedRows", value.asInstanceOf[js.Any])
    
    inline def setIsBookmarkable(value: Boolean): Self = StObject.set(x, "IsBookmarkable", value.asInstanceOf[js.Any])
  }
}
