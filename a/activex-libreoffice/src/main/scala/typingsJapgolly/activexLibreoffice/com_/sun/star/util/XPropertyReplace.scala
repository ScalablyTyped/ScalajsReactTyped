package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to search and replace properties. */
trait XPropertyReplace
  extends StObject
     with XReplaceDescriptor {
  
  /** @returns the attribute values which are used to replace the found occurrences. */
  var ReplaceAttributes: SafeArray[PropertyValue]
  
  /** @returns the attributes to search for. */
  var SearchAttributes: SafeArray[PropertyValue]
  
  /** provides the information if specific property values are searched, or just the existence of the specified properties. */
  var ValueSearch: Boolean
  
  /** @returns the attribute values which are used to replace the found occurrences. */
  def getReplaceAttributes(): SafeArray[PropertyValue]
  
  /** @returns the attributes to search for. */
  def getSearchAttributes(): SafeArray[PropertyValue]
  
  /** provides the information if specific property values are searched, or just the existence of the specified properties. */
  def getValueSearch(): Boolean
  
  /** sets the properties to replace the found occurrences. */
  def setReplaceAttributes(aSearchAttribs: SeqEquiv[PropertyValue]): Unit
  
  /** sets the properties to search for. */
  def setSearchAttributes(aSearchAttribs: SeqEquiv[PropertyValue]): Unit
  
  /** specifies if specific property values are searched, or just the existence of the specified properties. */
  def setValueSearch(bValueSearch: Boolean): Unit
}
object XPropertyReplace {
  
  inline def apply(
    PropertySetInfo: XPropertySetInfo,
    ReplaceAttributes: SafeArray[PropertyValue],
    ReplaceString: String,
    SearchAttributes: SafeArray[PropertyValue],
    SearchString: String,
    ValueSearch: Boolean,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getReplaceAttributes: CallbackTo[SafeArray[PropertyValue]],
    getReplaceString: CallbackTo[String],
    getSearchAttributes: CallbackTo[SafeArray[PropertyValue]],
    getSearchString: CallbackTo[String],
    getValueSearch: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback,
    setReplaceAttributes: SeqEquiv[PropertyValue] => Callback,
    setReplaceString: String => Callback,
    setSearchAttributes: SeqEquiv[PropertyValue] => Callback,
    setSearchString: String => Callback,
    setValueSearch: Boolean => Callback
  ): XPropertyReplace = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReplaceAttributes = ReplaceAttributes.asInstanceOf[js.Any], ReplaceString = ReplaceString.asInstanceOf[js.Any], SearchAttributes = SearchAttributes.asInstanceOf[js.Any], SearchString = SearchString.asInstanceOf[js.Any], ValueSearch = ValueSearch.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getReplaceAttributes = getReplaceAttributes.toJsFn, getReplaceString = getReplaceString.toJsFn, getSearchAttributes = getSearchAttributes.toJsFn, getSearchString = getSearchString.toJsFn, getValueSearch = getValueSearch.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setReplaceAttributes = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => setReplaceAttributes(t0).runNow()), setReplaceString = js.Any.fromFunction1((t0: String) => setReplaceString(t0).runNow()), setSearchAttributes = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => setSearchAttributes(t0).runNow()), setSearchString = js.Any.fromFunction1((t0: String) => setSearchString(t0).runNow()), setValueSearch = js.Any.fromFunction1((t0: Boolean) => setValueSearch(t0).runNow()))
    __obj.asInstanceOf[XPropertyReplace]
  }
  
  extension [Self <: XPropertyReplace](x: Self) {
    
    inline def setGetReplaceAttributes(value: CallbackTo[SafeArray[PropertyValue]]): Self = StObject.set(x, "getReplaceAttributes", value.toJsFn)
    
    inline def setGetSearchAttributes(value: CallbackTo[SafeArray[PropertyValue]]): Self = StObject.set(x, "getSearchAttributes", value.toJsFn)
    
    inline def setGetValueSearch(value: CallbackTo[Boolean]): Self = StObject.set(x, "getValueSearch", value.toJsFn)
    
    inline def setReplaceAttributes(value: SafeArray[PropertyValue]): Self = StObject.set(x, "ReplaceAttributes", value.asInstanceOf[js.Any])
    
    inline def setSearchAttributes(value: SafeArray[PropertyValue]): Self = StObject.set(x, "SearchAttributes", value.asInstanceOf[js.Any])
    
    inline def setSetReplaceAttributes(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "setReplaceAttributes", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
    
    inline def setSetSearchAttributes(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "setSearchAttributes", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
    
    inline def setSetValueSearch(value: Boolean => Callback): Self = StObject.set(x, "setValueSearch", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setValueSearch(value: Boolean): Self = StObject.set(x, "ValueSearch", value.asInstanceOf[js.Any])
  }
}
