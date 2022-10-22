package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes what and how to replace strings. */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.util.XSearchDescriptor because Already inherited
- typingsJapgolly.activexLibreoffice.com_.sun.star.util.XReplaceDescriptor because var conflicts: SearchString. Inlined getReplaceString, ReplaceString, setReplaceString */ trait ReplaceDescriptor
  extends StObject
     with SearchDescriptor {
  
  /** @returns the string which replaces the found occurrences. */
  var ReplaceString: String
  
  /** @returns the string which replaces the found occurrences. */
  def getReplaceString(): String
  
  /** sets the string which replaces the found occurrences. */
  def setReplaceString(aReplaceString: String): Unit
}
object ReplaceDescriptor {
  
  inline def apply(
    PropertySetInfo: XPropertySetInfo,
    ReplaceString: String,
    SearchBackwards: Boolean,
    SearchCaseSensitive: Boolean,
    SearchRegularExpression: Boolean,
    SearchSimilarity: Boolean,
    SearchSimilarityAdd: Double,
    SearchSimilarityExchange: Double,
    SearchSimilarityRelax: Boolean,
    SearchSimilarityRemove: Double,
    SearchString: String,
    SearchStyles: Boolean,
    SearchWildcard: Boolean,
    SearchWords: Boolean,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getReplaceString: CallbackTo[String],
    getSearchString: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback,
    setReplaceString: String => Callback,
    setSearchString: String => Callback
  ): ReplaceDescriptor = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReplaceString = ReplaceString.asInstanceOf[js.Any], SearchBackwards = SearchBackwards.asInstanceOf[js.Any], SearchCaseSensitive = SearchCaseSensitive.asInstanceOf[js.Any], SearchRegularExpression = SearchRegularExpression.asInstanceOf[js.Any], SearchSimilarity = SearchSimilarity.asInstanceOf[js.Any], SearchSimilarityAdd = SearchSimilarityAdd.asInstanceOf[js.Any], SearchSimilarityExchange = SearchSimilarityExchange.asInstanceOf[js.Any], SearchSimilarityRelax = SearchSimilarityRelax.asInstanceOf[js.Any], SearchSimilarityRemove = SearchSimilarityRemove.asInstanceOf[js.Any], SearchString = SearchString.asInstanceOf[js.Any], SearchStyles = SearchStyles.asInstanceOf[js.Any], SearchWildcard = SearchWildcard.asInstanceOf[js.Any], SearchWords = SearchWords.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getReplaceString = getReplaceString.toJsFn, getSearchString = getSearchString.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setReplaceString = js.Any.fromFunction1((t0: String) => setReplaceString(t0).runNow()), setSearchString = js.Any.fromFunction1((t0: String) => setSearchString(t0).runNow()))
    __obj.asInstanceOf[ReplaceDescriptor]
  }
  
  extension [Self <: ReplaceDescriptor](x: Self) {
    
    inline def setGetReplaceString(value: CallbackTo[String]): Self = StObject.set(x, "getReplaceString", value.toJsFn)
    
    inline def setReplaceString(value: String): Self = StObject.set(x, "ReplaceString", value.asInstanceOf[js.Any])
    
    inline def setSetReplaceString(value: String => Callback): Self = StObject.set(x, "setReplaceString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
