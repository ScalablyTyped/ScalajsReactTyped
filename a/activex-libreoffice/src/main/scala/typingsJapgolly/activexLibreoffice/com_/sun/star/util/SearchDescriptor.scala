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

/** describes what and how to search within a container. */
trait SearchDescriptor
  extends StObject
     with XSearchDescriptor {
  
  /** If `TRUE` , the search is done backwards in the document. */
  var SearchBackwards: Boolean
  
  /** If `TRUE` , the case of the letters is important for the match. */
  var SearchCaseSensitive: Boolean
  
  /**
    * If `TRUE` , the search string is evaluated as a regular expression.
    *
    * SearchRegularExpression, SearchWildcard and SearchSimilarity are mutually exclusive, only one can be `TRUE` at the same time.
    */
  var SearchRegularExpression: Boolean
  
  /**
    * If `TRUE` , a "similarity search" is performed.
    *
    * In the case of a similarity search, the following properties specify the kind of similarity:
    *
    * SearchSimilarityRelaxSearchSimilarityRemoveSearchSimilarityAddSearchSimilarityExchange
    *
    * SearchRegularExpression, SearchWildcard and SearchSimilarity are mutually exclusive, only one can be `TRUE` at the same time.
    */
  var SearchSimilarity: Boolean
  
  /** specifies the number of characters that must be added to match the search pattern. */
  var SearchSimilarityAdd: Double
  
  /** This property specifies the number of characters that must be replaced to match the search pattern. */
  var SearchSimilarityExchange: Double
  
  /**
    * If `TRUE` , all similarity rules are applied together.
    *
    * In the case of a relaxed similarity search, the following properties are applied together:
    *
    * SearchSimilarityRemoveSearchSimilarityAddSearchSimilarityExchange
    */
  var SearchSimilarityRelax: Boolean
  
  /** This property specifies the number of characters that may be ignored to match the search pattern. */
  var SearchSimilarityRemove: Double
  
  /** If `TRUE` , it is searched for positions where the paragraph style with the name of the search pattern is applied. */
  var SearchStyles: Boolean
  
  /**
    * If `TRUE` , the search string is evaluated as a wildcard pattern.
    *
    * Wildcards are '*' (asterisk) for any sequence of characters, including an empty sequence, and '?' (question mark) for exactly one character. Escape
    * character is '\' (U+005C REVERSE SOLIDUS) aka backslash, it escapes the special meaning of a question mark, asterisk or escape character that follows
    * immediately after the escape character.
    *
    * SearchRegularExpression, SearchWildcard and SearchSimilarity are mutually exclusive, only one can be `TRUE` at the same time.
    * @since LibreOffice 5.2
    */
  var SearchWildcard: Boolean
  
  /** If `TRUE` , only complete words will be found. */
  var SearchWords: Boolean
}
object SearchDescriptor {
  
  inline def apply(
    PropertySetInfo: XPropertySetInfo,
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
    getSearchString: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback,
    setSearchString: String => Callback
  ): SearchDescriptor = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SearchBackwards = SearchBackwards.asInstanceOf[js.Any], SearchCaseSensitive = SearchCaseSensitive.asInstanceOf[js.Any], SearchRegularExpression = SearchRegularExpression.asInstanceOf[js.Any], SearchSimilarity = SearchSimilarity.asInstanceOf[js.Any], SearchSimilarityAdd = SearchSimilarityAdd.asInstanceOf[js.Any], SearchSimilarityExchange = SearchSimilarityExchange.asInstanceOf[js.Any], SearchSimilarityRelax = SearchSimilarityRelax.asInstanceOf[js.Any], SearchSimilarityRemove = SearchSimilarityRemove.asInstanceOf[js.Any], SearchString = SearchString.asInstanceOf[js.Any], SearchStyles = SearchStyles.asInstanceOf[js.Any], SearchWildcard = SearchWildcard.asInstanceOf[js.Any], SearchWords = SearchWords.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSearchString = getSearchString.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setSearchString = js.Any.fromFunction1((t0: String) => setSearchString(t0).runNow()))
    __obj.asInstanceOf[SearchDescriptor]
  }
  
  extension [Self <: SearchDescriptor](x: Self) {
    
    inline def setSearchBackwards(value: Boolean): Self = StObject.set(x, "SearchBackwards", value.asInstanceOf[js.Any])
    
    inline def setSearchCaseSensitive(value: Boolean): Self = StObject.set(x, "SearchCaseSensitive", value.asInstanceOf[js.Any])
    
    inline def setSearchRegularExpression(value: Boolean): Self = StObject.set(x, "SearchRegularExpression", value.asInstanceOf[js.Any])
    
    inline def setSearchSimilarity(value: Boolean): Self = StObject.set(x, "SearchSimilarity", value.asInstanceOf[js.Any])
    
    inline def setSearchSimilarityAdd(value: Double): Self = StObject.set(x, "SearchSimilarityAdd", value.asInstanceOf[js.Any])
    
    inline def setSearchSimilarityExchange(value: Double): Self = StObject.set(x, "SearchSimilarityExchange", value.asInstanceOf[js.Any])
    
    inline def setSearchSimilarityRelax(value: Boolean): Self = StObject.set(x, "SearchSimilarityRelax", value.asInstanceOf[js.Any])
    
    inline def setSearchSimilarityRemove(value: Double): Self = StObject.set(x, "SearchSimilarityRemove", value.asInstanceOf[js.Any])
    
    inline def setSearchStyles(value: Boolean): Self = StObject.set(x, "SearchStyles", value.asInstanceOf[js.Any])
    
    inline def setSearchWildcard(value: Boolean): Self = StObject.set(x, "SearchWildcard", value.asInstanceOf[js.Any])
    
    inline def setSearchWords(value: Boolean): Self = StObject.set(x, "SearchWords", value.asInstanceOf[js.Any])
  }
}
