package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents the description of the layout of a data pilot table.
  * @see com.sun.star.sheet.DataPilotTable
  */
trait DataPilotDescriptor
  extends StObject
     with XDataPilotDescriptor
     with XPropertySet
     with XDataPilotDataLayoutFieldSupplier {
  
  /** specifies if columns for grand total results are created. */
  var ColumnGrand: Boolean
  
  /** specifies whether to drill down to details or go into edit mode. */
  var DrillDownOnDoubleClick: Boolean
  
  /**
    * specifies a label for grand total results.
    * @since OOo 3.4
    */
  var GrandTotalName: String
  
  /** specifies if empty rows in the source data are ignored. */
  var IgnoreEmptyRows: Boolean
  
  /**
    * specifies parameters to create the data pilot table from a database.
    * @see DatabaseImportDescriptor
    * @since OOo 3.3
    */
  var ImportDescriptor: SafeArray[PropertyValue]
  
  /** specifies if empty category cells in the source data should be treated as repetition of the content from the previous row. */
  var RepeatIfEmpty: Boolean
  
  /** specifies if rows for grand total results are created. */
  var RowGrand: Boolean
  
  /**
    * specifies arguments that are passed to the implementation named by {@link SourceServiceName} .
    * @since OOo 3.3
    */
  var ServiceArguments: SafeArray[PropertyValue]
  
  /** specifies whether the filter button is shown. */
  var ShowFilterButton: Boolean
  
  /**
    * specifies the name of a {@link DataPilotSource} implementation for the data pilot table.
    * @since OOo 3.3
    */
  var SourceServiceName: String
}
object DataPilotDescriptor {
  
  inline def apply(
    ColumnFields: XIndexAccess,
    ColumnGrand: Boolean,
    DataFields: XIndexAccess,
    DataLayoutField: XDataPilotField,
    DataPilotFields: XIndexAccess,
    DrillDownOnDoubleClick: Boolean,
    FilterDescriptor: XSheetFilterDescriptor,
    GrandTotalName: String,
    HiddenFields: XIndexAccess,
    IgnoreEmptyRows: Boolean,
    ImportDescriptor: SafeArray[PropertyValue],
    Name: String,
    PageFields: XIndexAccess,
    PropertySetInfo: XPropertySetInfo,
    RepeatIfEmpty: Boolean,
    RowFields: XIndexAccess,
    RowGrand: Boolean,
    ServiceArguments: SafeArray[PropertyValue],
    ShowFilterButton: Boolean,
    SourceRange: CellRangeAddress,
    SourceServiceName: String,
    Tag: String,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getColumnFields: CallbackTo[XIndexAccess],
    getDataFields: CallbackTo[XIndexAccess],
    getDataLayoutField: CallbackTo[XDataPilotField],
    getDataPilotFields: CallbackTo[XIndexAccess],
    getFilterDescriptor: CallbackTo[XSheetFilterDescriptor],
    getHiddenFields: CallbackTo[XIndexAccess],
    getName: CallbackTo[String],
    getPageFields: CallbackTo[XIndexAccess],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getRowFields: CallbackTo[XIndexAccess],
    getSourceRange: CallbackTo[CellRangeAddress],
    getTag: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setName: String => Callback,
    setPropertyValue: (String, Any) => Callback,
    setSourceRange: CellRangeAddress => Callback,
    setTag: String => Callback
  ): DataPilotDescriptor = {
    val __obj = js.Dynamic.literal(ColumnFields = ColumnFields.asInstanceOf[js.Any], ColumnGrand = ColumnGrand.asInstanceOf[js.Any], DataFields = DataFields.asInstanceOf[js.Any], DataLayoutField = DataLayoutField.asInstanceOf[js.Any], DataPilotFields = DataPilotFields.asInstanceOf[js.Any], DrillDownOnDoubleClick = DrillDownOnDoubleClick.asInstanceOf[js.Any], FilterDescriptor = FilterDescriptor.asInstanceOf[js.Any], GrandTotalName = GrandTotalName.asInstanceOf[js.Any], HiddenFields = HiddenFields.asInstanceOf[js.Any], IgnoreEmptyRows = IgnoreEmptyRows.asInstanceOf[js.Any], ImportDescriptor = ImportDescriptor.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PageFields = PageFields.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RepeatIfEmpty = RepeatIfEmpty.asInstanceOf[js.Any], RowFields = RowFields.asInstanceOf[js.Any], RowGrand = RowGrand.asInstanceOf[js.Any], ServiceArguments = ServiceArguments.asInstanceOf[js.Any], ShowFilterButton = ShowFilterButton.asInstanceOf[js.Any], SourceRange = SourceRange.asInstanceOf[js.Any], SourceServiceName = SourceServiceName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getColumnFields = getColumnFields.toJsFn, getDataFields = getDataFields.toJsFn, getDataLayoutField = getDataLayoutField.toJsFn, getDataPilotFields = getDataPilotFields.toJsFn, getFilterDescriptor = getFilterDescriptor.toJsFn, getHiddenFields = getHiddenFields.toJsFn, getName = getName.toJsFn, getPageFields = getPageFields.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRowFields = getRowFields.toJsFn, getSourceRange = getSourceRange.toJsFn, getTag = getTag.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setSourceRange = js.Any.fromFunction1((t0: CellRangeAddress) => setSourceRange(t0).runNow()), setTag = js.Any.fromFunction1((t0: String) => setTag(t0).runNow()))
    __obj.asInstanceOf[DataPilotDescriptor]
  }
  
  extension [Self <: DataPilotDescriptor](x: Self) {
    
    inline def setColumnGrand(value: Boolean): Self = StObject.set(x, "ColumnGrand", value.asInstanceOf[js.Any])
    
    inline def setDrillDownOnDoubleClick(value: Boolean): Self = StObject.set(x, "DrillDownOnDoubleClick", value.asInstanceOf[js.Any])
    
    inline def setGrandTotalName(value: String): Self = StObject.set(x, "GrandTotalName", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyRows(value: Boolean): Self = StObject.set(x, "IgnoreEmptyRows", value.asInstanceOf[js.Any])
    
    inline def setImportDescriptor(value: SafeArray[PropertyValue]): Self = StObject.set(x, "ImportDescriptor", value.asInstanceOf[js.Any])
    
    inline def setRepeatIfEmpty(value: Boolean): Self = StObject.set(x, "RepeatIfEmpty", value.asInstanceOf[js.Any])
    
    inline def setRowGrand(value: Boolean): Self = StObject.set(x, "RowGrand", value.asInstanceOf[js.Any])
    
    inline def setServiceArguments(value: SafeArray[PropertyValue]): Self = StObject.set(x, "ServiceArguments", value.asInstanceOf[js.Any])
    
    inline def setShowFilterButton(value: Boolean): Self = StObject.set(x, "ShowFilterButton", value.asInstanceOf[js.Any])
    
    inline def setSourceServiceName(value: String): Self = StObject.set(x, "SourceServiceName", value.asInstanceOf[js.Any])
  }
}
