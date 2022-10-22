package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interfaces allows to retrieve suggestions for spell checking from a dictionary. */
trait XSearchableDictionary
  extends StObject
     with XDictionary {
  
  /**
    * search for similar entries in the dictionary.
    * @param aWord the word to find similar written entries for.
    * @returns the list of similar entries found.
    * @see com.sun.star.linguistic2.XDictionaryEntry
    * @see com.sun.star.linguistic2.XSearchableDictionaryList
    * @since OOo 3.0.1
    */
  def searchSimilarEntries(aWord: String): SafeArray[XDictionaryEntry]
}
object XSearchableDictionary {
  
  inline def apply(
    Count: Double,
    DictionaryType: DictionaryType,
    Entries: SafeArray[XDictionaryEntry],
    Locale: Locale,
    Name: String,
    acquire: Callback,
    add: (String, Boolean, String) => Boolean,
    addDictionaryEventListener: XDictionaryEventListener => Boolean,
    addEntry: XDictionaryEntry => Boolean,
    clear: Callback,
    getCount: CallbackTo[Double],
    getDictionaryType: CallbackTo[DictionaryType],
    getEntries: CallbackTo[SafeArray[XDictionaryEntry]],
    getEntry: String => XDictionaryEntry,
    getLocale: CallbackTo[Locale],
    getName: CallbackTo[String],
    isActive: CallbackTo[Boolean],
    isFull: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    remove: String => Boolean,
    removeDictionaryEventListener: XDictionaryEventListener => Boolean,
    searchSimilarEntries: String => SafeArray[XDictionaryEntry],
    setActive: Boolean => Callback,
    setLocale: Locale => Callback,
    setName: String => Callback
  ): XSearchableDictionary = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DictionaryType = DictionaryType.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, add = js.Any.fromFunction3(add), addDictionaryEventListener = js.Any.fromFunction1(addDictionaryEventListener), addEntry = js.Any.fromFunction1(addEntry), clear = clear.toJsFn, getCount = getCount.toJsFn, getDictionaryType = getDictionaryType.toJsFn, getEntries = getEntries.toJsFn, getEntry = js.Any.fromFunction1(getEntry), getLocale = getLocale.toJsFn, getName = getName.toJsFn, isActive = isActive.toJsFn, isFull = isFull.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction1(remove), removeDictionaryEventListener = js.Any.fromFunction1(removeDictionaryEventListener), searchSimilarEntries = js.Any.fromFunction1(searchSimilarEntries), setActive = js.Any.fromFunction1((t0: Boolean) => setActive(t0).runNow()), setLocale = js.Any.fromFunction1((t0: Locale) => setLocale(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
    __obj.asInstanceOf[XSearchableDictionary]
  }
  
  extension [Self <: XSearchableDictionary](x: Self) {
    
    inline def setSearchSimilarEntries(value: String => SafeArray[XDictionaryEntry]): Self = StObject.set(x, "searchSimilarEntries", js.Any.fromFunction1(value))
  }
}
