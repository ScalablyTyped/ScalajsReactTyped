package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.TableOrientation
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a description of how a cell range is to be filtered.
  *
  * The descriptor contains properties and a collection of filter conditions (filter fields) which control the behavior of a filter operation.
  */
trait SheetFilterDescriptor
  extends StObject
     with XSheetFilterDescriptor
     with XSheetFilterDescriptor2
     with XPropertySet {
  
  /** specifies if the first row (or column) contains headers which should not be filtered. */
  var ContainsHeader: Boolean
  
  /** specifies if the filtered data should be copied to another position in the document. */
  var CopyOutputData: Boolean
  
  /** specifies if the case of letters is important when comparing entries. */
  var IsCaseSensitive: Boolean
  
  /**
    * returns the maximum number of filter fields in the descriptor.
    *
    * This read-only property indicates the maximum count of fields the current implementation supports.
    */
  var MaxFieldCount: Double
  
  /** specifies if columns or rows are filtered. */
  var Orientation: TableOrientation
  
  /**
    * specifies the position where filtered data are to be copied.
    *
    * This is only used if {@link SheetFilterDescriptor.CopyOutputData} is `TRUE` .
    */
  var OutputPosition: CellAddress
  
  /**
    * specifies if the {@link SheetFilterDescriptor.OutputPosition} position is saved for future calls.
    *
    * This is only used if {@link SheetFilterDescriptor.CopyOutputData} is `TRUE` .
    */
  var SaveOutputPosition: Boolean
  
  /** specifies if duplicate entries are left out of the result. */
  var SkipDuplicates: Boolean
  
  /** specifies if the {@link TableFilterField.StringValue} strings are interpreted as regular expressions. */
  var UseRegularExpressions: Boolean
}
object SheetFilterDescriptor {
  
  inline def apply(
    ContainsHeader: Boolean,
    CopyOutputData: Boolean,
    FilterFields: SafeArray[TableFilterField],
    FilterFields2: SafeArray[TableFilterField2],
    IsCaseSensitive: Boolean,
    MaxFieldCount: Double,
    Orientation: TableOrientation,
    OutputPosition: CellAddress,
    PropertySetInfo: XPropertySetInfo,
    SaveOutputPosition: Boolean,
    SkipDuplicates: Boolean,
    UseRegularExpressions: Boolean,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getFilterFields: CallbackTo[SafeArray[TableFilterField]],
    getFilterFields2: CallbackTo[SafeArray[TableFilterField2]],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setFilterFields: SeqEquiv[TableFilterField] => Callback,
    setFilterFields2: SeqEquiv[TableFilterField2] => Callback,
    setPropertyValue: (String, Any) => Callback
  ): SheetFilterDescriptor = {
    val __obj = js.Dynamic.literal(ContainsHeader = ContainsHeader.asInstanceOf[js.Any], CopyOutputData = CopyOutputData.asInstanceOf[js.Any], FilterFields = FilterFields.asInstanceOf[js.Any], FilterFields2 = FilterFields2.asInstanceOf[js.Any], IsCaseSensitive = IsCaseSensitive.asInstanceOf[js.Any], MaxFieldCount = MaxFieldCount.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], OutputPosition = OutputPosition.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SaveOutputPosition = SaveOutputPosition.asInstanceOf[js.Any], SkipDuplicates = SkipDuplicates.asInstanceOf[js.Any], UseRegularExpressions = UseRegularExpressions.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getFilterFields = getFilterFields.toJsFn, getFilterFields2 = getFilterFields2.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setFilterFields = js.Any.fromFunction1((t0: SeqEquiv[TableFilterField]) => setFilterFields(t0).runNow()), setFilterFields2 = js.Any.fromFunction1((t0: SeqEquiv[TableFilterField2]) => setFilterFields2(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[SheetFilterDescriptor]
  }
  
  extension [Self <: SheetFilterDescriptor](x: Self) {
    
    inline def setContainsHeader(value: Boolean): Self = StObject.set(x, "ContainsHeader", value.asInstanceOf[js.Any])
    
    inline def setCopyOutputData(value: Boolean): Self = StObject.set(x, "CopyOutputData", value.asInstanceOf[js.Any])
    
    inline def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "IsCaseSensitive", value.asInstanceOf[js.Any])
    
    inline def setMaxFieldCount(value: Double): Self = StObject.set(x, "MaxFieldCount", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: TableOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setOutputPosition(value: CellAddress): Self = StObject.set(x, "OutputPosition", value.asInstanceOf[js.Any])
    
    inline def setSaveOutputPosition(value: Boolean): Self = StObject.set(x, "SaveOutputPosition", value.asInstanceOf[js.Any])
    
    inline def setSkipDuplicates(value: Boolean): Self = StObject.set(x, "SkipDuplicates", value.asInstanceOf[js.Any])
    
    inline def setUseRegularExpressions(value: Boolean): Self = StObject.set(x, "UseRegularExpressions", value.asInstanceOf[js.Any])
  }
}
