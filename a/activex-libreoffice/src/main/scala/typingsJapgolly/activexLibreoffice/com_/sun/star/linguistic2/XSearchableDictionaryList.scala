package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows searching for an entry in all dictionaries of the dictionary-list.
  *
  * Only active dictionaries of a suitable language will be searched for the entry. The language is suitable if it is the same as the dictionary's
  * language or the dictionary may hold entries of all languages.
  * @see com.sun.star.linguistic2.XDictionaryList
  */
trait XSearchableDictionaryList
  extends StObject
     with XDictionaryList {
  
  /**
    * looks for an entry for a given word in the list of dictionaries.
    * @param aWord the word (entry) to be looked for.
    * @param aLocale the language of the word to be looked for.
    * @param bSearchPosDics `TRUE` if only positive dictionaries should be searched. `FALSE` if only negative dictionaries should be searched.
    * @param bSpellEntry `TRUE` if entries for purposes of spell checking are required. `FALSE` if only entries for hyphenation purposes are required.
    * @returns the dictionary entry that was found, `NULL` otherwise.
    */
  def queryDictionaryEntry(aWord: String, aLocale: Locale, bSearchPosDics: Boolean, bSpellEntry: Boolean): XDictionaryEntry
}
object XSearchableDictionaryList {
  
  inline def apply(
    Count: Double,
    Dictionaries: SafeArray[XDictionary],
    acquire: Callback,
    addDictionary: XDictionary => Boolean,
    addDictionaryListEventListener: (XDictionaryListEventListener, Boolean) => Boolean,
    beginCollectEvents: CallbackTo[Double],
    createDictionary: (String, Locale, DictionaryType, String) => XDictionary,
    endCollectEvents: CallbackTo[Double],
    flushEvents: CallbackTo[Double],
    getCount: CallbackTo[Double],
    getDictionaries: CallbackTo[SafeArray[XDictionary]],
    getDictionaryByName: String => XDictionary,
    queryDictionaryEntry: (String, Locale, Boolean, Boolean) => XDictionaryEntry,
    queryInterface: `type` => Any,
    release: Callback,
    removeDictionary: XDictionary => Boolean,
    removeDictionaryListEventListener: XDictionaryListEventListener => Boolean
  ): XSearchableDictionaryList = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Dictionaries = Dictionaries.asInstanceOf[js.Any], acquire = acquire.toJsFn, addDictionary = js.Any.fromFunction1(addDictionary), addDictionaryListEventListener = js.Any.fromFunction2(addDictionaryListEventListener), beginCollectEvents = beginCollectEvents.toJsFn, createDictionary = js.Any.fromFunction4(createDictionary), endCollectEvents = endCollectEvents.toJsFn, flushEvents = flushEvents.toJsFn, getCount = getCount.toJsFn, getDictionaries = getDictionaries.toJsFn, getDictionaryByName = js.Any.fromFunction1(getDictionaryByName), queryDictionaryEntry = js.Any.fromFunction4(queryDictionaryEntry), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeDictionary = js.Any.fromFunction1(removeDictionary), removeDictionaryListEventListener = js.Any.fromFunction1(removeDictionaryListEventListener))
    __obj.asInstanceOf[XSearchableDictionaryList]
  }
  
  extension [Self <: XSearchableDictionaryList](x: Self) {
    
    inline def setQueryDictionaryEntry(value: (String, Locale, Boolean, Boolean) => XDictionaryEntry): Self = StObject.set(x, "queryDictionaryEntry", js.Any.fromFunction4(value))
  }
}
