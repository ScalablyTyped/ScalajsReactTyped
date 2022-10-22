package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XRefreshable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a linked cell range.
  *
  * A linked cell range is a range which is linked to an equal-sized range in an external document. The contents of the external range is copied into the
  * range of this document.
  * @see com.sun.star.sheet.CellAreaLinks
  */
trait CellAreaLink
  extends StObject
     with XAreaLink
     with XRefreshable
     with XPropertySet {
  
  /** specifies the name of the filter used to load the source document. */
  var Filter: String
  
  /** specifies the filter options needed to load the source document. */
  var FilterOptions: String
  
  /**
    * specifies the delay time between two refresh actions in seconds.
    * @deprecated Deprecated
    */
  var RefreshDelay: Double
  
  /**
    * specifies the time between two refresh actions in seconds.
    * @since OOo 2.0
    */
  var RefreshPeriod: Double
  
  /** specifies the URL of the source document. */
  var Url: String
}
object CellAreaLink {
  
  inline def apply(
    DestArea: CellRangeAddress,
    Filter: String,
    FilterOptions: String,
    PropertySetInfo: XPropertySetInfo,
    RefreshDelay: Double,
    RefreshPeriod: Double,
    SourceArea: String,
    Url: String,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addRefreshListener: XRefreshListener => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getDestArea: CallbackTo[CellRangeAddress],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getSourceArea: CallbackTo[String],
    queryInterface: `type` => Any,
    refresh: Callback,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeRefreshListener: XRefreshListener => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setDestArea: CellRangeAddress => Callback,
    setPropertyValue: (String, Any) => Callback,
    setSourceArea: String => Callback
  ): CellAreaLink = {
    val __obj = js.Dynamic.literal(DestArea = DestArea.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], FilterOptions = FilterOptions.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RefreshDelay = RefreshDelay.asInstanceOf[js.Any], RefreshPeriod = RefreshPeriod.asInstanceOf[js.Any], SourceArea = SourceArea.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => addRefreshListener(t0).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getDestArea = getDestArea.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSourceArea = getSourceArea.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), refresh = refresh.toJsFn, release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => removeRefreshListener(t0).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setDestArea = js.Any.fromFunction1((t0: CellRangeAddress) => setDestArea(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setSourceArea = js.Any.fromFunction1((t0: String) => setSourceArea(t0).runNow()))
    __obj.asInstanceOf[CellAreaLink]
  }
  
  extension [Self <: CellAreaLink](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterOptions(value: String): Self = StObject.set(x, "FilterOptions", value.asInstanceOf[js.Any])
    
    inline def setRefreshDelay(value: Double): Self = StObject.set(x, "RefreshDelay", value.asInstanceOf[js.Any])
    
    inline def setRefreshPeriod(value: Double): Self = StObject.set(x, "RefreshPeriod", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}
