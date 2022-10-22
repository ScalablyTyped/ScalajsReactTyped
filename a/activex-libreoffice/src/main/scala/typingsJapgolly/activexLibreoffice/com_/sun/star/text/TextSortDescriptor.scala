package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.SortDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes sort criteria for sorting text.
  * @deprecated Deprecated
  */
trait TextSortDescriptor
  extends StObject
     with SortDescriptor {
  
  /** contains the character that marks the separation of columns. */
  var Delimiter: String
  
  /** determines if the sorting in the first search key is done in ascending or descending order. */
  var IsSortAscending0: Boolean
  
  /** determines if the sorting in the second search key is done in ascending or descending order. */
  var IsSortAscending1: Boolean
  
  /** determines if the sorting in the third search key is done in ascending or descending order. */
  var IsSortAscending2: Boolean
  
  /** determines if the content of a table is to be sorted. */
  var IsSortInTable: Boolean
  
  /** determines if the sorting in the first search key is done numeric or alphanumeric order. */
  var IsSortNumeric0: Boolean
  
  /** determines if the sorting in the second search key is done in numeric or alphanumeric order. */
  var IsSortNumeric1: Boolean
  
  /** determines if the sorting in the third search key is done in numeric or alphanumeric order. */
  var IsSortNumeric2: Boolean
  
  /** contains the row or column index used in the first search key. */
  var SortRowOrColumnNo0: Double
  
  /** contains the row or column index used in the second search key. */
  var SortRowOrColumnNo1: Double
  
  /** contains the row or column index used in the third search key. */
  var SortRowOrColumnNo2: Double
}
object TextSortDescriptor {
  
  inline def apply(
    CollatorAlgorithm: String,
    CollatorLocale: Locale,
    Delimiter: String,
    IsCaseSensitive: Boolean,
    IsSortAscending0: Boolean,
    IsSortAscending1: Boolean,
    IsSortAscending2: Boolean,
    IsSortInTable: Boolean,
    IsSortNumeric0: Boolean,
    IsSortNumeric1: Boolean,
    IsSortNumeric2: Boolean,
    PropertySetInfo: XPropertySetInfo,
    SortAscending: Boolean,
    SortColumns: Boolean,
    SortRowOrColumnNo0: Double,
    SortRowOrColumnNo1: Double,
    SortRowOrColumnNo2: Double,
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
  ): TextSortDescriptor = {
    val __obj = js.Dynamic.literal(CollatorAlgorithm = CollatorAlgorithm.asInstanceOf[js.Any], CollatorLocale = CollatorLocale.asInstanceOf[js.Any], Delimiter = Delimiter.asInstanceOf[js.Any], IsCaseSensitive = IsCaseSensitive.asInstanceOf[js.Any], IsSortAscending0 = IsSortAscending0.asInstanceOf[js.Any], IsSortAscending1 = IsSortAscending1.asInstanceOf[js.Any], IsSortAscending2 = IsSortAscending2.asInstanceOf[js.Any], IsSortInTable = IsSortInTable.asInstanceOf[js.Any], IsSortNumeric0 = IsSortNumeric0.asInstanceOf[js.Any], IsSortNumeric1 = IsSortNumeric1.asInstanceOf[js.Any], IsSortNumeric2 = IsSortNumeric2.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any], SortColumns = SortColumns.asInstanceOf[js.Any], SortRowOrColumnNo0 = SortRowOrColumnNo0.asInstanceOf[js.Any], SortRowOrColumnNo1 = SortRowOrColumnNo1.asInstanceOf[js.Any], SortRowOrColumnNo2 = SortRowOrColumnNo2.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[TextSortDescriptor]
  }
  
  extension [Self <: TextSortDescriptor](x: Self) {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setIsSortAscending0(value: Boolean): Self = StObject.set(x, "IsSortAscending0", value.asInstanceOf[js.Any])
    
    inline def setIsSortAscending1(value: Boolean): Self = StObject.set(x, "IsSortAscending1", value.asInstanceOf[js.Any])
    
    inline def setIsSortAscending2(value: Boolean): Self = StObject.set(x, "IsSortAscending2", value.asInstanceOf[js.Any])
    
    inline def setIsSortInTable(value: Boolean): Self = StObject.set(x, "IsSortInTable", value.asInstanceOf[js.Any])
    
    inline def setIsSortNumeric0(value: Boolean): Self = StObject.set(x, "IsSortNumeric0", value.asInstanceOf[js.Any])
    
    inline def setIsSortNumeric1(value: Boolean): Self = StObject.set(x, "IsSortNumeric1", value.asInstanceOf[js.Any])
    
    inline def setIsSortNumeric2(value: Boolean): Self = StObject.set(x, "IsSortNumeric2", value.asInstanceOf[js.Any])
    
    inline def setSortRowOrColumnNo0(value: Double): Self = StObject.set(x, "SortRowOrColumnNo0", value.asInstanceOf[js.Any])
    
    inline def setSortRowOrColumnNo1(value: Double): Self = StObject.set(x, "SortRowOrColumnNo1", value.asInstanceOf[js.Any])
    
    inline def setSortRowOrColumnNo2(value: Double): Self = StObject.set(x, "SortRowOrColumnNo2", value.asInstanceOf[js.Any])
  }
}
