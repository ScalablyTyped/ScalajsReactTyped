package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a description of how subtotals are created.
  *
  * The descriptor contains properties and a collection of subtotal fields which control the behavior of operation.
  */
trait SubTotalDescriptor
  extends StObject
     with XSubTotalDescriptor
     with XEnumerationAccess
     with XIndexAccess
     with XPropertySet {
  
  /** specifies if cell formats are moved with the contents they belong to. */
  var BindFormatsToContent: Boolean
  
  /** specifies if the contents of the fields will be sorted to groups while performing a subtotal operation. */
  var EnableSort: Boolean
  
  /** specifies if a user defined sorting list is used. */
  var EnableUserSortList: Boolean
  
  /** specifies if page breaks are inserted after each group change. */
  var InsertPageBreaks: Boolean
  
  /** specifies if the case of letters is important when comparing entries. */
  var IsCaseSensitive: Boolean
  
  /**
    * returns the maximum number of subtotal fields the descriptor can hold.
    *
    * This read-only property indicates the maximum count of fields the current implementation supports.
    */
  var MaxFieldCount: Double
  
  /** specifies the sorting order if {@link SubTotalDescriptor.EnableSort} is set to `TRUE` . */
  var SortAscending: Boolean
  
  /**
    * specifies which user defined sorting list is used.
    *
    * This property is only used if {@link SubTotalDescriptor.EnableUserSortList} is `TRUE` .
    */
  var UserSortListIndex: Double
}
object SubTotalDescriptor {
  
  inline def apply(
    BindFormatsToContent: Boolean,
    Count: Double,
    ElementType: `type`,
    EnableSort: Boolean,
    EnableUserSortList: Boolean,
    InsertPageBreaks: Boolean,
    IsCaseSensitive: Boolean,
    MaxFieldCount: Double,
    PropertySetInfo: XPropertySetInfo,
    SortAscending: Boolean,
    UserSortListIndex: Double,
    acquire: Callback,
    addNew: (SeqEquiv[SubTotalColumn], Double) => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    clear: Callback,
    createEnumeration: CallbackTo[XEnumeration],
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback
  ): SubTotalDescriptor = {
    val __obj = js.Dynamic.literal(BindFormatsToContent = BindFormatsToContent.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], EnableSort = EnableSort.asInstanceOf[js.Any], EnableUserSortList = EnableUserSortList.asInstanceOf[js.Any], InsertPageBreaks = InsertPageBreaks.asInstanceOf[js.Any], IsCaseSensitive = IsCaseSensitive.asInstanceOf[js.Any], MaxFieldCount = MaxFieldCount.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any], UserSortListIndex = UserSortListIndex.asInstanceOf[js.Any], acquire = acquire.toJsFn, addNew = js.Any.fromFunction2((t0: SeqEquiv[SubTotalColumn], t1: Double) => (addNew(t0, t1)).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), clear = clear.toJsFn, createEnumeration = createEnumeration.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[SubTotalDescriptor]
  }
  
  extension [Self <: SubTotalDescriptor](x: Self) {
    
    inline def setBindFormatsToContent(value: Boolean): Self = StObject.set(x, "BindFormatsToContent", value.asInstanceOf[js.Any])
    
    inline def setEnableSort(value: Boolean): Self = StObject.set(x, "EnableSort", value.asInstanceOf[js.Any])
    
    inline def setEnableUserSortList(value: Boolean): Self = StObject.set(x, "EnableUserSortList", value.asInstanceOf[js.Any])
    
    inline def setInsertPageBreaks(value: Boolean): Self = StObject.set(x, "InsertPageBreaks", value.asInstanceOf[js.Any])
    
    inline def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "IsCaseSensitive", value.asInstanceOf[js.Any])
    
    inline def setMaxFieldCount(value: Double): Self = StObject.set(x, "MaxFieldCount", value.asInstanceOf[js.Any])
    
    inline def setSortAscending(value: Boolean): Self = StObject.set(x, "SortAscending", value.asInstanceOf[js.Any])
    
    inline def setUserSortListIndex(value: Double): Self = StObject.set(x, "UserSortListIndex", value.asInstanceOf[js.Any])
  }
}
