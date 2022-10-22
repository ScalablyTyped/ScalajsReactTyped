package typingsJapgolly.activexLibreoffice.com_.sun.star.util

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

/** specifies a string search operation. */
trait XSearchDescriptor
  extends StObject
     with XPropertySet {
  
  /** @returns the string of characters to search for. */
  var SearchString: String
  
  /** @returns the string of characters to search for. */
  def getSearchString(): String
  
  /** sets the string of characters to look for. */
  def setSearchString(aString: String): Unit
}
object XSearchDescriptor {
  
  inline def apply(
    PropertySetInfo: XPropertySetInfo,
    SearchString: String,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getSearchString: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback,
    setSearchString: String => Callback
  ): XSearchDescriptor = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SearchString = SearchString.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSearchString = getSearchString.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setSearchString = js.Any.fromFunction1((t0: String) => setSearchString(t0).runNow()))
    __obj.asInstanceOf[XSearchDescriptor]
  }
  
  extension [Self <: XSearchDescriptor](x: Self) {
    
    inline def setGetSearchString(value: CallbackTo[String]): Self = StObject.set(x, "getSearchString", value.toJsFn)
    
    inline def setSearchString(value: String): Self = StObject.set(x, "SearchString", value.asInstanceOf[js.Any])
    
    inline def setSetSearchString(value: String => Callback): Self = StObject.set(x, "setSearchString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
