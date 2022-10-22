package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes properties that control the formatting of headers and footers for documents that do not allow individual settings for individual parts like
  * pages or slides.
  */
trait HeaderFooterSettings
  extends StObject
     with XPropertySet {
  
  /** enables or disables the printing of the date in the header or footer */
  var IsPrintDate: Boolean
  
  /** enables or disables the printing of the page name in the header or footer */
  var IsPrintPageName: Boolean
  
  /** enables or disables the printing of the current time in the header or footer */
  var IsPrintTime: Boolean
}
object HeaderFooterSettings {
  
  inline def apply(
    IsPrintDate: Boolean,
    IsPrintPageName: Boolean,
    IsPrintTime: Boolean,
    PropertySetInfo: XPropertySetInfo,
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
  ): HeaderFooterSettings = {
    val __obj = js.Dynamic.literal(IsPrintDate = IsPrintDate.asInstanceOf[js.Any], IsPrintPageName = IsPrintPageName.asInstanceOf[js.Any], IsPrintTime = IsPrintTime.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[HeaderFooterSettings]
  }
  
  extension [Self <: HeaderFooterSettings](x: Self) {
    
    inline def setIsPrintDate(value: Boolean): Self = StObject.set(x, "IsPrintDate", value.asInstanceOf[js.Any])
    
    inline def setIsPrintPageName(value: Boolean): Self = StObject.set(x, "IsPrintPageName", value.asInstanceOf[js.Any])
    
    inline def setIsPrintTime(value: Boolean): Self = StObject.set(x, "IsPrintTime", value.asInstanceOf[js.Any])
  }
}
