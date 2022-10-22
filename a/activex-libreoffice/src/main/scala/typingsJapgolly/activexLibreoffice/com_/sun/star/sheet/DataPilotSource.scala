package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XRefreshable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a data pilot source.
  *
  * A component that implements this service can be used as data source for a data pilot table in a spreadsheet document.
  */
trait DataPilotSource
  extends StObject
     with XDimensionsSupplier
     with XDataPilotResults
     with XRefreshable
     with XPropertySet {
  
  /**
    * specifies the number of column fields.
    * @since OOo 3.0
    */
  var ColumnFieldCount: Double
  
  /** specifies if grand totals for the columns are inserted. */
  var ColumnGrand: Boolean
  
  /**
    * specifies the number of data fields.
    * @since OOo 3.0
    */
  var DataFieldCount: Double
  
  /**
    * specifies the number of row fields.
    * @since OOo 3.0
    */
  var RowFieldCount: Double
  
  /** specifies if grand totals for the rows are inserted. */
  var RowGrand: Boolean
}
object DataPilotSource {
  
  inline def apply(
    ColumnFieldCount: Double,
    ColumnGrand: Boolean,
    DataFieldCount: Double,
    Dimensions: XNameAccess,
    PropertySetInfo: XPropertySetInfo,
    Results: SafeArray[SafeArray[DataResult]],
    RowFieldCount: Double,
    RowGrand: Boolean,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addRefreshListener: XRefreshListener => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getDimensions: CallbackTo[XNameAccess],
    getFilteredResults: SeqEquiv[DataPilotFieldFilter] => SafeArray[Double],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getResults: CallbackTo[SafeArray[SafeArray[DataResult]]],
    queryInterface: `type` => Any,
    refresh: Callback,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeRefreshListener: XRefreshListener => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback
  ): DataPilotSource = {
    val __obj = js.Dynamic.literal(ColumnFieldCount = ColumnFieldCount.asInstanceOf[js.Any], ColumnGrand = ColumnGrand.asInstanceOf[js.Any], DataFieldCount = DataFieldCount.asInstanceOf[js.Any], Dimensions = Dimensions.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Results = Results.asInstanceOf[js.Any], RowFieldCount = RowFieldCount.asInstanceOf[js.Any], RowGrand = RowGrand.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => addRefreshListener(t0).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getDimensions = getDimensions.toJsFn, getFilteredResults = js.Any.fromFunction1(getFilteredResults), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getResults = getResults.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), refresh = refresh.toJsFn, release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => removeRefreshListener(t0).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[DataPilotSource]
  }
  
  extension [Self <: DataPilotSource](x: Self) {
    
    inline def setColumnFieldCount(value: Double): Self = StObject.set(x, "ColumnFieldCount", value.asInstanceOf[js.Any])
    
    inline def setColumnGrand(value: Boolean): Self = StObject.set(x, "ColumnGrand", value.asInstanceOf[js.Any])
    
    inline def setDataFieldCount(value: Double): Self = StObject.set(x, "DataFieldCount", value.asInstanceOf[js.Any])
    
    inline def setRowFieldCount(value: Double): Self = StObject.set(x, "RowFieldCount", value.asInstanceOf[js.Any])
    
    inline def setRowGrand(value: Boolean): Self = StObject.set(x, "RowGrand", value.asInstanceOf[js.Any])
  }
}
