package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XStorable
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a dictionary used for spell checking and hyphenation.
  * @see com.sun.star.linguistic2.DictionaryList
  * @see com.sun.star.linguistic2.XSearchableDictionaryList
  * @since OOo 3.0.1
  */
trait Dictionary
  extends StObject
     with XSearchableDictionary
     with XStorable
object Dictionary {
  
  inline def apply(
    Count: Double,
    DictionaryType: DictionaryType,
    Entries: SafeArray[XDictionaryEntry],
    Locale: Locale,
    Location: String,
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
    getLocation: CallbackTo[String],
    getName: CallbackTo[String],
    hasLocation: CallbackTo[Boolean],
    isActive: CallbackTo[Boolean],
    isFull: CallbackTo[Boolean],
    isReadonly: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    remove: String => Boolean,
    removeDictionaryEventListener: XDictionaryEventListener => Boolean,
    searchSimilarEntries: String => SafeArray[XDictionaryEntry],
    setActive: Boolean => Callback,
    setLocale: Locale => Callback,
    setName: String => Callback,
    store: Callback,
    storeAsURL: (String, SeqEquiv[PropertyValue]) => Callback,
    storeToURL: (String, SeqEquiv[PropertyValue]) => Callback
  ): Dictionary = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DictionaryType = DictionaryType.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, add = js.Any.fromFunction3(add), addDictionaryEventListener = js.Any.fromFunction1(addDictionaryEventListener), addEntry = js.Any.fromFunction1(addEntry), clear = clear.toJsFn, getCount = getCount.toJsFn, getDictionaryType = getDictionaryType.toJsFn, getEntries = getEntries.toJsFn, getEntry = js.Any.fromFunction1(getEntry), getLocale = getLocale.toJsFn, getLocation = getLocation.toJsFn, getName = getName.toJsFn, hasLocation = hasLocation.toJsFn, isActive = isActive.toJsFn, isFull = isFull.toJsFn, isReadonly = isReadonly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction1(remove), removeDictionaryEventListener = js.Any.fromFunction1(removeDictionaryEventListener), searchSimilarEntries = js.Any.fromFunction1(searchSimilarEntries), setActive = js.Any.fromFunction1((t0: Boolean) => setActive(t0).runNow()), setLocale = js.Any.fromFunction1((t0: Locale) => setLocale(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), store = store.toJsFn, storeAsURL = js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (storeAsURL(t0, t1)).runNow()), storeToURL = js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (storeToURL(t0, t1)).runNow()))
    __obj.asInstanceOf[Dictionary]
  }
}
